package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.notification.InAppNotificationCardKt;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.overlay.InAppNotification;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

abstract class ChatNotification extends InAppNotification {
    private static final int ANIMATION_DURATION = 170;
    private static final int GROWTH_WIDTH = 355;

    protected ChatNotification(Context context, Conversation conversation, int i10, int i11, InAppNotification.Listener listener, Provider<AppConfig> provider) {
        super(context, conversation, i10, i11, listener, provider);
    }

    private void expandChat(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.chathead_text_container);
        if (viewGroup2 != null) {
            View contentContainer = getContentContainer();
            View findViewById = viewGroup.findViewById(R.id.chat_avatar_container);
            float translationX = findViewById.getTranslationX();
            float translationY = findViewById.getTranslationY();
            Property property = View.ALPHA;
            ObjectAnimator.ofPropertyValuesHolder(findViewById, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(property, new float[]{1.0f, 0.8f}), PropertyValuesHolder.ofFloat("translationX", new float[]{translationX, 100.0f + translationX}), PropertyValuesHolder.ofFloat("translationY", new float[]{translationY, translationY - 40.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 0.8f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 0.8f})}).setDuration(170).start();
            ObjectAnimator.ofFloat((TextView) viewGroup.findViewById(R.id.chathead_text_header), property, new float[]{1.0f, 0.0f}).setDuration(170).start();
            ObjectAnimator.ofFloat(contentContainer, property, new float[]{1.0f, 0.0f}).setDuration(170).start();
            getWidthAnimator(viewGroup2, animatorListenerAdapter).start();
            getWidthAnimator(this.overlayRoot).start();
            getMarginAnimator(viewGroup2, (ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams()).start();
        }
    }

    private Animator getMarginAnimator(final ViewGroup viewGroup, ViewGroup.MarginLayoutParams marginLayoutParams) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{marginLayoutParams.leftMargin, 0});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                marginLayoutParams.leftMargin = intValue;
                viewGroup.setLayoutParams(marginLayoutParams);
            }
        });
        ofInt.setDuration(170);
        return ofInt;
    }

    private Animator getWidthAnimator(ViewGroup viewGroup, final Animator.AnimatorListener animatorListener) {
        final int abs = Math.abs(viewGroup.getMeasuredWidth() - ScreenUtils.dpToPx(355.0f, viewGroup.getContext()));
        ValueAnimator widthAnimator = getWidthAnimator(viewGroup);
        widthAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            boolean hasSentUpdate = false;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i10 = abs;
                int i11 = 100;
                if (i10 > 0) {
                    i11 = 100 * (intValue / i10);
                }
                if (i11 > 80 && !this.hasSentUpdate) {
                    this.hasSentUpdate = true;
                    animatorListener.onAnimationEnd((Animator) null);
                }
            }
        });
        return widthAnimator;
    }

    private void populateViewsWithData() {
        InAppNotificationCardKt.addInappNotificationCardToView((ComposeView) this.overlayRoot.findViewById(R.id.chat_snippet_compose_view), this.conversation);
    }

    public void display(ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z10, int i10) {
        if (this.overlayRoot == null) {
            this.overlayRoot = inflateChatRootView(viewGroup, layoutInflater);
        }
        if (!isAttached()) {
            viewGroup.addView(this.overlayRoot, 0);
        }
        if (this.bottomPadding != i10) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.overlayRoot.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin + this.overlayRoot.getResources().getDimensionPixelSize(R.dimen.intercom_bottom_padding) + i10);
            this.overlayRoot.setLayoutParams(layoutParams);
            this.bottomPadding = i10;
        }
        populateViewsWithData();
        this.overlayRoot.setVisibility(0);
        beginListeningForTouchEvents();
    }

    /* access modifiers changed from: protected */
    public abstract View getContentContainer();

    /* access modifiers changed from: protected */
    public abstract ViewGroup inflateChatRootView(ViewGroup viewGroup, LayoutInflater layoutInflater);

    public void moveBackward(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter) {
        this.position++;
        animateToPosition(viewGroup.getContext());
        expandChat(viewGroup, animatorListenerAdapter);
    }

    /* access modifiers changed from: protected */
    public void onNotificationPressed(View view) {
        view.animate().scaleX(0.9f).scaleY(0.9f).alpha(0.9f).setDuration(50).start();
    }

    /* access modifiers changed from: protected */
    public void onNotificationReleased(View view) {
        view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(50).start();
    }

    /* access modifiers changed from: protected */
    public abstract void updateContentContainer(Part part);

    /* access modifiers changed from: protected */
    public abstract void updateViewDataDuringReplyPulse(int i10);

    private ValueAnimator getWidthAnimator(final ViewGroup viewGroup) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{viewGroup.getMeasuredWidth(), ScreenUtils.dpToPx(355.0f, viewGroup.getContext())});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.width = intValue;
                viewGroup.setLayoutParams(layoutParams);
            }
        });
        ofInt.setDuration(170);
        return ofInt;
    }
}
