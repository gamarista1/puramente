package x0;

import Y.C1488g1;
import Y.C1505o0;
import Y.C1510r0;
import Y.o1;
import c1.t;
import kotlin.jvm.internal.C6498u;
import q0.C2427m;
import r0.C2547y0;
import t0.C2603d;
import t0.C2605f;
import w0.C2817c;
import yf.C6787a;

public final class q extends C2817c {

    /* renamed from: n  reason: collision with root package name */
    public static final int f28188n = 8;

    /* renamed from: g  reason: collision with root package name */
    private final C1510r0 f28189g = u1.d(C2427m.c(C2427m.f25341b.b()), (o1) null, 2, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    private final C1510r0 f28190h = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);

    /* renamed from: i  reason: collision with root package name */
    private final m f28191i;

    /* renamed from: j  reason: collision with root package name */
    private final C1505o0 f28192j;

    /* renamed from: k  reason: collision with root package name */
    private float f28193k;

    /* renamed from: l  reason: collision with root package name */
    private C2547y0 f28194l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f28195m;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f28196a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(q qVar) {
            super(0);
            this.f28196a = qVar;
        }

        public final void invoke() {
            if (this.f28196a.f28195m == this.f28196a.r()) {
                q qVar = this.f28196a;
                qVar.v(qVar.r() + 1);
            }
        }
    }

    public q(C2890c cVar) {
        m mVar = new m(cVar);
        mVar.o(new a(this));
        this.f28191i = mVar;
        this.f28192j = C1488g1.a(0);
        this.f28193k = 1.0f;
        this.f28195m = -1;
    }

    /* access modifiers changed from: private */
    public final int r() {
        return this.f28192j.b();
    }

    /* access modifiers changed from: private */
    public final void v(int i10) {
        this.f28192j.f(i10);
    }

    /* access modifiers changed from: protected */
    public boolean a(float f10) {
        this.f28193k = f10;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean e(C2547y0 y0Var) {
        this.f28194l = y0Var;
        return true;
    }

    public long k() {
        return s();
    }

    /* access modifiers changed from: protected */
    public void m(C2605f fVar) {
        m mVar = this.f28191i;
        C2547y0 y0Var = this.f28194l;
        if (y0Var == null) {
            y0Var = mVar.k();
        }
        if (!q() || fVar.getLayoutDirection() != t.Rtl) {
            mVar.i(fVar, this.f28193k, y0Var);
        } else {
            long y12 = fVar.y1();
            C2603d w12 = fVar.w1();
            long d10 = w12.d();
            w12.f().q();
            try {
                w12.e().e(-1.0f, 1.0f, y12);
                mVar.i(fVar, this.f28193k, y0Var);
            } finally {
                w12.f().h();
                w12.h(d10);
            }
        }
        this.f28195m = r();
    }

    public final boolean q() {
        return ((Boolean) this.f28190h.getValue()).booleanValue();
    }

    public final long s() {
        return ((C2427m) this.f28189g.getValue()).o();
    }

    public final void t(boolean z10) {
        this.f28190h.setValue(Boolean.valueOf(z10));
    }

    public final void u(C2547y0 y0Var) {
        this.f28191i.n(y0Var);
    }

    public final void w(String str) {
        this.f28191i.p(str);
    }

    public final void x(long j10) {
        this.f28189g.setValue(C2427m.c(j10));
    }

    public final void y(long j10) {
        this.f28191i.q(j10);
    }
}
