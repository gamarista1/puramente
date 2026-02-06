package X8;

import X8.o;

final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f35484a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f35485b;

    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f35486a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f35487b;

        b() {
        }

        public o a() {
            return new i(this.f35486a, this.f35487b);
        }

        public o.a b(o.b bVar) {
            this.f35487b = bVar;
            return this;
        }

        public o.a c(o.c cVar) {
            this.f35486a = cVar;
            return this;
        }
    }

    public o.b b() {
        return this.f35485b;
    }

    public o.c c() {
        return this.f35484a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f35484a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f35485b;
            if (bVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10;
        o.c cVar = this.f35484a;
        int i11 = 0;
        if (cVar == null) {
            i10 = 0;
        } else {
            i10 = cVar.hashCode();
        }
        int i12 = (i10 ^ 1000003) * 1000003;
        o.b bVar = this.f35485b;
        if (bVar != null) {
            i11 = bVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f35484a + ", mobileSubtype=" + this.f35485b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f35484a = cVar;
        this.f35485b = bVar;
    }
}
