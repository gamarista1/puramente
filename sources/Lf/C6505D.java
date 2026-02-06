package lf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import zf.C6828a;

/* renamed from: lf.D  reason: case insensitive filesystem */
public final class C6505D implements Collection, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f71794a;

    /* renamed from: lf.D$a */
    private static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f71795a;

        /* renamed from: b  reason: collision with root package name */
        private int f71796b;

        public a(byte[] bArr) {
            C6496s.h(bArr, "array");
            this.f71795a = bArr;
        }

        public byte a() {
            int i10 = this.f71796b;
            byte[] bArr = this.f71795a;
            if (i10 < bArr.length) {
                this.f71796b = i10 + 1;
                return C6504C.b(bArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f71796b));
        }

        public boolean hasNext() {
            if (this.f71796b < this.f71795a.length) {
                return true;
            }
            return false;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C6504C.a(a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C6505D(byte[] bArr) {
        this.f71794a = bArr;
    }

    public static int A(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean C(byte[] bArr) {
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator D(byte[] bArr) {
        return new a(bArr);
    }

    public static final void E(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String H(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public static final /* synthetic */ C6505D a(byte[] bArr) {
        return new C6505D(bArr);
    }

    public static byte[] b(int i10) {
        return g(new byte[i10]);
    }

    public static byte[] g(byte[] bArr) {
        C6496s.h(bArr, "storage");
        return bArr;
    }

    public static boolean n(byte[] bArr, byte b10) {
        return C6559l.T(bArr, b10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean r(byte[] r3, java.util.Collection r4) {
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
            boolean r2 = r0 instanceof lf.C6504C
            if (r2 == 0) goto L_0x0031
            lf.C r0 = (lf.C6504C) r0
            byte r0 = r0.i()
            boolean r0 = mf.C6559l.T(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.C6505D.r(byte[], java.util.Collection):boolean");
    }

    public static boolean t(byte[] bArr, Object obj) {
        if ((obj instanceof C6505D) && C6496s.c(bArr, ((C6505D) obj).I())) {
            return true;
        }
        return false;
    }

    public static final byte v(byte[] bArr, int i10) {
        return C6504C.b(bArr[i10]);
    }

    public static int z(byte[] bArr) {
        return bArr.length;
    }

    public final /* synthetic */ byte[] I() {
        return this.f71794a;
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
        if (!(obj instanceof C6504C)) {
            return false;
        }
        return k(((C6504C) obj).i());
    }

    public boolean containsAll(Collection collection) {
        C6496s.h(collection, "elements");
        return r(this.f71794a, collection);
    }

    public boolean equals(Object obj) {
        return t(this.f71794a, obj);
    }

    public int hashCode() {
        return A(this.f71794a);
    }

    public boolean isEmpty() {
        return C(this.f71794a);
    }

    public Iterator iterator() {
        return D(this.f71794a);
    }

    public boolean k(byte b10) {
        return n(this.f71794a, b10);
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
        return H(this.f71794a);
    }

    /* renamed from: x */
    public int size() {
        return z(this.f71794a);
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        return C6488j.b(this, objArr);
    }
}
