package com.facebook.hermes.intl;

import B7.a;
import M6.e;
import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@a
public class Intl {
    private static List a(List list) {
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                throw new e("Incorrect locale information provided");
            } else if (!str.isEmpty()) {
                String a10 = d.a(str);
                if (!a10.isEmpty() && !arrayList.contains(a10)) {
                    arrayList.add(a10);
                }
            } else {
                throw new e("Incorrect locale information provided");
            }
        }
        return arrayList;
    }

    @a
    public static List<String> getCanonicalLocales(List<String> list) {
        return a(list);
    }

    @a
    public static String toLocaleLowerCase(List<String> list, String str) {
        return UCharacter.toLowerCase((ULocale) e.c((String[]) list.toArray(new String[list.size()])).f39708a.h(), str);
    }

    @a
    public static String toLocaleUpperCase(List<String> list, String str) {
        return UCharacter.toUpperCase((ULocale) e.c((String[]) list.toArray(new String[list.size()])).f39708a.h(), str);
    }
}
