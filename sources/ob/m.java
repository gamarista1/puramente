package Ob;

import Gb.c;
import Lb.D;
import Lb.l;
import Tb.b;
import Tb.n;
import Tb.o;
import Tb.r;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f52129a = Pattern.compile("[\\[\\]\\.#$]");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f52130b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    private static boolean a(String str) {
        if (str.equals(".info") || !f52130b.matcher(str).find() || str.equals(b.i().b()) || str.equals(b.j().b())) {
            return true;
        }
        return false;
    }

    private static boolean b(String str) {
        return !f52129a.matcher(str).find();
    }

    private static boolean c(String str) {
        if (str == null || str.length() <= 0 || (!str.equals(".value") && !str.equals(".priority") && (str.startsWith(".") || f52130b.matcher(str).find()))) {
            return false;
        }
        return true;
    }

    private static boolean d(l lVar) {
        b E10 = lVar.E();
        if (E10 == null || !E10.b().startsWith(".")) {
            return true;
        }
        return false;
    }

    public static Map e(l lVar, Map map) {
        boolean z10;
        String str;
        n nVar;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map.entrySet()) {
            l lVar2 = new l((String) entry.getKey());
            Object value = entry.getValue();
            D.g(lVar.t(lVar2), value);
            if (!lVar2.isEmpty()) {
                str = lVar2.C().b();
            } else {
                str = "";
            }
            if (str.equals(".sv") || str.equals(".value")) {
                throw new c("Path '" + lVar2 + "' contains disallowed child name: " + str);
            }
            if (str.equals(".priority")) {
                nVar = r.c(lVar2, value);
            } else {
                nVar = o.a(value);
            }
            k(value);
            treeMap.put(lVar2, nVar);
        }
        l lVar3 = null;
        for (l lVar4 : treeMap.keySet()) {
            if (lVar3 == null || lVar3.compareTo(lVar4) < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l.f(z10);
            if (lVar3 == null || !lVar3.A(lVar4)) {
                lVar3 = lVar4;
            } else {
                throw new c("Path '" + lVar3 + "' is an ancestor of '" + lVar4 + "' in an update.");
            }
        }
        return treeMap;
    }

    private static void f(double d10) {
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw new c("Invalid value: Value cannot be NaN, Inf or -Inf.");
        }
    }

    public static void g(String str) {
        if (str != null && !a(str)) {
            throw new c("Invalid key: " + str + ". Keys must not contain '/', '.', '#', '$', '[', or ']'");
        }
    }

    public static void h(String str) {
        if (!b(str)) {
            throw new c("Invalid Firebase Database path: " + str + ". Firebase Database paths must not contain '.', '#', '$', '[', or ']'");
        }
    }

    public static void i(String str) {
        if (str.startsWith(".info")) {
            h(str.substring(5));
        } else if (str.startsWith("/.info")) {
            h(str.substring(6));
        } else {
            h(str);
        }
    }

    public static void j(String str) {
        if (!c(str)) {
            throw new c("Invalid key: " + str + ". Keys must not contain '/', '.', '#', '$', '[', or ']'");
        }
    }

    public static void k(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (!map.containsKey(".sv")) {
                for (Map.Entry entry : map.entrySet()) {
                    j((String) entry.getKey());
                    k(entry.getValue());
                }
            }
        } else if (obj instanceof List) {
            for (Object k10 : (List) obj) {
                k(k10);
            }
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            f(((Double) obj).doubleValue());
        }
    }

    public static void l(l lVar) {
        if (!d(lVar)) {
            throw new c("Invalid write location: " + lVar.toString());
        }
    }
}
