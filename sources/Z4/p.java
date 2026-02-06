package Z4;

import com.bumptech.glide.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x1.e;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final r f35905a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35906b;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map f35907a = new HashMap();

        /* renamed from: Z4.p$a$a  reason: collision with other inner class name */
        private static class C0586a {

            /* renamed from: a  reason: collision with root package name */
            final List f35908a;

            public C0586a(List list) {
                this.f35908a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f35907a.clear();
        }

        public List b(Class cls) {
            C0586a aVar = (C0586a) this.f35907a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f35908a;
        }

        public void c(Class cls, List list) {
            if (((C0586a) this.f35907a.put(cls, new C0586a(list))) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public p(e eVar) {
        this(new r(eVar));
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List b10;
        b10 = this.f35906b.b(cls);
        if (b10 == null) {
            b10 = Collections.unmodifiableList(this.f35905a.e(cls));
            this.f35906b.c(cls, b10);
        }
        return b10;
    }

    private void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o) it.next()).teardown();
        }
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f35905a.b(cls, cls2, oVar);
        this.f35906b.a();
    }

    public synchronized List c(Class cls) {
        return this.f35905a.g(cls);
    }

    public List d(Object obj) {
        List e10 = e(b(obj));
        if (!e10.isEmpty()) {
            int size = e10.size();
            List emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = (n) e10.get(i10);
                if (nVar.b(obj)) {
                    if (z10) {
                        emptyList = new ArrayList(size - i10);
                        z10 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new j.c(obj, e10);
        }
        throw new j.c(obj);
    }

    public synchronized void f(Class cls, Class cls2, o oVar) {
        g(this.f35905a.j(cls, cls2, oVar));
        this.f35906b.a();
    }

    private p(r rVar) {
        this.f35906b = new a();
        this.f35905a = rVar;
    }
}
