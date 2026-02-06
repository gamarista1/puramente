package androidx.compose.foundation;

import J0.C1252s;
import J0.h0;
import J0.i0;
import J0.r;
import c1.t;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import q0.C2427m;
import r0.C2514n0;
import r0.C2544x0;
import r0.C2547y0;
import r0.O1;
import r0.P1;
import r0.a2;
import r0.g2;
import t0.C2602c;
import t0.C2605f;
import t0.C2606g;
import yf.C6787a;

final class c extends i.c implements r, h0 {

    /* renamed from: n  reason: collision with root package name */
    private long f12513n;

    /* renamed from: o  reason: collision with root package name */
    private C2514n0 f12514o;

    /* renamed from: p  reason: collision with root package name */
    private float f12515p;

    /* renamed from: q  reason: collision with root package name */
    private g2 f12516q;

    /* renamed from: r  reason: collision with root package name */
    private long f12517r;

    /* renamed from: s  reason: collision with root package name */
    private t f12518s;

    /* renamed from: t  reason: collision with root package name */
    private O1 f12519t;

    /* renamed from: u  reason: collision with root package name */
    private g2 f12520u;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f12521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f12522b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2602c f12523c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(N n10, c cVar, C2602c cVar2) {
            super(0);
            this.f12521a = n10;
            this.f12522b = cVar;
            this.f12523c = cVar2;
        }

        public final void invoke() {
            this.f12521a.f71759a = this.f12522b.o2().m12createOutlinePq9zytI(this.f12523c.d(), this.f12523c.getLayoutDirection(), this.f12523c);
        }
    }

    public /* synthetic */ c(long j10, C2514n0 n0Var, float f10, g2 g2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, n0Var, f10, g2Var);
    }

    private final void l2(C2602c cVar) {
        O1 n22 = n2(cVar);
        if (!C2544x0.q(this.f12513n, C2544x0.f25560b.h())) {
            P1.e(cVar, n22, this.f12513n, 0.0f, (C2606g) null, (C2547y0) null, 0, 60, (Object) null);
        }
        C2514n0 n0Var = this.f12514o;
        if (n0Var != null) {
            P1.c(cVar, n22, n0Var, this.f12515p, (C2606g) null, (C2547y0) null, 0, 56, (Object) null);
        }
    }

    private final void m2(C2602c cVar) {
        if (!C2544x0.q(this.f12513n, C2544x0.f25560b.h())) {
            C2605f.c0(cVar, this.f12513n, 0, 0, 0.0f, (C2606g) null, (C2547y0) null, 0, 126, (Object) null);
        }
        C2514n0 n0Var = this.f12514o;
        if (n0Var != null) {
            C2605f.c1(cVar, n0Var, 0, 0, this.f12515p, (C2606g) null, (C2547y0) null, 0, 118, (Object) null);
        }
    }

    private final O1 n2(C2602c cVar) {
        N n10 = new N();
        if (!C2427m.h(cVar.d(), this.f12517r) || cVar.getLayoutDirection() != this.f12518s || !C6496s.c(this.f12520u, this.f12516q)) {
            i0.a(this, new a(n10, this, cVar));
        } else {
            O1 o12 = this.f12519t;
            C6496s.e(o12);
            n10.f71759a = o12;
        }
        this.f12519t = (O1) n10.f71759a;
        this.f12517r = cVar.d();
        this.f12518s = cVar.getLayoutDirection();
        this.f12520u = this.f12516q;
        Object obj = n10.f71759a;
        C6496s.e(obj);
        return (O1) obj;
    }

    public void A0() {
        this.f12517r = C2427m.f25341b.a();
        this.f12518s = null;
        this.f12519t = null;
        this.f12520u = null;
        C1252s.a(this);
    }

    public final void O0(g2 g2Var) {
        this.f12516q = g2Var;
    }

    public final void c(float f10) {
        this.f12515p = f10;
    }

    public final g2 o2() {
        return this.f12516q;
    }

    public final void p2(C2514n0 n0Var) {
        this.f12514o = n0Var;
    }

    public final void q2(long j10) {
        this.f12513n = j10;
    }

    public void u(C2602c cVar) {
        if (this.f12516q == a2.a()) {
            m2(cVar);
        } else {
            l2(cVar);
        }
        cVar.H1();
    }

    private c(long j10, C2514n0 n0Var, float f10, g2 g2Var) {
        this.f12513n = j10;
        this.f12514o = n0Var;
        this.f12515p = f10;
        this.f12516q = g2Var;
        this.f12517r = C2427m.f25341b.a();
    }
}
