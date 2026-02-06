package U0;

import Y0.q;
import Y0.r;
import java.util.HashMap;
import java.util.LinkedHashSet;
import lf.C6514M;

public class b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final r f6322a = q.a();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f6323b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet f6324c;

    /* renamed from: d  reason: collision with root package name */
    private int f6325d;

    /* renamed from: e  reason: collision with root package name */
    private int f6326e;

    /* renamed from: f  reason: collision with root package name */
    private int f6327f;

    /* renamed from: g  reason: collision with root package name */
    private int f6328g;

    /* renamed from: h  reason: collision with root package name */
    private int f6329h;

    /* renamed from: i  reason: collision with root package name */
    private int f6330i;

    /* renamed from: j  reason: collision with root package name */
    private int f6331j;

    public b(int i10) {
        if (i10 > 0) {
            this.f6326e = i10;
            this.f6323b = new HashMap(0, 0.75f);
            this.f6324c = new LinkedHashSet();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private final int g(Object obj, Object obj2) {
        int i10 = i(obj, obj2);
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    /* access modifiers changed from: protected */
    public Object b(Object obj) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r2 = r5.f6322a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.f6328g++;
        r3 = r5.f6323b.put(r6, r0);
        r5.f6324c.remove(r6);
        r5.f6324c.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r3 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r5.f6323b.put(r6, r3);
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r5.f6325d = h() + g(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        r3 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r1 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        c(false, r6, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        j(r5.f6326e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.Object r6) {
        /*
            r5 = this;
            Y0.r r0 = r5.f6322a
            monitor-enter(r0)
            java.util.HashMap r1 = r5.f6323b     // Catch:{ all -> 0x001d }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            java.util.LinkedHashSet r2 = r5.f6324c     // Catch:{ all -> 0x001d }
            r2.remove(r6)     // Catch:{ all -> 0x001d }
            java.util.LinkedHashSet r2 = r5.f6324c     // Catch:{ all -> 0x001d }
            r2.add(r6)     // Catch:{ all -> 0x001d }
            int r6 = r5.f6330i     // Catch:{ all -> 0x001d }
            int r6 = r6 + 1
            r5.f6330i = r6     // Catch:{ all -> 0x001d }
            monitor-exit(r0)
            return r1
        L_0x001d:
            r6 = move-exception
            goto L_0x006f
        L_0x001f:
            int r2 = r5.f6331j     // Catch:{ all -> 0x001d }
            int r2 = r2 + 1
            r5.f6331j = r2     // Catch:{ all -> 0x001d }
            monitor-exit(r0)
            java.lang.Object r0 = r5.b(r6)
            if (r0 != 0) goto L_0x002e
            r6 = 0
            return r6
        L_0x002e:
            Y0.r r2 = r5.f6322a
            monitor-enter(r2)
            int r3 = r5.f6328g     // Catch:{ all -> 0x0050 }
            int r3 = r3 + 1
            r5.f6328g = r3     // Catch:{ all -> 0x0050 }
            java.util.HashMap r3 = r5.f6323b     // Catch:{ all -> 0x0050 }
            java.lang.Object r3 = r3.put(r6, r0)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashSet r4 = r5.f6324c     // Catch:{ all -> 0x0050 }
            r4.remove(r6)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashSet r4 = r5.f6324c     // Catch:{ all -> 0x0050 }
            r4.add(r6)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x0052
            java.util.HashMap r1 = r5.f6323b     // Catch:{ all -> 0x0050 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0050 }
            r1 = r3
            goto L_0x005d
        L_0x0050:
            r6 = move-exception
            goto L_0x006d
        L_0x0052:
            int r3 = r5.h()     // Catch:{ all -> 0x0050 }
            int r4 = r5.g(r6, r0)     // Catch:{ all -> 0x0050 }
            int r3 = r3 + r4
            r5.f6325d = r3     // Catch:{ all -> 0x0050 }
        L_0x005d:
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x0050 }
            monitor-exit(r2)
            if (r1 == 0) goto L_0x0067
            r2 = 0
            r5.c(r2, r6, r0, r1)
            return r1
        L_0x0067:
            int r6 = r5.f6326e
            r5.j(r6)
            return r0
        L_0x006d:
            monitor-exit(r2)
            throw r6
        L_0x006f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.b.d(java.lang.Object):java.lang.Object");
    }

    public final Object e(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.f6322a) {
            try {
                this.f6327f++;
                this.f6325d = h() + g(obj, obj2);
                put = this.f6323b.put(obj, obj2);
                if (put != null) {
                    this.f6325d = h() - g(obj, put);
                }
                if (this.f6324c.contains(obj)) {
                    this.f6324c.remove(obj);
                }
                this.f6324c.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (put != null) {
            c(false, obj, put, obj2);
        }
        j(this.f6326e);
        return put;
    }

    public final Object f(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.f6322a) {
            try {
                remove = this.f6323b.remove(obj);
                this.f6324c.remove(obj);
                if (remove != null) {
                    this.f6325d = h() - g(obj, remove);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (remove != null) {
            c(false, obj, remove, (Object) null);
        }
        return remove;
    }

    public final int h() {
        int i10;
        synchronized (this.f6322a) {
            i10 = this.f6325d;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public int i(Object obj, Object obj2) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(int r8) {
        /*
            r7 = this;
        L_0x0000:
            Y0.r r0 = r7.f6322a
            monitor-enter(r0)
            int r1 = r7.h()     // Catch:{ all -> 0x0018 }
            if (r1 < 0) goto L_0x008d
            java.util.HashMap r1 = r7.f6323b     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001b
            int r1 = r7.h()     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x008d
            goto L_0x001b
        L_0x0018:
            r8 = move-exception
            goto L_0x0095
        L_0x001b:
            java.util.HashMap r1 = r7.f6323b     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            java.util.LinkedHashSet r2 = r7.f6324c     // Catch:{ all -> 0x0018 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0018 }
            if (r1 != r2) goto L_0x008d
            int r1 = r7.h()     // Catch:{ all -> 0x0018 }
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L_0x0078
            java.util.HashMap r1 = r7.f6323b     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0078
            java.util.LinkedHashSet r1 = r7.f6324c     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = mf.C6565s.n0(r1)     // Catch:{ all -> 0x0018 }
            java.util.HashMap r4 = r7.f6323b     // Catch:{ all -> 0x0018 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0018 }
            if (r4 == 0) goto L_0x0070
            java.util.HashMap r5 = r7.f6323b     // Catch:{ all -> 0x0018 }
            java.util.Map r5 = kotlin.jvm.internal.V.d(r5)     // Catch:{ all -> 0x0018 }
            r5.remove(r1)     // Catch:{ all -> 0x0018 }
            java.util.LinkedHashSet r5 = r7.f6324c     // Catch:{ all -> 0x0018 }
            java.util.Collection r5 = kotlin.jvm.internal.V.a(r5)     // Catch:{ all -> 0x0018 }
            r5.remove(r1)     // Catch:{ all -> 0x0018 }
            int r5 = r7.h()     // Catch:{ all -> 0x0018 }
            kotlin.jvm.internal.C6496s.e(r1)     // Catch:{ all -> 0x0018 }
            kotlin.jvm.internal.C6496s.e(r4)     // Catch:{ all -> 0x0018 }
            int r6 = r7.g(r1, r4)     // Catch:{ all -> 0x0018 }
            int r5 = r5 - r6
            r7.f6325d = r5     // Catch:{ all -> 0x0018 }
            int r5 = r7.f6329h     // Catch:{ all -> 0x0018 }
            int r5 = r5 + r2
            r7.f6329h = r5     // Catch:{ all -> 0x0018 }
            goto L_0x007a
        L_0x0070:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0018 }
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch:{ all -> 0x0018 }
            throw r8     // Catch:{ all -> 0x0018 }
        L_0x0078:
            r1 = r3
            r4 = r1
        L_0x007a:
            lf.M r5 = lf.C6514M.f71813a     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            if (r1 != 0) goto L_0x0082
            if (r4 != 0) goto L_0x0082
            return
        L_0x0082:
            kotlin.jvm.internal.C6496s.e(r1)
            kotlin.jvm.internal.C6496s.e(r4)
            r7.c(r2, r1, r4, r3)
            goto L_0x0000
        L_0x008d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0018 }
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch:{ all -> 0x0018 }
            throw r8     // Catch:{ all -> 0x0018 }
        L_0x0095:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.b.j(int):void");
    }

    public String toString() {
        int i10;
        String str;
        synchronized (this.f6322a) {
            try {
                int i11 = this.f6330i;
                int i12 = this.f6331j + i11;
                if (i12 != 0) {
                    i10 = (i11 * 100) / i12;
                } else {
                    i10 = 0;
                }
                str = "LruCache[maxSize=" + this.f6326e + ",hits=" + this.f6330i + ",misses=" + this.f6331j + ",hitRate=" + i10 + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public void c(boolean z10, Object obj, Object obj2, Object obj3) {
    }
}
