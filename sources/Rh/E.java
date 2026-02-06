package rh;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import rh.u;
import wh.C6773c;
import xh.e;

public final class E implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final C f73153a;

    /* renamed from: b  reason: collision with root package name */
    private final B f73154b;

    /* renamed from: c  reason: collision with root package name */
    private final String f73155c;

    /* renamed from: d  reason: collision with root package name */
    private final int f73156d;

    /* renamed from: e  reason: collision with root package name */
    private final t f73157e;

    /* renamed from: f  reason: collision with root package name */
    private final u f73158f;

    /* renamed from: g  reason: collision with root package name */
    private final F f73159g;

    /* renamed from: h  reason: collision with root package name */
    private final E f73160h;

    /* renamed from: i  reason: collision with root package name */
    private final E f73161i;

    /* renamed from: j  reason: collision with root package name */
    private final E f73162j;

    /* renamed from: k  reason: collision with root package name */
    private final long f73163k;

    /* renamed from: l  reason: collision with root package name */
    private final long f73164l;

    /* renamed from: m  reason: collision with root package name */
    private final C6773c f73165m;

    /* renamed from: n  reason: collision with root package name */
    private C6707d f73166n;

    public E(C c10, B b10, String str, int i10, t tVar, u uVar, F f10, E e10, E e11, E e12, long j10, long j11, C6773c cVar) {
        C6496s.h(c10, "request");
        C6496s.h(b10, "protocol");
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(uVar, "headers");
        this.f73153a = c10;
        this.f73154b = b10;
        this.f73155c = str;
        this.f73156d = i10;
        this.f73157e = tVar;
        this.f73158f = uVar;
        this.f73159g = f10;
        this.f73160h = e10;
        this.f73161i = e11;
        this.f73162j = e12;
        this.f73163k = j10;
        this.f73164l = j11;
        this.f73165m = cVar;
    }

    public static /* synthetic */ String E(E e10, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return e10.y(str, str2);
    }

    public final u F() {
        return this.f73158f;
    }

    public final boolean I() {
        int i10 = this.f73156d;
        if (!(i10 == 307 || i10 == 308)) {
            switch (i10) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final String M() {
        return this.f73155c;
    }

    public final E Q() {
        return this.f73160h;
    }

    public final a T() {
        return new a(this);
    }

    public final E U() {
        return this.f73162j;
    }

    public final B V() {
        return this.f73154b;
    }

    public final F a() {
        return this.f73159g;
    }

    public final C6707d b() {
        C6707d dVar = this.f73166n;
        if (dVar != null) {
            return dVar;
        }
        C6707d b10 = C6707d.f73247n.b(this.f73158f);
        this.f73166n = b10;
        return b10;
    }

    public void close() {
        F f10 = this.f73159g;
        if (f10 != null) {
            f10.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final E f() {
        return this.f73161i;
    }

    public final long f0() {
        return this.f73164l;
    }

    public final C g0() {
        return this.f73153a;
    }

    public final long h0() {
        return this.f73163k;
    }

    public final boolean m0() {
        int i10 = this.f73156d;
        if (200 > i10 || i10 >= 300) {
            return false;
        }
        return true;
    }

    public final List n() {
        String str;
        u uVar = this.f73158f;
        int i10 = this.f73156d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else if (i10 != 407) {
            return C6565s.n();
        } else {
            str = "Proxy-Authenticate";
        }
        return e.a(uVar, str);
    }

    public final int o() {
        return this.f73156d;
    }

    public final C6773c q() {
        return this.f73165m;
    }

    public final t t() {
        return this.f73157e;
    }

    public String toString() {
        return "Response{protocol=" + this.f73154b + ", code=" + this.f73156d + ", message=" + this.f73155c + ", url=" + this.f73153a.l() + '}';
    }

    public final String v(String str) {
        C6496s.h(str, "name");
        return E(this, str, (String) null, 2, (Object) null);
    }

    public final String y(String str, String str2) {
        C6496s.h(str, "name");
        String a10 = this.f73158f.a(str);
        if (a10 == null) {
            return str2;
        }
        return a10;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private C f73167a;

        /* renamed from: b  reason: collision with root package name */
        private B f73168b;

        /* renamed from: c  reason: collision with root package name */
        private int f73169c;

        /* renamed from: d  reason: collision with root package name */
        private String f73170d;

        /* renamed from: e  reason: collision with root package name */
        private t f73171e;

        /* renamed from: f  reason: collision with root package name */
        private u.a f73172f;

        /* renamed from: g  reason: collision with root package name */
        private F f73173g;

        /* renamed from: h  reason: collision with root package name */
        private E f73174h;

        /* renamed from: i  reason: collision with root package name */
        private E f73175i;

        /* renamed from: j  reason: collision with root package name */
        private E f73176j;

        /* renamed from: k  reason: collision with root package name */
        private long f73177k;

        /* renamed from: l  reason: collision with root package name */
        private long f73178l;

        /* renamed from: m  reason: collision with root package name */
        private C6773c f73179m;

        public a() {
            this.f73169c = -1;
            this.f73172f = new u.a();
        }

        private final void e(E e10) {
            if (e10 != null && e10.a() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String str, E e10) {
            if (e10 == null) {
                return;
            }
            if (e10.a() != null) {
                throw new IllegalArgumentException((str + ".body != null").toString());
            } else if (e10.Q() != null) {
                throw new IllegalArgumentException((str + ".networkResponse != null").toString());
            } else if (e10.f() != null) {
                throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
            } else if (e10.U() != null) {
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a a(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "value");
            this.f73172f.a(str, str2);
            return this;
        }

        public a b(F f10) {
            this.f73173g = f10;
            return this;
        }

        public E c() {
            int i10 = this.f73169c;
            if (i10 >= 0) {
                C c10 = this.f73167a;
                if (c10 != null) {
                    B b10 = this.f73168b;
                    if (b10 != null) {
                        String str = this.f73170d;
                        if (str != null) {
                            return new E(c10, b10, str, i10, this.f73171e, this.f73172f.f(), this.f73173g, this.f73174h, this.f73175i, this.f73176j, this.f73177k, this.f73178l, this.f73179m);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("protocol == null");
                }
                throw new IllegalStateException("request == null");
            }
            throw new IllegalStateException(("code < 0: " + this.f73169c).toString());
        }

        public a d(E e10) {
            f("cacheResponse", e10);
            this.f73175i = e10;
            return this;
        }

        public a g(int i10) {
            this.f73169c = i10;
            return this;
        }

        public final int h() {
            return this.f73169c;
        }

        public a i(t tVar) {
            this.f73171e = tVar;
            return this;
        }

        public a j(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "value");
            this.f73172f.j(str, str2);
            return this;
        }

        public a k(u uVar) {
            C6496s.h(uVar, "headers");
            this.f73172f = uVar.n();
            return this;
        }

        public final void l(C6773c cVar) {
            C6496s.h(cVar, "deferredTrailers");
            this.f73179m = cVar;
        }

        public a m(String str) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            this.f73170d = str;
            return this;
        }

        public a n(E e10) {
            f("networkResponse", e10);
            this.f73174h = e10;
            return this;
        }

        public a o(E e10) {
            e(e10);
            this.f73176j = e10;
            return this;
        }

        public a p(B b10) {
            C6496s.h(b10, "protocol");
            this.f73168b = b10;
            return this;
        }

        public a q(long j10) {
            this.f73178l = j10;
            return this;
        }

        public a r(C c10) {
            C6496s.h(c10, "request");
            this.f73167a = c10;
            return this;
        }

        public a s(long j10) {
            this.f73177k = j10;
            return this;
        }

        public a(E e10) {
            C6496s.h(e10, "response");
            this.f73169c = -1;
            this.f73167a = e10.g0();
            this.f73168b = e10.V();
            this.f73169c = e10.o();
            this.f73170d = e10.M();
            this.f73171e = e10.t();
            this.f73172f = e10.F().n();
            this.f73173g = e10.a();
            this.f73174h = e10.Q();
            this.f73175i = e10.f();
            this.f73176j = e10.U();
            this.f73177k = e10.h0();
            this.f73178l = e10.f0();
            this.f73179m = e10.q();
        }
    }
}
