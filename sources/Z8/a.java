package Z8;

import Z8.f;
import java.util.Arrays;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable f35953a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f35954b;

    static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable f35955a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f35956b;

        b() {
        }

        public f a() {
            String str = "";
            if (this.f35955a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f35955a, this.f35956b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(Iterable iterable) {
            if (iterable != null) {
                this.f35955a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public f.a c(byte[] bArr) {
            this.f35956b = bArr;
            return this;
        }
    }

    public Iterable b() {
        return this.f35953a;
    }

    public byte[] c() {
        return this.f35954b;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f35953a.equals(fVar.b())) {
            byte[] bArr2 = this.f35954b;
            if (fVar instanceof a) {
                bArr = ((a) fVar).f35954b;
            } else {
                bArr = fVar.c();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f35953a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f35954b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f35953a + ", extras=" + Arrays.toString(this.f35954b) + "}";
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f35953a = iterable;
        this.f35954b = bArr;
    }
}
