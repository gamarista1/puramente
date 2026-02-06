package F;

import c1.d;

public interface H {

    public static final class a implements H {

        /* renamed from: a  reason: collision with root package name */
        private final int f1968a;

        public a(int i10) {
            this.f1968a = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("grid with no rows/columns");
            }
        }

        public int[] a(d dVar, int i10, int i11) {
            return C1170e.b(i10, this.f1968a, i11);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || this.f1968a != ((a) obj).f1968a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -this.f1968a;
        }
    }

    int[] a(d dVar, int i10, int i11);
}
