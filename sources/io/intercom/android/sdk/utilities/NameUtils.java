package io.intercom.android.sdk.utilities;

public class NameUtils {
    public static String getInitial(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return "";
        }
        return String.valueOf(trim.charAt(0));
    }
}
