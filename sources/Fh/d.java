package Fh;

import Ef.i;
import Fh.g;
import Gh.C5405f;
import Gh.C5406g;
import Gh.C5407h;
import Sg.p;
import io.intercom.android.sdk.models.AttributeType;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import rh.B;
import rh.C;
import rh.C6703A;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.I;
import rh.J;
import rh.r;
import sh.C6726e;
import vh.C6756a;
import vh.C6759d;
import vh.C6760e;
import wh.C6773c;
import wh.C6775e;

public final class d implements I, g.a {

    /* renamed from: A  reason: collision with root package name */
    private static final List f63095A = C6565s.e(B.HTTP_1_1);

    /* renamed from: z  reason: collision with root package name */
    public static final b f63096z = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C f63097a;

    /* renamed from: b  reason: collision with root package name */
    private final J f63098b;

    /* renamed from: c  reason: collision with root package name */
    private final Random f63099c;

    /* renamed from: d  reason: collision with root package name */
    private final long f63100d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public e f63101e;

    /* renamed from: f  reason: collision with root package name */
    private long f63102f;

    /* renamed from: g  reason: collision with root package name */
    private final String f63103g;

    /* renamed from: h  reason: collision with root package name */
    private C6708e f63104h;

    /* renamed from: i  reason: collision with root package name */
    private C6756a f63105i;

    /* renamed from: j  reason: collision with root package name */
    private g f63106j;

    /* renamed from: k  reason: collision with root package name */
    private h f63107k;

    /* renamed from: l  reason: collision with root package name */
    private C6759d f63108l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public String f63109m;

    /* renamed from: n  reason: collision with root package name */
    private C0935d f63110n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayDeque f63111o = new ArrayDeque();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final ArrayDeque f63112p = new ArrayDeque();

    /* renamed from: q  reason: collision with root package name */
    private long f63113q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f63114r;

    /* renamed from: s  reason: collision with root package name */
    private int f63115s = -1;

    /* renamed from: t  reason: collision with root package name */
    private String f63116t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f63117u;

    /* renamed from: v  reason: collision with root package name */
    private int f63118v;

    /* renamed from: w  reason: collision with root package name */
    private int f63119w;

    /* renamed from: x  reason: collision with root package name */
    private int f63120x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f63121y;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f63122a;

        /* renamed from: b  reason: collision with root package name */
        private final C5407h f63123b;

        /* renamed from: c  reason: collision with root package name */
        private final long f63124c;

        public a(int i10, C5407h hVar, long j10) {
            this.f63122a = i10;
            this.f63123b = hVar;
            this.f63124c = j10;
        }

        public final long a() {
            return this.f63124c;
        }

        public final int b() {
            return this.f63122a;
        }

        public final C5407h c() {
            return this.f63123b;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f63125a;

        /* renamed from: b  reason: collision with root package name */
        private final C5407h f63126b;

        public c(int i10, C5407h hVar) {
            C6496s.h(hVar, "data");
            this.f63125a = i10;
            this.f63126b = hVar;
        }

        public final C5407h a() {
            return this.f63126b;
        }

        public final int b() {
            return this.f63125a;
        }
    }

    /* renamed from: Fh.d$d  reason: collision with other inner class name */
    public static abstract class C0935d implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f63127a;

        /* renamed from: b  reason: collision with root package name */
        private final C5406g f63128b;

        /* renamed from: c  reason: collision with root package name */
        private final C5405f f63129c;

        public C0935d(boolean z10, C5406g gVar, C5405f fVar) {
            C6496s.h(gVar, "source");
            C6496s.h(fVar, "sink");
            this.f63127a = z10;
            this.f63128b = gVar;
            this.f63129c = fVar;
        }

        public final boolean a() {
            return this.f63127a;
        }

        public final C5405f b() {
            return this.f63129c;
        }

        public final C5406g f() {
            return this.f63128b;
        }
    }

    private final class e extends C6756a {
        public e() {
            super(d.this.f63109m + " writer", false, 2, (DefaultConstructorMarker) null);
        }

        public long f() {
            try {
                if (d.this.u()) {
                    return 0;
                }
                return -1;
            } catch (IOException e10) {
                d.this.n(e10, (E) null);
                return -1;
            }
        }
    }

    public static final class f implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f63131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C f63132b;

        f(d dVar, C c10) {
            this.f63131a = dVar;
            this.f63132b = c10;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            C6496s.h(eVar, "call");
            C6496s.h(iOException, "e");
            this.f63131a.n(iOException, (E) null);
        }

        public void onResponse(C6708e eVar, E e10) {
            C6496s.h(eVar, "call");
            C6496s.h(e10, "response");
            C6773c q10 = e10.q();
            try {
                this.f63131a.k(e10, q10);
                C6496s.e(q10);
                C0935d n10 = q10.n();
                e a10 = e.f63136g.a(e10.F());
                this.f63131a.f63101e = a10;
                if (!this.f63131a.q(a10)) {
                    d dVar = this.f63131a;
                    synchronized (dVar) {
                        dVar.f63112p.clear();
                        dVar.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    this.f63131a.p(C6726e.f73548i + " WebSocket " + this.f63132b.l().q(), n10);
                    this.f63131a.o().onOpen(this.f63131a, e10);
                    this.f63131a.r();
                } catch (Exception e11) {
                    this.f63131a.n(e11, (E) null);
                }
            } catch (IOException e12) {
                this.f63131a.n(e12, e10);
                C6726e.m(e10);
                if (q10 != null) {
                    q10.v();
                }
            }
        }
    }

    public static final class g extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f63133e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f63134f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, d dVar, long j10) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f63133e = dVar;
            this.f63134f = j10;
        }

        public long f() {
            this.f63133e.v();
            return this.f63134f;
        }
    }

    public static final class h extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f63135e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, d dVar) {
            super(str, z10);
            this.f63135e = dVar;
        }

        public long f() {
            this.f63135e.j();
            return -1;
        }
    }

    public d(C6760e eVar, C c10, J j10, Random random, long j11, e eVar2, long j12) {
        C6496s.h(eVar, "taskRunner");
        C6496s.h(c10, "originalRequest");
        C6496s.h(j10, "listener");
        C6496s.h(random, "random");
        this.f63097a = c10;
        this.f63098b = j10;
        this.f63099c = random;
        this.f63100d = j11;
        this.f63101e = eVar2;
        this.f63102f = j12;
        this.f63108l = eVar.i();
        if (C6496s.c("GET", c10.h())) {
            C5407h.a aVar = C5407h.f63295d;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            C6514M m10 = C6514M.f71813a;
            this.f63103g = C5407h.a.g(aVar, bArr, 0, 0, 3, (Object) null).a();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + c10.h()).toString());
    }

    /* access modifiers changed from: private */
    public final boolean q(e eVar) {
        if (eVar.f63142f || eVar.f63138b != null) {
            return false;
        }
        if (eVar.f63140d == null || new i(8, 15).p(eVar.f63140d.intValue())) {
            return true;
        }
        return false;
    }

    private final void s() {
        if (!C6726e.f73547h || Thread.holdsLock(this)) {
            C6756a aVar = this.f63105i;
            if (aVar != null) {
                C6759d.j(this.f63108l, aVar, 0, 2, (Object) null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean t(Gh.C5407h r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f63117u     // Catch:{ all -> 0x0022 }
            r1 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = r6.f63114r     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x000b
            goto L_0x003e
        L_0x000b:
            long r2 = r6.f63113q     // Catch:{ all -> 0x0022 }
            int r0 = r7.O()     // Catch:{ all -> 0x0022 }
            long r4 = (long) r0     // Catch:{ all -> 0x0022 }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x0022 }
            monitor-exit(r6)
            return r1
        L_0x0022:
            r7 = move-exception
            goto L_0x0040
        L_0x0024:
            long r0 = r6.f63113q     // Catch:{ all -> 0x0022 }
            int r2 = r7.O()     // Catch:{ all -> 0x0022 }
            long r2 = (long) r2     // Catch:{ all -> 0x0022 }
            long r0 = r0 + r2
            r6.f63113q = r0     // Catch:{ all -> 0x0022 }
            java.util.ArrayDeque r0 = r6.f63112p     // Catch:{ all -> 0x0022 }
            Fh.d$c r1 = new Fh.d$c     // Catch:{ all -> 0x0022 }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x0022 }
            r0.add(r1)     // Catch:{ all -> 0x0022 }
            r6.s()     // Catch:{ all -> 0x0022 }
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x003e:
            monitor-exit(r6)
            return r1
        L_0x0040:
            monitor-exit(r6)     // Catch:{ all -> 0x0022 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Fh.d.t(Gh.h, int):boolean");
    }

    public void a(String str) {
        C6496s.h(str, AttributeType.TEXT);
        this.f63098b.onMessage((I) this, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b(Gh.C5407h r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.C6496s.h(r2, r0)     // Catch:{ all -> 0x0017 }
            boolean r0 = r1.f63117u     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0029
            boolean r0 = r1.f63114r     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0019
            java.util.ArrayDeque r0 = r1.f63112p     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0019
            goto L_0x0029
        L_0x0017:
            r2 = move-exception
            goto L_0x002b
        L_0x0019:
            java.util.ArrayDeque r0 = r1.f63111o     // Catch:{ all -> 0x0017 }
            r0.add(r2)     // Catch:{ all -> 0x0017 }
            r1.s()     // Catch:{ all -> 0x0017 }
            int r2 = r1.f63119w     // Catch:{ all -> 0x0017 }
            int r2 = r2 + 1
            r1.f63119w = r2     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            return
        L_0x0029:
            monitor-exit(r1)
            return
        L_0x002b:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Fh.d.b(Gh.h):void");
    }

    public void c(C5407h hVar) {
        C6496s.h(hVar, "bytes");
        this.f63098b.onMessage((I) this, hVar);
    }

    public boolean close(int i10, String str) {
        return l(i10, str, 60000);
    }

    public synchronized void d(C5407h hVar) {
        C6496s.h(hVar, "payload");
        this.f63120x++;
        this.f63121y = false;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [Fh.g, Fh.d$d, Fh.h] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            r0 = -1
            if (r5 == r0) goto L_0x0071
            monitor-enter(r4)
            int r1 = r4.f63115s     // Catch:{ all -> 0x0031 }
            if (r1 != r0) goto L_0x0067
            r4.f63115s = r5     // Catch:{ all -> 0x0031 }
            r4.f63116t = r6     // Catch:{ all -> 0x0031 }
            boolean r0 = r4.f63114r     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r0 == 0) goto L_0x0033
            java.util.ArrayDeque r0 = r4.f63112p     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0033
            Fh.d$d r0 = r4.f63110n     // Catch:{ all -> 0x0031 }
            r4.f63110n = r1     // Catch:{ all -> 0x0031 }
            Fh.g r2 = r4.f63106j     // Catch:{ all -> 0x0031 }
            r4.f63106j = r1     // Catch:{ all -> 0x0031 }
            Fh.h r3 = r4.f63107k     // Catch:{ all -> 0x0031 }
            r4.f63107k = r1     // Catch:{ all -> 0x0031 }
            vh.d r1 = r4.f63108l     // Catch:{ all -> 0x0031 }
            r1.n()     // Catch:{ all -> 0x0031 }
            r1 = r0
            goto L_0x0035
        L_0x0031:
            r5 = move-exception
            goto L_0x006f
        L_0x0033:
            r2 = r1
            r3 = r2
        L_0x0035:
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0031 }
            monitor-exit(r4)
            rh.J r0 = r4.f63098b     // Catch:{ all -> 0x0045 }
            r0.onClosing(r4, r5, r6)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0047
            rh.J r0 = r4.f63098b     // Catch:{ all -> 0x0045 }
            r0.onClosed(r4, r5, r6)     // Catch:{ all -> 0x0045 }
            goto L_0x0047
        L_0x0045:
            r5 = move-exception
            goto L_0x0057
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            sh.C6726e.m(r1)
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            sh.C6726e.m(r2)
        L_0x0051:
            if (r3 == 0) goto L_0x0056
            sh.C6726e.m(r3)
        L_0x0056:
            return
        L_0x0057:
            if (r1 == 0) goto L_0x005c
            sh.C6726e.m(r1)
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            sh.C6726e.m(r2)
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            sh.C6726e.m(r3)
        L_0x0066:
            throw r5
        L_0x0067:
            java.lang.String r5 = "already closed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0031 }
            r6.<init>(r5)     // Catch:{ all -> 0x0031 }
            throw r6     // Catch:{ all -> 0x0031 }
        L_0x006f:
            monitor-exit(r4)
            throw r5
        L_0x0071:
            java.lang.String r5 = "Failed requirement."
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Fh.d.e(int, java.lang.String):void");
    }

    public void j() {
        C6708e eVar = this.f63104h;
        C6496s.e(eVar);
        eVar.cancel();
    }

    public final void k(E e10, C6773c cVar) {
        C6496s.h(e10, "response");
        if (e10.o() == 101) {
            String E10 = E.E(e10, "Connection", (String) null, 2, (Object) null);
            if (p.v("Upgrade", E10, true)) {
                String E11 = E.E(e10, "Upgrade", (String) null, 2, (Object) null);
                if (p.v("websocket", E11, true)) {
                    String E12 = E.E(e10, "Sec-WebSocket-Accept", (String) null, 2, (Object) null);
                    C5407h.a aVar = C5407h.f63295d;
                    String a10 = aVar.d(this.f63103g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").J().a();
                    if (!C6496s.c(a10, E12)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a10 + "' but was '" + E12 + '\'');
                    } else if (cVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + E11 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + E10 + '\'');
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + e10.o() + ' ' + e10.M() + '\'');
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean l(int r6, java.lang.String r7, long r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            Fh.f r0 = Fh.f.f63143a     // Catch:{ all -> 0x0035 }
            r0.c(r6)     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x0037
            Gh.h$a r0 = Gh.C5407h.f63295d     // Catch:{ all -> 0x0035 }
            Gh.h r0 = r0.d(r7)     // Catch:{ all -> 0x0035 }
            int r1 = r0.O()     // Catch:{ all -> 0x0035 }
            long r1 = (long) r1     // Catch:{ all -> 0x0035 }
            r3 = 123(0x7b, double:6.1E-322)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0035 }
            r6.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r8 = "reason.size() > 123: "
            r6.append(r8)     // Catch:{ all -> 0x0035 }
            r6.append(r7)     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0035 }
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0035 }
            r7.<init>(r6)     // Catch:{ all -> 0x0035 }
            throw r7     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r6 = move-exception
            goto L_0x0056
        L_0x0037:
            r0 = 0
        L_0x0038:
            boolean r7 = r5.f63117u     // Catch:{ all -> 0x0035 }
            if (r7 != 0) goto L_0x0053
            boolean r7 = r5.f63114r     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x0041
            goto L_0x0053
        L_0x0041:
            r7 = 1
            r5.f63114r = r7     // Catch:{ all -> 0x0035 }
            java.util.ArrayDeque r1 = r5.f63112p     // Catch:{ all -> 0x0035 }
            Fh.d$a r2 = new Fh.d$a     // Catch:{ all -> 0x0035 }
            r2.<init>(r6, r0, r8)     // Catch:{ all -> 0x0035 }
            r1.add(r2)     // Catch:{ all -> 0x0035 }
            r5.s()     // Catch:{ all -> 0x0035 }
            monitor-exit(r5)
            return r7
        L_0x0053:
            monitor-exit(r5)
            r6 = 0
            return r6
        L_0x0056:
            monitor-exit(r5)     // Catch:{ all -> 0x0035 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Fh.d.l(int, java.lang.String, long):boolean");
    }

    public final void m(C6703A a10) {
        C6496s.h(a10, "client");
        if (this.f63097a.d("Sec-WebSocket-Extensions") != null) {
            n(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), (E) null);
            return;
        }
        C6703A c10 = a10.B().i(r.f73458b).Q(f63095A).c();
        C b10 = this.f63097a.i().e("Upgrade", "websocket").e("Connection", "Upgrade").e("Sec-WebSocket-Key", this.f63103g).e("Sec-WebSocket-Version", "13").e("Sec-WebSocket-Extensions", "permessage-deflate").b();
        C6775e eVar = new C6775e(c10, b10, true);
        this.f63104h = eVar;
        C6496s.e(eVar);
        eVar.f0(new f(this, b10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.f63098b.onFailure(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r0 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        sh.C6726e.m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r2 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        sh.C6726e.m(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r3 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        sh.C6726e.m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(java.lang.Exception r5, rh.E r6) {
        /*
            r4 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            monitor-enter(r4)
            boolean r0 = r4.f63117u     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)
            return
        L_0x000c:
            r0 = 1
            r4.f63117u = r0     // Catch:{ all -> 0x004a }
            Fh.d$d r0 = r4.f63110n     // Catch:{ all -> 0x004a }
            r1 = 0
            r4.f63110n = r1     // Catch:{ all -> 0x004a }
            Fh.g r2 = r4.f63106j     // Catch:{ all -> 0x004a }
            r4.f63106j = r1     // Catch:{ all -> 0x004a }
            Fh.h r3 = r4.f63107k     // Catch:{ all -> 0x004a }
            r4.f63107k = r1     // Catch:{ all -> 0x004a }
            vh.d r1 = r4.f63108l     // Catch:{ all -> 0x004a }
            r1.n()     // Catch:{ all -> 0x004a }
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x004a }
            monitor-exit(r4)
            rh.J r1 = r4.f63098b     // Catch:{ all -> 0x0039 }
            r1.onFailure(r4, r5, r6)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x002e
            sh.C6726e.m(r0)
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            sh.C6726e.m(r2)
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            sh.C6726e.m(r3)
        L_0x0038:
            return
        L_0x0039:
            r5 = move-exception
            if (r0 == 0) goto L_0x003f
            sh.C6726e.m(r0)
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            sh.C6726e.m(r2)
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            sh.C6726e.m(r3)
        L_0x0049:
            throw r5
        L_0x004a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Fh.d.n(java.lang.Exception, rh.E):void");
    }

    public final J o() {
        return this.f63098b;
    }

    public final void p(String str, C0935d dVar) {
        C6496s.h(str, "name");
        C6496s.h(dVar, "streams");
        e eVar = this.f63101e;
        C6496s.e(eVar);
        synchronized (this) {
            try {
                this.f63109m = str;
                this.f63110n = dVar;
                this.f63107k = new h(dVar.a(), dVar.b(), this.f63099c, eVar.f63137a, eVar.a(dVar.a()), this.f63102f);
                this.f63105i = new e();
                long j10 = this.f63100d;
                if (j10 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                    C6759d dVar2 = this.f63108l;
                    dVar2.i(new g(str + " ping", this, nanos), nanos);
                }
                if (!this.f63112p.isEmpty()) {
                    s();
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f63106j = new g(dVar.a(), dVar.f(), this, eVar.f63137a, eVar.a(!dVar.a()));
    }

    public final void r() {
        while (this.f63115s == -1) {
            g gVar = this.f63106j;
            C6496s.e(gVar);
            gVar.a();
        }
    }

    public boolean send(String str) {
        C6496s.h(str, AttributeType.TEXT);
        return t(C5407h.f63295d.d(str), 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r2 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        kotlin.jvm.internal.C6496s.e(r0);
        r0.o((Gh.C5407h) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if ((r4 instanceof Fh.d.c) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
        r4 = (Fh.d.c) r4;
        kotlin.jvm.internal.C6496s.e(r0);
        r0.f(r4.b(), r4.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r12.f63113q -= (long) r4.a().O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if ((r4 instanceof Fh.d.a) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        r4 = (Fh.d.a) r4;
        kotlin.jvm.internal.C6496s.e(r0);
        r0.a(r4.b(), r4.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        if (r5 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        r0 = r12.f63098b;
        kotlin.jvm.internal.C6496s.e(r7);
        r0.onClosed(r12, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        if (r5 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        sh.C6726e.m(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d3, code lost:
        if (r8 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d5, code lost:
        sh.C6726e.m(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r9 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        sh.C6726e.m(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e3, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e4, code lost:
        if (r5 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e6, code lost:
        sh.C6726e.m(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        if (r8 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        sh.C6726e.m(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ee, code lost:
        if (r9 != null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f0, code lost:
        sh.C6726e.m(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f3, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u() {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f63117u     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r12)
            return r1
        L_0x0008:
            Fh.h r0 = r12.f63107k     // Catch:{ all -> 0x0038 }
            java.util.ArrayDeque r2 = r12.f63111o     // Catch:{ all -> 0x0038 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0038 }
            r3 = 1
            r4 = 0
            r5 = -1
            if (r2 != 0) goto L_0x0073
            java.util.ArrayDeque r6 = r12.f63112p     // Catch:{ all -> 0x0038 }
            java.lang.Object r6 = r6.poll()     // Catch:{ all -> 0x0038 }
            boolean r7 = r6 instanceof Fh.d.a     // Catch:{ all -> 0x0038 }
            if (r7 == 0) goto L_0x0069
            int r1 = r12.f63115s     // Catch:{ all -> 0x0038 }
            java.lang.String r7 = r12.f63116t     // Catch:{ all -> 0x0038 }
            if (r1 == r5) goto L_0x003b
            Fh.d$d r5 = r12.f63110n     // Catch:{ all -> 0x0038 }
            r12.f63110n = r4     // Catch:{ all -> 0x0038 }
            Fh.g r8 = r12.f63106j     // Catch:{ all -> 0x0038 }
            r12.f63106j = r4     // Catch:{ all -> 0x0038 }
            Fh.h r9 = r12.f63107k     // Catch:{ all -> 0x0038 }
            r12.f63107k = r4     // Catch:{ all -> 0x0038 }
            vh.d r4 = r12.f63108l     // Catch:{ all -> 0x0038 }
            r4.n()     // Catch:{ all -> 0x0038 }
        L_0x0036:
            r4 = r6
            goto L_0x0078
        L_0x0038:
            r0 = move-exception
            goto L_0x00f4
        L_0x003b:
            r5 = r6
            Fh.d$a r5 = (Fh.d.a) r5     // Catch:{ all -> 0x0038 }
            long r8 = r5.a()     // Catch:{ all -> 0x0038 }
            vh.d r5 = r12.f63108l     // Catch:{ all -> 0x0038 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r10.<init>()     // Catch:{ all -> 0x0038 }
            java.lang.String r11 = r12.f63109m     // Catch:{ all -> 0x0038 }
            r10.append(r11)     // Catch:{ all -> 0x0038 }
            java.lang.String r11 = " cancel"
            r10.append(r11)     // Catch:{ all -> 0x0038 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0038 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0038 }
            long r8 = r11.toNanos(r8)     // Catch:{ all -> 0x0038 }
            Fh.d$h r11 = new Fh.d$h     // Catch:{ all -> 0x0038 }
            r11.<init>(r10, r3, r12)     // Catch:{ all -> 0x0038 }
            r5.i(r11, r8)     // Catch:{ all -> 0x0038 }
            r5 = r4
            r8 = r5
            r9 = r8
            goto L_0x0036
        L_0x0069:
            if (r6 != 0) goto L_0x006d
            monitor-exit(r12)
            return r1
        L_0x006d:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
            goto L_0x0036
        L_0x0073:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
        L_0x0078:
            lf.M r6 = lf.C6514M.f71813a     // Catch:{ all -> 0x0038 }
            monitor-exit(r12)
            if (r2 == 0) goto L_0x0088
            kotlin.jvm.internal.C6496s.e(r0)     // Catch:{ all -> 0x0086 }
            Gh.h r2 = (Gh.C5407h) r2     // Catch:{ all -> 0x0086 }
            r0.o(r2)     // Catch:{ all -> 0x0086 }
            goto L_0x00ce
        L_0x0086:
            r0 = move-exception
            goto L_0x00e4
        L_0x0088:
            boolean r2 = r4 instanceof Fh.d.c     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x00b0
            Fh.d$c r4 = (Fh.d.c) r4     // Catch:{ all -> 0x0086 }
            kotlin.jvm.internal.C6496s.e(r0)     // Catch:{ all -> 0x0086 }
            int r1 = r4.b()     // Catch:{ all -> 0x0086 }
            Gh.h r2 = r4.a()     // Catch:{ all -> 0x0086 }
            r0.f(r1, r2)     // Catch:{ all -> 0x0086 }
            monitor-enter(r12)     // Catch:{ all -> 0x0086 }
            long r0 = r12.f63113q     // Catch:{ all -> 0x00ad }
            Gh.h r2 = r4.a()     // Catch:{ all -> 0x00ad }
            int r2 = r2.O()     // Catch:{ all -> 0x00ad }
            long r6 = (long) r2     // Catch:{ all -> 0x00ad }
            long r0 = r0 - r6
            r12.f63113q = r0     // Catch:{ all -> 0x00ad }
            monitor-exit(r12)     // Catch:{ all -> 0x0086 }
            goto L_0x00ce
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x00b0:
            boolean r2 = r4 instanceof Fh.d.a     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x00de
            Fh.d$a r4 = (Fh.d.a) r4     // Catch:{ all -> 0x0086 }
            kotlin.jvm.internal.C6496s.e(r0)     // Catch:{ all -> 0x0086 }
            int r2 = r4.b()     // Catch:{ all -> 0x0086 }
            Gh.h r4 = r4.c()     // Catch:{ all -> 0x0086 }
            r0.a(r2, r4)     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x00ce
            rh.J r0 = r12.f63098b     // Catch:{ all -> 0x0086 }
            kotlin.jvm.internal.C6496s.e(r7)     // Catch:{ all -> 0x0086 }
            r0.onClosed(r12, r1, r7)     // Catch:{ all -> 0x0086 }
        L_0x00ce:
            if (r5 == 0) goto L_0x00d3
            sh.C6726e.m(r5)
        L_0x00d3:
            if (r8 == 0) goto L_0x00d8
            sh.C6726e.m(r8)
        L_0x00d8:
            if (r9 == 0) goto L_0x00dd
            sh.C6726e.m(r9)
        L_0x00dd:
            return r3
        L_0x00de:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0086 }
            r0.<init>()     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x00e4:
            if (r5 == 0) goto L_0x00e9
            sh.C6726e.m(r5)
        L_0x00e9:
            if (r8 == 0) goto L_0x00ee
            sh.C6726e.m(r8)
        L_0x00ee:
            if (r9 == 0) goto L_0x00f3
            sh.C6726e.m(r9)
        L_0x00f3:
            throw r0
        L_0x00f4:
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fh.d.u():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0024, code lost:
        if (r1 == -1) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0026, code lost:
        n(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.f63100d + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (rh.E) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.n(Gh.C5407h.f63296e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        n(r0, (rh.E) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f63117u     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            Fh.h r0 = r7.f63107k     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r1 = r7.f63121y     // Catch:{ all -> 0x0015 }
            r2 = -1
            if (r1 == 0) goto L_0x0017
            int r1 = r7.f63118v     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r0 = move-exception
            goto L_0x005b
        L_0x0017:
            r1 = r2
        L_0x0018:
            int r3 = r7.f63118v     // Catch:{ all -> 0x0015 }
            r4 = 1
            int r3 = r3 + r4
            r7.f63118v = r3     // Catch:{ all -> 0x0015 }
            r7.f63121y = r4     // Catch:{ all -> 0x0015 }
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x0015 }
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L_0x0050
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.f63100d
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.n(r0, r3)
            return
        L_0x0050:
            Gh.h r1 = Gh.C5407h.f63296e     // Catch:{ IOException -> 0x0056 }
            r0.n(r1)     // Catch:{ IOException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            r7.n(r0, r3)
        L_0x005a:
            return
        L_0x005b:
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fh.d.v():void");
    }

    public boolean send(C5407h hVar) {
        C6496s.h(hVar, "bytes");
        return t(hVar, 2);
    }
}
