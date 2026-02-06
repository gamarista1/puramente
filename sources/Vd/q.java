package vd;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.k;
import com.facebook.react.views.textinput.C3443j;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vd.C5260d;

public final class q extends C5260d {

    /* renamed from: R  reason: collision with root package name */
    public static final b f61925R = new b((DefaultConstructorMarker) null);

    /* renamed from: S  reason: collision with root package name */
    private static final a f61926S = new a();
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public boolean f61927O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public boolean f61928P;

    /* renamed from: Q  reason: collision with root package name */
    private e f61929Q = f61926S;

    public static final class a implements e {
        a() {
        }

        public boolean a() {
            return e.a.f(this);
        }

        public Boolean b(C5260d dVar) {
            return e.a.g(this, dVar);
        }

        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        public boolean d() {
            return e.a.h(this);
        }

        public boolean e(View view) {
            return e.a.b(this, view);
        }

        public Boolean f(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean b(View view, MotionEvent motionEvent) {
            if (!(view instanceof ViewGroup) || !((ViewGroup) view).onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }

        private b() {
        }
    }

    private static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        private final q f61930a;

        /* renamed from: b  reason: collision with root package name */
        private final C3443j f61931b;

        /* renamed from: c  reason: collision with root package name */
        private float f61932c;

        /* renamed from: d  reason: collision with root package name */
        private float f61933d;

        /* renamed from: e  reason: collision with root package name */
        private int f61934e;

        public c(q qVar, C3443j jVar) {
            C6496s.h(qVar, "handler");
            C6496s.h(jVar, "editText");
            this.f61930a = qVar;
            this.f61931b = jVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(jVar.getContext());
            this.f61934e = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        public boolean a() {
            return true;
        }

        public Boolean b(C5260d dVar) {
            boolean z10;
            C6496s.h(dVar, "handler");
            if (dVar.T() <= 0 || (dVar instanceof q)) {
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }

        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        public boolean d() {
            return true;
        }

        public boolean e(View view) {
            return e.a.b(this, view);
        }

        public Boolean f(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        public void g(MotionEvent motionEvent) {
            C6496s.h(motionEvent, "event");
            this.f61930a.k();
            this.f61931b.onTouchEvent(motionEvent);
            this.f61932c = motionEvent.getX();
            this.f61933d = motionEvent.getY();
        }

        public void h(MotionEvent motionEvent) {
            C6496s.h(motionEvent, "event");
            if (((motionEvent.getX() - this.f61932c) * (motionEvent.getX() - this.f61932c)) + ((motionEvent.getY() - this.f61933d) * (motionEvent.getY() - this.f61933d)) < ((float) this.f61934e)) {
                this.f61931b.R();
            }
        }
    }

    public static final class d extends C5260d.c {

        /* renamed from: d  reason: collision with root package name */
        public static final a f61935d = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private final Class f61936b = q.class;

        /* renamed from: c  reason: collision with root package name */
        private final String f61937c = "NativeViewGestureHandler";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public String d() {
            return this.f61937c;
        }

        public Class e() {
            return this.f61936b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public q a(Context context) {
            return new q();
        }

        /* renamed from: h */
        public wd.f c(q qVar) {
            C6496s.h(qVar, "handler");
            return new wd.f(qVar);
        }

        /* renamed from: i */
        public void f(q qVar, ReadableMap readableMap) {
            C6496s.h(qVar, "handler");
            C6496s.h(readableMap, "config");
            super.f(qVar, readableMap);
            if (readableMap.hasKey("shouldActivateOnStart")) {
                qVar.f61927O = readableMap.getBoolean("shouldActivateOnStart");
            }
            if (readableMap.hasKey("disallowInterruption")) {
                qVar.f61928P = readableMap.getBoolean("disallowInterruption");
            }
        }
    }

    public interface e {

        public static final class a {
            public static void a(e eVar, MotionEvent motionEvent) {
                C6496s.h(motionEvent, "event");
            }

            public static boolean b(e eVar, View view) {
                C6496s.h(view, "view");
                return view.isPressed();
            }

            public static boolean c(e eVar, MotionEvent motionEvent) {
                C6496s.h(motionEvent, "event");
                return true;
            }

            public static void d(e eVar, MotionEvent motionEvent) {
                C6496s.h(motionEvent, "event");
            }

            public static Boolean e(e eVar, View view, MotionEvent motionEvent) {
                C6496s.h(motionEvent, "event");
                if (view != null) {
                    return Boolean.valueOf(view.onTouchEvent(motionEvent));
                }
                return null;
            }

            public static boolean f(e eVar) {
                return false;
            }

            public static Boolean g(e eVar, C5260d dVar) {
                C6496s.h(dVar, "handler");
                return null;
            }

            public static boolean h(e eVar) {
                return false;
            }
        }

        boolean a();

        Boolean b(C5260d dVar);

        boolean c(MotionEvent motionEvent);

        boolean d();

        boolean e(View view);

        Boolean f(View view, MotionEvent motionEvent);

        void g(MotionEvent motionEvent);

        void h(MotionEvent motionEvent);
    }

    private static final class f implements e {
        public boolean a() {
            return e.a.f(this);
        }

        public Boolean b(C5260d dVar) {
            return e.a.g(this, dVar);
        }

        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        public boolean d() {
            return e.a.h(this);
        }

        public boolean e(View view) {
            return e.a.b(this, view);
        }

        public Boolean f(View view, MotionEvent motionEvent) {
            C6496s.h(motionEvent, "event");
            if (view != null) {
                return Boolean.valueOf(view.dispatchTouchEvent(motionEvent));
            }
            return null;
        }

        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    private static final class g implements e {
        public boolean a() {
            return true;
        }

        public Boolean b(C5260d dVar) {
            return e.a.g(this, dVar);
        }

        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        public boolean d() {
            return e.a.h(this);
        }

        public boolean e(View view) {
            return e.a.b(this, view);
        }

        public Boolean f(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    private static final class h implements e {

        /* renamed from: a  reason: collision with root package name */
        private final q f61938a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.react.views.swiperefresh.a f61939b;

        public h(q qVar, com.facebook.react.views.swiperefresh.a aVar) {
            C6496s.h(qVar, "handler");
            C6496s.h(aVar, "swipeRefreshLayout");
            this.f61938a = qVar;
            this.f61939b = aVar;
        }

        public boolean a() {
            return e.a.f(this);
        }

        public Boolean b(C5260d dVar) {
            return e.a.g(this, dVar);
        }

        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        public boolean d() {
            return true;
        }

        public boolean e(View view) {
            return e.a.b(this, view);
        }

        public Boolean f(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(android.view.MotionEvent r4) {
            /*
                r3 = this;
                java.lang.String r0 = "event"
                kotlin.jvm.internal.C6496s.h(r4, r0)
                com.facebook.react.views.swiperefresh.a r4 = r3.f61939b
                r0 = 0
                android.view.View r4 = r4.getChildAt(r0)
                boolean r0 = r4 instanceof android.widget.ScrollView
                r1 = 0
                if (r0 == 0) goto L_0x0014
                android.widget.ScrollView r4 = (android.widget.ScrollView) r4
                goto L_0x0015
            L_0x0014:
                r4 = r1
            L_0x0015:
                if (r4 != 0) goto L_0x0018
                return
            L_0x0018:
                vd.q r0 = r3.f61938a
                vd.i r0 = r0.P()
                if (r0 == 0) goto L_0x0043
                java.util.ArrayList r0 = r0.s(r4)
                if (r0 == 0) goto L_0x0043
                java.util.Iterator r0 = r0.iterator()
            L_0x002a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x003b
                java.lang.Object r1 = r0.next()
                vd.d r1 = (vd.C5260d) r1
                boolean r2 = r1 instanceof vd.q
                if (r2 == 0) goto L_0x002a
                goto L_0x0043
            L_0x003b:
                java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
                java.lang.String r0 = "Collection contains no element matching the predicate."
                r4.<init>(r0)
                throw r4
            L_0x0043:
                if (r1 == 0) goto L_0x0057
                int r0 = r1.S()
                r1 = 4
                if (r0 != r1) goto L_0x0057
                int r4 = r4.getScrollY()
                if (r4 <= 0) goto L_0x0057
                vd.q r4 = r3.f61938a
                r4.D()
            L_0x0057:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vd.q.h.g(android.view.MotionEvent):void");
        }

        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    private static final class i implements e {
        public boolean a() {
            return e.a.f(this);
        }

        public Boolean b(C5260d dVar) {
            C6496s.h(dVar, "handler");
            return Boolean.FALSE;
        }

        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        public boolean d() {
            return e.a.h(this);
        }

        public boolean e(View view) {
            C6496s.h(view, "view");
            return view instanceof k;
        }

        public Boolean f(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    public q() {
        G0(true);
    }

    private final void W0() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        e eVar = this.f61929Q;
        View W10 = W();
        C6496s.e(obtain);
        eVar.f(W10, obtain);
        obtain.recycle();
    }

    public boolean K0(C5260d dVar) {
        C6496s.h(dVar, "handler");
        return !this.f61928P;
    }

    public boolean L0(C5260d dVar) {
        C6496s.h(dVar, "handler");
        Boolean b10 = this.f61929Q.b(dVar);
        if (b10 != null) {
            return b10.booleanValue();
        }
        if (super.L0(dVar)) {
            return true;
        }
        if ((dVar instanceof q) && dVar.S() == 4 && ((q) dVar).f61928P) {
            return false;
        }
        boolean z10 = this.f61928P;
        int S10 = dVar.S();
        if ((S() != 4 || S10 != 4 || z10) && S() == 4 && !z10 && (!this.f61929Q.a() || dVar.T() > 0)) {
            return true;
        }
        return false;
    }

    public final boolean X0() {
        return this.f61928P;
    }

    /* access modifiers changed from: protected */
    public void j0() {
        W0();
    }

    /* access modifiers changed from: protected */
    public void k0() {
        W0();
    }

    /* access modifiers changed from: protected */
    public void l0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C6496s.h(motionEvent, "event");
        C6496s.h(motionEvent2, "sourceEvent");
        View W10 = W();
        C6496s.e(W10);
        Context context = W10.getContext();
        C6496s.g(context, "getContext(...)");
        boolean c10 = com.swmansion.gesturehandler.react.a.c(context);
        if ((W10 instanceof RNGestureHandlerButtonViewManager.a) && c10) {
            return;
        }
        if (motionEvent.getActionMasked() == 1) {
            if (S() != 0 || this.f61929Q.c(motionEvent)) {
                this.f61929Q.f(W10, motionEvent);
                if ((S() == 0 || S() == 2) && this.f61929Q.e(W10)) {
                    k();
                }
                if (S() == 0) {
                    q();
                } else {
                    B();
                }
            } else {
                q();
            }
            this.f61929Q.h(motionEvent);
        } else if (S() == 0 || S() == 2) {
            if (this.f61927O) {
                boolean unused = f61925R.b(W10, motionEvent);
                this.f61929Q.f(W10, motionEvent);
                k();
            } else if (f61925R.b(W10, motionEvent)) {
                this.f61929Q.f(W10, motionEvent);
                k();
            } else if (this.f61929Q.d()) {
                this.f61929Q.g(motionEvent);
            } else if (S() != 2 && this.f61929Q.c(motionEvent)) {
                p();
            }
        } else if (S() == 4) {
            this.f61929Q.f(W10, motionEvent);
        }
    }

    /* access modifiers changed from: protected */
    public void n0() {
        View W10 = W();
        if (W10 instanceof e) {
            this.f61929Q = (e) W10;
        } else if (W10 instanceof C3443j) {
            this.f61929Q = new c(this, (C3443j) W10);
        } else if (W10 instanceof com.facebook.react.views.swiperefresh.a) {
            this.f61929Q = new h(this, (com.facebook.react.views.swiperefresh.a) W10);
        } else if (W10 instanceof com.facebook.react.views.scroll.f) {
            this.f61929Q = new g();
        } else if (W10 instanceof com.facebook.react.views.scroll.e) {
            this.f61929Q = new g();
        } else if (W10 instanceof k) {
            this.f61929Q = new i();
        } else if (W10 instanceof com.facebook.react.views.view.e) {
            this.f61929Q = new f();
        }
    }

    /* access modifiers changed from: protected */
    public void o0() {
        this.f61929Q = f61926S;
    }

    public void s0() {
        super.s0();
        this.f61927O = false;
        this.f61928P = false;
        G0(true);
    }
}
