package i2;

import com.google.common.collect.C4773y;
import com.google.common.primitives.b;
import com.google.common.primitives.i;
import java.nio.charset.Charset;
import java.util.Arrays;
import nb.C5110e;

/* renamed from: i2.A  reason: case insensitive filesystem */
public final class C2073A {

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f22049d = {13, 10};

    /* renamed from: e  reason: collision with root package name */
    private static final char[] f22050e = {10};

    /* renamed from: f  reason: collision with root package name */
    private static final C4773y f22051f = C4773y.N(C5110e.f61083a, C5110e.f61085c, C5110e.f61088f, C5110e.f61086d, C5110e.f61087e);

    /* renamed from: a  reason: collision with root package name */
    private byte[] f22052a;

    /* renamed from: b  reason: collision with root package name */
    private int f22053b;

    /* renamed from: c  reason: collision with root package name */
    private int f22054c;

    public C2073A() {
        this.f22052a = L.f22077f;
    }

    private void W(Charset charset) {
        if (m(charset, f22049d) == 13) {
            m(charset, f22050e);
        }
    }

    private int d(Charset charset) {
        int i10;
        if (charset.equals(C5110e.f61085c) || charset.equals(C5110e.f61083a)) {
            i10 = 1;
        } else if (charset.equals(C5110e.f61088f) || charset.equals(C5110e.f61087e) || charset.equals(C5110e.f61086d)) {
            i10 = 2;
        } else {
            throw new IllegalArgumentException("Unsupported charset: " + charset);
        }
        int i11 = this.f22053b;
        while (true) {
            int i12 = this.f22054c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((charset.equals(C5110e.f61085c) || charset.equals(C5110e.f61083a)) && L.E0(this.f22052a[i11])) {
                return i11;
            }
            if (charset.equals(C5110e.f61088f) || charset.equals(C5110e.f61086d)) {
                byte[] bArr = this.f22052a;
                if (bArr[i11] == 0 && L.E0(bArr[i11 + 1])) {
                    return i11;
                }
            }
            if (charset.equals(C5110e.f61087e)) {
                byte[] bArr2 = this.f22052a;
                if (bArr2[i11 + 1] == 0 && L.E0(bArr2[i11])) {
                    return i11;
                }
            }
            i11 += i10;
        }
    }

    private int i(Charset charset) {
        byte b10;
        char c10;
        int i10 = 1;
        if ((charset.equals(C5110e.f61085c) || charset.equals(C5110e.f61083a)) && a() >= 1) {
            b10 = (byte) b.a((long) i.b(this.f22052a[this.f22053b]));
        } else {
            if ((charset.equals(C5110e.f61088f) || charset.equals(C5110e.f61086d)) && a() >= 2) {
                byte[] bArr = this.f22052a;
                int i11 = this.f22053b;
                c10 = b.c(bArr[i11], bArr[i11 + 1]);
            } else if (!charset.equals(C5110e.f61087e) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.f22052a;
                int i12 = this.f22053b;
                c10 = b.c(bArr2[i12 + 1], bArr2[i12]);
            }
            b10 = (byte) c10;
            i10 = 2;
        }
        return (b.a((long) b10) << 16) + i10;
    }

    private char m(Charset charset, char[] cArr) {
        int i10 = i(charset);
        if (i10 == 0) {
            return 0;
        }
        char c10 = (char) (i10 >> 16);
        if (!b.b(cArr, c10)) {
            return 0;
        }
        this.f22053b += i10 & 65535;
        return c10;
    }

    public long A() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        int i12 = i10 + 2;
        this.f22053b = i12;
        int i13 = i10 + 3;
        this.f22053b = i13;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f22053b = i14;
        int i15 = i10 + 5;
        this.f22053b = i15;
        long j11 = j10 | ((((long) bArr[i13]) & 255) << 32) | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f22053b = i16;
        int i17 = i10 + 7;
        this.f22053b = i17;
        this.f22053b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j11 | ((((long) bArr[i15]) & 255) << 16) | ((((long) bArr[i16]) & 255) << 8);
    }

    public String B() {
        return n(0);
    }

    public String C(int i10) {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int i12 = this.f22053b;
        int i13 = (i12 + i10) - 1;
        if (i13 >= this.f22054c || this.f22052a[i13] != 0) {
            i11 = i10;
        } else {
            i11 = i10 - 1;
        }
        String H10 = L.H(this.f22052a, i12, i11);
        this.f22053b += i10;
        return H10;
    }

    public short D() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        this.f22053b = i10 + 2;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public String E(int i10) {
        return F(i10, C5110e.f61085c);
    }

    public String F(int i10, Charset charset) {
        String str = new String(this.f22052a, this.f22053b, i10, charset);
        this.f22053b += i10;
        return str;
    }

    public int G() {
        return (H() << 21) | (H() << 14) | (H() << 7) | H();
    }

    public int H() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        this.f22053b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int I() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        this.f22053b = i10 + 2;
        byte b10 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f22053b = i10 + 4;
        return b10;
    }

    public long J() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        int i12 = i10 + 2;
        this.f22053b = i12;
        int i13 = i10 + 3;
        this.f22053b = i13;
        this.f22053b = i10 + 4;
        return (((long) bArr[i13]) & 255) | ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8);
    }

    public int K() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        int i12 = i10 + 2;
        this.f22053b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f22053b = i10 + 3;
        return (bArr[i12] & 255) | i13 | ((bArr[i10] & 255) << 16);
    }

    public int L() {
        int q10 = q();
        if (q10 >= 0) {
            return q10;
        }
        throw new IllegalStateException("Top bit not zero: " + q10);
    }

    public long M() {
        long A10 = A();
        if (A10 >= 0) {
            return A10;
        }
        throw new IllegalStateException("Top bit not zero: " + A10);
    }

    public int N() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        this.f22053b = i10 + 2;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public long O() {
        int i10;
        int i11;
        long j10 = (long) this.f22052a[this.f22053b];
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
                byte b10 = this.f22052a[this.f22053b + i10];
                if ((b10 & 192) == 128) {
                    j10 = (j10 << 6) | ((long) (b10 & 63));
                    i10++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
                }
            }
            this.f22053b += i11;
            return j10;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
    }

    public Charset P() {
        if (a() >= 3) {
            byte[] bArr = this.f22052a;
            int i10 = this.f22053b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f22053b = i10 + 3;
                return C5110e.f61085c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f22052a;
        int i11 = this.f22053b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f22053b = i11 + 2;
            return C5110e.f61086d;
        } else if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        } else {
            this.f22053b = i11 + 2;
            return C5110e.f61087e;
        }
    }

    public void Q(int i10) {
        byte[] bArr;
        if (b() < i10) {
            bArr = new byte[i10];
        } else {
            bArr = this.f22052a;
        }
        S(bArr, i10);
    }

    public void R(byte[] bArr) {
        S(bArr, bArr.length);
    }

    public void S(byte[] bArr, int i10) {
        this.f22052a = bArr;
        this.f22054c = i10;
        this.f22053b = 0;
    }

    public void T(int i10) {
        boolean z10;
        if (i10 < 0 || i10 > this.f22052a.length) {
            z10 = false;
        } else {
            z10 = true;
        }
        C2076a.a(z10);
        this.f22054c = i10;
    }

    public void U(int i10) {
        boolean z10;
        if (i10 < 0 || i10 > this.f22054c) {
            z10 = false;
        } else {
            z10 = true;
        }
        C2076a.a(z10);
        this.f22053b = i10;
    }

    public void V(int i10) {
        U(this.f22053b + i10);
    }

    public int a() {
        return this.f22054c - this.f22053b;
    }

    public int b() {
        return this.f22052a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f22052a = Arrays.copyOf(this.f22052a, i10);
        }
    }

    public byte[] e() {
        return this.f22052a;
    }

    public int f() {
        return this.f22053b;
    }

    public int g() {
        return this.f22054c;
    }

    public char h(Charset charset) {
        boolean contains = f22051f.contains(charset);
        C2076a.b(contains, "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f22052a[this.f22053b] & 255;
    }

    public void k(z zVar, int i10) {
        l(zVar.f22164a, 0, i10);
        zVar.p(0);
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f22052a, this.f22053b, bArr, i10, i11);
        this.f22053b += i11;
    }

    public String n(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f22053b;
        while (i10 < this.f22054c && this.f22052a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f22052a;
        int i11 = this.f22053b;
        String H10 = L.H(bArr, i11, i10 - i11);
        this.f22053b = i10;
        if (i10 < this.f22054c) {
            this.f22053b = i10 + 1;
        }
        return H10;
    }

    public double o() {
        return Double.longBitsToDouble(A());
    }

    public float p() {
        return Float.intBitsToFloat(q());
    }

    public int q() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        int i12 = i10 + 2;
        this.f22053b = i12;
        byte b10 = ((bArr[i11] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i13 = i10 + 3;
        this.f22053b = i13;
        this.f22053b = i10 + 4;
        return (bArr[i13] & 255) | b10 | ((bArr[i12] & 255) << 8);
    }

    public int r() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        int i12 = i10 + 2;
        this.f22053b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f22053b = i10 + 3;
        return (bArr[i12] & 255) | i13 | (((bArr[i10] & 255) << 24) >> 8);
    }

    public String s() {
        return t(C5110e.f61085c);
    }

    public String t(Charset charset) {
        boolean contains = f22051f.contains(charset);
        C2076a.b(contains, "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(C5110e.f61083a)) {
            P();
        }
        String F10 = F(d(charset) - this.f22053b, charset);
        if (this.f22053b == this.f22054c) {
            return F10;
        }
        W(charset);
        return F10;
    }

    public int u() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        int i12 = i10 + 2;
        this.f22053b = i12;
        byte b10 = ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
        int i13 = i10 + 3;
        this.f22053b = i13;
        this.f22053b = i10 + 4;
        return ((bArr[i13] & 255) << 24) | b10 | ((bArr[i12] & 255) << 16);
    }

    public long v() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        int i12 = i10 + 2;
        this.f22053b = i12;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f22053b = i13;
        int i14 = i10 + 4;
        this.f22053b = i14;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 16) | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f22053b = i15;
        int i16 = i10 + 6;
        this.f22053b = i16;
        long j12 = j11 | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f22053b = i17;
        this.f22053b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j12 | ((((long) bArr[i16]) & 255) << 48);
    }

    public short w() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        this.f22053b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public long x() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        int i12 = i10 + 2;
        this.f22053b = i12;
        int i13 = i10 + 3;
        this.f22053b = i13;
        this.f22053b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
    }

    public int y() {
        int u10 = u();
        if (u10 >= 0) {
            return u10;
        }
        throw new IllegalStateException("Top bit not zero: " + u10);
    }

    public int z() {
        byte[] bArr = this.f22052a;
        int i10 = this.f22053b;
        int i11 = i10 + 1;
        this.f22053b = i11;
        this.f22053b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public C2073A(int i10) {
        this.f22052a = new byte[i10];
        this.f22054c = i10;
    }

    public C2073A(byte[] bArr) {
        this.f22052a = bArr;
        this.f22054c = bArr.length;
    }

    public C2073A(byte[] bArr, int i10) {
        this.f22052a = bArr;
        this.f22054c = i10;
    }
}
