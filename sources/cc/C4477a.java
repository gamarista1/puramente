package cc;

import cc.C4480d;

/* renamed from: cc.a  reason: case insensitive filesystem */
public final class C4477a {

    /* renamed from: a  reason: collision with root package name */
    private int f53686a;

    /* renamed from: b  reason: collision with root package name */
    private C4480d.a f53687b = C4480d.a.DEFAULT;

    /* renamed from: cc.a$a  reason: collision with other inner class name */
    private static final class C0815a implements C4480d {

        /* renamed from: b  reason: collision with root package name */
        private final int f53688b;

        /* renamed from: c  reason: collision with root package name */
        private final C4480d.a f53689c;

        C0815a(int i10, C4480d.a aVar) {
            this.f53688b = i10;
            this.f53689c = aVar;
        }

        public Class annotationType() {
            return C4480d.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4480d)) {
                return false;
            }
            C4480d dVar = (C4480d) obj;
            if (this.f53688b != dVar.tag() || !this.f53689c.equals(dVar.intEncoding())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (14552422 ^ this.f53688b) + (this.f53689c.hashCode() ^ 2041407134);
        }

        public C4480d.a intEncoding() {
            return this.f53689c;
        }

        public int tag() {
            return this.f53688b;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f53688b + "intEncoding=" + this.f53689c + ')';
        }
    }

    public static C4477a b() {
        return new C4477a();
    }

    public C4480d a() {
        return new C0815a(this.f53686a, this.f53687b);
    }

    public C4477a c(int i10) {
        this.f53686a = i10;
        return this;
    }
}
