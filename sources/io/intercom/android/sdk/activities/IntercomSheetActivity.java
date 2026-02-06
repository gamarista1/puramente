package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.core.content.c;
import g.C1998a;
import g.C2000c;
import h.C2015d;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.conversation.JavascriptRunner;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.sheets.SheetListener;
import io.intercom.android.sdk.sheets.SheetWebViewPresenter;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.views.IntercomErrorView;
import io.intercom.android.sdk.views.IntercomToolbar;
import java.util.HashMap;
import java.util.Map;
import retrofit2.C6671d;
import retrofit2.C6673f;
import retrofit2.F;

public class IntercomSheetActivity extends IntercomBaseActivity implements IntercomToolbar.Listener, SheetListener {
    private static final int ENTRANCE_ANIMATION_TIME_MS = 250;
    private static final int EXIT_ANIMATION_TIME_MS = 200;
    private static final String PARCEL_CARD_URI = "parcel_card_uri";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_IS_HOME_SCREEN = "parcel_is_home_screen";
    private static final String PARCEL_PARAMS = "parcel_params";
    private static final String PARCEL_SHEET_URL = "parcel_sheet_url";
    private static final int WEBVIEW_FADE_IN_TIME_MS = 300;
    private Provider<AppConfig> appConfigProvider;
    private String cardUri;
    private View containerView;
    /* access modifiers changed from: private */
    public String conversationId = "";
    /* access modifiers changed from: private */
    public IntercomErrorView intercomErrorView;
    private IntercomToolbar intercomToolbar;
    /* access modifiers changed from: private */
    public boolean isHomeScreen;
    private JavascriptRunner jsRunner;
    ProgressBar loadingBar;
    /* access modifiers changed from: private */
    public MetricTracker metricTracker;
    private HashMap params = new HashMap();
    /* access modifiers changed from: private */
    public C2000c pickFile;
    /* access modifiers changed from: private */
    public SheetWebViewPresenter presenter;
    private int secondaryColor;
    /* access modifiers changed from: private */
    public String sheetUrl = "";
    public ValueCallback<Uri[]> valueCallback;
    WebView webView;

    /* access modifiers changed from: private */
    public void animateWindowIn() {
        this.containerView.setVisibility(0);
        this.containerView.setY((float) findViewById(16908290).getMeasuredHeight());
        this.containerView.animate().y(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(250).start();
    }

    private void animateWindowOut() {
        this.containerView.animate().y((float) getWindow().getDecorView().getHeight()).setDuration(200).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                IntercomSheetActivity.this.finish();
                IntercomSheetActivity.this.overridePendingTransition(0, 0);
            }
        }).start();
    }

    public static Intent buildIntent(Context context, String str, Map<String, Object> map, String str2, String str3) {
        Intent intent = new Intent(context, IntercomSheetActivity.class);
        intent.putExtra(PARCEL_SHEET_URL, str);
        intent.putExtra(PARCEL_PARAMS, new HashMap(map));
        intent.putExtra(PARCEL_CARD_URI, str2);
        intent.putExtra(PARCEL_CONVERSATION_ID, str3);
        return intent;
    }

    /* access modifiers changed from: private */
    public void cardUpdated() {
        Injector.get().getDataLayer().emitEvent(IntercomEvent.CardUpdated.INSTANCE);
    }

    private void hideKeyboard() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    private void insertWebView() {
        try {
            this.webView = new WebView(this);
        } catch (Resources.NotFoundException unused) {
            this.webView = new WebView(getApplicationContext());
        }
        this.webView.setAlpha(0.0f);
        this.webView.setId(R.id.intercom_sheet_webview);
        this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ((FrameLayout) findViewById(R.id.sheet_view)).addView(this.webView, 0);
        this.webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView webView, int i10) {
                IntercomSheetActivity.this.loadingBar.setProgress(i10);
            }

            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                IntercomSheetActivity intercomSheetActivity = IntercomSheetActivity.this;
                intercomSheetActivity.valueCallback = valueCallback;
                intercomSheetActivity.pickFile.b(fileChooserParams.createIntent());
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(C1998a aVar) {
        if (aVar.b() != -1 || aVar.a() == null) {
            this.valueCallback.onReceiveValue((Object) null);
        } else {
            this.valueCallback.onReceiveValue(new Uri[]{aVar.a().getData()});
        }
    }

    /* access modifiers changed from: private */
    public void loadSheet(Api api) {
        this.loadingBar.setVisibility(0);
        this.intercomErrorView.setVisibility(8);
        api.fetchSheet(this.params, new C6673f() {
            public void onFailure(C6671d<Sheet.Builder> dVar, Throwable th2) {
                IntercomSheetActivity.this.showErrorView();
            }

            public void onResponse(C6671d<Sheet.Builder> dVar, F<Sheet.Builder> f10) {
                if (!f10.e() || f10.a() == null) {
                    IntercomSheetActivity.this.showErrorView();
                    return;
                }
                IntercomSheetActivity.this.intercomErrorView.setVisibility(8);
                IntercomSheetActivity.this.presenter.loadBundle(((Sheet.Builder) f10.a()).build().getBody());
                IntercomSheetActivity.this.metricTracker.viewedMessengerSheet(IntercomSheetActivity.this.conversationId, IntercomSheetActivity.this.sheetUrl, IntercomSheetActivity.this.isHomeScreen);
            }
        });
    }

    private void setUpToolbar(Provider<AppConfig> provider) {
        AppConfig appConfig = provider.get();
        IntercomToolbar intercomToolbar2 = (IntercomToolbar) findViewById(R.id.intercom_toolbar);
        this.intercomToolbar = intercomToolbar2;
        intercomToolbar2.updateToolbarColors(appConfig);
        this.intercomToolbar.setListener(this);
        this.intercomToolbar.setSubtitleVisibility(8);
        this.intercomToolbar.setBackgroundColor(this.secondaryColor);
        this.intercomToolbar.setLeftNavigationItemVisibility(0);
        this.intercomToolbar.setCloseButtonVisibility(8);
        this.intercomToolbar.setLeftNavigationIcon(c.getDrawable(this, R.drawable.intercom_close));
        ProgressBar progressBar = (ProgressBar) this.intercomToolbar.findViewById(R.id.toolbar_progress_bar);
        this.loadingBar = progressBar;
        progressBar.setProgressDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(appConfig.getSecondaryColorDark()), new ScaleDrawable(new ColorDrawable(-1), 8388611, 1.0f, -1.0f)}));
    }

    /* access modifiers changed from: private */
    public void showErrorView() {
        this.loadingBar.setVisibility(8);
        this.intercomErrorView.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public void showSubmitActionError(final Map<String, Object> map) {
        androidx.appcompat.app.c create = new c.a(this).setTitle(R.string.intercom_couldnt_load_content).setMessage(R.string.intercom_give_it_another_try).setPositiveButton(R.string.intercom_reload, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                IntercomSheetActivity.this.onSubmitSheetAction(map);
            }
        }).create();
        create.show();
        create.j(-1).setTextColor(ColorUtils.primaryOrDarkColor(this, this.appConfigProvider.get()));
    }

    /* access modifiers changed from: package-private */
    public void closeSheet() {
        this.metricTracker.closedMessengerSheet(this.conversationId, this.sheetUrl, this.isHomeScreen);
        hideKeyboard();
        animateWindowOut();
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (this.webView.canGoBack()) {
            this.webView.goBack();
        } else {
            closeSheet();
        }
    }

    public void onCloseClicked() {
    }

    public void onCloseSheetAction() {
        closeSheet();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Injector injector = Injector.get();
        this.metricTracker = injector.getMetricTracker();
        Provider<AppConfig> appConfigProvider2 = injector.getAppConfigProvider();
        this.appConfigProvider = appConfigProvider2;
        this.secondaryColor = appConfigProvider2.get().getSecondaryColor();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.sheetUrl = extras.getString(PARCEL_SHEET_URL, "");
            this.conversationId = extras.getString(PARCEL_CONVERSATION_ID, "");
            this.params = (HashMap) extras.getSerializable(PARCEL_PARAMS);
            this.cardUri = extras.getString(PARCEL_CARD_URI);
            this.isHomeScreen = extras.getBoolean(PARCEL_IS_HOME_SCREEN, false);
        }
        setContentView(R.layout.intercom_activity_sheet);
        setUpToolbar(this.appConfigProvider);
        this.containerView = findViewById(R.id.sheet_root);
        if (TextUtils.isEmpty(this.sheetUrl) || this.params == null) {
            closeSheet();
        }
        this.containerView.setVisibility(8);
        this.containerView.post(new Runnable() {
            public void run() {
                IntercomSheetActivity.this.animateWindowIn();
            }
        });
        insertWebView();
        JavascriptRunner javascriptRunner = new JavascriptRunner(this.webView);
        this.jsRunner = javascriptRunner;
        SheetWebViewPresenter sheetWebViewPresenter = new SheetWebViewPresenter(this.webView, javascriptRunner, this.sheetUrl, this, injector);
        this.presenter = sheetWebViewPresenter;
        sheetWebViewPresenter.setUpWebView();
        IntercomErrorView intercomErrorView2 = (IntercomErrorView) this.containerView.findViewById(R.id.error_layout_sheet);
        this.intercomErrorView = intercomErrorView2;
        intercomErrorView2.setActionButtonTextColor(ColorUtils.primaryOrDarkColor(this, this.appConfigProvider.get()));
        this.intercomErrorView.setActionButtonClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                IntercomSheetActivity.this.loadSheet(Injector.get().getApi());
            }
        });
        this.pickFile = registerForActivityResult(new C2015d(), new c(this));
        loadSheet(injector.getApi());
    }

    public void onInboxClicked() {
        closeSheet();
    }

    public void onSheetTitleAction(String str) {
        this.intercomToolbar.setTitle(str);
    }

    public void onSubmitSheetAction(final Map<String, Object> map) {
        Injector.get().getApi().submitSheet(this.cardUri, map, new C6673f() {
            public void onFailure(C6671d<Void> dVar, Throwable th2) {
                IntercomSheetActivity.this.showSubmitActionError(map);
            }

            public void onResponse(C6671d<Void> dVar, F<Void> f10) {
                if (f10.e()) {
                    IntercomSheetActivity.this.cardUpdated();
                    IntercomSheetActivity.this.closeSheet();
                    return;
                }
                IntercomSheetActivity.this.showSubmitActionError(map);
            }
        });
    }

    public void onToolbarClicked() {
    }

    public void onWebViewFinishedLoad() {
        this.jsRunner.runPendingScripts();
        this.webView.animate().alpha(1.0f).setDuration(300).start();
        this.loadingBar.setVisibility(8);
    }
}
