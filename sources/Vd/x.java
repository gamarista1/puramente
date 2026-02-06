package vd;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vd.C5260d;
import vd.w;
import wd.i;

public final class x extends C5260d {

    /* renamed from: U  reason: collision with root package name */
    public static final a f62001U = new a((DefaultConstructorMarker) null);

    /* renamed from: O  reason: collision with root package name */
    private w f62002O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public double f62003P;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public double f62004Q;

    /* renamed from: R  reason: collision with root package name */
    private float f62005R = Float.NaN;

    /* renamed from: S  reason: collision with root package name */
    private float f62006S = Float.NaN;

    /* renamed from: T  reason: collision with root package name */
    private final w.a f62007T = new c(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends C5260d.c {

        /* renamed from: b  reason: collision with root package name */
        private final Class f62008b = x.class;

        /* renamed from: c  reason: collision with root package name */
        private final String f62009c = "RotationGestureHandler";

        public String d() {
            return this.f62009c;
        }

        public Class e() {
            return this.f62008b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public x a(Context context) {
            return new x();
        }

        /* renamed from: h */
        public i c(x xVar) {
            C6496s.h(xVar, "handler");
            return new i(xVar);
        }
    }

    public static final class c implements w.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f62010a;

        c(x xVar) {
            this.f62010a = xVar;
        }

        public boolean a(w wVar) {
            C6496s.h(wVar, "detector");
            double Y02 = this.f62010a.Y0();
            x xVar = this.f62010a;
            xVar.f62003P = xVar.Y0() + wVar.d();
            long e10 = wVar.e();
            if (e10 > 0) {
                x xVar2 = this.f62010a;
                xVar2.f62004Q = (xVar2.Y0() - Y02) / ((double) e10);
            }
            if (Math.abs(this.f62010a.Y0()) < 0.08726646259971647d || this.f62010a.S() != 2) {
                return true;
            }
            this.f62010a.k();
            return true;
        }

        public boolean b(w wVar) {
            C6496s.h(wVar, "detector");
            return true;
        }

        public void c(w wVar) {
            C6496s.h(wVar, "detector");
            this.f62010a.B();
        }
    }

    public final float W0() {
        return this.f62005R;
    }

    public final float X0() {
        return this.f62006S;
    }

    public final double Y0() {
        return this.f62003P;
    }

    public final double Z0() {
        return this.f62004Q;
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
            t0();
            this.f62002O = new w(this.f62007T);
            this.f62005R = motionEvent.getX();
            this.f62006S = motionEvent.getY();
            p();
        }
        w wVar = this.f62002O;
        if (wVar != null) {
            wVar.f(motionEvent2);
        }
        w wVar2 = this.f62002O;
        if (wVar2 != null) {
            PointF Q02 = Q0(new PointF(wVar2.b(), wVar2.c()));
            this.f62005R = Q02.x;
            this.f62006S = Q02.y;
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
        this.f62002O = null;
        this.f62005R = Float.NaN;
        this.f62006S = Float.NaN;
        t0();
    }

    public void t0() {
        this.f62004Q = 0.0d;
        this.f62003P = 0.0d;
    }
}
