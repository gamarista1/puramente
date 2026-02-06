package o5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map f47044a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    private final long f47045b;

    /* renamed from: c  reason: collision with root package name */
    private long f47046c;

    /* renamed from: d  reason: collision with root package name */
    private long f47047d;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Object f47048a;

        /* renamed from: b  reason: collision with root package name */
        final int f47049b;

        a(Object obj, int i10) {
            this.f47048a = obj;
            this.f47049b = i10;
        }
    }

    public h(long j10) {
        this.f47045b = j10;
        this.f47046c = j10;
    }

    private void f() {
        m(this.f47046c);
    }

    public void b() {
        m(0);
    }

    public synchronized Object g(Object obj) {
        Object obj2;
        a aVar = (a) this.f47044a.get(obj);
        if (aVar != null) {
            obj2 = aVar.f47048a;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public synchronized long h() {
        return this.f47046c;
    }

    /* access modifiers changed from: protected */
    public int i(Object obj) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object k(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.i(r9)     // Catch:{ all -> 0x0012 }
            long r1 = (long) r0     // Catch:{ all -> 0x0012 }
            long r3 = r7.f47046c     // Catch:{ all -> 0x0012 }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L_0x0014
            r7.j(r8, r9)     // Catch:{ all -> 0x0012 }
            monitor-exit(r7)
            return r4
        L_0x0012:
            r8 = move-exception
            goto L_0x004c
        L_0x0014:
            if (r9 == 0) goto L_0x001b
            long r5 = r7.f47047d     // Catch:{ all -> 0x0012 }
            long r5 = r5 + r1
            r7.f47047d = r5     // Catch:{ all -> 0x0012 }
        L_0x001b:
            java.util.Map r1 = r7.f47044a     // Catch:{ all -> 0x0012 }
            if (r9 != 0) goto L_0x0021
            r2 = r4
            goto L_0x0026
        L_0x0021:
            o5.h$a r2 = new o5.h$a     // Catch:{ all -> 0x0012 }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x0012 }
        L_0x0026:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x0012 }
            o5.h$a r0 = (o5.h.a) r0     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0043
            long r1 = r7.f47047d     // Catch:{ all -> 0x0012 }
            int r3 = r0.f47049b     // Catch:{ all -> 0x0012 }
            long r5 = (long) r3     // Catch:{ all -> 0x0012 }
            long r1 = r1 - r5
            r7.f47047d = r1     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r0.f47048a     // Catch:{ all -> 0x0012 }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x0012 }
            if (r9 != 0) goto L_0x0043
            java.lang.Object r9 = r0.f47048a     // Catch:{ all -> 0x0012 }
            r7.j(r8, r9)     // Catch:{ all -> 0x0012 }
        L_0x0043:
            r7.f()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x004a
            java.lang.Object r4 = r0.f47048a     // Catch:{ all -> 0x0012 }
        L_0x004a:
            monitor-exit(r7)
            return r4
        L_0x004c:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.h.k(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f47044a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f47047d -= (long) aVar.f47049b;
        return aVar.f47048a;
    }

    /* access modifiers changed from: protected */
    public synchronized void m(long j10) {
        while (this.f47047d > j10) {
            Iterator it = this.f47044a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f47047d -= (long) aVar.f47049b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f47048a);
        }
    }

    /* access modifiers changed from: protected */
    public void j(Object obj, Object obj2) {
    }
}
