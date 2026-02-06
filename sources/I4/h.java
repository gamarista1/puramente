package i4;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.c;
import i4.g;
import o4.C3881d;
import o4.j;
import o4.z;

public abstract class h {
    public static final g a(Context context, g.a aVar, z zVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !C3881d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (zVar != null && zVar.b() <= 5) {
                zVar.a("NetworkObserver", 5, "Unable to register network observer.", (Throwable) null);
            }
            return new e();
        }
        try {
            return new i(connectivityManager, aVar);
        } catch (Exception e10) {
            if (zVar != null) {
                j.a(zVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e10));
            }
            return new e();
        }
    }
}
