package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class Y {

    /* renamed from: a  reason: collision with root package name */
    private static Map f16032a = Collections.synchronizedMap(new WeakHashMap());

    private static class a {
        static float a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f16032a.containsKey(velocityTracker)) {
                f16032a.put(velocityTracker, new Z());
            }
            ((Z) f16032a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i10) {
        c(velocityTracker, i10, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i10, float f10) {
        velocityTracker.computeCurrentVelocity(i10, f10);
        Z e10 = e(velocityTracker);
        if (e10 != null) {
            e10.c(i10, f10);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        Z e10 = e(velocityTracker);
        if (e10 != null) {
            return e10.d(i10);
        }
        return 0.0f;
    }

    private static Z e(VelocityTracker velocityTracker) {
        return (Z) f16032a.get(velocityTracker);
    }
}
