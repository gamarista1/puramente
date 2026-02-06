package vd;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class z {

    /* renamed from: f  reason: collision with root package name */
    public static final a f62036f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final double f62037a;

    /* renamed from: b  reason: collision with root package name */
    private final double f62038b;

    /* renamed from: c  reason: collision with root package name */
    private final double f62039c;

    /* renamed from: d  reason: collision with root package name */
    private final double f62040d;

    /* renamed from: e  reason: collision with root package name */
    private final double f62041e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pair b(double d10, double d11) {
            double d12;
            double d13;
            double d14;
            if (d10 < 1.0E-9d) {
                d13 = 1.5707963267948966d;
                double d15 = 0.0d;
                if (d11 < 1.0E-9d || Math.abs(d11 - 6.283185307179586d) < 1.0E-9d) {
                    d14 = 1.5707963267948966d;
                } else {
                    d14 = 0.0d;
                }
                double d16 = d11 - 1.5707963267948966d;
                if (Math.abs(d16) < 1.0E-9d) {
                    d15 = 1.5707963267948966d;
                }
                double d17 = d11 - 3.141592653589793d;
                d12 = -1.5707963267948966d;
                if (Math.abs(d17) < 1.0E-9d) {
                    d14 = -1.5707963267948966d;
                }
                double d18 = d11 - 4.71238898038469d;
                if (Math.abs(d18) < 1.0E-9d) {
                    d15 = -1.5707963267948966d;
                }
                if (d11 > 1.0E-9d && Math.abs(d16) < 1.0E-9d) {
                    d15 = 1.5707963267948966d;
                    d14 = 1.5707963267948966d;
                }
                if (Math.abs(d16) > 1.0E-9d && Math.abs(d17) < 1.0E-9d) {
                    d15 = 1.5707963267948966d;
                    d14 = -1.5707963267948966d;
                }
                if (Math.abs(d17) > 1.0E-9d && Math.abs(d18) < 1.0E-9d) {
                    d15 = -1.5707963267948966d;
                    d14 = -1.5707963267948966d;
                }
                if (Math.abs(d18) <= 1.0E-9d || Math.abs(d11 - 6.283185307179586d) >= 1.0E-9d) {
                    d12 = d15;
                    d13 = d14;
                }
            } else {
                double tan = Math.tan(d10);
                d13 = Math.atan(Math.cos(d11) / tan);
                d12 = Math.atan(Math.sin(d11) / tan);
            }
            return new Pair(Double.valueOf(Math.rint(d13 * 57.29577951308232d)), Double.valueOf(Math.rint(d12 * 57.29577951308232d)));
        }

        public final z a(MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            C6496s.h(motionEvent2, "event");
            double axisValue = 1.5707963267948966d - ((double) motionEvent2.getAxisValue(25));
            double pressure = (double) motionEvent2.getPressure(0);
            double orientation = (((double) motionEvent2.getOrientation(0)) + 1.5707963267948966d) % 6.283185307179586d;
            if (!(orientation == 0.0d || Math.signum(orientation) == Math.signum(6.283185307179586d))) {
                orientation += 6.283185307179586d;
            }
            double d10 = orientation;
            Pair b10 = b(axisValue, d10);
            return new z(((Number) b10.c()).doubleValue(), ((Number) b10.d()).doubleValue(), axisValue, d10, pressure);
        }

        private a() {
        }
    }

    public z(double d10, double d11, double d12, double d13, double d14) {
        this.f62037a = d10;
        this.f62038b = d11;
        this.f62039c = d12;
        this.f62040d = d13;
        this.f62041e = d14;
    }

    public final double a() {
        return this.f62041e;
    }

    public final ReadableMap b() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("tiltX", this.f62037a);
        createMap.putDouble("tiltY", this.f62038b);
        createMap.putDouble("altitudeAngle", this.f62039c);
        createMap.putDouble("azimuthAngle", this.f62040d);
        createMap.putDouble("pressure", this.f62041e);
        C6496s.e(createMap);
        return createMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (Double.compare(this.f62037a, zVar.f62037a) == 0 && Double.compare(this.f62038b, zVar.f62038b) == 0 && Double.compare(this.f62039c, zVar.f62039c) == 0 && Double.compare(this.f62040d, zVar.f62040d) == 0 && Double.compare(this.f62041e, zVar.f62041e) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f62037a) * 31) + Double.hashCode(this.f62038b)) * 31) + Double.hashCode(this.f62039c)) * 31) + Double.hashCode(this.f62040d)) * 31) + Double.hashCode(this.f62041e);
    }

    public String toString() {
        double d10 = this.f62037a;
        double d11 = this.f62038b;
        double d12 = this.f62039c;
        double d13 = this.f62040d;
        double d14 = this.f62041e;
        return "StylusData(tiltX=" + d10 + ", tiltY=" + d11 + ", altitudeAngle=" + d12 + ", azimuthAngle=" + d13 + ", pressure=" + d14 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ z(double r12, double r14, double r16, double r18, double r20, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r12
        L_0x0009:
            r0 = r22 & 2
            if (r0 == 0) goto L_0x000f
            r5 = r1
            goto L_0x0010
        L_0x000f:
            r5 = r14
        L_0x0010:
            r0 = r22 & 4
            if (r0 == 0) goto L_0x0016
            r7 = r1
            goto L_0x0018
        L_0x0016:
            r7 = r16
        L_0x0018:
            r0 = r22 & 8
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r1 = r18
        L_0x001f:
            r0 = r22 & 16
            if (r0 == 0) goto L_0x0026
            r9 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x0028
        L_0x0026:
            r9 = r20
        L_0x0028:
            r12 = r11
            r13 = r3
            r15 = r5
            r17 = r7
            r19 = r1
            r21 = r9
            r12.<init>(r13, r15, r17, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.z.<init>(double, double, double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
