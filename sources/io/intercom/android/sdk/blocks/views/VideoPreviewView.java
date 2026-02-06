package io.intercom.android.sdk.blocks.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.content.c;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import j4.C3619f;
import j4.C3622i;
import j4.C3631r;

public class VideoPreviewView extends RelativeLayout {
    private static final int PLAY_ARROW_OFFSET_DP = 3;
    private static final int PLAY_BUTTON_DIAMETER_DP = 48;
    /* access modifiers changed from: private */
    public final ProgressBar loadingSpinner;
    /* access modifiers changed from: private */
    public final ImageView playButton;
    /* access modifiers changed from: private */
    public final ImageView thumbnailImageView;

    public VideoPreviewView(Context context, Provider<AppConfig> provider, StyleType styleType) {
        super(context);
        BlockUtils.createLayoutParams(this, -2, -2);
        BlockUtils.setDefaultMarginBottom(this);
        ImageView videoImageView = getVideoImageView(context);
        this.thumbnailImageView = videoImageView;
        ImageView playButtonView = getPlayButtonView(context);
        this.playButton = playButtonView;
        ProgressBar loadingSpinner2 = getLoadingSpinner();
        this.loadingSpinner = loadingSpinner2;
        addView(videoImageView);
        addView(playButtonView);
        addView(loadingSpinner2);
        int primaryColor = provider.get().getPrimaryColor();
        primaryColor = styleType == StyleType.POST ? ColorUtils.lightenColor(primaryColor) : primaryColor;
        if (ColorUtils.isColorLight(primaryColor)) {
            playButtonView.setColorFilter(c.getColor(context, R.color.intercom_accessibility_black), PorterDuff.Mode.SRC_ATOP);
        } else {
            playButtonView.setColorFilter(primaryColor, PorterDuff.Mode.SRC_ATOP);
        }
        AccessibilityUtils accessibilityUtils = AccessibilityUtils.INSTANCE;
        accessibilityUtils.removeClickAbilityAnnouncement(this);
        accessibilityUtils.addClickAbilityAnnouncement(playButtonView);
    }

    private ProgressBar getLoadingSpinner() {
        return (ProgressBar) View.inflate(getContext(), R.layout.intercom_progress_bar, (ViewGroup) null).findViewById(R.id.progressBar);
    }

    private ImageView getPlayButtonView(Context context) {
        int dpToPx = ScreenUtils.dpToPx(48.0f, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.intercom_play_arrow);
        imageView.setPadding(ScreenUtils.dpToPx(3.0f, context), 0, 0, 0);
        imageView.setBackgroundResource(R.drawable.intercom_solid_circle);
        imageView.setVisibility(8);
        imageView.setId(R.id.intercom_video_thumbnail_play_button);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement(imageView);
        return imageView;
    }

    private ImageView getVideoImageView(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setId(R.id.intercom_video_thumbnail);
        return imageView;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showFailedImage$0() {
        BackgroundUtils.setBackground(this.thumbnailImageView, c.getDrawable(getContext(), R.drawable.intercom_video_thumbnail_fallback));
    }

    /* access modifiers changed from: private */
    public void updateThumbnailAspectRatio() {
        this.thumbnailImageView.getLayoutParams().height = (this.thumbnailImageView.getWidth() * 3) / 4;
    }

    public void displayThumbnail(String str) {
        this.loadingSpinner.setVisibility(0);
        this.thumbnailImageView.setVisibility(4);
        IntercomCoilKt.loadIntercomImage(getContext(), new C3622i.a(getContext()).d(str).m(R.drawable.intercom_video_thumbnail_fallback).h(R.drawable.intercom_video_thumbnail_fallback).c(true).B(this.thumbnailImageView).j(new C3622i.b() {
            public void onError(C3622i iVar, C3619f fVar) {
                VideoPreviewView.this.loadingSpinner.setVisibility(8);
                VideoPreviewView.this.thumbnailImageView.setVisibility(0);
                VideoPreviewView.this.updateThumbnailAspectRatio();
                VideoPreviewView.this.playButton.setVisibility(8);
            }

            public void onSuccess(C3622i iVar, C3631r rVar) {
                VideoPreviewView.this.loadingSpinner.setVisibility(8);
                VideoPreviewView.this.thumbnailImageView.setVisibility(0);
                VideoPreviewView.this.updateThumbnailAspectRatio();
                VideoPreviewView.this.thumbnailImageView.setColorFilter(c.getColor(VideoPreviewView.this.thumbnailImageView.getContext(), R.color.intercom_semi_transparent), PorterDuff.Mode.DARKEN);
                VideoPreviewView.this.playButton.setVisibility(0);
            }

            public void onCancel(C3622i iVar) {
            }

            public void onStart(C3622i iVar) {
            }
        }).a());
    }

    public ImageView getThumbnailImageView() {
        return this.thumbnailImageView;
    }

    public void showFailedImage() {
        this.thumbnailImageView.post(new a(this));
    }
}
