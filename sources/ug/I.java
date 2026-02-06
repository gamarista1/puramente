package Ug;

import Zg.C5720i;
import lf.C6523g;
import qf.g;

public abstract class I {
    public static final void a(g gVar, Throwable th2) {
        try {
            H h10 = (H) gVar.b(H.f65314N);
            if (h10 != null) {
                h10.I(gVar, th2);
            } else {
                C5720i.a(gVar, th2);
            }
        } catch (Throwable th3) {
            C5720i.a(gVar, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        C6523g.a(runtimeException, th2);
        return runtimeException;
    }
}
