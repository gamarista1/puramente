package C;

import Ef.m;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import k0.c;
import k0.i;

/* renamed from: C.k  reason: case insensitive filesystem */
public final class C1093k implements C1092j {

    /* renamed from: a  reason: collision with root package name */
    public static final C1093k f978a = new C1093k();

    private C1093k() {
    }

    public i a(i iVar, float f10, boolean z10) {
        if (((double) f10) > 0.0d) {
            return iVar.h(new LayoutWeightElement(m.g(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    public i b(i iVar, c.b bVar) {
        return iVar.h(new HorizontalAlignElement(bVar));
    }
}
