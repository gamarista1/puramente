package Yg;

import Xg.C5694f;
import qf.g;
import qf.h;

public interface q extends C5694f {

    public static final class a {
        public static /* synthetic */ C5694f a(q qVar, g gVar, int i10, Wg.a aVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    gVar = h.f72645a;
                }
                if ((i11 & 2) != 0) {
                    i10 = -3;
                }
                if ((i11 & 4) != 0) {
                    aVar = Wg.a.SUSPEND;
                }
                return qVar.a(gVar, i10, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    C5694f a(g gVar, int i10, Wg.a aVar);
}
