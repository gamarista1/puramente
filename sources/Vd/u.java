package vd;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.C6496s;
import vd.C5260d;
import vd.y;
import wd.h;

public final class u extends C5260d {
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public double f61974O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public double f61975P;

    /* renamed from: Q  reason: collision with root package name */
    private float f61976Q = Float.NaN;

    /* renamed from: R  reason: collision with root package name */
    private float f61977R = Float.NaN;

    /* renamed from: S  reason: collision with root package name */
    private y f61978S;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public float f61979T;
    /* access modifiers changed from: private */

    /* renamed from: U  reason: collision with root package name */
    public float f61980U;

    /* renamed from: V  reason: collision with root package name */
    private final y.b f61981V = new b(this);

    public static final class a extends C5260d.c {

        /* renamed from: b  reason: collision with root package name */
        private final Class f61982b = u.class;

        /* renamed from: c  reason: collision with root package name */
        private final String f61983c = "PinchGestureHandler";

        public String d() {
            return this.f61983c;
        }

        public Class e() {
            return this.f61982b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public u a(Context context) {
            return new u();
        }

        /* renamed from: h */
        public h c(u uVar) {
            C6496s.h(uVar, "handler");
            return new h(uVar);
        }
    }

    public static final class b implements y.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f61984a;

        b(u uVar) {
            this.f61984a = uVar;
        }

        public boolean a(y yVar) {
            C6496s.h(yVar, "detector");
            this.f61984a.f61979T = yVar.d();
            return true;
        }

        public boolean b(y yVar) {
            C6496s.h(yVar, "detector");
            double b12 = this.f61984a.b1();
            u uVar = this.f61984a;
            uVar.f61974O = uVar.b1() * ((double) yVar.g());
            double i10 = yVar.i();
            if (i10 > 0.0d) {
                u uVar2 = this.f61984a;
                uVar2.f61975P = (uVar2.b1() - b12) / i10;
            }
            if (Math.abs(this.f61984a.f61979T - yVar.d()) < this.f61984a.f61980U || this.f61984a.S() != 2) {
                return true;
            }
            this.f61984a.k();
            return true;
        }

        public void c(y yVar) {
            C6496s.h(yVar, "detector");
        }
    }

    public final float Z0() {
        return this.f61976Q;
    }

    public final float a1() {
        return this.f61977R;
    }

    public final double b1() {
        return this.f61974O;
    }

    public final double c1() {
        return this.f61975P;
    }

    public void l(boolean z10) {
        if (S() != 4) {
            t0();
        }
        super.l(z10);
    }

    /* access modifiers changed from: protected */
    public void l0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C6496s.h(motionEvent, "event");
        C6496s.h(motionEvent2, "sourceEvent");
        if (S() == 0) {
            View W10 = W();
            C6496s.e(W10);
            Context context = W10.getContext();
            t0();
            this.f61978S = new y(context, this.f61981V);
            this.f61980U = (float) ViewConfiguration.get(context).getScaledTouchSlop();
            this.f61976Q = motionEvent.getX();
            this.f61977R = motionEvent.getY();
            p();
        }
        y yVar = this.f61978S;
        if (yVar != null) {
            yVar.k(motionEvent2);
        }
        y yVar2 = this.f61978S;
        if (yVar2 != null) {
            PointF Q02 = Q0(new PointF(yVar2.e(), yVar2.f()));
            this.f61976Q = Q02.x;
            this.f61977R = Q02.y;
        }
        if (motionEvent2.getActionMasked() != 1) {
            return;
        }
        if (S() == 4) {
            B();
        } else {
            D();
        }
    }

    /* access modifiers changed from: protected */
    public void o0() {
        this.f61978S = null;
        this.f61976Q = Float.NaN;
        this.f61977R = Float.NaN;
        t0();
    }

    public void t0() {
        this.f61975P = 0.0d;
        this.f61974O = 1.0d;
    }
}
