package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

abstract class InAppNotification implements View.OnTouchListener {
    private static final int ANIMATE_OFFSCREEN_OFFSET = 200;
    private static final int BASE_MARGIN_DP = 16;
    private static final int DISMISS_DISTANCE_DP = 80;
    protected static final int MARGIN_OFFSET_DP = 8;
    protected static final int NEW_MESSENGER_CORNER_RADIUS = 20;
    private static final float RESISTANCE = 2.0f;
    protected static final float SCALE_OFFSET = 0.05f;
    protected final Provider<AppConfig> appConfigProvider;
    protected int bottomPadding = 0;
    protected Conversation conversation;
    private float initialTouchX;
    private float initialViewX;
    final Listener listener;
    protected final Context localisedContext;
    protected ViewGroup overlayRoot;
    protected int position;
    protected final int screenHeight;

    interface Listener {
        void onInAppNotificationDismiss(InAppNotification inAppNotification);

        void onInAppNotificationTap(Conversation conversation);
    }

    protected InAppNotification(Context context, Conversation conversation2, int i10, int i11, Listener listener2, Provider<AppConfig> provider) {
        this.conversation = conversation2;
        this.listener = listener2;
        this.position = i10;
        this.screenHeight = i11;
        this.localisedContext = context;
        this.appConfigProvider = provider;
    }

    private void animateOffScreen(View view) {
        int width;
        int dpToPx = ScreenUtils.dpToPx(200.0f, view.getContext());
        if (view.getX() > this.initialViewX) {
            width = getParentOrScreenWidth(view) + dpToPx;
        } else {
            width = (view.getWidth() * -1) - dpToPx;
        }
        view.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationX((float) width).setDuration(300).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                InAppNotification inAppNotification = InAppNotification.this;
                inAppNotification.listener.onInAppNotificationDismiss(inAppNotification);
            }
        }).start();
    }

    private void animateToOriginalPosition(View view) {
        view.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationX(0.0f).setDuration(300).start();
    }

    private int getParentOrScreenWidth(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return ((View) parent).getWidth();
        }
        return view.getResources().getDisplayMetrics().widthPixels;
    }

    /* access modifiers changed from: protected */
    public void animateToBackOfStack(Context context) {
        Resources resources = context.getResources();
        int dimension = this.screenHeight - (((((int) resources.getDimension(R.dimen.intercom_notification_preview_height)) + ScreenUtils.dpToPx((float) ((this.position * 8) + 16), context)) + resources.getDimensionPixelSize(R.dimen.intercom_bottom_padding)) + this.bottomPadding);
        ObjectAnimator.ofPropertyValuesHolder(this.overlayRoot, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.Y, new float[]{(float) (ScreenUtils.dpToPx(8.0f, context) + dimension), (float) dimension}), PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{this.overlayRoot.getAlpha(), 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.85f, 1.0f - (((float) this.position) * SCALE_OFFSET)})}).setDuration(200).start();
    }

    /* access modifiers changed from: protected */
    public void animateToPosition(Context context) {
        Resources resources = context.getResources();
        ObjectAnimator.ofPropertyValuesHolder(this.overlayRoot, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("y", new float[]{this.overlayRoot.getY(), (float) (this.screenHeight - (((((int) resources.getDimension(R.dimen.intercom_notification_preview_height)) + ScreenUtils.dpToPx((float) ((this.position * 8) + 16), context)) + resources.getDimensionPixelSize(R.dimen.intercom_bottom_padding)) + this.bottomPadding))}), PropertyValuesHolder.ofFloat("scaleX", new float[]{this.overlayRoot.getScaleX(), 1.0f - (((float) this.position) * SCALE_OFFSET)})}).setDuration(200).start();
    }

    /* access modifiers changed from: protected */
    public void beginListeningForTouchEvents() {
        this.overlayRoot.setOnTouchListener(this);
    }

    public abstract void display(ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z10, int i10);

    public void display(ViewGroup viewGroup, Conversation conversation2, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.conversation = conversation2;
        display(viewGroup, layoutInflater, z10, i10);
    }

    public Conversation getConversation() {
        return this.conversation;
    }

    /* access modifiers changed from: protected */
    public CharSequence getHeaderText() {
        Part lastPart = this.conversation.lastPart();
        if (this.conversation.getParticipants().size() > 1) {
            return Phrase.from(this.localisedContext, R.string.intercom_reply_from_admin).putOptional("name", (CharSequence) this.conversation.lastAdmin().getForename()).format();
        }
        if (this.conversation.parts().isEmpty()) {
            return this.conversation.lastAdmin().getForename();
        }
        return this.conversation.lastAdmin().getForename() + " • " + TimeFormatterExtKt.formattedDateFromLong(lastPart.getCreatedAt(), this.localisedContext);
    }

    public int getPosition() {
        return this.position;
    }

    /* access modifiers changed from: protected */
    public View getRootView() {
        return this.overlayRoot;
    }

    public boolean isAttached() {
        if (this.overlayRoot.getParent() != null) {
            return true;
        }
        return false;
    }

    public void moveBackward(ViewGroup viewGroup) {
        moveBackward(viewGroup, new AnimatorListenerAdapter() {
        });
    }

    public abstract void moveBackward(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter);

    public void moveForward(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i10 = this.position - 1;
        this.position = i10;
        if (i10 <= 0) {
            animateToPosition(viewGroup.getContext());
            beginListeningForTouchEvents();
        } else if (i10 == 1) {
            animateToPosition(viewGroup.getContext());
        } else if (i10 == 2) {
            display(viewGroup, layoutInflater, false, this.bottomPadding);
            animateToBackOfStack(viewGroup.getContext());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onNotificationPressed(View view);

    /* access modifiers changed from: protected */
    public abstract void onNotificationReleased(View view);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        float rawX = (motionEvent.getRawX() - this.initialTouchX) / RESISTANCE;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.initialViewX = view.getX();
            this.initialTouchX = motionEvent.getRawX();
            onNotificationPressed(getRootView());
        } else if (action == 1) {
            float abs = Math.abs(rawX);
            if (abs < 5.0f) {
                this.listener.onInAppNotificationTap(this.conversation);
            } else if (abs > ((float) ScreenUtils.dpToPx(80.0f, this.localisedContext))) {
                stopListeningForTouchEvents();
                animateOffScreen(view);
            } else {
                onNotificationReleased(getRootView());
                animateToOriginalPosition(view);
            }
        } else if (action == 2) {
            view.setX(rawX + this.initialViewX);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void performReplyPulse(View view, final View view2, final Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 1.05f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 1.05f})}).setDuration(150);
        duration.setRepeatCount(1);
        duration.setRepeatMode(2);
        duration.start();
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f, 0.0f}).setDuration(200);
        duration2.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                InAppNotification inAppNotification = InAppNotification.this;
                inAppNotification.updateViewDataDuringReplyPulse(inAppNotification.bottomPadding);
                ObjectAnimator duration = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f, 1.0f}).setDuration(200);
                duration.setStartDelay(100);
                duration.start();
                duration.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        runnable.run();
                    }
                });
            }
        });
        duration2.start();
    }

    public void removeView() {
        View rootView = getRootView();
        if (rootView != null && rootView.getParent() != null) {
            ((ViewGroup) rootView.getParent()).removeView(rootView);
        }
    }

    public void setPosition(int i10) {
        this.position = i10;
    }

    /* access modifiers changed from: protected */
    public void stopListeningForTouchEvents() {
        this.overlayRoot.setOnTouchListener((View.OnTouchListener) null);
    }

    public abstract void update(Conversation conversation2, Runnable runnable);

    public void updateBottomPadding(Context context, int i10) {
        if (this.bottomPadding != i10 && this.overlayRoot != null) {
            this.bottomPadding = i10;
            int dpToPx = ScreenUtils.dpToPx((float) ((this.position * 8) + 16), context) + context.getResources().getDimensionPixelSize(R.dimen.intercom_bottom_padding) + i10;
            final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.overlayRoot.getLayoutParams();
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{layoutParams.bottomMargin, dpToPx});
            ofInt.setDuration((long) 300);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    FrameLayout.LayoutParams layoutParams = layoutParams;
                    layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    InAppNotification.this.overlayRoot.setLayoutParams(layoutParams);
                }
            });
            ofInt.start();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void updateViewDataDuringReplyPulse(int i10);
}
