package Sg;

import Ef.m;
import java.util.Comparator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import mf.C6550c;

abstract class y extends x {
    public static final String A(String str, char c10, char c11, boolean z10) {
        C6496s.h(str, "<this>");
        if (!z10) {
            String replace = str.replace(c10, c11);
            C6496s.g(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (C5540c.e(charAt, c10, z10)) {
                charAt = c11;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public static final String B(String str, String str2, String str3, boolean z10) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "oldValue");
        C6496s.h(str3, "newValue");
        int i10 = 0;
        int X10 = z.X(str, str2, 0, z10);
        if (X10 < 0) {
            return str;
        }
        int length = str2.length();
        int d10 = m.d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append(str, i10, X10);
                sb2.append(str3);
                i10 = X10 + length;
                if (X10 >= str.length() || (X10 = z.X(str, str2, X10 + d10, z10)) <= 0) {
                    sb2.append(str, i10, str.length());
                    String sb3 = sb2.toString();
                    C6496s.g(sb3, "toString(...)");
                }
                sb2.append(str, i10, X10);
                sb2.append(str3);
                i10 = X10 + length;
                break;
            } while ((X10 = z.X(str, str2, X10 + d10, z10)) <= 0);
            sb2.append(str, i10, str.length());
            String sb32 = sb2.toString();
            C6496s.g(sb32, "toString(...)");
            return sb32;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String C(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return A(str, c10, c11, z10);
    }

    public static /* synthetic */ String D(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return B(str, str2, str3, z10);
    }

    public static final String E(String str, String str2, String str3, boolean z10) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "oldValue");
        C6496s.h(str3, "newValue");
        int b02 = p.b0(str, str2, 0, z10, 2, (Object) null);
        if (b02 < 0) {
            return str;
        }
        return p.z0(str, b02, str2.length() + b02, str3).toString();
    }

    public static /* synthetic */ String F(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return E(str, str2, str3, z10);
    }

    public static boolean G(String str, String str2, int i10, boolean z10) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2, i10);
        }
        return p.y(str, i10, str2, 0, str2.length(), z10);
    }

    public static boolean H(String str, String str2, boolean z10) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return p.y(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean I(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return p.G(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean J(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return p.H(str, str2, z10);
    }

    public static String q(char[] cArr) {
        C6496s.h(cArr, "<this>");
        return new String(cArr);
    }

    public static String r(char[] cArr, int i10, int i11) {
        C6496s.h(cArr, "<this>");
        C6550c.f72053a.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static byte[] s(String str) {
        C6496s.h(str, "<this>");
        byte[] bytes = str.getBytes(C5541d.f65029b);
        C6496s.g(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean t(String str, String str2, boolean z10) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "suffix");
        if (!z10) {
            return str.endsWith(str2);
        }
        return p.y(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean u(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return p.t(str, str2, z10);
    }

    public static boolean v(String str, String str2, boolean z10) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z10) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static /* synthetic */ boolean w(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return p.v(str, str2, z10);
    }

    public static Comparator x(U u10) {
        C6496s.h(u10, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        C6496s.g(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean y(String str, int i10, String str2, int i11, int i12, boolean z10) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "other");
        if (!z10) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static String z(CharSequence charSequence, int i10) {
        C6496s.h(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        } else if (i10 == 0) {
            return "";
        } else {
            int i11 = 1;
            if (i10 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
                if (1 <= i10) {
                    while (true) {
                        sb2.append(charSequence);
                        if (i11 == i10) {
                            break;
                        }
                        i11++;
                    }
                }
                String sb3 = sb2.toString();
                C6496s.e(sb3);
                return sb3;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = charAt;
            }
            return new String(cArr);
        }
    }
}
