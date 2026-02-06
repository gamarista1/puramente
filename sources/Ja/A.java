package ja;

import java.nio.charset.Charset;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f44946a;

    /* renamed from: b  reason: collision with root package name */
    private int f44947b;

    /* renamed from: c  reason: collision with root package name */
    private int f44948c;

    /* renamed from: d  reason: collision with root package name */
    private int f44949d;

    public A() {
        this.f44946a = M.f44986f;
    }

    private void a() {
        boolean z10;
        int i10;
        int i11 = this.f44947b;
        if (i11 < 0 || (i11 >= (i10 = this.f44949d) && !(i11 == i10 && this.f44948c == 0))) {
            z10 = false;
        } else {
            z10 = true;
        }
        C3645a.f(z10);
    }

    public int b() {
        return ((this.f44949d - this.f44947b) * 8) - this.f44948c;
    }

    public void c() {
        if (this.f44948c != 0) {
            this.f44948c = 0;
            this.f44947b++;
            a();
        }
    }

    public int d() {
        boolean z10;
        if (this.f44948c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        return this.f44947b;
    }

    public int e() {
        return (this.f44947b * 8) + this.f44948c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f44948c, i11);
        int i12 = this.f44948c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f44946a;
        int i14 = this.f44947b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - min;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f44946a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f44946a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        r(i11);
        a();
    }

    public boolean g() {
        boolean z10;
        if ((this.f44946a[this.f44947b] & (128 >> this.f44948c)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        q();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f44948c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f44948c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f44948c = i13;
            byte[] bArr = this.f44946a;
            int i14 = this.f44947b;
            this.f44947b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f44946a;
        int i15 = this.f44947b;
        int i16 = (-1 >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f44948c = 0;
            this.f44947b = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f44946a;
            int i13 = this.f44947b;
            int i14 = i13 + 1;
            this.f44947b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f44948c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 != 0) {
            byte b12 = (byte) (bArr[i12] & (255 >> i16));
            bArr[i12] = b12;
            int i17 = this.f44948c;
            if (i17 + i16 > 8) {
                byte[] bArr3 = this.f44946a;
                int i18 = this.f44947b;
                this.f44947b = i18 + 1;
                bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
                this.f44948c = i17 - 8;
            }
            int i19 = this.f44948c + i16;
            this.f44948c = i19;
            byte[] bArr4 = this.f44946a;
            int i20 = this.f44947b;
            bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
            if (i19 == 8) {
                this.f44948c = 0;
                this.f44947b = i20 + 1;
            }
            a();
        }
    }

    public long j(int i10) {
        if (i10 <= 32) {
            return M.X0(h(i10));
        }
        return M.W0(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        boolean z10;
        if (this.f44948c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        System.arraycopy(this.f44946a, this.f44947b, bArr, i10, i11);
        this.f44947b += i11;
        a();
    }

    public String l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void m(B b10) {
        o(b10.d(), b10.f());
        p(b10.e() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i10) {
        this.f44946a = bArr;
        this.f44947b = 0;
        this.f44948c = 0;
        this.f44949d = i10;
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f44947b = i11;
        this.f44948c = i10 - (i11 * 8);
        a();
    }

    public void q() {
        int i10 = this.f44948c + 1;
        this.f44948c = i10;
        if (i10 == 8) {
            this.f44948c = 0;
            this.f44947b++;
        }
        a();
    }

    public void r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f44947b + i11;
        this.f44947b = i12;
        int i13 = this.f44948c + (i10 - (i11 * 8));
        this.f44948c = i13;
        if (i13 > 7) {
            this.f44947b = i12 + 1;
            this.f44948c = i13 - 8;
        }
        a();
    }

    public void s(int i10) {
        boolean z10;
        if (this.f44948c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        this.f44947b += i10;
        a();
    }

    public A(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public A(byte[] bArr, int i10) {
        this.f44946a = bArr;
        this.f44949d = i10;
    }
}
