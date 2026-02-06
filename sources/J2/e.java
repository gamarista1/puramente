package j2;

import i2.C2076a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f22749a;

    /* renamed from: b  reason: collision with root package name */
    private int f22750b;

    /* renamed from: c  reason: collision with root package name */
    private int f22751c;

    /* renamed from: d  reason: collision with root package name */
    private int f22752d;

    public e(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11);
    }

    private void a() {
        boolean z10;
        int i10;
        int i11 = this.f22751c;
        if (i11 < 0 || (i11 >= (i10 = this.f22750b) && !(i11 == i10 && this.f22752d == 0))) {
            z10 = false;
        } else {
            z10 = true;
        }
        C2076a.g(z10);
    }

    private int f() {
        int i10 = 0;
        int i11 = 0;
        while (!d()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = e(i11);
        }
        return i12 + i10;
    }

    private boolean j(int i10) {
        if (2 <= i10 && i10 < this.f22750b) {
            byte[] bArr = this.f22749a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean b(int i10) {
        int i11 = this.f22751c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f22752d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f22750b) {
                int i15 = this.f22750b;
            } else if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i152 = this.f22750b;
        if (i13 < i152) {
            return true;
        }
        if (i13 == i152 && i14 == 0) {
            return true;
        }
        return false;
    }

    public boolean c() {
        boolean z10;
        int i10 = this.f22751c;
        int i11 = this.f22752d;
        int i12 = 0;
        while (this.f22751c < this.f22750b && !d()) {
            i12++;
        }
        if (this.f22751c == this.f22750b) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22751c = i10;
        this.f22752d = i11;
        if (z10 || !b((i12 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public boolean d() {
        boolean z10;
        if ((this.f22749a[this.f22751c] & (128 >> this.f22752d)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k();
        return z10;
    }

    public int e(int i10) {
        int i11;
        int i12;
        this.f22752d += i10;
        int i13 = 0;
        while (true) {
            i11 = this.f22752d;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f22752d = i14;
            byte[] bArr = this.f22749a;
            int i15 = this.f22751c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!j(i15 + 1)) {
                i12 = 1;
            }
            this.f22751c = i15 + i12;
        }
        byte[] bArr2 = this.f22749a;
        int i16 = this.f22751c;
        int i17 = (-1 >>> (32 - i10)) & (i13 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f22752d = 0;
            if (!j(i16 + 1)) {
                i12 = 1;
            }
            this.f22751c = i16 + i12;
        }
        a();
        return i17;
    }

    public int g() {
        int i10;
        int f10 = f();
        if (f10 % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return i10 * ((f10 + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i10, int i11) {
        this.f22749a = bArr;
        this.f22751c = i10;
        this.f22750b = i11;
        this.f22752d = 0;
        a();
    }

    public void k() {
        int i10 = 1;
        int i11 = this.f22752d + 1;
        this.f22752d = i11;
        if (i11 == 8) {
            this.f22752d = 0;
            int i12 = this.f22751c;
            if (j(i12 + 1)) {
                i10 = 2;
            }
            this.f22751c = i12 + i10;
        }
        a();
    }

    public void l(int i10) {
        int i11 = this.f22751c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f22751c = i13;
        int i14 = this.f22752d + (i10 - (i12 * 8));
        this.f22752d = i14;
        if (i14 > 7) {
            this.f22751c = i13 + 1;
            this.f22752d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f22751c) {
                a();
                return;
            } else if (j(i11)) {
                this.f22751c++;
                i11 += 2;
            }
        }
    }
}
