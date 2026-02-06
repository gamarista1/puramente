package vb;

import android.content.Context;
import android.os.Bundle;
import ic.C5027b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xb.C5276a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final C5027b f61753a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61754b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f61755c = null;

    public c(Context context, C5027b bVar, String str) {
        this.f61753a = bVar;
        this.f61754b = str;
    }

    private void a(C5276a.C0916a aVar) {
        ((C5276a) this.f61753a.get()).a(aVar);
    }

    private void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i10 = i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5247b bVar = (C5247b) it.next();
            while (arrayDeque.size() >= i10) {
                k(((C5276a.C0916a) arrayDeque.pollFirst()).f62202b);
            }
            C5276a.C0916a f10 = bVar.f(this.f61754b);
            a(f10);
            arrayDeque.offer(f10);
        }
    }

    private static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C5247b.b((Map) it.next()));
        }
        return arrayList;
    }

    private boolean d(List list, C5247b bVar) {
        String c10 = bVar.c();
        String e10 = bVar.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5247b bVar2 = (C5247b) it.next();
            if (bVar2.c().equals(c10) && bVar2.e().equals(e10)) {
                return true;
            }
        }
        return false;
    }

    private List f() {
        return ((C5276a) this.f61753a.get()).f(this.f61754b, "");
    }

    private ArrayList g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5247b bVar = (C5247b) it.next();
            if (!d(list2, bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private ArrayList h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5247b bVar = (C5247b) it.next();
            if (!d(list2, bVar)) {
                arrayList.add(bVar.f(this.f61754b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.f61755c == null) {
            this.f61755c = Integer.valueOf(((C5276a) this.f61753a.get()).e(this.f61754b));
        }
        return this.f61755c.intValue();
    }

    private void k(String str) {
        ((C5276a) this.f61753a.get()).clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    private void l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k(((C5276a.C0916a) it.next()).f62202b);
        }
    }

    private void n(List list) {
        if (list.isEmpty()) {
            j();
            return;
        }
        List e10 = e();
        l(h(e10, list));
        b(g(list, e10));
    }

    private void o() {
        if (this.f61753a.get() == null) {
            throw new C5246a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public List e() {
        o();
        List<C5276a.C0916a> f10 = f();
        ArrayList arrayList = new ArrayList();
        for (C5276a.C0916a a10 : f10) {
            arrayList.add(C5247b.a(a10));
        }
        return arrayList;
    }

    public void j() {
        o();
        l(f());
    }

    public void m(List list) {
        o();
        if (list != null) {
            n(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
