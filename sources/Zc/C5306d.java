package zc;

import Ac.c;
import Ac.i;
import Ac.l;
import Ac.o;
import Bc.k;
import android.content.Context;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import uc.C5233a;

/* renamed from: zc.d  reason: case insensitive filesystem */
final class C5306d {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f62369a;

    /* renamed from: b  reason: collision with root package name */
    private final double f62370b;

    /* renamed from: c  reason: collision with root package name */
    private final double f62371c;

    /* renamed from: d  reason: collision with root package name */
    private a f62372d;

    /* renamed from: e  reason: collision with root package name */
    private a f62373e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f62374f;

    /* renamed from: zc.d$a */
    static class a {

        /* renamed from: k  reason: collision with root package name */
        private static final C5233a f62375k = C5233a.e();

        /* renamed from: l  reason: collision with root package name */
        private static final long f62376l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a  reason: collision with root package name */
        private final Ac.a f62377a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f62378b;

        /* renamed from: c  reason: collision with root package name */
        private l f62379c;

        /* renamed from: d  reason: collision with root package name */
        private i f62380d;

        /* renamed from: e  reason: collision with root package name */
        private long f62381e;

        /* renamed from: f  reason: collision with root package name */
        private double f62382f;

        /* renamed from: g  reason: collision with root package name */
        private i f62383g;

        /* renamed from: h  reason: collision with root package name */
        private i f62384h;

        /* renamed from: i  reason: collision with root package name */
        private long f62385i;

        /* renamed from: j  reason: collision with root package name */
        private long f62386j;

        a(i iVar, long j10, Ac.a aVar, com.google.firebase.perf.config.a aVar2, String str, boolean z10) {
            this.f62377a = aVar;
            this.f62381e = j10;
            this.f62380d = iVar;
            this.f62382f = (double) j10;
            this.f62379c = aVar.a();
            g(aVar2, str, z10);
            this.f62378b = z10;
        }

        private static long c(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.E();
            }
            return aVar.q();
        }

        private static long d(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.t();
            }
            return aVar.t();
        }

        private static long e(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.F();
            }
            return aVar.r();
        }

        private static long f(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.t();
            }
            return aVar.t();
        }

        private void g(com.google.firebase.perf.config.a aVar, String str, boolean z10) {
            String str2 = str;
            long f10 = f(aVar, str);
            long e10 = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            i iVar = new i(e10, f10, timeUnit);
            this.f62383g = iVar;
            this.f62385i = e10;
            if (z10) {
                f62375k.b("Foreground %s logging rate:%f, burst capacity:%d", str2, iVar, Long.valueOf(e10));
            }
            long d10 = d(aVar, str);
            long c10 = c(aVar, str);
            i iVar2 = new i(c10, d10, timeUnit);
            this.f62384h = iVar2;
            this.f62386j = c10;
            if (z10) {
                f62375k.b("Background %s logging rate:%f, capacity:%d", str2, iVar2, Long.valueOf(c10));
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void a(boolean z10) {
            i iVar;
            long j10;
            if (z10) {
                try {
                    iVar = this.f62383g;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            } else {
                iVar = this.f62384h;
            }
            this.f62380d = iVar;
            if (z10) {
                j10 = this.f62385i;
            } else {
                j10 = this.f62386j;
            }
            this.f62381e = j10;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean b(Bc.i r5) {
            /*
                r4 = this;
                monitor-enter(r4)
                Ac.a r5 = r4.f62377a     // Catch:{ all -> 0x002e }
                Ac.l r5 = r5.a()     // Catch:{ all -> 0x002e }
                Ac.l r0 = r4.f62379c     // Catch:{ all -> 0x002e }
                long r0 = r0.d(r5)     // Catch:{ all -> 0x002e }
                double r0 = (double) r0     // Catch:{ all -> 0x002e }
                Ac.i r2 = r4.f62380d     // Catch:{ all -> 0x002e }
                double r2 = r2.a()     // Catch:{ all -> 0x002e }
                double r0 = r0 * r2
                long r2 = f62376l     // Catch:{ all -> 0x002e }
                double r2 = (double) r2     // Catch:{ all -> 0x002e }
                double r0 = r0 / r2
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x0030
                double r2 = r4.f62382f     // Catch:{ all -> 0x002e }
                double r2 = r2 + r0
                long r0 = r4.f62381e     // Catch:{ all -> 0x002e }
                double r0 = (double) r0     // Catch:{ all -> 0x002e }
                double r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x002e }
                r4.f62382f = r0     // Catch:{ all -> 0x002e }
                r4.f62379c = r5     // Catch:{ all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r5 = move-exception
                goto L_0x004c
            L_0x0030:
                double r0 = r4.f62382f     // Catch:{ all -> 0x002e }
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto L_0x003e
                double r0 = r0 - r2
                r4.f62382f = r0     // Catch:{ all -> 0x002e }
                monitor-exit(r4)
                r5 = 1
                return r5
            L_0x003e:
                boolean r5 = r4.f62378b     // Catch:{ all -> 0x002e }
                if (r5 == 0) goto L_0x0049
                uc.a r5 = f62375k     // Catch:{ all -> 0x002e }
                java.lang.String r0 = "Exceeded log rate limit, dropping the log."
                r5.j(r0)     // Catch:{ all -> 0x002e }
            L_0x0049:
                monitor-exit(r4)
                r5 = 0
                return r5
            L_0x004c:
                monitor-exit(r4)     // Catch:{ all -> 0x002e }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: zc.C5306d.a.b(Bc.i):boolean");
        }
    }

    public C5306d(Context context, i iVar, long j10) {
        this(iVar, j10, new Ac.a(), b(), b(), com.google.firebase.perf.config.a.g());
        this.f62374f = o.b(context);
    }

    static double b() {
        return new Random().nextDouble();
    }

    private boolean c(List list) {
        if (list.size() <= 0 || ((k) list.get(0)).Z() <= 0 || ((k) list.get(0)).Y(0) != Bc.l.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    private boolean d() {
        if (this.f62371c < this.f62369a.f()) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if (this.f62370b < this.f62369a.s()) {
            return true;
        }
        return false;
    }

    private boolean f() {
        if (this.f62370b < this.f62369a.G()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z10) {
        this.f62372d.a(z10);
        this.f62373e.a(z10);
    }

    /* access modifiers changed from: package-private */
    public boolean g(Bc.i iVar) {
        if (!j(iVar)) {
            return false;
        }
        if (iVar.g()) {
            return !this.f62373e.b(iVar);
        }
        if (iVar.j()) {
            return !this.f62372d.b(iVar);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean h(Bc.i iVar) {
        if (iVar.j() && !f() && !c(iVar.k().s0())) {
            return false;
        }
        if (i(iVar) && !d() && !c(iVar.k().s0())) {
            return false;
        }
        if (!iVar.g() || e() || c(iVar.h().q0())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean i(Bc.i iVar) {
        if (!iVar.j() || !iVar.k().r0().startsWith("_st_") || !iVar.k().h0("Hosting_activity")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean j(Bc.i iVar) {
        if ((!iVar.j() || ((!iVar.k().r0().equals(c.FOREGROUND_TRACE_NAME.toString()) && !iVar.k().r0().equals(c.BACKGROUND_TRACE_NAME.toString())) || iVar.k().k0() <= 0)) && !iVar.e()) {
            return true;
        }
        return false;
    }

    C5306d(i iVar, long j10, Ac.a aVar, double d10, double d11, com.google.firebase.perf.config.a aVar2) {
        double d12 = d10;
        double d13 = d11;
        this.f62372d = null;
        this.f62373e = null;
        boolean z10 = false;
        this.f62374f = false;
        o.a(0.0d <= d12 && d12 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d13 && d13 < 1.0d) {
            z10 = true;
        }
        o.a(z10, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f62370b = d12;
        this.f62371c = d13;
        this.f62369a = aVar2;
        i iVar2 = iVar;
        long j11 = j10;
        Ac.a aVar3 = aVar;
        com.google.firebase.perf.config.a aVar4 = aVar2;
        this.f62372d = new a(iVar2, j11, aVar3, aVar4, "Trace", this.f62374f);
        this.f62373e = new a(iVar2, j11, aVar3, aVar4, "Network", this.f62374f);
    }
}
