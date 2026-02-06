package com.facebook.hermes.intl;

import M6.d;
import M6.e;
import java.util.Arrays;

public abstract class g {

    public enum a {
        BOOLEAN,
        STRING
    }

    public static Object a(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (d.n(obj)) {
            return obj4;
        }
        if (d.k(obj)) {
            double f10 = d.f(obj);
            if (!Double.isNaN(f10) && f10 <= d.f(obj3) && f10 >= d.f(obj2)) {
                return obj;
            }
            throw new e(str + " value is invalid.");
        }
        throw new e(str + " value is invalid.");
    }

    public static Object b(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        return a(str, d.a(obj, str), obj2, obj3, obj4);
    }

    public static Object c(Object obj, String str, a aVar, Object obj2, Object obj3) {
        Object a10 = d.a(obj, str);
        if (d.n(a10)) {
            return obj3;
        }
        if (d.j(a10)) {
            a10 = "";
        }
        if (aVar == a.BOOLEAN && !d.i(a10)) {
            throw new e("Boolean option expected but not found");
        } else if (aVar == a.STRING && !d.m(a10)) {
            throw new e("String option expected but not found");
        } else if (d.n(obj2) || Arrays.asList((Object[]) obj2).contains(a10)) {
            return a10;
        } else {
            throw new e("String option expected but not found");
        }
    }

    public static Enum d(Class cls, Object obj) {
        try {
            if (d.n(obj)) {
                return Enum.valueOf(cls, "UNDEFINED");
            }
            if (d.j(obj)) {
                return null;
            }
            String h10 = d.h(obj);
            if (h10.equals("2-digit")) {
                return Enum.valueOf(cls, "DIGIT2");
            }
            for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                if (enumR.name().compareToIgnoreCase(h10) == 0) {
                    return enumR;
                }
            }
            return null;
        } catch (IllegalArgumentException unused) {
        }
    }
}
