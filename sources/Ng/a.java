package Ng;

import Sg.p;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;

public abstract class a {
    public static final String a(String str) {
        char charAt;
        C6496s.h(str, "<this>");
        if (str.length() == 0 || 'a' > (charAt = str.charAt(0)) || charAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(charAt));
        sb2.append(str, 1, str.length());
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public static final String b(String str) {
        char charAt;
        C6496s.h(str, "<this>");
        if (str.length() == 0 || 'A' > (charAt = str.charAt(0)) || charAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        C6496s.g(substring, "substring(...)");
        return lowerCase + substring;
    }

    public static final String c(String str, boolean z10) {
        Object obj;
        C6496s.h(str, "<this>");
        if (str.length() == 0 || !d(str, 0, z10)) {
            return str;
        }
        if (str.length() != 1 && d(str, 1, z10)) {
            Iterator it = p.U(str).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!d(str, ((Number) obj).intValue(), z10)) {
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num == null) {
                return e(str, z10);
            }
            int intValue = num.intValue() - 1;
            StringBuilder sb2 = new StringBuilder();
            String substring = str.substring(0, intValue);
            C6496s.g(substring, "substring(...)");
            sb2.append(e(substring, z10));
            String substring2 = str.substring(intValue);
            C6496s.g(substring2, "substring(...)");
            sb2.append(substring2);
            return sb2.toString();
        } else if (z10) {
            return b(str);
        } else {
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring3 = str.substring(1);
            C6496s.g(substring3, "substring(...)");
            return lowerCase + substring3;
        }
    }

    private static final boolean d(String str, int i10, boolean z10) {
        char charAt = str.charAt(i10);
        if (!z10) {
            return Character.isUpperCase(charAt);
        }
        if ('A' > charAt || charAt >= '[') {
            return false;
        }
        return true;
    }

    private static final String e(String str, boolean z10) {
        if (z10) {
            return f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C6496s.g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String f(String str) {
        C6496s.h(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }
}
