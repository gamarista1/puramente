package wh;

import java.io.IOException;
import kotlin.jvm.internal.C6496s;
import rh.C6703A;
import rh.C6704a;
import rh.G;
import rh.r;
import rh.v;
import sh.C6726e;
import wh.C6780j;
import xh.d;
import xh.g;
import zh.C6843a;
import zh.C6844b;
import zh.n;

/* renamed from: wh.d  reason: case insensitive filesystem */
public final class C6774d {

    /* renamed from: a  reason: collision with root package name */
    private final C6777g f73795a;

    /* renamed from: b  reason: collision with root package name */
    private final C6704a f73796b;

    /* renamed from: c  reason: collision with root package name */
    private final C6775e f73797c;

    /* renamed from: d  reason: collision with root package name */
    private final r f73798d;

    /* renamed from: e  reason: collision with root package name */
    private C6780j.b f73799e;

    /* renamed from: f  reason: collision with root package name */
    private C6780j f73800f;

    /* renamed from: g  reason: collision with root package name */
    private int f73801g;

    /* renamed from: h  reason: collision with root package name */
    private int f73802h;

    /* renamed from: i  reason: collision with root package name */
    private int f73803i;

    /* renamed from: j  reason: collision with root package name */
    private G f73804j;

    public C6774d(C6777g gVar, C6704a aVar, C6775e eVar, r rVar) {
        C6496s.h(gVar, "connectionPool");
        C6496s.h(aVar, "address");
        C6496s.h(eVar, "call");
        C6496s.h(rVar, "eventListener");
        this.f73795a = gVar;
        this.f73796b = aVar;
        this.f73797c = eVar;
        this.f73798d = rVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final wh.C6776f b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r1 = r14
            wh.e r0 = r1.f73797c
            boolean r0 = r0.isCanceled()
            if (r0 != 0) goto L_0x0171
            wh.e r0 = r1.f73797c
            wh.f r2 = r0.m()
            r3 = 0
            if (r2 == 0) goto L_0x005b
            monitor-enter(r2)
            boolean r0 = r2.p()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0030
            rh.G r0 = r2.A()     // Catch:{ all -> 0x002e }
            rh.a r0 = r0.a()     // Catch:{ all -> 0x002e }
            rh.v r0 = r0.l()     // Catch:{ all -> 0x002e }
            boolean r0 = r14.g(r0)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            r0 = r3
            goto L_0x0036
        L_0x002e:
            r0 = move-exception
            goto L_0x0059
        L_0x0030:
            wh.e r0 = r1.f73797c     // Catch:{ all -> 0x002e }
            java.net.Socket r0 = r0.y()     // Catch:{ all -> 0x002e }
        L_0x0036:
            lf.M r4 = lf.C6514M.f71813a     // Catch:{ all -> 0x002e }
            monitor-exit(r2)
            wh.e r4 = r1.f73797c
            wh.f r4 = r4.m()
            if (r4 == 0) goto L_0x004c
            if (r0 != 0) goto L_0x0044
            return r2
        L_0x0044:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x004c:
            if (r0 == 0) goto L_0x0051
            sh.C6726e.n(r0)
        L_0x0051:
            rh.r r0 = r1.f73798d
            wh.e r4 = r1.f73797c
            r0.l(r4, r2)
            goto L_0x005b
        L_0x0059:
            monitor-exit(r2)
            throw r0
        L_0x005b:
            r0 = 0
            r1.f73801g = r0
            r1.f73802h = r0
            r1.f73803i = r0
            wh.g r2 = r1.f73795a
            rh.a r4 = r1.f73796b
            wh.e r5 = r1.f73797c
            boolean r2 = r2.a(r4, r5, r3, r0)
            if (r2 == 0) goto L_0x007f
            wh.e r0 = r1.f73797c
            wh.f r0 = r0.m()
            kotlin.jvm.internal.C6496s.e(r0)
            rh.r r2 = r1.f73798d
            wh.e r3 = r1.f73797c
            r2.k(r3, r0)
            return r0
        L_0x007f:
            rh.G r2 = r1.f73804j
            if (r2 == 0) goto L_0x008a
            kotlin.jvm.internal.C6496s.e(r2)
            r1.f73804j = r3
        L_0x0088:
            r4 = r3
            goto L_0x00ef
        L_0x008a:
            wh.j$b r2 = r1.f73799e
            if (r2 == 0) goto L_0x00a1
            kotlin.jvm.internal.C6496s.e(r2)
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x00a1
            wh.j$b r0 = r1.f73799e
            kotlin.jvm.internal.C6496s.e(r0)
            rh.G r2 = r0.c()
            goto L_0x0088
        L_0x00a1:
            wh.j r2 = r1.f73800f
            if (r2 != 0) goto L_0x00bc
            wh.j r2 = new wh.j
            rh.a r4 = r1.f73796b
            wh.e r5 = r1.f73797c
            rh.A r5 = r5.l()
            wh.h r5 = r5.w()
            wh.e r6 = r1.f73797c
            rh.r r7 = r1.f73798d
            r2.<init>(r4, r5, r6, r7)
            r1.f73800f = r2
        L_0x00bc:
            wh.j$b r2 = r2.c()
            r1.f73799e = r2
            java.util.List r4 = r2.a()
            wh.e r5 = r1.f73797c
            boolean r5 = r5.isCanceled()
            if (r5 != 0) goto L_0x0169
            wh.g r5 = r1.f73795a
            rh.a r6 = r1.f73796b
            wh.e r7 = r1.f73797c
            boolean r0 = r5.a(r6, r7, r4, r0)
            if (r0 == 0) goto L_0x00eb
            wh.e r0 = r1.f73797c
            wh.f r0 = r0.m()
            kotlin.jvm.internal.C6496s.e(r0)
            rh.r r2 = r1.f73798d
            wh.e r3 = r1.f73797c
            r2.k(r3, r0)
            return r0
        L_0x00eb:
            rh.G r2 = r2.c()
        L_0x00ef:
            wh.f r13 = new wh.f
            wh.g r0 = r1.f73795a
            r13.<init>(r0, r2)
            wh.e r0 = r1.f73797c
            r0.A(r13)
            wh.e r11 = r1.f73797c     // Catch:{ all -> 0x0162 }
            rh.r r12 = r1.f73798d     // Catch:{ all -> 0x0162 }
            r5 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r5.f(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0162 }
            wh.e r0 = r1.f73797c
            r0.A(r3)
            wh.e r0 = r1.f73797c
            rh.A r0 = r0.l()
            wh.h r0 = r0.w()
            rh.G r3 = r13.A()
            r0.a(r3)
            wh.g r0 = r1.f73795a
            rh.a r3 = r1.f73796b
            wh.e r5 = r1.f73797c
            r6 = 1
            boolean r0 = r0.a(r3, r5, r4, r6)
            if (r0 == 0) goto L_0x0149
            wh.e r0 = r1.f73797c
            wh.f r0 = r0.m()
            kotlin.jvm.internal.C6496s.e(r0)
            r1.f73804j = r2
            java.net.Socket r2 = r13.E()
            sh.C6726e.n(r2)
            rh.r r2 = r1.f73798d
            wh.e r3 = r1.f73797c
            r2.k(r3, r0)
            return r0
        L_0x0149:
            monitor-enter(r13)
            wh.g r0 = r1.f73795a     // Catch:{ all -> 0x015f }
            r0.e(r13)     // Catch:{ all -> 0x015f }
            wh.e r0 = r1.f73797c     // Catch:{ all -> 0x015f }
            r0.d(r13)     // Catch:{ all -> 0x015f }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x015f }
            monitor-exit(r13)
            rh.r r0 = r1.f73798d
            wh.e r2 = r1.f73797c
            r0.k(r2, r13)
            return r13
        L_0x015f:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0162:
            r0 = move-exception
            wh.e r2 = r1.f73797c
            r2.A(r3)
            throw r0
        L_0x0169:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0171:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.C6774d.b(int, int, int, int, boolean):wh.f");
    }

    private final C6776f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        boolean z12;
        while (true) {
            C6776f b10 = b(i10, i11, i12, i13, z10);
            if (b10.u(z11)) {
                return b10;
            }
            b10.z();
            if (this.f73804j == null) {
                C6780j.b bVar = this.f73799e;
                boolean z13 = true;
                if (bVar != null) {
                    z12 = bVar.b();
                } else {
                    z12 = true;
                }
                if (z12) {
                    continue;
                } else {
                    C6780j jVar = this.f73800f;
                    if (jVar != null) {
                        z13 = jVar.a();
                    }
                    if (!z13) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final G f() {
        C6776f m10;
        if (this.f73801g > 1 || this.f73802h > 1 || this.f73803i > 0 || (m10 = this.f73797c.m()) == null) {
            return null;
        }
        synchronized (m10) {
            if (m10.q() != 0) {
                return null;
            }
            if (!C6726e.j(m10.A().a().l(), this.f73796b.l())) {
                return null;
            }
            G A10 = m10.A();
            return A10;
        }
    }

    public final d a(C6703A a10, g gVar) {
        C6496s.h(a10, "client");
        C6496s.h(gVar, "chain");
        try {
            return c(gVar.e(), gVar.g(), gVar.i(), a10.D(), a10.J(), !C6496s.c(gVar.h().h(), "GET")).w(a10, gVar);
        } catch (C6779i e10) {
            h(e10.c());
            throw e10;
        } catch (IOException e11) {
            h(e11);
            throw new C6779i(e11);
        }
    }

    public final C6704a d() {
        return this.f73796b;
    }

    public final boolean e() {
        C6780j jVar;
        if (this.f73801g == 0 && this.f73802h == 0 && this.f73803i == 0) {
            return false;
        }
        if (this.f73804j != null) {
            return true;
        }
        G f10 = f();
        if (f10 != null) {
            this.f73804j = f10;
            return true;
        }
        C6780j.b bVar = this.f73799e;
        if ((bVar == null || !bVar.b()) && (jVar = this.f73800f) != null) {
            return jVar.a();
        }
        return true;
    }

    public final boolean g(v vVar) {
        C6496s.h(vVar, "url");
        v l10 = this.f73796b.l();
        if (vVar.o() != l10.o() || !C6496s.c(vVar.i(), l10.i())) {
            return false;
        }
        return true;
    }

    public final void h(IOException iOException) {
        C6496s.h(iOException, "e");
        this.f73804j = null;
        if ((iOException instanceof n) && ((n) iOException).f74208a == C6844b.REFUSED_STREAM) {
            this.f73801g++;
        } else if (iOException instanceof C6843a) {
            this.f73802h++;
        } else {
            this.f73803i++;
        }
    }
}
