package rh;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.C6496s;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final C6704a f73189a;

    /* renamed from: b  reason: collision with root package name */
    private final Proxy f73190b;

    /* renamed from: c  reason: collision with root package name */
    private final InetSocketAddress f73191c;

    public G(C6704a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C6496s.h(aVar, "address");
        C6496s.h(proxy, "proxy");
        C6496s.h(inetSocketAddress, "socketAddress");
        this.f73189a = aVar;
        this.f73190b = proxy;
        this.f73191c = inetSocketAddress;
    }

    public final C6704a a() {
        return this.f73189a;
    }

    public final Proxy b() {
        return this.f73190b;
    }

    public final boolean c() {
        if (this.f73189a.k() == null || this.f73190b.type() != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public final InetSocketAddress d() {
        return this.f73191c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof G) {
            G g10 = (G) obj;
            if (!C6496s.c(g10.f73189a, this.f73189a) || !C6496s.c(g10.f73190b, this.f73190b) || !C6496s.c(g10.f73191c, this.f73191c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f73189a.hashCode()) * 31) + this.f73190b.hashCode()) * 31) + this.f73191c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f73191c + '}';
    }
}
