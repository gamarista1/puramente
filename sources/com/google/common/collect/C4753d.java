package com.google.common.collect;

import com.google.common.collect.C4755f;
import com.google.common.collect.G;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import nb.o;

/* renamed from: com.google.common.collect.d  reason: case insensitive filesystem */
abstract class C4753d extends C4755f implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public transient Map f56667e;

    /* renamed from: f  reason: collision with root package name */
    private transient int f56668f;

    /* renamed from: com.google.common.collect.d$a */
    class a extends C0847d {
        a(C4753d dVar) {
            super();
        }

        /* access modifiers changed from: package-private */
        public Object a(Object obj, Object obj2) {
            return obj2;
        }
    }

    /* renamed from: com.google.common.collect.d$b */
    class b extends C0847d {
        b(C4753d dVar) {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Map.Entry a(Object obj, Object obj2) {
            return G.d(obj, obj2);
        }
    }

    /* renamed from: com.google.common.collect.d$c */
    private class c extends G.f {

        /* renamed from: c  reason: collision with root package name */
        final transient Map f56669c;

        /* renamed from: com.google.common.collect.d$c$a */
        class a extends G.c {
            a() {
            }

            /* access modifiers changed from: package-private */
            public Map a() {
                return c.this;
            }

            public boolean contains(Object obj) {
                return C4759j.c(c.this.f56669c.entrySet(), obj);
            }

            public Iterator iterator() {
                return new b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                C4753d.this.x(entry.getKey());
                return true;
            }
        }

        /* renamed from: com.google.common.collect.d$c$b */
        class b implements Iterator {

            /* renamed from: a  reason: collision with root package name */
            final Iterator f56672a;

            /* renamed from: b  reason: collision with root package name */
            Collection f56673b;

            b() {
                this.f56672a = c.this.f56669c.entrySet().iterator();
            }

            /* renamed from: a */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f56672a.next();
                this.f56673b = (Collection) entry.getValue();
                return c.this.g(entry);
            }

            public boolean hasNext() {
                return this.f56672a.hasNext();
            }

            public void remove() {
                boolean z10;
                if (this.f56673b != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o.p(z10, "no calls to next() since the last call to remove()");
                this.f56672a.remove();
                C4753d.p(C4753d.this, this.f56673b.size());
                this.f56673b.clear();
                this.f56673b = null;
            }
        }

        c(Map map) {
            this.f56669c = map;
        }

        /* access modifiers changed from: protected */
        public Set a() {
            return new a();
        }

        /* renamed from: c */
        public Collection get(Object obj) {
            Collection collection = (Collection) G.h(this.f56669c, obj);
            if (collection == null) {
                return null;
            }
            return C4753d.this.A(obj, collection);
        }

        public void clear() {
            if (this.f56669c == C4753d.this.f56667e) {
                C4753d.this.clear();
            } else {
                C.c(new b());
            }
        }

        public boolean containsKey(Object obj) {
            return G.g(this.f56669c, obj);
        }

        /* renamed from: e */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f56669c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection s10 = C4753d.this.s();
            s10.addAll(collection);
            C4753d.p(C4753d.this, collection.size());
            collection.clear();
            return s10;
        }

        public boolean equals(Object obj) {
            if (this == obj || this.f56669c.equals(obj)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public Map.Entry g(Map.Entry entry) {
            Object key = entry.getKey();
            return G.d(key, C4753d.this.A(key, (Collection) entry.getValue()));
        }

        public int hashCode() {
            return this.f56669c.hashCode();
        }

        public Set keySet() {
            return C4753d.this.i();
        }

        public int size() {
            return this.f56669c.size();
        }

        public String toString() {
            return this.f56669c.toString();
        }
    }

    /* renamed from: com.google.common.collect.d$d  reason: collision with other inner class name */
    private abstract class C0847d implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        final Iterator f56675a;

        /* renamed from: b  reason: collision with root package name */
        Object f56676b = null;

        /* renamed from: c  reason: collision with root package name */
        Collection f56677c = null;

        /* renamed from: d  reason: collision with root package name */
        Iterator f56678d = C.h();

        C0847d() {
            this.f56675a = C4753d.this.f56667e.entrySet().iterator();
        }

        /* access modifiers changed from: package-private */
        public abstract Object a(Object obj, Object obj2);

        public boolean hasNext() {
            if (this.f56675a.hasNext() || this.f56678d.hasNext()) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (!this.f56678d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f56675a.next();
                this.f56676b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f56677c = collection;
                this.f56678d = collection.iterator();
            }
            return a(M.a(this.f56676b), this.f56678d.next());
        }

        public void remove() {
            this.f56678d.remove();
            Collection collection = this.f56677c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f56675a.remove();
            }
            C4753d.n(C4753d.this);
        }
    }

    /* renamed from: com.google.common.collect.d$e */
    private class e extends G.d {

        /* renamed from: com.google.common.collect.d$e$a */
        class a implements Iterator {

            /* renamed from: a  reason: collision with root package name */
            Map.Entry f56681a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Iterator f56682b;

            a(Iterator it) {
                this.f56682b = it;
            }

            public boolean hasNext() {
                return this.f56682b.hasNext();
            }

            public Object next() {
                Map.Entry entry = (Map.Entry) this.f56682b.next();
                this.f56681a = entry;
                return entry.getKey();
            }

            public void remove() {
                boolean z10;
                if (this.f56681a != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o.p(z10, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f56681a.getValue();
                this.f56682b.remove();
                C4753d.p(C4753d.this, collection.size());
                collection.clear();
                this.f56681a = null;
            }
        }

        e(Map map) {
            super(map);
        }

        public void clear() {
            C.c(iterator());
        }

        public boolean containsAll(Collection collection) {
            return a().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (this == obj || a().keySet().equals(obj)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return a().keySet().hashCode();
        }

        public Iterator iterator() {
            return new a(a().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i10;
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                i10 = collection.size();
                collection.clear();
                C4753d.p(C4753d.this, i10);
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.d$f */
    private final class f extends i implements NavigableMap {
        f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry ceilingEntry = k().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return g(ceilingEntry);
        }

        public Object ceilingKey(Object obj) {
            return k().ceilingKey(obj);
        }

        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap descendingMap() {
            return new f(k().descendingMap());
        }

        public Map.Entry firstEntry() {
            Map.Entry firstEntry = k().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return g(firstEntry);
        }

        public Map.Entry floorEntry(Object obj) {
            Map.Entry floorEntry = k().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return g(floorEntry);
        }

        public Object floorKey(Object obj) {
            return k().floorKey(obj);
        }

        public Map.Entry higherEntry(Object obj) {
            Map.Entry higherEntry = k().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return g(higherEntry);
        }

        public Object higherKey(Object obj) {
            return k().higherKey(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public NavigableSet i() {
            return new g(k());
        }

        public Map.Entry lastEntry() {
            Map.Entry lastEntry = k().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return g(lastEntry);
        }

        public Map.Entry lowerEntry(Object obj) {
            Map.Entry lowerEntry = k().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return g(lowerEntry);
        }

        public Object lowerKey(Object obj) {
            return k().lowerKey(obj);
        }

        /* renamed from: n */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public NavigableSet navigableKeySet() {
            return keySet();
        }

        /* renamed from: o */
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        /* access modifiers changed from: package-private */
        public Map.Entry p(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection s10 = C4753d.this.s();
            s10.addAll((Collection) entry.getValue());
            it.remove();
            return G.d(entry.getKey(), C4753d.this.z(s10));
        }

        public Map.Entry pollFirstEntry() {
            return p(entrySet().iterator());
        }

        public Map.Entry pollLastEntry() {
            return p(descendingMap().entrySet().iterator());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public NavigableMap k() {
            return (NavigableMap) super.k();
        }

        /* renamed from: r */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        /* renamed from: s */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public NavigableMap headMap(Object obj, boolean z10) {
            return new f(k().headMap(obj, z10));
        }

        public NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
            return new f(k().subMap(obj, z10, obj2, z11));
        }

        public NavigableMap tailMap(Object obj, boolean z10) {
            return new f(k().tailMap(obj, z10));
        }
    }

    /* renamed from: com.google.common.collect.d$g */
    private final class g extends j implements NavigableSet {
        g(NavigableMap navigableMap) {
            super(navigableMap);
        }

        public Object ceiling(Object obj) {
            return b().ceilingKey(obj);
        }

        /* renamed from: d */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet descendingSet() {
            return new g(b().descendingMap());
        }

        public Object floor(Object obj) {
            return b().floorKey(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public NavigableMap b() {
            return (NavigableMap) super.b();
        }

        /* renamed from: h */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        public Object higher(Object obj) {
            return b().higherKey(obj);
        }

        /* renamed from: k */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        public Object lower(Object obj) {
            return b().lowerKey(obj);
        }

        public Object pollFirst() {
            return C.p(iterator());
        }

        public Object pollLast() {
            return C.p(descendingIterator());
        }

        public NavigableSet headSet(Object obj, boolean z10) {
            return new g(b().headMap(obj, z10));
        }

        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return new g(b().subMap(obj, z10, obj2, z11));
        }

        public NavigableSet tailSet(Object obj, boolean z10) {
            return new g(b().tailMap(obj, z10));
        }
    }

    /* renamed from: com.google.common.collect.d$h */
    private class h extends l implements RandomAccess {
        h(C4753d dVar, Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }
    }

    /* renamed from: com.google.common.collect.d$i */
    private class i extends c implements SortedMap {

        /* renamed from: e  reason: collision with root package name */
        SortedSet f56686e;

        i(SortedMap sortedMap) {
            super(sortedMap);
        }

        public Comparator comparator() {
            return k().comparator();
        }

        public Object firstKey() {
            return k().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return new i(k().headMap(obj));
        }

        /* access modifiers changed from: package-private */
        public SortedSet i() {
            return new j(k());
        }

        /* renamed from: j */
        public SortedSet keySet() {
            SortedSet sortedSet = this.f56686e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet i10 = i();
            this.f56686e = i10;
            return i10;
        }

        /* access modifiers changed from: package-private */
        public SortedMap k() {
            return (SortedMap) this.f56669c;
        }

        public Object lastKey() {
            return k().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new i(k().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new i(k().tailMap(obj));
        }
    }

    /* renamed from: com.google.common.collect.d$j */
    private class j extends e implements SortedSet {
        j(SortedMap sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: package-private */
        public SortedMap b() {
            return (SortedMap) super.a();
        }

        public Comparator comparator() {
            return b().comparator();
        }

        public Object first() {
            return b().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new j(b().headMap(obj));
        }

        public Object last() {
            return b().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new j(b().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new j(b().tailMap(obj));
        }
    }

    protected C4753d(Map map) {
        o.d(map.isEmpty());
        this.f56667e = map;
    }

    static /* synthetic */ int m(C4753d dVar) {
        int i10 = dVar.f56668f;
        dVar.f56668f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int n(C4753d dVar) {
        int i10 = dVar.f56668f;
        dVar.f56668f = i10 - 1;
        return i10;
    }

    static /* synthetic */ int o(C4753d dVar, int i10) {
        int i11 = dVar.f56668f + i10;
        dVar.f56668f = i11;
        return i11;
    }

    static /* synthetic */ int p(C4753d dVar, int i10) {
        int i11 = dVar.f56668f - i10;
        dVar.f56668f = i11;
        return i11;
    }

    /* access modifiers changed from: private */
    public static Iterator w(Collection collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: private */
    public void x(Object obj) {
        Collection collection = (Collection) G.i(this.f56667e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f56668f -= size;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Collection A(Object obj, Collection collection);

    /* access modifiers changed from: package-private */
    public final List B(Object obj, List list, k kVar) {
        if (list instanceof RandomAccess) {
            return new h(this, obj, list, kVar);
        }
        return new l(obj, list, kVar);
    }

    public Collection a() {
        return super.a();
    }

    public void clear() {
        for (Collection clear : this.f56667e.values()) {
            clear.clear();
        }
        this.f56667e.clear();
        this.f56668f = 0;
    }

    /* access modifiers changed from: package-private */
    public Collection e() {
        if (this instanceof Y) {
            return new C4755f.b(this);
        }
        return new C4755f.a();
    }

    /* access modifiers changed from: package-private */
    public Collection g() {
        return new C4755f.c();
    }

    public Collection get(Object obj) {
        Collection collection = (Collection) this.f56667e.get(obj);
        if (collection == null) {
            collection = t(obj);
        }
        return A(obj, collection);
    }

    /* access modifiers changed from: package-private */
    public Iterator h() {
        return new b(this);
    }

    /* access modifiers changed from: package-private */
    public Iterator j() {
        return new a(this);
    }

    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f56667e.get(obj);
        if (collection == null) {
            Collection t10 = t(obj);
            if (t10.add(obj2)) {
                this.f56668f++;
                this.f56667e.put(obj, t10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.f56668f++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public Map r() {
        return this.f56667e;
    }

    /* access modifiers changed from: package-private */
    public abstract Collection s();

    public int size() {
        return this.f56668f;
    }

    /* access modifiers changed from: package-private */
    public Collection t(Object obj) {
        return s();
    }

    /* access modifiers changed from: package-private */
    public final Map u() {
        Map map = this.f56667e;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f56667e);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.f56667e);
        }
        return new c(this.f56667e);
    }

    /* access modifiers changed from: package-private */
    public final Set v() {
        Map map = this.f56667e;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f56667e);
        }
        if (map instanceof SortedMap) {
            return new j((SortedMap) this.f56667e);
        }
        return new e(this.f56667e);
    }

    public Collection values() {
        return super.values();
    }

    /* access modifiers changed from: package-private */
    public final void y(Map map) {
        this.f56667e = map;
        this.f56668f = 0;
        for (Collection collection : map.values()) {
            o.d(!collection.isEmpty());
            this.f56668f += collection.size();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Collection z(Collection collection);

    /* renamed from: com.google.common.collect.d$k */
    class k extends AbstractCollection {

        /* renamed from: a  reason: collision with root package name */
        final Object f56689a;

        /* renamed from: b  reason: collision with root package name */
        Collection f56690b;

        /* renamed from: c  reason: collision with root package name */
        final k f56691c;

        /* renamed from: d  reason: collision with root package name */
        final Collection f56692d;

        k(Object obj, Collection collection, k kVar) {
            Collection collection2;
            this.f56689a = obj;
            this.f56690b = collection;
            this.f56691c = kVar;
            if (kVar == null) {
                collection2 = null;
            } else {
                collection2 = kVar.d();
            }
            this.f56692d = collection2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            k kVar = this.f56691c;
            if (kVar != null) {
                kVar.a();
            } else {
                C4753d.this.f56667e.put(this.f56689a, this.f56690b);
            }
        }

        public boolean add(Object obj) {
            h();
            boolean isEmpty = this.f56690b.isEmpty();
            boolean add = this.f56690b.add(obj);
            if (add) {
                C4753d.m(C4753d.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f56690b.addAll(collection);
            if (addAll) {
                C4753d.o(C4753d.this, this.f56690b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        public k b() {
            return this.f56691c;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f56690b.clear();
                C4753d.p(C4753d.this, size);
                k();
            }
        }

        public boolean contains(Object obj) {
            h();
            return this.f56690b.contains(obj);
        }

        public boolean containsAll(Collection collection) {
            h();
            return this.f56690b.containsAll(collection);
        }

        /* access modifiers changed from: package-private */
        public Collection d() {
            return this.f56690b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            h();
            return this.f56690b.equals(obj);
        }

        /* access modifiers changed from: package-private */
        public Object g() {
            return this.f56689a;
        }

        /* access modifiers changed from: package-private */
        public void h() {
            Collection collection;
            k kVar = this.f56691c;
            if (kVar != null) {
                kVar.h();
                if (this.f56691c.d() != this.f56692d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f56690b.isEmpty() && (collection = (Collection) C4753d.this.f56667e.get(this.f56689a)) != null) {
                this.f56690b = collection;
            }
        }

        public int hashCode() {
            h();
            return this.f56690b.hashCode();
        }

        public Iterator iterator() {
            h();
            return new a();
        }

        /* access modifiers changed from: package-private */
        public void k() {
            k kVar = this.f56691c;
            if (kVar != null) {
                kVar.k();
            } else if (this.f56690b.isEmpty()) {
                C4753d.this.f56667e.remove(this.f56689a);
            }
        }

        public boolean remove(Object obj) {
            h();
            boolean remove = this.f56690b.remove(obj);
            if (remove) {
                C4753d.n(C4753d.this);
                k();
            }
            return remove;
        }

        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f56690b.removeAll(collection);
            if (removeAll) {
                C4753d.o(C4753d.this, this.f56690b.size() - size);
                k();
            }
            return removeAll;
        }

        public boolean retainAll(Collection collection) {
            o.j(collection);
            int size = size();
            boolean retainAll = this.f56690b.retainAll(collection);
            if (retainAll) {
                C4753d.o(C4753d.this, this.f56690b.size() - size);
                k();
            }
            return retainAll;
        }

        public int size() {
            h();
            return this.f56690b.size();
        }

        public String toString() {
            h();
            return this.f56690b.toString();
        }

        /* renamed from: com.google.common.collect.d$k$a */
        class a implements Iterator {

            /* renamed from: a  reason: collision with root package name */
            final Iterator f56694a;

            /* renamed from: b  reason: collision with root package name */
            final Collection f56695b;

            a() {
                Collection collection = k.this.f56690b;
                this.f56695b = collection;
                this.f56694a = C4753d.w(collection);
            }

            /* access modifiers changed from: package-private */
            public Iterator a() {
                b();
                return this.f56694a;
            }

            /* access modifiers changed from: package-private */
            public void b() {
                k.this.h();
                if (k.this.f56690b != this.f56695b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                b();
                return this.f56694a.hasNext();
            }

            public Object next() {
                b();
                return this.f56694a.next();
            }

            public void remove() {
                this.f56694a.remove();
                C4753d.n(C4753d.this);
                k.this.k();
            }

            a(Iterator it) {
                this.f56695b = k.this.f56690b;
                this.f56694a = it;
            }
        }
    }

    /* renamed from: com.google.common.collect.d$l */
    class l extends k implements List {

        /* renamed from: com.google.common.collect.d$l$a */
        private class a extends k.a implements ListIterator {
            a() {
                super();
            }

            private ListIterator c() {
                return (ListIterator) a();
            }

            public void add(Object obj) {
                boolean isEmpty = l.this.isEmpty();
                c().add(obj);
                C4753d.m(C4753d.this);
                if (isEmpty) {
                    l.this.a();
                }
            }

            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            public int nextIndex() {
                return c().nextIndex();
            }

            public Object previous() {
                return c().previous();
            }

            public int previousIndex() {
                return c().previousIndex();
            }

            public void set(Object obj) {
                c().set(obj);
            }

            public a(int i10) {
                super(l.this.m().listIterator(i10));
            }
        }

        l(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }

        public void add(int i10, Object obj) {
            h();
            boolean isEmpty = d().isEmpty();
            m().add(i10, obj);
            C4753d.m(C4753d.this);
            if (isEmpty) {
                a();
            }
        }

        public boolean addAll(int i10, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m().addAll(i10, collection);
            if (addAll) {
                C4753d.o(C4753d.this, d().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public Object get(int i10) {
            h();
            return m().get(i10);
        }

        public int indexOf(Object obj) {
            h();
            return m().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            h();
            return m().lastIndexOf(obj);
        }

        public ListIterator listIterator() {
            h();
            return new a();
        }

        /* access modifiers changed from: package-private */
        public List m() {
            return (List) d();
        }

        public Object remove(int i10) {
            h();
            Object remove = m().remove(i10);
            C4753d.n(C4753d.this);
            k();
            return remove;
        }

        public Object set(int i10, Object obj) {
            h();
            return m().set(i10, obj);
        }

        public List subList(int i10, int i11) {
            k kVar;
            h();
            C4753d dVar = C4753d.this;
            Object g10 = g();
            List subList = m().subList(i10, i11);
            if (b() == null) {
                kVar = this;
            } else {
                kVar = b();
            }
            return dVar.B(g10, subList, kVar);
        }

        public ListIterator listIterator(int i10) {
            h();
            return new a(i10);
        }
    }
}
