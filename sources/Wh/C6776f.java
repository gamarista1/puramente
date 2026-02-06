package wh;

import Bh.j;
import Fh.d;
import Gh.C5405f;
import Gh.C5406g;
import Gh.H;
import Sg.p;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import rh.B;
import rh.C;
import rh.C6703A;
import rh.C6704a;
import rh.C6708e;
import rh.C6710g;
import rh.C6713j;
import rh.D;
import rh.E;
import rh.G;
import rh.r;
import rh.t;
import rh.v;
import sh.C6726e;
import vh.C6760e;
import xh.g;
import yf.C6787a;
import yh.C6827b;
import zh.C6843a;
import zh.C6844b;
import zh.f;
import zh.i;
import zh.m;
import zh.n;

/* renamed from: wh.f  reason: case insensitive filesystem */
public final class C6776f extends f.c implements C6713j {

    /* renamed from: t  reason: collision with root package name */
    public static final a f73828t = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final C6777g f73829c;

    /* renamed from: d  reason: collision with root package name */
    private final G f73830d;

    /* renamed from: e  reason: collision with root package name */
    private Socket f73831e;

    /* renamed from: f  reason: collision with root package name */
    private Socket f73832f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public t f73833g;

    /* renamed from: h  reason: collision with root package name */
    private B f73834h;

    /* renamed from: i  reason: collision with root package name */
    private f f73835i;

    /* renamed from: j  reason: collision with root package name */
    private C5406g f73836j;

    /* renamed from: k  reason: collision with root package name */
    private C5405f f73837k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f73838l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f73839m;

    /* renamed from: n  reason: collision with root package name */
    private int f73840n;

    /* renamed from: o  reason: collision with root package name */
    private int f73841o;

    /* renamed from: p  reason: collision with root package name */
    private int f73842p;

    /* renamed from: q  reason: collision with root package name */
    private int f73843q = 1;

    /* renamed from: r  reason: collision with root package name */
    private final List f73844r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private long f73845s = Long.MAX_VALUE;

    /* renamed from: wh.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: wh.f$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73846a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f73846a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wh.C6776f.b.<clinit>():void");
        }
    }

    /* renamed from: wh.f$c */
    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6710g f73847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f73848b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6704a f73849c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6710g gVar, t tVar, C6704a aVar) {
            super(0);
            this.f73847a = gVar;
            this.f73848b = tVar;
            this.f73849c = aVar;
        }

        public final List invoke() {
            Eh.c d10 = this.f73847a.d();
            C6496s.e(d10);
            return d10.a(this.f73848b.d(), this.f73849c.l().i());
        }
    }

    /* renamed from: wh.f$d */
    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6776f f73850a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6776f fVar) {
            super(0);
            this.f73850a = fVar;
        }

        public final List invoke() {
            t c10 = this.f73850a.f73833g;
            C6496s.e(c10);
            Iterable<Certificate> d10 = c10.d();
            ArrayList arrayList = new ArrayList(C6565s.y(d10, 10));
            for (Certificate certificate : d10) {
                C6496s.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* renamed from: wh.f$e */
    public static final class e extends d.C0935d {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6773c f73851d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5406g gVar, C5405f fVar, C6773c cVar) {
            super(true, gVar, fVar);
            this.f73851d = cVar;
        }

        public void close() {
            this.f73851d.a(-1, true, true, (IOException) null);
        }
    }

    public C6776f(C6777g gVar, G g10) {
        C6496s.h(gVar, "connectionPool");
        C6496s.h(g10, "route");
        this.f73829c = gVar;
        this.f73830d = g10;
    }

    private final boolean B(List list) {
        Iterable<G> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (G g10 : iterable) {
            Proxy.Type type = g10.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f73830d.b().type() == type2 && C6496s.c(this.f73830d.d(), g10.d())) {
                return true;
            }
        }
        return false;
    }

    private final void F(int i10) {
        Socket socket = this.f73832f;
        C6496s.e(socket);
        C5406g gVar = this.f73836j;
        C6496s.e(gVar);
        C5405f fVar = this.f73837k;
        C6496s.e(fVar);
        socket.setSoTimeout(0);
        f a10 = new f.a(true, C6760e.f73695i).q(socket, this.f73830d.a().l().i(), gVar, fVar).k(this).l(i10).a();
        this.f73835i = a10;
        this.f73843q = f.f74061C.a().d();
        f.M1(a10, false, (C6760e) null, 3, (Object) null);
    }

    private final boolean G(v vVar) {
        t tVar;
        if (!C6726e.f73547h || Thread.holdsLock(this)) {
            v l10 = this.f73830d.a().l();
            if (vVar.o() != l10.o()) {
                return false;
            }
            if (C6496s.c(vVar.i(), l10.i())) {
                return true;
            }
            if (this.f73839m || (tVar = this.f73833g) == null) {
                return false;
            }
            C6496s.e(tVar);
            if (e(vVar, tVar)) {
                return true;
            }
            return false;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final boolean e(v vVar, t tVar) {
        List d10 = tVar.d();
        if (d10.isEmpty()) {
            return false;
        }
        Eh.d dVar = Eh.d.f62875a;
        String i10 = vVar.i();
        Object obj = d10.get(0);
        C6496s.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        if (dVar.e(i10, (X509Certificate) obj)) {
            return true;
        }
        return false;
    }

    private final void h(int i10, int i11, C6708e eVar, r rVar) {
        int i12;
        Socket socket;
        Proxy b10 = this.f73830d.b();
        C6704a a10 = this.f73830d.a();
        Proxy.Type type = b10.type();
        if (type == null) {
            i12 = -1;
        } else {
            i12 = b.f73846a[type.ordinal()];
        }
        if (i12 == 1 || i12 == 2) {
            socket = a10.j().createSocket();
            C6496s.e(socket);
        } else {
            socket = new Socket(b10);
        }
        this.f73831e = socket;
        rVar.j(eVar, this.f73830d.d(), b10);
        socket.setSoTimeout(i11);
        try {
            j.f62626a.g().f(socket, this.f73830d.d(), i10);
            try {
                this.f73836j = H.d(H.m(socket));
                this.f73837k = H.c(H.i(socket));
            } catch (NullPointerException e10) {
                if (C6496s.c(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f73830d.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i(wh.C6772b r11) {
        /*
            r10 = this;
            rh.G r0 = r10.f73830d
            rh.a r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.k()
            r2 = 0
            kotlin.jvm.internal.C6496s.e(r1)     // Catch:{ all -> 0x0174 }
            java.net.Socket r3 = r10.f73831e     // Catch:{ all -> 0x0174 }
            rh.v r4 = r0.l()     // Catch:{ all -> 0x0174 }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x0174 }
            rh.v r5 = r0.l()     // Catch:{ all -> 0x0174 }
            int r5 = r5.o()     // Catch:{ all -> 0x0174 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            kotlin.jvm.internal.C6496s.f(r1, r3)     // Catch:{ all -> 0x0174 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x0174 }
            rh.l r11 = r11.a(r1)     // Catch:{ all -> 0x004c }
            boolean r3 = r11.h()     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0050
            Bh.j$a r3 = Bh.j.f62626a     // Catch:{ all -> 0x004c }
            Bh.j r3 = r3.g()     // Catch:{ all -> 0x004c }
            rh.v r4 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x004c }
            java.util.List r5 = r0.f()     // Catch:{ all -> 0x004c }
            r3.e(r1, r4, r5)     // Catch:{ all -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r11 = move-exception
            r2 = r1
            goto L_0x0175
        L_0x0050:
            r1.startHandshake()     // Catch:{ all -> 0x004c }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x004c }
            rh.t$a r4 = rh.t.f73466e     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "sslSocketSession"
            kotlin.jvm.internal.C6496s.g(r3, r5)     // Catch:{ all -> 0x004c }
            rh.t r4 = r4.a(r3)     // Catch:{ all -> 0x004c }
            javax.net.ssl.HostnameVerifier r5 = r0.e()     // Catch:{ all -> 0x004c }
            kotlin.jvm.internal.C6496s.e(r5)     // Catch:{ all -> 0x004c }
            rh.v r7 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r7 = r7.i()     // Catch:{ all -> 0x004c }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x004c }
            if (r3 != 0) goto L_0x0108
            java.util.List r11 = r4.d()     // Catch:{ all -> 0x004c }
            r3 = r11
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x004c }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x004c }
            if (r3 != 0) goto L_0x00e4
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x004c }
            java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.C6496s.f(r11, r3)     // Catch:{ all -> 0x004c }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x004c }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r4.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x004c }
            rh.v r0 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x004c }
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x004c }
            rh.g$b r0 = rh.C6710g.f73271c     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.a(r11)     // Catch:{ all -> 0x004c }
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x004c }
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x004c }
            Eh.d r0 = Eh.d.f62875a     // Catch:{ all -> 0x004c }
            java.util.List r11 = r0.a(r11)     // Catch:{ all -> 0x004c }
            r4.append(r11)     // Catch:{ all -> 0x004c }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x004c }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x004c }
            java.lang.String r11 = Sg.p.h(r11, r2, r6, r2)     // Catch:{ all -> 0x004c }
            r3.<init>(r11)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x00e4:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r2.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x004c }
            rh.v r0 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x004c }
            r2.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x004c }
            r11.<init>(r0)     // Catch:{ all -> 0x004c }
            throw r11     // Catch:{ all -> 0x004c }
        L_0x0108:
            rh.g r3 = r0.a()     // Catch:{ all -> 0x004c }
            kotlin.jvm.internal.C6496s.e(r3)     // Catch:{ all -> 0x004c }
            rh.t r5 = new rh.t     // Catch:{ all -> 0x004c }
            rh.H r6 = r4.e()     // Catch:{ all -> 0x004c }
            rh.i r7 = r4.a()     // Catch:{ all -> 0x004c }
            java.util.List r8 = r4.c()     // Catch:{ all -> 0x004c }
            wh.f$c r9 = new wh.f$c     // Catch:{ all -> 0x004c }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x004c }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x004c }
            r10.f73833g = r5     // Catch:{ all -> 0x004c }
            rh.v r0 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x004c }
            wh.f$d r4 = new wh.f$d     // Catch:{ all -> 0x004c }
            r4.<init>(r10)     // Catch:{ all -> 0x004c }
            r3.b(r0, r4)     // Catch:{ all -> 0x004c }
            boolean r11 = r11.h()     // Catch:{ all -> 0x004c }
            if (r11 == 0) goto L_0x0147
            Bh.j$a r11 = Bh.j.f62626a     // Catch:{ all -> 0x004c }
            Bh.j r11 = r11.g()     // Catch:{ all -> 0x004c }
            java.lang.String r2 = r11.h(r1)     // Catch:{ all -> 0x004c }
        L_0x0147:
            r10.f73832f = r1     // Catch:{ all -> 0x004c }
            Gh.W r11 = Gh.H.m(r1)     // Catch:{ all -> 0x004c }
            Gh.g r11 = Gh.H.d(r11)     // Catch:{ all -> 0x004c }
            r10.f73836j = r11     // Catch:{ all -> 0x004c }
            Gh.U r11 = Gh.H.i(r1)     // Catch:{ all -> 0x004c }
            Gh.f r11 = Gh.H.c(r11)     // Catch:{ all -> 0x004c }
            r10.f73837k = r11     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0166
            rh.B$a r11 = rh.B.f73125b     // Catch:{ all -> 0x004c }
            rh.B r11 = r11.a(r2)     // Catch:{ all -> 0x004c }
            goto L_0x0168
        L_0x0166:
            rh.B r11 = rh.B.HTTP_1_1     // Catch:{ all -> 0x004c }
        L_0x0168:
            r10.f73834h = r11     // Catch:{ all -> 0x004c }
            Bh.j$a r11 = Bh.j.f62626a
            Bh.j r11 = r11.g()
            r11.b(r1)
            return
        L_0x0174:
            r11 = move-exception
        L_0x0175:
            if (r2 == 0) goto L_0x0180
            Bh.j$a r0 = Bh.j.f62626a
            Bh.j r0 = r0.g()
            r0.b(r2)
        L_0x0180:
            if (r2 == 0) goto L_0x0185
            sh.C6726e.n(r2)
        L_0x0185:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.C6776f.i(wh.b):void");
    }

    private final void j(int i10, int i11, int i12, C6708e eVar, r rVar) {
        C l10 = l();
        v l11 = l10.l();
        int i13 = 0;
        while (i13 < 21) {
            h(i10, i11, eVar, rVar);
            l10 = k(i11, i12, l10, l11);
            if (l10 != null) {
                Socket socket = this.f73831e;
                if (socket != null) {
                    C6726e.n(socket);
                }
                this.f73831e = null;
                this.f73837k = null;
                this.f73836j = null;
                rVar.h(eVar, this.f73830d.d(), this.f73830d.b(), (B) null);
                i13++;
            } else {
                return;
            }
        }
    }

    private final C k(int i10, int i11, C c10, v vVar) {
        String str = "CONNECT " + C6726e.T(vVar, true) + " HTTP/1.1";
        while (true) {
            C5406g gVar = this.f73836j;
            C6496s.e(gVar);
            C5405f fVar = this.f73837k;
            C6496s.e(fVar);
            C6827b bVar = new C6827b((C6703A) null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.timeout().g((long) i10, timeUnit);
            fVar.timeout().g((long) i11, timeUnit);
            bVar.A(c10.f(), str);
            bVar.b();
            E.a e10 = bVar.e(false);
            C6496s.e(e10);
            E c11 = e10.r(c10).c();
            bVar.z(c11);
            int o10 = c11.o();
            if (o10 != 200) {
                if (o10 == 407) {
                    C a10 = this.f73830d.a().h().a(this.f73830d, c11);
                    if (a10 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (p.v("close", E.E(c11, "Connection", (String) null, 2, (Object) null), true)) {
                        return a10;
                    } else {
                        c10 = a10;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c11.o());
                }
            } else if (gVar.i().J0() && fVar.i().J0()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private final C l() {
        C b10 = new C.a().n(this.f73830d.a().l()).g("CONNECT", (D) null).e("Host", C6726e.T(this.f73830d.a().l(), true)).e("Proxy-Connection", "Keep-Alive").e("User-Agent", "okhttp/4.12.0").b();
        C a10 = this.f73830d.a().h().a(this.f73830d, new E.a().r(b10).p(B.HTTP_1_1).g(407).m("Preemptive Authenticate").b(C6726e.f73542c).s(-1).q(-1).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        if (a10 == null) {
            return b10;
        }
        return a10;
    }

    private final void m(C6772b bVar, int i10, C6708e eVar, r rVar) {
        if (this.f73830d.a().k() == null) {
            List f10 = this.f73830d.a().f();
            B b10 = B.H2_PRIOR_KNOWLEDGE;
            if (f10.contains(b10)) {
                this.f73832f = this.f73831e;
                this.f73834h = b10;
                F(i10);
                return;
            }
            this.f73832f = this.f73831e;
            this.f73834h = B.HTTP_1_1;
            return;
        }
        rVar.C(eVar);
        i(bVar);
        rVar.B(eVar, this.f73833g);
        if (this.f73834h == B.HTTP_2) {
            F(i10);
        }
    }

    public G A() {
        return this.f73830d;
    }

    public final void C(long j10) {
        this.f73845s = j10;
    }

    public final void D(boolean z10) {
        this.f73838l = z10;
    }

    public Socket E() {
        Socket socket = this.f73832f;
        C6496s.e(socket);
        return socket;
    }

    public final synchronized void H(C6775e eVar, IOException iOException) {
        try {
            C6496s.h(eVar, "call");
            if (iOException instanceof n) {
                if (((n) iOException).f74208a == C6844b.REFUSED_STREAM) {
                    int i10 = this.f73842p + 1;
                    this.f73842p = i10;
                    if (i10 > 1) {
                        this.f73838l = true;
                        this.f73840n++;
                    }
                } else if (((n) iOException).f74208a != C6844b.CANCEL || !eVar.isCanceled()) {
                    this.f73838l = true;
                    this.f73840n++;
                }
            } else if (!v() || (iOException instanceof C6843a)) {
                this.f73838l = true;
                if (this.f73841o == 0) {
                    if (iOException != null) {
                        g(eVar.l(), this.f73830d, iOException);
                    }
                    this.f73840n++;
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void a(f fVar, m mVar) {
        C6496s.h(fVar, "connection");
        C6496s.h(mVar, "settings");
        this.f73843q = mVar.d();
    }

    public void b(i iVar) {
        C6496s.h(iVar, "stream");
        iVar.d(C6844b.REFUSED_STREAM, (IOException) null);
    }

    public final void d() {
        Socket socket = this.f73831e;
        if (socket != null) {
            C6726e.n(socket);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c A[Catch:{ IOException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r17, int r18, int r19, int r20, boolean r21, rh.C6708e r22, rh.r r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            rh.B r0 = r7.f73834h
            if (r0 != 0) goto L_0x0157
            rh.G r0 = r7.f73830d
            rh.a r0 = r0.a()
            java.util.List r0 = r0.b()
            wh.b r10 = new wh.b
            r10.<init>(r0)
            rh.G r1 = r7.f73830d
            rh.a r1 = r1.a()
            javax.net.ssl.SSLSocketFactory r1 = r1.k()
            if (r1 != 0) goto L_0x0080
            rh.l r1 = rh.l.f73411k
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0073
            rh.G r0 = r7.f73830d
            rh.a r0 = r0.a()
            rh.v r0 = r0.l()
            java.lang.String r0 = r0.i()
            Bh.j$a r1 = Bh.j.f62626a
            Bh.j r1 = r1.g()
            boolean r1 = r1.j(r0)
            if (r1 == 0) goto L_0x0052
            goto L_0x0092
        L_0x0052:
            wh.i r1 = new wh.i
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0073:
            wh.i r0 = new wh.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0080:
            rh.G r0 = r7.f73830d
            rh.a r0 = r0.a()
            java.util.List r0 = r0.f()
            rh.B r1 = rh.B.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014a
        L_0x0092:
            r11 = 0
            r12 = r11
        L_0x0094:
            rh.G r0 = r7.f73830d     // Catch:{ IOException -> 0x00b7 }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x00b7 }
            if (r0 == 0) goto L_0x00bf
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.j(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00b7 }
            java.net.Socket r0 = r7.f73831e     // Catch:{ IOException -> 0x00b7 }
            if (r0 != 0) goto L_0x00b0
            goto L_0x00db
        L_0x00b0:
            r13 = r17
            r14 = r18
        L_0x00b4:
            r15 = r20
            goto L_0x00c7
        L_0x00b7:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00bc:
            r15 = r20
            goto L_0x0100
        L_0x00bf:
            r13 = r17
            r14 = r18
            r7.h(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00fe }
            goto L_0x00b4
        L_0x00c7:
            r7.m(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00fc }
            rh.G r0 = r7.f73830d     // Catch:{ IOException -> 0x00fc }
            java.net.InetSocketAddress r0 = r0.d()     // Catch:{ IOException -> 0x00fc }
            rh.G r1 = r7.f73830d     // Catch:{ IOException -> 0x00fc }
            java.net.Proxy r1 = r1.b()     // Catch:{ IOException -> 0x00fc }
            rh.B r2 = r7.f73834h     // Catch:{ IOException -> 0x00fc }
            r9.h(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00fc }
        L_0x00db:
            rh.G r0 = r7.f73830d
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00f5
            java.net.Socket r0 = r7.f73831e
            if (r0 == 0) goto L_0x00e8
            goto L_0x00f5
        L_0x00e8:
            wh.i r0 = new wh.i
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            long r0 = java.lang.System.nanoTime()
            r7.f73845s = r0
            return
        L_0x00fc:
            r0 = move-exception
            goto L_0x0100
        L_0x00fe:
            r0 = move-exception
            goto L_0x00bc
        L_0x0100:
            java.net.Socket r1 = r7.f73832f
            if (r1 == 0) goto L_0x0107
            sh.C6726e.n(r1)
        L_0x0107:
            java.net.Socket r1 = r7.f73831e
            if (r1 == 0) goto L_0x010e
            sh.C6726e.n(r1)
        L_0x010e:
            r7.f73832f = r11
            r7.f73831e = r11
            r7.f73836j = r11
            r7.f73837k = r11
            r7.f73833g = r11
            r7.f73834h = r11
            r7.f73835i = r11
            r1 = 1
            r7.f73843q = r1
            rh.G r1 = r7.f73830d
            java.net.InetSocketAddress r3 = r1.d()
            rh.G r1 = r7.f73830d
            java.net.Proxy r4 = r1.b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.i(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x013c
            wh.i r12 = new wh.i
            r12.<init>(r0)
            goto L_0x013f
        L_0x013c:
            r12.a(r0)
        L_0x013f:
            if (r21 == 0) goto L_0x0149
            boolean r0 = r10.b(r0)
            if (r0 == 0) goto L_0x0149
            goto L_0x0094
        L_0x0149:
            throw r12
        L_0x014a:
            wh.i r0 = new wh.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0157:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.C6776f.f(int, int, int, int, boolean, rh.e, rh.r):void");
    }

    public final void g(C6703A a10, G g10, IOException iOException) {
        C6496s.h(a10, "client");
        C6496s.h(g10, "failedRoute");
        C6496s.h(iOException, "failure");
        if (g10.b().type() != Proxy.Type.DIRECT) {
            C6704a a11 = g10.a();
            a11.i().connectFailed(a11.l().t(), g10.b().address(), iOException);
        }
        a10.w().b(g10);
    }

    public final List n() {
        return this.f73844r;
    }

    public final long o() {
        return this.f73845s;
    }

    public final boolean p() {
        return this.f73838l;
    }

    public final int q() {
        return this.f73840n;
    }

    public t r() {
        return this.f73833g;
    }

    public final synchronized void s() {
        this.f73841o++;
    }

    public final boolean t(C6704a aVar, List list) {
        C6496s.h(aVar, "address");
        if (C6726e.f73547h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        } else if (this.f73844r.size() >= this.f73843q || this.f73838l || !this.f73830d.a().d(aVar)) {
            return false;
        } else {
            if (C6496s.c(aVar.l().i(), A().a().l().i())) {
                return true;
            }
            if (this.f73835i == null || list == null || !B(list) || aVar.e() != Eh.d.f62875a || !G(aVar.l())) {
                return false;
            }
            try {
                C6710g a10 = aVar.a();
                C6496s.e(a10);
                String i10 = aVar.l().i();
                t r10 = r();
                C6496s.e(r10);
                a10.a(i10, r10.d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f73830d.a().l().i());
        sb2.append(':');
        sb2.append(this.f73830d.a().l().o());
        sb2.append(", proxy=");
        sb2.append(this.f73830d.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f73830d.d());
        sb2.append(" cipherSuite=");
        t tVar = this.f73833g;
        if (tVar == null || (obj = tVar.a()) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f73834h);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(boolean z10) {
        long j10;
        if (!C6726e.f73547h || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f73831e;
            C6496s.e(socket);
            Socket socket2 = this.f73832f;
            C6496s.e(socket2);
            C5406g gVar = this.f73836j;
            C6496s.e(gVar);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            f fVar = this.f73835i;
            if (fVar != null) {
                return fVar.n1(nanoTime);
            }
            synchronized (this) {
                j10 = nanoTime - this.f73845s;
            }
            if (j10 < 10000000000L || !z10) {
                return true;
            }
            return C6726e.G(socket2, gVar);
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean v() {
        if (this.f73835i != null) {
            return true;
        }
        return false;
    }

    public final xh.d w(C6703A a10, g gVar) {
        C6496s.h(a10, "client");
        C6496s.h(gVar, "chain");
        Socket socket = this.f73832f;
        C6496s.e(socket);
        C5406g gVar2 = this.f73836j;
        C6496s.e(gVar2);
        C5405f fVar = this.f73837k;
        C6496s.e(fVar);
        f fVar2 = this.f73835i;
        if (fVar2 != null) {
            return new zh.g(a10, this, gVar, fVar2);
        }
        socket.setSoTimeout(gVar.j());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar2.timeout().g((long) gVar.g(), timeUnit);
        fVar.timeout().g((long) gVar.i(), timeUnit);
        return new C6827b(a10, this, gVar2, fVar);
    }

    public final d.C0935d x(C6773c cVar) {
        C6496s.h(cVar, "exchange");
        Socket socket = this.f73832f;
        C6496s.e(socket);
        C5406g gVar = this.f73836j;
        C6496s.e(gVar);
        C5405f fVar = this.f73837k;
        C6496s.e(fVar);
        socket.setSoTimeout(0);
        z();
        return new e(gVar, fVar, cVar);
    }

    public final synchronized void y() {
        this.f73839m = true;
    }

    public final synchronized void z() {
        this.f73838l = true;
    }
}
