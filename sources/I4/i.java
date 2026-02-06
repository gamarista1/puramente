package i4;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import i4.g;
import kotlin.jvm.internal.C6496s;

final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f44196a;

    /* renamed from: b  reason: collision with root package name */
    private final g.a f44197b;

    /* renamed from: c  reason: collision with root package name */
    private final a f44198c;

    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f44199a;

        a(i iVar) {
            this.f44199a = iVar;
        }

        public void onAvailable(Network network) {
            this.f44199a.d(network, true);
        }

        public void onLost(Network network) {
            this.f44199a.d(network, false);
        }
    }

    public i(ConnectivityManager connectivityManager, g.a aVar) {
        this.f44196a = connectivityManager;
        this.f44197b = aVar;
        a aVar2 = new a(this);
        this.f44198c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    private final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f44196a.getNetworkCapabilities(network);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final void d(Network network, boolean z10) {
        boolean z11;
        Network[] allNetworks = this.f44196a.getAllNetworks();
        int length = allNetworks.length;
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network network2 = allNetworks[i10];
            if (C6496s.c(network2, network)) {
                z11 = z10;
            } else {
                z11 = c(network2);
            }
            if (z11) {
                z12 = true;
                break;
            }
            i10++;
        }
        this.f44197b.a(z12);
    }

    public boolean a() {
        for (Network c10 : this.f44196a.getAllNetworks()) {
            if (c(c10)) {
                return true;
            }
        }
        return false;
    }

    public void shutdown() {
        this.f44196a.unregisterNetworkCallback(this.f44198c);
    }
}
