package Ug;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C6496s;
import qf.g;

/* renamed from: Ug.g  reason: case insensitive filesystem */
final class C5568g extends C5556a {

    /* renamed from: d  reason: collision with root package name */
    private final Thread f65374d;

    /* renamed from: e  reason: collision with root package name */
    private final C5567f0 f65375e;

    public C5568g(g gVar, Thread thread, C5567f0 f0Var) {
        super(gVar, true, true);
        this.f65374d = thread;
        this.f65375e = f0Var;
    }

    /* access modifiers changed from: protected */
    public void A(Object obj) {
        if (!C6496s.c(Thread.currentThread(), this.f65374d)) {
            Thread thread = this.f65374d;
            C5560c.a();
            LockSupport.unpark(thread);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: Ug.B} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g1() {
        /*
            r6 = this;
            Ug.C5560c.a()
            Ug.f0 r0 = r6.f65375e     // Catch:{ all -> 0x000e }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0010
            Ug.C5567f0.J1(r0, r2, r1, r3)     // Catch:{ all -> 0x000e }
            goto L_0x0010
        L_0x000e:
            r0 = move-exception
            goto L_0x0063
        L_0x0010:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0052
            Ug.f0 r0 = r6.f65375e     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0021
            long r4 = r0.M1()     // Catch:{ all -> 0x001f }
            goto L_0x0026
        L_0x001f:
            r0 = move-exception
            goto L_0x005b
        L_0x0021:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0026:
            boolean r0 = r6.o()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0033
            Ug.C5560c.a()     // Catch:{ all -> 0x001f }
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r4)     // Catch:{ all -> 0x001f }
            goto L_0x0010
        L_0x0033:
            Ug.f0 r0 = r6.f65375e     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x003a
            Ug.C5567f0.E1(r0, r2, r1, r3)     // Catch:{ all -> 0x000e }
        L_0x003a:
            Ug.C5560c.a()
            java.lang.Object r0 = r6.l0()
            java.lang.Object r0 = Ug.F0.h(r0)
            boolean r1 = r0 instanceof Ug.B
            if (r1 == 0) goto L_0x004c
            r3 = r0
            Ug.B r3 = (Ug.B) r3
        L_0x004c:
            if (r3 != 0) goto L_0x004f
            return r0
        L_0x004f:
            java.lang.Throwable r0 = r3.f65278a
            throw r0
        L_0x0052:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ all -> 0x001f }
            r0.<init>()     // Catch:{ all -> 0x001f }
            r6.J(r0)     // Catch:{ all -> 0x001f }
            throw r0     // Catch:{ all -> 0x001f }
        L_0x005b:
            Ug.f0 r4 = r6.f65375e     // Catch:{ all -> 0x000e }
            if (r4 == 0) goto L_0x0062
            Ug.C5567f0.E1(r4, r2, r1, r3)     // Catch:{ all -> 0x000e }
        L_0x0062:
            throw r0     // Catch:{ all -> 0x000e }
        L_0x0063:
            Ug.C5560c.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.C5568g.g1():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return true;
    }
}
