package A9;

import ja.C3645a;
import java.util.Arrays;

final class u {

    /* renamed from: a  reason: collision with root package name */
    private final int f29762a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29763b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29764c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f29765d;

    /* renamed from: e  reason: collision with root package name */
    public int f29766e;

    public u(int i10, int i11) {
        this.f29762a = i10;
        byte[] bArr = new byte[(i11 + 3)];
        this.f29765d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f29763b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f29765d;
            int length = bArr2.length;
            int i13 = this.f29766e;
            if (length < i13 + i12) {
                this.f29765d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f29765d, this.f29766e, i12);
            this.f29766e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f29763b) {
            return false;
        }
        this.f29766e -= i10;
        this.f29763b = false;
        this.f29764c = true;
        return true;
    }

    public boolean c() {
        return this.f29764c;
    }

    public void d() {
        this.f29763b = false;
        this.f29764c = false;
    }

    public void e(int i10) {
        boolean z10 = true;
        C3645a.f(!this.f29763b);
        if (i10 != this.f29762a) {
            z10 = false;
        }
        this.f29763b = z10;
        if (z10) {
            this.f29766e = 3;
            this.f29764c = false;
        }
    }
}
