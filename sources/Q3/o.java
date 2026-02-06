package Q3;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.C6496s;

public abstract class o {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        C6496s.h(connectivityManager, "<this>");
        C6496s.h(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
