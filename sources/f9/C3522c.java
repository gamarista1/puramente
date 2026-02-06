package f9;

import f9.f;
import java.util.Set;

/* renamed from: f9.c  reason: case insensitive filesystem */
final class C3522c extends f.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f43477a;

    /* renamed from: b  reason: collision with root package name */
    private final long f43478b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f43479c;

    /* renamed from: f9.c$b */
    static final class b extends f.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f43480a;

        /* renamed from: b  reason: collision with root package name */
        private Long f43481b;

        /* renamed from: c  reason: collision with root package name */
        private Set f43482c;

        b() {
        }

        public f.b a() {
            String str = "";
            if (this.f43480a == null) {
                str = str + " delta";
            }
            if (this.f43481b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f43482c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C3522c(this.f43480a.longValue(), this.f43481b.longValue(), this.f43482c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.b.a b(long j10) {
            this.f43480a = Long.valueOf(j10);
            return this;
        }

        public f.b.a c(Set set) {
            if (set != null) {
                this.f43482c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public f.b.a d(long j10) {
            this.f43481b = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f43477a;
    }

    /* access modifiers changed from: package-private */
    public Set c() {
        return this.f43479c;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f43478b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        if (this.f43477a == bVar.b() && this.f43478b == bVar.d() && this.f43479c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f43477a;
        long j11 = this.f43478b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f43479c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f43477a + ", maxAllowedDelay=" + this.f43478b + ", flags=" + this.f43479c + "}";
    }

    private C3522c(long j10, long j11, Set set) {
        this.f43477a = j10;
        this.f43478b = j11;
        this.f43479c = set;
    }
}
