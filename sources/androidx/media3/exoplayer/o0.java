package androidx.media3.exoplayer;

import android.os.Looper;
import f2.H;
import i2.C2076a;
import i2.C2078c;

public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f17774a;

    /* renamed from: b  reason: collision with root package name */
    private final a f17775b;

    /* renamed from: c  reason: collision with root package name */
    private final C2078c f17776c;

    /* renamed from: d  reason: collision with root package name */
    private final H f17777d;

    /* renamed from: e  reason: collision with root package name */
    private int f17778e;

    /* renamed from: f  reason: collision with root package name */
    private Object f17779f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f17780g;

    /* renamed from: h  reason: collision with root package name */
    private int f17781h;

    /* renamed from: i  reason: collision with root package name */
    private long f17782i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f17783j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f17784k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f17785l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f17786m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f17787n;

    public interface a {
        void e(o0 o0Var);
    }

    public interface b {
        void p(int i10, Object obj);
    }

    public o0(a aVar, b bVar, H h10, int i10, C2078c cVar, Looper looper) {
        this.f17775b = aVar;
        this.f17774a = bVar;
        this.f17777d = h10;
        this.f17780g = looper;
        this.f17776c = cVar;
        this.f17781h = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[SYNTHETIC, Splitter:B:18:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f17784k     // Catch:{ all -> 0x003a }
            i2.C2076a.g(r0)     // Catch:{ all -> 0x003a }
            android.os.Looper r0 = r5.f17780g     // Catch:{ all -> 0x003a }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x003a }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003a }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            i2.C2076a.g(r0)     // Catch:{ all -> 0x003a }
            i2.c r0 = r5.f17776c     // Catch:{ all -> 0x003a }
            long r0 = r0.a()     // Catch:{ all -> 0x003a }
            long r0 = r0 + r6
        L_0x001f:
            boolean r2 = r5.f17786m     // Catch:{ all -> 0x003a }
            if (r2 != 0) goto L_0x003c
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x003c
            i2.c r2 = r5.f17776c     // Catch:{ all -> 0x003a }
            r2.e()     // Catch:{ all -> 0x003a }
            r5.wait(r6)     // Catch:{ all -> 0x003a }
            i2.c r6 = r5.f17776c     // Catch:{ all -> 0x003a }
            long r6 = r6.a()     // Catch:{ all -> 0x003a }
            long r6 = r0 - r6
            goto L_0x001f
        L_0x003a:
            r6 = move-exception
            goto L_0x004a
        L_0x003c:
            if (r2 == 0) goto L_0x0042
            boolean r6 = r5.f17785l     // Catch:{ all -> 0x003a }
            monitor-exit(r5)
            return r6
        L_0x0042:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x003a }
            java.lang.String r7 = "Message delivery timed out."
            r6.<init>(r7)     // Catch:{ all -> 0x003a }
            throw r6     // Catch:{ all -> 0x003a }
        L_0x004a:
            monitor-exit(r5)     // Catch:{ all -> 0x003a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.o0.a(long):boolean");
    }

    public boolean b() {
        return this.f17783j;
    }

    public Looper c() {
        return this.f17780g;
    }

    public int d() {
        return this.f17781h;
    }

    public Object e() {
        return this.f17779f;
    }

    public long f() {
        return this.f17782i;
    }

    public b g() {
        return this.f17774a;
    }

    public H h() {
        return this.f17777d;
    }

    public int i() {
        return this.f17778e;
    }

    public synchronized boolean j() {
        return this.f17787n;
    }

    public synchronized void k(boolean z10) {
        this.f17785l = z10 | this.f17785l;
        this.f17786m = true;
        notifyAll();
    }

    public o0 l() {
        C2076a.g(!this.f17784k);
        if (this.f17782i == -9223372036854775807L) {
            C2076a.a(this.f17783j);
        }
        this.f17784k = true;
        this.f17775b.e(this);
        return this;
    }

    public o0 m(Object obj) {
        C2076a.g(!this.f17784k);
        this.f17779f = obj;
        return this;
    }

    public o0 n(int i10) {
        C2076a.g(!this.f17784k);
        this.f17778e = i10;
        return this;
    }
}
