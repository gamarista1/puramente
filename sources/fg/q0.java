package Fg;

import Of.C5495m;
import Pf.h;

public interface q0 {

    public static final class a {
        public static /* synthetic */ r0 a(q0 q0Var, h hVar, v0 v0Var, C5495m mVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    v0Var = null;
                }
                if ((i10 & 4) != 0) {
                    mVar = null;
                }
                return q0Var.a(hVar, v0Var, mVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
        }
    }

    r0 a(h hVar, v0 v0Var, C5495m mVar);
}
