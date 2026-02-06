package o4;

import Gh.C5411l;
import Gh.M;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class e {
    public static final void a(C5411l lVar, M m10) {
        if (!lVar.j(m10)) {
            l.d(lVar.o(m10));
        }
    }

    public static final void b(C5411l lVar, M m10) {
        try {
            IOException iOException = null;
            for (M m11 : lVar.k(m10)) {
                try {
                    if (lVar.l(m11).e()) {
                        b(lVar, m11);
                    }
                    lVar.h(m11);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
