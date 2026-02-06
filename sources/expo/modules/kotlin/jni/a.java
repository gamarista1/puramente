package expo.modules.kotlin.jni;

import expo.modules.kotlin.jni.JavaScriptObject;
import java.util.Iterator;
import java.util.List;

public abstract class a {
    /* access modifiers changed from: private */
    public static final int b(List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((JavaScriptObject.a) it.next()).b();
        }
        return i10;
    }
}
