package lf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import zf.C6828a;

/* renamed from: lf.H  reason: case insensitive filesystem */
public final class C6509H implements Collection, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f71804a;

    /* renamed from: lf.H$a */
    private static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final long[] f71805a;

        /* renamed from: b  reason: collision with root package name */
        private int f71806b;

        public a(long[] jArr) {
            C6496s.h(jArr, "array");
            this.f71805a = jArr;
        }

        public long a() {
            int i10 = this.f71806b;
            long[] jArr = this.f71805a;
            if (i10 < jArr.length) {
                this.f71806b = i10 + 1;
                return C6508G.b(jArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f71806b));
        }

        public boolean hasNext() {
            if (this.f71806b < this.f71805a.length) {
                return true;
            }
            return false;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C6508G.a(a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C6509H(long[] jArr) {
        this.f71804a = jArr;
    }

    public static int A(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean C(long[] jArr) {
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator D(long[] jArr) {
        return new a(jArr);
    }

    public static final void E(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String H(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public static final /* synthetic */ C6509H a(long[] jArr) {
        return new C6509H(jArr);
    }

    public static long[] b(int i10) {
        return g(new long[i10]);
    }

    public static long[] g(long[] jArr) {
        C6496s.h(jArr, "storage");
        return jArr;
    }

    public static boolean n(long[] jArr, long j10) {
        return C6559l.V(jArr, j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean r(long[] r4, java.util.Collection r5) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0012
            goto L_0x0032
        L_0x0012:
            java.util.Iterator r5 = r5.iterator()
        L_0x0016:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof lf.C6508G
            if (r2 == 0) goto L_0x0031
            lf.G r0 = (lf.C6508G) r0
            long r2 = r0.j()
            boolean r0 = mf.C6559l.V(r4, r2)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.C6509H.r(long[], java.util.Collection):boolean");
    }

    public static boolean t(long[] jArr, Object obj) {
        if ((obj instanceof C6509H) && C6496s.c(jArr, ((C6509H) obj).I())) {
            return true;
        }
        return false;
    }

    public static final long v(long[] jArr, int i10) {
        return C6508G.b(jArr[i10]);
    }

    public static int z(long[] jArr) {
        return jArr.length;
    }

    public final /* synthetic */ long[] I() {
        return this.f71804a;
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
        if (!(obj instanceof C6508G)) {
            return false;
        }
        return k(((C6508G) obj).j());
    }

    public boolean containsAll(Collection collection) {
        C6496s.h(collection, "elements");
        return r(this.f71804a, collection);
    }

    public boolean equals(Object obj) {
        return t(this.f71804a, obj);
    }

    public int hashCode() {
        return A(this.f71804a);
    }

    public boolean isEmpty() {
        return C(this.f71804a);
    }

    public Iterator iterator() {
        return D(this.f71804a);
    }

    public boolean k(long j10) {
        return n(this.f71804a, j10);
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
        return H(this.f71804a);
    }

    /* renamed from: x */
    public int size() {
        return z(this.f71804a);
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        return C6488j.b(this, objArr);
    }
}
