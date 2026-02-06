package Y8;

import W8.d;
import W8.g;
import Y8.n;

final class c extends n {

    /* renamed from: a  reason: collision with root package name */
    private final o f35730a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35731b;

    /* renamed from: c  reason: collision with root package name */
    private final d f35732c;

    /* renamed from: d  reason: collision with root package name */
    private final g f35733d;

    /* renamed from: e  reason: collision with root package name */
    private final W8.c f35734e;

    static final class b extends n.a {

        /* renamed from: a  reason: collision with root package name */
        private o f35735a;

        /* renamed from: b  reason: collision with root package name */
        private String f35736b;

        /* renamed from: c  reason: collision with root package name */
        private d f35737c;

        /* renamed from: d  reason: collision with root package name */
        private g f35738d;

        /* renamed from: e  reason: collision with root package name */
        private W8.c f35739e;

        b() {
        }

        public n a() {
            String str = "";
            if (this.f35735a == null) {
                str = str + " transportContext";
            }
            if (this.f35736b == null) {
                str = str + " transportName";
            }
            if (this.f35737c == null) {
                str = str + " event";
            }
            if (this.f35738d == null) {
                str = str + " transformer";
            }
            if (this.f35739e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f35735a, this.f35736b, this.f35737c, this.f35738d, this.f35739e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public n.a b(W8.c cVar) {
            if (cVar != null) {
                this.f35739e = cVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        public n.a c(d dVar) {
            if (dVar != null) {
                this.f35737c = dVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        public n.a d(g gVar) {
            if (gVar != null) {
                this.f35738d = gVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        public n.a e(o oVar) {
            if (oVar != null) {
                this.f35735a = oVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public n.a f(String str) {
            if (str != null) {
                this.f35736b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public W8.c b() {
        return this.f35734e;
    }

    /* access modifiers changed from: package-private */
    public d c() {
        return this.f35732c;
    }

    /* access modifiers changed from: package-private */
    public g e() {
        return this.f35733d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f35730a.equals(nVar.f()) || !this.f35731b.equals(nVar.g()) || !this.f35732c.equals(nVar.c()) || !this.f35733d.equals(nVar.e()) || !this.f35734e.equals(nVar.b())) {
            return false;
        }
        return true;
    }

    public o f() {
        return this.f35730a;
    }

    public String g() {
        return this.f35731b;
    }

    public int hashCode() {
        return ((((((((this.f35730a.hashCode() ^ 1000003) * 1000003) ^ this.f35731b.hashCode()) * 1000003) ^ this.f35732c.hashCode()) * 1000003) ^ this.f35733d.hashCode()) * 1000003) ^ this.f35734e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f35730a + ", transportName=" + this.f35731b + ", event=" + this.f35732c + ", transformer=" + this.f35733d + ", encoding=" + this.f35734e + "}";
    }

    private c(o oVar, String str, d dVar, g gVar, W8.c cVar) {
        this.f35730a = oVar;
        this.f35731b = str;
        this.f35732c = dVar;
        this.f35733d = gVar;
        this.f35734e = cVar;
    }
}
