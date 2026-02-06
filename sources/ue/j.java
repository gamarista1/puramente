package Ue;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.a;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static j f65206a = new j();

    private Bundle b() {
        ApplicationInfo applicationInfo;
        try {
            Context a10 = a.a();
            PackageManager packageManager = a10.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a10.getPackageName(), 128)) == null) {
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static j c() {
        return f65206a;
    }

    public WritableMap a() {
        Bundle b10 = b();
        WritableMap createMap = Arguments.createMap();
        if (b10 == null) {
            return createMap;
        }
        for (String next : b10.keySet()) {
            if (next.startsWith("rnfirebase_")) {
                Object obj = b10.get(next);
                if (obj == null) {
                    createMap.putNull(next);
                } else if (obj instanceof String) {
                    createMap.putString(next, (String) obj);
                } else if (obj instanceof Boolean) {
                    createMap.putBoolean(next, ((Boolean) obj).booleanValue());
                }
            }
        }
        return createMap;
    }
}
