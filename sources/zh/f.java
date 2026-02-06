package zh;

import Gh.C5404e;
import Gh.C5405f;
import Gh.C5406g;
import Gh.C5407h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import lf.C6514M;
import rh.u;
import sh.C6726e;
import vh.C6756a;
import vh.C6758c;
import vh.C6759d;
import vh.C6760e;
import yf.C6787a;
import zh.h;

public final class f implements Closeable {

    /* renamed from: C  reason: collision with root package name */
    public static final b f74061C = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public static final m f74062D;

    /* renamed from: A  reason: collision with root package name */
    private final d f74063A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final Set f74064B;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f74065a;

    /* renamed from: b  reason: collision with root package name */
    private final c f74066b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f74067c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final String f74068d;

    /* renamed from: e  reason: collision with root package name */
    private int f74069e;

    /* renamed from: f  reason: collision with root package name */
    private int f74070f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f74071g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C6760e f74072h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C6759d f74073i;

    /* renamed from: j  reason: collision with root package name */
    private final C6759d f74074j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C6759d f74075k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final l f74076l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public long f74077m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public long f74078n;

    /* renamed from: o  reason: collision with root package name */
    private long f74079o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public long f74080p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public long f74081q;

    /* renamed from: r  reason: collision with root package name */
    private long f74082r;

    /* renamed from: s  reason: collision with root package name */
    private final m f74083s;

    /* renamed from: t  reason: collision with root package name */
    private m f74084t;

    /* renamed from: u  reason: collision with root package name */
    private long f74085u;

    /* renamed from: v  reason: collision with root package name */
    private long f74086v;

    /* renamed from: w  reason: collision with root package name */
    private long f74087w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public long f74088x;

    /* renamed from: y  reason: collision with root package name */
    private final Socket f74089y;

    /* renamed from: z  reason: collision with root package name */
    private final j f74090z;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f74091a;

        /* renamed from: b  reason: collision with root package name */
        private final C6760e f74092b;

        /* renamed from: c  reason: collision with root package name */
        public Socket f74093c;

        /* renamed from: d  reason: collision with root package name */
        public String f74094d;

        /* renamed from: e  reason: collision with root package name */
        public C5406g f74095e;

        /* renamed from: f  reason: collision with root package name */
        public C5405f f74096f;

        /* renamed from: g  reason: collision with root package name */
        private c f74097g = c.f74101b;

        /* renamed from: h  reason: collision with root package name */
        private l f74098h = l.f74203b;

        /* renamed from: i  reason: collision with root package name */
        private int f74099i;

        public a(boolean z10, C6760e eVar) {
            C6496s.h(eVar, "taskRunner");
            this.f74091a = z10;
            this.f74092b = eVar;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f74091a;
        }

        public final String c() {
            String str = this.f74094d;
            if (str != null) {
                return str;
            }
            C6496s.v("connectionName");
            return null;
        }

        public final c d() {
            return this.f74097g;
        }

        public final int e() {
            return this.f74099i;
        }

        public final l f() {
            return this.f74098h;
        }

        public final C5405f g() {
            C5405f fVar = this.f74096f;
            if (fVar != null) {
                return fVar;
            }
            C6496s.v("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f74093c;
            if (socket != null) {
                return socket;
            }
            C6496s.v("socket");
            return null;
        }

        public final C5406g i() {
            C5406g gVar = this.f74095e;
            if (gVar != null) {
                return gVar;
            }
            C6496s.v("source");
            return null;
        }

        public final C6760e j() {
            return this.f74092b;
        }

        public final a k(c cVar) {
            C6496s.h(cVar, "listener");
            this.f74097g = cVar;
            return this;
        }

        public final a l(int i10) {
            this.f74099i = i10;
            return this;
        }

        public final void m(String str) {
            C6496s.h(str, "<set-?>");
            this.f74094d = str;
        }

        public final void n(C5405f fVar) {
            C6496s.h(fVar, "<set-?>");
            this.f74096f = fVar;
        }

        public final void o(Socket socket) {
            C6496s.h(socket, "<set-?>");
            this.f74093c = socket;
        }

        public final void p(C5406g gVar) {
            C6496s.h(gVar, "<set-?>");
            this.f74095e = gVar;
        }

        public final a q(Socket socket, String str, C5406g gVar, C5405f fVar) {
            String str2;
            C6496s.h(socket, "socket");
            C6496s.h(str, "peerName");
            C6496s.h(gVar, "source");
            C6496s.h(fVar, "sink");
            o(socket);
            if (this.f74091a) {
                str2 = C6726e.f73548i + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            m(str2);
            p(gVar);
            n(fVar);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return f.f74062D;
        }

        private b() {
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f74100a = new b((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        public static final c f74101b = new a();

        public static final class a extends c {
            a() {
            }

            public void b(i iVar) {
                C6496s.h(iVar, "stream");
                iVar.d(C6844b.REFUSED_STREAM, (IOException) null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public void a(f fVar, m mVar) {
            C6496s.h(fVar, "connection");
            C6496s.h(mVar, "settings");
        }

        public abstract void b(i iVar);
    }

    public static final class e extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f74114e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f74115f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5404e f74116g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f74117h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f74118i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z10, f fVar, int i10, C5404e eVar, int i11, boolean z11) {
            super(str, z10);
            this.f74114e = fVar;
            this.f74115f = i10;
            this.f74116g = eVar;
            this.f74117h = i11;
            this.f74118i = z11;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r5 = this;
                zh.f r0 = r5.f74114e     // Catch:{ IOException -> 0x003e }
                zh.l r0 = r0.f74076l     // Catch:{ IOException -> 0x003e }
                int r1 = r5.f74115f     // Catch:{ IOException -> 0x003e }
                Gh.e r2 = r5.f74116g     // Catch:{ IOException -> 0x003e }
                int r3 = r5.f74117h     // Catch:{ IOException -> 0x003e }
                boolean r4 = r5.f74118i     // Catch:{ IOException -> 0x003e }
                boolean r0 = r0.a(r1, r2, r3, r4)     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x0021
                zh.f r1 = r5.f74114e     // Catch:{ IOException -> 0x003e }
                zh.j r1 = r1.W0()     // Catch:{ IOException -> 0x003e }
                int r2 = r5.f74115f     // Catch:{ IOException -> 0x003e }
                zh.b r3 = zh.C6844b.CANCEL     // Catch:{ IOException -> 0x003e }
                r1.F(r2, r3)     // Catch:{ IOException -> 0x003e }
            L_0x0021:
                if (r0 != 0) goto L_0x0027
                boolean r0 = r5.f74118i     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x003e
            L_0x0027:
                zh.f r0 = r5.f74114e     // Catch:{ IOException -> 0x003e }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003e }
                zh.f r1 = r5.f74114e     // Catch:{ all -> 0x003b }
                java.util.Set r1 = r1.f74064B     // Catch:{ all -> 0x003b }
                int r2 = r5.f74115f     // Catch:{ all -> 0x003b }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
                r1.remove(r2)     // Catch:{ all -> 0x003b }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                goto L_0x003e
            L_0x003b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                throw r1     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.f.e.f():long");
        }
    }

    /* renamed from: zh.f$f  reason: collision with other inner class name */
    public static final class C1081f extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f74119e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f74120f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f74121g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f74122h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1081f(String str, boolean z10, f fVar, int i10, List list, boolean z11) {
            super(str, z10);
            this.f74119e = fVar;
            this.f74120f = i10;
            this.f74121g = list;
            this.f74122h = z11;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r4 = this;
                zh.f r0 = r4.f74119e
                zh.l r0 = r0.f74076l
                int r1 = r4.f74120f
                java.util.List r2 = r4.f74121g
                boolean r3 = r4.f74122h
                boolean r0 = r0.c(r1, r2, r3)
                if (r0 == 0) goto L_0x001f
                zh.f r1 = r4.f74119e     // Catch:{ IOException -> 0x003c }
                zh.j r1 = r1.W0()     // Catch:{ IOException -> 0x003c }
                int r2 = r4.f74120f     // Catch:{ IOException -> 0x003c }
                zh.b r3 = zh.C6844b.CANCEL     // Catch:{ IOException -> 0x003c }
                r1.F(r2, r3)     // Catch:{ IOException -> 0x003c }
            L_0x001f:
                if (r0 != 0) goto L_0x0025
                boolean r0 = r4.f74122h     // Catch:{ IOException -> 0x003c }
                if (r0 == 0) goto L_0x003c
            L_0x0025:
                zh.f r0 = r4.f74119e     // Catch:{ IOException -> 0x003c }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003c }
                zh.f r1 = r4.f74119e     // Catch:{ all -> 0x0039 }
                java.util.Set r1 = r1.f74064B     // Catch:{ all -> 0x0039 }
                int r2 = r4.f74120f     // Catch:{ all -> 0x0039 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0039 }
                r1.remove(r2)     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                goto L_0x003c
            L_0x0039:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                throw r1     // Catch:{ IOException -> 0x003c }
            L_0x003c:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.f.C1081f.f():long");
        }
    }

    public static final class g extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f74123e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f74124f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f74125g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, f fVar, int i10, List list) {
            super(str, z10);
            this.f74123e = fVar;
            this.f74124f = i10;
            this.f74125g = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r3 = this;
                zh.f r0 = r3.f74123e
                zh.l r0 = r0.f74076l
                int r1 = r3.f74124f
                java.util.List r2 = r3.f74125g
                boolean r0 = r0.b(r1, r2)
                if (r0 == 0) goto L_0x0034
                zh.f r0 = r3.f74123e     // Catch:{ IOException -> 0x0034 }
                zh.j r0 = r0.W0()     // Catch:{ IOException -> 0x0034 }
                int r1 = r3.f74124f     // Catch:{ IOException -> 0x0034 }
                zh.b r2 = zh.C6844b.CANCEL     // Catch:{ IOException -> 0x0034 }
                r0.F(r1, r2)     // Catch:{ IOException -> 0x0034 }
                zh.f r0 = r3.f74123e     // Catch:{ IOException -> 0x0034 }
                monitor-enter(r0)     // Catch:{ IOException -> 0x0034 }
                zh.f r1 = r3.f74123e     // Catch:{ all -> 0x0031 }
                java.util.Set r1 = r1.f74064B     // Catch:{ all -> 0x0031 }
                int r2 = r3.f74124f     // Catch:{ all -> 0x0031 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0031 }
                r1.remove(r2)     // Catch:{ all -> 0x0031 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                goto L_0x0034
            L_0x0031:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                throw r1     // Catch:{ IOException -> 0x0034 }
            L_0x0034:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.f.g.f():long");
        }
    }

    public static final class h extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f74126e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f74127f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6844b f74128g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, f fVar, int i10, C6844b bVar) {
            super(str, z10);
            this.f74126e = fVar;
            this.f74127f = i10;
            this.f74128g = bVar;
        }

        public long f() {
            this.f74126e.f74076l.d(this.f74127f, this.f74128g);
            synchronized (this.f74126e) {
                this.f74126e.f74064B.remove(Integer.valueOf(this.f74127f));
                C6514M m10 = C6514M.f71813a;
            }
            return -1;
        }
    }

    public static final class i extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f74129e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, f fVar) {
            super(str, z10);
            this.f74129e = fVar;
        }

        public long f() {
            this.f74129e.Q1(false, 2, 0);
            return -1;
        }
    }

    public static final class j extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f74130e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f74131f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(String str, f fVar, long j10) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f74130e = fVar;
            this.f74131f = j10;
        }

        public long f() {
            boolean z10;
            synchronized (this.f74130e) {
                if (this.f74130e.f74078n < this.f74130e.f74077m) {
                    z10 = true;
                } else {
                    this.f74130e.f74077m = this.f74130e.f74077m + 1;
                    z10 = false;
                }
            }
            if (z10) {
                this.f74130e.h0((IOException) null);
                return -1;
            }
            this.f74130e.Q1(false, 1, 0);
            return this.f74131f;
        }
    }

    public static final class k extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f74132e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f74133f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6844b f74134g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, f fVar, int i10, C6844b bVar) {
            super(str, z10);
            this.f74132e = fVar;
            this.f74133f = i10;
            this.f74134g = bVar;
        }

        public long f() {
            try {
                this.f74132e.R1(this.f74133f, this.f74134g);
                return -1;
            } catch (IOException e10) {
                this.f74132e.h0(e10);
                return -1;
            }
        }
    }

    public static final class l extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f74135e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f74136f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f74137g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, f fVar, int i10, long j10) {
            super(str, z10);
            this.f74135e = fVar;
            this.f74136f = i10;
            this.f74137g = j10;
        }

        public long f() {
            try {
                this.f74135e.W0().M(this.f74136f, this.f74137g);
                return -1;
            } catch (IOException e10) {
                this.f74135e.h0(e10);
                return -1;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        f74062D = mVar;
    }

    public f(a aVar) {
        int i10;
        C6496s.h(aVar, "builder");
        boolean b10 = aVar.b();
        this.f74065a = b10;
        this.f74066b = aVar.d();
        String c10 = aVar.c();
        this.f74068d = c10;
        if (aVar.b()) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f74070f = i10;
        C6760e j10 = aVar.j();
        this.f74072h = j10;
        C6759d i11 = j10.i();
        this.f74073i = i11;
        this.f74074j = j10.i();
        this.f74075k = j10.i();
        this.f74076l = aVar.f();
        m mVar = new m();
        if (aVar.b()) {
            mVar.h(7, 16777216);
        }
        this.f74083s = mVar;
        m mVar2 = f74062D;
        this.f74084t = mVar2;
        this.f74088x = (long) mVar2.c();
        this.f74089y = aVar.h();
        this.f74090z = new j(aVar.g(), b10);
        this.f74063A = new d(this, new h(aVar.i(), b10));
        this.f74064B = new LinkedHashSet();
        if (aVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) aVar.e());
            i11.i(new j(c10 + " ping", this, nanos), nanos);
        }
    }

    public static /* synthetic */ void M1(f fVar, boolean z10, C6760e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar = C6760e.f73695i;
        }
        fVar.L1(z10, eVar);
    }

    /* access modifiers changed from: private */
    public final void h0(IOException iOException) {
        C6844b bVar = C6844b.PROTOCOL_ERROR;
        g0(bVar, bVar, iOException);
    }

    private final i z1(int i10, List list, boolean z10) {
        int i11;
        i iVar;
        boolean z11 = true;
        boolean z12 = !z10;
        synchronized (this.f74090z) {
            try {
                synchronized (this) {
                    if (this.f74070f > 1073741823) {
                        K1(C6844b.REFUSED_STREAM);
                    }
                    if (!this.f74071g) {
                        i11 = this.f74070f;
                        this.f74070f = i11 + 2;
                        iVar = new i(i11, this, z12, false, (u) null);
                        if (z10 && this.f74087w < this.f74088x) {
                            if (iVar.r() < iVar.q()) {
                                z11 = false;
                            }
                        }
                        if (iVar.u()) {
                            this.f74067c.put(Integer.valueOf(i11), iVar);
                        }
                        C6514M m10 = C6514M.f71813a;
                    } else {
                        throw new C6843a();
                    }
                }
                if (i10 == 0) {
                    this.f74090z.t(z12, i11, list);
                } else if (!this.f74065a) {
                    this.f74090z.E(i10, i11, list);
                } else {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
        if (z11) {
            this.f74090z.flush();
        }
        return iVar;
    }

    public final i A1(List list, boolean z10) {
        C6496s.h(list, "requestHeaders");
        return z1(0, list, z10);
    }

    public final int B0() {
        return this.f74070f;
    }

    public final void B1(int i10, C5406g gVar, int i11, boolean z10) {
        C6496s.h(gVar, "source");
        C5404e eVar = new C5404e();
        long j10 = (long) i11;
        gVar.u0(j10);
        gVar.y1(eVar, j10);
        C6759d dVar = this.f74074j;
        dVar.i(new e(this.f74068d + '[' + i10 + "] onData", true, this, i10, eVar, i11, z10), 0);
    }

    public final void C1(int i10, List list, boolean z10) {
        C6496s.h(list, "requestHeaders");
        C6759d dVar = this.f74074j;
        dVar.i(new C1081f(this.f74068d + '[' + i10 + "] onHeaders", true, this, i10, list, z10), 0);
    }

    public final void D1(int i10, List list) {
        C6496s.h(list, "requestHeaders");
        synchronized (this) {
            if (this.f74064B.contains(Integer.valueOf(i10))) {
                S1(i10, C6844b.PROTOCOL_ERROR);
                return;
            }
            this.f74064B.add(Integer.valueOf(i10));
            C6759d dVar = this.f74074j;
            dVar.i(new g(this.f74068d + '[' + i10 + "] onRequest", true, this, i10, list), 0);
        }
    }

    public final m E0() {
        return this.f74083s;
    }

    public final void E1(int i10, C6844b bVar) {
        C6496s.h(bVar, "errorCode");
        C6759d dVar = this.f74074j;
        dVar.i(new h(this.f74068d + '[' + i10 + "] onReset", true, this, i10, bVar), 0);
    }

    public final boolean F1(int i10) {
        if (i10 == 0 || (i10 & 1) != 0) {
            return false;
        }
        return true;
    }

    public final synchronized i G1(int i10) {
        i iVar;
        iVar = (i) this.f74067c.remove(Integer.valueOf(i10));
        C6496s.f(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return iVar;
    }

    public final void H1() {
        synchronized (this) {
            long j10 = this.f74080p;
            long j11 = this.f74079o;
            if (j10 >= j11) {
                this.f74079o = j11 + 1;
                this.f74082r = System.nanoTime() + ((long) 1000000000);
                C6514M m10 = C6514M.f71813a;
                C6759d dVar = this.f74073i;
                dVar.i(new i(this.f74068d + " ping", true, this), 0);
            }
        }
    }

    public final m I0() {
        return this.f74084t;
    }

    public final void I1(int i10) {
        this.f74069e = i10;
    }

    public final void J1(m mVar) {
        C6496s.h(mVar, "<set-?>");
        this.f74084t = mVar;
    }

    public final void K1(C6844b bVar) {
        C6496s.h(bVar, "statusCode");
        synchronized (this.f74090z) {
            L l10 = new L();
            synchronized (this) {
                if (!this.f74071g) {
                    this.f74071g = true;
                    int i10 = this.f74069e;
                    l10.f71757a = i10;
                    C6514M m10 = C6514M.f71813a;
                    this.f74090z.q(i10, bVar, C6726e.f73540a);
                }
            }
        }
    }

    public final synchronized i L0(int i10) {
        return (i) this.f74067c.get(Integer.valueOf(i10));
    }

    public final void L1(boolean z10, C6760e eVar) {
        C6496s.h(eVar, "taskRunner");
        if (z10) {
            this.f74090z.b();
            this.f74090z.I(this.f74083s);
            int c10 = this.f74083s.c();
            if (c10 != 65535) {
                this.f74090z.M(0, (long) (c10 - 65535));
            }
        }
        eVar.i().i(new C6758c(this.f74068d, true, this.f74063A), 0);
    }

    public final synchronized void N1(long j10) {
        long j11 = this.f74085u + j10;
        this.f74085u = j11;
        long j12 = j11 - this.f74086v;
        if (j12 >= ((long) (this.f74083s.c() / 2))) {
            T1(0, j12);
            this.f74086v += j12;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f74090z.v());
        r6 = (long) r2;
        r8.f74087w += r6;
        r4 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O1(int r9, boolean r10, Gh.C5404e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            zh.j r12 = r8.f74090z
            r12.f(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0071
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f74087w     // Catch:{ InterruptedException -> 0x0062 }
            long r6 = r8.f74088x     // Catch:{ InterruptedException -> 0x0062 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0039
            java.util.Map r2 = r8.f74067c     // Catch:{ InterruptedException -> 0x0062 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0062 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0062 }
            if (r2 == 0) goto L_0x0031
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.C6496s.f(r8, r2)     // Catch:{ InterruptedException -> 0x0062 }
            r8.wait()     // Catch:{ InterruptedException -> 0x0062 }
            goto L_0x0012
        L_0x002f:
            r9 = move-exception
            goto L_0x006f
        L_0x0031:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0062 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0062 }
            throw r9     // Catch:{ InterruptedException -> 0x0062 }
        L_0x0039:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x002f }
            int r2 = (int) r4     // Catch:{ all -> 0x002f }
            zh.j r4 = r8.f74090z     // Catch:{ all -> 0x002f }
            int r4 = r4.v()     // Catch:{ all -> 0x002f }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x002f }
            long r4 = r8.f74087w     // Catch:{ all -> 0x002f }
            long r6 = (long) r2     // Catch:{ all -> 0x002f }
            long r4 = r4 + r6
            r8.f74087w = r4     // Catch:{ all -> 0x002f }
            lf.M r4 = lf.C6514M.f71813a     // Catch:{ all -> 0x002f }
            monitor-exit(r8)
            long r12 = r12 - r6
            zh.j r4 = r8.f74090z
            if (r10 == 0) goto L_0x005d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x005d
            r5 = 1
            goto L_0x005e
        L_0x005d:
            r5 = r3
        L_0x005e:
            r4.f(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0062:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002f }
            r9.interrupt()     // Catch:{ all -> 0x002f }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002f }
            r9.<init>()     // Catch:{ all -> 0x002f }
            throw r9     // Catch:{ all -> 0x002f }
        L_0x006f:
            monitor-exit(r8)
            throw r9
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.f.O1(int, boolean, Gh.e, long):void");
    }

    public final Map P0() {
        return this.f74067c;
    }

    public final void P1(int i10, boolean z10, List list) {
        C6496s.h(list, "alternating");
        this.f74090z.t(z10, i10, list);
    }

    public final void Q1(boolean z10, int i10, int i11) {
        try {
            this.f74090z.y(z10, i10, i11);
        } catch (IOException e10) {
            h0(e10);
        }
    }

    public final long R0() {
        return this.f74088x;
    }

    public final void R1(int i10, C6844b bVar) {
        C6496s.h(bVar, "statusCode");
        this.f74090z.F(i10, bVar);
    }

    public final void S1(int i10, C6844b bVar) {
        C6496s.h(bVar, "errorCode");
        C6759d dVar = this.f74073i;
        dVar.i(new k(this.f74068d + '[' + i10 + "] writeSynReset", true, this, i10, bVar), 0);
    }

    public final void T1(int i10, long j10) {
        C6759d dVar = this.f74073i;
        dVar.i(new l(this.f74068d + '[' + i10 + "] windowUpdate", true, this, i10, j10), 0);
    }

    public final j W0() {
        return this.f74090z;
    }

    public void close() {
        g0(C6844b.NO_ERROR, C6844b.CANCEL, (IOException) null);
    }

    public final void flush() {
        this.f74090z.flush();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:(2:6|7)|3f|19|(2:21|(5:23|24|25|37|26))|28|29|30|31|32|34) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0075 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0(zh.C6844b r4, zh.C6844b r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            boolean r0 = sh.C6726e.f73547h
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x003c
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x003c:
            r3.K1(r4)     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            monitor-enter(r3)
            java.util.Map r4 = r3.f74067c     // Catch:{ all -> 0x005b }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x005b }
            r0 = 0
            if (r4 != 0) goto L_0x005d
            java.util.Map r4 = r3.f74067c     // Catch:{ all -> 0x005b }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x005b }
            zh.i[] r1 = new zh.i[r0]     // Catch:{ all -> 0x005b }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x005b }
            java.util.Map r1 = r3.f74067c     // Catch:{ all -> 0x005b }
            r1.clear()     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r4 = move-exception
            goto L_0x008a
        L_0x005d:
            r4 = 0
        L_0x005e:
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x005b }
            monitor-exit(r3)
            zh.i[] r4 = (zh.i[]) r4
            if (r4 == 0) goto L_0x0070
            int r1 = r4.length
        L_0x0066:
            if (r0 >= r1) goto L_0x0070
            r2 = r4[r0]
            r2.d(r5, r6)     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            int r0 = r0 + 1
            goto L_0x0066
        L_0x0070:
            zh.j r4 = r3.f74090z     // Catch:{ IOException -> 0x0075 }
            r4.close()     // Catch:{ IOException -> 0x0075 }
        L_0x0075:
            java.net.Socket r4 = r3.f74089y     // Catch:{ IOException -> 0x007a }
            r4.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            vh.d r4 = r3.f74073i
            r4.n()
            vh.d r4 = r3.f74074j
            r4.n()
            vh.d r4 = r3.f74075k
            r4.n()
            return
        L_0x008a:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.f.g0(zh.b, zh.b, java.io.IOException):void");
    }

    public final boolean j0() {
        return this.f74065a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean n1(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f74071g     // Catch:{ all -> 0x0018 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r6)
            return r1
        L_0x0008:
            long r2 = r6.f74080p     // Catch:{ all -> 0x0018 }
            long r4 = r6.f74079o     // Catch:{ all -> 0x0018 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            long r2 = r6.f74082r     // Catch:{ all -> 0x0018 }
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x001a
            monitor-exit(r6)
            return r1
        L_0x0018:
            r7 = move-exception
            goto L_0x001d
        L_0x001a:
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x001d:
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.f.n1(long):boolean");
    }

    public final String o0() {
        return this.f74068d;
    }

    public final int t0() {
        return this.f74069e;
    }

    public final c x0() {
        return this.f74066b;
    }

    public final class d implements h.c, C6787a {

        /* renamed from: a  reason: collision with root package name */
        private final h f74102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f74103b;

        public static final class a extends C6756a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ f f74104e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ N f74105f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, f fVar, N n10) {
                super(str, z10);
                this.f74104e = fVar;
                this.f74105f = n10;
            }

            public long f() {
                this.f74104e.x0().a(this.f74104e, (m) this.f74105f.f71759a);
                return -1;
            }
        }

        public static final class b extends C6756a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ f f74106e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ i f74107f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, f fVar, i iVar) {
                super(str, z10);
                this.f74106e = fVar;
                this.f74107f = iVar;
            }

            public long f() {
                try {
                    this.f74106e.x0().b(this.f74107f);
                    return -1;
                } catch (IOException e10) {
                    Bh.j g10 = Bh.j.f62626a.g();
                    g10.k("Http2Connection.Listener failure for " + this.f74106e.o0(), 4, e10);
                    try {
                        this.f74107f.d(C6844b.PROTOCOL_ERROR, e10);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        public static final class c extends C6756a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ f f74108e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f74109f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f74110g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, f fVar, int i10, int i11) {
                super(str, z10);
                this.f74108e = fVar;
                this.f74109f = i10;
                this.f74110g = i11;
            }

            public long f() {
                this.f74108e.Q1(true, this.f74109f, this.f74110g);
                return -1;
            }
        }

        /* renamed from: zh.f$d$d  reason: collision with other inner class name */
        public static final class C1080d extends C6756a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ d f74111e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f74112f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ m f74113g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1080d(String str, boolean z10, d dVar, boolean z11, m mVar) {
                super(str, z10);
                this.f74111e = dVar;
                this.f74112f = z11;
                this.f74113g = mVar;
            }

            public long f() {
                this.f74111e.q(this.f74112f, this.f74113g);
                return -1;
            }
        }

        public d(f fVar, h hVar) {
            C6496s.h(hVar, "reader");
            this.f74103b = fVar;
            this.f74102a = hVar;
        }

        public void a(int i10, C6844b bVar) {
            C6496s.h(bVar, "errorCode");
            if (this.f74103b.F1(i10)) {
                this.f74103b.E1(i10, bVar);
                return;
            }
            i G12 = this.f74103b.G1(i10);
            if (G12 != null) {
                G12.y(bVar);
            }
        }

        public void b(boolean z10, int i10, int i11, List list) {
            C6496s.h(list, "headerBlock");
            if (this.f74103b.F1(i10)) {
                this.f74103b.C1(i10, list, z10);
                return;
            }
            f fVar = this.f74103b;
            synchronized (fVar) {
                i L02 = fVar.L0(i10);
                if (L02 != null) {
                    C6514M m10 = C6514M.f71813a;
                    L02.x(C6726e.Q(list), z10);
                } else if (!fVar.f74071g) {
                    if (i10 > fVar.t0()) {
                        if (i10 % 2 != fVar.B0() % 2) {
                            i iVar = new i(i10, fVar, false, z10, C6726e.Q(list));
                            fVar.I1(i10);
                            fVar.P0().put(Integer.valueOf(i10), iVar);
                            C6759d i12 = fVar.f74072h.i();
                            i12.i(new b(fVar.o0() + '[' + i10 + "] onStream", true, fVar, iVar), 0);
                        }
                    }
                }
            }
        }

        public void c(int i10, long j10) {
            if (i10 == 0) {
                f fVar = this.f74103b;
                synchronized (fVar) {
                    fVar.f74088x = fVar.R0() + j10;
                    C6496s.f(fVar, "null cannot be cast to non-null type java.lang.Object");
                    fVar.notifyAll();
                    C6514M m10 = C6514M.f71813a;
                }
                return;
            }
            i L02 = this.f74103b.L0(i10);
            if (L02 != null) {
                synchronized (L02) {
                    L02.a(j10);
                    C6514M m11 = C6514M.f71813a;
                }
            }
        }

        public void e(boolean z10, m mVar) {
            C6496s.h(mVar, "settings");
            C6759d F10 = this.f74103b.f74073i;
            F10.i(new C1080d(this.f74103b.o0() + " applyAndAckSettings", true, this, z10, mVar), 0);
        }

        public void h(int i10, C6844b bVar, C5407h hVar) {
            int i11;
            Object[] array;
            C6496s.h(bVar, "errorCode");
            C6496s.h(hVar, "debugData");
            hVar.O();
            f fVar = this.f74103b;
            synchronized (fVar) {
                array = fVar.P0().values().toArray(new i[0]);
                fVar.f74071g = true;
                C6514M m10 = C6514M.f71813a;
            }
            for (i iVar : (i[]) array) {
                if (iVar.j() > i10 && iVar.t()) {
                    iVar.y(C6844b.REFUSED_STREAM);
                    this.f74103b.G1(iVar.j());
                }
            }
        }

        public void i(int i10, int i11, List list) {
            C6496s.h(list, "requestHeaders");
            this.f74103b.D1(i11, list);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            r();
            return C6514M.f71813a;
        }

        public void l(boolean z10, int i10, C5406g gVar, int i11) {
            C6496s.h(gVar, "source");
            if (this.f74103b.F1(i10)) {
                this.f74103b.B1(i10, gVar, i11, z10);
                return;
            }
            i L02 = this.f74103b.L0(i10);
            if (L02 == null) {
                this.f74103b.S1(i10, C6844b.PROTOCOL_ERROR);
                long j10 = (long) i11;
                this.f74103b.N1(j10);
                gVar.skip(j10);
                return;
            }
            L02.w(gVar, i11);
            if (z10) {
                L02.x(C6726e.f73541b, true);
            }
        }

        public void m(boolean z10, int i10, int i11) {
            if (z10) {
                f fVar = this.f74103b;
                synchronized (fVar) {
                    if (i10 == 1) {
                        fVar.f74078n = fVar.f74078n + 1;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            fVar.f74081q = fVar.f74081q + 1;
                            C6496s.f(fVar, "null cannot be cast to non-null type java.lang.Object");
                            fVar.notifyAll();
                        }
                        try {
                            C6514M m10 = C6514M.f71813a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        fVar.f74080p = fVar.f74080p + 1;
                    }
                }
                return;
            }
            C6759d F10 = this.f74103b.f74073i;
            F10.i(new c(this.f74103b.o0() + " ping", true, this.f74103b, i10, i11), 0);
        }

        public final void q(boolean z10, m mVar) {
            long c10;
            int i10;
            i[] iVarArr;
            C6496s.h(mVar, "settings");
            N n10 = new N();
            j W02 = this.f74103b.W0();
            f fVar = this.f74103b;
            synchronized (W02) {
                synchronized (fVar) {
                    try {
                        m I02 = fVar.I0();
                        if (!z10) {
                            m mVar2 = new m();
                            mVar2.g(I02);
                            mVar2.g(mVar);
                            mVar = mVar2;
                        }
                        n10.f71759a = mVar;
                        c10 = ((long) mVar.c()) - ((long) I02.c());
                        if (c10 != 0) {
                            if (!fVar.P0().isEmpty()) {
                                iVarArr = (i[]) fVar.P0().values().toArray(new i[0]);
                                fVar.J1((m) n10.f71759a);
                                fVar.f74075k.i(new a(fVar.o0() + " onSettings", true, fVar, n10), 0);
                                C6514M m10 = C6514M.f71813a;
                            }
                        }
                        iVarArr = null;
                        fVar.J1((m) n10.f71759a);
                        fVar.f74075k.i(new a(fVar.o0() + " onSettings", true, fVar, n10), 0);
                        C6514M m102 = C6514M.f71813a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    fVar.W0().a((m) n10.f71759a);
                } catch (IOException e10) {
                    fVar.h0(e10);
                }
                C6514M m11 = C6514M.f71813a;
            }
            if (iVarArr != null) {
                for (i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(c10);
                        C6514M m12 = C6514M.f71813a;
                    }
                }
            }
        }

        public void r() {
            C6844b bVar;
            C6844b bVar2 = C6844b.INTERNAL_ERROR;
            e = null;
            try {
                this.f74102a.f(this);
                do {
                } while (this.f74102a.b(false, this));
                bVar = C6844b.NO_ERROR;
                try {
                    this.f74103b.g0(bVar, C6844b.CANCEL, (IOException) null);
                } catch (IOException e10) {
                    e = e10;
                    try {
                        C6844b bVar3 = C6844b.PROTOCOL_ERROR;
                        this.f74103b.g0(bVar3, bVar3, e);
                        C6726e.m(this.f74102a);
                    } catch (Throwable th2) {
                        th = th2;
                        this.f74103b.g0(bVar, bVar2, e);
                        C6726e.m(this.f74102a);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                bVar = bVar2;
                C6844b bVar32 = C6844b.PROTOCOL_ERROR;
                this.f74103b.g0(bVar32, bVar32, e);
                C6726e.m(this.f74102a);
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                this.f74103b.g0(bVar, bVar2, e);
                C6726e.m(this.f74102a);
                throw th;
            }
            C6726e.m(this.f74102a);
        }

        public void j() {
        }

        public void o(int i10, int i11, int i12, boolean z10) {
        }
    }
}
