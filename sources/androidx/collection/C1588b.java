package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import u.C2664a;
import zf.C6829b;
import zf.C6833f;

/* renamed from: androidx.collection.b  reason: case insensitive filesystem */
public final class C1588b implements Collection, Set, C6829b, C6833f {

    /* renamed from: a  reason: collision with root package name */
    private int[] f12157a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f12158b;

    /* renamed from: c  reason: collision with root package name */
    private int f12159c;

    /* renamed from: androidx.collection.b$a */
    private final class a extends C1596j {
        public a() {
            super(C1588b.this.n());
        }

        /* access modifiers changed from: protected */
        public Object a(int i10) {
            return C1588b.this.z(i10);
        }

        /* access modifiers changed from: protected */
        public void b(int i10) {
            C1588b.this.r(i10);
        }
    }

    public C1588b() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public final void a(int i10) {
        int n10 = n();
        if (g().length < i10) {
            int[] g10 = g();
            Object[] b10 = b();
            C1590d.a(this, i10);
            if (n() > 0) {
                C6559l.p(g10, g(), 0, 0, n(), 6, (Object) null);
                C6559l.q(b10, b(), 0, 0, n(), 6, (Object) null);
            }
        }
        if (n() != n10) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean add(Object obj) {
        int i10;
        int i11;
        Object obj2 = obj;
        int n10 = n();
        boolean z10 = false;
        if (obj2 == null) {
            i11 = C1590d.d(this);
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            i11 = C1590d.c(this, obj2, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        if (n10 >= g().length) {
            int i13 = 8;
            if (n10 >= 8) {
                i13 = (n10 >> 1) + n10;
            } else if (n10 < 4) {
                i13 = 4;
            }
            int[] g10 = g();
            Object[] b10 = b();
            C1590d.a(this, i13);
            if (n10 == n()) {
                if (g().length == 0) {
                    z10 = true;
                }
                if (!z10) {
                    C6559l.p(g10, g(), 0, 0, g10.length, 6, (Object) null);
                    C6559l.q(b10, b(), 0, 0, b10.length, 6, (Object) null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < n10) {
            int i14 = i12 + 1;
            C6559l.k(g(), g(), i14, i12, n10);
            C6559l.m(b(), b(), i14, i12, n10);
        }
        if (n10 != n() || i12 >= g().length) {
            throw new ConcurrentModificationException();
        }
        g()[i12] = i10;
        b()[i12] = obj2;
        x(n() + 1);
        return true;
    }

    public boolean addAll(Collection collection) {
        C6496s.h(collection, "elements");
        a(n() + collection.size());
        boolean z10 = false;
        for (Object add : collection) {
            z10 |= add(add);
        }
        return z10;
    }

    public final Object[] b() {
        return this.f12158b;
    }

    public void clear() {
        if (n() != 0) {
            v(C2664a.f26373a);
            t(C2664a.f26375c);
            x(0);
        }
        if (n() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C6496s.h(collection, "elements");
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int n10 = n();
                int i10 = 0;
                while (i10 < n10) {
                    if (((Set) obj).contains(z(i10))) {
                        i10++;
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int[] g() {
        return this.f12157a;
    }

    public int hashCode() {
        int[] g10 = g();
        int n10 = n();
        int i10 = 0;
        for (int i11 = 0; i11 < n10; i11++) {
            i10 += g10[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return C1590d.d(this);
        }
        return C1590d.c(this, obj, obj.hashCode());
    }

    public boolean isEmpty() {
        if (n() <= 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new a();
    }

    public int k() {
        return this.f12159c;
    }

    public final int n() {
        return this.f12159c;
    }

    public final Object r(int i10) {
        int n10 = n();
        Object obj = b()[i10];
        if (n10 <= 1) {
            clear();
        } else {
            int i11 = n10 - 1;
            int i12 = 8;
            if (g().length <= 8 || n() >= g().length / 3) {
                if (i10 < i11) {
                    int i13 = i10 + 1;
                    C6559l.k(g(), g(), i10, i13, n10);
                    C6559l.m(b(), b(), i10, i13, n10);
                }
                b()[i11] = null;
            } else {
                if (n() > 8) {
                    i12 = n() + (n() >> 1);
                }
                int[] g10 = g();
                Object[] b10 = b();
                C1590d.a(this, i12);
                if (i10 > 0) {
                    int i14 = i10;
                    C6559l.p(g10, g(), 0, 0, i14, 6, (Object) null);
                    C6559l.q(b10, b(), 0, 0, i14, 6, (Object) null);
                }
                if (i10 < i11) {
                    int i15 = i10 + 1;
                    C6559l.k(g10, g(), i10, i15, n10);
                    C6559l.m(b10, b(), i10, i15, n10);
                }
            }
            if (n10 == n()) {
                x(i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        r(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        C6496s.h(collection, "elements");
        boolean z10 = false;
        for (Object remove : collection) {
            z10 |= remove(remove);
        }
        return z10;
    }

    public boolean retainAll(Collection collection) {
        C6496s.h(collection, "elements");
        boolean z10 = false;
        for (int n10 = n() - 1; -1 < n10; n10--) {
            if (!C6565s.e0(collection, b()[n10])) {
                r(n10);
                z10 = true;
            }
        }
        return z10;
    }

    public final /* bridge */ int size() {
        return k();
    }

    public final void t(Object[] objArr) {
        C6496s.h(objArr, "<set-?>");
        this.f12158b = objArr;
    }

    public final Object[] toArray() {
        return C6559l.s(this.f12158b, 0, this.f12159c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(n() * 14);
        sb2.append('{');
        int n10 = n();
        for (int i10 = 0; i10 < n10; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object z10 = z(i10);
            if (z10 != this) {
                sb2.append(z10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public final void v(int[] iArr) {
        C6496s.h(iArr, "<set-?>");
        this.f12157a = iArr;
    }

    public final void x(int i10) {
        this.f12159c = i10;
    }

    public final Object z(int i10) {
        return b()[i10];
    }

    public C1588b(int i10) {
        this.f12157a = C2664a.f26373a;
        this.f12158b = C2664a.f26375c;
        if (i10 > 0) {
            C1590d.a(this, i10);
        }
    }

    public final Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        Object[] a10 = C1589c.a(objArr, this.f12159c);
        C6559l.m(this.f12158b, a10, 0, 0, this.f12159c);
        C6496s.g(a10, "result");
        return a10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1588b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
