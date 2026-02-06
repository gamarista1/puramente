package V6;

import T5.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private final D f34713a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap f34714b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private int f34715c = 0;

    public m(D d10) {
        this.f34713a = d10;
    }

    private int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return this.f34713a.a(obj);
    }

    public synchronized boolean a(Object obj) {
        return this.f34714b.containsKey(obj);
    }

    public synchronized Object b(Object obj) {
        return this.f34714b.get(obj);
    }

    public synchronized int c() {
        return this.f34714b.size();
    }

    public synchronized Object d() {
        Object obj;
        if (this.f34714b.isEmpty()) {
            obj = null;
        } else {
            obj = this.f34714b.keySet().iterator().next();
        }
        return obj;
    }

    public synchronized ArrayList e(l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f34714b.entrySet().size());
            for (Map.Entry entry : this.f34714b.entrySet()) {
                if (lVar != null) {
                    if (lVar.apply(entry.getKey())) {
                    }
                }
                arrayList.add(entry);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return arrayList;
    }

    public synchronized int f() {
        return this.f34715c;
    }

    public synchronized Object h(Object obj, Object obj2) {
        Object remove;
        remove = this.f34714b.remove(obj);
        this.f34715c -= g(remove);
        this.f34714b.put(obj, obj2);
        this.f34715c += g(obj2);
        return remove;
    }

    public synchronized Object i(Object obj) {
        Object remove;
        remove = this.f34714b.remove(obj);
        this.f34715c -= g(remove);
        return remove;
    }

    public synchronized ArrayList j(l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f34714b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (lVar != null) {
                    if (lVar.apply(entry.getKey())) {
                    }
                }
                arrayList.add(entry.getValue());
                this.f34715c -= g(entry.getValue());
                it.remove();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return arrayList;
    }

    public synchronized void k() {
        if (this.f34714b.isEmpty()) {
            this.f34715c = 0;
        }
    }
}
