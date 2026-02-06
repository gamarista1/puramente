package g1;

import java.util.Arrays;

public class h {

    /* renamed from: a  reason: collision with root package name */
    float[] f20937a = new float[0];

    /* renamed from: b  reason: collision with root package name */
    double[] f20938b = new double[0];

    /* renamed from: c  reason: collision with root package name */
    double[] f20939c;

    /* renamed from: d  reason: collision with root package name */
    String f20940d;

    /* renamed from: e  reason: collision with root package name */
    g f20941e;

    /* renamed from: f  reason: collision with root package name */
    int f20942f;

    /* renamed from: g  reason: collision with root package name */
    double f20943g = 6.283185307179586d;

    /* renamed from: h  reason: collision with root package name */
    private boolean f20944h = false;

    public void a(double d10, float f10) {
        int length = this.f20937a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f20938b, d10);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f20938b = Arrays.copyOf(this.f20938b, length);
        this.f20937a = Arrays.copyOf(this.f20937a, length);
        this.f20939c = new double[length];
        double[] dArr = this.f20938b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f20938b[binarySearch] = d10;
        this.f20937a[binarySearch] = f10;
        this.f20944h = false;
    }

    /* access modifiers changed from: package-private */
    public double b(double d10) {
        if (d10 <= 0.0d) {
            return 0.0d;
        }
        if (d10 >= 1.0d) {
            return 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f20938b, d10);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        float[] fArr = this.f20937a;
        float f10 = fArr[binarySearch];
        int i10 = binarySearch - 1;
        float f11 = fArr[i10];
        double d11 = (double) (f10 - f11);
        double[] dArr = this.f20938b;
        double d12 = dArr[binarySearch];
        double d13 = dArr[i10];
        double d14 = d11 / (d12 - d13);
        return this.f20939c[i10] + ((((double) f11) - (d14 * d13)) * (d10 - d13)) + ((d14 * ((d10 * d10) - (d13 * d13))) / 2.0d);
    }

    public double c(double d10, double d11) {
        double abs;
        double b10 = b(d10) + d11;
        switch (this.f20942f) {
            case 1:
                return Math.signum(0.5d - (b10 % 1.0d));
            case 2:
                abs = Math.abs((((b10 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((b10 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((b10 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f20943g * (d11 + b10));
            case 6:
                double abs2 = 1.0d - Math.abs(((b10 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f20941e.c(b10 % 1.0d, 0);
            default:
                return Math.sin(this.f20943g * b10);
        }
        return 1.0d - abs;
    }

    public void d() {
        double d10 = 0.0d;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f20937a;
            if (i10 >= fArr.length) {
                break;
            }
            d10 += (double) fArr[i10];
            i10++;
        }
        double d11 = 0.0d;
        int i11 = 1;
        while (true) {
            float[] fArr2 = this.f20937a;
            if (i11 >= fArr2.length) {
                break;
            }
            int i12 = i11 - 1;
            double[] dArr = this.f20938b;
            d11 += (dArr[i11] - dArr[i12]) * ((double) ((fArr2[i12] + fArr2[i11]) / 2.0f));
            i11++;
        }
        int i13 = 0;
        while (true) {
            float[] fArr3 = this.f20937a;
            if (i13 >= fArr3.length) {
                break;
            }
            fArr3[i13] = fArr3[i13] * ((float) (d10 / d11));
            i13++;
        }
        this.f20939c[0] = 0.0d;
        int i14 = 1;
        while (true) {
            float[] fArr4 = this.f20937a;
            if (i14 < fArr4.length) {
                int i15 = i14 - 1;
                double[] dArr2 = this.f20938b;
                double d12 = dArr2[i14] - dArr2[i15];
                double[] dArr3 = this.f20939c;
                dArr3[i14] = dArr3[i15] + (d12 * ((double) ((fArr4[i15] + fArr4[i14]) / 2.0f)));
                i14++;
            } else {
                this.f20944h = true;
                return;
            }
        }
    }

    public void e(int i10, String str) {
        this.f20942f = i10;
        this.f20940d = str;
        if (str != null) {
            this.f20941e = g.h(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f20938b) + " period=" + Arrays.toString(this.f20937a);
    }
}
