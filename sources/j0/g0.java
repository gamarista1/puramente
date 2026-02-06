package J0;

import H0.C1180a;
import H0.C1193n;
import H0.C1194o;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import H0.r;
import c1.s;
import yf.C6798l;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f3872a = new g0();

    private static final class a implements E {

        /* renamed from: a  reason: collision with root package name */
        private final C1193n f3873a;

        /* renamed from: b  reason: collision with root package name */
        private final c f3874b;

        /* renamed from: c  reason: collision with root package name */
        private final d f3875c;

        public a(C1193n nVar, c cVar, d dVar) {
            this.f3873a = nVar;
            this.f3874b = cVar;
            this.f3875c = dVar;
        }

        public Object a() {
            return this.f3873a.a();
        }

        public int e0(int i10) {
            return this.f3873a.e0(i10);
        }

        public int s(int i10) {
            return this.f3873a.s(i10);
        }

        public int s0(int i10) {
            return this.f3873a.s0(i10);
        }

        public int t0(int i10) {
            return this.f3873a.t0(i10);
        }

        public U v0(long j10) {
            int i10;
            int i11;
            int i12 = 32767;
            if (this.f3875c == d.Width) {
                if (this.f3874b == c.Max) {
                    i11 = this.f3873a.t0(c1.b.k(j10));
                } else {
                    i11 = this.f3873a.s0(c1.b.k(j10));
                }
                if (c1.b.g(j10)) {
                    i12 = c1.b.k(j10);
                }
                return new b(i11, i12);
            }
            if (this.f3874b == c.Max) {
                i10 = this.f3873a.s(c1.b.l(j10));
            } else {
                i10 = this.f3873a.e0(c1.b.l(j10));
            }
            if (c1.b.h(j10)) {
                i12 = c1.b.l(j10);
            }
            return new b(i12, i10);
        }
    }

    private enum c {
        Min,
        Max
    }

    private enum d {
        Width,
        Height
    }

    public interface e {
        G o(H h10, E e10, long j10);
    }

    private g0() {
    }

    public final int a(e eVar, C1194o oVar, C1193n nVar, int i10) {
        return eVar.o(new r(oVar, oVar.getLayoutDirection()), new a(nVar, c.Max, d.Height), c1.c.b(0, i10, 0, 0, 13, (Object) null)).d();
    }

    public final int b(e eVar, C1194o oVar, C1193n nVar, int i10) {
        return eVar.o(new r(oVar, oVar.getLayoutDirection()), new a(nVar, c.Max, d.Width), c1.c.b(0, 0, 0, i10, 7, (Object) null)).e();
    }

    public final int c(e eVar, C1194o oVar, C1193n nVar, int i10) {
        return eVar.o(new r(oVar, oVar.getLayoutDirection()), new a(nVar, c.Min, d.Height), c1.c.b(0, i10, 0, 0, 13, (Object) null)).d();
    }

    public final int d(e eVar, C1194o oVar, C1193n nVar, int i10) {
        return eVar.o(new r(oVar, oVar.getLayoutDirection()), new a(nVar, c.Min, d.Width), c1.c.b(0, 0, 0, i10, 7, (Object) null)).e();
    }

    private static final class b extends U {
        public b(int i10, int i11) {
            i1(s.a(i10, i11));
        }

        public int k0(C1180a aVar) {
            return Integer.MIN_VALUE;
        }

        /* access modifiers changed from: protected */
        public void f1(long j10, float f10, C6798l lVar) {
        }
    }
}
