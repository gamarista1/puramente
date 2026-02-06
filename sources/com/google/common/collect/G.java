package com.google.common.collect;

import com.google.android.gms.common.api.a;
import com.google.common.collect.a0;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import nb.C5112g;
import nb.k;
import nb.o;

public abstract class G {

    class a extends e0 {
        a(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    private enum b implements C5112g {
        KEY {
            /* renamed from: b */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: b */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }

    static abstract class c extends a0.d {
        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract Map a();

        public void clear() {
            a().clear();
        }

        public abstract boolean contains(Object obj);

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) o.j(collection));
            } catch (UnsupportedOperationException unused) {
                return a0.j(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) o.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g10 = a0.g(collection.size());
                for (Object next : collection) {
                    if (contains(next) && (next instanceof Map.Entry)) {
                        g10.add(((Map.Entry) next).getKey());
                    }
                }
                return a().keySet().retainAll(g10);
            }
        }

        public int size() {
            return a().size();
        }
    }

    static class d extends a0.d {

        /* renamed from: a  reason: collision with root package name */
        final Map f56612a;

        d(Map map) {
            this.f56612a = (Map) o.j(map);
        }

        /* access modifiers changed from: package-private */
        public Map a() {
            return this.f56612a;
        }

        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public int size() {
            return a().size();
        }
    }

    static class e extends AbstractCollection {

        /* renamed from: a  reason: collision with root package name */
        final Map f56613a;

        e(Map map) {
            this.f56613a = (Map) o.j(map);
        }

        /* access modifiers changed from: package-private */
        public final Map a() {
            return this.f56613a;
        }

        public void clear() {
            a().clear();
        }

        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public Iterator iterator() {
            return G.l(a().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (k.a(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) o.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = a0.f();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(f10);
            }
        }

        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) o.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = a0.f();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(f10);
            }
        }

        public int size() {
            return a().size();
        }
    }

    static abstract class f extends AbstractMap {

        /* renamed from: a  reason: collision with root package name */
        private transient Set f56614a;

        /* renamed from: b  reason: collision with root package name */
        private transient Collection f56615b;

        f() {
        }

        /* access modifiers changed from: package-private */
        public abstract Set a();

        /* access modifiers changed from: package-private */
        public Collection b() {
            return new e(this);
        }

        public Set entrySet() {
            Set set = this.f56614a;
            if (set != null) {
                return set;
            }
            Set a10 = a();
            this.f56614a = a10;
            return a10;
        }

        public Collection values() {
            Collection collection = this.f56615b;
            if (collection != null) {
                return collection;
            }
            Collection b10 = b();
            this.f56615b = b10;
            return b10;
        }
    }

    static int a(int i10) {
        if (i10 < 3) {
            C4758i.b(i10, "expectedSize");
            return i10 + 1;
        } else if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        } else {
            return a.e.API_PRIORITY_OTHER;
        }
    }

    static boolean b(Map map, Object obj) {
        return C.d(l(map.entrySet().iterator()), obj);
    }

    static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry d(Object obj, Object obj2) {
        return new C4769u(obj, obj2);
    }

    static C5112g e() {
        return b.KEY;
    }

    public static IdentityHashMap f() {
        return new IdentityHashMap();
    }

    static boolean g(Map map, Object obj) {
        o.j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static Object h(Map map, Object obj) {
        o.j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static Object i(Map map, Object obj) {
        o.j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String j(Map map) {
        StringBuilder b10 = C4759j.b(map.size());
        b10.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                b10.append(", ");
            }
            b10.append(entry.getKey());
            b10.append('=');
            b10.append(entry.getValue());
            z10 = false;
        }
        b10.append('}');
        return b10.toString();
    }

    static C5112g k() {
        return b.VALUE;
    }

    static Iterator l(Iterator it) {
        return new a(it);
    }
}
