package k9;

import android.os.Looper;
import ja.C3645a;
import ja.C3648d;

public final class W0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f45399a;

    /* renamed from: b  reason: collision with root package name */
    private final a f45400b;

    /* renamed from: c  reason: collision with root package name */
    private final C3648d f45401c;

    /* renamed from: d  reason: collision with root package name */
    private final n1 f45402d;

    /* renamed from: e  reason: collision with root package name */
    private int f45403e;

    /* renamed from: f  reason: collision with root package name */
    private Object f45404f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f45405g;

    /* renamed from: h  reason: collision with root package name */
    private int f45406h;

    /* renamed from: i  reason: collision with root package name */
    private long f45407i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f45408j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f45409k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f45410l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f45411m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f45412n;

    public interface a {
        void c(W0 w02);
    }

    public interface b {
        void p(int i10, Object obj);
    }

    public W0(a aVar, b bVar, n1 n1Var, int i10, C3648d dVar, Looper looper) {
        this.f45400b = aVar;
        this.f45399a = bVar;
        this.f45402d = n1Var;
        this.f45405g = looper;
        this.f45401c = dVar;
        this.f45406h = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[SYNTHETIC, Splitter:B:18:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f45409k     // Catch:{ all -> 0x003a }
            ja.C3645a.f(r0)     // Catch:{ all -> 0x003a }
            android.os.Looper r0 = r5.f45405g     // Catch:{ all -> 0x003a }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x003a }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003a }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            ja.C3645a.f(r0)     // Catch:{ all -> 0x003a }
            ja.d r0 = r5.f45401c     // Catch:{ all -> 0x003a }
            long r0 = r0.a()     // Catch:{ all -> 0x003a }
            long r0 = r0 + r6
        L_0x001f:
            boolean r2 = r5.f45411m     // Catch:{ all -> 0x003a }
            if (r2 != 0) goto L_0x003c
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x003c
            ja.d r2 = r5.f45401c     // Catch:{ all -> 0x003a }
            r2.e()     // Catch:{ all -> 0x003a }
            r5.wait(r6)     // Catch:{ all -> 0x003a }
            ja.d r6 = r5.f45401c     // Catch:{ all -> 0x003a }
            long r6 = r6.a()     // Catch:{ all -> 0x003a }
            long r6 = r0 - r6
            goto L_0x001f
        L_0x003a:
            r6 = move-exception
            goto L_0x004a
        L_0x003c:
            if (r2 == 0) goto L_0x0042
            boolean r6 = r5.f45410l     // Catch:{ all -> 0x003a }
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
        throw new UnsupportedOperationException("Method not decompiled: k9.W0.a(long):boolean");
    }

    public boolean b() {
        return this.f45408j;
    }

    public Looper c() {
        return this.f45405g;
    }

    public int d() {
        return this.f45406h;
    }

    public Object e() {
        return this.f45404f;
    }

    public long f() {
        return this.f45407i;
    }

    public b g() {
        return this.f45399a;
    }

    public n1 h() {
        return this.f45402d;
    }

    public int i() {
        return this.f45403e;
    }

    public synchronized boolean j() {
        return this.f45412n;
    }

    public synchronized void k(boolean z10) {
        this.f45410l = z10 | this.f45410l;
        this.f45411m = true;
        notifyAll();
    }

    public W0 l() {
        C3645a.f(!this.f45409k);
        if (this.f45407i == -9223372036854775807L) {
            C3645a.a(this.f45408j);
        }
        this.f45409k = true;
        this.f45400b.c(this);
        return this;
    }

    public W0 m(Object obj) {
        C3645a.f(!this.f45409k);
        this.f45404f = obj;
        return this;
    }

    public W0 n(int i10) {
        C3645a.f(!this.f45409k);
        this.f45403e = i10;
        return this;
    }
}
