package pg;

import com.amazon.a.a.o.b.f;
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
import pg.C6646h;

abstract class u extends AbstractMap {

    /* renamed from: a  reason: collision with root package name */
    private final int f72572a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List f72573b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map f72574c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f72575d;

    /* renamed from: e  reason: collision with root package name */
    private volatile e f72576e;

    static class a extends u {
        a(int i10) {
            super(i10, (a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return u.super.s((C6646h.b) obj, obj2);
        }

        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry k10 = k(i10);
                    if (((C6646h.b) k10.getKey()).g()) {
                        k10.setValue(Collections.unmodifiableList((List) k10.getValue()));
                    }
                }
                for (Map.Entry entry : n()) {
                    if (((C6646h.b) entry.getKey()).g()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            u.super.q();
        }
    }

    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator f72577a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable f72578b = new C1048b();

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

        /* renamed from: pg.u$b$b  reason: collision with other inner class name */
        static class C1048b implements Iterable {
            C1048b() {
            }

            public Iterator iterator() {
                return b.f72577a;
            }
        }

        static Iterable b() {
            return f72578b;
        }
    }

    private class c implements Comparable, Map.Entry {

        /* renamed from: a  reason: collision with root package name */
        private final Comparable f72579a;

        /* renamed from: b  reason: collision with root package name */
        private Object f72580b;

        c(u uVar, Map.Entry entry) {
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
        public int compareTo(c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        /* renamed from: c */
        public Comparable getKey() {
            return this.f72579a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!b(this.f72579a, entry.getKey()) || !b(this.f72580b, entry.getValue())) {
                return false;
            }
            return true;
        }

        public Object getValue() {
            return this.f72580b;
        }

        public int hashCode() {
            int i10;
            Comparable comparable = this.f72579a;
            int i11 = 0;
            if (comparable == null) {
                i10 = 0;
            } else {
                i10 = comparable.hashCode();
            }
            Object obj = this.f72580b;
            if (obj != null) {
                i11 = obj.hashCode();
            }
            return i10 ^ i11;
        }

        public Object setValue(Object obj) {
            u.this.i();
            Object obj2 = this.f72580b;
            this.f72580b = obj;
            return obj2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f72579a);
            String valueOf2 = String.valueOf(this.f72580b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append(f.f37530b);
            sb2.append(valueOf2);
            return sb2.toString();
        }

        c(Comparable comparable, Object obj) {
            this.f72579a = comparable;
            this.f72580b = obj;
        }
    }

    private class e extends AbstractSet {
        private e() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            u.this.s((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            u.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return new d(u.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return u.this.size();
        }

        /* synthetic */ e(u uVar, a aVar) {
            this();
        }
    }

    /* synthetic */ u(int i10, a aVar) {
        this(i10);
    }

    private int g(Comparable comparable) {
        int i10;
        int size = this.f72573b.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((c) this.f72573b.get(i11)).getKey());
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
            int compareTo2 = comparable.compareTo(((c) this.f72573b.get(i13)).getKey());
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
    public void i() {
        if (this.f72575d) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        i();
        if (this.f72573b.isEmpty() && !(this.f72573b instanceof ArrayList)) {
            this.f72573b = new ArrayList(this.f72572a);
        }
    }

    private SortedMap o() {
        i();
        if (this.f72574c.isEmpty() && !(this.f72574c instanceof TreeMap)) {
            this.f72574c = new TreeMap();
        }
        return (SortedMap) this.f72574c;
    }

    static u r(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: private */
    public Object t(int i10) {
        i();
        Object value = ((c) this.f72573b.remove(i10)).getValue();
        if (!this.f72574c.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            this.f72573b.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        i();
        if (!this.f72573b.isEmpty()) {
            this.f72573b.clear();
        }
        if (!this.f72574c.isEmpty()) {
            this.f72574c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (g(comparable) >= 0 || this.f72574c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set entrySet() {
        if (this.f72576e == null) {
            this.f72576e = new e(this, (a) null);
        }
        return this.f72576e;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int g10 = g(comparable);
        if (g10 >= 0) {
            return ((c) this.f72573b.get(g10)).getValue();
        }
        return this.f72574c.get(comparable);
    }

    public Map.Entry k(int i10) {
        return (Map.Entry) this.f72573b.get(i10);
    }

    public int l() {
        return this.f72573b.size();
    }

    public Iterable n() {
        if (this.f72574c.isEmpty()) {
            return b.b();
        }
        return this.f72574c.entrySet();
    }

    public boolean p() {
        return this.f72575d;
    }

    public void q() {
        Map map;
        if (!this.f72575d) {
            if (this.f72574c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f72574c);
            }
            this.f72574c = map;
            this.f72575d = true;
        }
    }

    public Object remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int g10 = g(comparable);
        if (g10 >= 0) {
            return t(g10);
        }
        if (this.f72574c.isEmpty()) {
            return null;
        }
        return this.f72574c.remove(comparable);
    }

    public Object s(Comparable comparable, Object obj) {
        i();
        int g10 = g(comparable);
        if (g10 >= 0) {
            return ((c) this.f72573b.get(g10)).setValue(obj);
        }
        j();
        int i10 = -(g10 + 1);
        if (i10 >= this.f72572a) {
            return o().put(comparable, obj);
        }
        int size = this.f72573b.size();
        int i11 = this.f72572a;
        if (size == i11) {
            c cVar = (c) this.f72573b.remove(i11 - 1);
            o().put(cVar.getKey(), cVar.getValue());
        }
        this.f72573b.add(i10, new c(comparable, obj));
        return null;
    }

    public int size() {
        return this.f72573b.size() + this.f72574c.size();
    }

    private class d implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private int f72582a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f72583b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator f72584c;

        private d() {
            this.f72582a = -1;
        }

        private Iterator a() {
            if (this.f72584c == null) {
                this.f72584c = u.this.f72574c.entrySet().iterator();
            }
            return this.f72584c;
        }

        /* renamed from: b */
        public Map.Entry next() {
            this.f72583b = true;
            int i10 = this.f72582a + 1;
            this.f72582a = i10;
            if (i10 < u.this.f72573b.size()) {
                return (Map.Entry) u.this.f72573b.get(this.f72582a);
            }
            return (Map.Entry) a().next();
        }

        public boolean hasNext() {
            if (this.f72582a + 1 < u.this.f72573b.size() || a().hasNext()) {
                return true;
            }
            return false;
        }

        public void remove() {
            if (this.f72583b) {
                this.f72583b = false;
                u.this.i();
                if (this.f72582a < u.this.f72573b.size()) {
                    u uVar = u.this;
                    int i10 = this.f72582a;
                    this.f72582a = i10 - 1;
                    Object unused = uVar.t(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ d(u uVar, a aVar) {
            this();
        }
    }

    private u(int i10) {
        this.f72572a = i10;
        this.f72573b = Collections.emptyList();
        this.f72574c = Collections.emptyMap();
    }
}
