package androidx.compose.ui.layout;

import H0.C1200v;
import H0.E;
import k0.i;

public abstract class a {
    public static final Object a(E e10) {
        C1200v vVar;
        Object a10 = e10.a();
        if (a10 instanceof C1200v) {
            vVar = (C1200v) a10;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            return vVar.X0();
        }
        return null;
    }

    public static final i b(i iVar, Object obj) {
        return iVar.h(new LayoutIdElement(obj));
    }
}
