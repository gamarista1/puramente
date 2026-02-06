package io.intercom.android.sdk.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.s;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.c;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import androidx.viewpager.widget.ViewPager;
import com.facebook.shimmer.d;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.carousel.CarouselListener;
import io.intercom.android.sdk.carousel.CarouselPresenter;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.carousel.CarouselScreenPagerAdapter;
import io.intercom.android.sdk.carousel.CarouselView;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.carousel.permission.PermissionRequest;
import io.intercom.android.sdk.carousel.permission.PermissionRequestFactory;
import io.intercom.android.sdk.carousel.permission.PermissionResultListener;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import java.util.ArrayList;
import java.util.List;
import p1.C2388d;

public class IntercomCarouselActivity extends IntercomBaseActivity implements ViewPager.i, View.OnClickListener, CarouselListener, PermissionResultListener, CarouselView {
    private static final String PARCEL_CAROUSEL_ID = "parcel_carousel_id";
    private static final int PERMISSION_REQUEST_CODE = 12306;
    CarouselScreenPagerAdapter adapter;
    Provider<AppConfig> appConfigProvider;
    CarouselPresenter carouselPresenter;
    private View closeBackground;
    private ImageButton closeButton;
    private ConstraintLayout closeButtonContainer;
    ScreenAction currentPermissionAction = ScreenAction.NULL;
    String currentScreenId = "";
    boolean isLastScreenViewed = false;
    MetricTracker metricTracker;
    LinearLayout navigationDotsLayout;
    int numberOfScreensSeen = 0;
    PermissionManager permissionManager;
    PermissionRequest permissionRequest;
    private ConstraintLayout rootView;
    boolean sentToSettings = false;
    private FrameLayout stateContainer;
    private final Twig twig = LumberMill.getLogger();
    ViewPager viewPager;

    private FrameLayout.LayoutParams buildContentLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.intercom_carousel_padding);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        return layoutParams;
    }

    private View buildErrorMessage(int i10) {
        TextView textView = new TextView(this);
        textView.setLayoutParams(buildContentLayoutParams());
        BlockUtils.setMarginBottom(textView, 16);
        styleErrorMessage(textView);
        textView.setText(i10);
        return textView;
    }

    public static Intent buildIntent(Context context, String str) {
        Intent intent = new Intent(context, IntercomCarouselActivity.class);
        intent.putExtra(PARCEL_CAROUSEL_ID, str);
        intent.setFlags(268435456);
        return intent;
    }

    private d buildLoadingContainer() {
        IntercomShimmerLayout intercomShimmerLayout = new IntercomShimmerLayout(this);
        intercomShimmerLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        intercomShimmerLayout.setClickable(true);
        intercomShimmerLayout.setFocusable(true);
        return intercomShimmerLayout;
    }

    private View buildLoadingContent() {
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(buildContentLayoutParams());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundResource(R.drawable.intercom_content_loading);
        return imageView;
    }

    private View buildLoadingState() {
        d buildLoadingContainer = buildLoadingContainer();
        buildLoadingContainer.addView(buildLoadingContent());
        return buildLoadingContainer;
    }

    private View buildRetryButton() {
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.intercom_carousel_action_button, this.stateContainer, false);
        FontUtils.setRobotoMediumTypeface(textView);
        textView.setText(R.string.intercom_retry);
        BackgroundUtils.setButtonColor(textView, this.appConfigProvider.get().getPrimaryColor());
        textView.setLayoutParams(buildRetryButtonLayoutParams());
        textView.setOnClickListener(new b(this));
        return textView;
    }

    private FrameLayout.LayoutParams buildRetryButtonLayoutParams() {
        FrameLayout.LayoutParams buildContentLayoutParams = buildContentLayoutParams();
        buildContentLayoutParams.height = getResources().getDimensionPixelSize(R.dimen.intercom_office_hours_height);
        buildContentLayoutParams.setMargins(buildContentLayoutParams.leftMargin, buildContentLayoutParams.topMargin, buildContentLayoutParams.rightMargin, getResources().getDimensionPixelSize(R.dimen.intercom_carousel_action_button_bottom_padding));
        buildContentLayoutParams.gravity = 80;
        return buildContentLayoutParams;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$buildRetryButton$1(View view) {
        this.carouselPresenter.retryFetch(getIntent().getStringExtra(PARCEL_CAROUSEL_ID));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ D0 lambda$setInsets$0(View view, D0 d02) {
        C2388d f10 = d02.f(D0.n.h() | D0.n.b());
        view.setPadding(f10.f25150a, f10.f25151b, f10.f25152c, f10.f25153d);
        return D0.f15980b;
    }

    private void setCloseButtonColor(int i10) {
        int color = c.getColor(this, i10);
        this.closeBackground.getBackground().setTint(color);
        this.closeButton.getDrawable().setTint(color);
    }

    private void setInsets() {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.intercom_carousel_root);
        this.rootView = constraintLayout;
        C1680b0.C0(constraintLayout, new a());
    }

    private void setupViewPagerWithScreens(List<CarouselScreen> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (CarouselScreen newInstance : list) {
            arrayList.add(CarouselScreenFragment.newInstance(newInstance));
        }
        CarouselScreenPagerAdapter carouselScreenPagerAdapter = new CarouselScreenPagerAdapter(getSupportFragmentManager(), arrayList);
        this.adapter = carouselScreenPagerAdapter;
        this.viewPager.setAdapter(carouselScreenPagerAdapter);
        this.viewPager.b(this);
        onPageSelected(0);
    }

    private void showRationaleDialog(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
        androidx.appcompat.app.c show = new c.a(this).setTitle(i10).setMessage(i11).setPositiveButton(R.string.intercom_app_settings, onClickListener).setNegativeButton(R.string.intercom_not_now, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                IntercomCarouselActivity.this.skipPermissionScreen();
            }
        }).setCancelable(false).show();
        int primaryOrDarkColor = ColorUtils.primaryOrDarkColor(this, this.appConfigProvider.get());
        show.j(-2).setTextColor(primaryOrDarkColor);
        show.j(-1).setTextColor(primaryOrDarkColor);
    }

    private void showState(View view) {
        setCloseButtonColor(R.color.intercom_carousel_grey);
        this.stateContainer.removeAllViews();
        this.stateContainer.addView(view);
        this.stateContainer.setVisibility(0);
    }

    @SuppressLint({"WrongConstant"})
    private void styleErrorMessage(TextView textView) {
        textView.setBreakStrategy(0);
        textView.setTextColor(androidx.core.content.c.getColor(this, R.color.intercom_black));
        textView.setTextSize(34.0f);
        textView.setTypeface((Typeface) null, 1);
        textView.setLineSpacing((float) ScreenUtils.dpToPx(6.0f, textView.getContext()), 1.0f);
        textView.setGravity(1);
    }

    private void updateCloseButtonColor(boolean z10) {
        int i10;
        if (z10) {
            i10 = R.color.intercom_carousel_grey;
        } else {
            i10 = R.color.intercom_white;
        }
        setCloseButtonColor(i10);
    }

    /* access modifiers changed from: package-private */
    public void closeCarouselAndResetPersistedData() {
        this.carouselPresenter.resetPersistedCarousel();
        finish();
    }

    public void dismissCarousel(String str) {
        if (!Carousel.NULL.equals(this.carouselPresenter.getCarousel())) {
            this.carouselPresenter.recordDismissedOrCompletedStats(this.isLastScreenViewed);
            this.carouselPresenter.recordDismissedOrCompletedMetric(str, this.isLastScreenViewed, this.numberOfScreensSeen);
        }
        closeCarouselAndResetPersistedData();
    }

    /* access modifiers changed from: package-private */
    public void goToSettings() {
        this.sentToSettings = true;
        startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getPackageName(), (String) null)));
    }

    public void logEmptyCarouselError() {
        this.twig.e("Could not open carousel without id", new Object[0]);
    }

    public void logUserNotRegisteredError() {
        this.twig.e("The app config has not been retrieved, please call registerUnidentifiedUser() or registerIdentifiedUser(Registration) before calling displayCarousel(carouselId).", new Object[0]);
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (this.carouselPresenter.getCarousel().isDismissible()) {
            dismissCarousel(MetricTracker.Context.FROM_ANDROID_BACK_BUTTON);
        }
    }

    public void onClick(View view) {
        dismissCarousel(MetricTracker.Context.FROM_CLOSE_BUTTON);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        s.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.intercom_activity_carousel);
        setInsets();
        this.viewPager = (ViewPager) findViewById(R.id.intercom_view_pager);
        this.closeBackground = findViewById(R.id.intercom_close_background);
        this.closeButton = (ImageButton) findViewById(R.id.intercom_close);
        this.closeButtonContainer = (ConstraintLayout) findViewById(R.id.intercom_carousel_close_container);
        this.navigationDotsLayout = (LinearLayout) findViewById(R.id.intercom_page_navigation_layout);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.intercom_state_container);
        this.stateContainer = frameLayout;
        frameLayout.setVisibility(8);
        this.closeButton.setOnClickListener(this);
        this.closeButtonContainer.setOnClickListener(this);
        Injector injector = Injector.get();
        this.appConfigProvider = injector.getAppConfigProvider();
        PermissionManager permissionManager2 = new PermissionManager(this);
        this.permissionManager = permissionManager2;
        PermissionRequest create = PermissionRequestFactory.create(permissionManager2);
        this.permissionRequest = create;
        create.attach(this);
        this.metricTracker = injector.getMetricTracker();
        CarouselPresenter carouselPresenter2 = new CarouselPresenter(injector.getApi(), injector.getUserIdentity(), this.metricTracker, this.permissionManager, injector.getDataLayer());
        this.carouselPresenter = carouselPresenter2;
        carouselPresenter2.attachView(this);
        this.carouselPresenter.fetchCarousel(getIntent().getStringExtra(PARCEL_CAROUSEL_ID));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.permissionRequest.detach();
        super.onDestroy();
    }

    public void onPageScrollStateChanged(int i10) {
    }

    public void onPageScrolled(int i10, float f10, int i11) {
    }

    public void onPageSelected(int i10) {
        List<CarouselScreen> screens = this.carouselPresenter.getCarousel().getScreens();
        int size = screens.size();
        if (size > i10) {
            CarouselScreen carouselScreen = screens.get(i10);
            this.currentPermissionAction = carouselScreen.getPermissionAction();
            this.currentScreenId = carouselScreen.getId();
            boolean isColorLight = ColorUtils.isColorLight(carouselScreen.getBackgroundColor());
            renderNavigationDots(this.adapter.getCount(), isColorLight, i10);
            updateCloseButtonColor(isColorLight);
            if (i10 >= this.numberOfScreensSeen) {
                this.carouselPresenter.recordScreenSeenStats(carouselScreen.getId());
                this.numberOfScreensSeen = i10 + 1;
            }
            if (i10 + 1 == size) {
                this.isLastScreenViewed = true;
            }
        }
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == PERMISSION_REQUEST_CODE) {
            this.carouselPresenter.recordPermissionRequestedMetric(this.currentPermissionAction.getType(), iArr, this.currentScreenId);
            this.permissionRequest.handleResult(strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.sentToSettings) {
            this.sentToSettings = false;
            this.carouselPresenter.recordSentToPermissionSettingsMetric(this.currentPermissionAction, this.currentScreenId);
        }
    }

    public void openLink(String str) {
        dismissCarousel(MetricTracker.Context.FROM_CTA);
        LinkOpener.handleUrl(str, this, Injector.get().getApi());
    }

    /* access modifiers changed from: package-private */
    public void renderNavigationDots(int i10, boolean z10, int i11) {
        int i12;
        this.navigationDotsLayout.removeAllViews();
        if (z10) {
            i12 = R.drawable.intercom_tab_dot_selector_dark;
        } else {
            i12 = R.drawable.intercom_tab_dot_selector_light;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            View view = new View(this);
            int dpToPx = ScreenUtils.dpToPx(16.0f, this);
            view.setLayoutParams(new ViewGroup.LayoutParams(dpToPx, dpToPx));
            view.setBackgroundResource(i12);
            this.navigationDotsLayout.addView(view);
            if (i13 == i11) {
                view.setSelected(true);
            }
        }
    }

    public void requestBackgroundLocationPermission() {
        showRationaleDialog(R.string.intercom_access_background_location_title, R.string.intercom_access_background_location_message, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                IntercomCarouselActivity.this.permissionManager.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, IntercomCarouselActivity.PERMISSION_REQUEST_CODE);
            }
        });
    }

    public void requestPermissions(ScreenAction screenAction) {
        this.permissionRequest.request(screenAction, PERMISSION_REQUEST_CODE);
    }

    public void selectNextScreen(String str) {
        int currentItem = this.viewPager.getCurrentItem() + 1;
        if (currentItem < this.adapter.getCount()) {
            this.viewPager.setCurrentItem(currentItem);
        } else {
            dismissCarousel(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void selectNextScreenWithDelay() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                IntercomCarouselActivity.this.selectNextScreen(MetricTracker.Context.FROM_PERMISSION);
            }
        }, 1000);
    }

    public void showDeniedPermanently() {
        showGoToSettingsDialog();
    }

    public void showDeniedTemporarily() {
        selectNextScreen(MetricTracker.Context.FROM_PERMISSION);
    }

    public void showGenericError() {
        showState(buildErrorMessage(R.string.intercom_something_went_wrong_try_again));
        this.stateContainer.addView(buildRetryButton());
    }

    /* access modifiers changed from: package-private */
    public void showGoToSettingsDialog() {
        showRationaleDialog(R.string.intercom_permission_denied, R.string.intercom_go_to_device_settings, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                IntercomCarouselActivity.this.goToSettings();
            }
        });
    }

    public void showGranted() {
        selectNextScreenWithDelay();
    }

    public void showLoading() {
        showState(buildLoadingState());
    }

    public void showNotFoundError() {
        showState(buildErrorMessage(R.string.intercom_page_not_found));
    }

    /* access modifiers changed from: package-private */
    public void showOrHideNavigationDots(List<CarouselScreen> list) {
        int i10;
        LinearLayout linearLayout = this.navigationDotsLayout;
        if (list.size() > 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
    }

    public void showSuccess(Carousel carousel) {
        int i10 = 8;
        this.stateContainer.setVisibility(8);
        List<CarouselScreen> screens = carousel.getScreens();
        if (screens.isEmpty()) {
            closeCarouselAndResetPersistedData();
        } else {
            this.carouselPresenter.recordOpenMetric();
        }
        ConstraintLayout constraintLayout = this.closeButtonContainer;
        if (carousel.isDismissible()) {
            i10 = 0;
        }
        constraintLayout.setVisibility(i10);
        showOrHideNavigationDots(screens);
        setupViewPagerWithScreens(screens);
    }

    public void skipPermissionScreen() {
        this.metricTracker.skippedPermission(this.currentPermissionAction.getType(), this.carouselPresenter.getCarousel().getInstanceId(), this.carouselPresenter.getCarouselSource());
        selectNextScreen(MetricTracker.Context.FROM_PERMISSION_SKIPPED);
    }

    public void startChat() {
        dismissCarousel(MetricTracker.Context.FROM_CTA);
        if (this.appConfigProvider.get().isInboundMessages()) {
            startActivity(ConversationScreenOpenerKt.getComposerIntent(this, "", false, (ArticleMetadata) null, (String) null, IntercomRootActivity.class));
        }
    }

    public void trackActionButtonTappedStats() {
        this.carouselPresenter.recordActionButtonTappedStats(this.currentScreenId);
    }
}
