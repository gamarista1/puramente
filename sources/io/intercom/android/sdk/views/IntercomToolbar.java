package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ColorUtils;

public class IntercomToolbar extends Toolbar implements View.OnTouchListener, View.OnClickListener {
    private static final int TITLE_FADE_DURATION_MS = 150;
    private final View activeStateView;
    private final ImageView avatar;
    private final ImageButton backButton;
    private final BackButtonCountDrawable backButtonCountDrawable;
    private final ImageButton close;
    private Listener listener;
    private final TextView subtitle;
    final TextView title;

    public interface Listener {
        void onCloseClicked();

        void onInboxClicked();

        void onToolbarClicked();
    }

    public IntercomToolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public void fadeOutTitle(int i10) {
        this.title.animate().alpha(0.0f).setDuration((long) i10).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                IntercomToolbar.this.title.setText((CharSequence) null);
            }
        }).start();
    }

    public void onClick(View view) {
        if (this.listener != null) {
            int id2 = view.getId();
            if (id2 == R.id.intercom_toolbar_close) {
                this.listener.onCloseClicked();
            } else if (id2 == R.id.intercom_toolbar_inbox) {
                this.listener.onInboxClicked();
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.listener != null && motionEvent.getAction() == 1 && view.getId() == R.id.intercom_toolbar) {
            this.listener.onToolbarClicked();
        }
        return false;
    }

    public void setCloseButtonVisibility(int i10) {
        this.close.setVisibility(i10);
    }

    public void setLeftNavigationIcon(Drawable drawable) {
        this.backButton.setImageDrawable(drawable);
    }

    public void setLeftNavigationItemVisibility(int i10) {
        this.backButton.setVisibility(i10);
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.subtitle.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            this.subtitle.setAlpha(1.0f);
        }
    }

    public void setSubtitleVisibility(int i10) {
        this.subtitle.setVisibility(i10);
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            fadeOutTitle(TITLE_FADE_DURATION_MS);
            return;
        }
        this.title.setAlpha(1.0f);
        this.title.setText(charSequence);
    }

    public void setUpNoteToolbar(Participant participant, boolean z10, ActiveStatePresenter activeStatePresenter, AppConfig appConfig) {
        this.title.setTextColor(c.getColor(getContext(), R.color.intercom_accessibility_black));
        this.subtitle.setTextColor(c.getColor(getContext(), R.color.intercom_accessibility_grey));
        this.close.setColorFilter(c.getColor(getContext(), R.color.intercom_accessibility_grey));
        this.backButton.setVisibility(8);
        this.avatar.setVisibility(0);
        this.activeStateView.setVisibility(0);
        this.title.setTextSize(14.0f);
        this.subtitle.setAlpha(1.0f);
        View findViewById = findViewById(R.id.intercom_toolbar_divider);
        findViewById.setVisibility(0);
        findViewById.setBackgroundColor(-16777216);
        AvatarUtils.loadAvatarIntoView(participant.getAvatar(), this.avatar, appConfig);
        activeStatePresenter.presentStateDot(z10, this.activeStateView, appConfig);
    }

    public void setUpPostToolbar(Participant participant, boolean z10, ActiveStatePresenter activeStatePresenter, AppConfig appConfig) {
        setBackgroundColor(0);
        this.subtitle.setTextColor(-1);
        this.title.setTextColor(-1);
        this.close.setColorFilter(-1);
        this.backButton.setVisibility(8);
        this.avatar.setVisibility(0);
        this.activeStateView.setVisibility(0);
        this.title.setTextSize(14.0f);
        findViewById(R.id.intercom_toolbar_divider).setVisibility(0);
        AvatarUtils.loadAvatarIntoView(participant.getAvatar(), this.avatar, appConfig);
        activeStatePresenter.presentStateDot(z10, this.activeStateView, appConfig);
    }

    public void updateToolbarColors(AppConfig appConfig) {
        boolean isSecondaryColorRenderDarkText = appConfig.isSecondaryColorRenderDarkText();
        ColorUtils.setTextColorWhiteOrBlack(this.title, isSecondaryColorRenderDarkText);
        ColorUtils.setTextColorWhiteOrBlack(this.subtitle, isSecondaryColorRenderDarkText);
        ColorUtils.setImageColorWhiteOrBlack(this.close, isSecondaryColorRenderDarkText);
        ColorUtils.setImageColorWhiteOrBlack(this.backButton, isSecondaryColorRenderDarkText);
    }

    public IntercomToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = View.inflate(context, R.layout.intercom_toolbar, this);
        inflate.setOnTouchListener(this);
        this.title = (TextView) inflate.findViewById(R.id.intercom_toolbar_title);
        this.subtitle = (TextView) inflate.findViewById(R.id.intercom_toolbar_subtitle);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.intercom_toolbar_close);
        this.close = imageButton;
        ImageButton imageButton2 = (ImageButton) inflate.findViewById(R.id.intercom_toolbar_inbox);
        this.backButton = imageButton2;
        this.avatar = (ImageView) inflate.findViewById(R.id.intercom_toolbar_avatar);
        this.activeStateView = inflate.findViewById(R.id.intercom_toolbar_avatar_active_state);
        BackButtonCountDrawable backButtonCountDrawable2 = new BackButtonCountDrawable(getContext(), (String) null);
        this.backButtonCountDrawable = backButtonCountDrawable2;
        imageButton2.setImageDrawable(backButtonCountDrawable2);
        imageButton2.setOnClickListener(this);
        imageButton.setOnClickListener(this);
    }
}
