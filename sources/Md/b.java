package Md;

import Pd.c;
import Pd.i;
import Pd.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map f52055a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f52056b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final List f52057c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f52058d = false;

    public b(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e((c) it.next());
        }
        for (Object a10 : collection2) {
            android.support.v4.media.session.c.a(a10);
            f((j) null);
        }
    }

    public synchronized void a() {
        if (!this.f52058d) {
            c();
            this.f52058d = true;
        }
    }

    public Object b(Class cls) {
        return this.f52055a.get(cls);
    }

    public void c() {
        ArrayList<i> arrayList = new ArrayList<>(this.f52055a.values());
        for (WeakReference weakReference : this.f52057c) {
            i iVar = (i) weakReference.get();
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        for (i p10 : arrayList) {
            p10.p(this);
        }
    }

    public void d() {
        ArrayList<i> arrayList = new ArrayList<>(this.f52055a.values());
        for (WeakReference weakReference : this.f52057c) {
            i iVar = (i) weakReference.get();
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        for (i onDestroy : arrayList) {
            onDestroy.onDestroy();
        }
    }

    public void e(c cVar) {
        for (Class put : cVar.o()) {
            this.f52055a.put(put, cVar);
        }
    }

    public void f(j jVar) {
        this.f52056b.put(jVar.getName(), jVar);
    }
}
