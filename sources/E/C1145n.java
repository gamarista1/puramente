package E;

import E.E;
import Ef.i;
import java.util.ArrayList;
import java.util.List;
import mf.C6565s;

/* renamed from: E.n  reason: case insensitive filesystem */
public abstract class C1145n {
    public static final List a(C1150t tVar, E e10, C1141j jVar) {
        i iVar;
        if (!jVar.d() && e10.isEmpty()) {
            return C6565s.n();
        }
        ArrayList arrayList = new ArrayList();
        if (jVar.d()) {
            iVar = new i(jVar.c(), Math.min(jVar.b(), tVar.a() - 1));
        } else {
            iVar = i.f62825e.a();
        }
        int size = e10.size();
        for (int i10 = 0; i10 < size; i10++) {
            E.a aVar = (E.a) e10.get(i10);
            int a10 = u.a(tVar, aVar.getKey(), aVar.getIndex());
            int k10 = iVar.k();
            if ((a10 > iVar.n() || k10 > a10) && a10 >= 0 && a10 < tVar.a()) {
                arrayList.add(Integer.valueOf(a10));
            }
        }
        int k11 = iVar.k();
        int n10 = iVar.n();
        if (k11 <= n10) {
            while (true) {
                arrayList.add(Integer.valueOf(k11));
                if (k11 == n10) {
                    break;
                }
                k11++;
            }
        }
        return arrayList;
    }
}
