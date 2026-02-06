package wh;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import rh.C6704a;
import rh.C6708e;
import rh.G;
import rh.r;
import rh.v;
import sh.C6726e;

/* renamed from: wh.j  reason: case insensitive filesystem */
public final class C6780j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f73862i = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C6704a f73863a;

    /* renamed from: b  reason: collision with root package name */
    private final C6778h f73864b;

    /* renamed from: c  reason: collision with root package name */
    private final C6708e f73865c;

    /* renamed from: d  reason: collision with root package name */
    private final r f73866d;

    /* renamed from: e  reason: collision with root package name */
    private List f73867e = C6565s.n();

    /* renamed from: f  reason: collision with root package name */
    private int f73868f;

    /* renamed from: g  reason: collision with root package name */
    private List f73869g = C6565s.n();

    /* renamed from: h  reason: collision with root package name */
    private final List f73870h = new ArrayList();

    /* renamed from: wh.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            C6496s.h(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                C6496s.g(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            C6496s.g(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private a() {
        }
    }

    /* renamed from: wh.j$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List f73871a;

        /* renamed from: b  reason: collision with root package name */
        private int f73872b;

        public b(List list) {
            C6496s.h(list, "routes");
            this.f73871a = list;
        }

        public final List a() {
            return this.f73871a;
        }

        public final boolean b() {
            if (this.f73872b < this.f73871a.size()) {
                return true;
            }
            return false;
        }

        public final G c() {
            if (b()) {
                List list = this.f73871a;
                int i10 = this.f73872b;
                this.f73872b = i10 + 1;
                return (G) list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public C6780j(C6704a aVar, C6778h hVar, C6708e eVar, r rVar) {
        C6496s.h(aVar, "address");
        C6496s.h(hVar, "routeDatabase");
        C6496s.h(eVar, "call");
        C6496s.h(rVar, "eventListener");
        this.f73863a = aVar;
        this.f73864b = hVar;
        this.f73865c = eVar;
        this.f73866d = rVar;
        f(aVar.l(), aVar.g());
    }

    private final boolean b() {
        if (this.f73868f < this.f73867e.size()) {
            return true;
        }
        return false;
    }

    private final Proxy d() {
        if (b()) {
            List list = this.f73867e;
            int i10 = this.f73868f;
            this.f73868f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f73863a.l().i() + "; exhausted proxy configurations: " + this.f73867e);
    }

    private final void e(Proxy proxy) {
        String str;
        int i10;
        List<InetAddress> list;
        ArrayList arrayList = new ArrayList();
        this.f73869g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f73863a.l().i();
            i10 = this.f73863a.l().o();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                a aVar = f73862i;
                C6496s.g(address, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = aVar.a(inetSocketAddress);
                i10 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        }
        if (1 > i10 || i10 >= 65536) {
            throw new SocketException("No route to " + str + ':' + i10 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i10));
        } else {
            if (C6726e.i(str)) {
                list = C6565s.e(InetAddress.getByName(str));
            } else {
                this.f73866d.n(this.f73865c, str);
                list = this.f73863a.c().a(str);
                if (!list.isEmpty()) {
                    this.f73866d.m(this.f73865c, str, list);
                } else {
                    throw new UnknownHostException(this.f73863a.c() + " returned no addresses for " + str);
                }
            }
            for (InetAddress inetSocketAddress2 : list) {
                arrayList.add(new InetSocketAddress(inetSocketAddress2, i10));
            }
        }
    }

    private final void f(v vVar, Proxy proxy) {
        this.f73866d.p(this.f73865c, vVar);
        List g10 = g(proxy, vVar, this);
        this.f73867e = g10;
        this.f73868f = 0;
        this.f73866d.o(this.f73865c, vVar, g10);
    }

    private static final List g(Proxy proxy, v vVar, C6780j jVar) {
        if (proxy != null) {
            return C6565s.e(proxy);
        }
        URI t10 = vVar.t();
        if (t10.getHost() == null) {
            return C6726e.w(Proxy.NO_PROXY);
        }
        List<Proxy> select = jVar.f73863a.i().select(t10);
        Collection collection = select;
        if (collection == null || collection.isEmpty()) {
            return C6726e.w(Proxy.NO_PROXY);
        }
        C6496s.g(select, "proxiesOrNull");
        return C6726e.V(select);
    }

    public final boolean a() {
        if (b() || !this.f73870h.isEmpty()) {
            return true;
        }
        return false;
    }

    public final b c() {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (b()) {
                Proxy d10 = d();
                for (InetSocketAddress g10 : this.f73869g) {
                    G g11 = new G(this.f73863a, d10, g10);
                    if (this.f73864b.c(g11)) {
                        this.f73870h.add(g11);
                    } else {
                        arrayList.add(g11);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                C6565s.D(arrayList, this.f73870h);
                this.f73870h.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
