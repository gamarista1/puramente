package com.amazon.a.a.o.c.a;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final char f37541a = '.';

    /* renamed from: b  reason: collision with root package name */
    public static final String f37542b = Character.toString('.');

    /* renamed from: c  reason: collision with root package name */
    private static final int f37543c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static final char f37544d = '/';

    /* renamed from: e  reason: collision with root package name */
    private static final char f37545e = '\\';

    /* renamed from: f  reason: collision with root package name */
    private static final char f37546f = File.separatorChar;

    /* renamed from: g  reason: collision with root package name */
    private static final char f37547g;

    static {
        if (a()) {
            f37547g = f37544d;
        } else {
            f37547g = f37545e;
        }
    }

    private static boolean a(char c10) {
        return c10 == '/' || c10 == '\\';
    }

    public static String b(String str) {
        return a(str, f37546f, false);
    }

    public static String c(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace(f37545e, f37544d);
    }

    public static String d(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace(f37544d, f37545e);
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        if (a()) {
            return d(str);
        }
        return c(str);
    }

    public static int f(String str) {
        int min;
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length != 1) {
            if (charAt == '~') {
                int indexOf = str.indexOf(47, 1);
                int indexOf2 = str.indexOf(92, 1);
                if (indexOf == -1 && indexOf2 == -1) {
                    return length + 1;
                }
                if (indexOf == -1) {
                    indexOf = indexOf2;
                }
                if (indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                min = Math.min(indexOf, indexOf2);
            } else {
                char charAt2 = str.charAt(1);
                if (charAt2 == ':') {
                    char upperCase = Character.toUpperCase(charAt);
                    if (upperCase < 'A' || upperCase > 'Z') {
                        return -1;
                    }
                    if (length == 2 || !a(str.charAt(2))) {
                        return 2;
                    }
                    return 3;
                } else if (!a(charAt) || !a(charAt2)) {
                    return a(charAt) ? 1 : 0;
                } else {
                    int indexOf3 = str.indexOf(47, 2);
                    int indexOf4 = str.indexOf(92, 2);
                    if ((indexOf3 == -1 && indexOf4 == -1) || indexOf3 == 2 || indexOf4 == 2) {
                        return -1;
                    }
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    }
                    if (indexOf4 == -1) {
                        indexOf4 = indexOf3;
                    }
                    min = Math.min(indexOf3, indexOf4);
                }
            }
            return min + 1;
        } else if (charAt == '~') {
            return 2;
        } else {
            return a(charAt) ? 1 : 0;
        }
    }

    public static int g(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static int h(String str) {
        int lastIndexOf;
        if (str != null && g(str) <= (lastIndexOf = str.lastIndexOf(46))) {
            return lastIndexOf;
        }
        return -1;
    }

    public static String i(String str) {
        int f10;
        if (str == null || (f10 = f(str)) < 0) {
            return null;
        }
        if (f10 > str.length()) {
            s(str + f37544d);
            return str + f37544d;
        }
        String substring = str.substring(0, f10);
        s(substring);
        return substring;
    }

    public static String j(String str) {
        return a(str, 1);
    }

    public static String k(String str) {
        return a(str, 0);
    }

    public static String l(String str) {
        return c(str, true);
    }

    public static String m(String str) {
        return c(str, false);
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        s(str);
        return str.substring(g(str) + 1);
    }

    public static String o(String str) {
        return q(n(str));
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int h10 = h(str);
        if (h10 == -1) {
            return "";
        }
        return str.substring(h10 + 1);
    }

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        s(str);
        int h10 = h(str);
        if (h10 == -1) {
            return str;
        }
        return str.substring(0, h10);
    }

    static String[] r(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int length = charArray.length;
        int i10 = 0;
        char c10 = 0;
        while (i10 < length) {
            char c11 = charArray[i10];
            if (c11 == '?' || c11 == '*') {
                if (sb2.length() != 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
                if (c11 == '?') {
                    arrayList.add("?");
                } else if (c10 != '*') {
                    arrayList.add("*");
                }
            } else {
                sb2.append(c11);
            }
            i10++;
            c10 = c11;
        }
        if (sb2.length() != 0) {
            arrayList.add(sb2.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static void s(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (str.charAt(i10) != 0) {
                i10++;
            } else {
                throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            }
        }
    }

    static boolean a() {
        return f37546f == '\\';
    }

    public static String b(String str, boolean z10) {
        return a(str, z10 ? f37544d : f37545e, false);
    }

    public static String a(String str) {
        return a(str, f37546f, true);
    }

    public static boolean b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Directory must not be null");
        } else if (str2 == null) {
            return false;
        } else {
            d dVar = d.SYSTEM;
            if (dVar.b(str, str2)) {
                return false;
            }
            return dVar.c(str2, str);
        }
    }

    private static String c(String str, boolean z10) {
        int f10;
        if (str == null || (f10 = f(str)) < 0) {
            return null;
        }
        if (f10 >= str.length()) {
            return z10 ? i(str) : str;
        }
        int g10 = g(str);
        if (g10 < 0) {
            return str.substring(0, f10);
        }
        int i10 = g10 + (z10 ? 1 : 0);
        if (i10 == 0) {
            i10++;
        }
        return str.substring(0, i10);
    }

    public static boolean d(String str, String str2) {
        return a(str, str2, false, d.SYSTEM);
    }

    public static boolean h(String str, String str2) {
        return a(str, str2, d.SENSITIVE);
    }

    public static String a(String str, boolean z10) {
        return a(str, z10 ? f37544d : f37545e, true);
    }

    public static boolean e(String str, String str2) {
        return a(str, str2, true, d.SENSITIVE);
    }

    public static boolean g(String str, String str2) {
        if (str == null) {
            return false;
        }
        s(str);
        if (str2 != null && !str2.isEmpty()) {
            return p(str).equals(str2);
        }
        if (h(str) == -1) {
            return true;
        }
        return false;
    }

    private static String a(String str, char c10, boolean z10) {
        boolean z11;
        String str2 = str;
        char c11 = c10;
        if (str2 == null) {
            return null;
        }
        s(str);
        int length = str.length();
        if (length == 0) {
            return str2;
        }
        int f10 = f(str);
        if (f10 < 0) {
            return null;
        }
        int i10 = length + 2;
        char[] cArr = new char[i10];
        str2.getChars(0, str.length(), cArr, 0);
        char c12 = f37546f;
        if (c11 == c12) {
            c12 = f37547g;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (cArr[i11] == c12) {
                cArr[i11] = c11;
            }
        }
        if (cArr[length - 1] != c11) {
            cArr[length] = c11;
            length++;
            z11 = false;
        } else {
            z11 = true;
        }
        int i12 = f10 + 1;
        int i13 = i12;
        while (i13 < length) {
            if (cArr[i13] == c11) {
                int i14 = i13 - 1;
                if (cArr[i14] == c11) {
                    System.arraycopy(cArr, i13, cArr, i14, length - i13);
                    length--;
                    i13--;
                }
            }
            i13++;
        }
        int i15 = i12;
        while (i15 < length) {
            if (cArr[i15] == c11) {
                int i16 = i15 - 1;
                if (cArr[i16] == '.' && (i15 == i12 || cArr[i15 - 2] == c11)) {
                    if (i15 == length - 1) {
                        z11 = true;
                    }
                    System.arraycopy(cArr, i15 + 1, cArr, i16, length - i15);
                    length -= 2;
                    i15--;
                }
            }
            i15++;
        }
        int i17 = f10 + 2;
        int i18 = i17;
        while (i18 < length) {
            if (cArr[i18] == c11 && cArr[i18 - 1] == '.' && cArr[i18 - 2] == '.' && (i18 == i17 || cArr[i18 - 3] == c11)) {
                if (i18 != i17) {
                    if (i18 == length - 1) {
                        z11 = true;
                    }
                    int i19 = i18 - 4;
                    while (true) {
                        if (i19 < f10) {
                            int i20 = i18 + 1;
                            System.arraycopy(cArr, i20, cArr, f10, length - i18);
                            length -= i20 - f10;
                            i18 = i12;
                            break;
                        } else if (cArr[i19] == c11) {
                            int i21 = i19 + 1;
                            System.arraycopy(cArr, i18 + 1, cArr, i21, length - i18);
                            length -= i18 - i19;
                            i18 = i21;
                            break;
                        } else {
                            i19--;
                        }
                    }
                } else {
                    return null;
                }
            }
            i18++;
        }
        if (length <= 0) {
            return "";
        }
        if (length <= f10) {
            return new String(cArr, 0, length);
        }
        if (!z11 || !z10) {
            return new String(cArr, 0, length - 1);
        }
        return new String(cArr, 0, length);
    }

    public static boolean i(String str, String str2) {
        return a(str, str2, d.SYSTEM);
    }

    public static boolean c(String str, String str2) {
        return a(str, str2, false, d.SENSITIVE);
    }

    public static boolean f(String str, String str2) {
        return a(str, str2, true, d.SYSTEM);
    }

    public static String a(String str, String str2) {
        int f10 = f(str2);
        if (f10 < 0) {
            return null;
        }
        if (f10 > 0) {
            return a(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return a(str2);
        }
        if (a(str.charAt(length - 1))) {
            return a(str + str2);
        }
        return a(str + f37544d + str2);
    }

    private static String a(String str, int i10) {
        int f10;
        if (str == null || (f10 = f(str)) < 0) {
            return null;
        }
        int g10 = g(str);
        int i11 = i10 + g10;
        if (f10 >= str.length() || g10 < 0 || f10 >= i11) {
            return "";
        }
        String substring = str.substring(f10, i11);
        s(substring);
        return substring;
    }

    public static boolean a(String str, String str2, boolean z10, d dVar) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (z10) {
            str = a(str);
            str2 = a(str2);
            if (str == null || str2 == null) {
                throw new NullPointerException("Error normalizing one or both of the file names");
            }
        }
        if (dVar == null) {
            dVar = d.SENSITIVE;
        }
        return dVar.b(str, str2);
    }

    public static boolean a(String str, String[] strArr) {
        if (str == null) {
            return false;
        }
        s(str);
        if (strArr != null && strArr.length != 0) {
            String p10 = p(str);
            for (String equals : strArr) {
                if (p10.equals(equals)) {
                    return true;
                }
            }
            return false;
        } else if (h(str) == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean a(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        s(str);
        if (collection != null && !collection.isEmpty()) {
            String p10 = p(str);
            for (String equals : collection) {
                if (p10.equals(equals)) {
                    return true;
                }
            }
            return false;
        } else if (h(str) == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean a(String str, String str2, d dVar) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        if (dVar == null) {
            dVar = d.SENSITIVE;
        }
        String[] r10 = r(str2);
        Stack stack = new Stack();
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        do {
            if (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                i11 = iArr[0];
                i10 = iArr[1];
                z10 = true;
            }
            while (i11 < r10.length) {
                if (r10[i11].equals("?")) {
                    i10++;
                    if (i10 > str.length()) {
                        break;
                    }
                } else if (r10[i11].equals("*")) {
                    if (i11 == r10.length - 1) {
                        i10 = str.length();
                    }
                    z10 = true;
                    i11++;
                } else {
                    if (!z10) {
                        if (!dVar.b(str, i10, r10[i11])) {
                            break;
                        }
                    } else {
                        i10 = dVar.a(str, i10, r10[i11]);
                        if (i10 == -1) {
                            break;
                        }
                        int a10 = dVar.a(str, i10 + 1, r10[i11]);
                        if (a10 >= 0) {
                            stack.push(new int[]{i11, a10});
                        }
                    }
                    i10 += r10[i11].length();
                }
                z10 = false;
                i11++;
            }
            if (i11 == r10.length && i10 == str.length()) {
                return true;
            }
        } while (stack.size() > 0);
        return false;
    }
}
