package g2;

import i2.C2076a;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f21011a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21012b;

    /* renamed from: c  reason: collision with root package name */
    private final float f21013c;

    /* renamed from: d  reason: collision with root package name */
    private final float f21014d;

    /* renamed from: e  reason: collision with root package name */
    private final float f21015e;

    /* renamed from: f  reason: collision with root package name */
    private final int f21016f;

    /* renamed from: g  reason: collision with root package name */
    private final int f21017g;

    /* renamed from: h  reason: collision with root package name */
    private final int f21018h;

    /* renamed from: i  reason: collision with root package name */
    private final short[] f21019i;

    /* renamed from: j  reason: collision with root package name */
    private short[] f21020j;

    /* renamed from: k  reason: collision with root package name */
    private int f21021k;

    /* renamed from: l  reason: collision with root package name */
    private short[] f21022l;

    /* renamed from: m  reason: collision with root package name */
    private int f21023m;

    /* renamed from: n  reason: collision with root package name */
    private short[] f21024n;

    /* renamed from: o  reason: collision with root package name */
    private int f21025o;

    /* renamed from: p  reason: collision with root package name */
    private int f21026p;

    /* renamed from: q  reason: collision with root package name */
    private int f21027q;

    /* renamed from: r  reason: collision with root package name */
    private int f21028r;

    /* renamed from: s  reason: collision with root package name */
    private int f21029s;

    /* renamed from: t  reason: collision with root package name */
    private int f21030t;

    /* renamed from: u  reason: collision with root package name */
    private int f21031u;

    /* renamed from: v  reason: collision with root package name */
    private int f21032v;

    public e(int i10, int i11, float f10, float f11, int i12) {
        this.f21011a = i10;
        this.f21012b = i11;
        this.f21013c = f10;
        this.f21014d = f11;
        this.f21015e = ((float) i10) / ((float) i12);
        this.f21016f = i10 / 400;
        int i13 = i10 / 65;
        this.f21017g = i13;
        int i14 = i13 * 2;
        this.f21018h = i14;
        this.f21019i = new short[i14];
        this.f21020j = new short[(i14 * i11)];
        this.f21022l = new short[(i14 * i11)];
        this.f21024n = new short[(i14 * i11)];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f21023m != i10) {
            int i13 = this.f21011a;
            int i14 = (int) (((float) i13) / f10);
            while (true) {
                if (i14 <= 16384 && i13 <= 16384) {
                    break;
                }
                i14 /= 2;
                i13 /= 2;
            }
            o(i10);
            int i15 = 0;
            while (true) {
                int i16 = this.f21025o;
                boolean z10 = true;
                if (i15 < i16 - 1) {
                    while (true) {
                        i11 = this.f21026p;
                        int i17 = (i11 + 1) * i14;
                        i12 = this.f21027q;
                        if (i17 <= i12 * i13) {
                            break;
                        }
                        this.f21022l = f(this.f21022l, this.f21023m, 1);
                        int i18 = 0;
                        while (true) {
                            int i19 = this.f21012b;
                            if (i18 >= i19) {
                                break;
                            }
                            this.f21022l[(this.f21023m * i19) + i18] = n(this.f21024n, (i19 * i15) + i18, i13, i14);
                            i18++;
                        }
                        this.f21027q++;
                        this.f21023m++;
                    }
                    int i20 = i11 + 1;
                    this.f21026p = i20;
                    if (i20 == i13) {
                        this.f21026p = 0;
                        if (i12 != i14) {
                            z10 = false;
                        }
                        C2076a.g(z10);
                        this.f21027q = 0;
                    }
                    i15++;
                } else {
                    u(i16 - 1);
                    return;
                }
            }
        }
    }

    private void b(float f10) {
        int m10;
        int i10 = this.f21021k;
        if (i10 >= this.f21018h) {
            int i11 = 0;
            do {
                if (this.f21028r > 0) {
                    m10 = c(i11);
                } else {
                    int g10 = g(this.f21020j, i11);
                    if (((double) f10) > 1.0d) {
                        m10 = g10 + w(this.f21020j, i11, f10, g10);
                    } else {
                        m10 = m(this.f21020j, i11, f10, g10);
                    }
                }
                i11 += m10;
            } while (this.f21018h + i11 <= i10);
            v(i11);
        }
    }

    private int c(int i10) {
        int min = Math.min(this.f21018h, this.f21028r);
        d(this.f21020j, i10, min);
        this.f21028r -= min;
        return min;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f21022l, this.f21023m, i11);
        this.f21022l = f10;
        int i12 = this.f21012b;
        System.arraycopy(sArr, i10 * i12, f10, this.f21023m * i12, i12 * i11);
        this.f21023m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f21018h / i11;
        int i13 = this.f21012b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f21019i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f21012b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = this.f21011a;
        if (i14 > 4000) {
            i11 = i14 / 4000;
        } else {
            i11 = 1;
        }
        if (this.f21012b == 1 && i11 == 1) {
            i12 = h(sArr, i10, this.f21016f, this.f21017g);
        } else {
            e(sArr, i10, i11);
            int h10 = h(this.f21019i, 0, this.f21016f / i11, this.f21017g / i11);
            if (i11 != 1) {
                int i15 = h10 * i11;
                int i16 = i11 * 4;
                int i17 = i15 - i16;
                int i18 = i15 + i16;
                int i19 = this.f21016f;
                if (i17 < i19) {
                    i17 = i19;
                }
                int i20 = this.f21017g;
                if (i18 > i20) {
                    i18 = i20;
                }
                if (this.f21012b == 1) {
                    i12 = h(sArr, i10, i17, i18);
                } else {
                    e(sArr, i10, 1);
                    i12 = h(this.f21019i, 0, i17, i18);
                }
            } else {
                i12 = h10;
            }
        }
        if (q(this.f21031u, this.f21032v)) {
            i13 = this.f21029s;
        } else {
            i13 = i12;
        }
        this.f21030t = this.f21031u;
        this.f21029s = i12;
        return i13;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f21012b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f21031u = i15 / i16;
        this.f21032v = i17 / i14;
        return i16;
    }

    private int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((((float) i11) * f10) / (1.0f - f10));
        } else {
            this.f21028r = (int) ((((float) i11) * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] f11 = f(this.f21022l, this.f21023m, i13);
        this.f21022l = f11;
        int i14 = this.f21012b;
        System.arraycopy(sArr, i10 * i14, f11, this.f21023m * i14, i14 * i11);
        p(i12, this.f21012b, this.f21022l, this.f21023m + i11, sArr, i10 + i11, sArr, i10);
        this.f21023m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f21012b];
        int i13 = this.f21027q * i11;
        int i14 = this.f21026p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    private void o(int i10) {
        int i11 = this.f21023m - i10;
        short[] f10 = f(this.f21024n, this.f21025o, i11);
        this.f21024n = f10;
        short[] sArr = this.f21022l;
        int i12 = this.f21012b;
        System.arraycopy(sArr, i10 * i12, f10, this.f21025o * i12, i12 * i11);
        this.f21023m = i10;
        this.f21025o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        if (i10 == 0 || this.f21029s == 0 || i11 > i10 * 3 || i10 * 2 <= this.f21030t * 3) {
            return false;
        }
        return true;
    }

    private void r() {
        int i10 = this.f21023m;
        float f10 = this.f21013c;
        float f11 = this.f21014d;
        float f12 = f10 / f11;
        float f13 = this.f21015e * f11;
        double d10 = (double) f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f21020j, 0, this.f21021k);
            this.f21021k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    private void u(int i10) {
        if (i10 != 0) {
            short[] sArr = this.f21024n;
            int i11 = this.f21012b;
            System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f21025o - i10) * i11);
            this.f21025o -= i10;
        }
    }

    private void v(int i10) {
        int i11 = this.f21021k - i10;
        short[] sArr = this.f21020j;
        int i12 = this.f21012b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f21021k = i11;
    }

    private int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (((float) i11) / (f10 - 1.0f));
        } else {
            this.f21028r = (int) ((((float) i11) * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] f11 = f(this.f21022l, this.f21023m, i12);
        this.f21022l = f11;
        p(i12, this.f21012b, f11, this.f21023m, sArr, i10, sArr, i10 + i11);
        this.f21023m += i12;
        return i12;
    }

    public void i() {
        this.f21021k = 0;
        this.f21023m = 0;
        this.f21025o = 0;
        this.f21026p = 0;
        this.f21027q = 0;
        this.f21028r = 0;
        this.f21029s = 0;
        this.f21030t = 0;
        this.f21031u = 0;
        this.f21032v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f21012b, this.f21023m);
        shortBuffer.put(this.f21022l, 0, this.f21012b * min);
        int i10 = this.f21023m - min;
        this.f21023m = i10;
        short[] sArr = this.f21022l;
        int i11 = this.f21012b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f21023m * this.f21012b * 2;
    }

    public int l() {
        return this.f21021k * this.f21012b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f21021k;
        float f10 = this.f21013c;
        float f11 = this.f21014d;
        int i12 = this.f21023m + ((int) ((((((float) i11) / (f10 / f11)) + ((float) this.f21025o)) / (this.f21015e * f11)) + 0.5f));
        this.f21020j = f(this.f21020j, i11, (this.f21018h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f21018h;
            int i14 = this.f21012b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f21020j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f21021k += i10 * 2;
        r();
        if (this.f21023m > i12) {
            this.f21023m = i12;
        }
        this.f21021k = 0;
        this.f21028r = 0;
        this.f21025o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f21012b;
        int i11 = remaining / i10;
        short[] f10 = f(this.f21020j, this.f21021k, i11);
        this.f21020j = f10;
        shortBuffer.get(f10, this.f21021k * this.f21012b, ((i10 * i11) * 2) / 2);
        this.f21021k += i11;
        r();
    }
}
