package com.google.protobuf;

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

abstract class c0 extends AbstractMap {

    /* renamed from: a  reason: collision with root package name */
    private final int f58433a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List f58434b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map f58435c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f58436d;

    /* renamed from: e  reason: collision with root package name */
    private volatile g f58437e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Map f58438f;

    /* renamed from: g  reason: collision with root package name */
    private volatile c f58439g;

    class a extends c0 {
        a(int i10) {
            super(i10, (a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return c0.super.v((Comparable) obj, obj2);
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
            c0.super.t();
        }
    }

    private class c extends g {
        private c() {
            super(c0.this, (a) null);
        }

        public Iterator iterator() {
            return new b(c0.this, (a) null);
        }

        /* synthetic */ c(c0 c0Var, a aVar) {
            this();
        }
    }

    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator f58444a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable f58445b = new b();

        class a implements Iterator {
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

        class b implements Iterable {
            b() {
            }

            public Iterator iterator() {
                return d.f58444a;
            }
        }

        static Iterable b() {
            return f58445b;
        }
    }

    private class e implements Map.Entry, Comparable {

        /* renamed from: a  reason: collision with root package name */
        private final Comparable f58446a;

        /* renamed from: b  reason: collision with root package name */
        private Object f58447b;

        e(c0 c0Var, Map.Entry entry) {
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
            return this.f58446a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!b(this.f58446a, entry.getKey()) || !b(this.f58447b, entry.getValue())) {
                return false;
            }
            return true;
        }

        public Object getValue() {
            return this.f58447b;
        }

        public int hashCode() {
            int i10;
            Comparable comparable = this.f58446a;
            int i11 = 0;
            if (comparable == null) {
                i10 = 0;
            } else {
                i10 = comparable.hashCode();
            }
            Object obj = this.f58447b;
            if (obj != null) {
                i11 = obj.hashCode();
            }
            return i10 ^ i11;
        }

        public Object setValue(Object obj) {
            c0.this.j();
            Object obj2 = this.f58447b;
            this.f58447b = obj;
            return obj2;
        }

        public String toString() {
            return this.f58446a + com.amazon.a.a.o.b.f.f37530b + this.f58447b;
        }

        e(Comparable comparable, Object obj) {
            this.f58446a = comparable;
            this.f58447b = obj;
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
            c0.this.v((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            c0.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = c0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return new f(c0.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            c0.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return c0.this.size();
        }

        /* synthetic */ g(c0 c0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ c0(int i10, a aVar) {
        this(i10);
    }

    private int i(Comparable comparable) {
        int i10;
        int size = this.f58434b.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((e) this.f58434b.get(i11)).getKey());
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
            int compareTo2 = comparable.compareTo(((e) this.f58434b.get(i13)).getKey());
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
        if (this.f58436d) {
            throw new UnsupportedOperationException();
        }
    }

    private void l() {
        j();
        if (this.f58434b.isEmpty() && !(this.f58434b instanceof ArrayList)) {
            this.f58434b = new ArrayList(this.f58433a);
        }
    }

    private SortedMap r() {
        j();
        if (this.f58435c.isEmpty() && !(this.f58435c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f58435c = treeMap;
            this.f58438f = treeMap.descendingMap();
        }
        return (SortedMap) this.f58435c;
    }

    static c0 u(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: private */
    public Object w(int i10) {
        j();
        Object value = ((e) this.f58434b.remove(i10)).getValue();
        if (!this.f58435c.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            this.f58434b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        j();
        if (!this.f58434b.isEmpty()) {
            this.f58434b.clear();
        }
        if (!this.f58435c.isEmpty()) {
            this.f58435c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (i(comparable) >= 0 || this.f58435c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set entrySet() {
        if (this.f58437e == null) {
            this.f58437e = new g(this, (a) null);
        }
        return this.f58437e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        int size = size();
        if (size != c0Var.size()) {
            return false;
        }
        int o10 = o();
        if (o10 != c0Var.o()) {
            return entrySet().equals(c0Var.entrySet());
        }
        for (int i10 = 0; i10 < o10; i10++) {
            if (!n(i10).equals(c0Var.n(i10))) {
                return false;
            }
        }
        if (o10 != size) {
            return this.f58435c.equals(c0Var.f58435c);
        }
        return true;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i10 = i(comparable);
        if (i10 >= 0) {
            return ((e) this.f58434b.get(i10)).getValue();
        }
        return this.f58435c.get(comparable);
    }

    public int hashCode() {
        int o10 = o();
        int i10 = 0;
        for (int i11 = 0; i11 < o10; i11++) {
            i10 += ((e) this.f58434b.get(i11)).hashCode();
        }
        if (p() > 0) {
            return i10 + this.f58435c.hashCode();
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public Set k() {
        if (this.f58439g == null) {
            this.f58439g = new c(this, (a) null);
        }
        return this.f58439g;
    }

    public Map.Entry n(int i10) {
        return (Map.Entry) this.f58434b.get(i10);
    }

    public int o() {
        return this.f58434b.size();
    }

    public int p() {
        return this.f58435c.size();
    }

    public Iterable q() {
        if (this.f58435c.isEmpty()) {
            return d.b();
        }
        return this.f58435c.entrySet();
    }

    public Object remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int i10 = i(comparable);
        if (i10 >= 0) {
            return w(i10);
        }
        if (this.f58435c.isEmpty()) {
            return null;
        }
        return this.f58435c.remove(comparable);
    }

    public boolean s() {
        return this.f58436d;
    }

    public int size() {
        return this.f58434b.size() + this.f58435c.size();
    }

    public void t() {
        Map map;
        Map map2;
        if (!this.f58436d) {
            if (this.f58435c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f58435c);
            }
            this.f58435c = map;
            if (this.f58438f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f58438f);
            }
            this.f58438f = map2;
            this.f58436d = true;
        }
    }

    public Object v(Comparable comparable, Object obj) {
        j();
        int i10 = i(comparable);
        if (i10 >= 0) {
            return ((e) this.f58434b.get(i10)).setValue(obj);
        }
        l();
        int i11 = -(i10 + 1);
        if (i11 >= this.f58433a) {
            return r().put(comparable, obj);
        }
        int size = this.f58434b.size();
        int i12 = this.f58433a;
        if (size == i12) {
            e eVar = (e) this.f58434b.remove(i12 - 1);
            r().put(eVar.getKey(), eVar.getValue());
        }
        this.f58434b.add(i11, new e(comparable, obj));
        return null;
    }

    private class b implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private int f58440a;

        /* renamed from: b  reason: collision with root package name */
        private Iterator f58441b;

        private b() {
            this.f58440a = c0.this.f58434b.size();
        }

        private Iterator a() {
            if (this.f58441b == null) {
                this.f58441b = c0.this.f58438f.entrySet().iterator();
            }
            return this.f58441b;
        }

        /* renamed from: b */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List b10 = c0.this.f58434b;
            int i10 = this.f58440a - 1;
            this.f58440a = i10;
            return (Map.Entry) b10.get(i10);
        }

        public boolean hasNext() {
            int i10 = this.f58440a;
            if ((i10 <= 0 || i10 > c0.this.f58434b.size()) && !a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(c0 c0Var, a aVar) {
            this();
        }
    }

    private class f implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private int f58449a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f58450b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator f58451c;

        private f() {
            this.f58449a = -1;
        }

        private Iterator a() {
            if (this.f58451c == null) {
                this.f58451c = c0.this.f58435c.entrySet().iterator();
            }
            return this.f58451c;
        }

        /* renamed from: b */
        public Map.Entry next() {
            this.f58450b = true;
            int i10 = this.f58449a + 1;
            this.f58449a = i10;
            if (i10 < c0.this.f58434b.size()) {
                return (Map.Entry) c0.this.f58434b.get(this.f58449a);
            }
            return (Map.Entry) a().next();
        }

        public boolean hasNext() {
            if (this.f58449a + 1 < c0.this.f58434b.size()) {
                return true;
            }
            if (c0.this.f58435c.isEmpty() || !a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f58450b) {
                this.f58450b = false;
                c0.this.j();
                if (this.f58449a < c0.this.f58434b.size()) {
                    c0 c0Var = c0.this;
                    int i10 = this.f58449a;
                    this.f58449a = i10 - 1;
                    Object unused = c0Var.w(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(c0 c0Var, a aVar) {
            this();
        }
    }

    private c0(int i10) {
        this.f58433a = i10;
        this.f58434b = Collections.emptyList();
        this.f58435c = Collections.emptyMap();
        this.f58438f = Collections.emptyMap();
    }
}
