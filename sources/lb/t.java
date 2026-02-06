package Lb;

import Lb.F;
import Ob.l;
import Tb.b;
import Tb.c;
import Tb.n;
import Tb.o;
import Tb.r;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class t {

    class a extends c.C0806c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ F f51887a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f51888b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f51889c;

        a(F f10, Map map, u uVar) {
            this.f51887a = f10;
            this.f51888b = map;
            this.f51889c = uVar;
        }

        public void b(b bVar, n nVar) {
            n a10 = t.h(nVar, this.f51887a.a(bVar), this.f51888b);
            if (a10 != nVar) {
                this.f51889c.c(new l(bVar.b()), a10);
            }
        }
    }

    private static boolean b(Number number) {
        if ((number instanceof Double) || (number instanceof Float)) {
            return false;
        }
        return true;
    }

    public static Map c(Ob.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(DiagnosticsEntry.TIMESTAMP_KEY, Long.valueOf(aVar.a()));
        return hashMap;
    }

    static Object d(Map map, F f10, Map map2) {
        if (!map.containsKey("increment")) {
            return null;
        }
        Object obj = map.get("increment");
        if (!(obj instanceof Number)) {
            return null;
        }
        Number number = (Number) obj;
        n b10 = f10.b();
        if (!b10.e0() || !(b10.getValue() instanceof Number)) {
            return number;
        }
        Number number2 = (Number) b10.getValue();
        if (b(number) && b(number2)) {
            long longValue = number.longValue();
            long longValue2 = number2.longValue();
            long j10 = longValue + longValue2;
            if (((longValue ^ j10) & (longValue2 ^ j10)) >= 0) {
                return Long.valueOf(j10);
            }
        }
        return Double.valueOf(number.doubleValue() + number2.doubleValue());
    }

    public static Object e(Object obj, F f10, Map map) {
        Object obj2;
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map2 = (Map) obj;
        if (!map2.containsKey(".sv")) {
            return obj;
        }
        Object obj3 = map2.get(".sv");
        if (obj3 instanceof String) {
            obj2 = j((String) obj3, map);
        } else if (obj3 instanceof Map) {
            obj2 = d((Map) obj3, f10, map);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return obj;
        }
        return obj2;
    }

    public static C4368b f(C4368b bVar, y yVar, l lVar, Map map) {
        C4368b n10 = C4368b.n();
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            n10 = n10.a((l) entry.getKey(), h((n) entry.getValue(), new F.a(yVar, lVar.t((l) entry.getKey())), map));
        }
        return n10;
    }

    public static n g(n nVar, y yVar, l lVar, Map map) {
        return h(nVar, new F.a(yVar, lVar), map);
    }

    /* access modifiers changed from: private */
    public static n h(n nVar, F f10, Map map) {
        Object value = nVar.q().getValue();
        Object e10 = e(value, f10.a(b.e(".priority")), map);
        if (nVar.e0()) {
            Object e11 = e(nVar.getValue(), f10, map);
            if (!e11.equals(nVar.getValue()) || !l.d(e10, value)) {
                return o.b(e11, r.d(e10));
            }
            return nVar;
        } else if (nVar.isEmpty()) {
            return nVar;
        } else {
            c cVar = (c) nVar;
            u uVar = new u(cVar);
            cVar.m(new a(f10, map, uVar));
            if (!uVar.b().q().equals(e10)) {
                return uVar.b().V(r.d(e10));
            }
            return uVar.b();
        }
    }

    public static n i(n nVar, n nVar2, Map map) {
        return h(nVar, new F.b(nVar2), map);
    }

    static Object j(String str, Map map) {
        if (!DiagnosticsEntry.TIMESTAMP_KEY.equals(str) || !map.containsKey(str)) {
            return null;
        }
        return map.get(str);
    }
}
