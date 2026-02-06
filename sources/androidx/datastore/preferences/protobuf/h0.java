package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

abstract class h0 extends AbstractMap {

    /* renamed from: a  reason: collision with root package name */
    private final int f16360a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List f16361b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map f16362c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16363d;

    /* renamed from: e  reason: collision with root package name */
    private volatile g f16364e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Map f16365f;

    /* renamed from: g  reason: collision with root package name */
    private volatile c f16366g;

    static class a extends h0 {
        a(int i10) {
            super(i10, (a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            android.support.v4.media.session.c.a(obj);
            return h0.super.v((Comparable) null, obj2);
        }

        public void t() {
            if (!s()) {
                if (o() <= 0) {
                    Iterator it = q().iterator();
                    if (it.hasNext()) {
                        android.support.v4.media.session.c.a(((Map.Entry) it.next()).getKey());
                        throw null;
                    }
                } else {
                    android.support.v4.media.session.c.a(n(0).getKey());
                    throw null;
                }
            }
            h0.super.t();
        }
    }

    private class c extends g {
        private c() {
            super(h0.this, (a) null);
        }

        public Iterator iterator() {
            return new b(h0.this, (a) null);
        }

        /* synthetic */ c(h0 h0Var, a aVar) {
            this();
        }
    }

    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator f16371a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable f16372b = new b();

        static class a implements Iterator {
            a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static class b implements Iterable {
            b() {
            }

            public Iterator iterator() {
                return d.f16371a;
            }
        }

        static Iterable b() {
            return f16372b;
        }
    }

    private class e implements Map.Entry, Comparable {

        /* renamed from: a  reason: collision with root package name */
        private final Comparable f16373a;

        /* renamed from: b  reason: collision with root package name */
        private Object f16374b;

        e(h0 h0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            if (obj != null) {
                return obj.equals(obj2);
            }
            if (obj2 == null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: c */
        public Comparable getKey() {
            return this.f16373a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!b(this.f16373a, entry.getKey()) || !b(this.f16374b, entry.getValue())) {
                return false;
            }
            return true;
        }

        public Object getValue() {
            return this.f16374b;
        }

        public int hashCode() {
            int i10;
            Comparable comparable = this.f16373a;
            int i11 = 0;
            if (comparable == null) {
                i10 = 0;
            } else {
                i10 = comparable.hashCode();
            }
            Object obj = this.f16374b;
            if (obj != null) {
                i11 = obj.hashCode();
            }
            return i10 ^ i11;
        }

        public Object setValue(Object obj) {
            h0.this.j();
            Object obj2 = this.f16374b;
            this.f16374b = obj;
            return obj2;
        }

        public String toString() {
            return this.f16373a + com.amazon.a.a.o.b.f.f37530b + this.f16374b;
        }

        e(Comparable comparable, Object obj) {
            this.f16373a = comparable;
            this.f16374b = obj;
        }
    }

    private class g extends AbstractSet {
        private g() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            h0.this.v((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            h0.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = h0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return new f(h0.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            h0.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return h0.this.size();
        }

        /* synthetic */ g(h0 h0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ h0(int i10, a aVar) {
        this(i10);
    }

    private int i(Comparable comparable) {
        int i10;
        int size = this.f16361b.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((e) this.f16361b.get(i11)).getKey());
            if (compareTo > 0) {
                i10 = size + 1;
                return -i10;
            } else if (compareTo == 0) {
                return i11;
            }
        }
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = comparable.compareTo(((e) this.f16361b.get(i13)).getKey());
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else if (compareTo2 <= 0) {
                return i13;
            } else {
                i12 = i13 + 1;
            }
        }
        i10 = i12 + 1;
        return -i10;
    }

    /* access modifiers changed from: private */
    public void j() {
        if (this.f16363d) {
            throw new UnsupportedOperationException();
        }
    }

    private void l() {
        j();
        if (this.f16361b.isEmpty() && !(this.f16361b instanceof ArrayList)) {
            this.f16361b = new ArrayList(this.f16360a);
        }
    }

    private SortedMap r() {
        j();
        if (this.f16362c.isEmpty() && !(this.f16362c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16362c = treeMap;
            this.f16365f = treeMap.descendingMap();
        }
        return (SortedMap) this.f16362c;
    }

    static h0 u(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: private */
    public Object w(int i10) {
        j();
        Object value = ((e) this.f16361b.remove(i10)).getValue();
        if (!this.f16362c.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            this.f16361b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        j();
        if (!this.f16361b.isEmpty()) {
            this.f16361b.clear();
        }
        if (!this.f16362c.isEmpty()) {
            this.f16362c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (i(comparable) >= 0 || this.f16362c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set entrySet() {
        if (this.f16364e == null) {
            this.f16364e = new g(this, (a) null);
        }
        return this.f16364e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        int size = size();
        if (size != h0Var.size()) {
            return false;
        }
        int o10 = o();
        if (o10 != h0Var.o()) {
            return entrySet().equals(h0Var.entrySet());
        }
        for (int i10 = 0; i10 < o10; i10++) {
            if (!n(i10).equals(h0Var.n(i10))) {
                return false;
            }
        }
        if (o10 != size) {
            return this.f16362c.equals(h0Var.f16362c);
        }
        return true;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i10 = i(comparable);
        if (i10 >= 0) {
            return ((e) this.f16361b.get(i10)).getValue();
        }
        return this.f16362c.get(comparable);
    }

    public int hashCode() {
        int o10 = o();
        int i10 = 0;
        for (int i11 = 0; i11 < o10; i11++) {
            i10 += ((e) this.f16361b.get(i11)).hashCode();
        }
        if (p() > 0) {
            return i10 + this.f16362c.hashCode();
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public Set k() {
        if (this.f16366g == null) {
            this.f16366g = new c(this, (a) null);
        }
        return this.f16366g;
    }

    public Map.Entry n(int i10) {
        return (Map.Entry) this.f16361b.get(i10);
    }

    public int o() {
        return this.f16361b.size();
    }

    public int p() {
        return this.f16362c.size();
    }

    public Iterable q() {
        if (this.f16362c.isEmpty()) {
            return d.b();
        }
        return this.f16362c.entrySet();
    }

    public Object remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int i10 = i(comparable);
        if (i10 >= 0) {
            return w(i10);
        }
        if (this.f16362c.isEmpty()) {
            return null;
        }
        return this.f16362c.remove(comparable);
    }

    public boolean s() {
        return this.f16363d;
    }

    public int size() {
        return this.f16361b.size() + this.f16362c.size();
    }

    public void t() {
        Map map;
        Map map2;
        if (!this.f16363d) {
            if (this.f16362c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f16362c);
            }
            this.f16362c = map;
            if (this.f16365f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f16365f);
            }
            this.f16365f = map2;
            this.f16363d = true;
        }
    }

    public Object v(Comparable comparable, Object obj) {
        j();
        int i10 = i(comparable);
        if (i10 >= 0) {
            return ((e) this.f16361b.get(i10)).setValue(obj);
        }
        l();
        int i11 = -(i10 + 1);
        if (i11 >= this.f16360a) {
            return r().put(comparable, obj);
        }
        int size = this.f16361b.size();
        int i12 = this.f16360a;
        if (size == i12) {
            e eVar = (e) this.f16361b.remove(i12 - 1);
            r().put(eVar.getKey(), eVar.getValue());
        }
        this.f16361b.add(i11, new e(comparable, obj));
        return null;
    }

    private class b implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private int f16367a;

        /* renamed from: b  reason: collision with root package name */
        private Iterator f16368b;

        private b() {
            this.f16367a = h0.this.f16361b.size();
        }

        private Iterator a() {
            if (this.f16368b == null) {
                this.f16368b = h0.this.f16365f.entrySet().iterator();
            }
            return this.f16368b;
        }

        /* renamed from: b */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List b10 = h0.this.f16361b;
            int i10 = this.f16367a - 1;
            this.f16367a = i10;
            return (Map.Entry) b10.get(i10);
        }

        public boolean hasNext() {
            int i10 = this.f16367a;
            if ((i10 <= 0 || i10 > h0.this.f16361b.size()) && !a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(h0 h0Var, a aVar) {
            this();
        }
    }

    private class f implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private int f16376a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f16377b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator f16378c;

        private f() {
            this.f16376a = -1;
        }

        private Iterator a() {
            if (this.f16378c == null) {
                this.f16378c = h0.this.f16362c.entrySet().iterator();
            }
            return this.f16378c;
        }

        /* renamed from: b */
        public Map.Entry next() {
            this.f16377b = true;
            int i10 = this.f16376a + 1;
            this.f16376a = i10;
            if (i10 < h0.this.f16361b.size()) {
                return (Map.Entry) h0.this.f16361b.get(this.f16376a);
            }
            return (Map.Entry) a().next();
        }

        public boolean hasNext() {
            if (this.f16376a + 1 < h0.this.f16361b.size()) {
                return true;
            }
            if (h0.this.f16362c.isEmpty() || !a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f16377b) {
                this.f16377b = false;
                h0.this.j();
                if (this.f16376a < h0.this.f16361b.size()) {
                    h0 h0Var = h0.this;
                    int i10 = this.f16376a;
                    this.f16376a = i10 - 1;
                    Object unused = h0Var.w(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(h0 h0Var, a aVar) {
            this();
        }
    }

    private h0(int i10) {
        this.f16360a = i10;
        this.f16361b = Collections.emptyList();
        this.f16362c = Collections.emptyMap();
        this.f16365f = Collections.emptyMap();
    }
}
