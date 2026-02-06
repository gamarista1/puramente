package mg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lg.C6536a;

/* renamed from: mg.h  reason: case insensitive filesystem */
public abstract class C6580h {
    public static final List a(List list) {
        C6496s.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6536a.e.c cVar = (C6536a.e.c) it.next();
            int F10 = cVar.F();
            for (int i10 = 0; i10 < F10; i10++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
