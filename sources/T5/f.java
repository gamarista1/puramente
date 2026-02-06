package T5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class f extends ArrayList {
    private f(int i10) {
        super(i10);
    }

    public static f a(List list) {
        return new f(list);
    }

    public static f d(Object... objArr) {
        f fVar = new f(objArr.length);
        Collections.addAll(fVar, objArr);
        return fVar;
    }

    private f(List list) {
        super(list);
    }
}
