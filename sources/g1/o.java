package g1;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

public abstract class o {

    /* renamed from: k  reason: collision with root package name */
    protected static float f20980k = 6.2831855f;

    /* renamed from: a  reason: collision with root package name */
    protected C2007b f20981a;

    /* renamed from: b  reason: collision with root package name */
    protected int f20982b = 0;

    /* renamed from: c  reason: collision with root package name */
    protected int[] f20983c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    protected float[][] f20984d;

    /* renamed from: e  reason: collision with root package name */
    protected int f20985e;

    /* renamed from: f  reason: collision with root package name */
    protected String f20986f;

    /* renamed from: g  reason: collision with root package name */
    protected float[] f20987g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f20988h;

    /* renamed from: i  reason: collision with root package name */
    protected long f20989i;

    /* renamed from: j  reason: collision with root package name */
    protected float f20990j;

    protected static class a {
        static void a(int[] iArr, float[][] fArr, int i10, int i11) {
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

        private static int b(int[] iArr, float[][] fArr, int i10, int i11) {
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

        private static void c(int[] iArr, float[][] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float[] fArr2 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = fArr2;
        }
    }

    public o() {
        int[] iArr = new int[2];
        iArr[1] = 3;
        iArr[0] = 10;
        this.f20984d = (float[][]) Array.newInstance(Float.TYPE, iArr);
        this.f20987g = new float[3];
        this.f20988h = false;
        this.f20990j = Float.NaN;
    }

    /* access modifiers changed from: protected */
    public float a(float f10) {
        float abs;
        switch (this.f20982b) {
            case 1:
                return Math.signum(f10 * f20980k);
            case 2:
                abs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f10 * f20980k));
            case 6:
                float abs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f10 * f20980k));
        }
        return 1.0f - abs;
    }

    public void b(int i10, float f10, float f11, int i11, float f12) {
        int[] iArr = this.f20983c;
        int i12 = this.f20985e;
        iArr[i12] = i10;
        float[] fArr = this.f20984d[i12];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        this.f20982b = Math.max(this.f20982b, i11);
        this.f20985e++;
    }

    /* access modifiers changed from: protected */
    public void c(long j10) {
        this.f20989i = j10;
    }

    public void d(String str) {
        this.f20986f = str;
    }

    public void e(int i10) {
        int i11 = this.f20985e;
        if (i11 == 0) {
            System.err.println("Error no points added to " + this.f20986f);
            return;
        }
        a.a(this.f20983c, this.f20984d, 0, i11 - 1);
        int i12 = 1;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f20983c;
            if (i12 >= iArr.length) {
                break;
            }
            if (iArr[i12] != iArr[i12 - 1]) {
                i13++;
            }
            i12++;
        }
        if (i13 == 0) {
            i13 = 1;
        }
        double[] dArr = new double[i13];
        int[] iArr2 = new int[2];
        iArr2[1] = 3;
        iArr2[0] = i13;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        int i14 = 0;
        for (int i15 = 0; i15 < this.f20985e; i15++) {
            if (i15 > 0) {
                int[] iArr3 = this.f20983c;
                if (iArr3[i15] == iArr3[i15 - 1]) {
                }
            }
            dArr[i14] = ((double) this.f20983c[i15]) * 0.01d;
            double[] dArr3 = dArr2[i14];
            float[] fArr = this.f20984d[i15];
            dArr3[0] = (double) fArr[0];
            dArr3[1] = (double) fArr[1];
            dArr3[2] = (double) fArr[2];
            i14++;
        }
        this.f20981a = C2007b.a(i10, dArr, dArr2);
    }

    public String toString() {
        String str = this.f20986f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f20985e; i10++) {
            str = str + "[" + this.f20983c[i10] + " , " + decimalFormat.format(this.f20984d[i10]) + "] ";
        }
        return str;
    }
}
