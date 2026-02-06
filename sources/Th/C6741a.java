package th;

import Sg.p;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import rh.C;
import rh.C6704a;
import rh.C6705b;
import rh.C6711h;
import rh.E;
import rh.G;
import rh.o;
import rh.q;
import rh.v;

/* renamed from: th.a  reason: case insensitive filesystem */
public final class C6741a implements C6705b {

    /* renamed from: d  reason: collision with root package name */
    private final q f73581d;

    /* renamed from: th.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C1071a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73582a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f73582a = iArr;
        }
    }

    public C6741a(q qVar) {
        C6496s.h(qVar, "defaultDns");
        this.f73581d = qVar;
    }

    private final InetAddress b(Proxy proxy, v vVar, q qVar) {
        int i10;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i10 = -1;
        } else {
            i10 = C1071a.f73582a[type.ordinal()];
        }
        if (i10 == 1) {
            return (InetAddress) C6565s.o0(qVar.a(vVar.i()));
        }
        SocketAddress address = proxy.address();
        C6496s.f(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        C6496s.g(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    public C a(G g10, E e10) {
        boolean z10;
        Proxy proxy;
        q qVar;
        PasswordAuthentication passwordAuthentication;
        String str;
        C6704a a10;
        C6496s.h(e10, "response");
        List<C6711h> n10 = e10.n();
        C g02 = e10.g0();
        v l10 = g02.l();
        if (e10.o() == 407) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g10 == null || (proxy = g10.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C6711h hVar : n10) {
            if (p.v("Basic", hVar.c(), true)) {
                if (g10 == null || (a10 = g10.a()) == null || (qVar = a10.c()) == null) {
                    qVar = this.f73581d;
                }
                if (z10) {
                    SocketAddress address = proxy.address();
                    C6496s.f(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    C6496s.g(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, l10, qVar), inetSocketAddress.getPort(), l10.s(), hVar.b(), hVar.c(), l10.u(), Authenticator.RequestorType.PROXY);
                } else {
                    String i10 = l10.i();
                    C6496s.g(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(i10, b(proxy, l10, qVar), l10.o(), l10.s(), hVar.b(), hVar.c(), l10.u(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    if (z10) {
                        str = "Proxy-Authorization";
                    } else {
                        str = "Authorization";
                    }
                    String userName = passwordAuthentication.getUserName();
                    C6496s.g(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    C6496s.g(password, "auth.password");
                    return g02.i().e(str, o.a(userName, new String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6741a(q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.f73455b : qVar);
    }
}
