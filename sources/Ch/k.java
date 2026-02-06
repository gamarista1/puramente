package Ch;

import Bh.d;
import Bh.j;
import Ch.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;

public final class k implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final b f62659a = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final l.a f62660b = new a();

    public static final class a implements l.a {
        a() {
        }

        public boolean b(SSLSocket sSLSocket) {
            C6496s.h(sSLSocket, "sslSocket");
            if (!d.f62608e.c() || !Conscrypt.isConscrypt(sSLSocket)) {
                return false;
            }
            return true;
        }

        public m c(SSLSocket sSLSocket) {
            C6496s.h(sSLSocket, "sslSocket");
            return new k();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l.a a() {
            return k.f62660b;
        }

        private b() {
        }
    }

    public boolean a() {
        return d.f62608e.c();
    }

    public boolean b(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public String c(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) j.f62626a.b(list).toArray(new String[0]));
        }
    }
}
