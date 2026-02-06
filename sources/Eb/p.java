package Eb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

abstract class p {

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final C4282c f50732a;

        /* renamed from: b  reason: collision with root package name */
        private final Set f50733b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set f50734c = new HashSet();

        b(C4282c cVar) {
            this.f50732a = cVar;
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f50733b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public void b(b bVar) {
            this.f50734c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public C4282c c() {
            return this.f50732a;
        }

        /* access modifiers changed from: package-private */
        public Set d() {
            return this.f50733b;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.f50733b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f50734c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public void g(b bVar) {
            this.f50734c.remove(bVar);
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private final E f50735a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f50736b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.f50735a.equals(this.f50735a) || cVar.f50736b != this.f50736b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f50735a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f50736b).hashCode();
        }

        private c(E e10, boolean z10) {
            this.f50735a = e10;
            this.f50736b = z10;
        }
    }

    static void a(List list) {
        Set<b> c10 = c(list);
        Set b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b bVar = (b) b10.iterator().next();
            b10.remove(bVar);
            i10++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    b10.add(bVar2);
                }
            }
        }
        if (i10 != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (b bVar3 : c10) {
                if (!bVar3.f() && !bVar3.e()) {
                    arrayList.add(bVar3.c());
                }
            }
            throw new r(arrayList);
        }
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4282c cVar = (C4282c) it.next();
            b bVar = new b(cVar);
            Iterator it2 = cVar.j().iterator();
            while (true) {
                if (it2.hasNext()) {
                    E e10 = (E) it2.next();
                    c cVar2 = new c(e10, !cVar.p());
                    if (!hashMap.containsKey(cVar2)) {
                        hashMap.put(cVar2, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar2);
                    if (set2.isEmpty() || cVar2.f50736b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{e10}));
                    }
                }
            }
        }
        for (Set<b> it3 : hashMap.values()) {
            for (b bVar2 : it3) {
                for (q qVar : bVar2.c().g()) {
                    if (qVar.e() && (set = (Set) hashMap.get(new c(qVar.c(), qVar.g()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
