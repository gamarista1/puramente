package k0;

import c1.o;
import c1.r;
import c1.s;
import c1.t;
import k0.c;

public final class d implements c {

    /* renamed from: b  reason: collision with root package name */
    private final float f23061b;

    /* renamed from: c  reason: collision with root package name */
    private final float f23062c;

    public static final class a implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final float f23063a;

        public a(float f10) {
            this.f23063a = f10;
        }

        public int a(int i10, int i11, t tVar) {
            return Math.round((((float) (i11 - i10)) / 2.0f) * (((float) 1) + this.f23063a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && Float.compare(this.f23063a, ((a) obj).f23063a) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.f23063a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f23063a + ')';
        }
    }

    public d(float f10, float f11) {
        this.f23061b = f10;
        this.f23062c = f11;
    }

    public long a(long j10, long j11, t tVar) {
        long a10 = s.a(r.g(j11) - r.g(j10), r.f(j11) - r.f(j10));
        float f10 = (float) 1;
        return o.a(Math.round((((float) r.g(a10)) / 2.0f) * (this.f23061b + f10)), Math.round((((float) r.f(a10)) / 2.0f) * (f10 + this.f23062c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Float.compare(this.f23061b, dVar.f23061b) == 0 && Float.compare(this.f23062c, dVar.f23062c) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f23061b) * 31) + Float.hashCode(this.f23062c);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f23061b + ", verticalBias=" + this.f23062c + ')';
    }
}
