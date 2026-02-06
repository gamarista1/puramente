package Ib;

import Ib.h;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class c implements Iterable {
    public abstract boolean a(Object obj);

    public abstract Object b(Object obj);

    public abstract Comparator d();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!d().equals(cVar.d()) || size() != cVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Object g();

    public abstract Object h();

    public int hashCode() {
        int hashCode = d().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return hashCode;
    }

    public abstract boolean isEmpty();

    public abstract Iterator iterator();

    public abstract Object k(Object obj);

    public abstract void m(h.b bVar);

    public abstract Iterator m0();

    public abstract c n(Object obj, Object obj2);

    public abstract c r(Object obj);

    public abstract int size();

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        Iterator it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append("(");
            sb2.append(entry.getKey());
            sb2.append("=>");
            sb2.append(entry.getValue());
            sb2.append(")");
        }
        sb2.append("};");
        return sb2.toString();
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final C0782a f51137a = new b();

        /* renamed from: Ib.c$a$a  reason: collision with other inner class name */
        public interface C0782a {
            Object a(Object obj);
        }

        public static c b(List list, Map map, C0782a aVar, Comparator comparator) {
            if (list.size() < 25) {
                return a.z(list, map, aVar, comparator);
            }
            return k.t(list, map, aVar, comparator);
        }

        public static c c(Comparator comparator) {
            return new a(comparator);
        }

        public static c d(Map map, Comparator comparator) {
            if (map.size() < 25) {
                return a.D(map, comparator);
            }
            return k.v(map, comparator);
        }

        public static C0782a e() {
            return f51137a;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ Object f(Object obj) {
            return obj;
        }
    }
}
