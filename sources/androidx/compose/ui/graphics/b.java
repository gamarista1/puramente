package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.C1676z0;
import k0.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.G1;
import r0.a2;
import r0.b2;
import r0.g2;
import yf.C6798l;

public abstract class b {
    public static final i a(i iVar, C6798l lVar) {
        return iVar.h(new BlockGraphicsLayerElement(lVar));
    }

    public static final i b(i iVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g2 g2Var, boolean z10, b2 b2Var, long j11, long j12, int i10) {
        GraphicsLayerElement graphicsLayerElement = r0;
        GraphicsLayerElement graphicsLayerElement2 = new GraphicsLayerElement(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, g2Var, z10, b2Var, j11, j12, i10, (DefaultConstructorMarker) null);
        return iVar.h(graphicsLayerElement);
    }

    public static /* synthetic */ i c(i iVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g2 g2Var, boolean z10, b2 b2Var, long j11, long j12, int i10, int i11, Object obj) {
        int i12 = i11;
        float f20 = 1.0f;
        float f21 = (i12 & 1) != 0 ? 1.0f : f10;
        float f22 = (i12 & 2) != 0 ? 1.0f : f11;
        if ((i12 & 4) == 0) {
            f20 = f12;
        }
        float f23 = 0.0f;
        float f24 = (i12 & 8) != 0 ? 0.0f : f13;
        float f25 = (i12 & 16) != 0 ? 0.0f : f14;
        float f26 = (i12 & 32) != 0 ? 0.0f : f15;
        float f27 = (i12 & 64) != 0 ? 0.0f : f16;
        float f28 = (i12 & 128) != 0 ? 0.0f : f17;
        if ((i12 & 256) == 0) {
            f23 = f18;
        }
        return b(iVar, f21, f22, f20, f24, f25, f26, f27, f28, f23, (i12 & 512) != 0 ? 8.0f : f19, (i12 & 1024) != 0 ? f.f13431b.a() : j10, (i12 & 2048) != 0 ? a2.a() : g2Var, (i12 & 4096) != 0 ? false : z10, (i12 & 8192) != 0 ? null : b2Var, (i12 & 16384) != 0 ? G1.a() : j11, (i12 & 32768) != 0 ? G1.a() : j12, (i12 & 65536) != 0 ? a.f13386a.a() : i10);
    }

    public static final i d(i iVar) {
        if (!C1676z0.b()) {
            return iVar;
        }
        return iVar.h(c(i.f23074a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (g2) null, false, (b2) null, 0, 0, 0, 131071, (Object) null));
    }
}
