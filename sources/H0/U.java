package H0;

import Ef.m;
import J0.W;
import c1.b;
import c1.n;
import c1.o;
import c1.r;
import c1.s;
import c1.t;
import u0.C2673c;
import yf.C6798l;

public abstract class U implements I {

    /* renamed from: a  reason: collision with root package name */
    private int f2548a;

    /* renamed from: b  reason: collision with root package name */
    private int f2549b;

    /* renamed from: c  reason: collision with root package name */
    private long f2550c = s.a(0, 0);

    /* renamed from: d  reason: collision with root package name */
    private long f2551d = V.f2555b;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f2552e = n.f19226b.a();

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2553a;

        /* access modifiers changed from: private */
        public final void f(U u10) {
            if (u10 instanceof W) {
                ((W) u10).D0(this.f2553a);
            }
        }

        public static /* synthetic */ void h(a aVar, U u10, int i10, int i11, float f10, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f10 = 0.0f;
                }
                aVar.g(u10, i10, i11, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        public static /* synthetic */ void j(a aVar, U u10, long j10, float f10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    f10 = 0.0f;
                }
                aVar.i(u10, j10, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        public static /* synthetic */ void l(a aVar, U u10, int i10, int i11, float f10, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f10 = 0.0f;
                }
                aVar.k(u10, i10, i11, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        public static /* synthetic */ void n(a aVar, U u10, long j10, float f10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    f10 = 0.0f;
                }
                aVar.m(u10, j10, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
        }

        public static /* synthetic */ void p(a aVar, U u10, int i10, int i11, float f10, C6798l lVar, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f10 = 0.0f;
                }
                float f11 = f10;
                if ((i12 & 8) != 0) {
                    lVar = V.f2554a;
                }
                aVar.o(u10, i10, i11, f11, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        public static /* synthetic */ void s(a aVar, U u10, long j10, float f10, C6798l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    f10 = 0.0f;
                }
                float f11 = f10;
                if ((i10 & 4) != 0) {
                    lVar = V.f2554a;
                }
                aVar.q(u10, j10, f11, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void t(a aVar, U u10, long j10, C2673c cVar, float f10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    f10 = 0.0f;
                }
                aVar.r(u10, j10, cVar, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void v(a aVar, U u10, int i10, int i11, float f10, C6798l lVar, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f10 = 0.0f;
                }
                float f11 = f10;
                if ((i12 & 8) != 0) {
                    lVar = V.f2554a;
                }
                aVar.u(u10, i10, i11, f11, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        public static /* synthetic */ void y(a aVar, U u10, long j10, float f10, C6798l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    f10 = 0.0f;
                }
                float f11 = f10;
                if ((i10 & 4) != 0) {
                    lVar = V.f2554a;
                }
                aVar.w(u10, j10, f11, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void z(a aVar, U u10, long j10, C2673c cVar, float f10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    f10 = 0.0f;
                }
                aVar.x(u10, j10, cVar, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        public final void A(C6798l lVar) {
            this.f2553a = true;
            lVar.invoke(this);
            this.f2553a = false;
        }

        /* access modifiers changed from: protected */
        public abstract t d();

        /* access modifiers changed from: protected */
        public abstract int e();

        public final void g(U u10, int i10, int i11, float f10) {
            long a10 = o.a(i10, i11);
            f(u10);
            u10.f1(n.n(a10, u10.f2552e), f10, (C6798l) null);
        }

        public final void i(U u10, long j10, float f10) {
            f(u10);
            u10.f1(n.n(j10, u10.f2552e), f10, (C6798l) null);
        }

        public final void k(U u10, int i10, int i11, float f10) {
            long a10 = o.a(i10, i11);
            if (d() == t.Ltr || e() == 0) {
                f(u10);
                u10.f1(n.n(a10, u10.f2552e), f10, (C6798l) null);
                return;
            }
            long a11 = o.a((e() - u10.X0()) - n.j(a10), n.k(a10));
            f(u10);
            u10.f1(n.n(a11, u10.f2552e), f10, (C6798l) null);
        }

        public final void m(U u10, long j10, float f10) {
            if (d() == t.Ltr || e() == 0) {
                f(u10);
                u10.f1(n.n(j10, u10.f2552e), f10, (C6798l) null);
                return;
            }
            long a10 = o.a((e() - u10.X0()) - n.j(j10), n.k(j10));
            f(u10);
            u10.f1(n.n(a10, u10.f2552e), f10, (C6798l) null);
        }

        public final void o(U u10, int i10, int i11, float f10, C6798l lVar) {
            long a10 = o.a(i10, i11);
            if (d() == t.Ltr || e() == 0) {
                f(u10);
                u10.f1(n.n(a10, u10.f2552e), f10, lVar);
                return;
            }
            long a11 = o.a((e() - u10.X0()) - n.j(a10), n.k(a10));
            f(u10);
            u10.f1(n.n(a11, u10.f2552e), f10, lVar);
        }

        public final void q(U u10, long j10, float f10, C6798l lVar) {
            if (d() == t.Ltr || e() == 0) {
                f(u10);
                u10.f1(n.n(j10, u10.f2552e), f10, lVar);
                return;
            }
            long a10 = o.a((e() - u10.X0()) - n.j(j10), n.k(j10));
            f(u10);
            u10.f1(n.n(a10, u10.f2552e), f10, lVar);
        }

        public final void r(U u10, long j10, C2673c cVar, float f10) {
            if (d() == t.Ltr || e() == 0) {
                f(u10);
                u10.e1(n.n(j10, u10.f2552e), f10, cVar);
                return;
            }
            long a10 = o.a((e() - u10.X0()) - n.j(j10), n.k(j10));
            f(u10);
            u10.e1(n.n(a10, u10.f2552e), f10, cVar);
        }

        public final void u(U u10, int i10, int i11, float f10, C6798l lVar) {
            long a10 = o.a(i10, i11);
            f(u10);
            u10.f1(n.n(a10, u10.f2552e), f10, lVar);
        }

        public final void w(U u10, long j10, float f10, C6798l lVar) {
            f(u10);
            u10.f1(n.n(j10, u10.f2552e), f10, lVar);
        }

        public final void x(U u10, long j10, C2673c cVar, float f10) {
            f(u10);
            u10.e1(n.n(j10, u10.f2552e), f10, cVar);
        }
    }

    private final void b1() {
        this.f2548a = m.l(r.g(this.f2550c), b.n(this.f2551d), b.l(this.f2551d));
        this.f2549b = m.l(r.f(this.f2550c), b.m(this.f2551d), b.k(this.f2551d));
        this.f2552e = o.a((this.f2548a - r.g(this.f2550c)) / 2, (this.f2549b - r.f(this.f2550c)) / 2);
    }

    /* access modifiers changed from: protected */
    public final long Q0() {
        return this.f2552e;
    }

    public final int R0() {
        return this.f2549b;
    }

    public int S0() {
        return r.f(this.f2550c);
    }

    /* access modifiers changed from: protected */
    public final long T0() {
        return this.f2550c;
    }

    public int U0() {
        return r.g(this.f2550c);
    }

    /* access modifiers changed from: protected */
    public final long W0() {
        return this.f2551d;
    }

    public final int X0() {
        return this.f2548a;
    }

    /* access modifiers changed from: protected */
    public void e1(long j10, float f10, C2673c cVar) {
        f1(j10, f10, (C6798l) null);
    }

    /* access modifiers changed from: protected */
    public abstract void f1(long j10, float f10, C6798l lVar);

    /* access modifiers changed from: protected */
    public final void i1(long j10) {
        if (!r.e(this.f2550c, j10)) {
            this.f2550c = j10;
            b1();
        }
    }

    /* access modifiers changed from: protected */
    public final void k1(long j10) {
        if (!b.f(this.f2551d, j10)) {
            this.f2551d = j10;
            b1();
        }
    }
}
