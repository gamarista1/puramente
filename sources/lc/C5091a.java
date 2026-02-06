package lc;

import lc.C5094d;

/* renamed from: lc.a  reason: case insensitive filesystem */
final class C5091a extends C5094d {

    /* renamed from: a  reason: collision with root package name */
    private final String f60999a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61000b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61001c;

    /* renamed from: d  reason: collision with root package name */
    private final C5096f f61002d;

    /* renamed from: e  reason: collision with root package name */
    private final C5094d.b f61003e;

    /* renamed from: lc.a$b */
    static final class b extends C5094d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f61004a;

        /* renamed from: b  reason: collision with root package name */
        private String f61005b;

        /* renamed from: c  reason: collision with root package name */
        private String f61006c;

        /* renamed from: d  reason: collision with root package name */
        private C5096f f61007d;

        /* renamed from: e  reason: collision with root package name */
        private C5094d.b f61008e;

        b() {
        }

        public C5094d a() {
            return new C5091a(this.f61004a, this.f61005b, this.f61006c, this.f61007d, this.f61008e);
        }

        public C5094d.a b(C5096f fVar) {
            this.f61007d = fVar;
            return this;
        }

        public C5094d.a c(String str) {
            this.f61005b = str;
            return this;
        }

        public C5094d.a d(String str) {
            this.f61006c = str;
            return this;
        }

        public C5094d.a e(C5094d.b bVar) {
            this.f61008e = bVar;
            return this;
        }

        public C5094d.a f(String str) {
            this.f61004a = str;
            return this;
        }
    }

    public C5096f b() {
        return this.f61002d;
    }

    public String c() {
        return this.f61000b;
    }

    public String d() {
        return this.f61001c;
    }

    public C5094d.b e() {
        return this.f61003e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5094d)) {
            return false;
        }
        C5094d dVar = (C5094d) obj;
        String str = this.f60999a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f61000b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f61001c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    C5096f fVar = this.f61002d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        C5094d.b bVar = this.f61003e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f60999a;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        String str = this.f60999a;
        int i14 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = (i10 ^ 1000003) * 1000003;
        String str2 = this.f61000b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i16 = (i15 ^ i11) * 1000003;
        String str3 = this.f61001c;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i17 = (i16 ^ i12) * 1000003;
        C5096f fVar = this.f61002d;
        if (fVar == null) {
            i13 = 0;
        } else {
            i13 = fVar.hashCode();
        }
        int i18 = (i17 ^ i13) * 1000003;
        C5094d.b bVar = this.f61003e;
        if (bVar != null) {
            i14 = bVar.hashCode();
        }
        return i18 ^ i14;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f60999a + ", fid=" + this.f61000b + ", refreshToken=" + this.f61001c + ", authToken=" + this.f61002d + ", responseCode=" + this.f61003e + "}";
    }

    private C5091a(String str, String str2, String str3, C5096f fVar, C5094d.b bVar) {
        this.f60999a = str;
        this.f61000b = str2;
        this.f61001c = str3;
        this.f61002d = fVar;
        this.f61003e = bVar;
    }
}
