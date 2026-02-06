package w5;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.C4049a;

public final class m implements SensorEventListener {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49205b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private b f49206a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a();
    }

    public final void a(b bVar) {
        if (!C4049a.d(this)) {
            try {
                this.f49206a = bVar;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(sensor, "sensor");
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(sensorEvent, "event");
                b bVar = this.f49206a;
                if (bVar != null) {
                    float[] fArr = sensorEvent.values;
                    float f10 = fArr[0];
                    double d10 = (double) (f10 / 9.80665f);
                    double d11 = (double) (fArr[1] / 9.80665f);
                    double d12 = (double) (fArr[2] / 9.80665f);
                    if (Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12)) > 2.3d) {
                        bVar.a();
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}
