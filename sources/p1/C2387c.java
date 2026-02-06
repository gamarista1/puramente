package p1;

import android.graphics.Color;

/* renamed from: p1.c  reason: case insensitive filesystem */
public abstract class C2387c {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal f25148a = new ThreadLocal();

    public static int a(float[] fArr) {
        int i10;
        int i11;
        int i12;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float abs = (1.0f - Math.abs((f12 * 2.0f) - 1.0f)) * f11;
        float f13 = f12 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f10 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f10) / 60) {
            case 0:
                i12 = Math.round((abs + f13) * 255.0f);
                i11 = Math.round((abs2 + f13) * 255.0f);
                i10 = Math.round(f13 * 255.0f);
                break;
            case 1:
                i12 = Math.round((abs2 + f13) * 255.0f);
                i11 = Math.round((abs + f13) * 255.0f);
                i10 = Math.round(f13 * 255.0f);
                break;
            case 2:
                i12 = Math.round(f13 * 255.0f);
                i11 = Math.round((abs + f13) * 255.0f);
                i10 = Math.round((abs2 + f13) * 255.0f);
                break;
            case 3:
                i12 = Math.round(f13 * 255.0f);
                i11 = Math.round((abs2 + f13) * 255.0f);
                i10 = Math.round((abs + f13) * 255.0f);
                break;
            case 4:
                i12 = Math.round((abs2 + f13) * 255.0f);
                i11 = Math.round(f13 * 255.0f);
                i10 = Math.round((abs + f13) * 255.0f);
                break;
            case 5:
            case 6:
                i12 = Math.round((abs + f13) * 255.0f);
                i11 = Math.round(f13 * 255.0f);
                i10 = Math.round((abs2 + f13) * 255.0f);
                break;
            default:
                i10 = 0;
                i12 = 0;
                i11 = 0;
                break;
        }
        return Color.rgb(n(i12, 0, 255), n(i11, 0, 255), n(i10, 0, 255));
    }

    public static void b(int i10, int i11, int i12, float[] fArr) {
        float f10;
        float f11;
        float f12 = ((float) i10) / 255.0f;
        float f13 = ((float) i11) / 255.0f;
        float f14 = ((float) i12) / 255.0f;
        float max = Math.max(f12, Math.max(f13, f14));
        float min = Math.min(f12, Math.min(f13, f14));
        float f15 = max - min;
        float f16 = (max + min) / 2.0f;
        if (max == min) {
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            if (max == f12) {
                f10 = ((f13 - f14) / f15) % 6.0f;
            } else if (max == f13) {
                f10 = ((f14 - f12) / f15) + 2.0f;
            } else {
                f10 = 4.0f + ((f12 - f13) / f15);
            }
            f11 = f15 / (1.0f - Math.abs((2.0f * f16) - 1.0f));
        }
        float f17 = (f10 * 60.0f) % 360.0f;
        if (f17 < 0.0f) {
            f17 += 360.0f;
        }
        fArr[0] = m(f17, 0.0f, 360.0f);
        fArr[1] = m(f11, 0.0f, 1.0f);
        fArr[2] = m(f16, 0.0f, 1.0f);
    }

    public static void c(int i10, int i11, int i12, double[] dArr) {
        double pow;
        double pow2;
        double d10;
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d11 = ((double) i10) / 255.0d;
            if (d11 < 0.04045d) {
                pow = d11 / 12.92d;
            } else {
                pow = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            }
            double d12 = ((double) i11) / 255.0d;
            if (d12 < 0.04045d) {
                pow2 = d12 / 12.92d;
            } else {
                pow2 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
            }
            double d13 = ((double) i12) / 255.0d;
            if (d13 < 0.04045d) {
                d10 = d13 / 12.92d;
            } else {
                d10 = Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
            }
            dArr2[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * d10)) * 100.0d;
            dArr2[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * d10)) * 100.0d;
            dArr2[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (d10 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int d(double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        double d16 = (((3.2406d * d10) + (-1.5372d * d11)) + (-0.4986d * d12)) / 100.0d;
        double d17 = (((-0.9689d * d10) + (1.8758d * d11)) + (0.0415d * d12)) / 100.0d;
        double d18 = (((0.0557d * d10) + (-0.204d * d11)) + (1.057d * d12)) / 100.0d;
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        if (d17 > 0.0031308d) {
            d14 = (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d14 = d17 * 12.92d;
        }
        if (d18 > 0.0031308d) {
            d15 = (Math.pow(d18, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d15 = d18 * 12.92d;
        }
        return Color.rgb(n((int) Math.round(d13 * 255.0d), 0, 255), n((int) Math.round(d14 * 255.0d), 0, 255), n((int) Math.round(d15 * 255.0d), 0, 255));
    }

    public static int e(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((((float) Color.alpha(i10)) * f11) + (((float) Color.alpha(i11)) * f10)), (int) ((((float) Color.red(i10)) * f11) + (((float) Color.red(i11)) * f10)), (int) ((((float) Color.green(i10)) * f11) + (((float) Color.green(i11)) * f10)), (int) ((((float) Color.blue(i10)) * f11) + (((float) Color.blue(i11)) * f10)));
    }

    public static double f(int i10, int i11) {
        if (Color.alpha(i11) == 255) {
            if (Color.alpha(i10) < 255) {
                i10 = k(i10, i11);
            }
            double g10 = g(i10) + 0.05d;
            double g11 = g(i11) + 0.05d;
            return Math.max(g10, g11) / Math.min(g10, g11);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
    }

    public static double g(int i10) {
        double[] o10 = o();
        i(i10, o10);
        return o10[1] / 100.0d;
    }

    public static void h(int i10, float[] fArr) {
        b(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
    }

    public static void i(int i10, double[] dArr) {
        c(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    private static int j(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / 255);
    }

    public static int k(int i10, int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int j10 = j(alpha2, alpha);
        return Color.argb(j10, l(Color.red(i10), alpha2, Color.red(i11), alpha, j10), l(Color.green(i10), alpha2, Color.green(i11), alpha, j10), l(Color.blue(i10), alpha2, Color.blue(i11), alpha, j10));
    }

    private static int l(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * 255) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * 255);
    }

    private static float m(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return Math.min(f10, f12);
    }

    private static int n(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return Math.min(i10, i12);
    }

    private static double[] o() {
        ThreadLocal threadLocal = f25148a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int p(int i10, int i11) {
        if (i11 >= 0 && i11 <= 255) {
            return (i10 & 16777215) | (i11 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
