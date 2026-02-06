package androidx.compose.ui.input.nestedscroll;

import C0.b;
import k0.i;

public abstract class a {
    public static final i a(i iVar, C0.a aVar, b bVar) {
        return iVar.h(new NestedScrollElement(aVar, bVar));
    }

    public static /* synthetic */ i b(i iVar, C0.a aVar, b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        return a(iVar, aVar, bVar);
    }
}
