package Ac;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;
import uc.C5233a;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f50259a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        C5233a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f50259a == null) {
            f50259a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String contains : f50259a) {
            if (host.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
