package J;

import android.view.KeyEvent;

public abstract class T {
    public static final boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
            return false;
        }
        return true;
    }
}
