package p003if;

import java.util.Arrays;

/* renamed from: if.h  reason: invalid package */
public abstract class h {
    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException(str);
    }
}
