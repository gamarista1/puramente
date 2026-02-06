package H0;

import G0.a;
import J0.C1235c0;
import J0.Q;
import c1.n;
import c1.o;
import c1.s;
import kotlin.jvm.internal.C6496s;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;

public final class C implements C1197s {

    /* renamed from: a  reason: collision with root package name */
    private final Q f2532a;

    public C(Q q10) {
        this.f2532a = q10;
    }

    private final long c() {
        Q a10 = D.a(this.f2532a);
        C1197s C12 = a10.C1();
        C2421g.a aVar = C2421g.f25320b;
        return C2421g.q(W(C12, aVar.c()), a().W(a10.a2(), aVar.c()));
    }

    public long A0(C1197s sVar, long j10, boolean z10) {
        if (sVar instanceof C) {
            Q q10 = ((C) sVar).f2532a;
            q10.a2().S2();
            Q z22 = a().q2(q10.a2()).z2();
            if (z22 != null) {
                long m10 = n.m(n.n(q10.f2(z22, !z10), o.d(j10)), this.f2532a.f2(z22, !z10));
                return C2422h.a((float) n.j(m10), (float) n.k(m10));
            }
            Q a10 = D.a(q10);
            long n10 = n.n(n.n(q10.f2(a10, !z10), a10.J1()), o.d(j10));
            Q a11 = D.a(this.f2532a);
            long m11 = n.m(n10, n.n(this.f2532a.f2(a11, !z10), a11.J1()));
            long a12 = C2422h.a((float) n.j(m11), (float) n.k(m11));
            C1235c0 F22 = a11.a2().F2();
            C6496s.e(F22);
            C1235c0 F23 = a10.a2().F2();
            C6496s.e(F23);
            return F22.A0(F23, a12, z10);
        }
        Q a13 = D.a(this.f2532a);
        return C2421g.r(A0(a13.b2(), j10, z10), a13.a2().C1().A0(sVar, C2421g.f25320b.c(), z10));
    }

    public C1197s B() {
        Q z22;
        if (!G()) {
            a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        C1235c0 F22 = a().F2();
        if (F22 == null || (z22 = F22.z2()) == null) {
            return null;
        }
        return z22.C1();
    }

    public boolean G() {
        return a().G();
    }

    public long H0(long j10) {
        return a().H0(C2421g.r(j10, c()));
    }

    public long L(long j10) {
        return C2421g.r(a().L(j10), c());
    }

    public void O(C1197s sVar, float[] fArr) {
        a().O(sVar, fArr);
    }

    public long W(C1197s sVar, long j10) {
        return A0(sVar, j10, true);
    }

    public final C1235c0 a() {
        return this.f2532a.a2();
    }

    public long b() {
        Q q10 = this.f2532a;
        return s.a(q10.X0(), q10.R0());
    }

    public C2423i b0(C1197s sVar, boolean z10) {
        return a().b0(sVar, z10);
    }

    public long m0(long j10) {
        return a().m0(C2421g.r(j10, c()));
    }

    public long o(long j10) {
        return C2421g.r(a().o(j10), c());
    }

    public void q0(float[] fArr) {
        a().q0(fArr);
    }

    public C1197s x0() {
        Q z22;
        if (!G()) {
            a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        C1235c0 F22 = a().A1().l0().F2();
        if (F22 == null || (z22 = F22.z2()) == null) {
            return null;
        }
        return z22.C1();
    }
}
