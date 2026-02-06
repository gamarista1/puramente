package Gg;

import Fg.u0;
import Gg.f;
import Gg.g;
import kotlin.jvm.internal.C6496s;

/* renamed from: Gg.a  reason: case insensitive filesystem */
public abstract class C5399a {
    public static final u0 a(boolean z10, boolean z11, b bVar, f fVar, g gVar) {
        C6496s.h(bVar, "typeSystemContext");
        C6496s.h(fVar, "kotlinTypePreparator");
        C6496s.h(gVar, "kotlinTypeRefiner");
        return new u0(z10, z11, true, bVar, fVar, gVar);
    }

    public static /* synthetic */ u0 b(boolean z10, boolean z11, b bVar, f fVar, g gVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            bVar = s.f63205a;
        }
        if ((i10 & 8) != 0) {
            fVar = f.a.f63179a;
        }
        if ((i10 & 16) != 0) {
            gVar = g.a.f63180a;
        }
        return a(z10, z11, bVar, fVar, gVar);
    }
}
