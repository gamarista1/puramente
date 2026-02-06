package Ea;

import Ga.C4293e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import ya.C5290g;

public abstract class q {
    public static boolean a(Context context, int i10) {
        if (!b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return C5290g.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    public static boolean b(Context context, int i10, String str) {
        return C4293e.a(context).g(i10, str);
    }
}
