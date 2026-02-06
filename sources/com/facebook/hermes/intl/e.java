package com.facebook.hermes.intl;

import M6.b;
import M6.f;
import M6.g;
import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public abstract class e {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b f39708a;

        /* renamed from: b  reason: collision with root package name */
        public HashMap f39709b = new HashMap();
    }

    public static String a(String[] strArr, String str) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int lastIndexOf = str.lastIndexOf("-");
            if (lastIndexOf < 0) {
                return "";
            }
            if (lastIndexOf >= 2 && str.charAt(lastIndexOf - 2) == '-') {
                lastIndexOf -= 2;
            }
            str = str.substring(0, lastIndexOf);
        }
        return str;
    }

    public static ULocale b(b bVar) {
        boolean[] zArr = new boolean[1];
        ULocale acceptLanguage = ULocale.acceptLanguage(new ULocale[]{(ULocale) bVar.c()}, ULocale.getAvailableLocales(), zArr);
        if (zArr[0] || acceptLanguage == null) {
            return null;
        }
        return acceptLanguage;
    }

    public static a c(String[] strArr) {
        a aVar = new a();
        for (String b10 : strArr) {
            b b11 = f.b(b10);
            ULocale b12 = b(b11);
            if (b12 != null) {
                aVar.f39708a = g.k(b12);
                aVar.f39709b = b11.a();
                return aVar;
            }
        }
        aVar.f39708a = g.i();
        return aVar;
    }

    public static String[] d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (b(f.b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] e() {
        ArrayList arrayList = new ArrayList();
        for (Locale languageTag : Locale.getAvailableLocales()) {
            arrayList.add(languageTag.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static a f(String[] strArr) {
        return g(strArr, e());
    }

    public static a g(String[] strArr, String[] strArr2) {
        a aVar = new a();
        for (String b10 : strArr) {
            b b11 = f.b(b10);
            String a10 = a(strArr2, b11.e());
            if (!a10.isEmpty()) {
                aVar.f39708a = f.b(a10);
                aVar.f39709b = b11.a();
                return aVar;
            }
        }
        aVar.f39708a = f.a();
        return aVar;
    }

    public static String[] h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] e10 = e();
        for (String str : strArr) {
            String a10 = a(e10, f.b(str).e());
            if (a10 != null && !a10.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
