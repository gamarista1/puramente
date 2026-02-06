package b9;

/* renamed from: b9.e  reason: case insensitive filesystem */
public final class C3164e {

    /* renamed from: c  reason: collision with root package name */
    private static final C3164e f36328c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f36329a;

    /* renamed from: b  reason: collision with root package name */
    private final long f36330b;

    /* renamed from: b9.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f36331a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f36332b = 0;

        a() {
        }

        public C3164e a() {
            return new C3164e(this.f36331a, this.f36332b);
        }

        public a b(long j10) {
            this.f36331a = j10;
            return this;
        }

        public a c(long j10) {
            this.f36332b = j10;
            return this;
        }
    }

    C3164e(long j10, long j11) {
        this.f36329a = j10;
        this.f36330b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f36329a;
    }

    public long b() {
        return this.f36330b;
    }
}
