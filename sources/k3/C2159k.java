package k3;

import j3.C2134e;
import j3.p;
import j3.v;
import java.util.Iterator;
import java.util.List;
import mf.C6565s;
import yf.C6798l;
import yf.r;

/* renamed from: k3.k  reason: case insensitive filesystem */
public abstract class C2159k {
    public static final void a(v vVar, String str, List list, List list2, C6798l lVar, C6798l lVar2, C6798l lVar3, C6798l lVar4, C6798l lVar5, r rVar) {
        C2154f fVar = new C2154f((C2153e) vVar.h().d(C2153e.class), str, rVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2134e eVar = (C2134e) it.next();
            fVar.a(eVar.a(), eVar.b());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            fVar.c((p) it2.next());
        }
        fVar.h(lVar);
        fVar.i(lVar2);
        fVar.j(lVar3);
        fVar.k(lVar4);
        fVar.l(lVar5);
        vVar.g(fVar);
    }

    public static /* synthetic */ void b(v vVar, String str, List list, List list2, C6798l lVar, C6798l lVar2, C6798l lVar3, C6798l lVar4, C6798l lVar5, r rVar, int i10, Object obj) {
        List list3;
        List list4;
        C6798l lVar6;
        C6798l lVar7;
        C6798l lVar8;
        C6798l lVar9;
        C6798l lVar10;
        int i11 = i10;
        if ((i11 & 2) != 0) {
            list3 = C6565s.n();
        } else {
            list3 = list;
        }
        if ((i11 & 4) != 0) {
            list4 = C6565s.n();
        } else {
            list4 = list2;
        }
        if ((i11 & 8) != 0) {
            lVar6 = null;
        } else {
            lVar6 = lVar;
        }
        if ((i11 & 16) != 0) {
            lVar7 = null;
        } else {
            lVar7 = lVar2;
        }
        if ((i11 & 32) != 0) {
            lVar8 = lVar6;
        } else {
            lVar8 = lVar3;
        }
        if ((i11 & 64) != 0) {
            lVar9 = lVar7;
        } else {
            lVar9 = lVar4;
        }
        if ((i11 & 128) != 0) {
            lVar10 = null;
        } else {
            lVar10 = lVar5;
        }
        a(vVar, str, list3, list4, lVar6, lVar7, lVar8, lVar9, lVar10, rVar);
    }
}
