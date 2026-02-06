package Kc;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;

public abstract class d {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split("/", -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb2.length() > 0) {
                    sb2.append("/");
                    sb2.append(str2);
                } else {
                    sb2.append(str2);
                }
            }
        }
        return sb2.toString();
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return c(Uri.encode(str));
    }

    public static String c(String str) {
        C4536s.l(str);
        return str.replace("%2F", "/");
    }
}
