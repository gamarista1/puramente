package androidx.compose.ui.draw;

import k0.i;
import o0.C2340c;
import o0.C2341d;
import yf.C6798l;

public abstract class b {
    public static final C2340c a(C6798l lVar) {
        return new a(new C2341d(), lVar);
    }

    public static final i b(i iVar, C6798l lVar) {
        return iVar.h(new DrawBehindElement(lVar));
    }

    public static final i c(i iVar, C6798l lVar) {
        return iVar.h(new DrawWithCacheElement(lVar));
    }

    public static final i d(i iVar, C6798l lVar) {
        return iVar.h(new DrawWithContentElement(lVar));
    }
}
