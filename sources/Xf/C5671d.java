package Xf;

import Of.C5487e;
import Pf.c;
import Pf.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.f;
import tg.C6736b;
import tg.g;
import tg.k;
import vg.C6755e;

/* renamed from: Xf.d  reason: case insensitive filesystem */
public final class C5671d extends C5669b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5671d(D d10) {
        super(d10);
        C6496s.h(d10, "javaTypeEnhancementState");
    }

    private final List B(g gVar) {
        if (gVar instanceof C6736b) {
            ArrayList arrayList = new ArrayList();
            for (g B10 : (Iterable) ((C6736b) gVar).b()) {
                C6565s.D(arrayList, B(B10));
            }
            return arrayList;
        } else if (gVar instanceof k) {
            return C6565s.e(((k) gVar).c().e());
        } else {
            return C6565s.n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Iterable m(c cVar) {
        h annotations;
        C6496s.h(cVar, "<this>");
        C5487e l10 = C6755e.l(cVar);
        if (l10 == null || (annotations = l10.getAnnotations()) == null) {
            return C6565s.n();
        }
        return annotations;
    }

    public boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Iterable c(c cVar, boolean z10) {
        List list;
        C6496s.h(cVar, "<this>");
        Map a10 = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a10.entrySet()) {
            f fVar = (f) entry.getKey();
            g gVar = (g) entry.getValue();
            if (!z10 || C6496s.c(fVar, I.f66264c)) {
                list = B(gVar);
            } else {
                list = C6565s.n();
            }
            C6565s.D(arrayList, list);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public ng.c k(c cVar) {
        C6496s.h(cVar, "<this>");
        return cVar.f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Object l(c cVar) {
        C6496s.h(cVar, "<this>");
        C5487e l10 = C6755e.l(cVar);
        C6496s.e(l10);
        return l10;
    }
}
