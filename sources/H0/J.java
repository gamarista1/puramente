package H0;

import c1.s;
import yf.C6798l;

final class J {

    /* renamed from: a  reason: collision with root package name */
    public static final J f2533a = new J();

    private static final class a implements E {

        /* renamed from: a  reason: collision with root package name */
        private final C1193n f2534a;

        /* renamed from: b  reason: collision with root package name */
        private final c f2535b;

        /* renamed from: c  reason: collision with root package name */
        private final d f2536c;

        public a(C1193n nVar, c cVar, d dVar) {
            this.f2534a = nVar;
            this.f2535b = cVar;
            this.f2536c = dVar;
        }

        public Object a() {
            return this.f2534a.a();
        }

        public int e0(int i10) {
            return this.f2534a.e0(i10);
        }

        public int s(int i10) {
            return this.f2534a.s(i10);
        }

        public int s0(int i10) {
            return this.f2534a.s0(i10);
        }

        public int t0(int i10) {
            return this.f2534a.t0(i10);
        }

        public U v0(long j10) {
            int i10;
            int i11;
            int i12 = 32767;
            if (this.f2536c == d.Width) {
                if (this.f2535b == c.Max) {
                    i11 = this.f2534a.t0(c1.b.k(j10));
                } else {
                    i11 = this.f2534a.s0(c1.b.k(j10));
                }
                if (c1.b.g(j10)) {
                    i12 = c1.b.k(j10);
                }
                return new b(i11, i12);
            }
            if (this.f2535b == c.Max) {
                i10 = this.f2534a.s(c1.b.l(j10));
            } else {
                i10 = this.f2534a.e0(c1.b.l(j10));
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

    private J() {
    }

    public final int a(C1203y yVar, C1194o oVar, C1193n nVar, int i10) {
        return yVar.o(new r(oVar, oVar.getLayoutDirection()), new a(nVar, c.Max, d.Height), c1.c.b(0, i10, 0, 0, 13, (Object) null)).d();
    }

    public final int b(C1203y yVar, C1194o oVar, C1193n nVar, int i10) {
        return yVar.o(new r(oVar, oVar.getLayoutDirection()), new a(nVar, c.Max, d.Width), c1.c.b(0, 0, 0, i10, 7, (Object) null)).e();
    }

    public final int c(C1203y yVar, C1194o oVar, C1193n nVar, int i10) {
        return yVar.o(new r(oVar, oVar.getLayoutDirection()), new a(nVar, c.Min, d.Height), c1.c.b(0, i10, 0, 0, 13, (Object) null)).d();
    }

    public final int d(C1203y yVar, C1194o oVar, C1193n nVar, int i10) {
        return yVar.o(new r(oVar, oVar.getLayoutDirection()), new a(nVar, c.Min, d.Width), c1.c.b(0, 0, 0, i10, 7, (Object) null)).e();
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
