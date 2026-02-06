package Y8;

import W8.e;
import Y8.o;
import java.util.Arrays;

final class d extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f35740a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f35741b;

    /* renamed from: c  reason: collision with root package name */
    private final e f35742c;

    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private String f35743a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f35744b;

        /* renamed from: c  reason: collision with root package name */
        private e f35745c;

        b() {
        }

        public o a() {
            String str = "";
            if (this.f35743a == null) {
                str = str + " backendName";
            }
            if (this.f35745c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f35743a, this.f35744b, this.f35745c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public o.a b(String str) {
            if (str != null) {
                this.f35743a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public o.a c(byte[] bArr) {
            this.f35744b = bArr;
            return this;
        }

        public o.a d(e eVar) {
            if (eVar != null) {
                this.f35745c = eVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public String b() {
        return this.f35740a;
    }

    public byte[] c() {
        return this.f35741b;
    }

    public e d() {
        return this.f35742c;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f35740a.equals(oVar.b())) {
            byte[] bArr2 = this.f35741b;
            if (oVar instanceof d) {
                bArr = ((d) oVar).f35741b;
            } else {
                bArr = oVar.c();
            }
            if (Arrays.equals(bArr2, bArr) && this.f35742c.equals(oVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f35740a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f35741b)) * 1000003) ^ this.f35742c.hashCode();
    }

    private d(String str, byte[] bArr, e eVar) {
        this.f35740a = str;
        this.f35741b = bArr;
        this.f35742c = eVar;
    }
}
