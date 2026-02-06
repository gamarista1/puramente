package E2;

import z2.C2961e;
import z2.C2973q;
import z2.v;
import z2.y;

final class b extends C2961e {

    /* renamed from: E2.b$b  reason: collision with other inner class name */
    private static final class C0030b implements C2961e.f {

        /* renamed from: a  reason: collision with root package name */
        private final y f1743a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1744b;

        /* renamed from: c  reason: collision with root package name */
        private final v.a f1745c;

        private long c(C2973q qVar) {
            while (qVar.g() < qVar.a() - 6 && !v.h(qVar, this.f1743a, this.f1744b, this.f1745c)) {
                qVar.h(1);
            }
            if (qVar.g() < qVar.a() - 6) {
                return this.f1745c.f29277a;
            }
            qVar.h((int) (qVar.a() - qVar.g()));
            return this.f1743a.f29290j;
        }

        public C2961e.C0491e b(C2973q qVar, long j10) {
            long position = qVar.getPosition();
            long c10 = c(qVar);
            long g10 = qVar.g();
            qVar.h(Math.max(6, this.f1743a.f29283c));
            long c11 = c(qVar);
            long g11 = qVar.g();
            if (c10 <= j10 && c11 > j10) {
                return C2961e.C0491e.e(g10);
            }
            if (c11 <= j10) {
                return C2961e.C0491e.f(c11, g11);
            }
            return C2961e.C0491e.d(c10, position);
        }

        private C0030b(y yVar, int i10) {
            this.f1743a = yVar;
            this.f1744b = i10;
            this.f1745c = new v.a();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(z2.y r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            E2.a r1 = new E2.a
            r1.<init>(r0)
            E2.b$b r2 = new E2.b$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.f()
            long r7 = r0.f29290j
            long r13 = r17.d()
            r5 = 6
            int r0 = r0.f29283c
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.b.<init>(z2.y, int, long, long):void");
    }
}
