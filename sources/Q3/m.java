package Q3;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.C6496s;

public abstract class m {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        C6496s.h(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i10) {
        C6496s.h(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i10);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        C6496s.h(connectivityManager, "<this>");
        C6496s.h(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
