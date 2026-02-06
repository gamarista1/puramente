package androidx.compose.ui.draw;

import H0.C1187h;
import H0.C1193n;
import H0.C1194o;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import H0.c0;
import J0.B;
import J0.r;
import c1.b;
import c1.n;
import c1.s;
import java.util.Map;
import k0.c;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import q0.C2427m;
import q0.C2428n;
import r0.C2547y0;
import t0.C2602c;
import w0.C2817c;
import yf.C6798l;

final class e extends i.c implements B, r {

    /* renamed from: n  reason: collision with root package name */
    private C2817c f13272n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13273o;

    /* renamed from: p  reason: collision with root package name */
    private c f13274p;

    /* renamed from: q  reason: collision with root package name */
    private C1187h f13275q;

    /* renamed from: r  reason: collision with root package name */
    private float f13276r;

    /* renamed from: s  reason: collision with root package name */
    private C2547y0 f13277s;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f13278a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10) {
            super(1);
            this.f13278a = u10;
        }

        public final void a(U.a aVar) {
            U.a.l(aVar, this.f13278a, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public e(C2817c cVar, boolean z10, c cVar2, C1187h hVar, float f10, C2547y0 y0Var) {
        this.f13272n = cVar;
        this.f13273o = z10;
        this.f13274p = cVar2;
        this.f13275q = hVar;
        this.f13276r = f10;
        this.f13277s = y0Var;
    }

    private final long l2(long j10) {
        float f10;
        float f11;
        if (!o2()) {
            return j10;
        }
        if (!q2(this.f13272n.k())) {
            f10 = C2427m.k(j10);
        } else {
            f10 = C2427m.k(this.f13272n.k());
        }
        if (!p2(this.f13272n.k())) {
            f11 = C2427m.i(j10);
        } else {
            f11 = C2427m.i(this.f13272n.k());
        }
        long a10 = C2428n.a(f10, f11);
        if (C2427m.k(j10) == 0.0f || C2427m.i(j10) == 0.0f) {
            return C2427m.f25341b.b();
        }
        return c0.b(a10, this.f13275q.a(a10, j10));
    }

    private final boolean o2() {
        if (!this.f13273o || this.f13272n.k() == 9205357640488583168L) {
            return false;
        }
        return true;
    }

    private final boolean p2(long j10) {
        if (!C2427m.h(j10, C2427m.f25341b.a())) {
            float i10 = C2427m.i(j10);
            if (Float.isInfinite(i10) || Float.isNaN(i10)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean q2(long j10) {
        if (!C2427m.h(j10, C2427m.f25341b.a())) {
            float k10 = C2427m.k(j10);
            if (Float.isInfinite(k10) || Float.isNaN(k10)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final long r2(long j10) {
        boolean z10;
        int i10;
        int i11;
        boolean z11 = false;
        if (!b.h(j10) || !b.g(j10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (b.j(j10) && b.i(j10)) {
            z11 = true;
        }
        if ((o2() || !z10) && !z11) {
            long k10 = this.f13272n.k();
            if (q2(k10)) {
                i10 = Math.round(C2427m.k(k10));
            } else {
                i10 = b.n(j10);
            }
            if (p2(k10)) {
                i11 = Math.round(C2427m.i(k10));
            } else {
                i11 = b.m(j10);
            }
            long l22 = l2(C2428n.a((float) c1.c.i(j10, i10), (float) c1.c.h(j10, i11)));
            return b.d(j10, c1.c.i(j10, Math.round(C2427m.k(l22))), 0, c1.c.h(j10, Math.round(C2427m.i(l22))), 0, 10, (Object) null);
        }
        return b.d(j10, b.l(j10), 0, b.k(j10), 0, 10, (Object) null);
    }

    public int B(C1194o oVar, C1193n nVar, int i10) {
        if (!o2()) {
            return nVar.s(i10);
        }
        long r22 = r2(c1.c.b(0, i10, 0, 0, 13, (Object) null));
        return Math.max(b.m(r22), nVar.s(i10));
    }

    public int D(C1194o oVar, C1193n nVar, int i10) {
        if (!o2()) {
            return nVar.e0(i10);
        }
        long r22 = r2(c1.c.b(0, i10, 0, 0, 13, (Object) null));
        return Math.max(b.m(r22), nVar.e0(i10));
    }

    public int G(C1194o oVar, C1193n nVar, int i10) {
        if (!o2()) {
            return nVar.t0(i10);
        }
        long r22 = r2(c1.c.b(0, 0, 0, i10, 7, (Object) null));
        return Math.max(b.n(r22), nVar.t0(i10));
    }

    public boolean Q1() {
        return false;
    }

    public final void c(float f10) {
        this.f13276r = f10;
    }

    public final C2817c m2() {
        return this.f13272n;
    }

    public final boolean n2() {
        return this.f13273o;
    }

    public G o(H h10, E e10, long j10) {
        U v02 = e10.v0(r2(j10));
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new a(v02), 4, (Object) null);
    }

    public final void s2(c cVar) {
        this.f13274p = cVar;
    }

    public final void t2(C2547y0 y0Var) {
        this.f13277s = y0Var;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f13272n + ", sizeToIntrinsics=" + this.f13273o + ", alignment=" + this.f13274p + ", alpha=" + this.f13276r + ", colorFilter=" + this.f13277s + ')';
    }

    /* JADX INFO: finally extract failed */
    public void u(C2602c cVar) {
        float f10;
        float f11;
        long j10;
        long k10 = this.f13272n.k();
        if (q2(k10)) {
            f10 = C2427m.k(k10);
        } else {
            f10 = C2427m.k(cVar.d());
        }
        if (p2(k10)) {
            f11 = C2427m.i(k10);
        } else {
            f11 = C2427m.i(cVar.d());
        }
        long a10 = C2428n.a(f10, f11);
        if (C2427m.k(cVar.d()) == 0.0f || C2427m.i(cVar.d()) == 0.0f) {
            j10 = C2427m.f25341b.b();
        } else {
            j10 = c0.b(a10, this.f13275q.a(a10, cVar.d()));
        }
        long j11 = j10;
        long a11 = this.f13274p.a(s.a(Math.round(C2427m.k(j11)), Math.round(C2427m.i(j11))), s.a(Math.round(C2427m.k(cVar.d())), Math.round(C2427m.i(cVar.d()))), cVar.getLayoutDirection());
        float j12 = (float) n.j(a11);
        float k11 = (float) n.k(a11);
        cVar.w1().e().d(j12, k11);
        try {
            this.f13272n.j(cVar, j11, this.f13276r, this.f13277s);
            cVar.w1().e().d(-j12, -k11);
            cVar.H1();
        } catch (Throwable th2) {
            cVar.w1().e().d(-j12, -k11);
            throw th2;
        }
    }

    public final void u2(C1187h hVar) {
        this.f13275q = hVar;
    }

    public final void v2(C2817c cVar) {
        this.f13272n = cVar;
    }

    public final void w2(boolean z10) {
        this.f13273o = z10;
    }

    public int x(C1194o oVar, C1193n nVar, int i10) {
        if (!o2()) {
            return nVar.s0(i10);
        }
        long r22 = r2(c1.c.b(0, 0, 0, i10, 7, (Object) null));
        return Math.max(b.n(r22), nVar.s0(i10));
    }
}
