package Y8;

import W8.c;
import java.util.Arrays;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final c f35760a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f35761b;

    public h(c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f35760a = cVar;
            this.f35761b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public byte[] a() {
        return this.f35761b;
    }

    public c b() {
        return this.f35760a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f35760a.equals(hVar.f35760a)) {
            return false;
        }
        return Arrays.equals(this.f35761b, hVar.f35761b);
    }

    public int hashCode() {
        return ((this.f35760a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f35761b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f35760a + ", bytes=[...]}";
    }
}
