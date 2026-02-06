package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: p.b  reason: case insensitive filesystem */
public class C2383b implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    c f25081a;

    /* renamed from: b  reason: collision with root package name */
    private c f25082b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap f25083c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    private int f25084d = 0;

    /* renamed from: p.b$a */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c b(c cVar) {
            return cVar.f25088d;
        }

        /* access modifiers changed from: package-private */
        public c c(c cVar) {
            return cVar.f25087c;
        }
    }

    /* renamed from: p.b$b  reason: collision with other inner class name */
    private static class C0421b extends e {
        C0421b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c b(c cVar) {
            return cVar.f25087c;
        }

        /* access modifiers changed from: package-private */
        public c c(c cVar) {
            return cVar.f25088d;
        }
    }

    /* renamed from: p.b$c */
    static class c implements Map.Entry {

        /* renamed from: a  reason: collision with root package name */
        final Object f25085a;

        /* renamed from: b  reason: collision with root package name */
        final Object f25086b;

        /* renamed from: c  reason: collision with root package name */
        c f25087c;

        /* renamed from: d  reason: collision with root package name */
        c f25088d;

        c(Object obj, Object obj2) {
            this.f25085a = obj;
            this.f25086b = obj2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f25085a.equals(cVar.f25085a) || !this.f25086b.equals(cVar.f25086b)) {
                return false;
            }
            return true;
        }

        public Object getKey() {
            return this.f25085a;
        }

        public Object getValue() {
            return this.f25086b;
        }

        public int hashCode() {
            return this.f25085a.hashCode() ^ this.f25086b.hashCode();
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f25085a + com.amazon.a.a.o.b.f.f37530b + this.f25086b;
        }
    }

    /* renamed from: p.b$d */
    public class d extends f implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private c f25089a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f25090b = true;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void a(c cVar) {
            boolean z10;
            c cVar2 = this.f25089a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f25088d;
                this.f25089a = cVar3;
                if (cVar3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f25090b = z10;
            }
        }

        /* renamed from: b */
        public Map.Entry next() {
            c cVar;
            if (this.f25090b) {
                this.f25090b = false;
                this.f25089a = C2383b.this.f25081a;
            } else {
                c cVar2 = this.f25089a;
                if (cVar2 != null) {
                    cVar = cVar2.f25087c;
                } else {
                    cVar = null;
                }
                this.f25089a = cVar;
            }
            return this.f25089a;
        }

        public boolean hasNext() {
            if (!this.f25090b) {
                c cVar = this.f25089a;
                if (cVar == null || cVar.f25087c == null) {
                    return false;
                }
                return true;
            } else if (C2383b.this.f25081a != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: p.b$e */
    private static abstract class e extends f implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        c f25092a;

        /* renamed from: b  reason: collision with root package name */
        c f25093b;

        e(c cVar, c cVar2) {
            this.f25092a = cVar2;
            this.f25093b = cVar;
        }

        private c e() {
            c cVar = this.f25093b;
            c cVar2 = this.f25092a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        public void a(c cVar) {
            if (this.f25092a == cVar && cVar == this.f25093b) {
                this.f25093b = null;
                this.f25092a = null;
            }
            c cVar2 = this.f25092a;
            if (cVar2 == cVar) {
                this.f25092a = b(cVar2);
            }
            if (this.f25093b == cVar) {
                this.f25093b = e();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c b(c cVar);

        /* access modifiers changed from: package-private */
        public abstract c c(c cVar);

        /* renamed from: d */
        public Map.Entry next() {
            c cVar = this.f25093b;
            this.f25093b = e();
            return cVar;
        }

        public boolean hasNext() {
            if (this.f25093b != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: p.b$f */
    public static abstract class f {
        /* access modifiers changed from: package-private */
        public abstract void a(c cVar);
    }

    public Map.Entry a() {
        return this.f25081a;
    }

    /* access modifiers changed from: protected */
    public c b(Object obj) {
        c cVar = this.f25081a;
        while (cVar != null && !cVar.f25085a.equals(obj)) {
            cVar = cVar.f25087c;
        }
        return cVar;
    }

    public d d() {
        d dVar = new d();
        this.f25083c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        C0421b bVar = new C0421b(this.f25082b, this.f25081a);
        this.f25083c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2383b)) {
            return false;
        }
        C2383b bVar = (C2383b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public Map.Entry g() {
        return this.f25082b;
    }

    /* access modifiers changed from: package-private */
    public c h(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f25084d++;
        c cVar2 = this.f25082b;
        if (cVar2 == null) {
            this.f25081a = cVar;
            this.f25082b = cVar;
            return cVar;
        }
        cVar2.f25087c = cVar;
        cVar.f25088d = cVar2;
        this.f25082b = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Map.Entry) it.next()).hashCode();
        }
        return i10;
    }

    public Iterator iterator() {
        a aVar = new a(this.f25081a, this.f25082b);
        this.f25083c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object k(Object obj, Object obj2) {
        c b10 = b(obj);
        if (b10 != null) {
            return b10.f25086b;
        }
        h(obj, obj2);
        return null;
    }

    public Object m(Object obj) {
        c b10 = b(obj);
        if (b10 == null) {
            return null;
        }
        this.f25084d--;
        if (!this.f25083c.isEmpty()) {
            for (f a10 : this.f25083c.keySet()) {
                a10.a(b10);
            }
        }
        c cVar = b10.f25088d;
        if (cVar != null) {
            cVar.f25087c = b10.f25087c;
        } else {
            this.f25081a = b10.f25087c;
        }
        c cVar2 = b10.f25087c;
        if (cVar2 != null) {
            cVar2.f25088d = cVar;
        } else {
            this.f25082b = cVar;
        }
        b10.f25087c = null;
        b10.f25088d = null;
        return b10.f25086b;
    }

    public int size() {
        return this.f25084d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
