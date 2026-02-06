package W4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class g {

    /* renamed from: a  reason: collision with root package name */
    private final a f34814a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Map f34815b = new HashMap();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final Object f34816a;

        /* renamed from: b  reason: collision with root package name */
        private List f34817b;

        /* renamed from: c  reason: collision with root package name */
        a f34818c;

        /* renamed from: d  reason: collision with root package name */
        a f34819d;

        a() {
            this((Object) null);
        }

        public void a(Object obj) {
            if (this.f34817b == null) {
                this.f34817b = new ArrayList();
            }
            this.f34817b.add(obj);
        }

        public Object b() {
            int c10 = c();
            if (c10 > 0) {
                return this.f34817b.remove(c10 - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f34817b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f34819d = this;
            this.f34818c = this;
            this.f34816a = obj;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f34814a;
        aVar.f34819d = aVar2;
        aVar.f34818c = aVar2.f34818c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f34814a;
        aVar.f34819d = aVar2.f34819d;
        aVar.f34818c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f34819d;
        aVar2.f34818c = aVar.f34818c;
        aVar.f34818c.f34819d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f34818c.f34819d = aVar;
        aVar.f34819d.f34818c = aVar;
    }

    public Object a(l lVar) {
        a aVar = (a) this.f34815b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            this.f34815b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(l lVar, Object obj) {
        a aVar = (a) this.f34815b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            c(aVar);
            this.f34815b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f34814a.f34819d; !aVar.equals(this.f34814a); aVar = aVar.f34819d) {
            Object b10 = aVar.b();
            if (b10 != null) {
                return b10;
            }
            e(aVar);
            this.f34815b.remove(aVar.f34816a);
            ((l) aVar.f34816a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f34814a.f34818c;
        boolean z10 = false;
        while (!aVar.equals(this.f34814a)) {
            sb2.append('{');
            sb2.append(aVar.f34816a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f34818c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
