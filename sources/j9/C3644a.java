package j9;

import W8.e;
import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: j9.a  reason: case insensitive filesystem */
public abstract class C3644a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray f44944a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap f44945b;

    static {
        HashMap hashMap = new HashMap();
        f44945b = hashMap;
        hashMap.put(e.DEFAULT, 0);
        f44945b.put(e.VERY_LOW, 1);
        f44945b.put(e.HIGHEST, 2);
        for (e eVar : f44945b.keySet()) {
            f44944a.append(((Integer) f44945b.get(eVar)).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = (Integer) f44945b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i10) {
        e eVar = (e) f44944a.get(i10);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
