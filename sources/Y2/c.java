package y2;

import android.opengl.Matrix;
import i2.C2086k;
import i2.F;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f28637a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f28638b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final F f28639c = new F();

    /* renamed from: d  reason: collision with root package name */
    private boolean f28640d;

    public static void a(float[] fArr, float[] fArr2) {
        C2086k.k(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
        float f12 = fArr2[10];
        fArr[0] = f12 / sqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12 / sqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees((double) length), f10 / length, f11 / length, f12 / length);
            return;
        }
        C2086k.k(fArr);
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArr2 = (float[]) this.f28639c.j(j10);
        if (fArr2 == null) {
            return false;
        }
        b(this.f28638b, fArr2);
        if (!this.f28640d) {
            a(this.f28637a, this.f28638b);
            this.f28640d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f28637a, 0, this.f28638b, 0);
        return true;
    }

    public void d() {
        this.f28639c.c();
        this.f28640d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f28639c.a(j10, fArr);
    }
}
