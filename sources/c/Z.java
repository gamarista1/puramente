package C;

import Ef.m;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import k0.c;
import k0.i;

public final class Z implements Y {

    /* renamed from: a  reason: collision with root package name */
    public static final Z f873a = new Z();

    private Z() {
    }

    public i a(i iVar, float f10, boolean z10) {
        if (((double) f10) > 0.0d) {
            return iVar.h(new LayoutWeightElement(m.g(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    public i c(i iVar, c.C0368c cVar) {
        return iVar.h(new VerticalAlignElement(cVar));
    }
}
