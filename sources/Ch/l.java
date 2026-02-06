package Ch;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C6496s;

public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final a f62661a;

    /* renamed from: b  reason: collision with root package name */
    private m f62662b;

    public interface a {
        boolean b(SSLSocket sSLSocket);

        m c(SSLSocket sSLSocket);
    }

    public l(a aVar) {
        C6496s.h(aVar, "socketAdapterFactory");
        this.f62661a = aVar;
    }

    private final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f62662b == null && this.f62661a.b(sSLSocket)) {
                this.f62662b = this.f62661a.c(sSLSocket);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f62662b;
    }

    public boolean a() {
        return true;
    }

    public boolean b(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        return this.f62661a.b(sSLSocket);
    }

    public String c(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        m e10 = e(sSLSocket);
        if (e10 != null) {
            return e10.c(sSLSocket);
        }
        return null;
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
        m e10 = e(sSLSocket);
        if (e10 != null) {
            e10.d(sSLSocket, str, list);
        }
    }
}
