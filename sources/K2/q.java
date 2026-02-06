package k2;

import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import nb.C5108c;

public class q extends g {

    /* renamed from: b  reason: collision with root package name */
    public final j f23259b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23260c;

    public q(j jVar, int i10, int i11) {
        super(b(i10, i11));
        this.f23259b = jVar;
        this.f23260c = i11;
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static q c(IOException iOException, j jVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = ErrorCodes.PROTOCOL_EXCEPTION;
        } else if (message == null || !C5108c.e(message).matches("cleartext.*not permitted.*")) {
            i11 = 2001;
        } else {
            i11 = 2007;
        }
        if (i11 == 2007) {
            return new p(iOException, jVar);
        }
        return new q(iOException, jVar, i11, i10);
    }

    public q(String str, j jVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f23259b = jVar;
        this.f23260c = i11;
    }

    public q(IOException iOException, j jVar, int i10, int i11) {
        super((Throwable) iOException, b(i10, i11));
        this.f23259b = jVar;
        this.f23260c = i11;
    }

    public q(String str, IOException iOException, j jVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f23259b = jVar;
        this.f23260c = i11;
    }
}
