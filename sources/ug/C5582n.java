package Ug;

import qf.C6658d;
import yf.C6798l;

/* renamed from: Ug.n  reason: case insensitive filesystem */
public interface C5582n extends C6658d {

    /* renamed from: Ug.n$a */
    public static final class a {
        public static /* synthetic */ boolean a(C5582n nVar, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th2 = null;
                }
                return nVar.B(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    boolean B(Throwable th2);

    Object D(Object obj, Object obj2, C6798l lVar);

    void G(G g10, Object obj);

    void L(Object obj);

    boolean a();

    boolean isCancelled();

    boolean o();

    void s(C6798l lVar);

    Object u(Throwable th2);

    void x(Object obj, C6798l lVar);
}
