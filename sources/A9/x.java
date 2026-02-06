package A9;

import ja.B;
import ja.I;
import ja.M;
import q9.C3966a;
import q9.l;

final class x extends C3966a {

    private static final class b implements C3966a.f {

        /* renamed from: a  reason: collision with root package name */
        private final I f29782a;

        /* renamed from: b  reason: collision with root package name */
        private final B f29783b;

        private C3966a.e c(B b10, long j10, long j11) {
            int i10 = -1;
            int i11 = -1;
            long j12 = -9223372036854775807L;
            while (b10.a() >= 4) {
                if (x.k(b10.d(), b10.e()) != 442) {
                    b10.Q(1);
                } else {
                    b10.Q(4);
                    long l10 = y.l(b10);
                    if (l10 != -9223372036854775807L) {
                        long b11 = this.f29782a.b(l10);
                        if (b11 > j10) {
                            if (j12 == -9223372036854775807L) {
                                return C3966a.e.d(b11, j11);
                            }
                            return C3966a.e.e(j11 + ((long) i11));
                        } else if (100000 + b11 > j10) {
                            return C3966a.e.e(j11 + ((long) b10.e()));
                        } else {
                            i11 = b10.e();
                            j12 = b11;
                        }
                    }
                    d(b10);
                    i10 = b10.e();
                }
            }
            if (j12 != -9223372036854775807L) {
                return C3966a.e.f(j12, j11 + ((long) i10));
            }
            return C3966a.e.f47847d;
        }

        private static void d(B b10) {
            int f10 = b10.f();
            if (b10.a() < 10) {
                b10.P(f10);
                return;
            }
            b10.Q(9);
            int D10 = b10.D() & 7;
            if (b10.a() < D10) {
                b10.P(f10);
                return;
            }
            b10.Q(D10);
            if (b10.a() < 4) {
                b10.P(f10);
                return;
            }
            if (x.k(b10.d(), b10.e()) == 443) {
                b10.Q(4);
                int J10 = b10.J();
                if (b10.a() < J10) {
                    b10.P(f10);
                    return;
                }
                b10.Q(J10);
            }
            while (b10.a() >= 4 && (r1 = x.k(b10.d(), b10.e())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                b10.Q(4);
                if (b10.a() < 2) {
                    b10.P(f10);
                    return;
                } else {
                    b10.P(Math.min(b10.f(), b10.e() + b10.J()));
                }
            }
        }

        public void a() {
            this.f29783b.M(M.f44986f);
        }

        public C3966a.e b(l lVar, long j10) {
            long position = lVar.getPosition();
            int min = (int) Math.min(20000, lVar.a() - position);
            this.f29783b.L(min);
            lVar.l(this.f29783b.d(), 0, min);
            return c(this.f29783b, j10, position);
        }

        private b(I i10) {
            this.f29782a = i10;
            this.f29783b = new B();
        }
    }

    public x(I i10, long j10, long j11) {
        super(new C3966a.b(), new b(i10), j10, 0, j10 + 1, 0, j11, 188, 1000);
    }

    /* access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
