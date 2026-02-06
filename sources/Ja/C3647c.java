package ja;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.collect.C4770v;
import java.util.List;
import k9.C3700i;

/* renamed from: ja.c  reason: case insensitive filesystem */
public abstract class C3647c {
    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) M.j(C3647c.class.getClassLoader()));
        }
    }

    public static C4770v b(C3700i.a aVar, List list) {
        C4770v.a t10 = C4770v.t();
        for (int i10 = 0; i10 < list.size(); i10++) {
            t10.a(aVar.a((Bundle) C3645a.e((Bundle) list.get(i10))));
        }
        return t10.k();
    }

    public static SparseArray c(C3700i.a aVar, SparseArray sparseArray) {
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), aVar.a((Bundle) sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }
}
