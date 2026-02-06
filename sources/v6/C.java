package V6;

import M5.d;
import T5.k;
import U5.a;
import c7.C3189i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class C {

    /* renamed from: b  reason: collision with root package name */
    private static final Class f34674b = C.class;

    /* renamed from: a  reason: collision with root package name */
    private Map f34675a = new HashMap();

    private C() {
    }

    public static C d() {
        return new C();
    }

    private synchronized void e() {
        a.y(f34674b, "Count = %d", Integer.valueOf(this.f34675a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f34675a.values());
            this.f34675a.clear();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C3189i iVar = (C3189i) arrayList.get(i10);
            if (iVar != null) {
                iVar.close();
            }
        }
    }

    public synchronized boolean b(d dVar) {
        k.g(dVar);
        if (!this.f34675a.containsKey(dVar)) {
            return false;
        }
        C3189i iVar = (C3189i) this.f34675a.get(dVar);
        synchronized (iVar) {
            if (C3189i.h0(iVar)) {
                return true;
            }
            this.f34675a.remove(dVar);
            a.G(f34674b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(iVar)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized c7.C3189i c(M5.d r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            T5.k.g(r6)     // Catch:{ all -> 0x0048 }
            java.util.Map r0 = r5.f34675a     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0048 }
            c7.i r0 = (c7.C3189i) r0     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x004a
            monitor-enter(r0)     // Catch:{ all -> 0x0048 }
            boolean r1 = c7.C3189i.h0(r0)     // Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x003f
            java.util.Map r1 = r5.f34675a     // Catch:{ all -> 0x003d }
            r1.remove(r6)     // Catch:{ all -> 0x003d }
            java.lang.Class r1 = f34674b     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "Found closed reference %d for key %s (%d)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x003d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = r6.a()     // Catch:{ all -> 0x003d }
            int r6 = java.lang.System.identityHashCode(r6)     // Catch:{ all -> 0x003d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x003d }
            java.lang.Object[] r6 = new java.lang.Object[]{r3, r4, r6}     // Catch:{ all -> 0x003d }
            U5.a.G(r1, r2, r6)     // Catch:{ all -> 0x003d }
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            monitor-exit(r5)
            r6 = 0
            return r6
        L_0x003d:
            r6 = move-exception
            goto L_0x0046
        L_0x003f:
            c7.i r6 = c7.C3189i.b(r0)     // Catch:{ all -> 0x003d }
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            r0 = r6
            goto L_0x004a
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r6     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r6 = move-exception
            goto L_0x004c
        L_0x004a:
            monitor-exit(r5)
            return r0
        L_0x004c:
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: V6.C.c(M5.d):c7.i");
    }

    public synchronized void f(d dVar, C3189i iVar) {
        k.g(dVar);
        k.b(Boolean.valueOf(C3189i.h0(iVar)));
        C3189i.f((C3189i) this.f34675a.put(dVar, C3189i.b(iVar)));
        e();
    }

    public boolean g(d dVar) {
        C3189i iVar;
        k.g(dVar);
        synchronized (this) {
            iVar = (C3189i) this.f34675a.remove(dVar);
        }
        if (iVar == null) {
            return false;
        }
        try {
            return iVar.g0();
        } finally {
            iVar.close();
        }
    }

    /* JADX INFO: finally extract failed */
    public synchronized boolean h(d dVar, C3189i iVar) {
        k.g(dVar);
        k.g(iVar);
        k.b(Boolean.valueOf(C3189i.h0(iVar)));
        C3189i iVar2 = (C3189i) this.f34675a.get(dVar);
        if (iVar2 == null) {
            return false;
        }
        X5.a o10 = iVar2.o();
        X5.a o11 = iVar.o();
        if (!(o10 == null || o11 == null)) {
            try {
                if (o10.I() == o11.I()) {
                    this.f34675a.remove(dVar);
                    X5.a.E(o11);
                    X5.a.E(o10);
                    C3189i.f(iVar2);
                    e();
                    return true;
                }
            } catch (Throwable th2) {
                X5.a.E(o11);
                X5.a.E(o10);
                C3189i.f(iVar2);
                throw th2;
            }
        }
        X5.a.E(o11);
        X5.a.E(o10);
        C3189i.f(iVar2);
        return false;
    }
}
