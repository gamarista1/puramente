package io.intercom.android.sdk.utilities;

public class NullSafety {
    public static boolean valueOrDefault(Boolean bool, boolean z10) {
        if (bool == null) {
            return z10;
        }
        return bool.booleanValue();
    }

    public static String valueOrEmpty(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }
}
