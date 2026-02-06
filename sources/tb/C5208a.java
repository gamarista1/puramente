package tb;

import java.util.Arrays;
import sb.g;

/* renamed from: tb.a  reason: case insensitive filesystem */
public final class C5208a {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f61659a;

    private C5208a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f61659a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static C5208a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static C5208a b(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            return new C5208a(bArr, i10, i11);
        }
        throw new NullPointerException("data must be non-null");
    }

    public byte[] c() {
        byte[] bArr = this.f61659a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5208a)) {
            return false;
        }
        return Arrays.equals(((C5208a) obj).f61659a, this.f61659a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f61659a);
    }

    public String toString() {
        return "Bytes(" + g.a(this.f61659a) + ")";
    }
}
