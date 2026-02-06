package J0;

import H0.C;
import H0.C1180a;
import H0.C1197s;
import H0.E;
import H0.G;
import J0.L;
import c1.n;
import c1.r;
import c1.s;
import c1.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

public abstract class Q extends P implements E {

    /* renamed from: p  reason: collision with root package name */
    private final C1235c0 f3724p;

    /* renamed from: q  reason: collision with root package name */
    private long f3725q = n.f19226b.a();

    /* renamed from: r  reason: collision with root package name */
    private Map f3726r;

    /* renamed from: s  reason: collision with root package name */
    private final C f3727s = new C(this);

    /* renamed from: t  reason: collision with root package name */
    private G f3728t;

    /* renamed from: u  reason: collision with root package name */
    private final Map f3729u = new LinkedHashMap();

    public Q(C1235c0 c0Var) {
        this.f3724p = c0Var;
    }

    private final void d2(long j10) {
        if (!n.i(J1(), j10)) {
            g2(j10);
            L.a H10 = A1().U().H();
            if (H10 != null) {
                H10.M1();
            }
            L1(this.f3724p);
        }
        if (!O1()) {
            q1(E1());
        }
    }

    /* access modifiers changed from: private */
    public final void h2(G g10) {
        C6514M m10;
        Map map;
        if (g10 != null) {
            i1(s.a(g10.e(), g10.d()));
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            i1(r.f19235b.a());
        }
        if (!C6496s.c(this.f3728t, g10) && g10 != null && ((((map = this.f3726r) != null && !map.isEmpty()) || !g10.p().isEmpty()) && !C6496s.c(g10.p(), this.f3726r))) {
            W1().p().m();
            Map map2 = this.f3726r;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.f3726r = map2;
            }
            map2.clear();
            map2.putAll(g10.p());
        }
        this.f3728t = g10;
    }

    public G A1() {
        return this.f3724p.A1();
    }

    public C1197s C1() {
        return this.f3727s;
    }

    public boolean D1() {
        if (this.f3728t != null) {
            return true;
        }
        return false;
    }

    public G E1() {
        G g10 = this.f3728t;
        if (g10 != null) {
            return g10;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    public P F1() {
        C1235c0 F22 = this.f3724p.F2();
        if (F22 != null) {
            return F22.z2();
        }
        return null;
    }

    public long J1() {
        return this.f3725q;
    }

    public void R1() {
        f1(J1(), 0.0f, (C6798l) null);
    }

    public C1232b W1() {
        C1232b C10 = this.f3724p.A1().U().C();
        C6496s.e(C10);
        return C10;
    }

    public final int X1(C1180a aVar) {
        Integer num = (Integer) this.f3729u.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public final Map Y1() {
        return this.f3729u;
    }

    public final long Z1() {
        return W0();
    }

    public Object a() {
        return this.f3724p.a();
    }

    public final C1235c0 a2() {
        return this.f3724p;
    }

    public final C b2() {
        return this.f3727s;
    }

    /* access modifiers changed from: protected */
    public void c2() {
        E1().q();
    }

    public abstract int e0(int i10);

    public final void e2(long j10) {
        d2(n.n(j10, Q0()));
    }

    /* access modifiers changed from: protected */
    public final void f1(long j10, float f10, C6798l lVar) {
        d2(j10);
        if (!P1()) {
            c2();
        }
    }

    public final long f2(Q q10, boolean z10) {
        long a10 = n.f19226b.a();
        Q q11 = this;
        while (!C6496s.c(q11, q10)) {
            if (!q11.N1() || !z10) {
                a10 = n.n(a10, q11.J1());
            }
            C1235c0 F22 = q11.f3724p.F2();
            C6496s.e(F22);
            q11 = F22.z2();
            C6496s.e(q11);
        }
        return a10;
    }

    public void g2(long j10) {
        this.f3725q = j10;
    }

    public float getDensity() {
        return this.f3724p.getDensity();
    }

    public t getLayoutDirection() {
        return this.f3724p.getLayoutDirection();
    }

    public boolean r0() {
        return true;
    }

    public float r1() {
        return this.f3724p.r1();
    }

    public abstract int s(int i10);

    public abstract int s0(int i10);

    public abstract int t0(int i10);

    public P z1() {
        C1235c0 E22 = this.f3724p.E2();
        if (E22 != null) {
            return E22.z2();
        }
        return null;
    }
}
