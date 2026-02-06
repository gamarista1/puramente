package Sg;

import kotlin.jvm.internal.C6496s;

public abstract class h {
    /* access modifiers changed from: private */
    public static final boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (C6496s.i(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}
