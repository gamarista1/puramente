package i5;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import c5.x;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o5.l;

final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    final Set f44202a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f44203b;

    class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f44204a;

        /* renamed from: i5.h$a$a  reason: collision with other inner class name */
        class C0679a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f44206a;

            C0679a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f44206a = onDrawListener;
            }

            public void run() {
                x.b().h();
                h.this.f44203b = true;
                h.b(a.this.f44204a, this.f44206a);
                h.this.f44202a.clear();
            }
        }

        a(View view) {
            this.f44204a = view;
        }

        public void onDraw() {
            l.v(new C0679a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    public void a(Activity activity) {
        if (!this.f44203b && this.f44202a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
