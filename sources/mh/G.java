package mh;

import gh.C5986j;
import ih.f;
import ih.j;
import ih.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lh.C6538b;
import lh.r;
import lh.s;
import lh.z;
import mf.C6565s;
import mf.O;
import mh.C6607y;
import yf.C6787a;

public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    private static final C6607y.a f72116a = new C6607y.a();

    /* renamed from: b  reason: collision with root package name */
    private static final C6607y.a f72117b = new C6607y.a();

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f72118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6538b f72119b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, C6538b bVar) {
            super(0);
            this.f72118a = fVar;
            this.f72119b = bVar;
        }

        public final Map invoke() {
            return G.b(this.f72118a, this.f72119b);
        }
    }

    /* access modifiers changed from: private */
    public static final Map b(f fVar, C6538b bVar) {
        String str;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean d10 = d(bVar, fVar);
        l(fVar, bVar);
        int d11 = fVar.d();
        for (int i10 = 0; i10 < d11; i10++) {
            ArrayList arrayList = new ArrayList();
            for (Object next : fVar.f(i10)) {
                if (next instanceof r) {
                    arrayList.add(next);
                }
            }
            r rVar = (r) C6565s.R0(arrayList);
            if (!(rVar == null || (names = rVar.names()) == null)) {
                for (String str2 : names) {
                    if (d10) {
                        str2 = str2.toLowerCase(Locale.ROOT);
                        C6496s.g(str2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, str2, i10);
                }
            }
            if (d10) {
                str = fVar.e(i10).toLowerCase(Locale.ROOT);
                C6496s.g(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                c(linkedHashMap, fVar, str, i10);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return O.i();
        }
        return linkedHashMap;
    }

    private static final void c(Map map, f fVar, String str, int i10) {
        String str2;
        if (C6496s.c(fVar.h(), j.b.f68505a)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new E("The suggested name '" + str + "' for " + str2 + ' ' + fVar.e(i10) + " is already one of the names for " + str2 + ' ' + fVar.e(((Number) O.j(map, str)).intValue()) + " in " + fVar);
    }

    private static final boolean d(C6538b bVar, f fVar) {
        if (!bVar.f().g() || !C6496s.c(fVar.h(), j.b.f68505a)) {
            return false;
        }
        return true;
    }

    public static final Map e(C6538b bVar, f fVar) {
        C6496s.h(bVar, "<this>");
        C6496s.h(fVar, "descriptor");
        return (Map) z.a(bVar).b(fVar, f72116a, new a(fVar, bVar));
    }

    public static final C6607y.a f() {
        return f72116a;
    }

    public static final String g(f fVar, C6538b bVar, int i10) {
        C6496s.h(fVar, "<this>");
        C6496s.h(bVar, "json");
        l(fVar, bVar);
        return fVar.e(i10);
    }

    public static final int h(f fVar, C6538b bVar, String str) {
        C6496s.h(fVar, "<this>");
        C6496s.h(bVar, "json");
        C6496s.h(str, "name");
        if (d(bVar, fVar)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C6496s.g(lowerCase, "toLowerCase(...)");
            return k(fVar, bVar, lowerCase);
        }
        l(fVar, bVar);
        int c10 = fVar.c(str);
        if (c10 == -3 && bVar.f().n()) {
            return k(fVar, bVar, str);
        }
        return c10;
    }

    public static final int i(f fVar, C6538b bVar, String str, String str2) {
        C6496s.h(fVar, "<this>");
        C6496s.h(bVar, "json");
        C6496s.h(str, "name");
        C6496s.h(str2, "suffix");
        int h10 = h(fVar, bVar, str);
        if (h10 != -3) {
            return h10;
        }
        throw new C5986j(fVar.i() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int j(f fVar, C6538b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return i(fVar, bVar, str, str2);
    }

    private static final int k(f fVar, C6538b bVar, String str) {
        Integer num = (Integer) e(bVar, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final s l(f fVar, C6538b bVar) {
        C6496s.h(fVar, "<this>");
        C6496s.h(bVar, "json");
        if (!C6496s.c(fVar.h(), k.a.f68506a)) {
            return null;
        }
        bVar.f().k();
        return null;
    }
}
