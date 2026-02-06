package W0;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import yf.C6798l;

class B extends A {
    public B(InputConnection inputConnection, C6798l lVar) {
        super(inputConnection, lVar);
    }

    /* access modifiers changed from: protected */
    public final void b(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection c10 = c();
        if (c10 != null) {
            return c10.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    public final Handler getHandler() {
        InputConnection c10 = c();
        if (c10 != null) {
            return c10.getHandler();
        }
        return null;
    }
}
