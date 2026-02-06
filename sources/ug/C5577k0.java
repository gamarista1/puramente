package Ug;

import java.util.concurrent.CancellationException;

/* renamed from: Ug.k0  reason: case insensitive filesystem */
public abstract class C5577k0 {
    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }
}
