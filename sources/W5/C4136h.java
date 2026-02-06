package w5;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6496s;
import t7.C4049a;
import x5.C4165a;
import x5.C4170f;

/* renamed from: w5.h  reason: case insensitive filesystem */
public final class C4136h {

    /* renamed from: a  reason: collision with root package name */
    public static final C4136h f49186a = new C4136h();

    /* renamed from: w5.h$a */
    public static final class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        private final C4165a f49187a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference f49188b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference f49189c;

        /* renamed from: d  reason: collision with root package name */
        private final View.OnTouchListener f49190d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f49191e = true;

        public a(C4165a aVar, View view, View view2) {
            C6496s.h(aVar, "mapping");
            C6496s.h(view, "rootView");
            C6496s.h(view2, "hostView");
            this.f49187a = aVar;
            this.f49188b = new WeakReference(view2);
            this.f49189c = new WeakReference(view);
            this.f49190d = C4170f.h(view2);
        }

        public final boolean a() {
            return this.f49191e;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C6496s.h(view, "view");
            C6496s.h(motionEvent, "motionEvent");
            View view2 = (View) this.f49189c.get();
            View view3 = (View) this.f49188b.get();
            if (!(view2 == null || view3 == null || motionEvent.getAction() != 1)) {
                C4130b.d(this.f49187a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f49190d;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }
    }

    private C4136h() {
    }

    public static final a a(C4165a aVar, View view, View view2) {
        Class<C4136h> cls = C4136h.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(aVar, "mapping");
            C6496s.h(view, "rootView");
            C6496s.h(view2, "hostView");
            return new a(aVar, view, view2);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }
}
