package com.google.common.collect;

import com.amazon.a.a.o.b.f;
import com.google.common.collect.C4768t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* renamed from: com.google.common.collect.w  reason: case insensitive filesystem */
public abstract class C4771w implements Map, Serializable {

    /* renamed from: d  reason: collision with root package name */
    static final Map.Entry[] f56753d = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    /* renamed from: a  reason: collision with root package name */
    private transient C4773y f56754a;

    /* renamed from: b  reason: collision with root package name */
    private transient C4773y f56755b;

    /* renamed from: c  reason: collision with root package name */
    private transient C4768t f56756c;

    /* renamed from: com.google.common.collect.w$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Comparator f56757a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f56758b;

        /* renamed from: c  reason: collision with root package name */
        int f56759c;

        /* renamed from: d  reason: collision with root package name */
        boolean f56760d;

        /* renamed from: e  reason: collision with root package name */
        C0848a f56761e;

        /* renamed from: com.google.common.collect.w$a$a  reason: collision with other inner class name */
        static final class C0848a {

            /* renamed from: a  reason: collision with root package name */
            private final Object f56762a;

            /* renamed from: b  reason: collision with root package name */
            private final Object f56763b;

            /* renamed from: c  reason: collision with root package name */
            private final Object f56764c;

            C0848a(Object obj, Object obj2, Object obj3) {
                this.f56762a = obj;
                this.f56763b = obj2;
                this.f56764c = obj3;
            }

            /* access modifiers changed from: package-private */
            public IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f56762a + f.f37530b + this.f56763b + " and " + this.f56762a + f.f37530b + this.f56764c);
            }
        }

        public a() {
            this(4);
        }

        private C4771w b(boolean z10) {
            Object[] objArr;
            C0848a aVar;
            C0848a aVar2;
            if (!z10 || (aVar2 = this.f56761e) == null) {
                int i10 = this.f56759c;
                if (this.f56757a == null) {
                    objArr = this.f56758b;
                } else {
                    if (this.f56760d) {
                        this.f56758b = Arrays.copyOf(this.f56758b, i10 * 2);
                    }
                    objArr = this.f56758b;
                    if (!z10) {
                        objArr = e(objArr, this.f56759c);
                        if (objArr.length < this.f56758b.length) {
                            i10 = objArr.length >>> 1;
                        }
                    }
                    i(objArr, i10, this.f56757a);
                }
                this.f56760d = true;
                S p10 = S.p(i10, objArr, this);
                if (!z10 || (aVar = this.f56761e) == null) {
                    return p10;
                }
                throw aVar.a();
            }
            throw aVar2.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f56758b;
            if (i11 > objArr.length) {
                this.f56758b = Arrays.copyOf(objArr, C4768t.b.c(objArr.length, i11));
                this.f56760d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[((i10 - bitSet.cardinality()) * 2)];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static void i(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, O.b(comparator).f(G.k()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public C4771w a() {
            return c();
        }

        public C4771w c() {
            return b(true);
        }

        public a f(Object obj, Object obj2) {
            d(this.f56759c + 1);
            C4758i.a(obj, obj2);
            Object[] objArr = this.f56758b;
            int i10 = this.f56759c;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f56759c = i10 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f56759c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        a(int i10) {
            this.f56758b = new Object[(i10 * 2)];
            this.f56759c = 0;
            this.f56760d = false;
        }
    }

    /* renamed from: com.google.common.collect.w$b */
    static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        private final Object f56765a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f56766b;

        b(C4771w wVar) {
            Object[] objArr = new Object[wVar.size()];
            Object[] objArr2 = new Object[wVar.size()];
            g0 m10 = wVar.entrySet().m();
            int i10 = 0;
            while (m10.hasNext()) {
                Map.Entry entry = (Map.Entry) m10.next();
                objArr[i10] = entry.getKey();
                objArr2[i10] = entry.getValue();
                i10++;
            }
            this.f56765a = objArr;
            this.f56766b = objArr2;
        }

        /* access modifiers changed from: package-private */
        public final Object a() {
            Object[] objArr = (Object[]) this.f56765a;
            Object[] objArr2 = (Object[]) this.f56766b;
            a b10 = b(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                b10.f(objArr[i10], objArr2[i10]);
            }
            return b10.c();
        }

        /* access modifiers changed from: package-private */
        public a b(int i10) {
            return new a(i10);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            Object obj = this.f56765a;
            if (!(obj instanceof C4773y)) {
                return a();
            }
            C4773y yVar = (C4773y) obj;
            a b10 = b(yVar.size());
            g0 m10 = yVar.m();
            g0 m11 = ((C4768t) this.f56766b).m();
            while (m10.hasNext()) {
                b10.f(m10.next(), m11.next());
            }
            return b10.c();
        }
    }

    C4771w() {
    }

    public static a a() {
        return new a();
    }

    public static C4771w b(Iterable iterable) {
        int i10;
        if (iterable instanceof Collection) {
            i10 = ((Collection) iterable).size();
        } else {
            i10 = 4;
        }
        a aVar = new a(i10);
        aVar.h(iterable);
        return aVar.a();
    }

    public static C4771w c(Map map) {
        if ((map instanceof C4771w) && !(map instanceof SortedMap)) {
            C4771w wVar = (C4771w) map;
            if (!wVar.k()) {
                return wVar;
            }
        }
        return b(map.entrySet());
    }

    public static C4771w n() {
        return S.f56626h;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract C4773y e();

    public boolean equals(Object obj) {
        return G.c(this, obj);
    }

    /* access modifiers changed from: package-private */
    public abstract C4773y g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public int hashCode() {
        return a0.d(entrySet());
    }

    /* access modifiers changed from: package-private */
    public abstract C4768t i();

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public C4773y entrySet() {
        C4773y yVar = this.f56754a;
        if (yVar != null) {
            return yVar;
        }
        C4773y e10 = e();
        this.f56754a = e10;
        return e10;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean k();

    /* renamed from: l */
    public C4773y keySet() {
        C4773y yVar = this.f56755b;
        if (yVar != null) {
            return yVar;
        }
        C4773y g10 = g();
        this.f56755b = g10;
        return g10;
    }

    /* renamed from: o */
    public C4768t values() {
        C4768t tVar = this.f56756c;
        if (tVar != null) {
            return tVar;
        }
        C4768t i10 = i();
        this.f56756c = i10;
        return i10;
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return G.j(this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new b(this);
    }
}
