package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import u.C2664a;

/* renamed from: androidx.collection.a  reason: case insensitive filesystem */
public class C1587a extends Y implements Map {

    /* renamed from: d  reason: collision with root package name */
    C0217a f12144d;

    /* renamed from: e  reason: collision with root package name */
    c f12145e;

    /* renamed from: f  reason: collision with root package name */
    e f12146f;

    /* renamed from: androidx.collection.a$a  reason: collision with other inner class name */
    final class C0217a extends AbstractSet {
        C0217a() {
        }

        public Iterator iterator() {
            return new d();
        }

        public int size() {
            return C1587a.this.size();
        }
    }

    /* renamed from: androidx.collection.a$b */
    final class b extends C1596j {
        b() {
            super(C1587a.this.size());
        }

        /* access modifiers changed from: protected */
        public Object a(int i10) {
            return C1587a.this.i(i10);
        }

        /* access modifiers changed from: protected */
        public void b(int i10) {
            C1587a.this.k(i10);
        }
    }

    /* renamed from: androidx.collection.a$d */
    final class d implements Iterator, Map.Entry {

        /* renamed from: a  reason: collision with root package name */
        int f12150a;

        /* renamed from: b  reason: collision with root package name */
        int f12151b = -1;

        /* renamed from: c  reason: collision with root package name */
        boolean f12152c;

        d() {
            this.f12150a = C1587a.this.size() - 1;
        }

        /* renamed from: a */
        public Map.Entry next() {
            if (hasNext()) {
                this.f12151b++;
                this.f12152c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f12152c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C2664a.c(entry.getKey(), C1587a.this.i(this.f12151b)) || !C2664a.c(entry.getValue(), C1587a.this.n(this.f12151b))) {
                    return false;
                }
                return true;
            }
        }

        public Object getKey() {
            if (this.f12152c) {
                return C1587a.this.i(this.f12151b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object getValue() {
            if (this.f12152c) {
                return C1587a.this.n(this.f12151b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            if (this.f12151b < this.f12150a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            if (this.f12152c) {
                Object i11 = C1587a.this.i(this.f12151b);
                Object n10 = C1587a.this.n(this.f12151b);
                int i12 = 0;
                if (i11 == null) {
                    i10 = 0;
                } else {
                    i10 = i11.hashCode();
                }
                if (n10 != null) {
                    i12 = n10.hashCode();
                }
                return i10 ^ i12;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f12152c) {
                C1587a.this.k(this.f12151b);
                this.f12151b--;
                this.f12150a--;
                this.f12152c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public Object setValue(Object obj) {
            if (this.f12152c) {
                return C1587a.this.l(this.f12151b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + com.amazon.a.a.o.b.f.f37530b + getValue();
        }
    }

    /* renamed from: androidx.collection.a$f */
    final class f extends C1596j {
        f() {
            super(C1587a.this.size());
        }

        /* access modifiers changed from: protected */
        public Object a(int i10) {
            return C1587a.this.n(i10);
        }

        /* access modifiers changed from: protected */
        public void b(int i10) {
            C1587a.this.k(i10);
        }
    }

    public C1587a() {
    }

    static boolean p(Set set, Object obj) {
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

    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public Set entrySet() {
        C0217a aVar = this.f12144d;
        if (aVar != null) {
            return aVar;
        }
        C0217a aVar2 = new C0217a();
        this.f12144d = aVar2;
        return aVar2;
    }

    public Object get(Object obj) {
        return super.get(obj);
    }

    public Set keySet() {
        c cVar = this.f12145e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f12145e = cVar2;
        return cVar2;
    }

    public boolean o(Collection collection) {
        for (Object containsKey : collection) {
            if (!containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public void putAll(Map map) {
        b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(Collection collection) {
        int size = size();
        for (Object remove : collection) {
            remove(remove);
        }
        if (size != size()) {
            return true;
        }
        return false;
    }

    public boolean r(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(i(size2))) {
                k(size2);
            }
        }
        if (size != size()) {
            return true;
        }
        return false;
    }

    public Object remove(Object obj) {
        return super.remove(obj);
    }

    public Collection values() {
        e eVar = this.f12146f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f12146f = eVar2;
        return eVar2;
    }

    public C1587a(int i10) {
        super(i10);
    }

    /* renamed from: androidx.collection.a$c */
    final class c implements Set {
        c() {
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1587a.this.clear();
        }

        public boolean contains(Object obj) {
            return C1587a.this.containsKey(obj);
        }

        public boolean containsAll(Collection collection) {
            return C1587a.this.o(collection);
        }

        public boolean equals(Object obj) {
            return C1587a.p(this, obj);
        }

        public int hashCode() {
            int i10;
            int i11 = 0;
            for (int size = C1587a.this.size() - 1; size >= 0; size--) {
                Object i12 = C1587a.this.i(size);
                if (i12 == null) {
                    i10 = 0;
                } else {
                    i10 = i12.hashCode();
                }
                i11 += i10;
            }
            return i11;
        }

        public boolean isEmpty() {
            return C1587a.this.isEmpty();
        }

        public Iterator iterator() {
            return new b();
        }

        public boolean remove(Object obj) {
            int e10 = C1587a.this.e(obj);
            if (e10 < 0) {
                return false;
            }
            C1587a.this.k(e10);
            return true;
        }

        public boolean removeAll(Collection collection) {
            return C1587a.this.q(collection);
        }

        public boolean retainAll(Collection collection) {
            return C1587a.this.r(collection);
        }

        public int size() {
            return C1587a.this.size();
        }

        public Object[] toArray() {
            int size = C1587a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C1587a.this.i(i10);
            }
            return objArr;
        }

        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C1587a.this.i(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* renamed from: androidx.collection.a$e */
    final class e implements Collection {
        e() {
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1587a.this.clear();
        }

        public boolean contains(Object obj) {
            if (C1587a.this.a(obj) >= 0) {
                return true;
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C1587a.this.isEmpty();
        }

        public Iterator iterator() {
            return new f();
        }

        public boolean remove(Object obj) {
            int a10 = C1587a.this.a(obj);
            if (a10 < 0) {
                return false;
            }
            C1587a.this.k(a10);
            return true;
        }

        public boolean removeAll(Collection collection) {
            int size = C1587a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C1587a.this.n(i10))) {
                    C1587a.this.k(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public boolean retainAll(Collection collection) {
            int size = C1587a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C1587a.this.n(i10))) {
                    C1587a.this.k(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public int size() {
            return C1587a.this.size();
        }

        public Object[] toArray() {
            int size = C1587a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C1587a.this.n(i10);
            }
            return objArr;
        }

        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C1587a.this.n(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C1587a(Y y10) {
        super(y10);
    }
}
