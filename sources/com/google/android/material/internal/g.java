package com.google.android.material.internal;

import android.os.Build;
import com.adjust.sdk.Constants;
import java.util.Locale;

public abstract class g {
    public static boolean a() {
        if (b() || d()) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("lge");
    }

    public static boolean c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }

    public static boolean d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(Constants.REFERRER_API_SAMSUNG);
    }
}
