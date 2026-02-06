package lc;

import lc.C5096f;

/* renamed from: lc.b  reason: case insensitive filesystem */
final class C5092b extends C5096f {

    /* renamed from: a  reason: collision with root package name */
    private final String f61009a;

    /* renamed from: b  reason: collision with root package name */
    private final long f61010b;

    /* renamed from: c  reason: collision with root package name */
    private final C5096f.b f61011c;

    /* renamed from: lc.b$b  reason: collision with other inner class name */
    static final class C0896b extends C5096f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f61012a;

        /* renamed from: b  reason: collision with root package name */
        private Long f61013b;

        /* renamed from: c  reason: collision with root package name */
        private C5096f.b f61014c;

        C0896b() {
        }

        public C5096f a() {
            String str = "";
            if (this.f61013b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C5092b(this.f61012a, this.f61013b.longValue(), this.f61014c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public C5096f.a b(C5096f.b bVar) {
            this.f61014c = bVar;
            return this;
        }

        public C5096f.a c(String str) {
            this.f61012a = str;
            return this;
        }

        public C5096f.a d(long j10) {
            this.f61013b = Long.valueOf(j10);
            return this;
        }
    }

    public C5096f.b b() {
        return this.f61011c;
    }

    public String c() {
        return this.f61009a;
    }

    public long d() {
        return this.f61010b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5096f)) {
            return false;
        }
        C5096f fVar = (C5096f) obj;
        String str = this.f61009a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f61010b == fVar.d()) {
                C5096f.b bVar = this.f61011c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String str = this.f61009a;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        long j10 = this.f61010b;
        int i12 = (((i10 ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        C5096f.b bVar = this.f61011c;
        if (bVar != null) {
            i11 = bVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "TokenResult{token=" + this.f61009a + ", tokenExpirationTimestamp=" + this.f61010b + ", responseCode=" + this.f61011c + "}";
    }

    private C5092b(String str, long j10, C5096f.b bVar) {
        this.f61009a = str;
        this.f61010b = j10;
        this.f61011c = bVar;
    }
}
