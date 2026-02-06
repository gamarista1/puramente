package io.invertase.firebase.database;

import Gb.g;
import Ue.o;
import com.google.firebase.database.c;
import java.util.HashMap;
import ub.C5230g;

public abstract class P {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap f71338a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap f71339b = new HashMap();

    static void a(String str, String str2, String str3, int i10) {
        String str4 = str + str2;
        HashMap hashMap = new HashMap();
        hashMap.put("host", str3);
        hashMap.put("port", Integer.valueOf(i10));
        f71339b.put(str4, hashMap);
    }

    static c b(String str, String str2) {
        c cVar;
        if (str2 == null || str2.length() <= 0) {
            cVar = c.d(C5230g.p(str));
        } else if (str == null || str.length() <= 0) {
            cVar = c.c(str2);
        } else {
            cVar = c.e(C5230g.p(str), str2);
        }
        d(cVar, str, str2);
        HashMap c10 = c(str, str2);
        if (c10 != null) {
            cVar.m((String) c10.get("host"), ((Integer) c10.get("port")).intValue());
        }
        return cVar;
    }

    private static HashMap c(String str, String str2) {
        HashMap hashMap = f71339b;
        return (HashMap) hashMap.get(str + str2);
    }

    private static void d(c cVar, String str, String str2) {
        String str3 = str + str2;
        if (!f71338a.containsKey(str3)) {
            o e10 = o.e();
            try {
                cVar.l(e10.b(O.f71335a, false));
                if (e10.b(O.f71336b, false)) {
                    cVar.j(g.DEBUG);
                } else {
                    cVar.j(g.WARN);
                }
                if (e10.a(O.f71337c)) {
                    cVar.k(e10.c(O.f71337c, 10485760));
                }
            } catch (Gb.c e11) {
                if (!e11.getMessage().contains("must be made before any other usage of FirebaseDatabase")) {
                    throw e11;
                }
            }
            f71338a.put(str3, Boolean.TRUE);
        }
    }
}
