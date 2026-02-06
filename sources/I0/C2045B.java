package i0;

import androidx.collection.L;
import lf.C6527k;
import yf.C6798l;

/* renamed from: i0.B  reason: case insensitive filesystem */
public final class C2045B extends C2049c {

    /* renamed from: s  reason: collision with root package name */
    private final C2049c f21690s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f21691t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f21692u;

    /* renamed from: v  reason: collision with root package name */
    private C6798l f21693v;

    /* renamed from: w  reason: collision with root package name */
    private C6798l f21694w;

    /* renamed from: x  reason: collision with root package name */
    private final long f21695x;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r3.h();
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2045B(i0.C2049c r3, yf.C6798l r4, yf.C6798l r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            i0.n$a r0 = i0.n.f21741e
            i0.n r0 = r0.a()
            if (r3 == 0) goto L_0x000e
            yf.l r1 = r3.h()
            if (r1 != 0) goto L_0x001c
        L_0x000e:
            java.util.concurrent.atomic.AtomicReference r1 = i0.p.f21762j
            java.lang.Object r1 = r1.get()
            i0.a r1 = (i0.C2047a) r1
            yf.l r1 = r1.h()
        L_0x001c:
            yf.l r4 = i0.p.K(r4, r1, r6)
            if (r3 == 0) goto L_0x0028
            yf.l r1 = r3.k()
            if (r1 != 0) goto L_0x0036
        L_0x0028:
            java.util.concurrent.atomic.AtomicReference r1 = i0.p.f21762j
            java.lang.Object r1 = r1.get()
            i0.a r1 = (i0.C2047a) r1
            yf.l r1 = r1.k()
        L_0x0036:
            yf.l r5 = i0.p.M(r5, r1)
            r1 = 0
            r2.<init>(r1, r0, r4, r5)
            r2.f21690s = r3
            r2.f21691t = r6
            r2.f21692u = r7
            yf.l r3 = super.h()
            r2.f21693v = r3
            yf.l r3 = super.k()
            r2.f21694w = r3
            long r3 = Y.C1474c.a()
            r2.f21695x = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C2045B.<init>(i0.c, yf.l, yf.l, boolean, boolean):void");
    }

    private final C2049c T() {
        C2049c cVar = this.f21690s;
        if (cVar == null) {
            return (C2049c) p.f21762j.get();
        }
        return cVar;
    }

    public C2058l C() {
        return T().C();
    }

    public L E() {
        return T().E();
    }

    /* renamed from: H */
    public C6798l h() {
        return this.f21693v;
    }

    public void P(L l10) {
        t.a();
        throw new C6527k();
    }

    public C2049c Q(C6798l lVar, C6798l lVar2) {
        C6798l L10 = p.L(lVar, h(), false, 4, (Object) null);
        C6798l m10 = p.M(lVar2, k());
        if (!this.f21691t) {
            return new C2045B(T().Q((C6798l) null, m10), L10, m10, false, true);
        }
        return T().Q(L10, m10);
    }

    public final long U() {
        return this.f21695x;
    }

    /* renamed from: V */
    public Void m(C2057k kVar) {
        t.a();
        throw new C6527k();
    }

    /* renamed from: W */
    public Void n(C2057k kVar) {
        t.a();
        throw new C6527k();
    }

    public void X(C6798l lVar) {
        this.f21693v = lVar;
    }

    public void Y(C6798l lVar) {
        this.f21694w = lVar;
    }

    public void d() {
        C2049c cVar;
        t(true);
        if (this.f21692u && (cVar = this.f21690s) != null) {
            cVar.d();
        }
    }

    public int f() {
        return T().f();
    }

    public n g() {
        return T().g();
    }

    public boolean i() {
        return T().i();
    }

    public int j() {
        return T().j();
    }

    public C6798l k() {
        return this.f21694w;
    }

    public void o() {
        T().o();
    }

    public void p(x xVar) {
        T().p(xVar);
    }

    public void u(int i10) {
        t.a();
        throw new C6527k();
    }

    public void v(n nVar) {
        t.a();
        throw new C6527k();
    }

    public void w(int i10) {
        T().w(i10);
    }

    public C2057k x(C6798l lVar) {
        C6798l L10 = p.L(lVar, h(), false, 4, (Object) null);
        if (!this.f21691t) {
            return p.D(T().x((C6798l) null), L10, true);
        }
        return T().x(L10);
    }
}
