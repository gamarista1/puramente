package x1;

import android.text.TextUtils;
import java.util.Locale;

public abstract class g {
    public static void a(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int b(int i10, int i11, int i12, String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i12)}));
        } else if (i10 <= i12) {
            return i10;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i12)}));
        }
    }

    public static int c(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    public static int d(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    public static int e(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(i11) + " are allowed");
    }

    public static Object f(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object g(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void h(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static CharSequence i(CharSequence charSequence, Object obj) {
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
}
