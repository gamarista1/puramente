package Wg;

import qf.C6658d;
import yf.C6798l;

public interface u {

    public static final class a {
        public static /* synthetic */ boolean a(u uVar, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th2 = null;
                }
                return uVar.j(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    Object c(Object obj);

    void e(C6798l lVar);

    boolean j(Throwable th2);

    Object k(Object obj, C6658d dVar);

    boolean m();
}
