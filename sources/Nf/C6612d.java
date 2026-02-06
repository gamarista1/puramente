package nf;

import Ef.m;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6550c;
import zf.C6828a;
import zf.C6832e;

/* renamed from: nf.d  reason: case insensitive filesystem */
public final class C6612d implements Map, Serializable, C6832e {

    /* renamed from: n  reason: collision with root package name */
    public static final a f72243n = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final C6612d f72244o;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Object[] f72245a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Object[] f72246b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int[] f72247c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f72248d;

    /* renamed from: e  reason: collision with root package name */
    private int f72249e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f72250f;

    /* renamed from: g  reason: collision with root package name */
    private int f72251g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f72252h;

    /* renamed from: i  reason: collision with root package name */
    private int f72253i;

    /* renamed from: j  reason: collision with root package name */
    private C6614f f72254j;

    /* renamed from: k  reason: collision with root package name */
    private C6615g f72255k;

    /* renamed from: l  reason: collision with root package name */
    private C6613e f72256l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f72257m;

    /* renamed from: nf.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(m.d(i10, 1) * 3);
        }

        /* access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final C6612d e() {
            return C6612d.f72244o;
        }

        private a() {
        }
    }

    /* renamed from: nf.d$b */
    public static final class b extends C1041d implements Iterator, C6828a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C6612d dVar) {
            super(dVar);
            C6496s.h(dVar, "map");
        }

        /* renamed from: l */
        public c next() {
            a();
            if (b() < e().f72250f) {
                int b10 = b();
                j(b10 + 1);
                k(b10);
                c cVar = new c(e(), c());
                g();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void n(StringBuilder sb2) {
            C6496s.h(sb2, "sb");
            if (b() < e().f72250f) {
                int b10 = b();
                j(b10 + 1);
                k(b10);
                Object obj = e().f72245a[c()];
                if (obj == e()) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] k10 = e().f72246b;
                C6496s.e(k10);
                Object obj2 = k10[c()];
                if (obj2 == e()) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                g();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int o() {
            int i10;
            if (b() < e().f72250f) {
                int b10 = b();
                j(b10 + 1);
                k(b10);
                Object obj = e().f72245a[c()];
                int i11 = 0;
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                Object[] k10 = e().f72246b;
                C6496s.e(k10);
                Object obj2 = k10[c()];
                if (obj2 != null) {
                    i11 = obj2.hashCode();
                }
                int i12 = i10 ^ i11;
                g();
                return i12;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: nf.d$c */
    public static final class c implements Map.Entry, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final C6612d f72258a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72259b;

        public c(C6612d dVar, int i10) {
            C6496s.h(dVar, "map");
            this.f72258a = dVar;
            this.f72259b = i10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!C6496s.c(entry.getKey(), getKey()) || !C6496s.c(entry.getValue(), getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public Object getKey() {
            return this.f72258a.f72245a[this.f72259b];
        }

        public Object getValue() {
            Object[] k10 = this.f72258a.f72246b;
            C6496s.e(k10);
            return k10[this.f72259b];
        }

        public int hashCode() {
            int i10;
            Object key = getKey();
            int i11 = 0;
            if (key != null) {
                i10 = key.hashCode();
            } else {
                i10 = 0;
            }
            Object value = getValue();
            if (value != null) {
                i11 = value.hashCode();
            }
            return i10 ^ i11;
        }

        public Object setValue(Object obj) {
            this.f72258a.r();
            Object[] a10 = this.f72258a.o();
            int i10 = this.f72259b;
            Object obj2 = a10[i10];
            a10[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* renamed from: nf.d$d  reason: collision with other inner class name */
    public static class C1041d {

        /* renamed from: a  reason: collision with root package name */
        private final C6612d f72260a;

        /* renamed from: b  reason: collision with root package name */
        private int f72261b;

        /* renamed from: c  reason: collision with root package name */
        private int f72262c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f72263d;

        public C1041d(C6612d dVar) {
            C6496s.h(dVar, "map");
            this.f72260a = dVar;
            this.f72263d = dVar.f72252h;
            g();
        }

        public final void a() {
            if (this.f72260a.f72252h != this.f72263d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f72261b;
        }

        public final int c() {
            return this.f72262c;
        }

        public final C6612d e() {
            return this.f72260a;
        }

        public final void g() {
            while (this.f72261b < this.f72260a.f72250f) {
                int[] j10 = this.f72260a.f72247c;
                int i10 = this.f72261b;
                if (j10[i10] < 0) {
                    this.f72261b = i10 + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            if (this.f72261b < this.f72260a.f72250f) {
                return true;
            }
            return false;
        }

        public final void j(int i10) {
            this.f72261b = i10;
        }

        public final void k(int i10) {
            this.f72262c = i10;
        }

        public final void remove() {
            a();
            if (this.f72262c != -1) {
                this.f72260a.r();
                this.f72260a.T(this.f72262c);
                this.f72262c = -1;
                this.f72263d = this.f72260a.f72252h;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
    }

    /* renamed from: nf.d$e */
    public static final class e extends C1041d implements Iterator, C6828a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C6612d dVar) {
            super(dVar);
            C6496s.h(dVar, "map");
        }

        public Object next() {
            a();
            if (b() < e().f72250f) {
                int b10 = b();
                j(b10 + 1);
                k(b10);
                Object obj = e().f72245a[c()];
                g();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: nf.d$f */
    public static final class f extends C1041d implements Iterator, C6828a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C6612d dVar) {
            super(dVar);
            C6496s.h(dVar, "map");
        }

        public Object next() {
            a();
            if (b() < e().f72250f) {
                int b10 = b();
                j(b10 + 1);
                k(b10);
                Object[] k10 = e().f72246b;
                C6496s.e(k10);
                Object obj = k10[c()];
                g();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        C6612d dVar = new C6612d(0);
        dVar.f72257m = true;
        f72244o = dVar;
    }

    private C6612d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f72245a = objArr;
        this.f72246b = objArr2;
        this.f72247c = iArr;
        this.f72248d = iArr2;
        this.f72249e = i10;
        this.f72250f = i11;
        this.f72251g = f72243n.d(E());
    }

    private final int A(Object obj) {
        int K10 = K(obj);
        int i10 = this.f72249e;
        while (true) {
            int i11 = this.f72248d[K10];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (C6496s.c(this.f72245a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            int i13 = K10 - 1;
            if (K10 == 0) {
                K10 = E() - 1;
            } else {
                K10 = i13;
            }
        }
    }

    private final int B(Object obj) {
        int i10 = this.f72250f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f72247c[i10] >= 0) {
                Object[] objArr = this.f72246b;
                C6496s.e(objArr);
                if (C6496s.c(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    private final int E() {
        return this.f72248d.length;
    }

    private final int K(Object obj) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return (i10 * -1640531527) >>> this.f72251g;
    }

    private final boolean N(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        x(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (O((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean O(Map.Entry entry) {
        int n10 = n(entry.getKey());
        Object[] o10 = o();
        if (n10 >= 0) {
            o10[n10] = entry.getValue();
            return true;
        }
        int i10 = (-n10) - 1;
        if (C6496s.c(entry.getValue(), o10[i10])) {
            return false;
        }
        o10[i10] = entry.getValue();
        return true;
    }

    private final boolean P(int i10) {
        int K10 = K(this.f72245a[i10]);
        int i11 = this.f72249e;
        while (true) {
            int[] iArr = this.f72248d;
            if (iArr[K10] == 0) {
                iArr[K10] = i10 + 1;
                this.f72247c[i10] = K10;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            int i12 = K10 - 1;
            if (K10 == 0) {
                K10 = E() - 1;
            } else {
                K10 = i12;
            }
        }
    }

    private final void Q() {
        this.f72252h++;
    }

    private final void R(int i10) {
        Q();
        int i11 = 0;
        if (this.f72250f > size()) {
            s(false);
        }
        this.f72248d = new int[i10];
        this.f72251g = f72243n.d(i10);
        while (i11 < this.f72250f) {
            int i12 = i11 + 1;
            if (P(i11)) {
                i11 = i12;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void T(int i10) {
        C6611c.f(this.f72245a, i10);
        Object[] objArr = this.f72246b;
        if (objArr != null) {
            C6611c.f(objArr, i10);
        }
        U(this.f72247c[i10]);
        this.f72247c[i10] = -1;
        this.f72253i = size() - 1;
        Q();
    }

    private final void U(int i10) {
        int h10 = m.h(this.f72249e * 2, E() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            int i13 = i10 - 1;
            if (i10 == 0) {
                i10 = E() - 1;
            } else {
                i10 = i13;
            }
            i11++;
            if (i11 > this.f72249e) {
                this.f72248d[i12] = 0;
                return;
            }
            int[] iArr = this.f72248d;
            int i14 = iArr[i10];
            if (i14 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i14 < 0) {
                iArr[i12] = -1;
            } else {
                int i15 = i14 - 1;
                if (((K(this.f72245a[i15]) - i10) & (E() - 1)) >= i11) {
                    this.f72248d[i12] = i14;
                    this.f72247c[i15] = i12;
                }
                h10--;
            }
            i12 = i10;
            i11 = 0;
            h10--;
        } while (h10 >= 0);
        this.f72248d[i12] = -1;
    }

    private final boolean X(int i10) {
        int C10 = C();
        int i11 = this.f72250f;
        int i12 = C10 - i11;
        int size = i11 - size();
        if (i12 >= i10 || i12 + size < i10 || size < C() / 4) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final Object[] o() {
        Object[] objArr = this.f72246b;
        if (objArr != null) {
            return objArr;
        }
        Object[] d10 = C6611c.d(C());
        this.f72246b = d10;
        return d10;
    }

    private final void s(boolean z10) {
        int i10;
        Object[] objArr = this.f72246b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f72250f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f72247c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f72245a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f72248d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        C6611c.g(this.f72245a, i12, i10);
        if (objArr != null) {
            C6611c.g(objArr, i12, this.f72250f);
        }
        this.f72250f = i12;
    }

    private final boolean v(Map map) {
        if (size() != map.size() || !t(map.entrySet())) {
            return false;
        }
        return true;
    }

    private final void w(int i10) {
        Object[] objArr;
        if (i10 < 0) {
            throw new OutOfMemoryError();
        } else if (i10 > C()) {
            int e10 = C6550c.f72053a.e(C(), i10);
            this.f72245a = C6611c.e(this.f72245a, e10);
            Object[] objArr2 = this.f72246b;
            if (objArr2 != null) {
                objArr = C6611c.e(objArr2, e10);
            } else {
                objArr = null;
            }
            this.f72246b = objArr;
            int[] copyOf = Arrays.copyOf(this.f72247c, e10);
            C6496s.g(copyOf, "copyOf(...)");
            this.f72247c = copyOf;
            int a10 = f72243n.c(e10);
            if (a10 > E()) {
                R(a10);
            }
        }
    }

    private final Object writeReplace() {
        if (this.f72257m) {
            return new C6617i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void x(int i10) {
        if (X(i10)) {
            s(true);
        } else {
            w(this.f72250f + i10);
        }
    }

    public final int C() {
        return this.f72245a.length;
    }

    public Set D() {
        C6613e eVar = this.f72256l;
        if (eVar != null) {
            return eVar;
        }
        C6613e eVar2 = new C6613e(this);
        this.f72256l = eVar2;
        return eVar2;
    }

    public Set G() {
        C6614f fVar = this.f72254j;
        if (fVar != null) {
            return fVar;
        }
        C6614f fVar2 = new C6614f(this);
        this.f72254j = fVar2;
        return fVar2;
    }

    public int H() {
        return this.f72253i;
    }

    public Collection I() {
        C6615g gVar = this.f72255k;
        if (gVar != null) {
            return gVar;
        }
        C6615g gVar2 = new C6615g(this);
        this.f72255k = gVar2;
        return gVar2;
    }

    public final boolean L() {
        return this.f72257m;
    }

    public final e M() {
        return new e(this);
    }

    public final boolean S(Map.Entry entry) {
        C6496s.h(entry, "entry");
        r();
        int A10 = A(entry.getKey());
        if (A10 < 0) {
            return false;
        }
        Object[] objArr = this.f72246b;
        C6496s.e(objArr);
        if (!C6496s.c(objArr[A10], entry.getValue())) {
            return false;
        }
        T(A10);
        return true;
    }

    public final boolean V(Object obj) {
        r();
        int A10 = A(obj);
        if (A10 < 0) {
            return false;
        }
        T(A10);
        return true;
    }

    public final boolean W(Object obj) {
        r();
        int B10 = B(obj);
        if (B10 < 0) {
            return false;
        }
        T(B10);
        return true;
    }

    public final f Y() {
        return new f(this);
    }

    public void clear() {
        r();
        int i10 = this.f72250f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f72247c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f72248d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        C6611c.g(this.f72245a, 0, this.f72250f);
        Object[] objArr = this.f72246b;
        if (objArr != null) {
            C6611c.g(objArr, 0, this.f72250f);
        }
        this.f72253i = 0;
        this.f72250f = 0;
        Q();
    }

    public boolean containsKey(Object obj) {
        if (A(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (B(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final /* bridge */ Set entrySet() {
        return D();
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof Map) && v((Map) obj))) {
            return true;
        }
        return false;
    }

    public Object get(Object obj) {
        int A10 = A(obj);
        if (A10 < 0) {
            return null;
        }
        Object[] objArr = this.f72246b;
        C6496s.e(objArr);
        return objArr[A10];
    }

    public int hashCode() {
        b z10 = z();
        int i10 = 0;
        while (z10.hasNext()) {
            i10 += z10.o();
        }
        return i10;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final /* bridge */ Set keySet() {
        return G();
    }

    public final int n(Object obj) {
        r();
        while (true) {
            int K10 = K(obj);
            int h10 = m.h(this.f72249e * 2, E() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f72248d[K10];
                if (i11 <= 0) {
                    if (this.f72250f >= C()) {
                        x(1);
                    } else {
                        int i12 = this.f72250f;
                        int i13 = i12 + 1;
                        this.f72250f = i13;
                        this.f72245a[i12] = obj;
                        this.f72247c[i12] = K10;
                        this.f72248d[K10] = i13;
                        this.f72253i = size() + 1;
                        Q();
                        if (i10 > this.f72249e) {
                            this.f72249e = i10;
                        }
                        return i12;
                    }
                } else if (C6496s.c(this.f72245a[i11 - 1], obj)) {
                    return -i11;
                } else {
                    i10++;
                    if (i10 > h10) {
                        R(E() * 2);
                        break;
                    }
                    int i14 = K10 - 1;
                    if (K10 == 0) {
                        K10 = E() - 1;
                    } else {
                        K10 = i14;
                    }
                }
            }
        }
    }

    public Object put(Object obj, Object obj2) {
        r();
        int n10 = n(obj);
        Object[] o10 = o();
        if (n10 < 0) {
            int i10 = (-n10) - 1;
            Object obj3 = o10[i10];
            o10[i10] = obj2;
            return obj3;
        }
        o10[n10] = obj2;
        return null;
    }

    public void putAll(Map map) {
        C6496s.h(map, TicketDetailDestinationKt.LAUNCHED_FROM);
        r();
        N(map.entrySet());
    }

    public final Map q() {
        r();
        this.f72257m = true;
        if (size() > 0) {
            return this;
        }
        C6612d dVar = f72244o;
        C6496s.f(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void r() {
        if (this.f72257m) {
            throw new UnsupportedOperationException();
        }
    }

    public Object remove(Object obj) {
        r();
        int A10 = A(obj);
        if (A10 < 0) {
            return null;
        }
        Object[] objArr = this.f72246b;
        C6496s.e(objArr);
        Object obj2 = objArr[A10];
        T(A10);
        return obj2;
    }

    public final /* bridge */ int size() {
        return H();
    }

    public final boolean t(Collection collection) {
        C6496s.h(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!u((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b z10 = z();
        int i10 = 0;
        while (z10.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            z10.n(sb2);
            i10++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public final boolean u(Map.Entry entry) {
        C6496s.h(entry, "entry");
        int A10 = A(entry.getKey());
        if (A10 < 0) {
            return false;
        }
        Object[] objArr = this.f72246b;
        C6496s.e(objArr);
        return C6496s.c(objArr[A10], entry.getValue());
    }

    public final /* bridge */ Collection values() {
        return I();
    }

    public final b z() {
        return new b(this);
    }

    public C6612d() {
        this(8);
    }

    public C6612d(int i10) {
        this(C6611c.d(i10), (Object[]) null, new int[i10], new int[f72243n.c(i10)], 2, 0);
    }
}
