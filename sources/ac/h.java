package Ac;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f50241a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f50242b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f50243c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f50244d;

    private h(View view, Runnable runnable, Runnable runnable2) {
        this.f50242b = new AtomicReference(view);
        this.f50243c = runnable;
        this.f50244d = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    public boolean onPreDraw() {
        View view = (View) this.f50242b.getAndSet((Object) null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f50241a.post(this.f50243c);
        this.f50241a.postAtFrontOfQueue(this.f50244d);
        return true;
    }
}
