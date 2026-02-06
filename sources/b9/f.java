package b9;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    private static final f f36333c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f36334a;

    /* renamed from: b  reason: collision with root package name */
    private final long f36335b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f36336a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f36337b = 0;

        a() {
        }

        public f a() {
            return new f(this.f36336a, this.f36337b);
        }

        public a b(long j10) {
            this.f36337b = j10;
            return this;
        }

        public a c(long j10) {
            this.f36336a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f36334a = j10;
        this.f36335b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f36335b;
    }

    public long b() {
        return this.f36334a;
    }
}
