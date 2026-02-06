package uh;

import Gh.C5404e;
import Gh.C5405f;
import Gh.C5406g;
import Gh.H;
import Gh.U;
import Gh.W;
import Gh.X;
import Sg.p;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.B;
import rh.C;
import rh.C6706c;
import rh.C6708e;
import rh.E;
import rh.F;
import rh.r;
import rh.u;
import rh.w;
import sh.C6726e;
import uh.C6749c;
import wh.C6775e;
import xh.e;
import xh.f;
import xh.h;

/* renamed from: uh.a  reason: case insensitive filesystem */
public final class C6747a implements w {

    /* renamed from: b  reason: collision with root package name */
    public static final C1073a f73591b = new C1073a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C6706c f73592a;

    /* renamed from: uh.a$a  reason: collision with other inner class name */
    public static final class C1073a {
        public /* synthetic */ C1073a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final u c(u uVar, u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String g10 = uVar.g(i10);
                String x10 = uVar.x(i10);
                if ((!p.v("Warning", g10, true) || !p.J(x10, "1", false, 2, (Object) null)) && (d(g10) || !e(g10) || uVar2.a(g10) == null)) {
                    aVar.d(g10, x10);
                }
            }
            int size2 = uVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String g11 = uVar2.g(i11);
                if (!d(g11) && e(g11)) {
                    aVar.d(g11, uVar2.x(i11));
                }
            }
            return aVar.f();
        }

        private final boolean d(String str) {
            if (p.v("Content-Length", str, true) || p.v("Content-Encoding", str, true) || p.v("Content-Type", str, true)) {
                return true;
            }
            return false;
        }

        private final boolean e(String str) {
            if (p.v("Connection", str, true) || p.v("Keep-Alive", str, true) || p.v("Proxy-Authenticate", str, true) || p.v("Proxy-Authorization", str, true) || p.v("TE", str, true) || p.v("Trailers", str, true) || p.v("Transfer-Encoding", str, true) || p.v("Upgrade", str, true)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final E f(E e10) {
            F f10;
            if (e10 != null) {
                f10 = e10.a();
            } else {
                f10 = null;
            }
            if (f10 != null) {
                return e10.T().b((F) null).c();
            }
            return e10;
        }

        private C1073a() {
        }
    }

    /* renamed from: uh.a$b */
    public static final class b implements W {

        /* renamed from: a  reason: collision with root package name */
        private boolean f73593a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5406g f73594b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6748b f73595c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5405f f73596d;

        b(C5406g gVar, C6748b bVar, C5405f fVar) {
            this.f73594b = gVar;
            this.f73595c = bVar;
            this.f73596d = fVar;
        }

        public void close() {
            if (!this.f73593a && !C6726e.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f73593a = true;
                this.f73595c.a();
            }
            this.f73594b.close();
        }

        public X timeout() {
            return this.f73594b.timeout();
        }

        public long y1(C5404e eVar, long j10) {
            C6496s.h(eVar, "sink");
            try {
                long y12 = this.f73594b.y1(eVar, j10);
                if (y12 == -1) {
                    if (!this.f73593a) {
                        this.f73593a = true;
                        this.f73596d.close();
                    }
                    return -1;
                }
                eVar.y(this.f73596d.i(), eVar.B0() - y12, y12);
                this.f73596d.L();
                return y12;
            } catch (IOException e10) {
                if (!this.f73593a) {
                    this.f73593a = true;
                    this.f73595c.a();
                }
                throw e10;
            }
        }
    }

    public C6747a(C6706c cVar) {
        this.f73592a = cVar;
    }

    private final E a(C6748b bVar, E e10) {
        if (bVar == null) {
            return e10;
        }
        U b10 = bVar.b();
        F a10 = e10.a();
        C6496s.e(a10);
        b bVar2 = new b(a10.y(), bVar, H.c(b10));
        return e10.T().b(new h(E.E(e10, "Content-Type", (String) null, 2, (Object) null), e10.a().o(), H.d(bVar2))).c();
    }

    public E intercept(w.a aVar) {
        E e10;
        r rVar;
        F a10;
        F a11;
        C6496s.h(aVar, "chain");
        C6708e call = aVar.call();
        C6706c cVar = this.f73592a;
        C6775e eVar = null;
        if (cVar != null) {
            e10 = cVar.b(aVar.request());
        } else {
            e10 = null;
        }
        C6749c b10 = new C6749c.b(System.currentTimeMillis(), aVar.request(), e10).b();
        C b11 = b10.b();
        E a12 = b10.a();
        C6706c cVar2 = this.f73592a;
        if (cVar2 != null) {
            cVar2.E(b10);
        }
        if (call instanceof C6775e) {
            eVar = (C6775e) call;
        }
        if (eVar == null || (rVar = eVar.o()) == null) {
            rVar = r.f73458b;
        }
        if (!(e10 == null || a12 != null || (a11 = e10.a()) == null)) {
            C6726e.m(a11);
        }
        if (b11 == null && a12 == null) {
            E c10 = new E.a().r(aVar.request()).p(B.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(C6726e.f73542c).s(-1).q(System.currentTimeMillis()).c();
            rVar.A(call, c10);
            return c10;
        } else if (b11 == null) {
            C6496s.e(a12);
            E c11 = a12.T().d(f73591b.f(a12)).c();
            rVar.b(call, c11);
            return c11;
        } else {
            if (a12 != null) {
                rVar.a(call, a12);
            } else if (this.f73592a != null) {
                rVar.c(call);
            }
            try {
                E a13 = aVar.a(b11);
                if (!(a13 != null || e10 == null || a10 == null)) {
                }
                if (a12 != null) {
                    if (a13 == null || a13.o() != 304) {
                        F a14 = a12.a();
                        if (a14 != null) {
                            C6726e.m(a14);
                        }
                    } else {
                        E.a T10 = a12.T();
                        C1073a aVar2 = f73591b;
                        E c12 = T10.k(aVar2.c(a12.F(), a13.F())).s(a13.h0()).q(a13.f0()).d(aVar2.f(a12)).n(aVar2.f(a13)).c();
                        F a15 = a13.a();
                        C6496s.e(a15);
                        a15.close();
                        C6706c cVar3 = this.f73592a;
                        C6496s.e(cVar3);
                        cVar3.y();
                        this.f73592a.F(a12, c12);
                        rVar.b(call, c12);
                        return c12;
                    }
                }
                C6496s.e(a13);
                E.a T11 = a13.T();
                C1073a aVar3 = f73591b;
                E c13 = T11.d(aVar3.f(a12)).n(aVar3.f(a13)).c();
                if (this.f73592a != null) {
                    if (e.b(c13) && C6749c.f73597c.a(c13, b11)) {
                        E a16 = a(this.f73592a.o(c13), c13);
                        if (a12 != null) {
                            rVar.c(call);
                        }
                        return a16;
                    } else if (f.f73882a.a(b11.h())) {
                        try {
                            this.f73592a.q(b11);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c13;
            } finally {
                if (!(e10 == null || (a10 = e10.a()) == null)) {
                    C6726e.m(a10);
                }
            }
        }
    }
}
