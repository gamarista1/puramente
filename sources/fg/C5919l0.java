package fg;

import Fg.H0;
import Jg.i;
import Xf.I;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.Y;
import ng.c;

/* renamed from: fg.l0  reason: case insensitive filesystem */
public abstract class C5919l0 {
    public static final C5910h a(C5910h hVar, Collection collection, boolean z10, boolean z11, boolean z12) {
        C5916k kVar;
        boolean z13;
        C6496s.h(hVar, "<this>");
        C6496s.h(collection, "superQualifiers");
        Iterable<C5910h> iterable = collection;
        ArrayList arrayList = new ArrayList();
        for (C5910h b10 : iterable) {
            C5916k b11 = b(b10);
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        C5916k d10 = d(C6565s.j1(arrayList), b(hVar), z10);
        if (d10 == null) {
            ArrayList arrayList2 = new ArrayList();
            for (C5910h f10 : iterable) {
                C5916k f11 = f10.f();
                if (f11 != null) {
                    arrayList2.add(f11);
                }
            }
            kVar = d(C6565s.j1(arrayList2), hVar.f(), z10);
        } else {
            kVar = d10;
        }
        ArrayList arrayList3 = new ArrayList();
        for (C5910h e10 : iterable) {
            C5912i e11 = e10.e();
            if (e11 != null) {
                arrayList3.add(e11);
            }
        }
        C5912i iVar = (C5912i) e(C6565s.j1(arrayList3), C5912i.MUTABLE, C5912i.READ_ONLY, hVar.e(), z10);
        C5916k kVar2 = null;
        if (kVar != null && !z12 && (!z11 || kVar != C5916k.NULLABLE)) {
            kVar2 = kVar;
        }
        boolean z14 = false;
        if (kVar2 == C5916k.NOT_NULL) {
            if (hVar.d()) {
                z13 = true;
            } else if (!((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C5910h) it.next()).d()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z13 = true;
            if (!(kVar2 == null || d10 == kVar)) {
                z14 = true;
            }
            return new C5910h(kVar2, iVar, z13, z14);
        }
        z13 = false;
        z14 = true;
        return new C5910h(kVar2, iVar, z13, z14);
    }

    private static final C5916k b(C5910h hVar) {
        if (hVar.g()) {
            return null;
        }
        return hVar.f();
    }

    public static final boolean c(H0 h02, i iVar) {
        C6496s.h(h02, "<this>");
        C6496s.h(iVar, "type");
        c cVar = I.f66283v;
        C6496s.g(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return h02.B0(iVar, cVar);
    }

    private static final C5916k d(Set set, C5916k kVar, boolean z10) {
        C5916k kVar2 = C5916k.FORCE_FLEXIBILITY;
        if (kVar == kVar2) {
            return kVar2;
        }
        return (C5916k) e(set, C5916k.NOT_NULL, C5916k.NULLABLE, kVar, z10);
    }

    private static final Object e(Set set, Object obj, Object obj2, Object obj3, boolean z10) {
        Set j12;
        Object obj4;
        if (z10) {
            if (set.contains(obj)) {
                obj4 = obj;
            } else if (set.contains(obj2)) {
                obj4 = obj2;
            } else {
                obj4 = null;
            }
            if (C6496s.c(obj4, obj) && C6496s.c(obj3, obj2)) {
                return null;
            }
            if (obj3 == null) {
                return obj4;
            }
            return obj3;
        }
        if (!(obj3 == null || (j12 = C6565s.j1(Y.o(set, obj3))) == null)) {
            set = j12;
        }
        return C6565s.Q0(set);
    }
}
