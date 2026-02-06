package com.facebook.imagepipeline.memory;

import T5.k;
import T5.m;
import W5.d;
import W5.f;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import f7.E;
import f7.F;
import java.util.Set;

public abstract class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Class f39737a;

    /* renamed from: b  reason: collision with root package name */
    final d f39738b;

    /* renamed from: c  reason: collision with root package name */
    final E f39739c;

    /* renamed from: d  reason: collision with root package name */
    final SparseArray f39740d;

    /* renamed from: e  reason: collision with root package name */
    final Set f39741e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39742f;

    /* renamed from: g  reason: collision with root package name */
    final C0628a f39743g;

    /* renamed from: h  reason: collision with root package name */
    final C0628a f39744h;

    /* renamed from: i  reason: collision with root package name */
    private final F f39745i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f39746j;

    /* renamed from: com.facebook.imagepipeline.memory.a$a  reason: collision with other inner class name */
    static class C0628a {

        /* renamed from: a  reason: collision with root package name */
        int f39747a;

        /* renamed from: b  reason: collision with root package name */
        int f39748b;

        C0628a() {
        }

        public void a(int i10) {
            int i11;
            int i12 = this.f39748b;
            if (i12 < i10 || (i11 = this.f39747a) <= 0) {
                U5.a.O("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i10), Integer.valueOf(this.f39748b), Integer.valueOf(this.f39747a));
                return;
            }
            this.f39747a = i11 - 1;
            this.f39748b = i12 - i10;
        }

        public void b(int i10) {
            this.f39747a++;
            this.f39748b += i10;
        }
    }

    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class c extends RuntimeException {
        public c(int i10, int i11, int i12, int i13) {
            super("Pool hard cap violation? Hard cap = " + i10 + " Used size = " + i11 + " Free size = " + i12 + " Request size = " + i13);
        }
    }

    public a(d dVar, E e10, F f10) {
        this.f39737a = getClass();
        this.f39738b = (d) k.g(dVar);
        E e11 = (E) k.g(e10);
        this.f39739c = e11;
        this.f39745i = (F) k.g(f10);
        this.f39740d = new SparseArray();
        if (e11.f43428f) {
            s();
        } else {
            w(new SparseIntArray(0));
        }
        this.f39741e = m.b();
        this.f39744h = new C0628a();
        this.f39743g = new C0628a();
    }

    private synchronized void j() {
        boolean z10;
        try {
            if (u()) {
                if (this.f39744h.f39748b != 0) {
                    z10 = false;
                    k.i(z10);
                }
            }
            z10 = true;
            k.i(z10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private void k(SparseIntArray sparseIntArray) {
        this.f39740d.clear();
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            int keyAt = sparseIntArray.keyAt(i10);
            this.f39740d.put(keyAt, new b(q(keyAt), sparseIntArray.valueAt(i10), 0, this.f39739c.f43428f));
        }
    }

    private synchronized b n(int i10) {
        return (b) this.f39740d.get(i10);
    }

    private synchronized void s() {
        try {
            SparseIntArray sparseIntArray = this.f39739c.f43425c;
            if (sparseIntArray != null) {
                k(sparseIntArray);
                this.f39742f = false;
            } else {
                this.f39742f = true;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private synchronized void w(SparseIntArray sparseIntArray) {
        try {
            k.g(sparseIntArray);
            this.f39740d.clear();
            SparseIntArray sparseIntArray2 = this.f39739c.f43425c;
            if (sparseIntArray2 != null) {
                for (int i10 = 0; i10 < sparseIntArray2.size(); i10++) {
                    int keyAt = sparseIntArray2.keyAt(i10);
                    this.f39740d.put(keyAt, new b(q(keyAt), sparseIntArray2.valueAt(i10), sparseIntArray.get(keyAt, 0), this.f39739c.f43428f));
                }
                this.f39742f = false;
            } else {
                this.f39742f = true;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private void x() {
        if (U5.a.w(2)) {
            U5.a.B(this.f39737a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f39743g.f39747a), Integer.valueOf(this.f39743g.f39748b), Integer.valueOf(this.f39744h.f39747a), Integer.valueOf(this.f39744h.f39748b));
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void A() {
        if (u()) {
            z(this.f39739c.f43424b);
        }
    }

    public void a(Object obj) {
        k.g(obj);
        int p10 = p(obj);
        int q10 = q(p10);
        synchronized (this) {
            try {
                b n10 = n(p10);
                if (!this.f39741e.remove(obj)) {
                    U5.a.k(this.f39737a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(p10));
                    l(obj);
                    this.f39745i.b(q10);
                } else {
                    if (n10 != null && !n10.f() && !u()) {
                        if (v(obj)) {
                            n10.h(obj);
                            this.f39744h.b(q10);
                            this.f39743g.a(q10);
                            this.f39745i.c(q10);
                            if (U5.a.w(2)) {
                                U5.a.z(this.f39737a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(p10));
                            }
                        }
                    }
                    if (n10 != null) {
                        n10.b();
                    }
                    if (U5.a.w(2)) {
                        U5.a.z(this.f39737a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(p10));
                    }
                    l(obj);
                    this.f39743g.a(q10);
                    this.f39745i.b(q10);
                }
                x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = h(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.f39743g.a(r2);
        r3 = m(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r3 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r3.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        T5.p.c(r0);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        T5.k.i(r4.f39741e.add(r0));
        A();
        r4.f39745i.d(r2);
        x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (U5.a.w(2) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        U5.a.z(r4.f39737a, "get (alloc) (object, size) = (%x, %s)", java.lang.Integer.valueOf(java.lang.System.identityHashCode(r0)), java.lang.Integer.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bb, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bf, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(int r5) {
        /*
            r4 = this;
            r4.j()
            int r5 = r4.o(r5)
            monitor-enter(r4)
            com.facebook.imagepipeline.memory.b r0 = r4.m(r5)     // Catch:{ all -> 0x0052 }
            r1 = 2
            if (r0 == 0) goto L_0x0057
            java.lang.Object r2 = r4.r(r0)     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0057
            java.util.Set r5 = r4.f39741e     // Catch:{ all -> 0x0052 }
            boolean r5 = r5.add(r2)     // Catch:{ all -> 0x0052 }
            T5.k.i(r5)     // Catch:{ all -> 0x0052 }
            int r5 = r4.p(r2)     // Catch:{ all -> 0x0052 }
            int r0 = r4.q(r5)     // Catch:{ all -> 0x0052 }
            com.facebook.imagepipeline.memory.a$a r3 = r4.f39743g     // Catch:{ all -> 0x0052 }
            r3.b(r0)     // Catch:{ all -> 0x0052 }
            com.facebook.imagepipeline.memory.a$a r3 = r4.f39744h     // Catch:{ all -> 0x0052 }
            r3.a(r0)     // Catch:{ all -> 0x0052 }
            f7.F r3 = r4.f39745i     // Catch:{ all -> 0x0052 }
            r3.e(r0)     // Catch:{ all -> 0x0052 }
            r4.x()     // Catch:{ all -> 0x0052 }
            boolean r0 = U5.a.w(r1)     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0055
            java.lang.Class r0 = r4.f39737a     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = "get (reuse) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r2)     // Catch:{ all -> 0x0052 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0052 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0052 }
            U5.a.z(r0, r1, r3, r5)     // Catch:{ all -> 0x0052 }
            goto L_0x0055
        L_0x0052:
            r5 = move-exception
            goto L_0x00d2
        L_0x0055:
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            return r2
        L_0x0057:
            int r2 = r4.q(r5)     // Catch:{ all -> 0x0052 }
            boolean r3 = r4.i(r2)     // Catch:{ all -> 0x0052 }
            if (r3 == 0) goto L_0x00c0
            com.facebook.imagepipeline.memory.a$a r3 = r4.f39743g     // Catch:{ all -> 0x0052 }
            r3.b(r2)     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x006b
            r0.e()     // Catch:{ all -> 0x0052 }
        L_0x006b:
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r4.h(r5)     // Catch:{ all -> 0x0071 }
            goto L_0x0089
        L_0x0071:
            r0 = move-exception
            monitor-enter(r4)
            com.facebook.imagepipeline.memory.a$a r3 = r4.f39743g     // Catch:{ all -> 0x0082 }
            r3.a(r2)     // Catch:{ all -> 0x0082 }
            com.facebook.imagepipeline.memory.b r3 = r4.m(r5)     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x0084
            r3.b()     // Catch:{ all -> 0x0082 }
            goto L_0x0084
        L_0x0082:
            r5 = move-exception
            goto L_0x00be
        L_0x0084:
            monitor-exit(r4)     // Catch:{ all -> 0x0082 }
            T5.p.c(r0)
            r0 = 0
        L_0x0089:
            monitor-enter(r4)
            java.util.Set r3 = r4.f39741e     // Catch:{ all -> 0x00b8 }
            boolean r3 = r3.add(r0)     // Catch:{ all -> 0x00b8 }
            T5.k.i(r3)     // Catch:{ all -> 0x00b8 }
            r4.A()     // Catch:{ all -> 0x00b8 }
            f7.F r3 = r4.f39745i     // Catch:{ all -> 0x00b8 }
            r3.d(r2)     // Catch:{ all -> 0x00b8 }
            r4.x()     // Catch:{ all -> 0x00b8 }
            boolean r1 = U5.a.w(r1)     // Catch:{ all -> 0x00b8 }
            if (r1 == 0) goto L_0x00ba
            java.lang.Class r1 = r4.f39737a     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = "get (alloc) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00b8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00b8 }
            U5.a.z(r1, r2, r3, r5)     // Catch:{ all -> 0x00b8 }
            goto L_0x00ba
        L_0x00b8:
            r5 = move-exception
            goto L_0x00bc
        L_0x00ba:
            monitor-exit(r4)     // Catch:{ all -> 0x00b8 }
            return r0
        L_0x00bc:
            monitor-exit(r4)     // Catch:{ all -> 0x00b8 }
            throw r5
        L_0x00be:
            monitor-exit(r4)     // Catch:{ all -> 0x0082 }
            throw r5
        L_0x00c0:
            com.facebook.imagepipeline.memory.a$c r5 = new com.facebook.imagepipeline.memory.a$c     // Catch:{ all -> 0x0052 }
            f7.E r0 = r4.f39739c     // Catch:{ all -> 0x0052 }
            int r0 = r0.f43423a     // Catch:{ all -> 0x0052 }
            com.facebook.imagepipeline.memory.a$a r1 = r4.f39743g     // Catch:{ all -> 0x0052 }
            int r1 = r1.f39748b     // Catch:{ all -> 0x0052 }
            com.facebook.imagepipeline.memory.a$a r3 = r4.f39744h     // Catch:{ all -> 0x0052 }
            int r3 = r3.f39748b     // Catch:{ all -> 0x0052 }
            r5.<init>(r0, r1, r3, r2)     // Catch:{ all -> 0x0052 }
            throw r5     // Catch:{ all -> 0x0052 }
        L_0x00d2:
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.a.get(int):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public abstract Object h(int i10);

    /* access modifiers changed from: package-private */
    public synchronized boolean i(int i10) {
        if (this.f39746j) {
            return true;
        }
        E e10 = this.f39739c;
        int i11 = e10.f43423a;
        int i12 = this.f39743g.f39748b;
        if (i10 > i11 - i12) {
            this.f39745i.g();
            return false;
        }
        int i13 = e10.f43424b;
        if (i10 > i13 - (i12 + this.f39744h.f39748b)) {
            z(i13 - i10);
        }
        if (i10 <= i11 - (this.f39743g.f39748b + this.f39744h.f39748b)) {
            return true;
        }
        this.f39745i.g();
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void l(Object obj);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.imagepipeline.memory.b m(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray r0 = r3.f39740d     // Catch:{ all -> 0x0023 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0023 }
            com.facebook.imagepipeline.memory.b r0 = (com.facebook.imagepipeline.memory.b) r0     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0030
            boolean r1 = r3.f39742f     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0010
            goto L_0x0030
        L_0x0010:
            r0 = 2
            boolean r0 = U5.a.w(r0)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0025
            java.lang.Class r0 = r3.f39737a     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "creating new bucket %s"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0023 }
            U5.a.y(r0, r1, r2)     // Catch:{ all -> 0x0023 }
            goto L_0x0025
        L_0x0023:
            r4 = move-exception
            goto L_0x0032
        L_0x0025:
            com.facebook.imagepipeline.memory.b r0 = r3.y(r4)     // Catch:{ all -> 0x0023 }
            android.util.SparseArray r1 = r3.f39740d     // Catch:{ all -> 0x0023 }
            r1.put(r4, r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r3)
            return r0
        L_0x0030:
            monitor-exit(r3)
            return r0
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0023 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.a.m(int):com.facebook.imagepipeline.memory.b");
    }

    /* access modifiers changed from: protected */
    public abstract int o(int i10);

    /* access modifiers changed from: protected */
    public abstract int p(Object obj);

    /* access modifiers changed from: protected */
    public abstract int q(int i10);

    /* access modifiers changed from: protected */
    public synchronized Object r(b bVar) {
        return bVar.c();
    }

    /* access modifiers changed from: protected */
    public void t() {
        this.f39738b.a(this);
        this.f39745i.f(this);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean u() {
        boolean z10;
        if (this.f39743g.f39748b + this.f39744h.f39748b > this.f39739c.f43424b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f39745i.a();
        }
        return z10;
    }

    /* access modifiers changed from: protected */
    public boolean v(Object obj) {
        k.g(obj);
        return true;
    }

    /* access modifiers changed from: package-private */
    public b y(int i10) {
        return new b(q(i10), a.e.API_PRIORITY_OTHER, 0, this.f39739c.f43428f);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void z(int r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.a$a r0 = r7.f39743g     // Catch:{ all -> 0x0037 }
            int r0 = r0.f39748b     // Catch:{ all -> 0x0037 }
            com.facebook.imagepipeline.memory.a$a r1 = r7.f39744h     // Catch:{ all -> 0x0037 }
            int r1 = r1.f39748b     // Catch:{ all -> 0x0037 }
            int r0 = r0 + r1
            int r0 = r0 - r8
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0037 }
            if (r0 > 0) goto L_0x0013
            monitor-exit(r7)
            return
        L_0x0013:
            r1 = 2
            boolean r2 = U5.a.w(r1)     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0039
            java.lang.Class r2 = r7.f39737a     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0037 }
            com.facebook.imagepipeline.memory.a$a r5 = r7.f39743g     // Catch:{ all -> 0x0037 }
            int r5 = r5.f39748b     // Catch:{ all -> 0x0037 }
            com.facebook.imagepipeline.memory.a$a r6 = r7.f39744h     // Catch:{ all -> 0x0037 }
            int r6 = r6.f39748b     // Catch:{ all -> 0x0037 }
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0037 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0037 }
            U5.a.A(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0037 }
            goto L_0x0039
        L_0x0037:
            r8 = move-exception
            goto L_0x0091
        L_0x0039:
            r7.x()     // Catch:{ all -> 0x0037 }
            r2 = 0
        L_0x003d:
            android.util.SparseArray r3 = r7.f39740d     // Catch:{ all -> 0x0037 }
            int r3 = r3.size()     // Catch:{ all -> 0x0037 }
            if (r2 >= r3) goto L_0x006e
            if (r0 > 0) goto L_0x0048
            goto L_0x006e
        L_0x0048:
            android.util.SparseArray r3 = r7.f39740d     // Catch:{ all -> 0x0037 }
            java.lang.Object r3 = r3.valueAt(r2)     // Catch:{ all -> 0x0037 }
            com.facebook.imagepipeline.memory.b r3 = (com.facebook.imagepipeline.memory.b) r3     // Catch:{ all -> 0x0037 }
            java.lang.Object r3 = T5.k.g(r3)     // Catch:{ all -> 0x0037 }
            com.facebook.imagepipeline.memory.b r3 = (com.facebook.imagepipeline.memory.b) r3     // Catch:{ all -> 0x0037 }
        L_0x0056:
            if (r0 <= 0) goto L_0x006b
            java.lang.Object r4 = r3.g()     // Catch:{ all -> 0x0037 }
            if (r4 != 0) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            r7.l(r4)     // Catch:{ all -> 0x0037 }
            int r4 = r3.f39749a     // Catch:{ all -> 0x0037 }
            int r0 = r0 - r4
            com.facebook.imagepipeline.memory.a$a r5 = r7.f39744h     // Catch:{ all -> 0x0037 }
            r5.a(r4)     // Catch:{ all -> 0x0037 }
            goto L_0x0056
        L_0x006b:
            int r2 = r2 + 1
            goto L_0x003d
        L_0x006e:
            r7.x()     // Catch:{ all -> 0x0037 }
            boolean r0 = U5.a.w(r1)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x008f
            java.lang.Class r0 = r7.f39737a     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = "trimToSize: TargetSize = %d; Final Size = %d"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0037 }
            com.facebook.imagepipeline.memory.a$a r2 = r7.f39743g     // Catch:{ all -> 0x0037 }
            int r2 = r2.f39748b     // Catch:{ all -> 0x0037 }
            com.facebook.imagepipeline.memory.a$a r3 = r7.f39744h     // Catch:{ all -> 0x0037 }
            int r3 = r3.f39748b     // Catch:{ all -> 0x0037 }
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0037 }
            U5.a.z(r0, r1, r8, r2)     // Catch:{ all -> 0x0037 }
        L_0x008f:
            monitor-exit(r7)
            return
        L_0x0091:
            monitor-exit(r7)     // Catch:{ all -> 0x0037 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.a.z(int):void");
    }

    public a(d dVar, E e10, F f10, boolean z10) {
        this(dVar, e10, f10);
        this.f39746j = z10;
    }
}
