package X8;

import X8.k;

final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f35451a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35452b;

    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f35453a;

        /* renamed from: b  reason: collision with root package name */
        private a f35454b;

        b() {
        }

        public k a() {
            return new e(this.f35453a, this.f35454b);
        }

        public k.a b(a aVar) {
            this.f35454b = aVar;
            return this;
        }

        public k.a c(k.b bVar) {
            this.f35453a = bVar;
            return this;
        }
    }

    public a b() {
        return this.f35452b;
    }

    public k.b c() {
        return this.f35451a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f35451a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            a aVar = this.f35452b;
            if (aVar == null) {
                if (kVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10;
        k.b bVar = this.f35451a;
        int i11 = 0;
        if (bVar == null) {
            i10 = 0;
        } else {
            i10 = bVar.hashCode();
        }
        int i12 = (i10 ^ 1000003) * 1000003;
        a aVar = this.f35452b;
        if (aVar != null) {
            i11 = aVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f35451a + ", androidClientInfo=" + this.f35452b + "}";
    }

    private e(k.b bVar, a aVar) {
        this.f35451a = bVar;
        this.f35452b = aVar;
    }
}
