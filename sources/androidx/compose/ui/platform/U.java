package androidx.compose.ui.platform;

import android.os.Looper;

public abstract class U {
    /* access modifiers changed from: private */
    public static final boolean b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
