package v1;

import android.os.Handler;
import android.os.Looper;

/* renamed from: v1.b  reason: case insensitive filesystem */
abstract class C2747b {
    static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
