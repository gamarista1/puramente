package Sd;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import rh.u;

public abstract class l {
    public static final u a(List list) {
        C6496s.h(list, "<this>");
        u.a aVar = new u.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            aVar.a((String) pair.c(), (String) pair.d());
        }
        return aVar.f();
    }
}
