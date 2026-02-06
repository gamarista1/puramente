package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.content.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import j4.C3622i;

class DefaultLauncher implements View.OnTouchListener {
    private static final int ANIMATION_DURATION_MS = 300;
    private static final int CUSTOM_LAUNCHER_SIZE_DP = 34;
    private final ImageButton badge;
    private final TextView badgeCount;
    final View launcherRoot;
    final Listener listener;

    public interface Listener {
        void onLauncherClicked(Context context);
    }

    public DefaultLauncher(ViewGroup viewGroup, LayoutInflater layoutInflater, Listener listener2, int i10) {
        this.listener = listener2;
        layoutInflater.inflate(R.layout.intercom_default_launcher, viewGroup, true);
        View findViewById = viewGroup.findViewById(R.id.launcher_root);
        this.launcherRoot = findViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i10);
        findViewById.setLayoutParams(marginLayoutParams);
        this.badge = (ImageButton) findViewById.findViewById(R.id.launcher_icon);
        this.badgeCount = (TextView) findViewById.findViewById(R.id.launcher_badge_count);
        findViewById.setOnTouchListener(this);
    }

    private void callListenerWithFadeOut() {
        this.launcherRoot.setAlpha(1.0f);
        this.launcherRoot.animate().alpha(0.0f).setDuration(50).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                DefaultLauncher defaultLauncher = DefaultLauncher.this;
                defaultLauncher.listener.onLauncherClicked(defaultLauncher.launcherRoot.getContext());
            }
        }).start();
    }

    public void fadeOffScreen(Animator.AnimatorListener animatorListener) {
        this.launcherRoot.animate().alpha(0.0f).setDuration(100).setListener(animatorListener).start();
    }

    public void fadeOnScreen() {
        this.launcherRoot.setAlpha(0.0f);
        this.launcherRoot.animate().alpha(1.0f).setDuration(100).start();
    }

    public void hideBadgeCount() {
        this.badgeCount.setVisibility(8);
    }

    public boolean isAttachedToRoot(ViewGroup viewGroup) {
        if (this.launcherRoot.getParent() == viewGroup) {
            return true;
        }
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (action == 1) {
            callListenerWithFadeOut();
        }
        return true;
    }

    public void pulseForTransformation(final Animator.AnimatorListener animatorListener) {
        this.launcherRoot.animate().scaleX(1.1f).scaleY(1.1f).setDuration(100).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                animatorListener.onAnimationEnd(animator);
                DefaultLauncher.this.launcherRoot.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
            }
        }).start();
    }

    public void removeView() {
        if (this.launcherRoot.getParent() != null) {
            ((ViewGroup) this.launcherRoot.getParent()).removeView(this.launcherRoot);
        }
    }

    public void setBadgeCount(String str) {
        this.badgeCount.setVisibility(0);
        this.badgeCount.setText(str);
    }

    public void setLauncherColor(int i10, int i11) {
        Context context = this.badge.getContext();
        Drawable drawable = c.getDrawable(context, R.drawable.intercom_solid_circle);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i11, mode);
        Drawable newDrawable = drawable.getConstantState().newDrawable();
        newDrawable.setColorFilter(c.getColor(context, R.color.intercom_inbox_count_background), mode);
        BackgroundUtils.setBackground(this.badgeCount, newDrawable);
        BackgroundUtils.setBackground(this.badge, drawable);
        Drawable drawable2 = this.badge.getDrawable();
        if (drawable2 != null) {
            drawable2.setColorFilter(i10, mode);
        }
    }

    public void setLauncherLogo(AppConfig appConfig) {
        Context context = this.badge.getContext();
        int dpToPx = ScreenUtils.dpToPx(34.0f, context);
        IntercomCoilKt.loadIntercomImage(context, new C3622i.a(context).d(appConfig.getLauncherLogoUrl()).h(R.drawable.intercom_launcher_icon).B(this.badge).y(dpToPx, dpToPx).a());
    }

    public void updateBottomPadding(int i10) {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.launcherRoot.getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{marginLayoutParams.bottomMargin, i10});
        ofInt.setDuration(300);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.MarginLayoutParams marginLayoutParams = marginLayoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                DefaultLauncher.this.launcherRoot.setLayoutParams(marginLayoutParams);
            }
        });
        ofInt.start();
    }
}
