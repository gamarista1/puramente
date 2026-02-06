package Ug;

import bh.C5793h;
import kotlin.jvm.internal.C6496s;
import lf.C6523g;
import qf.C6658d;

public abstract class X extends C5793h {

    /* renamed from: c  reason: collision with root package name */
    public int f65339c;

    public X(int i10) {
        this.f65339c = i10;
    }

    public abstract void b(Object obj, Throwable th2);

    public abstract C6658d d();

    public Throwable e(Object obj) {
        B b10;
        if (obj instanceof B) {
            b10 = (B) obj;
        } else {
            b10 = null;
        }
        if (b10 != null) {
            return b10.f65278a;
        }
        return null;
    }

    public final void g(Throwable th2, Throwable th3) {
        if (th2 != null || th3 != null) {
            if (!(th2 == null || th3 == null)) {
                C6523g.a(th2, th3);
            }
            if (th2 == null) {
                th2 = th3;
            }
            C6496s.e(th2);
            I.a(d().getContext(), new N("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
        }
    }

    public abstract Object h();

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r4.g1() != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        if (r4.g1() != false) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            bh.i r0 = r10.f67307b
            qf.d r1 = r10.d()     // Catch:{ all -> 0x0023 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.C6496s.f(r1, r2)     // Catch:{ all -> 0x0023 }
            Zg.k r1 = (Zg.C5722k) r1     // Catch:{ all -> 0x0023 }
            qf.d r2 = r1.f66978e     // Catch:{ all -> 0x0023 }
            java.lang.Object r1 = r1.f66980g     // Catch:{ all -> 0x0023 }
            qf.g r3 = r2.getContext()     // Catch:{ all -> 0x0023 }
            java.lang.Object r1 = Zg.K.c(r3, r1)     // Catch:{ all -> 0x0023 }
            Zg.G r4 = Zg.K.f66954a     // Catch:{ all -> 0x0023 }
            r5 = 0
            if (r1 == r4) goto L_0x0026
            Ug.g1 r4 = Ug.F.g(r2, r3, r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r1 = move-exception
            goto L_0x00b9
        L_0x0026:
            r4 = r5
        L_0x0027:
            qf.g r6 = r2.getContext()     // Catch:{ all -> 0x0046 }
            java.lang.Object r7 = r10.h()     // Catch:{ all -> 0x0046 }
            java.lang.Throwable r8 = r10.e(r7)     // Catch:{ all -> 0x0046 }
            if (r8 != 0) goto L_0x0048
            int r9 = r10.f65339c     // Catch:{ all -> 0x0046 }
            boolean r9 = Ug.Y.b(r9)     // Catch:{ all -> 0x0046 }
            if (r9 == 0) goto L_0x0048
            Ug.w0$b r9 = Ug.C5600w0.f65416O     // Catch:{ all -> 0x0046 }
            qf.g$b r6 = r6.b(r9)     // Catch:{ all -> 0x0046 }
            Ug.w0 r6 = (Ug.C5600w0) r6     // Catch:{ all -> 0x0046 }
            goto L_0x0049
        L_0x0046:
            r2 = move-exception
            goto L_0x00ad
        L_0x0048:
            r6 = r5
        L_0x0049:
            if (r6 == 0) goto L_0x0066
            boolean r9 = r6.a()     // Catch:{ all -> 0x0046 }
            if (r9 != 0) goto L_0x0066
            java.util.concurrent.CancellationException r6 = r6.M()     // Catch:{ all -> 0x0046 }
            r10.b(r7, r6)     // Catch:{ all -> 0x0046 }
            lf.v$a r7 = lf.v.f71841b     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = lf.w.a(r6)     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = lf.v.b(r6)     // Catch:{ all -> 0x0046 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0046 }
            goto L_0x0083
        L_0x0066:
            if (r8 == 0) goto L_0x0076
            lf.v$a r6 = lf.v.f71841b     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = lf.w.a(r8)     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = lf.v.b(r6)     // Catch:{ all -> 0x0046 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0046 }
            goto L_0x0083
        L_0x0076:
            lf.v$a r6 = lf.v.f71841b     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = r10.f(r7)     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = lf.v.b(r6)     // Catch:{ all -> 0x0046 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0046 }
        L_0x0083:
            lf.M r2 = lf.C6514M.f71813a     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x008d
            boolean r2 = r4.g1()     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0090
        L_0x008d:
            Zg.K.a(r3, r1)     // Catch:{ all -> 0x0023 }
        L_0x0090:
            r0.a()     // Catch:{ all -> 0x009a }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x009a }
            java.lang.Object r0 = lf.v.b(r0)     // Catch:{ all -> 0x009a }
            goto L_0x00a5
        L_0x009a:
            r0 = move-exception
            lf.v$a r1 = lf.v.f71841b
            java.lang.Object r0 = lf.w.a(r0)
            java.lang.Object r0 = lf.v.b(r0)
        L_0x00a5:
            java.lang.Throwable r0 = lf.v.e(r0)
            r10.g(r5, r0)
            goto L_0x00d7
        L_0x00ad:
            if (r4 == 0) goto L_0x00b5
            boolean r4 = r4.g1()     // Catch:{ all -> 0x0023 }
            if (r4 == 0) goto L_0x00b8
        L_0x00b5:
            Zg.K.a(r3, r1)     // Catch:{ all -> 0x0023 }
        L_0x00b8:
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x00b9:
            lf.v$a r2 = lf.v.f71841b     // Catch:{ all -> 0x00c5 }
            r0.a()     // Catch:{ all -> 0x00c5 }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = lf.v.b(r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x00d0
        L_0x00c5:
            r0 = move-exception
            lf.v$a r2 = lf.v.f71841b
            java.lang.Object r0 = lf.w.a(r0)
            java.lang.Object r0 = lf.v.b(r0)
        L_0x00d0:
            java.lang.Throwable r0 = lf.v.e(r0)
            r10.g(r1, r0)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.X.run():void");
    }

    public Object f(Object obj) {
        return obj;
    }
}
