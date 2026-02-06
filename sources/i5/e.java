package i5;

import android.content.Context;
import android.util.Log;
import androidx.core.content.c;
import i5.b;

public class e implements c {
    public b a(Context context, b.a aVar) {
        boolean z10;
        String str;
        if (c.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z10) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z10) {
            return new d(context, aVar);
        }
        return new n();
    }
}
