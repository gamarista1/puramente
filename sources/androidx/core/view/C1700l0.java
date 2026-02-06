package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.l0  reason: case insensitive filesystem */
public final class C1700l0 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f16100a;

    /* renamed from: androidx.core.view.l0$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1702m0 f16101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f16102b;

        a(C1702m0 m0Var, View view) {
            this.f16101a = m0Var;
            this.f16102b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f16101a.a(this.f16102b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f16101a.b(this.f16102b);
        }

        public void onAnimationStart(Animator animator) {
            this.f16101a.c(this.f16102b);
        }
    }

    C1700l0(View view) {
        this.f16100a = new WeakReference(view);
    }

    private void i(View view, C1702m0 m0Var) {
        if (m0Var != null) {
            view.animate().setListener(new a(m0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public C1700l0 b(float f10) {
        View view = (View) this.f16100a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f16100a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f16100a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public C1700l0 f(long j10) {
        View view = (View) this.f16100a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public C1700l0 g(Interpolator interpolator) {
        View view = (View) this.f16100a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C1700l0 h(C1702m0 m0Var) {
        View view = (View) this.f16100a.get();
        if (view != null) {
            i(view, m0Var);
        }
        return this;
    }

    public C1700l0 j(long j10) {
        View view = (View) this.f16100a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public C1700l0 k(C1706o0 o0Var) {
        C1698k0 k0Var;
        View view = (View) this.f16100a.get();
        if (view != null) {
            if (o0Var != null) {
                k0Var = new C1698k0(o0Var, view);
            } else {
                k0Var = null;
            }
            view.animate().setUpdateListener(k0Var);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f16100a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C1700l0 m(float f10) {
        View view = (View) this.f16100a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
