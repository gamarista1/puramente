package g9;

import g9.C3547e;

/* renamed from: g9.a  reason: case insensitive filesystem */
final class C3543a extends C3547e {

    /* renamed from: b  reason: collision with root package name */
    private final long f43717b;

    /* renamed from: c  reason: collision with root package name */
    private final int f43718c;

    /* renamed from: d  reason: collision with root package name */
    private final int f43719d;

    /* renamed from: e  reason: collision with root package name */
    private final long f43720e;

    /* renamed from: f  reason: collision with root package name */
    private final int f43721f;

    /* renamed from: g9.a$b */
    static final class b extends C3547e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f43722a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f43723b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f43724c;

        /* renamed from: d  reason: collision with root package name */
        private Long f43725d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f43726e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public C3547e a() {
            String str = "";
            if (this.f43722a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f43723b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f43724c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f43725d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f43726e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C3543a(this.f43722a.longValue(), this.f43723b.intValue(), this.f43724c.intValue(), this.f43725d.longValue(), this.f43726e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public C3547e.a b(int i10) {
            this.f43724c = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public C3547e.a c(long j10) {
            this.f43725d = Long.valueOf(j10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public C3547e.a d(int i10) {
            this.f43723b = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public C3547e.a e(int i10) {
            this.f43726e = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public C3547e.a f(long j10) {
            this.f43722a = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f43719d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f43720e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f43718c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f43721f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3547e)) {
            return false;
        }
        C3547e eVar = (C3547e) obj;
        if (this.f43717b == eVar.f() && this.f43718c == eVar.d() && this.f43719d == eVar.b() && this.f43720e == eVar.c() && this.f43721f == eVar.e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.f43717b;
    }

    public int hashCode() {
        long j10 = this.f43717b;
        long j11 = this.f43720e;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f43718c) * 1000003) ^ this.f43719d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f43721f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f43717b + ", loadBatchSize=" + this.f43718c + ", criticalSectionEnterTimeoutMs=" + this.f43719d + ", eventCleanUpAge=" + this.f43720e + ", maxBlobByteSizePerRow=" + this.f43721f + "}";
    }

    private C3543a(long j10, int i10, int i11, long j11, int i12) {
        this.f43717b = j10;
        this.f43718c = i10;
        this.f43719d = i11;
        this.f43720e = j11;
        this.f43721f = i12;
    }
}
