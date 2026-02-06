package W0;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import yf.C6798l;

class D extends B {
    public D(InputConnection inputConnection, C6798l lVar) {
        super(inputConnection, lVar);
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        InputConnection c10 = c();
        if (c10 != null) {
            return c10.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
