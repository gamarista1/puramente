package i0;

import yf.C6798l;

/* renamed from: i0.d  reason: case insensitive filesystem */
public final class C2050d extends C2049c {

    /* renamed from: s  reason: collision with root package name */
    private final C2049c f21719s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f21720t;

    public C2050d(int i10, n nVar, C6798l lVar, C6798l lVar2, C2049c cVar) {
        super(i10, nVar, lVar, lVar2);
        this.f21719s = cVar;
        cVar.m(this);
    }

    private final void T() {
        if (!this.f21720t) {
            this.f21720t = true;
            this.f21719s.n(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[Catch:{ all -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.C2058l C() {
        /*
            r7 = this;
            i0.c r0 = r7.f21719s
            boolean r0 = r0.D()
            if (r0 != 0) goto L_0x00bf
            i0.c r0 = r7.f21719s
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0012
            goto L_0x00bf
        L_0x0012:
            androidx.collection.L r0 = r7.E()
            int r1 = r7.f()
            r2 = 0
            if (r0 == 0) goto L_0x0028
            i0.c r3 = r7.f21719s
            i0.n r4 = r3.g()
            java.util.Map r3 = i0.p.R(r3, r7, r4)
            goto L_0x0029
        L_0x0028:
            r3 = r2
        L_0x0029:
            java.lang.Object r4 = i0.p.I()
            monitor-enter(r4)
            i0.p.g0(r7)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x006b
            int r5 = r0.c()     // Catch:{ all -> 0x0060 }
            if (r5 != 0) goto L_0x003a
            goto L_0x006b
        L_0x003a:
            i0.c r5 = r7.f21719s     // Catch:{ all -> 0x0060 }
            int r5 = r5.f()     // Catch:{ all -> 0x0060 }
            i0.c r6 = r7.f21719s     // Catch:{ all -> 0x0060 }
            i0.n r6 = r6.g()     // Catch:{ all -> 0x0060 }
            i0.l r3 = r7.I(r5, r3, r6)     // Catch:{ all -> 0x0060 }
            i0.l$b r5 = i0.C2058l.b.f21735a     // Catch:{ all -> 0x0060 }
            boolean r5 = kotlin.jvm.internal.C6496s.c(r3, r5)     // Catch:{ all -> 0x0060 }
            if (r5 != 0) goto L_0x0054
            monitor-exit(r4)
            return r3
        L_0x0054:
            i0.c r3 = r7.f21719s     // Catch:{ all -> 0x0060 }
            androidx.collection.L r3 = r3.E()     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0062
            r3.i(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x006e
        L_0x0060:
            r0 = move-exception
            goto L_0x00bd
        L_0x0062:
            i0.c r3 = r7.f21719s     // Catch:{ all -> 0x0060 }
            r3.P(r0)     // Catch:{ all -> 0x0060 }
            r7.P(r2)     // Catch:{ all -> 0x0060 }
            goto L_0x006e
        L_0x006b:
            r7.b()     // Catch:{ all -> 0x0060 }
        L_0x006e:
            i0.c r0 = r7.f21719s     // Catch:{ all -> 0x0060 }
            int r0 = r0.f()     // Catch:{ all -> 0x0060 }
            if (r0 >= r1) goto L_0x007b
            i0.c r0 = r7.f21719s     // Catch:{ all -> 0x0060 }
            r0.B()     // Catch:{ all -> 0x0060 }
        L_0x007b:
            i0.c r0 = r7.f21719s     // Catch:{ all -> 0x0060 }
            i0.n r2 = r0.g()     // Catch:{ all -> 0x0060 }
            i0.n r2 = r2.t(r1)     // Catch:{ all -> 0x0060 }
            i0.n r3 = r7.F()     // Catch:{ all -> 0x0060 }
            i0.n r2 = r2.r(r3)     // Catch:{ all -> 0x0060 }
            r0.v(r2)     // Catch:{ all -> 0x0060 }
            i0.c r0 = r7.f21719s     // Catch:{ all -> 0x0060 }
            r0.J(r1)     // Catch:{ all -> 0x0060 }
            i0.c r0 = r7.f21719s     // Catch:{ all -> 0x0060 }
            int r1 = r7.y()     // Catch:{ all -> 0x0060 }
            r0.L(r1)     // Catch:{ all -> 0x0060 }
            i0.c r0 = r7.f21719s     // Catch:{ all -> 0x0060 }
            i0.n r1 = r7.F()     // Catch:{ all -> 0x0060 }
            r0.K(r1)     // Catch:{ all -> 0x0060 }
            i0.c r0 = r7.f21719s     // Catch:{ all -> 0x0060 }
            int[] r1 = r7.G()     // Catch:{ all -> 0x0060 }
            r0.M(r1)     // Catch:{ all -> 0x0060 }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0060 }
            monitor-exit(r4)
            r0 = 1
            r7.O(r0)
            r7.T()
            i0.l$b r0 = i0.C2058l.b.f21735a
            return r0
        L_0x00bd:
            monitor-exit(r4)
            throw r0
        L_0x00bf:
            i0.l$a r0 = new i0.l$a
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C2050d.C():i0.l");
    }

    public void d() {
        if (!e()) {
            super.d();
            T();
        }
    }
}
