package q9;

import ja.C3645a;

public interface z {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final C3961A f47920a;

        /* renamed from: b  reason: collision with root package name */
        public final C3961A f47921b;

        public a(C3961A a10) {
            this(a10, a10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f47920a.equals(aVar.f47920a) || !this.f47921b.equals(aVar.f47921b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f47920a.hashCode() * 31) + this.f47921b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f47920a);
            if (this.f47920a.equals(this.f47921b)) {
                str = "";
            } else {
                str = ", " + this.f47921b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(C3961A a10, C3961A a11) {
            this.f47920a = (C3961A) C3645a.e(a10);
            this.f47921b = (C3961A) C3645a.e(a11);
        }
    }

    public static class b implements z {

        /* renamed from: a  reason: collision with root package name */
        private final long f47922a;

        /* renamed from: b  reason: collision with root package name */
        private final a f47923b;

        public b(long j10) {
            this(j10, 0);
        }

        public a c(long j10) {
            return this.f47923b;
        }

        public boolean e() {
            return false;
        }

        public long g() {
            return this.f47922a;
        }

        public b(long j10, long j11) {
            this.f47922a = j10;
            this.f47923b = new a(j11 == 0 ? C3961A.f47788c : new C3961A(0, j11));
        }
    }

    a c(long j10);

    boolean e();

    long g();
}
