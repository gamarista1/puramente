package Eb;

import dc.C4942a;
import dc.C4943b;
import dc.C4944c;
import dc.C4945d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class u implements C4945d, C4944c {

    /* renamed from: a  reason: collision with root package name */
    private final Map f50743a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue f50744b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f50745c;

    u(Executor executor) {
        this.f50745c = executor;
    }

    private synchronized Set g(C4942a aVar) {
        Set set;
        try {
            Map map = (Map) this.f50743a.get(aVar.b());
            if (map == null) {
                set = Collections.emptySet();
            } else {
                set = map.entrySet();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return set;
    }

    public void a(Class cls, C4943b bVar) {
        c(cls, this.f50745c, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b(java.lang.Class r2, dc.C4943b r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            Eb.D.b(r2)     // Catch:{ all -> 0x0028 }
            Eb.D.b(r3)     // Catch:{ all -> 0x0028 }
            java.util.Map r0 = r1.f50743a     // Catch:{ all -> 0x0028 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map r0 = r1.f50743a     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0028 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0028 }
            r0.remove(r3)     // Catch:{ all -> 0x0028 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x002a
            java.util.Map r3 = r1.f50743a     // Catch:{ all -> 0x0028 }
            r3.remove(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            r2 = move-exception
            goto L_0x002c
        L_0x002a:
            monitor-exit(r1)
            return
        L_0x002c:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Eb.u.b(java.lang.Class, dc.b):void");
    }

    public synchronized void c(Class cls, Executor executor, C4943b bVar) {
        try {
            D.b(cls);
            D.b(bVar);
            D.b(executor);
            if (!this.f50743a.containsKey(cls)) {
                this.f50743a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f50743a.get(cls)).put(bVar, executor);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r0 = g(r5).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new Eb.t(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(dc.C4942a r5) {
        /*
            r4 = this;
            Eb.D.b(r5)
            monitor-enter(r4)
            java.util.Queue r0 = r4.f50744b     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000f
            r0.add(r5)     // Catch:{ all -> 0x000d }
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            return
        L_0x000d:
            r5 = move-exception
            goto L_0x0034
        L_0x000f:
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            java.util.Set r0 = r4.g(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            Eb.t r3 = new Eb.t
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0018
        L_0x0033:
            return
        L_0x0034:
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Eb.u.d(dc.a):void");
    }

    /* access modifiers changed from: package-private */
    public void f() {
        Queue<C4942a> queue;
        synchronized (this) {
            try {
                queue = this.f50744b;
                if (queue != null) {
                    this.f50744b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (queue != null) {
            for (C4942a d10 : queue) {
                d(d10);
            }
        }
    }
}
