package com.facebook.hermes.intl;

import M6.d;
import M6.i;
import com.amazon.a.a.o.b;
import com.facebook.hermes.intl.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class f {
    public static HashMap a(List list, Object obj, List list2) {
        e.a aVar;
        HashMap hashMap = new HashMap();
        if (d.h(d.a(obj, "localeMatcher")).equals("lookup")) {
            aVar = e.f((String[]) list.toArray(new String[list.size()]));
        } else {
            aVar = e.c((String[]) list.toArray(new String[list.size()]));
        }
        HashSet<String> hashSet = new HashSet<>();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object b10 = d.b();
            if (!aVar.f39709b.isEmpty() && aVar.f39709b.containsKey(str)) {
                String str2 = (String) aVar.f39709b.get(str);
                boolean isEmpty = str2.isEmpty();
                String str3 = str2;
                if (isEmpty) {
                    str3 = d.r(b.f37475af);
                }
                hashSet.add(str);
                b10 = str3;
            }
            if (d.g(obj).containsKey(str)) {
                Object a10 = d.a(obj, str);
                if (d.m(a10) && d.h(a10).isEmpty()) {
                    a10 = d.o(true);
                }
                if (!d.n(a10) && !a10.equals(b10)) {
                    hashSet.remove(str);
                    b10 = a10;
                }
            }
            if (!d.j(b10)) {
                b10 = i.f(str, b10);
            }
            if (!d.m(b10) || i.c(str, d.h(b10), aVar.f39708a)) {
                hashMap.put(str, b10);
            } else {
                hashMap.put(str, d.b());
            }
        }
        for (String str4 : hashSet) {
            ArrayList arrayList = new ArrayList();
            String h10 = d.h(i.f(str4, d.r((String) aVar.f39709b.get(str4))));
            if (!d.m(h10) || i.c(str4, d.h(h10), aVar.f39708a)) {
                arrayList.add(h10);
                aVar.f39708a.f(str4, arrayList);
            }
        }
        hashMap.put("locale", aVar.f39708a);
        return hashMap;
    }
}
