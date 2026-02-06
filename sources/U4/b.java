package U4;

import android.net.Uri;

public abstract class b {
    public static boolean a(Uri uri) {
        if (!c(uri) || !uri.getPathSegments().contains("picker")) {
            return false;
        }
        return true;
    }

    public static boolean b(Uri uri) {
        if (!c(uri) || f(uri)) {
            return false;
        }
        return true;
    }

    public static boolean c(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    public static boolean d(Uri uri) {
        if (!c(uri) || !f(uri)) {
            return false;
        }
        return true;
    }

    public static boolean e(int i10, int i11) {
        if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
            return false;
        }
        return true;
    }

    private static boolean f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
