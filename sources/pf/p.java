package Pf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import ng.c;
import yf.C6798l;

public final class p implements h {

    /* renamed from: a  reason: collision with root package name */
    private final h f64615a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f64616b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f64617c;

    public p(h hVar, boolean z10, C6798l lVar) {
        C6496s.h(hVar, "delegate");
        C6496s.h(lVar, "fqNameFilter");
        this.f64615a = hVar;
        this.f64616b = z10;
        this.f64617c = lVar;
    }

    private final boolean a(c cVar) {
        c f10 = cVar.f();
        if (f10 == null || !((Boolean) this.f64617c.invoke(f10)).booleanValue()) {
            return false;
        }
        return true;
    }

    public c i(c cVar) {
        C6496s.h(cVar, "fqName");
        if (((Boolean) this.f64617c.invoke(cVar)).booleanValue()) {
            return this.f64615a.i(cVar);
        }
        return null;
    }

    public boolean isEmpty() {
        boolean z10;
        h hVar = this.f64615a;
        if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
            Iterator it = hVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (a((c) it.next())) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        if (!this.f64616b) {
            return z10;
        }
        if (!z10) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        h hVar = this.f64615a;
        ArrayList arrayList = new ArrayList();
        for (Object next : hVar) {
            if (a((c) next)) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    public boolean n0(c cVar) {
        C6496s.h(cVar, "fqName");
        if (((Boolean) this.f64617c.invoke(cVar)).booleanValue()) {
            return this.f64615a.n0(cVar);
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p(h hVar, C6798l lVar) {
        this(hVar, false, lVar);
        C6496s.h(hVar, "delegate");
        C6496s.h(lVar, "fqNameFilter");
    }
}
