package n1;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: n1.a  reason: case insensitive filesystem */
public abstract class C2240a {

    /* renamed from: n1.a$a  reason: collision with other inner class name */
    private static class C0414a {
        static long a(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0414a.a(packageInfo);
        }
        return (long) packageInfo.versionCode;
    }
}
