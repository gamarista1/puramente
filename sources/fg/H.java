package Fg;

import Jg.i;
import Jg.j;
import Jg.m;
import Jg.n;
import java.util.HashSet;
import kotlin.jvm.internal.C6496s;

public abstract class H {
    public static final i a(H0 h02, i iVar) {
        C6496s.h(h02, "<this>");
        C6496s.h(iVar, "inlineClassType");
        return b(h02, iVar, new HashSet());
    }

    private static final i b(H0 h02, i iVar, HashSet hashSet) {
        i iVar2;
        boolean z10;
        i x10;
        m J10 = h02.J(iVar);
        if (!hashSet.add(J10)) {
            return null;
        }
        n B10 = h02.B(J10);
        if (B10 != null) {
            i O10 = h02.O(B10);
            iVar2 = b(h02, O10, hashSet);
            if (iVar2 == null) {
                return null;
            }
            if (h02.j0(h02.J(O10)) || ((O10 instanceof j) && h02.l0((j) O10))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((iVar2 instanceof j) && h02.l0((j) iVar2) && h02.w(iVar) && z10) {
                x10 = h02.x(O10);
            } else if (!h02.w(iVar2) && h02.g0(iVar)) {
                x10 = h02.x(iVar2);
            }
            return x10;
        } else if (!h02.j0(J10)) {
            return iVar;
        } else {
            i b02 = h02.b0(iVar);
            if (b02 == null || (iVar2 = b(h02, b02, hashSet)) == null) {
                return null;
            }
            if (h02.w(iVar)) {
                if (h02.w(iVar2)) {
                    return iVar;
                }
                if (!(iVar2 instanceof j) || !h02.l0((j) iVar2)) {
                    return h02.x(iVar2);
                }
                return iVar;
            }
        }
        return iVar2;
    }
}
