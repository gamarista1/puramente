package Ch;

import Bh.c;
import Bh.j;
import Ch.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

public final class i implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final b f62653a = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final l.a f62654b = new a();

    public static final class a implements l.a {
        a() {
        }

        public boolean b(SSLSocket sSLSocket) {
            C6496s.h(sSLSocket, "sslSocket");
            boolean b10 = c.f62605e.b();
            return false;
        }

        public m c(SSLSocket sSLSocket) {
            C6496s.h(sSLSocket, "sslSocket");
            return new i();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l.a a() {
            return i.f62654b;
        }

        private b() {
        }
    }

    public boolean a() {
        return c.f62605e.b();
    }

    public boolean b(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        return false;
    }

    public String c(SSLSocket sSLSocket) {
        boolean z10;
        C6496s.h(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null) {
            z10 = true;
        } else {
            z10 = C6496s.c(applicationProtocol, "");
        }
        if (z10) {
            return null;
        }
        return applicationProtocol;
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) j.f62626a.b(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
