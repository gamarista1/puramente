package Ea;

import android.text.TextUtils;
import java.util.regex.Pattern;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f50663a = Pattern.compile("\\$\\{(.*?)\\}");

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean b(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
