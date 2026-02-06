package Tb;

import Ib.e;
import com.google.android.gms.common.internal.C4535q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class i implements Iterable {

    /* renamed from: d  reason: collision with root package name */
    private static final e f52531d = new e(Collections.emptyList(), (Comparator) null);

    /* renamed from: a  reason: collision with root package name */
    private final n f52532a;

    /* renamed from: b  reason: collision with root package name */
    private e f52533b;

    /* renamed from: c  reason: collision with root package name */
    private final h f52534c;

    private i(n nVar, h hVar) {
        this.f52534c = hVar;
        this.f52532a = nVar;
        this.f52533b = null;
    }

    private void a() {
        if (this.f52533b != null) {
            return;
        }
        if (this.f52534c.equals(j.j())) {
            this.f52533b = f52531d;
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (m mVar : this.f52532a) {
            if (z10 || this.f52534c.e(mVar.d())) {
                z10 = true;
            } else {
                z10 = false;
            }
            arrayList.add(new m(mVar.c(), mVar.d()));
        }
        if (z10) {
            this.f52533b = new e(arrayList, this.f52534c);
        } else {
            this.f52533b = f52531d;
        }
    }

    public static i b(n nVar) {
        return new i(nVar, q.j());
    }

    public static i d(n nVar, h hVar) {
        return new i(nVar, hVar);
    }

    public m g() {
        if (!(this.f52532a instanceof c)) {
            return null;
        }
        a();
        if (!C4535q.b(this.f52533b, f52531d)) {
            return (m) this.f52533b.b();
        }
        b t10 = ((c) this.f52532a).t();
        return new m(t10, this.f52532a.k0(t10));
    }

    public m h() {
        if (!(this.f52532a instanceof c)) {
            return null;
        }
        a();
        if (!C4535q.b(this.f52533b, f52531d)) {
            return (m) this.f52533b.a();
        }
        b x10 = ((c) this.f52532a).x();
        return new m(x10, this.f52532a.k0(x10));
    }

    public Iterator iterator() {
        a();
        if (C4535q.b(this.f52533b, f52531d)) {
            return this.f52532a.iterator();
        }
        return this.f52533b.iterator();
    }

    public n k() {
        return this.f52532a;
    }

    public b m(b bVar, n nVar, h hVar) {
        if (this.f52534c.equals(j.j()) || this.f52534c.equals(hVar)) {
            a();
            if (C4535q.b(this.f52533b, f52531d)) {
                return this.f52532a.B(bVar);
            }
            m mVar = (m) this.f52533b.d(new m(bVar, nVar));
            if (mVar != null) {
                return mVar.c();
            }
            return null;
        }
        throw new IllegalArgumentException("Index not available in IndexedNode!");
    }

    public Iterator m0() {
        a();
        if (C4535q.b(this.f52533b, f52531d)) {
            return this.f52532a.m0();
        }
        return this.f52533b.m0();
    }

    public boolean n(h hVar) {
        if (this.f52534c == hVar) {
            return true;
        }
        return false;
    }

    public i r(b bVar, n nVar) {
        n b02 = this.f52532a.b0(bVar, nVar);
        e eVar = this.f52533b;
        e eVar2 = f52531d;
        if (C4535q.b(eVar, eVar2) && !this.f52534c.e(nVar)) {
            return new i(b02, this.f52534c, eVar2);
        }
        e eVar3 = this.f52533b;
        if (eVar3 == null || C4535q.b(eVar3, eVar2)) {
            return new i(b02, this.f52534c, (e) null);
        }
        e h10 = this.f52533b.h(new m(bVar, this.f52532a.k0(bVar)));
        if (!nVar.isEmpty()) {
            h10 = h10.g(new m(bVar, nVar));
        }
        return new i(b02, this.f52534c, h10);
    }

    public i t(n nVar) {
        return new i(this.f52532a.V(nVar), this.f52534c, this.f52533b);
    }

    private i(n nVar, h hVar, e eVar) {
        this.f52534c = hVar;
        this.f52532a = nVar;
        this.f52533b = eVar;
    }
}
