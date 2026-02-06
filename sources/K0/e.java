package k0;

import c1.o;
import c1.r;
import c1.t;
import k0.c;

public final class e implements c {

    /* renamed from: b  reason: collision with root package name */
    private final float f23064b;

    /* renamed from: c  reason: collision with root package name */
    private final float f23065c;

    public static final class a implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final float f23066a;

        public a(float f10) {
            this.f23066a = f10;
        }

        public int a(int i10, int i11, t tVar) {
            float f10;
            float f11 = ((float) (i11 - i10)) / 2.0f;
            if (tVar == t.Ltr) {
                f10 = this.f23066a;
            } else {
                f10 = ((float) -1) * this.f23066a;
            }
            return Math.round(f11 * (((float) 1) + f10));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && Float.compare(this.f23066a, ((a) obj).f23066a) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.f23066a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f23066a + ')';
        }
    }

    public static final class b implements c.C0368c {

        /* renamed from: a  reason: collision with root package name */
        private final float f23067a;

        public b(float f10) {
            this.f23067a = f10;
        }

        public int a(int i10, int i11) {
            return Math.round((((float) (i11 - i10)) / 2.0f) * (((float) 1) + this.f23067a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && Float.compare(this.f23067a, ((b) obj).f23067a) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.f23067a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f23067a + ')';
        }
    }

    public e(float f10, float f11) {
        this.f23064b = f10;
        this.f23065c = f11;
    }

    public long a(long j10, long j11, t tVar) {
        float f10;
        float g10 = ((float) (r.g(j11) - r.g(j10))) / 2.0f;
        float f11 = ((float) (r.f(j11) - r.f(j10))) / 2.0f;
        if (tVar == t.Ltr) {
            f10 = this.f23064b;
        } else {
            f10 = ((float) -1) * this.f23064b;
        }
        float f12 = (float) 1;
        return o.a(Math.round(g10 * (f10 + f12)), Math.round(f11 * (f12 + this.f23065c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Float.compare(this.f23064b, eVar.f23064b) == 0 && Float.compare(this.f23065c, eVar.f23065c) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f23064b) * 31) + Float.hashCode(this.f23065c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f23064b + ", verticalBias=" + this.f23065c + ')';
    }
}
