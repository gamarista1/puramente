package C7;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.jvm.internal.C6496s;

public final class f implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f30090a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30091b;

    /* renamed from: c  reason: collision with root package name */
    private float f30092c;

    /* renamed from: d  reason: collision with root package name */
    private float f30093d;

    /* renamed from: e  reason: collision with root package name */
    private float f30094e;

    /* renamed from: f  reason: collision with root package name */
    private SensorManager f30095f;

    /* renamed from: g  reason: collision with root package name */
    private long f30096g;

    /* renamed from: h  reason: collision with root package name */
    private int f30097h;

    /* renamed from: i  reason: collision with root package name */
    private long f30098i;

    public interface a {
        void a();
    }

    public f(a aVar, int i10) {
        C6496s.h(aVar, "shakeListener");
        this.f30090a = aVar;
        this.f30091b = i10;
    }

    private final boolean a(float f10) {
        if (Math.abs(f10) > 13.042845f) {
            return true;
        }
        return false;
    }

    private final void b(long j10) {
        if (this.f30097h >= this.f30091b * 8) {
            d();
            this.f30090a.a();
        }
        if (((float) (j10 - this.f30098i)) > g.f30100b) {
            d();
        }
    }

    private final void c(long j10) {
        this.f30098i = j10;
        this.f30097h++;
    }

    private final void d() {
        this.f30097h = 0;
        this.f30092c = 0.0f;
        this.f30093d = 0.0f;
        this.f30094e = 0.0f;
    }

    public final void e(SensorManager sensorManager) {
        C6496s.h(sensorManager, "manager");
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.f30095f = sensorManager;
            this.f30096g = -1;
            sensorManager.registerListener(this, defaultSensor, 2);
            this.f30098i = 0;
            d();
        }
    }

    public final void f() {
        SensorManager sensorManager = this.f30095f;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.f30095f = null;
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
        C6496s.h(sensor, "sensor");
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        C6496s.h(sensorEvent, "sensorEvent");
        if (sensorEvent.timestamp - this.f30096g >= g.f30099a) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2] - 9.80665f;
            this.f30096g = sensorEvent.timestamp;
            if (a(f10) && this.f30092c * f10 <= 0.0f) {
                c(sensorEvent.timestamp);
                this.f30092c = f10;
            } else if (a(f11) && this.f30093d * f11 <= 0.0f) {
                c(sensorEvent.timestamp);
                this.f30093d = f11;
            } else if (a(f12) && this.f30094e * f12 <= 0.0f) {
                c(sensorEvent.timestamp);
                this.f30094e = f12;
            }
            b(sensorEvent.timestamp);
        }
    }
}
