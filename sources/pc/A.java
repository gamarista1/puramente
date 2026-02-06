package Pc;

import com.amazon.a.a.o.b.f;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class A extends AbstractMap implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator f52164i = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Comparator f52165a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f52166b;

    /* renamed from: c  reason: collision with root package name */
    e f52167c;

    /* renamed from: d  reason: collision with root package name */
    int f52168d;

    /* renamed from: e  reason: collision with root package name */
    int f52169e;

    /* renamed from: f  reason: collision with root package name */
    final e f52170f;

    /* renamed from: g  reason: collision with root package name */
    private b f52171g;

    /* renamed from: h  reason: collision with root package name */
    private c f52172h;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            /* renamed from: b */
            public Map.Entry next() {
                return a();
            }
        }

        b() {
        }

        public void clear() {
            A.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry) || A.this.c((Map.Entry) obj) == null) {
                return false;
            }
            return true;
        }

        public Iterator iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            e c10;
            if (!(obj instanceof Map.Entry) || (c10 = A.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            A.this.i(c10, true);
            return true;
        }

        public int size() {
            return A.this.f52168d;
        }
    }

    final class c extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            public Object next() {
                return a().f52186f;
            }
        }

        c() {
        }

        public void clear() {
            A.this.clear();
        }

        public boolean contains(Object obj) {
            return A.this.containsKey(obj);
        }

        public Iterator iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            if (A.this.j(obj) != null) {
                return true;
            }
            return false;
        }

        public int size() {
            return A.this.f52168d;
        }
    }

    private abstract class d implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        e f52177a;

        /* renamed from: b  reason: collision with root package name */
        e f52178b = null;

        /* renamed from: c  reason: collision with root package name */
        int f52179c;

        d() {
            this.f52177a = A.this.f52170f.f52184d;
            this.f52179c = A.this.f52169e;
        }

        /* access modifiers changed from: package-private */
        public final e a() {
            e eVar = this.f52177a;
            A a10 = A.this;
            if (eVar == a10.f52170f) {
                throw new NoSuchElementException();
            } else if (a10.f52169e == this.f52179c) {
                this.f52177a = eVar.f52184d;
                this.f52178b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            if (this.f52177a != A.this.f52170f) {
                return true;
            }
            return false;
        }

        public final void remove() {
            e eVar = this.f52178b;
            if (eVar != null) {
                A.this.i(eVar, true);
                this.f52178b = null;
                this.f52179c = A.this.f52169e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public A() {
        this(f52164i, true);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void g(e eVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (eVar != null) {
            e eVar2 = eVar.f52182b;
            e eVar3 = eVar.f52183c;
            int i14 = 0;
            if (eVar2 != null) {
                i10 = eVar2.f52189i;
            } else {
                i10 = 0;
            }
            if (eVar3 != null) {
                i11 = eVar3.f52189i;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                e eVar4 = eVar3.f52182b;
                e eVar5 = eVar3.f52183c;
                if (eVar5 != null) {
                    i13 = eVar5.f52189i;
                } else {
                    i13 = 0;
                }
                if (eVar4 != null) {
                    i14 = eVar4.f52189i;
                }
                int i16 = i14 - i13;
                if (i16 == -1 || (i16 == 0 && !z10)) {
                    l(eVar);
                } else {
                    n(eVar3);
                    l(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 2) {
                e eVar6 = eVar2.f52182b;
                e eVar7 = eVar2.f52183c;
                if (eVar7 != null) {
                    i12 = eVar7.f52189i;
                } else {
                    i12 = 0;
                }
                if (eVar6 != null) {
                    i14 = eVar6.f52189i;
                }
                int i17 = i14 - i12;
                if (i17 == 1 || (i17 == 0 && !z10)) {
                    n(eVar);
                } else {
                    l(eVar2);
                    n(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 0) {
                eVar.f52189i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f52189i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f52181a;
        }
    }

    private void k(e eVar, e eVar2) {
        e eVar3 = eVar.f52181a;
        eVar.f52181a = null;
        if (eVar2 != null) {
            eVar2.f52181a = eVar3;
        }
        if (eVar3 == null) {
            this.f52167c = eVar2;
        } else if (eVar3.f52182b == eVar) {
            eVar3.f52182b = eVar2;
        } else {
            eVar3.f52183c = eVar2;
        }
    }

    private void l(e eVar) {
        int i10;
        int i11;
        e eVar2 = eVar.f52182b;
        e eVar3 = eVar.f52183c;
        e eVar4 = eVar3.f52182b;
        e eVar5 = eVar3.f52183c;
        eVar.f52183c = eVar4;
        if (eVar4 != null) {
            eVar4.f52181a = eVar;
        }
        k(eVar, eVar3);
        eVar3.f52182b = eVar;
        eVar.f52181a = eVar3;
        int i12 = 0;
        if (eVar2 != null) {
            i10 = eVar2.f52189i;
        } else {
            i10 = 0;
        }
        if (eVar4 != null) {
            i11 = eVar4.f52189i;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        eVar.f52189i = max;
        if (eVar5 != null) {
            i12 = eVar5.f52189i;
        }
        eVar3.f52189i = Math.max(max, i12) + 1;
    }

    private void n(e eVar) {
        int i10;
        int i11;
        e eVar2 = eVar.f52182b;
        e eVar3 = eVar.f52183c;
        e eVar4 = eVar2.f52182b;
        e eVar5 = eVar2.f52183c;
        eVar.f52182b = eVar5;
        if (eVar5 != null) {
            eVar5.f52181a = eVar;
        }
        k(eVar, eVar2);
        eVar2.f52183c = eVar;
        eVar.f52181a = eVar2;
        int i12 = 0;
        if (eVar3 != null) {
            i10 = eVar3.f52189i;
        } else {
            i10 = 0;
        }
        if (eVar5 != null) {
            i11 = eVar5.f52189i;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        eVar.f52189i = max;
        if (eVar4 != null) {
            i12 = eVar4.f52189i;
        }
        eVar2.f52189i = Math.max(max, i12) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    public e b(Object obj, boolean z10) {
        int i10;
        e eVar;
        Comparable comparable;
        e eVar2;
        Comparator comparator = this.f52165a;
        e eVar3 = this.f52167c;
        if (eVar3 != null) {
            if (comparator == f52164i) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i10 = comparable.compareTo(eVar3.f52186f);
                } else {
                    i10 = comparator.compare(obj, eVar3.f52186f);
                }
                if (i10 == 0) {
                    return eVar3;
                }
                if (i10 < 0) {
                    eVar2 = eVar3.f52182b;
                } else {
                    eVar2 = eVar3.f52183c;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e eVar4 = this.f52170f;
        if (eVar3 != null) {
            eVar = new e(this.f52166b, eVar3, obj, eVar4, eVar4.f52185e);
            if (i10 < 0) {
                eVar3.f52182b = eVar;
            } else {
                eVar3.f52183c = eVar;
            }
            g(eVar3, true);
        } else if (comparator != f52164i || (obj instanceof Comparable)) {
            eVar = new e(this.f52166b, eVar3, obj, eVar4, eVar4.f52185e);
            this.f52167c = eVar;
        } else {
            throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
        }
        this.f52168d++;
        this.f52169e++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public e c(Map.Entry entry) {
        e e10 = e(entry.getKey());
        if (e10 == null || !a(e10.f52188h, entry.getValue())) {
            return null;
        }
        return e10;
    }

    public void clear() {
        this.f52167c = null;
        this.f52168d = 0;
        this.f52169e++;
        e eVar = this.f52170f;
        eVar.f52185e = eVar;
        eVar.f52184d = eVar;
    }

    public boolean containsKey(Object obj) {
        if (e(obj) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public e e(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set entrySet() {
        b bVar = this.f52171g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f52171g = bVar2;
        return bVar2;
    }

    public Object get(Object obj) {
        e e10 = e(obj);
        if (e10 != null) {
            return e10.f52188h;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void i(e eVar, boolean z10) {
        e eVar2;
        int i10;
        if (z10) {
            e eVar3 = eVar.f52185e;
            eVar3.f52184d = eVar.f52184d;
            eVar.f52184d.f52185e = eVar3;
        }
        e eVar4 = eVar.f52182b;
        e eVar5 = eVar.f52183c;
        e eVar6 = eVar.f52181a;
        int i11 = 0;
        if (eVar4 == null || eVar5 == null) {
            if (eVar4 != null) {
                k(eVar, eVar4);
                eVar.f52182b = null;
            } else if (eVar5 != null) {
                k(eVar, eVar5);
                eVar.f52183c = null;
            } else {
                k(eVar, (e) null);
            }
            g(eVar6, false);
            this.f52168d--;
            this.f52169e++;
            return;
        }
        if (eVar4.f52189i > eVar5.f52189i) {
            eVar2 = eVar4.b();
        } else {
            eVar2 = eVar5.a();
        }
        i(eVar2, false);
        e eVar7 = eVar.f52182b;
        if (eVar7 != null) {
            i10 = eVar7.f52189i;
            eVar2.f52182b = eVar7;
            eVar7.f52181a = eVar2;
            eVar.f52182b = null;
        } else {
            i10 = 0;
        }
        e eVar8 = eVar.f52183c;
        if (eVar8 != null) {
            i11 = eVar8.f52189i;
            eVar2.f52183c = eVar8;
            eVar8.f52181a = eVar2;
            eVar.f52183c = null;
        }
        eVar2.f52189i = Math.max(i10, i11) + 1;
        k(eVar, eVar2);
    }

    /* access modifiers changed from: package-private */
    public e j(Object obj) {
        e e10 = e(obj);
        if (e10 != null) {
            i(e10, true);
        }
        return e10;
    }

    public Set keySet() {
        c cVar = this.f52172h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f52172h = cVar2;
        return cVar2;
    }

    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        } else if (obj2 != null || this.f52166b) {
            e b10 = b(obj, true);
            Object obj3 = b10.f52188h;
            b10.f52188h = obj2;
            return obj3;
        } else {
            throw new NullPointerException("value == null");
        }
    }

    public Object remove(Object obj) {
        e j10 = j(obj);
        if (j10 != null) {
            return j10.f52188h;
        }
        return null;
    }

    public int size() {
        return this.f52168d;
    }

    public A(boolean z10) {
        this(f52164i, z10);
    }

    public A(Comparator comparator, boolean z10) {
        this.f52168d = 0;
        this.f52169e = 0;
        this.f52165a = comparator == null ? f52164i : comparator;
        this.f52166b = z10;
        this.f52170f = new e(z10);
    }

    static final class e implements Map.Entry {

        /* renamed from: a  reason: collision with root package name */
        e f52181a;

        /* renamed from: b  reason: collision with root package name */
        e f52182b;

        /* renamed from: c  reason: collision with root package name */
        e f52183c;

        /* renamed from: d  reason: collision with root package name */
        e f52184d;

        /* renamed from: e  reason: collision with root package name */
        e f52185e;

        /* renamed from: f  reason: collision with root package name */
        final Object f52186f;

        /* renamed from: g  reason: collision with root package name */
        final boolean f52187g;

        /* renamed from: h  reason: collision with root package name */
        Object f52188h;

        /* renamed from: i  reason: collision with root package name */
        int f52189i;

        e(boolean z10) {
            this.f52186f = null;
            this.f52187g = z10;
            this.f52185e = this;
            this.f52184d = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f52182b; eVar2 != null; eVar2 = eVar2.f52182b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f52183c; eVar2 != null; eVar2 = eVar2.f52183c) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r3.f52186f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                java.lang.Object r0 = r3.f52188h
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Pc.A.e.equals(java.lang.Object):boolean");
        }

        public Object getKey() {
            return this.f52186f;
        }

        public Object getValue() {
            return this.f52188h;
        }

        public int hashCode() {
            int i10;
            Object obj = this.f52186f;
            int i11 = 0;
            if (obj == null) {
                i10 = 0;
            } else {
                i10 = obj.hashCode();
            }
            Object obj2 = this.f52188h;
            if (obj2 != null) {
                i11 = obj2.hashCode();
            }
            return i10 ^ i11;
        }

        public Object setValue(Object obj) {
            if (obj != null || this.f52187g) {
                Object obj2 = this.f52188h;
                this.f52188h = obj;
                return obj2;
            }
            throw new NullPointerException("value == null");
        }

        public String toString() {
            return this.f52186f + f.f37530b + this.f52188h;
        }

        e(boolean z10, e eVar, Object obj, e eVar2, e eVar3) {
            this.f52181a = eVar;
            this.f52186f = obj;
            this.f52187g = z10;
            this.f52189i = 1;
            this.f52184d = eVar2;
            this.f52185e = eVar3;
            eVar3.f52184d = this;
            eVar2.f52185e = this;
        }
    }
}
