package Zg;

import Ug.C5567f0;
import Ug.W0;
import lf.C6514M;
import qf.C6658d;
import yf.C6798l;

/* renamed from: Zg.l  reason: case insensitive filesystem */
public abstract class C5723l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final G f66981a = new G("UNDEFINED");

    /* renamed from: b  reason: collision with root package name */
    public static final G f66982b = new G("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r8.g1() != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a3, code lost:
        if (r8.g1() != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(qf.C6658d r6, java.lang.Object r7, yf.C6798l r8) {
        /*
            boolean r0 = r6 instanceof Zg.C5722k
            if (r0 == 0) goto L_0x00b2
            Zg.k r6 = (Zg.C5722k) r6
            java.lang.Object r8 = Ug.E.c(r7, r8)
            Ug.G r0 = r6.f66977d
            qf.g r1 = r6.getContext()
            boolean r0 = r0.B1(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f66979f = r8
            r6.f65339c = r1
            Ug.G r7 = r6.f66977d
            qf.g r8 = r6.getContext()
            r7.z1(r8, r6)
            goto L_0x00b5
        L_0x0026:
            Ug.W0 r0 = Ug.W0.f65337a
            Ug.f0 r0 = r0.b()
            boolean r2 = r0.K1()
            if (r2 == 0) goto L_0x003b
            r6.f66979f = r8
            r6.f65339c = r1
            r0.G1(r6)
            goto L_0x00b5
        L_0x003b:
            r0.I1(r1)
            r2 = 0
            qf.g r3 = r6.getContext()     // Catch:{ all -> 0x0068 }
            Ug.w0$b r4 = Ug.C5600w0.f65416O     // Catch:{ all -> 0x0068 }
            qf.g$b r3 = r3.b(r4)     // Catch:{ all -> 0x0068 }
            Ug.w0 r3 = (Ug.C5600w0) r3     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x006a
            boolean r4 = r3.a()     // Catch:{ all -> 0x0068 }
            if (r4 != 0) goto L_0x006a
            java.util.concurrent.CancellationException r7 = r3.M()     // Catch:{ all -> 0x0068 }
            r6.b(r8, r7)     // Catch:{ all -> 0x0068 }
            lf.v$a r8 = lf.v.f71841b     // Catch:{ all -> 0x0068 }
            java.lang.Object r7 = lf.w.a(r7)     // Catch:{ all -> 0x0068 }
            java.lang.Object r7 = lf.v.b(r7)     // Catch:{ all -> 0x0068 }
            r6.resumeWith(r7)     // Catch:{ all -> 0x0068 }
            goto L_0x0092
        L_0x0068:
            r7 = move-exception
            goto L_0x00a9
        L_0x006a:
            qf.d r8 = r6.f66978e     // Catch:{ all -> 0x0068 }
            java.lang.Object r3 = r6.f66980g     // Catch:{ all -> 0x0068 }
            qf.g r4 = r8.getContext()     // Catch:{ all -> 0x0068 }
            java.lang.Object r3 = Zg.K.c(r4, r3)     // Catch:{ all -> 0x0068 }
            Zg.G r5 = Zg.K.f66954a     // Catch:{ all -> 0x0068 }
            if (r3 == r5) goto L_0x007f
            Ug.g1 r8 = Ug.F.g(r8, r4, r3)     // Catch:{ all -> 0x0068 }
            goto L_0x0080
        L_0x007f:
            r8 = r2
        L_0x0080:
            qf.d r5 = r6.f66978e     // Catch:{ all -> 0x009c }
            r5.resumeWith(r7)     // Catch:{ all -> 0x009c }
            lf.M r7 = lf.C6514M.f71813a     // Catch:{ all -> 0x009c }
            if (r8 == 0) goto L_0x008f
            boolean r7 = r8.g1()     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0092
        L_0x008f:
            Zg.K.a(r4, r3)     // Catch:{ all -> 0x0068 }
        L_0x0092:
            boolean r7 = r0.N1()     // Catch:{ all -> 0x0068 }
            if (r7 != 0) goto L_0x0092
        L_0x0098:
            r0.D1(r1)
            goto L_0x00b5
        L_0x009c:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a5
            boolean r8 = r8.g1()     // Catch:{ all -> 0x0068 }
            if (r8 == 0) goto L_0x00a8
        L_0x00a5:
            Zg.K.a(r4, r3)     // Catch:{ all -> 0x0068 }
        L_0x00a8:
            throw r7     // Catch:{ all -> 0x0068 }
        L_0x00a9:
            r6.g(r7, r2)     // Catch:{ all -> 0x00ad }
            goto L_0x0098
        L_0x00ad:
            r6 = move-exception
            r0.D1(r1)
            throw r6
        L_0x00b2:
            r6.resumeWith(r7)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Zg.C5723l.b(qf.d, java.lang.Object, yf.l):void");
    }

    public static /* synthetic */ void c(C6658d dVar, Object obj, C6798l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }

    public static final boolean d(C5722k kVar) {
        C6514M m10 = C6514M.f71813a;
        C5567f0 b10 = W0.f65337a.b();
        if (b10.L1()) {
            return false;
        }
        if (b10.K1()) {
            kVar.f66979f = m10;
            kVar.f65339c = 1;
            b10.G1(kVar);
            return true;
        }
        b10.I1(true);
        try {
            kVar.run();
            do {
            } while (b10.N1());
        } catch (Throwable th2) {
            b10.D1(true);
            throw th2;
        }
        b10.D1(true);
        return false;
    }
}
