package r0;

import s0.C2581c;
import s0.C2585g;

public abstract class J1 {
    public static final H1 a(int i10, int i11, int i12, boolean z10, C2581c cVar) {
        return C2465Q.a(i10, i11, i12, z10, cVar);
    }

    public static /* synthetic */ H1 b(int i10, int i11, int i12, boolean z10, C2581c cVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = I1.f25425b.b();
        }
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        if ((i13 & 16) != 0) {
            cVar = C2585g.f25794a.w();
        }
        return a(i10, i11, i12, z10, cVar);
    }
}
