package com.google.common.collect;

import com.google.common.collect.C4759j;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import nb.o;
import nb.p;
import nb.q;

public abstract class a0 {

    class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f56654a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f56655b;

        /* renamed from: com.google.common.collect.a0$a$a  reason: collision with other inner class name */
        class C0845a extends C4751b {

            /* renamed from: c  reason: collision with root package name */
            final Iterator f56656c;

            C0845a() {
                this.f56656c = a.this.f56654a.iterator();
            }

            /* access modifiers changed from: protected */
            public Object a() {
                while (this.f56656c.hasNext()) {
                    Object next = this.f56656c.next();
                    if (a.this.f56655b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super((Z) null);
            this.f56654a = set;
            this.f56655b = set2;
        }

        /* renamed from: a */
        public g0 iterator() {
            return new C0845a();
        }

        public boolean contains(Object obj) {
            if (!this.f56654a.contains(obj) || !this.f56655b.contains(obj)) {
                return false;
            }
            return true;
        }

        public boolean containsAll(Collection collection) {
            if (!this.f56654a.containsAll(collection) || !this.f56655b.containsAll(collection)) {
                return false;
            }
            return true;
        }

        public boolean isEmpty() {
            return Collections.disjoint(this.f56655b, this.f56654a);
        }

        public int size() {
            int i10 = 0;
            for (Object contains : this.f56654a) {
                if (this.f56655b.contains(contains)) {
                    i10++;
                }
            }
            return i10;
        }
    }

    private static class b extends C4759j.a implements Set {
        b(Set set, p pVar) {
            super(set, pVar);
        }

        public boolean equals(Object obj) {
            return a0.a(this, obj);
        }

        public int hashCode() {
            return a0.d(this);
        }
    }

    private static class c extends b implements SortedSet {
        c(SortedSet sortedSet, p pVar) {
            super(sortedSet, pVar);
        }

        public Comparator comparator() {
            return ((SortedSet) this.f56708a).comparator();
        }

        public Object first() {
            return C.j(this.f56708a.iterator(), this.f56709b);
        }

        public SortedSet headSet(Object obj) {
            return new c(((SortedSet) this.f56708a).headSet(obj), this.f56709b);
        }

        public Object last() {
            SortedSet sortedSet = (SortedSet) this.f56708a;
            while (true) {
                Object last = sortedSet.last();
                if (this.f56709b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new c(((SortedSet) this.f56708a).subSet(obj, obj2), this.f56709b);
        }

        public SortedSet tailSet(Object obj) {
            return new c(((SortedSet) this.f56708a).tailSet(obj), this.f56709b);
        }
    }

    static abstract class d extends AbstractSet {
        d() {
        }

        public boolean removeAll(Collection collection) {
            return a0.i(this, collection);
        }

        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) o.j(collection));
        }
    }

    public static abstract class e extends AbstractSet {
        /* synthetic */ e(Z z10) {
            this();
        }

        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            throw new UnsupportedOperationException();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private e() {
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static Set b(Set set, p pVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, pVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) o.j(set), (p) o.j(pVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f56708a, q.b(bVar.f56709b, pVar));
    }

    public static SortedSet c(SortedSet sortedSet, p pVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) o.j(sortedSet), (p) o.j(pVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f56708a, q.b(bVar.f56709b, pVar));
    }

    static int d(Set set) {
        int i10;
        int i11 = 0;
        for (Object next : set) {
            if (next != null) {
                i10 = next.hashCode();
            } else {
                i10 = 0;
            }
            i11 = ~(~(i11 + i10));
        }
        return i11;
    }

    public static e e(Set set, Set set2) {
        o.k(set, "set1");
        o.k(set2, "set2");
        return new a(set, set2);
    }

    public static HashSet f() {
        return new HashSet();
    }

    public static HashSet g(int i10) {
        return new HashSet(G.a(i10));
    }

    public static Set h() {
        return Collections.newSetFromMap(G.f());
    }

    static boolean i(Set set, Collection collection) {
        o.j(collection);
        if (collection instanceof K) {
            collection = ((K) collection).O();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return j(set, collection.iterator());
        }
        return C.q(set.iterator(), collection);
    }

    static boolean j(Set set, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
