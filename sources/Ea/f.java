package Ea;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class f {
    public static List a(Object obj) {
        return Collections.singletonList(obj);
    }

    public static List b(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(objArr));
        }
        return Collections.singletonList(objArr[0]);
    }
}
