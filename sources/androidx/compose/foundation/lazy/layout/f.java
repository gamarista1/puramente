package androidx.compose.foundation.lazy.layout;

import E.F;
import Y.C1500m;
import Y.C1506p;
import k0.i;
import yf.C6787a;
import z.q;

public abstract class f {
    public static final float a(int i10, int i11, boolean z10) {
        if (z10) {
            return b(i10, i11) + ((float) 100);
        }
        return b(i10, i11);
    }

    public static final float b(int i10, int i11) {
        return (float) (i11 + (i10 * 500));
    }

    public static final i c(i iVar, C6787a aVar, F f10, q qVar, boolean z10, boolean z11, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        i h10 = iVar.h(new LazyLayoutSemanticsModifier(aVar, f10, qVar, z10, z11));
        if (C1506p.H()) {
            C1506p.P();
        }
        return h10;
    }
}
