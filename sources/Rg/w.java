package rg;

import Of.C5484b;
import Of.C5501t;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;

public abstract class w {
    public static final C5484b a(Collection collection) {
        Integer d10;
        C6496s.h(collection, "descriptors");
        collection.isEmpty();
        Iterator it = collection.iterator();
        C5484b bVar = null;
        while (it.hasNext()) {
            C5484b bVar2 = (C5484b) it.next();
            if (bVar == null || ((d10 = C5501t.d(bVar.getVisibility(), bVar2.getVisibility())) != null && d10.intValue() < 0)) {
                bVar = bVar2;
            }
        }
        C6496s.e(bVar);
        return bVar;
    }
}
