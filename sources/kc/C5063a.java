package kc;

import kc.C5065c;
import kc.C5066d;

/* renamed from: kc.a  reason: case insensitive filesystem */
final class C5063a extends C5066d {

    /* renamed from: b  reason: collision with root package name */
    private final String f60920b;

    /* renamed from: c  reason: collision with root package name */
    private final C5065c.a f60921c;

    /* renamed from: d  reason: collision with root package name */
    private final String f60922d;

    /* renamed from: e  reason: collision with root package name */
    private final String f60923e;

    /* renamed from: f  reason: collision with root package name */
    private final long f60924f;

    /* renamed from: g  reason: collision with root package name */
    private final long f60925g;

    /* renamed from: h  reason: collision with root package name */
    private final String f60926h;

    /* renamed from: kc.a$b */
    static final class b extends C5066d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f60927a;

        /* renamed from: b  reason: collision with root package name */
        private C5065c.a f60928b;

        /* renamed from: c  reason: collision with root package name */
        private String f60929c;

        /* renamed from: d  reason: collision with root package name */
        private String f60930d;

        /* renamed from: e  reason: collision with root package name */
        private Long f60931e;

        /* renamed from: f  reason: collision with root package name */
        private Long f60932f;

        /* renamed from: g  reason: collision with root package name */
        private String f60933g;

        public C5066d a() {
            String str = "";
            if (this.f60928b == null) {
                str = str + " registrationStatus";
            }
            if (this.f60931e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f60932f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C5063a(this.f60927a, this.f60928b, this.f60929c, this.f60930d, this.f60931e.longValue(), this.f60932f.longValue(), this.f60933g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public C5066d.a b(String str) {
            this.f60929c = str;
            return this;
        }

        public C5066d.a c(long j10) {
            this.f60931e = Long.valueOf(j10);
            return this;
        }

        public C5066d.a d(String str) {
            this.f60927a = str;
            return this;
        }

        public C5066d.a e(String str) {
            this.f60933g = str;
            return this;
        }

        public C5066d.a f(String str) {
            this.f60930d = str;
            return this;
        }

        public C5066d.a g(C5065c.a aVar) {
            if (aVar != null) {
                this.f60928b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public C5066d.a h(long j10) {
            this.f60932f = Long.valueOf(j10);
            return this;
        }

        b() {
        }

        private b(C5066d dVar) {
            this.f60927a = dVar.d();
            this.f60928b = dVar.g();
            this.f60929c = dVar.b();
            this.f60930d = dVar.f();
            this.f60931e = Long.valueOf(dVar.c());
            this.f60932f = Long.valueOf(dVar.h());
            this.f60933g = dVar.e();
        }
    }

    public String b() {
        return this.f60922d;
    }

    public long c() {
        return this.f60924f;
    }

    public String d() {
        return this.f60920b;
    }

    public String e() {
        return this.f60926h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5066d)) {
            return false;
        }
        C5066d dVar = (C5066d) obj;
        String str3 = this.f60920b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f60921c.equals(dVar.g()) && ((str = this.f60922d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f60923e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f60924f == dVar.c() && this.f60925g == dVar.h()) {
                String str4 = this.f60926h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f60923e;
    }

    public C5065c.a g() {
        return this.f60921c;
    }

    public long h() {
        return this.f60925g;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        String str = this.f60920b;
        int i13 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode = (((i10 ^ 1000003) * 1000003) ^ this.f60921c.hashCode()) * 1000003;
        String str2 = this.f60922d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (hashCode ^ i11) * 1000003;
        String str3 = this.f60923e;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        long j10 = this.f60924f;
        long j11 = this.f60925g;
        int i15 = (((((i14 ^ i12) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f60926h;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i15 ^ i13;
    }

    public C5066d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f60920b + ", registrationStatus=" + this.f60921c + ", authToken=" + this.f60922d + ", refreshToken=" + this.f60923e + ", expiresInSecs=" + this.f60924f + ", tokenCreationEpochInSecs=" + this.f60925g + ", fisError=" + this.f60926h + "}";
    }

    private C5063a(String str, C5065c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f60920b = str;
        this.f60921c = aVar;
        this.f60922d = str2;
        this.f60923e = str3;
        this.f60924f = j10;
        this.f60925g = j11;
        this.f60926h = str4;
    }
}
