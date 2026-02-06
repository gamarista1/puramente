package l0;

import android.support.v4.media.session.c;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.t;

public abstract class f {
    public static final void a(d dVar, SparseArray sparseArray) {
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            AutofillValue a10 = e.a(sparseArray.get(keyAt));
            r rVar = r.f23483a;
            if (rVar.d(a10)) {
                dVar.b().b(keyAt, rVar.i(a10).toString());
            } else if (rVar.b(a10)) {
                throw new t("An operation is not implemented: " + "b/138604541: Add onFill() callback for date");
            } else if (rVar.c(a10)) {
                throw new t("An operation is not implemented: " + "b/138604541: Add onFill() callback for list");
            } else if (rVar.e(a10)) {
                throw new t("An operation is not implemented: " + "b/138604541:  Add onFill() callback for toggle");
            }
        }
    }

    public static final void b(d dVar, ViewStructure viewStructure) {
        int a10 = h.f23482a.a(viewStructure, dVar.b().a().size());
        for (Map.Entry entry : dVar.b().a().entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            c.a(entry.getValue());
            h hVar = h.f23482a;
            ViewStructure b10 = hVar.b(viewStructure, a10);
            if (b10 == null) {
                a10++;
            } else {
                r rVar = r.f23483a;
                AutofillId a11 = rVar.a(viewStructure);
                C6496s.e(a11);
                rVar.g(b10, a11, intValue);
                hVar.d(b10, intValue, dVar.c().getContext().getPackageName(), (String) null, (String) null);
                rVar.h(b10, x.f23486a.a());
                throw null;
            }
        }
    }
}
