package f3;

import i2.C2073A;
import i2.L;
import z2.C2961e;
import z2.C2973q;

final class G extends C2961e {

    private static final class a implements C2961e.f {

        /* renamed from: a  reason: collision with root package name */
        private final i2.G f20429a;

        /* renamed from: b  reason: collision with root package name */
        private final C2073A f20430b = new C2073A();

        /* renamed from: c  reason: collision with root package name */
        private final int f20431c;

        /* renamed from: d  reason: collision with root package name */
        private final int f20432d;

        public a(int i10, i2.G g10, int i11) {
            this.f20431c = i10;
            this.f20429a = g10;
            this.f20432d = i11;
        }

        private C2961e.C0491e c(C2073A a10, long j10, long j11) {
            int a11;
            int i10;
            C2073A a12 = a10;
            long j12 = j11;
            int g10 = a10.g();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (a10.a() >= 188 && (i10 = a11 + 188) <= g10) {
                long c10 = L.c(a12, (a11 = L.a(a10.e(), a10.f(), g10)), this.f20431c);
                if (c10 != -9223372036854775807L) {
                    long b10 = this.f20429a.b(c10);
                    if (b10 > j10) {
                        if (j15 == -9223372036854775807L) {
                            return C2961e.C0491e.d(b10, j12);
                        }
                        return C2961e.C0491e.e(j12 + j14);
                    } else if (100000 + b10 > j10) {
                        return C2961e.C0491e.e(j12 + ((long) a11));
                    } else {
                        j14 = (long) a11;
                        j15 = b10;
                    }
                }
                a12.U(i10);
                j13 = (long) i10;
            }
            if (j15 != -9223372036854775807L) {
                return C2961e.C0491e.f(j15, j12 + j13);
            }
            return C2961e.C0491e.f29210d;
        }

        public void a() {
            this.f20430b.R(L.f22077f);
        }

        public C2961e.C0491e b(C2973q qVar, long j10) {
            long position = qVar.getPosition();
            int min = (int) Math.min((long) this.f20432d, qVar.a() - position);
            this.f20430b.Q(min);
            qVar.l(this.f20430b.e(), 0, min);
            return c(this.f20430b, j10, position);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public G(i2.G r17, long r18, long r20, int r22, int r23) {
        /*
            r16 = this;
            z2.e$b r1 = new z2.e$b
            r1.<init>()
            f3.G$a r2 = new f3.G$a
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
        throw new UnsupportedOperationException("Method not decompiled: f3.G.<init>(i2.G, long, long, int, int):void");
    }
}
