package lf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import zf.C6828a;

/* renamed from: lf.K  reason: case insensitive filesystem */
public final class C6512K implements Collection, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final short[] f71810a;

    /* renamed from: lf.K$a */
    private static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final short[] f71811a;

        /* renamed from: b  reason: collision with root package name */
        private int f71812b;

        public a(short[] sArr) {
            C6496s.h(sArr, "array");
            this.f71811a = sArr;
        }

        public short a() {
            int i10 = this.f71812b;
            short[] sArr = this.f71811a;
            if (i10 < sArr.length) {
                this.f71812b = i10 + 1;
                return C6511J.b(sArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f71812b));
        }

        public boolean hasNext() {
            if (this.f71812b < this.f71811a.length) {
                return true;
            }
            return false;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C6511J.a(a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C6512K(short[] sArr) {
        this.f71810a = sArr;
    }

    public static int A(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean C(short[] sArr) {
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator D(short[] sArr) {
        return new a(sArr);
    }

    public static final void E(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String H(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public static final /* synthetic */ C6512K a(short[] sArr) {
        return new C6512K(sArr);
    }

    public static short[] b(int i10) {
        return g(new short[i10]);
    }

    public static short[] g(short[] sArr) {
        C6496s.h(sArr, "storage");
        return sArr;
    }

    public static boolean n(short[] sArr, short s10) {
        return C6559l.X(sArr, s10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean r(short[] r3, java.util.Collection r4) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0012
            goto L_0x0032
        L_0x0012:
            java.util.Iterator r4 = r4.iterator()
        L_0x0016:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r4.next()
            boolean r2 = r0 instanceof lf.C6511J
            if (r2 == 0) goto L_0x0031
            lf.J r0 = (lf.C6511J) r0
            short r0 = r0.i()
            boolean r0 = mf.C6559l.X(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.C6512K.r(short[], java.util.Collection):boolean");
    }

    public static boolean t(short[] sArr, Object obj) {
        if ((obj instanceof C6512K) && C6496s.c(sArr, ((C6512K) obj).I())) {
            return true;
        }
        return false;
    }

    public static final short v(short[] sArr, int i10) {
        return C6511J.b(sArr[i10]);
    }

    public static int z(short[] sArr) {
        return sArr.length;
    }

    public final /* synthetic */ short[] I() {
        return this.f71810a;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C6511J)) {
            return false;
        }
        return k(((C6511J) obj).i());
    }

    public boolean containsAll(Collection collection) {
        C6496s.h(collection, "elements");
        return r(this.f71810a, collection);
    }

    public boolean equals(Object obj) {
        return t(this.f71810a, obj);
    }

    public int hashCode() {
        return A(this.f71810a);
    }

    public boolean isEmpty() {
        return C(this.f71810a);
    }

    public Iterator iterator() {
        return D(this.f71810a);
    }

    public boolean k(short s10) {
        return n(this.f71810a, s10);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    public String toString() {
        return H(this.f71810a);
    }

    /* renamed from: x */
    public int size() {
        return z(this.f71810a);
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        return C6488j.b(this, objArr);
    }
}
