package z2;

import i2.C2076a;

public interface J {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final K f29107a;

        /* renamed from: b  reason: collision with root package name */
        public final K f29108b;

        public a(K k10) {
            this(k10, k10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f29107a.equals(aVar.f29107a) || !this.f29108b.equals(aVar.f29108b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f29107a.hashCode() * 31) + this.f29108b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f29107a);
            if (this.f29107a.equals(this.f29108b)) {
                str = "";
            } else {
                str = ", " + this.f29108b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(K k10, K k11) {
            this.f29107a = (K) C2076a.e(k10);
            this.f29108b = (K) C2076a.e(k11);
        }
    }

    public static class b implements J {

        /* renamed from: a  reason: collision with root package name */
        private final long f29109a;

        /* renamed from: b  reason: collision with root package name */
        private final a f29110b;

        public b(long j10) {
            this(j10, 0);
        }

        public a c(long j10) {
            return this.f29110b;
        }

        public boolean e() {
            return false;
        }

        public long g() {
            return this.f29109a;
        }

        public b(long j10, long j11) {
            this.f29109a = j10;
            this.f29110b = new a(j11 == 0 ? K.f29111c : new K(0, j11));
        }
    }

    a c(long j10);

    boolean e();

    long g();
}
