package Qb;

import Lb.C4375i;
import Ob.l;
import Qb.e;
import Tb.h;
import Tb.i;
import Tb.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final i f52265a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final h f52266b;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            boolean z10;
            if (cVar.i() == null || cVar2.i() == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            l.f(z10);
            return f.this.f52266b.compare(new m(cVar.i(), cVar.k().k()), new m(cVar2.i(), cVar2.k().k()));
        }
    }

    public f(i iVar) {
        this.f52265a = iVar;
        this.f52266b = iVar.c();
    }

    private Comparator b() {
        return new a();
    }

    private d c(c cVar, C4375i iVar, i iVar2) {
        if (!cVar.j().equals(e.a.VALUE) && !cVar.j().equals(e.a.CHILD_REMOVED)) {
            cVar = cVar.a(iVar2.m(cVar.i(), cVar.k().k(), this.f52266b));
        }
        return iVar.b(cVar, this.f52265a);
    }

    private void e(List list, e.a aVar, List list2, List list3, i iVar) {
        ArrayList<c> arrayList = new ArrayList<>();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.j().equals(aVar)) {
                arrayList.add(cVar);
            }
        }
        Collections.sort(arrayList, b());
        for (c cVar2 : arrayList) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                C4375i iVar2 = (C4375i) it2.next();
                if (iVar2.i(aVar)) {
                    list.add(c(cVar2, iVar2, iVar));
                }
            }
        }
    }

    public List d(List list, i iVar, List list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.j().equals(e.a.CHILD_CHANGED) && this.f52266b.d(cVar.l().k(), cVar.k().k())) {
                arrayList2.add(c.f(cVar.i(), cVar.k()));
            }
        }
        ArrayList arrayList3 = arrayList;
        List list3 = list;
        List list4 = list2;
        i iVar2 = iVar;
        e(arrayList3, e.a.CHILD_REMOVED, list3, list4, iVar2);
        e(arrayList3, e.a.CHILD_ADDED, list3, list4, iVar2);
        e(arrayList3, e.a.CHILD_MOVED, arrayList2, list4, iVar2);
        List list5 = list;
        e(arrayList3, e.a.CHILD_CHANGED, list5, list4, iVar2);
        e(arrayList3, e.a.VALUE, list5, list4, iVar2);
        return arrayList;
    }
}
