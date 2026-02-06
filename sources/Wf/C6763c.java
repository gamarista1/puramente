package wf;

import java.io.Closeable;
import lf.C6523g;

/* renamed from: wf.c  reason: case insensitive filesystem */
public abstract class C6763c {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable == null) {
            return;
        }
        if (th2 == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th3) {
            C6523g.a(th2, th3);
        }
    }
}
