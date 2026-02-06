package f3;

import i2.C2076a;
import java.util.Arrays;

final class w {

    /* renamed from: a  reason: collision with root package name */
    private final int f20775a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20776b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20777c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f20778d;

    /* renamed from: e  reason: collision with root package name */
    public int f20779e;

    public w(int i10, int i11) {
        this.f20775a = i10;
        byte[] bArr = new byte[(i11 + 3)];
        this.f20778d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f20776b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f20778d;
            int length = bArr2.length;
            int i13 = this.f20779e;
            if (length < i13 + i12) {
                this.f20778d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f20778d, this.f20779e, i12);
            this.f20779e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f20776b) {
            return false;
        }
        this.f20779e -= i10;
        this.f20776b = false;
        this.f20777c = true;
        return true;
    }

    public boolean c() {
        return this.f20777c;
    }

    public void d() {
        this.f20776b = false;
        this.f20777c = false;
    }

    public void e(int i10) {
        boolean z10 = true;
        C2076a.g(!this.f20776b);
        if (i10 != this.f20775a) {
            z10 = false;
        }
        this.f20776b = z10;
        if (z10) {
            this.f20779e = 3;
            this.f20777c = false;
        }
    }
}
