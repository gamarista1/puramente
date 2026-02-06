package Wg;

import Ug.C5577k0;
import java.util.concurrent.CancellationException;

abstract /* synthetic */ class l {
    public static final void a(t tVar, Throwable th2) {
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = C5577k0.a("Channel was consumed, consumer had failed", th2);
            }
        }
        tVar.n(cancellationException);
    }
}
