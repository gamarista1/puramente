package Tf;

import Rf.C5527p;
import gg.C5964n;
import gg.C5973w;
import gg.C5974x;
import hg.C5996a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.b;
import ng.c;
import wg.C6768d;
import yg.C6803b;
import yg.C6812k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final C5964n f65149a;

    /* renamed from: b  reason: collision with root package name */
    private final g f65150b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap f65151c = new ConcurrentHashMap();

    public a(C5964n nVar, g gVar) {
        C6496s.h(nVar, "resolver");
        C6496s.h(gVar, "kotlinClassFinder");
        this.f65149a = nVar;
        this.f65150b = gVar;
    }

    public final C6812k a(f fVar) {
        List<C5974x> list;
        C6496s.h(fVar, "fileClass");
        ConcurrentHashMap concurrentHashMap = this.f65151c;
        b d10 = fVar.d();
        Object obj = concurrentHashMap.get(d10);
        if (obj == null) {
            c f10 = fVar.d().f();
            if (fVar.e().c() == C5996a.C1007a.MULTIFILE_CLASS) {
                list = new ArrayList<>();
                for (String d11 : fVar.e().f()) {
                    b.a aVar = b.f72283d;
                    c e10 = C6768d.d(d11).e();
                    C6496s.g(e10, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    C5974x b10 = C5973w.b(this.f65150b, aVar.c(e10), Pg.c.a(this.f65149a.f().g()));
                    if (b10 != null) {
                        list.add(b10);
                    }
                }
            } else {
                list = C6565s.e(fVar);
            }
            C5527p pVar = new C5527p(this.f65149a.f().q(), f10);
            ArrayList arrayList = new ArrayList();
            for (C5974x c10 : list) {
                C6812k c11 = this.f65149a.c(pVar, c10);
                if (c11 != null) {
                    arrayList.add(c11);
                }
            }
            Iterable e12 = C6565s.e1(arrayList);
            C6803b.a aVar2 = C6803b.f73902d;
            Object a10 = aVar2.a("package " + f10 + " (" + fVar + ')', e12);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(d10, a10);
            if (putIfAbsent == null) {
                obj = a10;
            } else {
                obj = putIfAbsent;
            }
        }
        C6496s.g(obj, "getOrPut(...)");
        return (C6812k) obj;
    }
}
