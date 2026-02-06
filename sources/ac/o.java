package Ac;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.a;
import rh.v;
import uc.C5233a;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f50261a;

    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(Context context) {
        Boolean bool = f50261a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f50261a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            C5233a e11 = C5233a.e();
            e11.a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static int c(long j10) {
        if (j10 > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static String d(String str) {
        v m10 = v.m(str);
        if (m10 != null) {
            return m10.k().z("").l("").p((String) null).f((String) null).toString();
        }
        return str;
    }

    public static String e(String str, int i10) {
        int lastIndexOf;
        if (str.length() <= i10) {
            return str;
        }
        if (str.charAt(i10) == '/') {
            return str.substring(0, i10);
        }
        v m10 = v.m(str);
        if (m10 == null) {
            return str.substring(0, i10);
        }
        if (m10.d().lastIndexOf(47) < 0 || (lastIndexOf = str.lastIndexOf(47, i10 - 1)) < 0) {
            return str.substring(0, i10);
        }
        return str.substring(0, lastIndexOf);
    }
}
