package wg;

import Lf.l;
import com.adjust.sdk.Constants;
import io.intercom.android.sdk.models.AttributeType;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ng.c;

/* renamed from: wg.e  reason: case insensitive filesystem */
public enum C6769e {
    BOOLEAN(l.BOOLEAN, AttributeType.BOOLEAN, "Z", "java.lang.Boolean"),
    CHAR(l.CHAR, "char", "C", "java.lang.Character"),
    BYTE(l.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(l.SHORT, "short", "S", "java.lang.Short"),
    INT(l.INT, "int", "I", "java.lang.Integer"),
    FLOAT(l.FLOAT, AttributeType.FLOAT, "F", "java.lang.Float"),
    LONG(l.LONG, Constants.LONG, "J", "java.lang.Long"),
    DOUBLE(l.DOUBLE, "double", "D", "java.lang.Double");
    

    /* renamed from: m  reason: collision with root package name */
    private static final Map f73759m = null;

    /* renamed from: n  reason: collision with root package name */
    private static final Map f73760n = null;

    /* renamed from: o  reason: collision with root package name */
    private static final Map f73761o = null;

    /* renamed from: p  reason: collision with root package name */
    private static final Set f73762p = null;

    /* renamed from: q  reason: collision with root package name */
    private static final Map f73763q = null;

    /* renamed from: a  reason: collision with root package name */
    private final l f73765a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73766b;

    /* renamed from: c  reason: collision with root package name */
    private final String f73767c;

    /* renamed from: d  reason: collision with root package name */
    private final c f73768d;

    static {
        f73759m = new HashMap();
        f73760n = new EnumMap(l.class);
        f73761o = new HashMap();
        f73762p = new HashSet();
        f73763q = new HashMap();
        for (C6769e eVar : values()) {
            f73759m.put(eVar.f(), eVar);
            f73760n.put(eVar.i(), eVar);
            f73761o.put(eVar.e(), eVar);
            String replace = eVar.f73768d.b().replace('.', '/');
            f73762p.add(replace);
            f73763q.put(replace, "(" + eVar.f73767c + ")L" + replace + ";");
        }
    }

    private C6769e(l lVar, String str, String str2, String str3) {
        if (lVar == null) {
            a(8);
        }
        if (str == null) {
            a(9);
        }
        if (str2 == null) {
            a(10);
        }
        if (str3 == null) {
            a(11);
        }
        this.f73765a = lVar;
        this.f73766b = str;
        this.f73767c = str2;
        this.f73768d = new c(str3);
    }

    public static C6769e b(l lVar) {
        if (lVar == null) {
            a(5);
        }
        C6769e eVar = (C6769e) f73760n.get(lVar);
        if (eVar == null) {
            a(6);
        }
        return eVar;
    }

    public static C6769e c(String str) {
        if (str == null) {
            a(3);
        }
        C6769e eVar = (C6769e) f73759m.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public String e() {
        String str = this.f73767c;
        if (str == null) {
            a(14);
        }
        return str;
    }

    public String f() {
        String str = this.f73766b;
        if (str == null) {
            a(13);
        }
        return str;
    }

    public l i() {
        l lVar = this.f73765a;
        if (lVar == null) {
            a(12);
        }
        return lVar;
    }

    public c j() {
        c cVar = this.f73768d;
        if (cVar == null) {
            a(15);
        }
        return cVar;
    }
}
