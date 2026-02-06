package H0;

import java.util.Map;
import mf.O;
import yf.C6798l;

public interface H extends C1194o {
    static /* synthetic */ G N(H h10, int i10, int i11, Map map, C6798l lVar, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 4) != 0) {
                map = O.i();
            }
            return h10.d1(i10, i11, map, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    G d1(int i10, int i11, Map map, C6798l lVar) {
        return i0(i10, i11, map, (C6798l) null, lVar);
    }

    G i0(int i10, int i11, Map map, C6798l lVar, C6798l lVar2);
}
