package k5;

import T4.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List f45138a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Map f45139b = new HashMap();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f45140a;

        /* renamed from: b  reason: collision with root package name */
        final Class f45141b;

        /* renamed from: c  reason: collision with root package name */
        final k f45142c;

        public a(Class cls, Class cls2, k kVar) {
            this.f45140a = cls;
            this.f45141b = cls2;
            this.f45142c = kVar;
        }

        public boolean a(Class cls, Class cls2) {
            if (!this.f45140a.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f45141b)) {
                return false;
            }
            return true;
        }
    }

    private synchronized List c(String str) {
        List list;
        try {
            if (!this.f45138a.contains(str)) {
                this.f45138a.add(str);
            }
            list = (List) this.f45139b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f45139b.put(str, list);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return list;
    }

    public synchronized void a(String str, k kVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, kVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f45138a) {
            List<a> list = (List) this.f45139b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f45142c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f45138a) {
            List<a> list = (List) this.f45139b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f45141b)) {
                        arrayList.add(aVar.f45141b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(String str, k kVar, Class cls, Class cls2) {
        c(str).add(0, new a(cls, cls2, kVar));
    }

    public synchronized void f(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList<>(this.f45138a);
            this.f45138a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f45138a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f45138a.add(str);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
