package Gh;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C6496s;

final class V extends C5402c {

    /* renamed from: o  reason: collision with root package name */
    private final Socket f63255o;

    public V(Socket socket) {
        C6496s.h(socket, "socket");
        this.f63255o = socket;
    }

    /* access modifiers changed from: protected */
    public void B() {
        try {
            this.f63255o.close();
        } catch (Exception e10) {
            Logger a10 = I.f63217a;
            Level level = Level.WARNING;
            a10.log(level, "Failed to close timed out socket " + this.f63255o, e10);
        } catch (AssertionError e11) {
            if (H.e(e11)) {
                Logger a11 = I.f63217a;
                Level level2 = Level.WARNING;
                a11.log(level2, "Failed to close timed out socket " + this.f63255o, e11);
                return;
            }
            throw e11;
        }
    }

    /* access modifiers changed from: protected */
    public IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
