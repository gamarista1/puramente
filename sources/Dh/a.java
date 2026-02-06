package Dh;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import mf.C6565s;

public final class a extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62804a = new a();

    private a() {
    }

    public List select(URI uri) {
        if (uri != null) {
            return C6565s.e(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
