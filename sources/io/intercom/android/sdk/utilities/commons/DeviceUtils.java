package io.intercom.android.sdk.utilities.commons;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

public class DeviceUtils {
    public static String getAppMinSdkVersionVersion(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            if (applicationInfo != null) {
                return String.valueOf(applicationInfo.minSdkVersion);
            }
            return "";
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return "";
        }
    }

    public static String getAppName(Context context) {
        String packageName = context.getPackageName();
        if (packageName == null) {
            return "";
        }
        return packageName;
    }

    public static String getAppVersion(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str != null) {
                return str;
            }
            return "";
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return "";
        }
    }

    public static boolean hasPermission(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }
}
