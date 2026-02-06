package A9;

import ja.B;
import ja.I;
import ja.M;
import q9.C3966a;
import q9.l;

final class E extends C3966a {

    private static final class a implements C3966a.f {

        /* renamed from: a  reason: collision with root package name */
        private final I f29458a;

        /* renamed from: b  reason: collision with root package name */
        private final B f29459b = new B();

        /* renamed from: c  reason: collision with root package name */
        private final int f29460c;

        /* renamed from: d  reason: collision with root package name */
        private final int f29461d;

        public a(int i10, I i11, int i12) {
            this.f29460c = i10;
            this.f29458a = i11;
            this.f29461d = i12;
        }

        private C3966a.e c(B b10, long j10, long j11) {
            int a10;
            int i10;
            B b11 = b10;
            long j12 = j11;
            int f10 = b10.f();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (b10.a() >= 188 && (i10 = a10 + 188) <= f10) {
                long c10 = J.c(b11, (a10 = J.a(b10.d(), b10.e(), f10)), this.f29460c);
                if (c10 != -9223372036854775807L) {
                    long b12 = this.f29458a.b(c10);
                    if (b12 > j10) {
                        if (j15 == -9223372036854775807L) {
                            return C3966a.e.d(b12, j12);
                        }
                        return C3966a.e.e(j12 + j14);
                    } else if (100000 + b12 > j10) {
                        return C3966a.e.e(j12 + ((long) a10));
                    } else {
                        j14 = (long) a10;
                        j15 = b12;
                    }
                }
                b11.P(i10);
                j13 = (long) i10;
            }
            if (j15 != -9223372036854775807L) {
                return C3966a.e.f(j15, j12 + j13);
            }
            return C3966a.e.f47847d;
        }

        public void a() {
            this.f29459b.M(M.f44986f);
        }

        public C3966a.e b(l lVar, long j10) {
            long position = lVar.getPosition();
            int min = (int) Math.min((long) this.f29461d, lVar.a() - position);
            this.f29459b.L(min);
            lVar.l(this.f29459b.d(), 0, min);
            return c(this.f29459b, j10, position);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E(ja.I r17, long r18, long r20, int r22, int r23) {
        /*
            r16 = this;
            q9.a$b r1 = new q9.a$b
            r1.<init>()
            A9.E$a r2 = new A9.E$a
            r0 = r17
            r3 = r22
            r4 = r23
            r2.<init>(r3, r0, r4)
            r3 = 1
            long r7 = r18 + r3
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r5 = 0
            r9 = 0
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.E.<init>(ja.I, long, long, int, int):void");
    }
}
