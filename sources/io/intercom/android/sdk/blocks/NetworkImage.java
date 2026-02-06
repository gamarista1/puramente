package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.shimmer.d;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.ImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.lightbox.LightBoxActivity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.coil.GrayscaleTransformation;
import io.intercom.android.sdk.utilities.coil.RoundedCornersAnimatedTransformation;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import j4.C3619f;
import j4.C3622i;
import j4.C3631r;

public class NetworkImage extends Image implements ImageBlock {
    /* access modifiers changed from: private */
    public final ImageClickListener listener;
    /* access modifiers changed from: private */
    public final Twig twig = LumberMill.getLogger();
    private final UploadingImageCache uploadingImageCache;

    NetworkImage(StyleType styleType, UploadingImageCache uploadingImageCache2, ImageClickListener imageClickListener) {
        super(styleType);
        this.uploadingImageCache = uploadingImageCache2;
        this.listener = imageClickListener;
    }

    private void loadImageFromUrl(String str, String str2, Context context, int i10, int i11, ResizableImageView resizableImageView, d dVar) {
        String str3 = str;
        Context context2 = context;
        ResizableImageView resizableImageView2 = resizableImageView;
        if (TextUtils.isEmpty(str)) {
            hideLoadingState(dVar, resizableImageView2);
            resizableImageView2.setImageResource(R.drawable.intercom_image_load_failed);
            resizableImageView2.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        d dVar2 = dVar;
        C3622i.a d10 = new C3622i.a(context2).h(R.drawable.intercom_image_load_failed).c(true).B(resizableImageView2).d(str);
        setImageViewBounds(i10, i11, resizableImageView2, d10);
        Resources resources = context.getResources();
        if (getStyle() != StyleType.CAROUSEL) {
            if (ImageUtils.isGif(str)) {
                d10.v("coil#animated_transformation", new RoundedCornersAnimatedTransformation((float) resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners)));
            } else {
                d10.E(new m4.d((float) resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners)));
            }
        }
        Uri localImageUriForRemoteUrl = this.uploadingImageCache.getLocalImageUriForRemoteUrl(str);
        if (localImageUriForRemoteUrl != null) {
            d10.E(new GrayscaleTransformation()).d(localImageUriForRemoteUrl);
        }
        final ResizableImageView resizableImageView3 = resizableImageView;
        final d dVar3 = dVar;
        final Context context3 = context;
        final String str4 = str;
        final String str5 = str2;
        final int i12 = i10;
        final int i13 = i11;
        d10.j(new C3622i.b() {
            public void onError(C3622i iVar, C3619f fVar) {
                ResizableImageView resizableImageView = resizableImageView3;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                resizableImageView.setScaleType(scaleType);
                NetworkImage.this.hideLoadingState(dVar3, resizableImageView3);
                NetworkImage.this.twig.internal("images", "FAILURE");
                resizableImageView3.setScaleType(scaleType);
            }

            public void onSuccess(C3622i iVar, C3631r rVar) {
                NetworkImage.this.twig.internal("images", "SUCCESS");
                NetworkImage.this.hideLoadingState(dVar3, resizableImageView3);
                if (NetworkImage.this.getStyle() != StyleType.CHAT_FULL && NetworkImage.this.listener != null) {
                    resizableImageView3.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ((InputMethodManager) context3.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                            ImageClickListener access$100 = NetworkImage.this.listener;
                            AnonymousClass1 r72 = AnonymousClass1.this;
                            access$100.onImageClicked(str4, str5, resizableImageView3, i12, i13);
                        }
                    });
                }
            }

            public void onCancel(C3622i iVar) {
            }

            public void onStart(C3622i iVar) {
            }
        });
        IntercomCoilKt.loadIntercomImage(context2, d10.a());
    }

    public View addImage(String str, String str2, String str3, int i10, int i11, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int dpToPx = ScreenUtils.dpToPx((float) i10, context);
        int dpToPx2 = ScreenUtils.dpToPx((float) i11, context);
        IntercomShimmerLayout intercomShimmerLayout = new IntercomShimmerLayout(context);
        BlockUtils.createLayoutParams(intercomShimmerLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(intercomShimmerLayout);
        ResizableImageView resizableImageView = new ResizableImageView(context);
        resizableImageView.setTransitionName(LightBoxActivity.TRANSITION_KEY);
        resizableImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        setBackground(resizableImageView);
        intercomShimmerLayout.addView(resizableImageView);
        loadImageFromUrl(str, str2, context, dpToPx, dpToPx2, resizableImageView, intercomShimmerLayout);
        BlockUtils.setLayoutMarginsAndGravity(intercomShimmerLayout, blockAlignment.getGravity(), blockMetadata.isLastObject());
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            AccessibilityUtils.INSTANCE.removeClickAbilityAnnouncement(resizableImageView);
        } else if (!TextUtils.isEmpty(str3)) {
            resizableImageView.setFocusable(true);
            String str4 = str3;
            resizableImageView.setContentDescription(str3);
        }
        return intercomShimmerLayout;
    }

    /* access modifiers changed from: package-private */
    public int getSampleSize(int i10, int i11, DisplayMetrics displayMetrics) {
        int i12 = displayMetrics.widthPixels;
        if (i10 > i12 || i11 > displayMetrics.heightPixels) {
            return (int) Math.pow(2.0d, (double) ((int) Math.ceil(Math.log(((double) i12) / ((double) Math.max(i11, i10))) / Math.log(0.5d))));
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    public void hideLoadingState(d dVar, ImageView imageView) {
        if (dVar != null) {
            dVar.hideShimmer();
            imageView.setBackgroundResource(17170445);
        }
    }
}
