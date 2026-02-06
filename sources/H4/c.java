package H4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class c extends ValueAnimator {

    /* renamed from: a  reason: collision with root package name */
    private final Set f31655a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private final Set f31656b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    private final Set f31657c = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    public void a() {
        for (Animator.AnimatorListener onAnimationCancel : this.f31656b) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f31656b.add(animatorListener);
    }

    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f31657c.add(animatorPauseListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f31655a.add(animatorUpdateListener);
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f31656b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        for (Animator.AnimatorPauseListener onAnimationPause : this.f31657c) {
            onAnimationPause.onAnimationPause(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        for (Animator.AnimatorListener onAnimationRepeat : this.f31656b) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        for (Animator.AnimatorPauseListener onAnimationResume : this.f31657c) {
            onAnimationResume.onAnimationResume(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f31656b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z10);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f31655a) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public void removeAllListeners() {
        this.f31656b.clear();
    }

    public void removeAllUpdateListeners() {
        this.f31655a.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f31656b.remove(animatorListener);
    }

    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f31657c.remove(animatorPauseListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f31655a.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
