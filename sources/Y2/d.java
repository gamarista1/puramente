package y2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

final class d implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f28641a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f28642b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final float[] f28643c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    private final float[] f28644d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    private final Display f28645e;

    /* renamed from: f  reason: collision with root package name */
    private final a[] f28646f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f28647g;

    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f28645e = display;
        this.f28646f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f28642b);
        SensorManager.getOrientation(this.f28642b, this.f28644d);
        return this.f28644d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a a10 : this.f28646f) {
            a10.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f28647g) {
            c.a(this.f28643c, fArr);
            this.f28647g = true;
        }
        float[] fArr2 = this.f28642b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f28642b, 0, this.f28643c, 0);
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
            float[] fArr2 = this.f28642b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f28642b, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f28641a, sensorEvent.values);
        d(this.f28641a, this.f28645e.getRotation());
        float a10 = a(this.f28641a);
        e(this.f28641a);
        c(this.f28641a);
        b(this.f28641a, a10);
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
