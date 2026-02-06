package androidx.compose.foundation;

import B.l;
import k0.i;

public abstract class h {
    public static final i a(i iVar, l lVar, boolean z10) {
        i iVar2;
        if (z10) {
            iVar2 = new HoverableElement(lVar);
        } else {
            iVar2 = i.f23074a;
        }
        return iVar.h(iVar2);
    }

    public static /* synthetic */ i b(i iVar, l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(iVar, lVar, z10);
    }
}
