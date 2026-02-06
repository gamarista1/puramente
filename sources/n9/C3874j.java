package n9;

import ja.C3645a;
import java.util.ArrayDeque;

/* renamed from: n9.j  reason: case insensitive filesystem */
public abstract class C3874j implements C3868d {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f46965a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f46966b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque f46967c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque f46968d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    private final C3871g[] f46969e;

    /* renamed from: f  reason: collision with root package name */
    private final C3872h[] f46970f;

    /* renamed from: g  reason: collision with root package name */
    private int f46971g;

    /* renamed from: h  reason: collision with root package name */
    private int f46972h;

    /* renamed from: i  reason: collision with root package name */
    private C3871g f46973i;

    /* renamed from: j  reason: collision with root package name */
    private C3870f f46974j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f46975k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f46976l;

    /* renamed from: m  reason: collision with root package name */
    private int f46977m;

    /* renamed from: n9.j$a */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        public void run() {
            C3874j.this.t();
        }
    }

    protected C3874j(C3871g[] gVarArr, C3872h[] hVarArr) {
        this.f46969e = gVarArr;
        this.f46971g = gVarArr.length;
        for (int i10 = 0; i10 < this.f46971g; i10++) {
            this.f46969e[i10] = g();
        }
        this.f46970f = hVarArr;
        this.f46972h = hVarArr.length;
        for (int i11 = 0; i11 < this.f46972h; i11++) {
            this.f46970f[i11] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f46965a = aVar;
        aVar.start();
    }

    private boolean f() {
        if (this.f46967c.isEmpty() || this.f46972h <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r1.p() == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r3.f(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r1.o() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        r3.f(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r1.r() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        r3.f(134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = j(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        r0 = i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        r0 = i(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f46966b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f46976l     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0016
            boolean r1 = r6.f()     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0016
            java.lang.Object r1 = r6.f46966b     // Catch:{ all -> 0x0013 }
            r1.wait()     // Catch:{ all -> 0x0013 }
            goto L_0x0003
        L_0x0013:
            r1 = move-exception
            goto L_0x009f
        L_0x0016:
            boolean r1 = r6.f46976l     // Catch:{ all -> 0x0013 }
            r2 = 0
            if (r1 == 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return r2
        L_0x001d:
            java.util.ArrayDeque r1 = r6.f46967c     // Catch:{ all -> 0x0013 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0013 }
            n9.g r1 = (n9.C3871g) r1     // Catch:{ all -> 0x0013 }
            n9.h[] r3 = r6.f46970f     // Catch:{ all -> 0x0013 }
            int r4 = r6.f46972h     // Catch:{ all -> 0x0013 }
            r5 = 1
            int r4 = r4 - r5
            r6.f46972h = r4     // Catch:{ all -> 0x0013 }
            r3 = r3[r4]     // Catch:{ all -> 0x0013 }
            boolean r4 = r6.f46975k     // Catch:{ all -> 0x0013 }
            r6.f46975k = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            boolean r0 = r1.p()
            if (r0 == 0) goto L_0x003f
            r0 = 4
            r3.f(r0)
            goto L_0x0071
        L_0x003f:
            boolean r0 = r1.o()
            if (r0 == 0) goto L_0x004a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.f(r0)
        L_0x004a:
            boolean r0 = r1.r()
            if (r0 == 0) goto L_0x0055
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r3.f(r0)
        L_0x0055:
            n9.f r0 = r6.j(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0060, OutOfMemoryError -> 0x005a }
            goto L_0x0065
        L_0x005a:
            r0 = move-exception
            n9.f r0 = r6.i(r0)
            goto L_0x0065
        L_0x0060:
            r0 = move-exception
            n9.f r0 = r6.i(r0)
        L_0x0065:
            if (r0 == 0) goto L_0x0071
            java.lang.Object r4 = r6.f46966b
            monitor-enter(r4)
            r6.f46974j = r0     // Catch:{ all -> 0x006e }
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            return r2
        L_0x006e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x0071:
            java.lang.Object r4 = r6.f46966b
            monitor-enter(r4)
            boolean r0 = r6.f46975k     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x007e
            r3.u()     // Catch:{ all -> 0x007c }
            goto L_0x0098
        L_0x007c:
            r0 = move-exception
            goto L_0x009d
        L_0x007e:
            boolean r0 = r3.o()     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x008d
            int r0 = r6.f46977m     // Catch:{ all -> 0x007c }
            int r0 = r0 + r5
            r6.f46977m = r0     // Catch:{ all -> 0x007c }
            r3.u()     // Catch:{ all -> 0x007c }
            goto L_0x0098
        L_0x008d:
            int r0 = r6.f46977m     // Catch:{ all -> 0x007c }
            r3.f46959c = r0     // Catch:{ all -> 0x007c }
            r6.f46977m = r2     // Catch:{ all -> 0x007c }
            java.util.ArrayDeque r0 = r6.f46968d     // Catch:{ all -> 0x007c }
            r0.addLast(r3)     // Catch:{ all -> 0x007c }
        L_0x0098:
            r6.q(r1)     // Catch:{ all -> 0x007c }
            monitor-exit(r4)     // Catch:{ all -> 0x007c }
            return r5
        L_0x009d:
            monitor-exit(r4)     // Catch:{ all -> 0x007c }
            throw r0
        L_0x009f:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.C3874j.k():boolean");
    }

    private void n() {
        if (f()) {
            this.f46966b.notify();
        }
    }

    private void o() {
        C3870f fVar = this.f46974j;
        if (fVar != null) {
            throw fVar;
        }
    }

    private void q(C3871g gVar) {
        gVar.i();
        C3871g[] gVarArr = this.f46969e;
        int i10 = this.f46971g;
        this.f46971g = i10 + 1;
        gVarArr[i10] = gVar;
    }

    private void s(C3872h hVar) {
        hVar.i();
        C3872h[] hVarArr = this.f46970f;
        int i10 = this.f46972h;
        this.f46972h = i10 + 1;
        hVarArr[i10] = hVar;
    }

    /* access modifiers changed from: private */
    public void t() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (k());
    }

    public final void flush() {
        synchronized (this.f46966b) {
            try {
                this.f46975k = true;
                this.f46977m = 0;
                C3871g gVar = this.f46973i;
                if (gVar != null) {
                    q(gVar);
                    this.f46973i = null;
                }
                while (!this.f46967c.isEmpty()) {
                    q((C3871g) this.f46967c.removeFirst());
                }
                while (!this.f46968d.isEmpty()) {
                    ((C3872h) this.f46968d.removeFirst()).u();
                }
            } finally {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract C3871g g();

    /* access modifiers changed from: protected */
    public abstract C3872h h();

    /* access modifiers changed from: protected */
    public abstract C3870f i(Throwable th2);

    /* access modifiers changed from: protected */
    public abstract C3870f j(C3871g gVar, C3872h hVar, boolean z10);

    /* renamed from: l */
    public final C3871g d() {
        boolean z10;
        C3871g gVar;
        synchronized (this.f46966b) {
            o();
            if (this.f46973i == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.f(z10);
            int i10 = this.f46971g;
            if (i10 == 0) {
                gVar = null;
            } else {
                C3871g[] gVarArr = this.f46969e;
                int i11 = i10 - 1;
                this.f46971g = i11;
                gVar = gVarArr[i11];
            }
            this.f46973i = gVar;
        }
        return gVar;
    }

    /* renamed from: m */
    public final C3872h a() {
        synchronized (this.f46966b) {
            try {
                o();
                if (this.f46968d.isEmpty()) {
                    return null;
                }
                C3872h hVar = (C3872h) this.f46968d.removeFirst();
                return hVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public final void c(C3871g gVar) {
        boolean z10;
        synchronized (this.f46966b) {
            o();
            if (gVar == this.f46973i) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.a(z10);
            this.f46967c.addLast(gVar);
            n();
            this.f46973i = null;
        }
    }

    /* access modifiers changed from: protected */
    public void r(C3872h hVar) {
        synchronized (this.f46966b) {
            s(hVar);
            n();
        }
    }

    public void release() {
        synchronized (this.f46966b) {
            this.f46976l = true;
            this.f46966b.notify();
        }
        try {
            this.f46965a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* access modifiers changed from: protected */
    public final void u(int i10) {
        boolean z10;
        if (this.f46971g == this.f46969e.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        for (C3871g x10 : this.f46969e) {
            x10.x(i10);
        }
    }
}
