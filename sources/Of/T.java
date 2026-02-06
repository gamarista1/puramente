package Of;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import ng.c;

public abstract class T {
    public static final void a(O o10, c cVar, Collection collection) {
        C6496s.h(o10, "<this>");
        C6496s.h(cVar, "fqName");
        C6496s.h(collection, "packageFragments");
        if (o10 instanceof U) {
            ((U) o10).b(cVar, collection);
        } else {
            collection.addAll(o10.a(cVar));
        }
    }

    public static final boolean b(O o10, c cVar) {
        C6496s.h(o10, "<this>");
        C6496s.h(cVar, "fqName");
        if (o10 instanceof U) {
            return ((U) o10).c(cVar);
        }
        return c(o10, cVar).isEmpty();
    }

    public static final List c(O o10, c cVar) {
        C6496s.h(o10, "<this>");
        C6496s.h(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        a(o10, cVar, arrayList);
        return arrayList;
    }
}
