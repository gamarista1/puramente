package io.intercom.android.sdk.overlay;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.notification.InAppNotificationCardKt;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.overlay.InAppNotification;

class StackableSnippet extends InAppNotification implements View.OnTouchListener {
    private static final int BASE_ELEVATION = 18;
    private static final int BASE_MARGIN_DP = 16;
    private static final int ELEVATION_STEP = 3;
    private final Handler handler;

    public StackableSnippet(Context context, Conversation conversation, int i10, Handler handler2, int i11, InAppNotification.Listener listener, Provider<AppConfig> provider) {
        super(context, conversation, i10, i11, listener, provider);
        this.handler = handler2;
    }

    private void animateOnScreen() {
        this.handler.postDelayed(new Runnable() {
            public void run() {
                StackableSnippet.this.overlayRoot.setVisibility(0);
                StackableSnippet stackableSnippet = StackableSnippet.this;
                stackableSnippet.overlayRoot.setY((float) stackableSnippet.screenHeight);
                StackableSnippet.this.overlayRoot.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300).start();
            }
        }, (long) (this.position * 70));
    }

    private void setSummaryText(Part part) {
        TextView textView = (TextView) this.overlayRoot.findViewById(R.id.in_app_notification_message_summary);
        if (part.getEventData().getCustomStatePrefix() == null || part.getEventData().getCustomStatePrefix().isEmpty()) {
            textView.setText(part.getSummary());
        } else {
            textView.setText(part.getEventData().getCustomStatePrefix());
        }
    }

    private void setViewData(int i10) {
        this.overlayRoot.getContext();
        InAppNotificationCardKt.addInappNotificationCardToView((ComposeView) this.overlayRoot.findViewById(R.id.chat_snippet_compose_view), this.conversation);
        this.overlayRoot.setElevation((float) (18 - (this.position * 3)));
        this.overlayRoot.setScaleX(1.0f - (((float) this.position) * 0.05f));
        if (this.position == 0) {
            beginListeningForTouchEvents();
        }
    }

    private void setupView(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        if (this.overlayRoot == null) {
            this.overlayRoot = (ViewGroup) layoutInflater.inflate(R.layout.intercom_preview_notification, viewGroup, false);
        }
        if (!isAttached()) {
            viewGroup.addView(this.overlayRoot, 0);
        }
    }

    public void display(ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z10, int i10) {
        setupView(viewGroup, layoutInflater);
        setViewData(i10);
        if (z10) {
            animateOnScreen();
        } else {
            this.overlayRoot.setVisibility(0);
        }
    }

    public void moveBackward(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter) {
        this.position++;
        animateToPosition(viewGroup.getContext());
    }

    /* access modifiers changed from: protected */
    public void onNotificationPressed(View view) {
        view.animate().scaleX(0.95f).scaleY(0.95f).setDuration(50).start();
    }

    /* access modifiers changed from: protected */
    public void onNotificationReleased(View view) {
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(50).start();
    }

    public void update(Conversation conversation, Runnable runnable) {
        this.conversation = conversation;
        performReplyPulse(this.overlayRoot.findViewById(R.id.notification_root), this.overlayRoot.findViewById(R.id.in_app_notification_message_summary), runnable);
    }

    /* access modifiers changed from: protected */
    public void updateViewDataDuringReplyPulse(int i10) {
        setViewData(i10);
    }
}
