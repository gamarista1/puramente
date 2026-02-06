package kh;

import Ff.d;
import gh.C5986j;
import ih.f;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.h0  reason: case insensitive filesystem */
public abstract class C6454h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final f[] f71662a = new f[0];

    public static final Set a(f fVar) {
        C6496s.h(fVar, "<this>");
        if (fVar instanceof C6463m) {
            return ((C6463m) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.d());
        int d10 = fVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            hashSet.add(fVar.e(i10));
        }
        return hashSet;
    }

    public static final f[] b(List list) {
        f[] fVarArr;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            list = null;
        }
        if (list == null || (fVarArr = (f[]) list.toArray(new f[0])) == null) {
            return f71662a;
        }
        return fVarArr;
    }

    public static final String c(d dVar) {
        C6496s.h(dVar, "<this>");
        String w10 = dVar.w();
        if (w10 == null) {
            w10 = "<local class name not available>";
        }
        return d(w10);
    }

    public static final String d(String str) {
        C6496s.h(str, "className");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final Void e(d dVar) {
        C6496s.h(dVar, "<this>");
        throw new C5986j(c(dVar));
    }
}
