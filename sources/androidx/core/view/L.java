package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

public final class L implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f16018a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f16019b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f16020c;

    private L(View view, Runnable runnable) {
        this.f16018a = view;
        this.f16019b = view.getViewTreeObserver();
        this.f16020c = runnable;
    }

    public static L a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            L l10 = new L(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(l10);
            view.addOnAttachStateChangeListener(l10);
            return l10;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void b() {
        if (this.f16019b.isAlive()) {
            this.f16019b.removeOnPreDrawListener(this);
        } else {
            this.f16018a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f16018a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f16020c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f16019b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
