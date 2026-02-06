package fd;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: fd.b  reason: case insensitive filesystem */
public final class C4990b {

    /* renamed from: a  reason: collision with root package name */
    private final byte[][] f60533a;

    /* renamed from: b  reason: collision with root package name */
    private final int f60534b;

    /* renamed from: c  reason: collision with root package name */
    private final int f60535c;

    public C4990b(int i10, int i11) {
        int[] iArr = new int[2];
        iArr[1] = i10;
        iArr[0] = i11;
        this.f60533a = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        this.f60534b = i10;
        this.f60535c = i11;
    }

    public void a(byte b10) {
        for (byte[] fill : this.f60533a) {
            Arrays.fill(fill, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f60533a[i11][i10];
    }

    public byte[][] c() {
        return this.f60533a;
    }

    public int d() {
        return this.f60535c;
    }

    public int e() {
        return this.f60534b;
    }

    public void f(int i10, int i11, int i12) {
        this.f60533a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f60533a[i11][i10] = z10 ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f60534b * 2 * this.f60535c) + 2);
        for (int i10 = 0; i10 < this.f60535c; i10++) {
            byte[] bArr = this.f60533a[i10];
            for (int i11 = 0; i11 < this.f60534b; i11++) {
                byte b10 = bArr[i11];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append(10);
        }
        return sb2.toString();
    }
}
