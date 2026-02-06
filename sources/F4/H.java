package F4;

import A4.a;
import C4.o;
import G4.c;
import H4.k;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H implements N {

    /* renamed from: a  reason: collision with root package name */
    public static final H f30682a = new H();

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30683b = c.a.a("c", "v", "i", "o");

    private H() {
    }

    /* renamed from: b */
    public o a(c cVar, float f10) {
        if (cVar.M() == c.b.BEGIN_ARRAY) {
            cVar.b();
        }
        cVar.f();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z10 = false;
        while (cVar.q()) {
            int T10 = cVar.T(f30683b);
            if (T10 == 0) {
                z10 = cVar.t();
            } else if (T10 == 1) {
                list = s.f(cVar, f10);
            } else if (T10 == 2) {
                list2 = s.f(cVar, f10);
            } else if (T10 != 3) {
                cVar.U();
                cVar.V();
            } else {
                list3 = s.f(cVar, f10);
            }
        }
        cVar.o();
        if (cVar.M() == c.b.END_ARRAY) {
            cVar.n();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new o(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = (PointF) list.get(i10);
                int i11 = i10 - 1;
                arrayList.add(new a(k.a((PointF) list.get(i11), (PointF) list3.get(i11)), k.a(pointF2, (PointF) list2.get(i10)), pointF2));
            }
            if (z10) {
                PointF pointF3 = (PointF) list.get(0);
                int i12 = size - 1;
                arrayList.add(new a(k.a((PointF) list.get(i12), (PointF) list3.get(i12)), k.a(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new o(pointF, z10, arrayList);
        }
    }
}
