package rh;

import Bh.j;
import Eh.c;
import Fh.d;
import Fh.e;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import rh.C6708e;
import rh.r;
import sh.C6726e;
import vh.C6760e;
import wh.C6775e;
import wh.C6778h;

/* renamed from: rh.A  reason: case insensitive filesystem */
public class C6703A implements Cloneable, C6708e.a {

    /* renamed from: E  reason: collision with root package name */
    public static final b f73062E = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public static final List f73063F = C6726e.w(B.HTTP_2, B.HTTP_1_1);
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public static final List f73064G = C6726e.w(l.f73409i, l.f73411k);

    /* renamed from: A  reason: collision with root package name */
    private final int f73065A;

    /* renamed from: B  reason: collision with root package name */
    private final int f73066B;

    /* renamed from: C  reason: collision with root package name */
    private final long f73067C;

    /* renamed from: D  reason: collision with root package name */
    private final C6778h f73068D;

    /* renamed from: a  reason: collision with root package name */
    private final p f73069a;

    /* renamed from: b  reason: collision with root package name */
    private final k f73070b;

    /* renamed from: c  reason: collision with root package name */
    private final List f73071c;

    /* renamed from: d  reason: collision with root package name */
    private final List f73072d;

    /* renamed from: e  reason: collision with root package name */
    private final r.c f73073e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f73074f;

    /* renamed from: g  reason: collision with root package name */
    private final C6705b f73075g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f73076h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f73077i;

    /* renamed from: j  reason: collision with root package name */
    private final n f73078j;

    /* renamed from: k  reason: collision with root package name */
    private final C6706c f73079k;

    /* renamed from: l  reason: collision with root package name */
    private final q f73080l;

    /* renamed from: m  reason: collision with root package name */
    private final Proxy f73081m;

    /* renamed from: n  reason: collision with root package name */
    private final ProxySelector f73082n;

    /* renamed from: o  reason: collision with root package name */
    private final C6705b f73083o;

    /* renamed from: p  reason: collision with root package name */
    private final SocketFactory f73084p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final SSLSocketFactory f73085q;

    /* renamed from: r  reason: collision with root package name */
    private final X509TrustManager f73086r;

    /* renamed from: s  reason: collision with root package name */
    private final List f73087s;

    /* renamed from: t  reason: collision with root package name */
    private final List f73088t;

    /* renamed from: u  reason: collision with root package name */
    private final HostnameVerifier f73089u;

    /* renamed from: v  reason: collision with root package name */
    private final C6710g f73090v;

    /* renamed from: w  reason: collision with root package name */
    private final c f73091w;

    /* renamed from: x  reason: collision with root package name */
    private final int f73092x;

    /* renamed from: y  reason: collision with root package name */
    private final int f73093y;

    /* renamed from: z  reason: collision with root package name */
    private final int f73094z;

    /* renamed from: rh.A$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return C6703A.f73064G;
        }

        public final List b() {
            return C6703A.f73063F;
        }

        private b() {
        }
    }

    public C6703A(a aVar) {
        ProxySelector proxySelector;
        C6496s.h(aVar, "builder");
        this.f73069a = aVar.u();
        this.f73070b = aVar.r();
        this.f73071c = C6726e.V(aVar.A());
        this.f73072d = C6726e.V(aVar.C());
        this.f73073e = aVar.w();
        this.f73074f = aVar.J();
        this.f73075g = aVar.l();
        this.f73076h = aVar.x();
        this.f73077i = aVar.y();
        this.f73078j = aVar.t();
        this.f73079k = aVar.m();
        this.f73080l = aVar.v();
        this.f73081m = aVar.F();
        if (aVar.F() != null) {
            proxySelector = Dh.a.f62804a;
        } else {
            proxySelector = aVar.H();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = Dh.a.f62804a;
            }
        }
        this.f73082n = proxySelector;
        this.f73083o = aVar.G();
        this.f73084p = aVar.L();
        List s10 = aVar.s();
        this.f73087s = s10;
        this.f73088t = aVar.E();
        this.f73089u = aVar.z();
        this.f73092x = aVar.n();
        this.f73093y = aVar.q();
        this.f73094z = aVar.I();
        this.f73065A = aVar.N();
        this.f73066B = aVar.D();
        this.f73067C = aVar.B();
        C6778h K10 = aVar.K();
        this.f73068D = K10 == null ? new C6778h() : K10;
        Iterable iterable = s10;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((l) it.next()).f()) {
                    if (aVar.M() != null) {
                        this.f73085q = aVar.M();
                        c o10 = aVar.o();
                        C6496s.e(o10);
                        this.f73091w = o10;
                        X509TrustManager O10 = aVar.O();
                        C6496s.e(O10);
                        this.f73086r = O10;
                        C6710g p10 = aVar.p();
                        C6496s.e(o10);
                        this.f73090v = p10.e(o10);
                    } else {
                        j.a aVar2 = j.f62626a;
                        X509TrustManager p11 = aVar2.g().p();
                        this.f73086r = p11;
                        j g10 = aVar2.g();
                        C6496s.e(p11);
                        this.f73085q = g10.o(p11);
                        c.a aVar3 = c.f62874a;
                        C6496s.e(p11);
                        c a10 = aVar3.a(p11);
                        this.f73091w = a10;
                        C6710g p12 = aVar.p();
                        C6496s.e(a10);
                        this.f73090v = p12.e(a10);
                    }
                }
            }
        }
        this.f73085q = null;
        this.f73091w = null;
        this.f73086r = null;
        this.f73090v = C6710g.f73272d;
        M();
    }

    private final void M() {
        List list = this.f73071c;
        C6496s.f(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains((Object) null)) {
            List list2 = this.f73072d;
            C6496s.f(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list2.contains((Object) null)) {
                Iterable<l> iterable = this.f73087s;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (l f10 : iterable) {
                        if (f10.f()) {
                            if (this.f73085q == null) {
                                throw new IllegalStateException("sslSocketFactory == null");
                            } else if (this.f73091w == null) {
                                throw new IllegalStateException("certificateChainCleaner == null");
                            } else if (this.f73086r == null) {
                                throw new IllegalStateException("x509TrustManager == null");
                            } else {
                                return;
                            }
                        }
                    }
                }
                if (this.f73085q != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (this.f73091w != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (this.f73086r != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (!C6496s.c(this.f73090v, C6710g.f73272d)) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException(("Null network interceptor: " + this.f73072d).toString());
            }
        } else {
            throw new IllegalStateException(("Null interceptor: " + this.f73071c).toString());
        }
    }

    public final List A() {
        return this.f73072d;
    }

    public a B() {
        return new a(this);
    }

    public I C(C c10, J j10) {
        C6496s.h(c10, "request");
        C6496s.h(j10, "listener");
        d dVar = new d(C6760e.f73695i, c10, j10, new Random(), (long) this.f73066B, (e) null, this.f73067C);
        dVar.m(this);
        return dVar;
    }

    public final int D() {
        return this.f73066B;
    }

    public final List E() {
        return this.f73088t;
    }

    public final Proxy F() {
        return this.f73081m;
    }

    public final C6705b G() {
        return this.f73083o;
    }

    public final ProxySelector H() {
        return this.f73082n;
    }

    public final int I() {
        return this.f73094z;
    }

    public final boolean J() {
        return this.f73074f;
    }

    public final SocketFactory K() {
        return this.f73084p;
    }

    public final SSLSocketFactory L() {
        SSLSocketFactory sSLSocketFactory = this.f73085q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int N() {
        return this.f73065A;
    }

    public final X509TrustManager O() {
        return this.f73086r;
    }

    public C6708e a(C c10) {
        C6496s.h(c10, "request");
        return new C6775e(this, c10, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final C6705b g() {
        return this.f73075g;
    }

    public final C6706c h() {
        return this.f73079k;
    }

    public final int i() {
        return this.f73092x;
    }

    public final c j() {
        return this.f73091w;
    }

    public final C6710g k() {
        return this.f73090v;
    }

    public final int l() {
        return this.f73093y;
    }

    public final k m() {
        return this.f73070b;
    }

    public final List o() {
        return this.f73087s;
    }

    public final n p() {
        return this.f73078j;
    }

    public final p q() {
        return this.f73069a;
    }

    public final q r() {
        return this.f73080l;
    }

    public final r.c s() {
        return this.f73073e;
    }

    public final boolean t() {
        return this.f73076h;
    }

    public final boolean u() {
        return this.f73077i;
    }

    public final C6778h w() {
        return this.f73068D;
    }

    public final HostnameVerifier x() {
        return this.f73089u;
    }

    public final List y() {
        return this.f73071c;
    }

    public final long z() {
        return this.f73067C;
    }

    /* renamed from: rh.A$a */
    public static final class a {

        /* renamed from: A  reason: collision with root package name */
        private int f73095A;

        /* renamed from: B  reason: collision with root package name */
        private int f73096B;

        /* renamed from: C  reason: collision with root package name */
        private long f73097C;

        /* renamed from: D  reason: collision with root package name */
        private C6778h f73098D;

        /* renamed from: a  reason: collision with root package name */
        private p f73099a;

        /* renamed from: b  reason: collision with root package name */
        private k f73100b;

        /* renamed from: c  reason: collision with root package name */
        private final List f73101c;

        /* renamed from: d  reason: collision with root package name */
        private final List f73102d;

        /* renamed from: e  reason: collision with root package name */
        private r.c f73103e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f73104f;

        /* renamed from: g  reason: collision with root package name */
        private C6705b f73105g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f73106h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f73107i;

        /* renamed from: j  reason: collision with root package name */
        private n f73108j;

        /* renamed from: k  reason: collision with root package name */
        private C6706c f73109k;

        /* renamed from: l  reason: collision with root package name */
        private q f73110l;

        /* renamed from: m  reason: collision with root package name */
        private Proxy f73111m;

        /* renamed from: n  reason: collision with root package name */
        private ProxySelector f73112n;

        /* renamed from: o  reason: collision with root package name */
        private C6705b f73113o;

        /* renamed from: p  reason: collision with root package name */
        private SocketFactory f73114p;

        /* renamed from: q  reason: collision with root package name */
        private SSLSocketFactory f73115q;

        /* renamed from: r  reason: collision with root package name */
        private X509TrustManager f73116r;

        /* renamed from: s  reason: collision with root package name */
        private List f73117s;

        /* renamed from: t  reason: collision with root package name */
        private List f73118t;

        /* renamed from: u  reason: collision with root package name */
        private HostnameVerifier f73119u;

        /* renamed from: v  reason: collision with root package name */
        private C6710g f73120v;

        /* renamed from: w  reason: collision with root package name */
        private c f73121w;

        /* renamed from: x  reason: collision with root package name */
        private int f73122x;

        /* renamed from: y  reason: collision with root package name */
        private int f73123y;

        /* renamed from: z  reason: collision with root package name */
        private int f73124z;

        public a() {
            this.f73099a = new p();
            this.f73100b = new k();
            this.f73101c = new ArrayList();
            this.f73102d = new ArrayList();
            this.f73103e = C6726e.g(r.f73458b);
            this.f73104f = true;
            C6705b bVar = C6705b.f73212b;
            this.f73105g = bVar;
            this.f73106h = true;
            this.f73107i = true;
            this.f73108j = n.f73444b;
            this.f73110l = q.f73455b;
            this.f73113o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C6496s.g(socketFactory, "getDefault()");
            this.f73114p = socketFactory;
            b bVar2 = C6703A.f73062E;
            this.f73117s = bVar2.a();
            this.f73118t = bVar2.b();
            this.f73119u = Eh.d.f62875a;
            this.f73120v = C6710g.f73272d;
            this.f73123y = 10000;
            this.f73124z = 10000;
            this.f73095A = 10000;
            this.f73097C = 1024;
        }

        public final List A() {
            return this.f73101c;
        }

        public final long B() {
            return this.f73097C;
        }

        public final List C() {
            return this.f73102d;
        }

        public final int D() {
            return this.f73096B;
        }

        public final List E() {
            return this.f73118t;
        }

        public final Proxy F() {
            return this.f73111m;
        }

        public final C6705b G() {
            return this.f73113o;
        }

        public final ProxySelector H() {
            return this.f73112n;
        }

        public final int I() {
            return this.f73124z;
        }

        public final boolean J() {
            return this.f73104f;
        }

        public final C6778h K() {
            return this.f73098D;
        }

        public final SocketFactory L() {
            return this.f73114p;
        }

        public final SSLSocketFactory M() {
            return this.f73115q;
        }

        public final int N() {
            return this.f73095A;
        }

        public final X509TrustManager O() {
            return this.f73116r;
        }

        public final a P(HostnameVerifier hostnameVerifier) {
            C6496s.h(hostnameVerifier, "hostnameVerifier");
            if (!C6496s.c(hostnameVerifier, this.f73119u)) {
                this.f73098D = null;
            }
            this.f73119u = hostnameVerifier;
            return this;
        }

        public final a Q(List list) {
            C6496s.h(list, "protocols");
            List h12 = C6565s.h1(list);
            B b10 = B.H2_PRIOR_KNOWLEDGE;
            if (!h12.contains(b10) && !h12.contains(B.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + h12).toString());
            } else if (h12.contains(b10) && h12.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + h12).toString());
            } else if (!h12.contains(B.HTTP_1_0)) {
                C6496s.f(h12, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
                if (!h12.contains((Object) null)) {
                    h12.remove(B.SPDY_3);
                    if (!C6496s.c(h12, this.f73118t)) {
                        this.f73098D = null;
                    }
                    List unmodifiableList = Collections.unmodifiableList(h12);
                    C6496s.g(unmodifiableList, "unmodifiableList(protocolsCopy)");
                    this.f73118t = unmodifiableList;
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            } else {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + h12).toString());
            }
        }

        public final a R(Proxy proxy) {
            if (!C6496s.c(proxy, this.f73111m)) {
                this.f73098D = null;
            }
            this.f73111m = proxy;
            return this;
        }

        public final a S(long j10, TimeUnit timeUnit) {
            C6496s.h(timeUnit, "unit");
            this.f73124z = C6726e.k("timeout", j10, timeUnit);
            return this;
        }

        public final a T(boolean z10) {
            this.f73104f = z10;
            return this;
        }

        public final a U(SocketFactory socketFactory) {
            C6496s.h(socketFactory, "socketFactory");
            if (!(socketFactory instanceof SSLSocketFactory)) {
                if (!C6496s.c(socketFactory, this.f73114p)) {
                    this.f73098D = null;
                }
                this.f73114p = socketFactory;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
        }

        public final a V(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            C6496s.h(sSLSocketFactory, "sslSocketFactory");
            C6496s.h(x509TrustManager, "trustManager");
            if (!C6496s.c(sSLSocketFactory, this.f73115q) || !C6496s.c(x509TrustManager, this.f73116r)) {
                this.f73098D = null;
            }
            this.f73115q = sSLSocketFactory;
            this.f73121w = c.f62874a.a(x509TrustManager);
            this.f73116r = x509TrustManager;
            return this;
        }

        public final a W(long j10, TimeUnit timeUnit) {
            C6496s.h(timeUnit, "unit");
            this.f73095A = C6726e.k("timeout", j10, timeUnit);
            return this;
        }

        public final a a(w wVar) {
            C6496s.h(wVar, "interceptor");
            this.f73101c.add(wVar);
            return this;
        }

        public final a b(w wVar) {
            C6496s.h(wVar, "interceptor");
            this.f73102d.add(wVar);
            return this;
        }

        public final C6703A c() {
            return new C6703A(this);
        }

        public final a d(C6706c cVar) {
            this.f73109k = cVar;
            return this;
        }

        public final a e(long j10, TimeUnit timeUnit) {
            C6496s.h(timeUnit, "unit");
            this.f73122x = C6726e.k("timeout", j10, timeUnit);
            return this;
        }

        public final a f(long j10, TimeUnit timeUnit) {
            C6496s.h(timeUnit, "unit");
            this.f73123y = C6726e.k("timeout", j10, timeUnit);
            return this;
        }

        public final a g(k kVar) {
            C6496s.h(kVar, "connectionPool");
            this.f73100b = kVar;
            return this;
        }

        public final a h(n nVar) {
            C6496s.h(nVar, "cookieJar");
            this.f73108j = nVar;
            return this;
        }

        public final a i(r rVar) {
            C6496s.h(rVar, "eventListener");
            this.f73103e = C6726e.g(rVar);
            return this;
        }

        public final a j(boolean z10) {
            this.f73106h = z10;
            return this;
        }

        public final a k(boolean z10) {
            this.f73107i = z10;
            return this;
        }

        public final C6705b l() {
            return this.f73105g;
        }

        public final C6706c m() {
            return this.f73109k;
        }

        public final int n() {
            return this.f73122x;
        }

        public final c o() {
            return this.f73121w;
        }

        public final C6710g p() {
            return this.f73120v;
        }

        public final int q() {
            return this.f73123y;
        }

        public final k r() {
            return this.f73100b;
        }

        public final List s() {
            return this.f73117s;
        }

        public final n t() {
            return this.f73108j;
        }

        public final p u() {
            return this.f73099a;
        }

        public final q v() {
            return this.f73110l;
        }

        public final r.c w() {
            return this.f73103e;
        }

        public final boolean x() {
            return this.f73106h;
        }

        public final boolean y() {
            return this.f73107i;
        }

        public final HostnameVerifier z() {
            return this.f73119u;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(C6703A a10) {
            this();
            C6496s.h(a10, "okHttpClient");
            this.f73099a = a10.q();
            this.f73100b = a10.m();
            C6565s.D(this.f73101c, a10.y());
            C6565s.D(this.f73102d, a10.A());
            this.f73103e = a10.s();
            this.f73104f = a10.J();
            this.f73105g = a10.g();
            this.f73106h = a10.t();
            this.f73107i = a10.u();
            this.f73108j = a10.p();
            this.f73109k = a10.h();
            this.f73110l = a10.r();
            this.f73111m = a10.F();
            this.f73112n = a10.H();
            this.f73113o = a10.G();
            this.f73114p = a10.K();
            this.f73115q = a10.f73085q;
            this.f73116r = a10.O();
            this.f73117s = a10.o();
            this.f73118t = a10.E();
            this.f73119u = a10.x();
            this.f73120v = a10.k();
            this.f73121w = a10.j();
            this.f73122x = a10.i();
            this.f73123y = a10.l();
            this.f73124z = a10.I();
            this.f73095A = a10.N();
            this.f73096B = a10.D();
            this.f73097C = a10.z();
            this.f73098D = a10.w();
        }
    }

    public C6703A() {
        this(new a());
    }
}
