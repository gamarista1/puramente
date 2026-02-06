package la;

import android.opengl.Matrix;
import ja.H;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f46370a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f46371b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final H f46372c = new H();

    /* renamed from: d  reason: collision with root package name */
    private boolean f46373d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
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
        Matrix.setIdentityM(fArr, 0);
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArr2 = (float[]) this.f46372c.j(j10);
        if (fArr2 == null) {
            return false;
        }
        b(this.f46371b, fArr2);
        if (!this.f46373d) {
            a(this.f46370a, this.f46371b);
            this.f46373d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f46370a, 0, this.f46371b, 0);
        return true;
    }

    public void d() {
        this.f46372c.c();
        this.f46373d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f46372c.a(j10, fArr);
    }
}
