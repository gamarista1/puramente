package t9;

import q9.C3966a;
import q9.l;
import q9.q;
import q9.t;

/* renamed from: t9.b  reason: case insensitive filesystem */
final class C4053b extends C3966a {

    /* renamed from: t9.b$b  reason: collision with other inner class name */
    private static final class C0731b implements C3966a.f {

        /* renamed from: a  reason: collision with root package name */
        private final t f48291a;

        /* renamed from: b  reason: collision with root package name */
        private final int f48292b;

        /* renamed from: c  reason: collision with root package name */
        private final q.a f48293c;

        private long c(l lVar) {
            while (lVar.g() < lVar.a() - 6 && !q.h(lVar, this.f48291a, this.f48292b, this.f48293c)) {
                lVar.h(1);
            }
            if (lVar.g() < lVar.a() - 6) {
                return this.f48293c.f47892a;
            }
            lVar.h((int) (lVar.a() - lVar.g()));
            return this.f48291a.f47905j;
        }

        public C3966a.e b(l lVar, long j10) {
            long position = lVar.getPosition();
            long c10 = c(lVar);
            long g10 = lVar.g();
            lVar.h(Math.max(6, this.f48291a.f47898c));
            long c11 = c(lVar);
            long g11 = lVar.g();
            if (c10 <= j10 && c11 > j10) {
                return C3966a.e.e(g10);
            }
            if (c11 <= j10) {
                return C3966a.e.f(c11, g11);
            }
            return C3966a.e.d(c10, position);
        }

        private C0731b(t tVar, int i10) {
            this.f48291a = tVar;
            this.f48292b = i10;
            this.f48293c = new q.a();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4053b(q9.t r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            t9.a r1 = new t9.a
            r1.<init>(r0)
            t9.b$b r2 = new t9.b$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.f()
            long r7 = r0.f47905j
            long r13 = r17.d()
            r5 = 6
            int r0 = r0.f47898c
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.C4053b.<init>(q9.t, int, long, long):void");
    }
}
