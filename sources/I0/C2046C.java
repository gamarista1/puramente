package i0;

import lf.C6527k;
import yf.C6798l;

/* renamed from: i0.C  reason: case insensitive filesystem */
public final class C2046C extends C2057k {

    /* renamed from: g  reason: collision with root package name */
    private final C2057k f21696g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f21697h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f21698i;

    /* renamed from: j  reason: collision with root package name */
    private C6798l f21699j;

    /* renamed from: k  reason: collision with root package name */
    private final C6798l f21700k;

    /* renamed from: l  reason: collision with root package name */
    private final long f21701l;

    /* renamed from: m  reason: collision with root package name */
    private final C2057k f21702m;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r4 = r4.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2046C(i0.C2057k r4, yf.C6798l r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            i0.n$a r0 = i0.n.f21741e
            i0.n r0 = r0.a()
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            r3.f21696g = r4
            r3.f21697h = r6
            r3.f21698i = r7
            if (r4 == 0) goto L_0x0019
            yf.l r4 = r4.h()
            if (r4 != 0) goto L_0x0027
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r4 = i0.p.f21762j
            java.lang.Object r4 = r4.get()
            i0.a r4 = (i0.C2047a) r4
            yf.l r4 = r4.h()
        L_0x0027:
            yf.l r4 = i0.p.K(r5, r4, r6)
            r3.f21699j = r4
            long r4 = Y.C1474c.a()
            r3.f21701l = r4
            r3.f21702m = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C2046C.<init>(i0.k, yf.l, boolean, boolean):void");
    }

    private final C2057k A() {
        C2057k kVar = this.f21696g;
        if (kVar == null) {
            return (C2057k) p.f21762j.get();
        }
        return kVar;
    }

    /* renamed from: B */
    public C6798l h() {
        return this.f21699j;
    }

    public final long C() {
        return this.f21701l;
    }

    /* renamed from: D */
    public Void m(C2057k kVar) {
        t.a();
        throw new C6527k();
    }

    /* renamed from: E */
    public Void n(C2057k kVar) {
        t.a();
        throw new C6527k();
    }

    public void F(C6798l lVar) {
        this.f21699j = lVar;
    }

    public void d() {
        C2057k kVar;
        t(true);
        if (this.f21698i && (kVar = this.f21696g) != null) {
            kVar.d();
        }
    }

    public int f() {
        return A().f();
    }

    public n g() {
        return A().g();
    }

    public boolean i() {
        return A().i();
    }

    public C6798l k() {
        return this.f21700k;
    }

    public void o() {
        A().o();
    }

    public void p(x xVar) {
        A().p(xVar);
    }

    public C2057k x(C6798l lVar) {
        C6798l L10 = p.L(lVar, h(), false, 4, (Object) null);
        if (!this.f21697h) {
            return p.D(A().x((C6798l) null), L10, true);
        }
        return A().x(L10);
    }
}
