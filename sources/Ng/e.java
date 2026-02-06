package ng;

import Sg.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;

public abstract class e {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f72297a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ng.k[] r0 = ng.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ng.k r1 = ng.k.BEGINNING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ng.k r1 = ng.k.AFTER_DOT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ng.k r1 = ng.k.MIDDLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f72297a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ng.e.a.<clinit>():void");
        }
    }

    public static final Object a(c cVar, Map map) {
        Object obj;
        C6496s.h(cVar, "<this>");
        C6496s.h(map, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            c cVar2 = (c) entry.getKey();
            if (C6496s.c(cVar, cVar2) || b(cVar, cVar2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int length = g((c) ((Map.Entry) obj).getKey(), cVar).b().length();
                do {
                    Object next = it.next();
                    int length2 = g((c) ((Map.Entry) next).getKey(), cVar).b().length();
                    if (length > length2) {
                        obj = next;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }

    public static final boolean b(c cVar, c cVar2) {
        C6496s.h(cVar, "<this>");
        C6496s.h(cVar2, "packageName");
        return C6496s.c(f(cVar), cVar2);
    }

    private static final boolean c(String str, String str2) {
        if (!p.J(str, str2, false, 2, (Object) null) || str.charAt(str2.length()) != '.') {
            return false;
        }
        return true;
    }

    public static final boolean d(c cVar, c cVar2) {
        C6496s.h(cVar, "<this>");
        C6496s.h(cVar2, "packageName");
        if (C6496s.c(cVar, cVar2) || cVar2.d()) {
            return true;
        }
        String b10 = cVar.b();
        C6496s.g(b10, "asString(...)");
        String b11 = cVar2.b();
        C6496s.g(b11, "asString(...)");
        return c(b10, b11);
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.BEGINNING;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            int i11 = a.f72297a[kVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierStart(charAt)) {
                    return false;
                }
                kVar = k.MIDDLE;
            } else if (i11 != 3) {
                throw new C6535s();
            } else if (charAt == '.') {
                kVar = k.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        if (kVar != k.AFTER_DOT) {
            return true;
        }
        return false;
    }

    public static final c f(c cVar) {
        C6496s.h(cVar, "<this>");
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    public static final c g(c cVar, c cVar2) {
        C6496s.h(cVar, "<this>");
        C6496s.h(cVar2, "prefix");
        if (!d(cVar, cVar2) || cVar2.d()) {
            return cVar;
        }
        if (C6496s.c(cVar, cVar2)) {
            c cVar3 = c.f72287c;
            C6496s.g(cVar3, "ROOT");
            return cVar3;
        }
        String b10 = cVar.b();
        C6496s.g(b10, "asString(...)");
        String substring = b10.substring(cVar2.b().length() + 1);
        C6496s.g(substring, "substring(...)");
        return new c(substring);
    }
}
