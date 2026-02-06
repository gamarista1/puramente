package vd;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.swmansion.gesturehandler.react.k;
import com.swmansion.gesturehandler.react.o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vd.C5260d;
import wd.c;

public final class m extends C5260d {

    /* renamed from: R  reason: collision with root package name */
    public static final a f61901R = new a((DefaultConstructorMarker) null);

    /* renamed from: S  reason: collision with root package name */
    private static final o f61902S = new o();

    /* renamed from: O  reason: collision with root package name */
    private Handler f61903O;

    /* renamed from: P  reason: collision with root package name */
    private Runnable f61904P = new l(this);

    /* renamed from: Q  reason: collision with root package name */
    private z f61905Q = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, (DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends C5260d.c {

        /* renamed from: b  reason: collision with root package name */
        private final Class f61906b = m.class;

        /* renamed from: c  reason: collision with root package name */
        private final String f61907c = "HoverGestureHandler";

        public String d() {
            return this.f61907c;
        }

        public Class e() {
            return this.f61906b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public m a(Context context) {
            return new m();
        }

        /* renamed from: h */
        public c c(m mVar) {
            C6496s.h(mVar, "handler");
            return new c(mVar);
        }
    }

    private final void V0() {
        int S10 = S();
        if (S10 == 0) {
            q();
        } else if (S10 == 2) {
            D();
        } else if (S10 == 4) {
            B();
        }
    }

    /* access modifiers changed from: private */
    public static final void W0(m mVar) {
        mVar.V0();
    }

    private final boolean Y0(C5260d dVar) {
        View W10 = dVar.W();
        while (W10 != null) {
            if (C6496s.c(W10, W())) {
                return true;
            }
            ViewParent parent = W10.getParent();
            if (parent instanceof View) {
                W10 = (View) parent;
            } else {
                W10 = null;
            }
        }
        return false;
    }

    private final Boolean Z0(View view, View view2, View view3) {
        if (C6496s.c(view3, view2)) {
            return Boolean.TRUE;
        }
        if (C6496s.c(view3, view)) {
            return Boolean.FALSE;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Boolean Z02 = Z0(view, view2, f61902S.c(viewGroup, i10));
            if (Z02 != null) {
                return Z02;
            }
        }
        return null;
    }

    static /* synthetic */ Boolean a1(m mVar, View view, View view2, View view3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            view3 = view.getRootView();
        }
        return mVar.Z0(view, view2, view3);
    }

    public boolean K0(C5260d dVar) {
        C6496s.h(dVar, "handler");
        if (!(dVar instanceof m) || ((m) dVar).Y0(this)) {
            return super.K0(dVar);
        }
        View W10 = dVar.W();
        C6496s.e(W10);
        View W11 = W();
        C6496s.e(W11);
        Boolean a12 = a1(this, W10, W11, (View) null, 4, (Object) null);
        C6496s.e(a12);
        return a12.booleanValue();
    }

    public boolean L0(C5260d dVar) {
        C6496s.h(dVar, "handler");
        if ((!(dVar instanceof m) || (!Y0(dVar) && !((m) dVar).Y0(this))) && !(dVar instanceof k.b)) {
            return super.L0(dVar);
        }
        return true;
    }

    public boolean M0(C5260d dVar) {
        C6496s.h(dVar, "handler");
        if ((dVar instanceof m) && !Y0(dVar) && !((m) dVar).Y0(this)) {
            View W10 = W();
            C6496s.e(W10);
            View W11 = dVar.W();
            C6496s.e(W11);
            Boolean a12 = a1(this, W10, W11, (View) null, 4, (Object) null);
            if (a12 != null) {
                return a12.booleanValue();
            }
        }
        return super.M0(dVar);
    }

    public final z X0() {
        return this.f61905Q;
    }

    /* access modifiers changed from: protected */
    public void l0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C6496s.h(motionEvent, "event");
        C6496s.h(motionEvent2, "sourceEvent");
        if (motionEvent.getAction() == 0) {
            Handler handler = this.f61903O;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            this.f61903O = null;
        } else if (motionEvent.getAction() == 1 && !f0()) {
            V0();
        }
    }

    /* access modifiers changed from: protected */
    public void m0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C6496s.h(motionEvent, "event");
        C6496s.h(motionEvent2, "sourceEvent");
        if (motionEvent.getAction() == 10) {
            if (this.f61903O == null) {
                this.f61903O = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.f61903O;
            C6496s.e(handler);
            handler.postDelayed(this.f61904P, 4);
        } else if (!f0()) {
            V0();
        } else if (S() == 4 && motionEvent.getToolType(0) == 2) {
            this.f61905Q = z.f62036f.a(motionEvent);
        } else if (S() != 0) {
        } else {
            if (motionEvent.getAction() == 7 || motionEvent.getAction() == 9) {
                p();
                k();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o0() {
        super.o0();
        this.f61905Q = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, (DefaultConstructorMarker) null);
    }
}
