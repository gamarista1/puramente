package Ob;

import Ib.c;
import Lb.l;
import com.amazon.a.a.o.b.f;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d implements Iterable {

    /* renamed from: c  reason: collision with root package name */
    private static final Ib.c f52104c;

    /* renamed from: d  reason: collision with root package name */
    private static final d f52105d;

    /* renamed from: a  reason: collision with root package name */
    private final Object f52106a;

    /* renamed from: b  reason: collision with root package name */
    private final Ib.c f52107b;

    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f52108a;

        a(ArrayList arrayList) {
            this.f52108a = arrayList;
        }

        /* renamed from: b */
        public Void a(l lVar, Object obj, Void voidR) {
            this.f52108a.add(obj);
            return null;
        }
    }

    class b implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f52110a;

        b(List list) {
            this.f52110a = list;
        }

        /* renamed from: b */
        public Void a(l lVar, Object obj, Void voidR) {
            this.f52110a.add(new AbstractMap.SimpleImmutableEntry(lVar, obj));
            return null;
        }
    }

    public interface c {
        Object a(l lVar, Object obj, Object obj2);
    }

    static {
        Ib.c c10 = c.a.c(Ib.l.b(Tb.b.class));
        f52104c = c10;
        f52105d = new d((Object) null, c10);
    }

    public d(Object obj, Ib.c cVar) {
        this.f52106a = obj;
        this.f52107b = cVar;
    }

    public static d b() {
        return f52105d;
    }

    private Object h(l lVar, c cVar, Object obj) {
        Iterator it = this.f52107b.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            obj = ((d) entry.getValue()).h(lVar.x((Tb.b) entry.getKey()), cVar, obj);
        }
        Object obj2 = this.f52106a;
        if (obj2 != null) {
            return cVar.a(lVar, obj2, obj);
        }
        return obj;
    }

    public Object A(l lVar, i iVar) {
        Object obj = this.f52106a;
        if (obj != null && iVar.a(obj)) {
            return this.f52106a;
        }
        Iterator it = lVar.iterator();
        d dVar = this;
        while (it.hasNext()) {
            dVar = (d) dVar.f52107b.b((Tb.b) it.next());
            if (dVar == null) {
                return null;
            }
            Object obj2 = dVar.f52106a;
            if (obj2 != null && iVar.a(obj2)) {
                return dVar.f52106a;
            }
        }
        return null;
    }

    public d C(l lVar, Object obj) {
        if (lVar.isEmpty()) {
            return new d(obj, this.f52107b);
        }
        Tb.b E10 = lVar.E();
        d dVar = (d) this.f52107b.b(E10);
        if (dVar == null) {
            dVar = b();
        }
        return new d(this.f52106a, this.f52107b.n(E10, dVar.C(lVar.N(), obj)));
    }

    public d D(l lVar, d dVar) {
        Ib.c cVar;
        if (lVar.isEmpty()) {
            return dVar;
        }
        Tb.b E10 = lVar.E();
        d dVar2 = (d) this.f52107b.b(E10);
        if (dVar2 == null) {
            dVar2 = b();
        }
        d D10 = dVar2.D(lVar.N(), dVar);
        if (D10.isEmpty()) {
            cVar = this.f52107b.r(E10);
        } else {
            cVar = this.f52107b.n(E10, D10);
        }
        return new d(this.f52106a, cVar);
    }

    public d E(l lVar) {
        if (lVar.isEmpty()) {
            return this;
        }
        d dVar = (d) this.f52107b.b(lVar.E());
        if (dVar != null) {
            return dVar.E(lVar.N());
        }
        return b();
    }

    public Collection H() {
        ArrayList arrayList = new ArrayList();
        m(new a(arrayList));
        return arrayList;
    }

    public boolean a(i iVar) {
        Object obj = this.f52106a;
        if (obj != null && iVar.a(obj)) {
            return true;
        }
        Iterator it = this.f52107b.iterator();
        while (it.hasNext()) {
            if (((d) ((Map.Entry) it.next()).getValue()).a(iVar)) {
                return true;
            }
        }
        return false;
    }

    public l d(l lVar, i iVar) {
        l d10;
        Object obj = this.f52106a;
        if (obj != null && iVar.a(obj)) {
            return l.D();
        }
        if (lVar.isEmpty()) {
            return null;
        }
        Tb.b E10 = lVar.E();
        d dVar = (d) this.f52107b.b(E10);
        if (dVar == null || (d10 = dVar.d(lVar.N(), iVar)) == null) {
            return null;
        }
        return new l(E10).t(d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        Ib.c cVar = this.f52107b;
        if (cVar == null ? dVar.f52107b != null : !cVar.equals(dVar.f52107b)) {
            return false;
        }
        Object obj2 = this.f52106a;
        Object obj3 = dVar.f52106a;
        if (obj2 == null ? obj3 == null : obj2.equals(obj3)) {
            return true;
        }
        return false;
    }

    public l g(l lVar) {
        return d(lVar, i.f52118a);
    }

    public Object getValue() {
        return this.f52106a;
    }

    public int hashCode() {
        int i10;
        Object obj = this.f52106a;
        int i11 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        Ib.c cVar = this.f52107b;
        if (cVar != null) {
            i11 = cVar.hashCode();
        }
        return i12 + i11;
    }

    public boolean isEmpty() {
        if (this.f52106a != null || !this.f52107b.isEmpty()) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        m(new b(arrayList));
        return arrayList.iterator();
    }

    public Object k(Object obj, c cVar) {
        return h(l.D(), cVar, obj);
    }

    public void m(c cVar) {
        h(l.D(), cVar, (Object) null);
    }

    public Object n(l lVar) {
        if (lVar.isEmpty()) {
            return this.f52106a;
        }
        d dVar = (d) this.f52107b.b(lVar.E());
        if (dVar != null) {
            return dVar.n(lVar.N());
        }
        return null;
    }

    public d r(Tb.b bVar) {
        d dVar = (d) this.f52107b.b(bVar);
        if (dVar != null) {
            return dVar;
        }
        return b();
    }

    public Ib.c t() {
        return this.f52107b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ImmutableTree { value=");
        sb2.append(getValue());
        sb2.append(", children={");
        Iterator it = this.f52107b.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(((Tb.b) entry.getKey()).b());
            sb2.append(f.f37530b);
            sb2.append(entry.getValue());
        }
        sb2.append("} }");
        return sb2.toString();
    }

    public Object v(l lVar) {
        return x(lVar, i.f52118a);
    }

    public Object x(l lVar, i iVar) {
        Object obj;
        Object obj2 = this.f52106a;
        if (obj2 == null || !iVar.a(obj2)) {
            obj = null;
        } else {
            obj = this.f52106a;
        }
        Iterator it = lVar.iterator();
        d dVar = this;
        while (it.hasNext()) {
            dVar = (d) dVar.f52107b.b((Tb.b) it.next());
            if (dVar == null) {
                return obj;
            }
            Object obj3 = dVar.f52106a;
            if (obj3 != null && iVar.a(obj3)) {
                obj = dVar.f52106a;
            }
        }
        return obj;
    }

    public d z(l lVar) {
        Ib.c cVar;
        if (!lVar.isEmpty()) {
            Tb.b E10 = lVar.E();
            d dVar = (d) this.f52107b.b(E10);
            if (dVar == null) {
                return this;
            }
            d z10 = dVar.z(lVar.N());
            if (z10.isEmpty()) {
                cVar = this.f52107b.r(E10);
            } else {
                cVar = this.f52107b.n(E10, z10);
            }
            if (this.f52106a != null || !cVar.isEmpty()) {
                return new d(this.f52106a, cVar);
            }
            return b();
        } else if (this.f52107b.isEmpty()) {
            return b();
        } else {
            return new d((Object) null, this.f52107b);
        }
    }

    public d(Object obj) {
        this(obj, f52104c);
    }
}
