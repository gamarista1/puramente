package a4;

import Gh.C5406g;
import Gh.C5411l;
import Gh.H;
import Gh.M;
import a4.S;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o4.l;
import yf.C6787a;

public final class X extends S {

    /* renamed from: a  reason: collision with root package name */
    private final S.a f36023a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f36024b;

    /* renamed from: c  reason: collision with root package name */
    private C5406g f36025c;

    /* renamed from: d  reason: collision with root package name */
    private C6787a f36026d;

    /* renamed from: e  reason: collision with root package name */
    private M f36027e;

    public X(C5406g gVar, C6787a aVar, S.a aVar2) {
        super((DefaultConstructorMarker) null);
        this.f36023a = aVar2;
        this.f36025c = gVar;
        this.f36026d = aVar;
    }

    private final void o() {
        if (this.f36024b) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
    }

    private final M q() {
        C6787a aVar = this.f36026d;
        C6496s.e(aVar);
        File file = (File) aVar.invoke();
        if (file.isDirectory()) {
            return M.a.d(M.f63223b, File.createTempFile("tmp", (String) null, file), false, 1, (Object) null);
        }
        throw new IllegalStateException("cacheDirectory must be a directory.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f A[Catch:{ all -> 0x002e, all -> 0x0035, all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0047 A[SYNTHETIC, Splitter:B:30:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized Gh.M a() {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.o()     // Catch:{ all -> 0x003a }
            Gh.M r0 = r4.f36027e     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r4)
            return r0
        L_0x000a:
            Gh.M r0 = r4.q()     // Catch:{ all -> 0x003a }
            Gh.l r1 = r4.t()     // Catch:{ all -> 0x003a }
            r2 = 0
            Gh.U r1 = r1.p(r0, r2)     // Catch:{ all -> 0x003a }
            Gh.f r1 = Gh.H.c(r1)     // Catch:{ all -> 0x003a }
            r2 = 0
            Gh.g r3 = r4.f36025c     // Catch:{ all -> 0x002e }
            kotlin.jvm.internal.C6496s.e(r3)     // Catch:{ all -> 0x002e }
            r1.K(r3)     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x002c
            r1.close()     // Catch:{ all -> 0x002a }
            goto L_0x002c
        L_0x002a:
            r1 = move-exception
            goto L_0x003d
        L_0x002c:
            r1 = r2
            goto L_0x003d
        L_0x002e:
            r3 = move-exception
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ all -> 0x0035 }
            goto L_0x003c
        L_0x0035:
            r1 = move-exception
            lf.C6523g.a(r3, r1)     // Catch:{ all -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r0 = move-exception
            goto L_0x0048
        L_0x003c:
            r1 = r3
        L_0x003d:
            if (r1 != 0) goto L_0x0047
            r4.f36025c = r2     // Catch:{ all -> 0x003a }
            r4.f36027e = r0     // Catch:{ all -> 0x003a }
            r4.f36026d = r2     // Catch:{ all -> 0x003a }
            monitor-exit(r4)
            return r0
        L_0x0047:
            throw r1     // Catch:{ all -> 0x003a }
        L_0x0048:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.X.a():Gh.M");
    }

    public synchronized M b() {
        o();
        return this.f36027e;
    }

    public synchronized void close() {
        try {
            this.f36024b = true;
            C5406g gVar = this.f36025c;
            if (gVar != null) {
                l.d(gVar);
            }
            M m10 = this.f36027e;
            if (m10 != null) {
                t().h(m10);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public S.a f() {
        return this.f36023a;
    }

    public synchronized C5406g n() {
        o();
        C5406g gVar = this.f36025c;
        if (gVar != null) {
            return gVar;
        }
        C5411l t10 = t();
        M m10 = this.f36027e;
        C6496s.e(m10);
        C5406g d10 = H.d(t10.q(m10));
        this.f36025c = d10;
        return d10;
    }

    public C5411l t() {
        return C5411l.f63319b;
    }
}
