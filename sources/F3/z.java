package f3;

import i2.C2073A;
import i2.G;
import i2.L;
import z2.C2961e;
import z2.C2973q;

final class z extends C2961e {

    private static final class b implements C2961e.f {

        /* renamed from: a  reason: collision with root package name */
        private final G f20795a;

        /* renamed from: b  reason: collision with root package name */
        private final C2073A f20796b;

        private C2961e.C0491e c(C2073A a10, long j10, long j11) {
            int i10 = -1;
            int i11 = -1;
            long j12 = -9223372036854775807L;
            while (a10.a() >= 4) {
                if (z.k(a10.e(), a10.f()) != 442) {
                    a10.V(1);
                } else {
                    a10.V(4);
                    long l10 = C1982A.l(a10);
                    if (l10 != -9223372036854775807L) {
                        long b10 = this.f20795a.b(l10);
                        if (b10 > j10) {
                            if (j12 == -9223372036854775807L) {
                                return C2961e.C0491e.d(b10, j11);
                            }
                            return C2961e.C0491e.e(j11 + ((long) i11));
                        } else if (100000 + b10 > j10) {
                            return C2961e.C0491e.e(j11 + ((long) a10.f()));
                        } else {
                            i11 = a10.f();
                            j12 = b10;
                        }
                    }
                    d(a10);
                    i10 = a10.f();
                }
            }
            if (j12 != -9223372036854775807L) {
                return C2961e.C0491e.f(j12, j11 + ((long) i10));
            }
            return C2961e.C0491e.f29210d;
        }

        private static void d(C2073A a10) {
            int g10 = a10.g();
            if (a10.a() < 10) {
                a10.U(g10);
                return;
            }
            a10.V(9);
            int H10 = a10.H() & 7;
            if (a10.a() < H10) {
                a10.U(g10);
                return;
            }
            a10.V(H10);
            if (a10.a() < 4) {
                a10.U(g10);
                return;
            }
            if (z.k(a10.e(), a10.f()) == 443) {
                a10.V(4);
                int N10 = a10.N();
                if (a10.a() < N10) {
                    a10.U(g10);
                    return;
                }
                a10.V(N10);
            }
            while (a10.a() >= 4 && (r1 = z.k(a10.e(), a10.f())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                a10.V(4);
                if (a10.a() < 2) {
                    a10.U(g10);
                    return;
                } else {
                    a10.U(Math.min(a10.g(), a10.f() + a10.N()));
                }
            }
        }

        public void a() {
            this.f20796b.R(L.f22077f);
        }

        public C2961e.C0491e b(C2973q qVar, long j10) {
            long position = qVar.getPosition();
            int min = (int) Math.min(20000, qVar.a() - position);
            this.f20796b.Q(min);
            qVar.l(this.f20796b.e(), 0, min);
            return c(this.f20796b, j10, position);
        }

        private b(G g10) {
            this.f20795a = g10;
            this.f20796b = new C2073A();
        }
    }

    public z(G g10, long j10, long j11) {
        super(new C2961e.b(), new b(g10), j10, 0, j10 + 1, 0, j11, 188, 1000);
    }

    /* access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
