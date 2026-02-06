package Ch;

import Bh.j;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62637a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            if (b()) {
                return new c();
            }
            return null;
        }

        public final boolean b() {
            if (!j.f62626a.h() || Build.VERSION.SDK_INT < 29) {
                return false;
            }
            return true;
        }

        private a() {
        }
    }

    public boolean a() {
        return f62637a.b();
    }

    public boolean b(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public String c(SSLSocket sSLSocket) {
        boolean z10;
        C6496s.h(sSLSocket, "sslSocket");
        String a10 = sSLSocket.getApplicationProtocol();
        if (a10 == null) {
            z10 = true;
        } else {
            z10 = C6496s.c(a10, "");
        }
        if (z10) {
            return null;
        }
        return a10;
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) j.f62626a.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
