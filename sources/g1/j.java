package g1;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    protected C2007b f20947a;

    /* renamed from: b  reason: collision with root package name */
    protected int[] f20948b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    protected float[] f20949c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    private int f20950d;

    /* renamed from: e  reason: collision with root package name */
    private String f20951e;

    private static class a {
        static void a(int[] iArr, float[] fArr, int i10, int i11) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i11;
            iArr2[1] = i10;
            int i12 = 2;
            while (i12 > 0) {
                int i13 = iArr2[i12 - 1];
                int i14 = i12 - 2;
                int i15 = iArr2[i14];
                if (i13 < i15) {
                    int b10 = b(iArr, fArr, i13, i15);
                    iArr2[i14] = b10 - 1;
                    iArr2[i12 - 1] = i13;
                    int i16 = i12 + 1;
                    iArr2[i12] = i15;
                    i12 += 2;
                    iArr2[i16] = b10 + 1;
                } else {
                    i12 = i14;
                }
            }
        }

        private static int b(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i11];
            int i13 = i10;
            while (i10 < i11) {
                if (iArr[i10] <= i12) {
                    c(iArr, fArr, i13, i10);
                    i13++;
                }
                i10++;
            }
            c(iArr, fArr, i13, i11);
            return i13;
        }

        private static void c(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float f10 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = f10;
        }
    }

    public float a(float f10) {
        return (float) this.f20947a.c((double) f10, 0);
    }

    public void b(int i10, float f10) {
        int[] iArr = this.f20948b;
        if (iArr.length < this.f20950d + 1) {
            this.f20948b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f20949c;
            this.f20949c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f20948b;
        int i11 = this.f20950d;
        iArr2[i11] = i10;
        this.f20949c[i11] = f10;
        this.f20950d = i11 + 1;
    }

    public void c(String str) {
        this.f20951e = str;
    }

    public void d(int i10) {
        int i11 = this.f20950d;
        if (i11 != 0) {
            a.a(this.f20948b, this.f20949c, 0, i11 - 1);
            int i12 = 1;
            for (int i13 = 1; i13 < this.f20950d; i13++) {
                int[] iArr = this.f20948b;
                if (iArr[i13 - 1] != iArr[i13]) {
                    i12++;
                }
            }
            double[] dArr = new double[i12];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i12;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
            int i14 = 0;
            for (int i15 = 0; i15 < this.f20950d; i15++) {
                if (i15 > 0) {
                    int[] iArr3 = this.f20948b;
                    if (iArr3[i15] == iArr3[i15 - 1]) {
                    }
                }
                dArr[i14] = ((double) this.f20948b[i15]) * 0.01d;
                dArr2[i14][0] = (double) this.f20949c[i15];
                i14++;
            }
            this.f20947a = C2007b.a(i10, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.f20951e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f20950d; i10++) {
            str = str + "[" + this.f20948b[i10] + " , " + decimalFormat.format((double) this.f20949c[i10]) + "] ";
        }
        return str;
    }
}
