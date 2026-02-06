package l2;

import i2.C2076a;
import java.util.ArrayDeque;

public abstract class h implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f23531a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f23532b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque f23533c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque f23534d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    private final f[] f23535e;

    /* renamed from: f  reason: collision with root package name */
    private final g[] f23536f;

    /* renamed from: g  reason: collision with root package name */
    private int f23537g;

    /* renamed from: h  reason: collision with root package name */
    private int f23538h;

    /* renamed from: i  reason: collision with root package name */
    private f f23539i;

    /* renamed from: j  reason: collision with root package name */
    private e f23540j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f23541k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f23542l;

    /* renamed from: m  reason: collision with root package name */
    private int f23543m;

    /* renamed from: n  reason: collision with root package name */
    private long f23544n = -9223372036854775807L;

    class a extends Thread {
        a(String str) {
            super(str);
        }

        public void run() {
            h.this.v();
        }
    }

    protected h(f[] fVarArr, g[] gVarArr) {
        this.f23535e = fVarArr;
        this.f23537g = fVarArr.length;
        for (int i10 = 0; i10 < this.f23537g; i10++) {
            this.f23535e[i10] = i();
        }
        this.f23536f = gVarArr;
        this.f23538h = gVarArr.length;
        for (int i11 = 0; i11 < this.f23538h; i11++) {
            this.f23536f[i11] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f23531a = aVar;
        aVar.start();
    }

    private boolean h() {
        if (this.f23533c.isEmpty() || this.f23538h <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r1.m() == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r3.f(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r3.f23528b = r1.f23522f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r1.o() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r3.f(134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (p(r1.f23522f) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r3.f23530d = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = l(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r0 = k(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        r0 = k(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f23532b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r8.f23542l     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0016
            boolean r1 = r8.h()     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0016
            java.lang.Object r1 = r8.f23532b     // Catch:{ all -> 0x0013 }
            r1.wait()     // Catch:{ all -> 0x0013 }
            goto L_0x0003
        L_0x0013:
            r1 = move-exception
            goto L_0x00a0
        L_0x0016:
            boolean r1 = r8.f23542l     // Catch:{ all -> 0x0013 }
            r2 = 0
            if (r1 == 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return r2
        L_0x001d:
            java.util.ArrayDeque r1 = r8.f23533c     // Catch:{ all -> 0x0013 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0013 }
            l2.f r1 = (l2.f) r1     // Catch:{ all -> 0x0013 }
            l2.g[] r3 = r8.f23536f     // Catch:{ all -> 0x0013 }
            int r4 = r8.f23538h     // Catch:{ all -> 0x0013 }
            r5 = 1
            int r4 = r4 - r5
            r8.f23538h = r4     // Catch:{ all -> 0x0013 }
            r3 = r3[r4]     // Catch:{ all -> 0x0013 }
            boolean r4 = r8.f23541k     // Catch:{ all -> 0x0013 }
            r8.f23541k = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            boolean r0 = r1.m()
            if (r0 == 0) goto L_0x003f
            r0 = 4
            r3.f(r0)
            goto L_0x0074
        L_0x003f:
            long r6 = r1.f23522f
            r3.f23528b = r6
            boolean r0 = r1.o()
            if (r0 == 0) goto L_0x004e
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r3.f(r0)
        L_0x004e:
            long r6 = r1.f23522f
            boolean r0 = r8.p(r6)
            if (r0 != 0) goto L_0x0058
            r3.f23530d = r5
        L_0x0058:
            l2.e r0 = r8.l(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0063, OutOfMemoryError -> 0x005d }
            goto L_0x0068
        L_0x005d:
            r0 = move-exception
            l2.e r0 = r8.k(r0)
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            l2.e r0 = r8.k(r0)
        L_0x0068:
            if (r0 == 0) goto L_0x0074
            java.lang.Object r4 = r8.f23532b
            monitor-enter(r4)
            r8.f23540j = r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return r2
        L_0x0071:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r0
        L_0x0074:
            java.lang.Object r4 = r8.f23532b
            monitor-enter(r4)
            boolean r0 = r8.f23541k     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0081
            r3.t()     // Catch:{ all -> 0x007f }
            goto L_0x0099
        L_0x007f:
            r0 = move-exception
            goto L_0x009e
        L_0x0081:
            boolean r0 = r3.f23530d     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x008e
            int r0 = r8.f23543m     // Catch:{ all -> 0x007f }
            int r0 = r0 + r5
            r8.f23543m = r0     // Catch:{ all -> 0x007f }
            r3.t()     // Catch:{ all -> 0x007f }
            goto L_0x0099
        L_0x008e:
            int r0 = r8.f23543m     // Catch:{ all -> 0x007f }
            r3.f23529c = r0     // Catch:{ all -> 0x007f }
            r8.f23543m = r2     // Catch:{ all -> 0x007f }
            java.util.ArrayDeque r0 = r8.f23534d     // Catch:{ all -> 0x007f }
            r0.addLast(r3)     // Catch:{ all -> 0x007f }
        L_0x0099:
            r8.s(r1)     // Catch:{ all -> 0x007f }
            monitor-exit(r4)     // Catch:{ all -> 0x007f }
            return r5
        L_0x009e:
            monitor-exit(r4)     // Catch:{ all -> 0x007f }
            throw r0
        L_0x00a0:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.h.m():boolean");
    }

    private void q() {
        if (h()) {
            this.f23532b.notify();
        }
    }

    private void r() {
        e eVar = this.f23540j;
        if (eVar != null) {
            throw eVar;
        }
    }

    private void s(f fVar) {
        fVar.i();
        f[] fVarArr = this.f23535e;
        int i10 = this.f23537g;
        this.f23537g = i10 + 1;
        fVarArr[i10] = fVar;
    }

    private void u(g gVar) {
        gVar.i();
        g[] gVarArr = this.f23536f;
        int i10 = this.f23538h;
        this.f23538h = i10 + 1;
        gVarArr[i10] = gVar;
    }

    /* access modifiers changed from: private */
    public void v() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m());
    }

    /* renamed from: e */
    public final void c(f fVar) {
        boolean z10;
        synchronized (this.f23532b) {
            r();
            if (fVar == this.f23539i) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.a(z10);
            this.f23533c.addLast(fVar);
            q();
            this.f23539i = null;
        }
    }

    public final void f(long j10) {
        boolean z10;
        synchronized (this.f23532b) {
            try {
                if (this.f23537g != this.f23535e.length) {
                    if (!this.f23541k) {
                        z10 = false;
                        C2076a.g(z10);
                        this.f23544n = j10;
                    }
                }
                z10 = true;
                C2076a.g(z10);
                this.f23544n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void flush() {
        synchronized (this.f23532b) {
            try {
                this.f23541k = true;
                this.f23543m = 0;
                f fVar = this.f23539i;
                if (fVar != null) {
                    s(fVar);
                    this.f23539i = null;
                }
                while (!this.f23533c.isEmpty()) {
                    s((f) this.f23533c.removeFirst());
                }
                while (!this.f23534d.isEmpty()) {
                    ((g) this.f23534d.removeFirst()).t();
                }
            } finally {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract f i();

    /* access modifiers changed from: protected */
    public abstract g j();

    /* access modifiers changed from: protected */
    public abstract e k(Throwable th2);

    /* access modifiers changed from: protected */
    public abstract e l(f fVar, g gVar, boolean z10);

    /* renamed from: n */
    public final f d() {
        boolean z10;
        f fVar;
        synchronized (this.f23532b) {
            r();
            if (this.f23539i == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.g(z10);
            int i10 = this.f23537g;
            if (i10 == 0) {
                fVar = null;
            } else {
                f[] fVarArr = this.f23535e;
                int i11 = i10 - 1;
                this.f23537g = i11;
                fVar = fVarArr[i11];
            }
            this.f23539i = fVar;
        }
        return fVar;
    }

    /* renamed from: o */
    public final g a() {
        synchronized (this.f23532b) {
            try {
                r();
                if (this.f23534d.isEmpty()) {
                    return null;
                }
                g gVar = (g) this.f23534d.removeFirst();
                return gVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean p(long j10) {
        boolean z10;
        synchronized (this.f23532b) {
            long j11 = this.f23544n;
            if (j11 != -9223372036854775807L) {
                if (j10 < j11) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public void release() {
        synchronized (this.f23532b) {
            this.f23542l = true;
            this.f23532b.notify();
        }
        try {
            this.f23531a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* access modifiers changed from: protected */
    public void t(g gVar) {
        synchronized (this.f23532b) {
            u(gVar);
            q();
        }
    }

    /* access modifiers changed from: protected */
    public final void w(int i10) {
        boolean z10;
        if (this.f23537g == this.f23535e.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        for (f u10 : this.f23535e) {
            u10.u(i10);
        }
    }
}
