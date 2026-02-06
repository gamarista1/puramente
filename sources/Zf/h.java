package Zf;

import Fg.S;
import Of.C5483a;
import Of.h0;
import Of.t0;
import Rf.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.f;
import vg.C6755e;

public abstract class h {
    public static final List a(Collection collection, Collection collection2, C5483a aVar) {
        S s10;
        Collection collection3 = collection;
        Collection collection4 = collection2;
        C6496s.h(collection3, "newValueParameterTypes");
        C6496s.h(collection4, "oldValueParameters");
        C6496s.h(aVar, "newOwner");
        collection.size();
        collection2.size();
        Iterable n12 = C6565s.n1(collection3, collection4);
        ArrayList arrayList = new ArrayList(C6565s.y(n12, 10));
        Iterator it = n12.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            S s11 = (S) pair.a();
            t0 t0Var = (t0) pair.b();
            int index = t0Var.getIndex();
            Pf.h annotations = t0Var.getAnnotations();
            f name = t0Var.getName();
            C6496s.g(name, "getName(...)");
            boolean A02 = t0Var.A0();
            boolean s02 = t0Var.s0();
            boolean r02 = t0Var.r0();
            if (t0Var.v0() != null) {
                s10 = C6755e.s(aVar).m().k(s11);
            } else {
                s10 = null;
            }
            S s12 = s10;
            h0 i10 = t0Var.i();
            C6496s.g(i10, "getSource(...)");
            Iterator it2 = it;
            V v10 = r3;
            V v11 = new V(aVar, (t0) null, index, annotations, name, s11, A02, s02, r02, s12, i10);
            arrayList.add(v10);
            it = it2;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [yg.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final bg.a0 b(Of.C5487e r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            Of.e r3 = vg.C6755e.x(r3)
            r0 = 0
            if (r3 != 0) goto L_0x000d
            return r0
        L_0x000d:
            yg.k r1 = r3.n0()
            boolean r2 = r1 instanceof bg.a0
            if (r2 == 0) goto L_0x0018
            r0 = r1
            bg.a0 r0 = (bg.a0) r0
        L_0x0018:
            if (r0 != 0) goto L_0x001e
            bg.a0 r0 = b(r3)
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Zf.h.b(Of.e):bg.a0");
    }
}
