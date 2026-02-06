package lf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import zf.C6828a;

/* renamed from: lf.F  reason: case insensitive filesystem */
public final class C6507F implements Collection, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f71799a;

    /* renamed from: lf.F$a */
    private static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f71800a;

        /* renamed from: b  reason: collision with root package name */
        private int f71801b;

        public a(int[] iArr) {
            C6496s.h(iArr, "array");
            this.f71800a = iArr;
        }

        public int a() {
            int i10 = this.f71801b;
            int[] iArr = this.f71800a;
            if (i10 < iArr.length) {
                this.f71801b = i10 + 1;
                return C6506E.b(iArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f71801b));
        }

        public boolean hasNext() {
            if (this.f71801b < this.f71800a.length) {
                return true;
            }
            return false;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C6506E.a(a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C6507F(int[] iArr) {
        this.f71799a = iArr;
    }

    public static int A(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean C(int[] iArr) {
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator D(int[] iArr) {
        return new a(iArr);
    }

    public static final void E(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String H(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ C6507F a(int[] iArr) {
        return new C6507F(iArr);
    }

    public static int[] b(int i10) {
        return g(new int[i10]);
    }

    public static int[] g(int[] iArr) {
        C6496s.h(iArr, "storage");
        return iArr;
    }

    public static boolean n(int[] iArr, int i10) {
        return C6559l.U(iArr, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean r(int[] r3, java.util.Collection r4) {
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
            boolean r2 = r0 instanceof lf.C6506E
            if (r2 == 0) goto L_0x0031
            lf.E r0 = (lf.C6506E) r0
            int r0 = r0.i()
            boolean r0 = mf.C6559l.U(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.C6507F.r(int[], java.util.Collection):boolean");
    }

    public static boolean t(int[] iArr, Object obj) {
        if ((obj instanceof C6507F) && C6496s.c(iArr, ((C6507F) obj).I())) {
            return true;
        }
        return false;
    }

    public static final int v(int[] iArr, int i10) {
        return C6506E.b(iArr[i10]);
    }

    public static int z(int[] iArr) {
        return iArr.length;
    }

    public final /* synthetic */ int[] I() {
        return this.f71799a;
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
        if (!(obj instanceof C6506E)) {
            return false;
        }
        return k(((C6506E) obj).i());
    }

    public boolean containsAll(Collection collection) {
        C6496s.h(collection, "elements");
        return r(this.f71799a, collection);
    }

    public boolean equals(Object obj) {
        return t(this.f71799a, obj);
    }

    public int hashCode() {
        return A(this.f71799a);
    }

    public boolean isEmpty() {
        return C(this.f71799a);
    }

    public Iterator iterator() {
        return D(this.f71799a);
    }

    public boolean k(int i10) {
        return n(this.f71799a, i10);
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
        return H(this.f71799a);
    }

    /* renamed from: x */
    public int size() {
        return z(this.f71799a);
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        return C6488j.b(this, objArr);
    }
}
