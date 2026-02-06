package Sg;

import kotlin.jvm.internal.C6496s;

abstract class w extends v {
    public static Double j(String str) {
        C6496s.h(str, "<this>");
        try {
            if (o.f65093b.d(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float k(String str) {
        C6496s.h(str, "<this>");
        try {
            if (o.f65093b.d(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
