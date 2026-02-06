package androidx.collection;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import u.C2665b;
import u.C2666c;
import u.C2667d;

/* renamed from: androidx.collection.x  reason: case insensitive filesystem */
public class C1609x {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final C2665b lock;
    private final C2666c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public C1609x(int i10) {
        boolean z10;
        this.maxSize = i10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C2667d.a("maxSize <= 0");
        }
        this.map = new C2666c(0, 0.75f);
        this.lock = new C2665b();
    }

    private final int a(Object obj, Object obj2) {
        boolean z10;
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C2667d.b("Negative size: " + obj + '=' + obj2);
        }
        return sizeOf;
    }

    /* access modifiers changed from: protected */
    public Object create(Object obj) {
        C6496s.h(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        return null;
    }

    public final int createCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.createCount;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        C6496s.h(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(obj2, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.evictionCount;
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r0 = create(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r1 = r5.lock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.createCount++;
        r2 = r5.map.d(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r2 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r5.map.d(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r5.size += a(r6, r0);
        r3 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        entryRemoved(false, r6, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        trimToSize(r5.maxSize);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            u.b r0 = r5.lock
            monitor-enter(r0)
            u.c r1 = r5.map     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r1.a(r6)     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            int r6 = r5.hitCount     // Catch:{ all -> 0x0018 }
            int r6 = r6 + 1
            r5.hitCount = r6     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return r1
        L_0x0018:
            r6 = move-exception
            goto L_0x005e
        L_0x001a:
            int r1 = r5.missCount     // Catch:{ all -> 0x0018 }
            int r1 = r1 + 1
            r5.missCount = r1     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            java.lang.Object r0 = r5.create(r6)
            if (r0 != 0) goto L_0x0029
            r6 = 0
            return r6
        L_0x0029:
            u.b r1 = r5.lock
            monitor-enter(r1)
            int r2 = r5.createCount     // Catch:{ all -> 0x0040 }
            int r2 = r2 + 1
            r5.createCount = r2     // Catch:{ all -> 0x0040 }
            u.c r2 = r5.map     // Catch:{ all -> 0x0040 }
            java.lang.Object r2 = r2.d(r6, r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0042
            u.c r3 = r5.map     // Catch:{ all -> 0x0040 }
            r3.d(r6, r2)     // Catch:{ all -> 0x0040 }
            goto L_0x004d
        L_0x0040:
            r6 = move-exception
            goto L_0x005c
        L_0x0042:
            int r3 = r5.size     // Catch:{ all -> 0x0040 }
            int r4 = r5.a(r6, r0)     // Catch:{ all -> 0x0040 }
            int r3 = r3 + r4
            r5.size = r3     // Catch:{ all -> 0x0040 }
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x0040 }
        L_0x004d:
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0056
            r1 = 0
            r5.entryRemoved(r1, r6, r0, r2)
            r0 = r2
            goto L_0x005b
        L_0x0056:
            int r6 = r5.maxSize
            r5.trimToSize(r6)
        L_0x005b:
            return r0
        L_0x005c:
            monitor-exit(r1)
            throw r6
        L_0x005e:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1609x.get(java.lang.Object):java.lang.Object");
    }

    public final int hitCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.hitCount;
        }
        return i10;
    }

    public final int maxSize() {
        int i10;
        synchronized (this.lock) {
            i10 = this.maxSize;
        }
        return i10;
    }

    public final int missCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.missCount;
        }
        return i10;
    }

    public final Object put(Object obj, Object obj2) {
        Object d10;
        C6496s.h(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(obj2, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += a(obj, obj2);
                d10 = this.map.d(obj, obj2);
                if (d10 != null) {
                    this.size -= a(obj, d10);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (d10 != null) {
            entryRemoved(false, obj, d10, obj2);
        }
        trimToSize(this.maxSize);
        return d10;
    }

    public final int putCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.putCount;
        }
        return i10;
    }

    public final Object remove(Object obj) {
        Object e10;
        C6496s.h(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        synchronized (this.lock) {
            try {
                e10 = this.map.e(obj);
                if (e10 != null) {
                    this.size -= a(obj, e10);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (e10 != null) {
            entryRemoved(false, obj, e10, (Object) null);
        }
        return e10;
    }

    public void resize(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C2667d.a("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i10;
            C6514M m10 = C6514M.f71813a;
        }
        trimToSize(i10);
    }

    public final int size() {
        int i10;
        synchronized (this.lock) {
            i10 = this.size;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public int sizeOf(Object obj, Object obj2) {
        C6496s.h(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(obj2, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.b().size());
            for (Map.Entry entry : this.map.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        int i10;
        String str;
        synchronized (this.lock) {
            try {
                int i11 = this.hitCount;
                int i12 = this.missCount + i11;
                if (i12 != 0) {
                    i10 = (i11 * 100) / i12;
                } else {
                    i10 = 0;
                }
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + i10 + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001c A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:29:0x0061 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L_0x0000:
            u.b r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch:{ all -> 0x0015 }
            r2 = 1
            if (r1 < 0) goto L_0x0019
            u.c r1 = r6.map     // Catch:{ all -> 0x0015 }
            boolean r1 = r1.c()     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0017
            int r1 = r6.size     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0019
            goto L_0x0017
        L_0x0015:
            r7 = move-exception
            goto L_0x0063
        L_0x0017:
            r1 = r2
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            if (r1 != 0) goto L_0x0021
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            u.C2667d.b(r1)     // Catch:{ all -> 0x0015 }
        L_0x0021:
            int r1 = r6.size     // Catch:{ all -> 0x0015 }
            if (r1 <= r7) goto L_0x0061
            u.c r1 = r6.map     // Catch:{ all -> 0x0015 }
            boolean r1 = r1.c()     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x002e
            goto L_0x0061
        L_0x002e:
            u.c r1 = r6.map     // Catch:{ all -> 0x0015 }
            java.util.Set r1 = r1.b()     // Catch:{ all -> 0x0015 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = mf.C6565s.p0(r1)     // Catch:{ all -> 0x0015 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0040
            monitor-exit(r0)
            return
        L_0x0040:
            java.lang.Object r3 = r1.getKey()     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0015 }
            u.c r4 = r6.map     // Catch:{ all -> 0x0015 }
            r4.e(r3)     // Catch:{ all -> 0x0015 }
            int r4 = r6.size     // Catch:{ all -> 0x0015 }
            int r5 = r6.a(r3, r1)     // Catch:{ all -> 0x0015 }
            int r4 = r4 - r5
            r6.size = r4     // Catch:{ all -> 0x0015 }
            int r4 = r6.evictionCount     // Catch:{ all -> 0x0015 }
            int r4 = r4 + r2
            r6.evictionCount = r4     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)
            r0 = 0
            r6.entryRemoved(r2, r3, r1, r0)
            goto L_0x0000
        L_0x0061:
            monitor-exit(r0)
            return
        L_0x0063:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1609x.trimToSize(int):void");
    }
}
