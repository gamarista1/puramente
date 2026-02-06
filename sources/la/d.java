package la;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

final class d implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f46374a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f46375b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final float[] f46376c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    private final float[] f46377d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    private final Display f46378e;

    /* renamed from: f  reason: collision with root package name */
    private final a[] f46379f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f46380g;

    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f46378e = display;
        this.f46379f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f46375b);
        SensorManager.getOrientation(this.f46375b, this.f46377d);
        return this.f46377d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a a10 : this.f46379f) {
            a10.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f46380g) {
            c.a(this.f46376c, fArr);
            this.f46380g = true;
        }
        float[] fArr2 = this.f46375b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f46375b, 0, this.f46376c, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else if (i10 == 3) {
                i11 = 130;
            } else {
                throw new IllegalStateException();
            }
            float[] fArr2 = this.f46375b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f46375b, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f46374a, sensorEvent.values);
        d(this.f46374a, this.f46378e.getRotation());
        float a10 = a(this.f46374a);
        e(this.f46374a);
        c(this.f46374a);
        b(this.f46374a, a10);
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
