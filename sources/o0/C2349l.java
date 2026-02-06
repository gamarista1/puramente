package o0;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import c1.h;
import k0.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.G1;
import r0.a2;
import r0.g2;

/* renamed from: o0.l  reason: case insensitive filesystem */
public abstract class C2349l {
    public static final i a(i iVar, float f10, g2 g2Var, boolean z10, long j10, long j11) {
        float f11 = f10;
        if (h.i(f10, h.j((float) 0)) <= 0 && !z10) {
            return iVar;
        }
        i iVar2 = iVar;
        return iVar.h(new ShadowGraphicsLayerElement(f10, g2Var, z10, j10, j11, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i b(i iVar, float f10, g2 g2Var, boolean z10, long j10, long j11, int i10, Object obj) {
        g2 g2Var2;
        boolean z11;
        long j12;
        long j13;
        if ((i10 & 2) != 0) {
            g2Var2 = a2.a();
        } else {
            g2Var2 = g2Var;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
            float f11 = f10;
            if (h.i(f10, h.j((float) 0)) > 0) {
                z11 = true;
            }
        } else {
            float f12 = f10;
            z11 = z10;
        }
        if ((i10 & 8) != 0) {
            j12 = G1.a();
        } else {
            j12 = j10;
        }
        if ((i10 & 16) != 0) {
            j13 = G1.a();
        } else {
            j13 = j11;
        }
        return a(iVar, f10, g2Var2, z11, j12, j13);
    }
}
