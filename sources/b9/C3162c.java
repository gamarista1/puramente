package b9;

import cc.C4479c;

/* renamed from: b9.c  reason: case insensitive filesystem */
public final class C3162c {

    /* renamed from: c  reason: collision with root package name */
    private static final C3162c f36309c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f36310a;

    /* renamed from: b  reason: collision with root package name */
    private final b f36311b;

    /* renamed from: b9.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f36312a = 0;

        /* renamed from: b  reason: collision with root package name */
        private b f36313b = b.REASON_UNKNOWN;

        a() {
        }

        public C3162c a() {
            return new C3162c(this.f36312a, this.f36313b);
        }

        public a b(long j10) {
            this.f36312a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f36313b = bVar;
            return this;
        }
    }

    /* renamed from: b9.c$b */
    public enum b implements C4479c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f36322a;

        private b(int i10) {
            this.f36322a = i10;
        }

        public int d() {
            return this.f36322a;
        }
    }

    C3162c(long j10, b bVar) {
        this.f36310a = j10;
        this.f36311b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f36310a;
    }

    public b b() {
        return this.f36311b;
    }
}
