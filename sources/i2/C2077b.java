package i2;

import android.os.Bundle;
import com.google.common.collect.C4770v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nb.C5112g;

/* renamed from: i2.b  reason: case insensitive filesystem */
public abstract class C2077b {
    public static C4770v a(C5112g gVar, List list) {
        C4770v.a t10 = C4770v.t();
        for (int i10 = 0; i10 < list.size(); i10++) {
            t10.a(gVar.apply((Bundle) C2076a.e((Bundle) list.get(i10))));
        }
        return t10.k();
    }

    public static ArrayList b(Collection collection, C5112g gVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object apply : collection) {
            arrayList.add((Bundle) gVar.apply(apply));
        }
        return arrayList;
    }
}
