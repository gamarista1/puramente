package J;

import H0.C1197s;
import Q0.C1321d;
import Q0.Q;
import Q0.T;
import V0.h;
import W0.C1443k;
import W0.Q;
import W0.Z;
import W0.r;
import Y.C1510r0;
import Y.K0;
import Y.o1;
import androidx.compose.ui.platform.C1651m1;
import c1.d;
import c1.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import p0.e;
import r0.C2468U;
import r0.C2544x0;
import r0.Q1;
import yf.C6798l;

/* renamed from: J.y  reason: case insensitive filesystem */
public final class C1228y {

    /* renamed from: a  reason: collision with root package name */
    private I f3495a;

    /* renamed from: b  reason: collision with root package name */
    private final K0 f3496b;

    /* renamed from: c  reason: collision with root package name */
    private final C1651m1 f3497c;

    /* renamed from: d  reason: collision with root package name */
    private final C1443k f3498d = new C1443k();

    /* renamed from: e  reason: collision with root package name */
    private Z f3499e;

    /* renamed from: f  reason: collision with root package name */
    private final C1510r0 f3500f;

    /* renamed from: g  reason: collision with root package name */
    private final C1510r0 f3501g;

    /* renamed from: h  reason: collision with root package name */
    private C1197s f3502h;

    /* renamed from: i  reason: collision with root package name */
    private final C1510r0 f3503i;

    /* renamed from: j  reason: collision with root package name */
    private C1321d f3504j;

    /* renamed from: k  reason: collision with root package name */
    private final C1510r0 f3505k;

    /* renamed from: l  reason: collision with root package name */
    private final C1510r0 f3506l;

    /* renamed from: m  reason: collision with root package name */
    private final C1510r0 f3507m;

    /* renamed from: n  reason: collision with root package name */
    private final C1510r0 f3508n;

    /* renamed from: o  reason: collision with root package name */
    private final C1510r0 f3509o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3510p;

    /* renamed from: q  reason: collision with root package name */
    private final C1510r0 f3511q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C1224u f3512r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public C6798l f3513s;

    /* renamed from: t  reason: collision with root package name */
    private final C6798l f3514t;

    /* renamed from: u  reason: collision with root package name */
    private final C6798l f3515u;

    /* renamed from: v  reason: collision with root package name */
    private final Q1 f3516v;

    /* renamed from: w  reason: collision with root package name */
    private long f3517w;

    /* renamed from: x  reason: collision with root package name */
    private final C1510r0 f3518x;

    /* renamed from: y  reason: collision with root package name */
    private final C1510r0 f3519y;

    /* renamed from: J.y$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f3520a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1228y yVar) {
            super(1);
            this.f3520a = yVar;
        }

        public final void a(int i10) {
            this.f3520a.f3512r.d(i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).p());
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.y$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f3521a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1228y yVar) {
            super(1);
            this.f3521a = yVar;
        }

        public final void a(Q q10) {
            String str;
            String h10 = q10.h();
            C1321d w10 = this.f3521a.w();
            if (w10 != null) {
                str = w10.j();
            } else {
                str = null;
            }
            if (!C6496s.c(h10, str)) {
                this.f3521a.B(C1217m.None);
            }
            C1228y yVar = this.f3521a;
            Q.a aVar = Q0.Q.f5291b;
            yVar.I(aVar.a());
            this.f3521a.A(aVar.a());
            this.f3521a.f3513s.invoke(q10);
            this.f3521a.o().invalidate();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((W0.Q) obj);
            return C6514M.f71813a;
        }
    }

    public C1228y(I i10, K0 k02, C1651m1 m1Var) {
        this.f3495a = i10;
        this.f3496b = k02;
        this.f3497c = m1Var;
        Boolean bool = Boolean.FALSE;
        this.f3500f = u1.d(bool, (o1) null, 2, (Object) null);
        this.f3501g = u1.d(h.e(h.j((float) 0)), (o1) null, 2, (Object) null);
        this.f3503i = u1.d((Object) null, (o1) null, 2, (Object) null);
        this.f3505k = u1.d(C1217m.None, (o1) null, 2, (Object) null);
        this.f3506l = u1.d(bool, (o1) null, 2, (Object) null);
        this.f3507m = u1.d(bool, (o1) null, 2, (Object) null);
        this.f3508n = u1.d(bool, (o1) null, 2, (Object) null);
        this.f3509o = u1.d(bool, (o1) null, 2, (Object) null);
        this.f3510p = true;
        this.f3511q = u1.d(Boolean.TRUE, (o1) null, 2, (Object) null);
        this.f3512r = new C1224u(m1Var);
        this.f3513s = c.f3522a;
        this.f3514t = new b(this);
        this.f3515u = new a(this);
        this.f3516v = C2468U.a();
        this.f3517w = C2544x0.f25560b.h();
        Q.a aVar = Q0.Q.f5291b;
        this.f3518x = u1.d(Q0.Q.b(aVar.a()), (o1) null, 2, (Object) null);
        this.f3519y = u1.d(Q0.Q.b(aVar.a()), (o1) null, 2, (Object) null);
    }

    public final void A(long j10) {
        this.f3519y.setValue(Q0.Q.b(j10));
    }

    public final void B(C1217m mVar) {
        this.f3505k.setValue(mVar);
    }

    public final void C(boolean z10) {
        this.f3500f.setValue(Boolean.valueOf(z10));
    }

    public final void D(boolean z10) {
        this.f3511q.setValue(Boolean.valueOf(z10));
    }

    public final void E(Z z10) {
        this.f3499e = z10;
    }

    public final void F(C1197s sVar) {
        this.f3502h = sVar;
    }

    public final void G(a0 a0Var) {
        this.f3503i.setValue(a0Var);
        this.f3510p = false;
    }

    public final void H(float f10) {
        this.f3501g.setValue(h.e(f10));
    }

    public final void I(long j10) {
        this.f3518x.setValue(Q0.Q.b(j10));
    }

    public final void J(boolean z10) {
        this.f3509o.setValue(Boolean.valueOf(z10));
    }

    public final void K(boolean z10) {
        this.f3506l.setValue(Boolean.valueOf(z10));
    }

    public final void L(boolean z10) {
        this.f3508n.setValue(Boolean.valueOf(z10));
    }

    public final void M(boolean z10) {
        this.f3507m.setValue(Boolean.valueOf(z10));
    }

    public final void N(C1321d dVar, C1321d dVar2, T t10, boolean z10, d dVar3, h.b bVar, C6798l lVar, C1226w wVar, e eVar, long j10) {
        this.f3513s = lVar;
        this.f3517w = j10;
        C1224u uVar = this.f3512r;
        uVar.f(wVar);
        uVar.e(eVar);
        this.f3504j = dVar;
        I c10 = J.c(this.f3495a, dVar2, t10, dVar3, bVar, z10, 0, 0, 0, C6565s.n(), 448, (Object) null);
        if (this.f3495a != c10) {
            this.f3510p = true;
        }
        this.f3495a = c10;
    }

    public final long c() {
        return ((Q0.Q) this.f3519y.getValue()).r();
    }

    public final C1217m d() {
        return (C1217m) this.f3505k.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.f3500f.getValue()).booleanValue();
    }

    public final Q1 f() {
        return this.f3516v;
    }

    public final Z g() {
        return this.f3499e;
    }

    public final C1651m1 h() {
        return this.f3497c;
    }

    public final C1197s i() {
        C1197s sVar = this.f3502h;
        if (sVar == null || !sVar.G()) {
            return null;
        }
        return sVar;
    }

    public final a0 j() {
        return (a0) this.f3503i.getValue();
    }

    public final float k() {
        return ((c1.h) this.f3501g.getValue()).r();
    }

    public final C6798l l() {
        return this.f3515u;
    }

    public final C6798l m() {
        return this.f3514t;
    }

    public final C1443k n() {
        return this.f3498d;
    }

    public final K0 o() {
        return this.f3496b;
    }

    public final long p() {
        return this.f3517w;
    }

    public final long q() {
        return ((Q0.Q) this.f3518x.getValue()).r();
    }

    public final boolean r() {
        return ((Boolean) this.f3509o.getValue()).booleanValue();
    }

    public final boolean s() {
        return ((Boolean) this.f3506l.getValue()).booleanValue();
    }

    public final boolean t() {
        return ((Boolean) this.f3508n.getValue()).booleanValue();
    }

    public final boolean u() {
        return ((Boolean) this.f3507m.getValue()).booleanValue();
    }

    public final I v() {
        return this.f3495a;
    }

    public final C1321d w() {
        return this.f3504j;
    }

    public final boolean x() {
        if (!Q0.Q.h(q()) || !Q0.Q.h(c())) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        return ((Boolean) this.f3511q.getValue()).booleanValue();
    }

    public final boolean z() {
        return this.f3510p;
    }

    /* renamed from: J.y$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f3522a = new c();

        c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((W0.Q) obj);
            return C6514M.f71813a;
        }

        public final void a(W0.Q q10) {
        }
    }
}
