package ng;

import Ef.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;

public abstract class j {
    /* access modifiers changed from: private */
    public static final b k(String str) {
        c b10 = i.f72359a.b();
        f i10 = f.i(str);
        C6496s.g(i10, "identifier(...)");
        return new b(b10, i10);
    }

    /* access modifiers changed from: private */
    public static final b l(String str) {
        c f10 = i.f72359a.f();
        f i10 = f.i(str);
        C6496s.g(i10, "identifier(...)");
        return new b(f10, i10);
    }

    /* access modifiers changed from: private */
    public static final b m(String str) {
        c c10 = i.f72359a.c();
        f i10 = f.i(str);
        C6496s.g(i10, "identifier(...)");
        return new b(c10, i10);
    }

    /* access modifiers changed from: private */
    public static final b n(String str) {
        c d10 = i.f72359a.d();
        f i10 = f.i(str);
        C6496s.g(i10, "identifier(...)");
        return new b(d10, i10);
    }

    /* access modifiers changed from: private */
    public static final b o(String str) {
        c e10 = i.f72359a.e();
        f i10 = f.i(str);
        C6496s.g(i10, "identifier(...)");
        return new b(e10, i10);
    }

    /* access modifiers changed from: private */
    public static final Map p(Map map) {
        Iterable<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Pair a10 = C6502A.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(a10.c(), a10.d());
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    public static final b q(f fVar) {
        i iVar = i.f72359a;
        c f10 = iVar.a().f();
        f i10 = f.i(fVar.e() + iVar.a().h().e());
        C6496s.g(i10, "identifier(...)");
        return new b(f10, i10);
    }

    /* access modifiers changed from: private */
    public static final b r(String str) {
        c g10 = i.f72359a.g();
        f i10 = f.i(str);
        C6496s.g(i10, "identifier(...)");
        return new b(g10, i10);
    }

    /* access modifiers changed from: private */
    public static final b s(String str) {
        c h10 = i.f72359a.h();
        f i10 = f.i(str);
        C6496s.g(i10, "identifier(...)");
        return new b(h10, i10);
    }

    /* access modifiers changed from: private */
    public static final b t(b bVar) {
        c f10 = i.f72359a.f();
        f i10 = f.i('U' + bVar.h().e());
        C6496s.g(i10, "identifier(...)");
        return new b(f10, i10);
    }
}
