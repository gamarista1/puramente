package S8;

public interface e {

    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f33947a;

        public a(boolean z10) {
            this.f33947a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f33947a == ((a) obj).f33947a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f33947a);
        }

        public String toString() {
            return "Denied(shouldShowRationale=" + this.f33947a + ')';
        }
    }

    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33948a = new b();

        private b() {
        }
    }
}
