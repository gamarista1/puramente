package androidx.compose.ui.platform;

import android.view.MotionEvent;

final class H0 {

    /* renamed from: a  reason: collision with root package name */
    public static final H0 f13528a = new H0();

    private H0() {
    }

    public final boolean a(MotionEvent motionEvent, int i10) {
        float a10 = motionEvent.getRawX(i10);
        if (!Float.isInfinite(a10) && !Float.isNaN(a10)) {
            float a11 = motionEvent.getRawY(i10);
            if (Float.isInfinite(a11) || Float.isNaN(a11)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
