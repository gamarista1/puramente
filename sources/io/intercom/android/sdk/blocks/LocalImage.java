package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.LocalImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ProgressFrameLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import io.intercom.android.sdk.views.UploadProgressBar;
import j4.C3619f;
import j4.C3622i;
import j4.C3631r;
import m4.d;

class LocalImage extends Image implements LocalImageBlock {
    /* access modifiers changed from: private */
    public final Twig twig = LumberMill.getLogger();

    LocalImage(StyleType styleType) {
        super(styleType);
    }

    public View addImage(Uri uri, int i10, int i11, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int dpToPx = ScreenUtils.dpToPx((float) i10, context);
        int dpToPx2 = ScreenUtils.dpToPx((float) i11, context);
        ProgressFrameLayout progressFrameLayout = new ProgressFrameLayout(context);
        BlockUtils.createLayoutParams(progressFrameLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(progressFrameLayout);
        final ResizableImageView resizableImageView = new ResizableImageView(context);
        BlockUtils.createLayoutParams(resizableImageView, -2, -2);
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        progressFrameLayout.addView(resizableImageView);
        C3622i.a d10 = new C3622i.a(context).B(resizableImageView).d(uri);
        setImageViewBounds(dpToPx, dpToPx2, resizableImageView, d10);
        View childAt = progressFrameLayout.getChildAt(0);
        Resources resources = context.getResources();
        if (childAt instanceof UploadProgressBar) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.intercom_local_image_upload_size);
            childAt.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            childAt.bringToFront();
            progressFrameLayout.uploadStarted();
        }
        setBackground(resizableImageView);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        resizableImageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        d10.E(new d((float) resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners))).c(true).j(new C3622i.b() {
            public void onError(C3622i iVar, C3619f fVar) {
                LocalImage.this.twig.internal("images", "FAILURE");
            }

            public void onSuccess(C3622i iVar, C3631r rVar) {
                LocalImage.this.twig.internal("images", "SUCCESS");
                resizableImageView.setBackgroundResource(17170445);
            }

            public void onCancel(C3622i iVar) {
            }

            public void onStart(C3622i iVar) {
            }
        });
        IntercomCoilKt.loadIntercomImage(context, d10.a());
        BlockUtils.setLayoutMarginsAndGravity(progressFrameLayout, blockAlignment.getGravity(), blockMetadata.isLastObject());
        return progressFrameLayout;
    }
}
