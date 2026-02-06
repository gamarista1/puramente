package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import nb.k;
import nb.o;

/* renamed from: com.google.common.collect.k  reason: case insensitive filesystem */
class C4760k extends AbstractMap implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final Object f56710j = new Object();

    /* renamed from: a  reason: collision with root package name */
    private transient Object f56711a;

    /* renamed from: b  reason: collision with root package name */
    transient int[] f56712b;

    /* renamed from: c  reason: collision with root package name */
    transient Object[] f56713c;

    /* renamed from: d  reason: collision with root package name */
    transient Object[] f56714d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public transient int f56715e;

    /* renamed from: f  reason: collision with root package name */
    private transient int f56716f;

    /* renamed from: g  reason: collision with root package name */
    private transient Set f56717g;

    /* renamed from: h  reason: collision with root package name */
    private transient Set f56718h;

    /* renamed from: i  reason: collision with root package name */
    private transient Collection f56719i;

    /* renamed from: com.google.common.collect.k$a */
    class a extends e {
        a() {
            super(C4760k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public Object b(int i10) {
            return C4760k.this.L(i10);
        }
    }

    /* renamed from: com.google.common.collect.k$b */
    class b extends e {
        b() {
            super(C4760k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map.Entry b(int i10) {
            return new g(i10);
        }
    }

    /* renamed from: com.google.common.collect.k$c */
    class c extends e {
        c() {
            super(C4760k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public Object b(int i10) {
            return C4760k.this.b0(i10);
        }
    }

    /* renamed from: com.google.common.collect.k$d */
    class d extends AbstractSet {
        d() {
        }

        public void clear() {
            C4760k.this.clear();
        }

        public boolean contains(Object obj) {
            Map B10 = C4760k.this.B();
            if (B10 != null) {
                return B10.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int l10 = C4760k.this.I(entry.getKey());
            if (l10 == -1 || !k.a(C4760k.this.b0(l10), entry.getValue())) {
                return false;
            }
            return true;
        }

        public Iterator iterator() {
            return C4760k.this.D();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            r0 = com.google.common.collect.C4760k.o(r9.f56723a);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r10) {
            /*
                r9 = this;
                com.google.common.collect.k r0 = com.google.common.collect.C4760k.this
                java.util.Map r0 = r0.B()
                if (r0 == 0) goto L_0x0011
                java.util.Set r0 = r0.entrySet()
                boolean r10 = r0.remove(r10)
                return r10
            L_0x0011:
                boolean r0 = r10 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0061
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                com.google.common.collect.k r0 = com.google.common.collect.C4760k.this
                boolean r0 = r0.O()
                if (r0 == 0) goto L_0x0021
                return r1
            L_0x0021:
                com.google.common.collect.k r0 = com.google.common.collect.C4760k.this
                int r0 = r0.G()
                java.lang.Object r2 = r10.getKey()
                java.lang.Object r3 = r10.getValue()
                com.google.common.collect.k r10 = com.google.common.collect.C4760k.this
                java.lang.Object r5 = r10.S()
                com.google.common.collect.k r10 = com.google.common.collect.C4760k.this
                int[] r6 = r10.Q()
                com.google.common.collect.k r10 = com.google.common.collect.C4760k.this
                java.lang.Object[] r7 = r10.R()
                com.google.common.collect.k r10 = com.google.common.collect.C4760k.this
                java.lang.Object[] r8 = r10.T()
                r4 = r0
                int r10 = com.google.common.collect.C4761l.f(r2, r3, r4, r5, r6, r7, r8)
                r2 = -1
                if (r10 != r2) goto L_0x0050
                return r1
            L_0x0050:
                com.google.common.collect.k r1 = com.google.common.collect.C4760k.this
                r1.N(r10, r0)
                com.google.common.collect.k r10 = com.google.common.collect.C4760k.this
                com.google.common.collect.C4760k.g(r10)
                com.google.common.collect.k r10 = com.google.common.collect.C4760k.this
                r10.H()
                r10 = 1
                return r10
            L_0x0061:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C4760k.d.remove(java.lang.Object):boolean");
        }

        public int size() {
            return C4760k.this.size();
        }
    }

    /* renamed from: com.google.common.collect.k$f */
    class f extends AbstractSet {
        f() {
        }

        public void clear() {
            C4760k.this.clear();
        }

        public boolean contains(Object obj) {
            return C4760k.this.containsKey(obj);
        }

        public Iterator iterator() {
            return C4760k.this.M();
        }

        public boolean remove(Object obj) {
            Map B10 = C4760k.this.B();
            if (B10 != null) {
                return B10.keySet().remove(obj);
            }
            if (C4760k.this.P(obj) != C4760k.f56710j) {
                return true;
            }
            return false;
        }

        public int size() {
            return C4760k.this.size();
        }
    }

    /* renamed from: com.google.common.collect.k$g */
    final class g extends C4754e {

        /* renamed from: a  reason: collision with root package name */
        private final Object f56729a;

        /* renamed from: b  reason: collision with root package name */
        private int f56730b;

        g(int i10) {
            this.f56729a = C4760k.this.L(i10);
            this.f56730b = i10;
        }

        private void a() {
            int i10 = this.f56730b;
            if (i10 == -1 || i10 >= C4760k.this.size() || !k.a(this.f56729a, C4760k.this.L(this.f56730b))) {
                this.f56730b = C4760k.this.I(this.f56729a);
            }
        }

        public Object getKey() {
            return this.f56729a;
        }

        public Object getValue() {
            Map B10 = C4760k.this.B();
            if (B10 != null) {
                return M.a(B10.get(this.f56729a));
            }
            a();
            int i10 = this.f56730b;
            if (i10 == -1) {
                return M.b();
            }
            return C4760k.this.b0(i10);
        }

        public Object setValue(Object obj) {
            Map B10 = C4760k.this.B();
            if (B10 != null) {
                return M.a(B10.put(this.f56729a, obj));
            }
            a();
            int i10 = this.f56730b;
            if (i10 == -1) {
                C4760k.this.put(this.f56729a, obj);
                return M.b();
            }
            Object n10 = C4760k.this.b0(i10);
            C4760k.this.a0(this.f56730b, obj);
            return n10;
        }
    }

    /* renamed from: com.google.common.collect.k$h */
    class h extends AbstractCollection {
        h() {
        }

        public void clear() {
            C4760k.this.clear();
        }

        public Iterator iterator() {
            return C4760k.this.c0();
        }

        public int size() {
            return C4760k.this.size();
        }
    }

    C4760k() {
        J(3);
    }

    public static C4760k A(int i10) {
        return new C4760k(i10);
    }

    private int C(int i10) {
        return Q()[i10];
    }

    /* access modifiers changed from: private */
    public int G() {
        return (1 << (this.f56715e & 31)) - 1;
    }

    /* access modifiers changed from: private */
    public int I(Object obj) {
        if (O()) {
            return -1;
        }
        int c10 = C4767s.c(obj);
        int G10 = G();
        int h10 = C4761l.h(S(), c10 & G10);
        if (h10 == 0) {
            return -1;
        }
        int b10 = C4761l.b(c10, G10);
        do {
            int i10 = h10 - 1;
            int C10 = C(i10);
            if (C4761l.b(C10, G10) == b10 && k.a(obj, L(i10))) {
                return i10;
            }
            h10 = C4761l.c(C10, G10);
        } while (h10 != 0);
        return -1;
    }

    /* access modifiers changed from: private */
    public Object L(int i10) {
        return R()[i10];
    }

    /* access modifiers changed from: private */
    public Object P(Object obj) {
        if (O()) {
            return f56710j;
        }
        int G10 = G();
        int f10 = C4761l.f(obj, (Object) null, G10, S(), Q(), R(), (Object[]) null);
        if (f10 == -1) {
            return f56710j;
        }
        Object b02 = b0(f10);
        N(f10, G10);
        this.f56716f--;
        H();
        return b02;
    }

    /* access modifiers changed from: private */
    public int[] Q() {
        int[] iArr = this.f56712b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* access modifiers changed from: private */
    public Object[] R() {
        Object[] objArr = this.f56713c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* access modifiers changed from: private */
    public Object S() {
        Object obj = this.f56711a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* access modifiers changed from: private */
    public Object[] T() {
        Object[] objArr = this.f56714d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void V(int i10) {
        int min;
        int length = Q().length;
        if (i10 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            U(min);
        }
    }

    private int W(int i10, int i11, int i12, int i13) {
        Object a10 = C4761l.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C4761l.i(a10, i12 & i14, i13 + 1);
        }
        Object S10 = S();
        int[] Q10 = Q();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = C4761l.h(S10, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = Q10[i16];
                int b10 = C4761l.b(i17, i10) | i15;
                int i18 = b10 & i14;
                int h11 = C4761l.h(a10, i18);
                C4761l.i(a10, i18, h10);
                Q10[i16] = C4761l.d(b10, h11, i14);
                h10 = C4761l.c(i17, i10);
            }
        }
        this.f56711a = a10;
        Y(i14);
        return i14;
    }

    private void X(int i10, int i11) {
        Q()[i10] = i11;
    }

    private void Y(int i10) {
        this.f56715e = C4761l.d(this.f56715e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void Z(int i10, Object obj) {
        R()[i10] = obj;
    }

    /* access modifiers changed from: private */
    public void a0(int i10, Object obj) {
        T()[i10] = obj;
    }

    /* access modifiers changed from: private */
    public Object b0(int i10) {
        return T()[i10];
    }

    static /* synthetic */ int g(C4760k kVar) {
        int i10 = kVar.f56716f;
        kVar.f56716f = i10 - 1;
        return i10;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            J(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + readInt);
    }

    public static C4760k v() {
        return new C4760k();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator D10 = D();
        while (D10.hasNext()) {
            Map.Entry entry = (Map.Entry) D10.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public Map B() {
        Object obj = this.f56711a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Iterator D() {
        Map B10 = B();
        if (B10 != null) {
            return B10.entrySet().iterator();
        }
        return new b();
    }

    /* access modifiers changed from: package-private */
    public int E() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int F(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f56716f) {
            return i11;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void H() {
        this.f56715e += 32;
    }

    /* access modifiers changed from: package-private */
    public void J(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.e(z10, "Expected size must be >= 0");
        this.f56715e = com.google.common.primitives.f.f(i10, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    public void K(int i10, Object obj, Object obj2, int i11, int i12) {
        X(i10, C4761l.d(i11, 0, i12));
        Z(i10, obj);
        a0(i10, obj2);
    }

    /* access modifiers changed from: package-private */
    public Iterator M() {
        Map B10 = B();
        if (B10 != null) {
            return B10.keySet().iterator();
        }
        return new a();
    }

    /* access modifiers changed from: package-private */
    public void N(int i10, int i11) {
        Object S10 = S();
        int[] Q10 = Q();
        Object[] R10 = R();
        Object[] T10 = T();
        int size = size();
        int i12 = size - 1;
        if (i10 < i12) {
            Object obj = R10[i12];
            R10[i10] = obj;
            T10[i10] = T10[i12];
            R10[i12] = null;
            T10[i12] = null;
            Q10[i10] = Q10[i12];
            Q10[i12] = 0;
            int c10 = C4767s.c(obj) & i11;
            int h10 = C4761l.h(S10, c10);
            if (h10 == size) {
                C4761l.i(S10, c10, i10 + 1);
                return;
            }
            while (true) {
                int i13 = h10 - 1;
                int i14 = Q10[i13];
                int c11 = C4761l.c(i14, i11);
                if (c11 == size) {
                    Q10[i13] = C4761l.d(i14, i10 + 1, i11);
                    return;
                }
                h10 = c11;
            }
        } else {
            R10[i10] = null;
            T10[i10] = null;
            Q10[i10] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean O() {
        if (this.f56711a == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void U(int i10) {
        this.f56712b = Arrays.copyOf(Q(), i10);
        this.f56713c = Arrays.copyOf(R(), i10);
        this.f56714d = Arrays.copyOf(T(), i10);
    }

    /* access modifiers changed from: package-private */
    public Iterator c0() {
        Map B10 = B();
        if (B10 != null) {
            return B10.values().iterator();
        }
        return new c();
    }

    public void clear() {
        if (!O()) {
            H();
            Map B10 = B();
            if (B10 != null) {
                this.f56715e = com.google.common.primitives.f.f(size(), 3, 1073741823);
                B10.clear();
                this.f56711a = null;
                this.f56716f = 0;
                return;
            }
            Arrays.fill(R(), 0, this.f56716f, (Object) null);
            Arrays.fill(T(), 0, this.f56716f, (Object) null);
            C4761l.g(S());
            Arrays.fill(Q(), 0, this.f56716f, 0);
            this.f56716f = 0;
        }
    }

    public boolean containsKey(Object obj) {
        Map B10 = B();
        if (B10 != null) {
            return B10.containsKey(obj);
        }
        if (I(obj) != -1) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        Map B10 = B();
        if (B10 != null) {
            return B10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f56716f; i10++) {
            if (k.a(obj, b0(i10))) {
                return true;
            }
        }
        return false;
    }

    public Set entrySet() {
        Set set = this.f56718h;
        if (set != null) {
            return set;
        }
        Set w10 = w();
        this.f56718h = w10;
        return w10;
    }

    public Object get(Object obj) {
        Map B10 = B();
        if (B10 != null) {
            return B10.get(obj);
        }
        int I10 = I(obj);
        if (I10 == -1) {
            return null;
        }
        r(I10);
        return b0(I10);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Set keySet() {
        Set set = this.f56717g;
        if (set != null) {
            return set;
        }
        Set y10 = y();
        this.f56717g = y10;
        return y10;
    }

    public Object put(Object obj, Object obj2) {
        int i10;
        int W10;
        if (O()) {
            t();
        }
        Map B10 = B();
        if (B10 != null) {
            return B10.put(obj, obj2);
        }
        int[] Q10 = Q();
        Object[] R10 = R();
        Object[] T10 = T();
        int i11 = this.f56716f;
        int i12 = i11 + 1;
        int c10 = C4767s.c(obj);
        int G10 = G();
        int i13 = c10 & G10;
        int h10 = C4761l.h(S(), i13);
        if (h10 != 0) {
            int b10 = C4761l.b(c10, G10);
            int i14 = 0;
            while (true) {
                int i15 = h10 - 1;
                int i16 = Q10[i15];
                if (C4761l.b(i16, G10) != b10 || !k.a(obj, R10[i15])) {
                    int c11 = C4761l.c(i16, G10);
                    i14++;
                    if (c11 != 0) {
                        h10 = c11;
                    } else if (i14 >= 9) {
                        return u().put(obj, obj2);
                    } else {
                        if (i12 > G10) {
                            W10 = W(G10, C4761l.e(G10), c10, i11);
                        } else {
                            Q10[i15] = C4761l.d(i16, i12, G10);
                        }
                    }
                } else {
                    Object obj3 = T10[i15];
                    T10[i15] = obj2;
                    r(i15);
                    return obj3;
                }
            }
            i10 = G10;
            V(i12);
            K(i11, obj, obj2, c10, i10);
            this.f56716f = i12;
            H();
            return null;
        } else if (i12 > G10) {
            W10 = W(G10, C4761l.e(G10), c10, i11);
        } else {
            C4761l.i(S(), i13, i12);
            i10 = G10;
            V(i12);
            K(i11, obj, obj2, c10, i10);
            this.f56716f = i12;
            H();
            return null;
        }
        i10 = W10;
        V(i12);
        K(i11, obj, obj2, c10, i10);
        this.f56716f = i12;
        H();
        return null;
    }

    /* access modifiers changed from: package-private */
    public void r(int i10) {
    }

    public Object remove(Object obj) {
        Map B10 = B();
        if (B10 != null) {
            return B10.remove(obj);
        }
        Object P10 = P(obj);
        if (P10 == f56710j) {
            return null;
        }
        return P10;
    }

    /* access modifiers changed from: package-private */
    public int s(int i10, int i11) {
        return i10 - 1;
    }

    public int size() {
        Map B10 = B();
        if (B10 != null) {
            return B10.size();
        }
        return this.f56716f;
    }

    /* access modifiers changed from: package-private */
    public int t() {
        o.p(O(), "Arrays already allocated");
        int i10 = this.f56715e;
        int j10 = C4761l.j(i10);
        this.f56711a = C4761l.a(j10);
        Y(j10 - 1);
        this.f56712b = new int[i10];
        this.f56713c = new Object[i10];
        this.f56714d = new Object[i10];
        return i10;
    }

    /* access modifiers changed from: package-private */
    public Map u() {
        Map x10 = x(G() + 1);
        int E10 = E();
        while (E10 >= 0) {
            x10.put(L(E10), b0(E10));
            E10 = F(E10);
        }
        this.f56711a = x10;
        this.f56712b = null;
        this.f56713c = null;
        this.f56714d = null;
        H();
        return x10;
    }

    public Collection values() {
        Collection collection = this.f56719i;
        if (collection != null) {
            return collection;
        }
        Collection z10 = z();
        this.f56719i = z10;
        return z10;
    }

    /* access modifiers changed from: package-private */
    public Set w() {
        return new d();
    }

    /* access modifiers changed from: package-private */
    public Map x(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public Set y() {
        return new f();
    }

    /* access modifiers changed from: package-private */
    public Collection z() {
        return new h();
    }

    C4760k(int i10) {
        J(i10);
    }

    /* renamed from: com.google.common.collect.k$e */
    private abstract class e implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        int f56724a;

        /* renamed from: b  reason: collision with root package name */
        int f56725b;

        /* renamed from: c  reason: collision with root package name */
        int f56726c;

        private e() {
            this.f56724a = C4760k.this.f56715e;
            this.f56725b = C4760k.this.E();
            this.f56726c = -1;
        }

        private void a() {
            if (C4760k.this.f56715e != this.f56724a) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract Object b(int i10);

        /* access modifiers changed from: package-private */
        public void c() {
            this.f56724a += 32;
        }

        public boolean hasNext() {
            if (this.f56725b >= 0) {
                return true;
            }
            return false;
        }

        public Object next() {
            a();
            if (hasNext()) {
                int i10 = this.f56725b;
                this.f56726c = i10;
                Object b10 = b(i10);
                this.f56725b = C4760k.this.F(this.f56725b);
                return b10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z10;
            a();
            if (this.f56726c >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            C4758i.c(z10);
            c();
            C4760k kVar = C4760k.this;
            kVar.remove(kVar.L(this.f56726c));
            this.f56725b = C4760k.this.s(this.f56725b, this.f56726c);
            this.f56726c = -1;
        }

        /* synthetic */ e(C4760k kVar, a aVar) {
            this();
        }
    }
}
