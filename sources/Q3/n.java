package Q3;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.C6496s;

public abstract class n {
    public static final Network a(ConnectivityManager connectivityManager) {
        C6496s.h(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
