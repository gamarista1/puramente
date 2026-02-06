package s4;

import Nh.d;
import android.webkit.MimeTypeMap;

/* renamed from: s4.b  reason: case insensitive filesystem */
public abstract class C3985b {

    /* renamed from: a  reason: collision with root package name */
    static String f48017a = "application/octet-stream";

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        if (str.equals(f48017a)) {
            return "bin";
        }
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
    }

    public static String b(String str, String str2) {
        String a10 = a(str2);
        if (a10 == null || a10.isEmpty()) {
            return str;
        }
        if (str.endsWith("." + a10)) {
            return str;
        }
        String str3 = str + "." + a10;
        if (str3.endsWith(".")) {
            return d.b(str3, ".");
        }
        return str3;
    }
}
