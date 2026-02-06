package com.google.firebase.installations;

import com.google.firebase.installations.g;

final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private final String f57347a;

    /* renamed from: b  reason: collision with root package name */
    private final long f57348b;

    /* renamed from: c  reason: collision with root package name */
    private final long f57349c;

    static final class b extends g.a {

        /* renamed from: a  reason: collision with root package name */
        private String f57350a;

        /* renamed from: b  reason: collision with root package name */
        private Long f57351b;

        /* renamed from: c  reason: collision with root package name */
        private Long f57352c;

        b() {
        }

        public g a() {
            String str = "";
            if (this.f57350a == null) {
                str = str + " token";
            }
            if (this.f57351b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f57352c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f57350a, this.f57351b.longValue(), this.f57352c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public g.a b(String str) {
            if (str != null) {
                this.f57350a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        public g.a c(long j10) {
            this.f57352c = Long.valueOf(j10);
            return this;
        }

        public g.a d(long j10) {
            this.f57351b = Long.valueOf(j10);
            return this;
        }
    }

    public String b() {
        return this.f57347a;
    }

    public long c() {
        return this.f57349c;
    }

    public long d() {
        return this.f57348b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f57347a.equals(gVar.b()) && this.f57348b == gVar.d() && this.f57349c == gVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f57348b;
        long j11 = this.f57349c;
        return ((((this.f57347a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f57347a + ", tokenExpirationTimestamp=" + this.f57348b + ", tokenCreationTimestamp=" + this.f57349c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f57347a = str;
        this.f57348b = j10;
        this.f57349c = j11;
    }
}
