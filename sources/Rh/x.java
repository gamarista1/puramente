package rh;

import Bh.j;
import Sg.p;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import rh.m;
import sh.C6723b;
import sh.C6726e;

public final class x implements n {

    /* renamed from: c  reason: collision with root package name */
    private final CookieHandler f73498c;

    public x(CookieHandler cookieHandler) {
        C6496s.h(cookieHandler, "cookieHandler");
        this.f73498c = cookieHandler;
    }

    private final List e(v vVar, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int q10 = C6726e.q(str, ";,", i10, length);
            int p10 = C6726e.p(str, '=', i10, q10);
            String Z10 = C6726e.Z(str, i10, p10);
            if (!p.J(Z10, "$", false, 2, (Object) null)) {
                if (p10 < q10) {
                    str2 = C6726e.Z(str, p10 + 1, q10);
                } else {
                    str2 = "";
                }
                if (p.J(str2, "\"", false, 2, (Object) null) && p.u(str2, "\"", false, 2, (Object) null)) {
                    str2 = str2.substring(1, str2.length() - 1);
                    C6496s.g(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(new m.a().d(Z10).e(str2).b(vVar.i()).a());
            }
            i10 = q10 + 1;
        }
        return arrayList;
    }

    public List b(v vVar) {
        C6496s.h(vVar, "url");
        try {
            Map<String, List<String>> map = this.f73498c.get(vVar.t(), O.i());
            C6496s.g(map, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                List<String> list = (List) next.getValue();
                if (p.v("Cookie", str, true) || p.v("Cookie2", str, true)) {
                    C6496s.g(list, "value");
                    if (!list.isEmpty()) {
                        for (String str2 : list) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            C6496s.g(str2, "header");
                            arrayList.addAll(e(vVar, str2));
                        }
                    }
                }
            }
            if (arrayList == null) {
                return C6565s.n();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            C6496s.g(unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        } catch (IOException e10) {
            j g10 = j.f62626a.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Loading cookies failed for ");
            v r10 = vVar.r("/...");
            C6496s.e(r10);
            sb2.append(r10);
            g10.k(sb2.toString(), 5, e10);
            return C6565s.n();
        }
    }

    public void d(v vVar, List list) {
        C6496s.h(vVar, "url");
        C6496s.h(list, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C6723b.a((m) it.next(), true));
        }
        try {
            this.f73498c.put(vVar.t(), O.f(C6502A.a("Set-Cookie", arrayList)));
        } catch (IOException e10) {
            j g10 = j.f62626a.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Saving cookies failed for ");
            v r10 = vVar.r("/...");
            C6496s.e(r10);
            sb2.append(r10);
            g10.k(sb2.toString(), 5, e10);
        }
    }
}
