package androidx.core.view;

import android.view.MotionEvent;

public abstract class C {
    public static boolean a(MotionEvent motionEvent, int i10) {
        if ((motionEvent.getSource() & i10) == i10) {
            return true;
        }
        return false;
    }
}
