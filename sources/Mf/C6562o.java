package mf;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.C6496s;

/* renamed from: mf.o  reason: case insensitive filesystem */
abstract class C6562o extends C6561n {

    /* renamed from: mf.o$a */
    public static final class a extends C6550c implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f72080b;

        a(int[] iArr) {
            this.f72080b = iArr;
        }

        public int a() {
            return this.f72080b.length;
        }

        /* renamed from: b */
        public Integer get(int i10) {
            return Integer.valueOf(this.f72080b[i10]);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return p(((Number) obj).intValue());
        }

        public int g(int i10) {
            return C6559l.o0(this.f72080b, i10);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return g(((Number) obj).intValue());
        }

        public boolean isEmpty() {
            if (this.f72080b.length == 0) {
                return true;
            }
            return false;
        }

        public int k(int i10) {
            return C6563p.P0(this.f72080b, i10);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return k(((Number) obj).intValue());
        }

        public boolean p(int i10) {
            return C6559l.U(this.f72080b, i10);
        }
    }

    public static /* synthetic */ void A(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        C6559l.w(objArr, obj, i10, i11);
    }

    public static byte[] B(byte[] bArr, byte[] bArr2) {
        C6496s.h(bArr, "<this>");
        C6496s.h(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        C6496s.e(copyOf);
        return copyOf;
    }

    public static float[] C(float[] fArr, float[] fArr2) {
        C6496s.h(fArr, "<this>");
        C6496s.h(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        C6496s.e(copyOf);
        return copyOf;
    }

    public static int[] D(int[] iArr, int i10) {
        C6496s.h(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i10;
        C6496s.e(copyOf);
        return copyOf;
    }

    public static int[] E(int[] iArr, int[] iArr2) {
        C6496s.h(iArr, "<this>");
        C6496s.h(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        C6496s.e(copyOf);
        return copyOf;
    }

    public static long[] F(long[] jArr, long[] jArr2) {
        C6496s.h(jArr, "<this>");
        C6496s.h(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        C6496s.e(copyOf);
        return copyOf;
    }

    public static Object[] G(Object[] objArr, Object obj) {
        C6496s.h(objArr, "<this>");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        C6496s.e(copyOf);
        return copyOf;
    }

    public static Object[] H(Object[] objArr, Object[] objArr2) {
        C6496s.h(objArr, "<this>");
        C6496s.h(objArr2, "elements");
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        C6496s.e(copyOf);
        return copyOf;
    }

    public static boolean[] I(boolean[] zArr, boolean[] zArr2) {
        C6496s.h(zArr, "<this>");
        C6496s.h(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        C6496s.e(copyOf);
        return copyOf;
    }

    public static void J(int[] iArr, int i10, int i11) {
        C6496s.h(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    public static void K(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void L(Object[] objArr, Comparator comparator) {
        C6496s.h(objArr, "<this>");
        C6496s.h(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void M(Object[] objArr, Comparator comparator, int i10, int i11) {
        C6496s.h(objArr, "<this>");
        C6496s.h(comparator, "comparator");
        Arrays.sort(objArr, i10, i11, comparator);
    }

    public static Boolean[] N(boolean[] zArr) {
        C6496s.h(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static Float[] O(float[] fArr) {
        C6496s.h(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static Integer[] P(int[] iArr) {
        C6496s.h(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static Long[] Q(long[] jArr) {
        C6496s.h(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    public static List d(int[] iArr) {
        C6496s.h(iArr, "<this>");
        return new a(iArr);
    }

    public static List e(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        List a10 = C6564q.a(objArr);
        C6496s.g(a10, "asList(...)");
        return a10;
    }

    public static final int f(float[] fArr, float f10, int i10, int i11) {
        C6496s.h(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    public static /* synthetic */ int g(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return f(fArr, f10, i10, i11);
    }

    public static byte[] h(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        C6496s.h(bArr, "<this>");
        C6496s.h(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static char[] i(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        C6496s.h(cArr, "<this>");
        C6496s.h(cArr2, "destination");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
        return cArr2;
    }

    public static float[] j(float[] fArr, float[] fArr2, int i10, int i11, int i12) {
        C6496s.h(fArr, "<this>");
        C6496s.h(fArr2, "destination");
        System.arraycopy(fArr, i11, fArr2, i10, i12 - i11);
        return fArr2;
    }

    public static int[] k(int[] iArr, int[] iArr2, int i10, int i11, int i12) {
        C6496s.h(iArr, "<this>");
        C6496s.h(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
        return iArr2;
    }

    public static long[] l(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        C6496s.h(jArr, "<this>");
        C6496s.h(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
        return jArr2;
    }

    public static Object[] m(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        C6496s.h(objArr, "<this>");
        C6496s.h(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
        return objArr2;
    }

    public static /* synthetic */ byte[] n(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return C6559l.h(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] o(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return C6559l.j(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] p(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return C6559l.k(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] q(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return C6559l.m(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] r(byte[] bArr, int i10, int i11) {
        C6496s.h(bArr, "<this>");
        C6560m.b(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        C6496s.g(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] s(Object[] objArr, int i10, int i11) {
        C6496s.h(objArr, "<this>");
        C6560m.b(i11, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        C6496s.g(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static final void t(float[] fArr, float f10, int i10, int i11) {
        C6496s.h(fArr, "<this>");
        Arrays.fill(fArr, i10, i11, f10);
    }

    public static void u(int[] iArr, int i10, int i11, int i12) {
        C6496s.h(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final void v(long[] jArr, long j10, int i10, int i11) {
        C6496s.h(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static void w(Object[] objArr, Object obj, int i10, int i11) {
        C6496s.h(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static /* synthetic */ void x(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        t(fArr, f10, i10, i11);
    }

    public static /* synthetic */ void y(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        C6559l.u(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void z(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        v(jArr, j10, i10, i11);
    }
}
