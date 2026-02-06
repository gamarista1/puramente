package Gc;

import Gc.d;

final class b extends d {

    /* renamed from: b  reason: collision with root package name */
    private final String f50831b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50832c;

    /* renamed from: d  reason: collision with root package name */
    private final String f50833d;

    /* renamed from: e  reason: collision with root package name */
    private final String f50834e;

    /* renamed from: f  reason: collision with root package name */
    private final long f50835f;

    /* renamed from: Gc.b$b  reason: collision with other inner class name */
    static final class C0772b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f50836a;

        /* renamed from: b  reason: collision with root package name */
        private String f50837b;

        /* renamed from: c  reason: collision with root package name */
        private String f50838c;

        /* renamed from: d  reason: collision with root package name */
        private String f50839d;

        /* renamed from: e  reason: collision with root package name */
        private long f50840e;

        /* renamed from: f  reason: collision with root package name */
        private byte f50841f;

        C0772b() {
        }

        public d a() {
            if (this.f50841f == 1 && this.f50836a != null && this.f50837b != null && this.f50838c != null && this.f50839d != null) {
                return new b(this.f50836a, this.f50837b, this.f50838c, this.f50839d, this.f50840e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f50836a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f50837b == null) {
                sb2.append(" variantId");
            }
            if (this.f50838c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f50839d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f50841f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public d.a b(String str) {
            if (str != null) {
                this.f50838c = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        public d.a c(String str) {
            if (str != null) {
                this.f50839d = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        public d.a d(String str) {
            if (str != null) {
                this.f50836a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        public d.a e(long j10) {
            this.f50840e = j10;
            this.f50841f = (byte) (this.f50841f | 1);
            return this;
        }

        public d.a f(String str) {
            if (str != null) {
                this.f50837b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    public String b() {
        return this.f50833d;
    }

    public String c() {
        return this.f50834e;
    }

    public String d() {
        return this.f50831b;
    }

    public long e() {
        return this.f50835f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f50831b.equals(dVar.d()) || !this.f50832c.equals(dVar.f()) || !this.f50833d.equals(dVar.b()) || !this.f50834e.equals(dVar.c()) || this.f50835f != dVar.e()) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.f50832c;
    }

    public int hashCode() {
        long j10 = this.f50835f;
        return ((((((((this.f50831b.hashCode() ^ 1000003) * 1000003) ^ this.f50832c.hashCode()) * 1000003) ^ this.f50833d.hashCode()) * 1000003) ^ this.f50834e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f50831b + ", variantId=" + this.f50832c + ", parameterKey=" + this.f50833d + ", parameterValue=" + this.f50834e + ", templateVersion=" + this.f50835f + "}";
    }

    private b(String str, String str2, String str3, String str4, long j10) {
        this.f50831b = str;
        this.f50832c = str2;
        this.f50833d = str3;
        this.f50834e = str4;
        this.f50835f = j10;
    }
}
