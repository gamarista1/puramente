package androidx.compose.ui.draw;

import H0.C1187h;
import k0.c;
import k0.i;
import r0.C2547y0;
import w0.C2817c;

public abstract class d {
    public static final i a(i iVar, C2817c cVar, boolean z10, c cVar2, C1187h hVar, float f10, C2547y0 y0Var) {
        return iVar.h(new PainterElement(cVar, z10, cVar2, hVar, f10, y0Var));
    }

    public static /* synthetic */ i b(i iVar, C2817c cVar, boolean z10, c cVar2, C1187h hVar, float f10, C2547y0 y0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            cVar2 = c.f23044a.e();
        }
        c cVar3 = cVar2;
        if ((i10 & 8) != 0) {
            hVar = C1187h.f2609a.e();
        }
        C1187h hVar2 = hVar;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            y0Var = null;
        }
        return a(iVar, cVar, z11, cVar3, hVar2, f11, y0Var);
    }
}
