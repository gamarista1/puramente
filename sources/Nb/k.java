package nb;

import java.util.Arrays;

public abstract class k extends C5111f {
    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
