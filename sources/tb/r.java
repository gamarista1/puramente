package Tb;

import Gb.c;
import Lb.l;

public abstract class r {
    public static n a() {
        return g.A();
    }

    public static boolean b(n nVar) {
        if (!nVar.q().isEmpty() || (!nVar.isEmpty() && !(nVar instanceof f) && !(nVar instanceof t) && !(nVar instanceof e))) {
            return false;
        }
        return true;
    }

    public static n c(l lVar, Object obj) {
        String str;
        n a10 = o.a(obj);
        if (a10 instanceof l) {
            a10 = new f(Double.valueOf((double) ((Long) a10.getValue()).longValue()), a());
        }
        if (b(a10)) {
            return a10;
        }
        StringBuilder sb2 = new StringBuilder();
        if (lVar != null) {
            str = "Path '" + lVar + "'";
        } else {
            str = "Node";
        }
        sb2.append(str);
        sb2.append(" contains invalid priority: Must be a string, double, ServerValue, or null");
        throw new c(sb2.toString());
    }

    public static n d(Object obj) {
        return c((l) null, obj);
    }
}
