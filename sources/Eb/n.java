package Eb;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import dc.C4944c;
import dc.C4945d;
import ic.C5026a;
import ic.C5027b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import w.C2780Y;

public class n implements C4283d, Xb.a {

    /* renamed from: i  reason: collision with root package name */
    private static final C5027b f50718i = new j();

    /* renamed from: a  reason: collision with root package name */
    private final Map f50719a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f50720b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f50721c;

    /* renamed from: d  reason: collision with root package name */
    private final List f50722d;

    /* renamed from: e  reason: collision with root package name */
    private Set f50723e;

    /* renamed from: f  reason: collision with root package name */
    private final u f50724f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference f50725g;

    /* renamed from: h  reason: collision with root package name */
    private final i f50726h;

    public static b l(Executor executor) {
        return new b(executor);
    }

    private void m(List list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator it = this.f50722d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((C5027b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f50726h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C4282c) it2.next()).j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    Object obj = array[i10];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f50723e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f50723e.add(obj.toString());
                    }
                    i10++;
                }
            }
            if (this.f50719a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f50719a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C4282c cVar = (C4282c) it3.next();
                this.f50719a.put(cVar, new w(new k(this, cVar)));
            }
            arrayList.addAll(v(list));
            arrayList.addAll(w());
            u();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        t();
    }

    private void n(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            C4282c cVar = (C4282c) entry.getKey();
            C5027b bVar = (C5027b) entry.getValue();
            if (cVar.n() || (cVar.o() && z10)) {
                bVar.get();
            }
        }
        this.f50724f.f();
    }

    private static List p(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object q(C4282c cVar) {
        return cVar.h().a(new F(cVar, this));
    }

    private void t() {
        Boolean bool = (Boolean) this.f50725g.get();
        if (bool != null) {
            n(this.f50719a, bool.booleanValue());
        }
    }

    private void u() {
        for (C4282c cVar : this.f50719a.keySet()) {
            Iterator it = cVar.g().iterator();
            while (true) {
                if (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (qVar.g() && !this.f50721c.containsKey(qVar.c())) {
                        this.f50721c.put(qVar.c(), x.b(Collections.emptySet()));
                    } else if (this.f50720b.containsKey(qVar.c())) {
                        continue;
                    } else if (qVar.f()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", new Object[]{cVar, qVar.c()}));
                    } else if (!qVar.g()) {
                        this.f50720b.put(qVar.c(), C.e());
                    }
                }
            }
        }
    }

    private List v(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4282c cVar = (C4282c) it.next();
            if (cVar.p()) {
                C5027b bVar = (C5027b) this.f50719a.get(cVar);
                for (E e10 : cVar.j()) {
                    if (!this.f50720b.containsKey(e10)) {
                        this.f50720b.put(e10, bVar);
                    } else {
                        arrayList.add(new l((C) ((C5027b) this.f50720b.get(e10)), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    private List w() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f50719a.entrySet()) {
            C4282c cVar = (C4282c) entry.getKey();
            if (!cVar.p()) {
                C5027b bVar = (C5027b) entry.getValue();
                for (E e10 : cVar.j()) {
                    if (!hashMap.containsKey(e10)) {
                        hashMap.put(e10, new HashSet());
                    }
                    ((Set) hashMap.get(e10)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f50721c.containsKey(entry2.getKey())) {
                this.f50721c.put((E) entry2.getKey(), x.b((Collection) entry2.getValue()));
            } else {
                x xVar = (x) this.f50721c.get(entry2.getKey());
                for (C5027b mVar : (Set) entry2.getValue()) {
                    arrayList.add(new m(xVar, mVar));
                }
            }
        }
        return arrayList;
    }

    public C5026a a(E e10) {
        C5027b f10 = f(e10);
        if (f10 == null) {
            return C.e();
        }
        if (f10 instanceof C) {
            return (C) f10;
        }
        return C.i(f10);
    }

    public synchronized C5027b c(E e10) {
        x xVar = (x) this.f50721c.get(e10);
        if (xVar != null) {
            return xVar;
        }
        return f50718i;
    }

    public synchronized C5027b f(E e10) {
        D.c(e10, "Null interface requested.");
        return (C5027b) this.f50720b.get(e10);
    }

    public void o(boolean z10) {
        HashMap hashMap;
        if (C2780Y.a(this.f50725g, (Object) null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f50719a);
            }
            n(hashMap, z10);
        }
    }

    private n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f50719a = new HashMap();
        this.f50720b = new HashMap();
        this.f50721c = new HashMap();
        this.f50723e = new HashSet();
        this.f50725g = new AtomicReference();
        u uVar = new u(executor);
        this.f50724f = uVar;
        this.f50726h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4282c.s(uVar, u.class, C4945d.class, C4944c.class));
        arrayList.add(C4282c.s(this, Xb.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C4282c cVar = (C4282c) it.next();
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f50722d = p(iterable);
        m(arrayList);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f50727a;

        /* renamed from: b  reason: collision with root package name */
        private final List f50728b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List f50729c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private i f50730d = i.f50711a;

        b(Executor executor) {
            this.f50727a = executor;
        }

        public b b(C4282c cVar) {
            this.f50729c.add(cVar);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar) {
            this.f50728b.add(new o(componentRegistrar));
            return this;
        }

        public b d(Collection collection) {
            this.f50728b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f50727a, this.f50728b, this.f50729c, this.f50730d);
        }

        public b g(i iVar) {
            this.f50730d = iVar;
            return this;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
