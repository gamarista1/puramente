package ja;

import java.nio.charset.Charset;
import java.util.Arrays;
import nb.C5110e;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f44950a;

    /* renamed from: b  reason: collision with root package name */
    private int f44951b;

    /* renamed from: c  reason: collision with root package name */
    private int f44952c;

    public B() {
        this.f44950a = M.f44986f;
    }

    public String A(int i10) {
        return B(i10, C5110e.f61085c);
    }

    public String B(int i10, Charset charset) {
        String str = new String(this.f44950a, this.f44951b, i10, charset);
        this.f44951b += i10;
        return str;
    }

    public int C() {
        return (D() << 21) | (D() << 14) | (D() << 7) | D();
    }

    public int D() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        this.f44951b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int E() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        this.f44951b = i10 + 2;
        byte b10 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f44951b = i10 + 4;
        return b10;
    }

    public long F() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        int i12 = i10 + 2;
        this.f44951b = i12;
        int i13 = i10 + 3;
        this.f44951b = i13;
        this.f44951b = i10 + 4;
        return (((long) bArr[i13]) & 255) | ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8);
    }

    public int G() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        int i12 = i10 + 2;
        this.f44951b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f44951b = i10 + 3;
        return (bArr[i12] & 255) | i13 | ((bArr[i10] & 255) << 16);
    }

    public int H() {
        int n10 = n();
        if (n10 >= 0) {
            return n10;
        }
        throw new IllegalStateException("Top bit not zero: " + n10);
    }

    public long I() {
        long w10 = w();
        if (w10 >= 0) {
            return w10;
        }
        throw new IllegalStateException("Top bit not zero: " + w10);
    }

    public int J() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        this.f44951b = i10 + 2;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public long K() {
        int i10;
        int i11;
        long j10 = (long) this.f44950a[this.f44951b];
        int i12 = 7;
        while (true) {
            i10 = 1;
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            while (i10 < i11) {
                byte b10 = this.f44950a[this.f44951b + i10];
                if ((b10 & 192) == 128) {
                    j10 = (j10 << 6) | ((long) (b10 & 63));
                    i10++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
                }
            }
            this.f44951b += i11;
            return j10;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
    }

    public void L(int i10) {
        byte[] bArr;
        if (b() < i10) {
            bArr = new byte[i10];
        } else {
            bArr = this.f44950a;
        }
        N(bArr, i10);
    }

    public void M(byte[] bArr) {
        N(bArr, bArr.length);
    }

    public void N(byte[] bArr, int i10) {
        this.f44950a = bArr;
        this.f44952c = i10;
        this.f44951b = 0;
    }

    public void O(int i10) {
        boolean z10;
        if (i10 < 0 || i10 > this.f44950a.length) {
            z10 = false;
        } else {
            z10 = true;
        }
        C3645a.a(z10);
        this.f44952c = i10;
    }

    public void P(int i10) {
        boolean z10;
        if (i10 < 0 || i10 > this.f44952c) {
            z10 = false;
        } else {
            z10 = true;
        }
        C3645a.a(z10);
        this.f44951b = i10;
    }

    public void Q(int i10) {
        P(this.f44951b + i10);
    }

    public int a() {
        return this.f44952c - this.f44951b;
    }

    public int b() {
        return this.f44950a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f44950a = Arrays.copyOf(this.f44950a, i10);
        }
    }

    public byte[] d() {
        return this.f44950a;
    }

    public int e() {
        return this.f44951b;
    }

    public int f() {
        return this.f44952c;
    }

    public char g() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int h() {
        return this.f44950a[this.f44951b] & 255;
    }

    public void i(A a10, int i10) {
        j(a10.f44946a, 0, i10);
        a10.p(0);
    }

    public void j(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f44950a, this.f44951b, bArr, i10, i11);
        this.f44951b += i11;
    }

    public String k(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f44951b;
        while (i10 < this.f44952c && this.f44950a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f44950a;
        int i11 = this.f44951b;
        String E10 = M.E(bArr, i11, i10 - i11);
        this.f44951b = i10;
        if (i10 < this.f44952c) {
            this.f44951b = i10 + 1;
        }
        return E10;
    }

    public double l() {
        return Double.longBitsToDouble(w());
    }

    public float m() {
        return Float.intBitsToFloat(n());
    }

    public int n() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        int i12 = i10 + 2;
        this.f44951b = i12;
        byte b10 = ((bArr[i11] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i13 = i10 + 3;
        this.f44951b = i13;
        this.f44951b = i10 + 4;
        return (bArr[i13] & 255) | b10 | ((bArr[i12] & 255) << 8);
    }

    public int o() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        int i12 = i10 + 2;
        this.f44951b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f44951b = i10 + 3;
        return (bArr[i12] & 255) | i13 | (((bArr[i10] & 255) << 24) >> 8);
    }

    public String p() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f44951b;
        while (i10 < this.f44952c && !M.w0(this.f44950a[i10])) {
            i10++;
        }
        int i11 = this.f44951b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f44950a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f44951b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f44950a;
        int i12 = this.f44951b;
        String E10 = M.E(bArr2, i12, i10 - i12);
        this.f44951b = i10;
        int i13 = this.f44952c;
        if (i10 == i13) {
            return E10;
        }
        byte[] bArr3 = this.f44950a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f44951b = i14;
            if (i14 == i13) {
                return E10;
            }
        }
        int i15 = this.f44951b;
        if (bArr3[i15] == 10) {
            this.f44951b = i15 + 1;
        }
        return E10;
    }

    public int q() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        int i12 = i10 + 2;
        this.f44951b = i12;
        byte b10 = ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
        int i13 = i10 + 3;
        this.f44951b = i13;
        this.f44951b = i10 + 4;
        return ((bArr[i13] & 255) << 24) | b10 | ((bArr[i12] & 255) << 16);
    }

    public long r() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        int i12 = i10 + 2;
        this.f44951b = i12;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f44951b = i13;
        int i14 = i10 + 4;
        this.f44951b = i14;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 16) | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f44951b = i15;
        int i16 = i10 + 6;
        this.f44951b = i16;
        long j12 = j11 | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f44951b = i17;
        this.f44951b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j12 | ((((long) bArr[i16]) & 255) << 48);
    }

    public short s() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        this.f44951b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public long t() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        int i12 = i10 + 2;
        this.f44951b = i12;
        int i13 = i10 + 3;
        this.f44951b = i13;
        this.f44951b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
    }

    public int u() {
        int q10 = q();
        if (q10 >= 0) {
            return q10;
        }
        throw new IllegalStateException("Top bit not zero: " + q10);
    }

    public int v() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        this.f44951b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public long w() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        int i12 = i10 + 2;
        this.f44951b = i12;
        int i13 = i10 + 3;
        this.f44951b = i13;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f44951b = i14;
        int i15 = i10 + 5;
        this.f44951b = i15;
        long j11 = j10 | ((((long) bArr[i13]) & 255) << 32) | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f44951b = i16;
        int i17 = i10 + 7;
        this.f44951b = i17;
        this.f44951b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j11 | ((((long) bArr[i15]) & 255) << 16) | ((((long) bArr[i16]) & 255) << 8);
    }

    public String x() {
        return k(0);
    }

    public String y(int i10) {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int i12 = this.f44951b;
        int i13 = (i12 + i10) - 1;
        if (i13 >= this.f44952c || this.f44950a[i13] != 0) {
            i11 = i10;
        } else {
            i11 = i10 - 1;
        }
        String E10 = M.E(this.f44950a, i12, i11);
        this.f44951b += i10;
        return E10;
    }

    public short z() {
        byte[] bArr = this.f44950a;
        int i10 = this.f44951b;
        int i11 = i10 + 1;
        this.f44951b = i11;
        this.f44951b = i10 + 2;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public B(int i10) {
        this.f44950a = new byte[i10];
        this.f44952c = i10;
    }

    public B(byte[] bArr) {
        this.f44950a = bArr;
        this.f44952c = bArr.length;
    }

    public B(byte[] bArr, int i10) {
        this.f44950a = bArr;
        this.f44952c = i10;
    }
}
