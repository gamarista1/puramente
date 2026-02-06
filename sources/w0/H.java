package W0;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import yf.C6798l;

public abstract class H {
    public static final C1457z a(InputConnection inputConnection, C6798l lVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new G(inputConnection, lVar);
        }
        if (i10 >= 25) {
            return new D(inputConnection, lVar);
        }
        return new B(inputConnection, lVar);
    }
}
