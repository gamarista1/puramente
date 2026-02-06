package Ac;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class e implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f50234a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f50235b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f50236c;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(e.this);
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private e(View view, Runnable runnable) {
        this.f50235b = new AtomicReference(view);
        this.f50236c = runnable;
    }

    private static boolean b(View view) {
        if (!view.getViewTreeObserver().isAlive() || !c(view)) {
            return false;
        }
        return true;
    }

    private static boolean c(View view) {
        return view.isAttachedToWindow();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    public static void e(View view, Runnable runnable) {
        e eVar = new e(view, runnable);
        if (Build.VERSION.SDK_INT >= 26 || b(view)) {
            view.getViewTreeObserver().addOnDrawListener(eVar);
        } else {
            view.addOnAttachStateChangeListener(new a());
        }
    }

    public void onDraw() {
        View view = (View) this.f50235b.getAndSet((Object) null);
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new d(this, view));
            this.f50234a.postAtFrontOfQueue(this.f50236c);
        }
    }
}
