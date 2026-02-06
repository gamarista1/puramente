package mf;

import Ef.i;
import Ef.m;
import Rg.h;
import Rg.k;
import Sg.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6502A;
import yf.C6787a;
import yf.C6798l;
import zf.C6828a;

/* renamed from: mf.p  reason: case insensitive filesystem */
abstract class C6563p extends C6562o {

    /* renamed from: mf.p$a */
    public static final class a implements Iterable, C6828a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object[] f72081a;

        public a(Object[] objArr) {
            this.f72081a = objArr;
        }

        public Iterator iterator() {
            return C6481c.a(this.f72081a);
        }
    }

    /* renamed from: mf.p$b */
    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object[] f72082a;

        public b(Object[] objArr) {
            this.f72082a = objArr;
        }

        public Iterator iterator() {
            return C6481c.a(this.f72082a);
        }
    }

    /* renamed from: mf.p$c */
    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object[] f72083a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Object[] objArr) {
            super(0);
            this.f72083a = objArr;
        }

        /* renamed from: a */
        public final Iterator invoke() {
            return C6481c.a(this.f72083a);
        }
    }

    public static final String A0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(bArr, "<this>");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) s0(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        C6496s.g(sb2, "toString(...)");
        return sb2;
    }

    public static Iterable A1(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        return new J(new c(objArr));
    }

    public static final String B0(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(dArr, "<this>");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) t0(dArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        C6496s.g(sb2, "toString(...)");
        return sb2;
    }

    public static List B1(int[] iArr, Object[] objArr) {
        C6496s.h(iArr, "<this>");
        C6496s.h(objArr, "other");
        int min = Math.min(iArr.length, objArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = iArr[i10];
            arrayList.add(C6502A.a(Integer.valueOf(i11), objArr[i10]));
        }
        return arrayList;
    }

    public static final String C0(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(fArr, "<this>");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) u0(fArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        C6496s.g(sb2, "toString(...)");
        return sb2;
    }

    public static List C1(Object[] objArr, Iterable iterable) {
        C6496s.h(objArr, "<this>");
        C6496s.h(iterable, "other");
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C6565s.y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(C6502A.a(objArr[i10], next));
            i10++;
        }
        return arrayList;
    }

    public static final String D0(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(iArr, "<this>");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) v0(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        C6496s.g(sb2, "toString(...)");
        return sb2;
    }

    public static List D1(Object[] objArr, Object[] objArr2) {
        C6496s.h(objArr, "<this>");
        C6496s.h(objArr2, "other");
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(C6502A.a(objArr[i10], objArr2[i10]));
        }
        return arrayList;
    }

    public static final String E0(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(jArr, "<this>");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) w0(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        C6496s.g(sb2, "toString(...)");
        return sb2;
    }

    public static final String F0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(objArr, "<this>");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) x0(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        C6496s.g(sb2, "toString(...)");
        return sb2;
    }

    public static final String G0(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(sArr, "<this>");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) y0(sArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        C6496s.g(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String H0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i11 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i11 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return A0(bArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String I0(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i11 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i11 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return B0(dArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String J0(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i11 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i11 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return C0(fArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String K0(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i11 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i11 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return D0(iArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String L0(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i11 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i11 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return E0(jArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String M0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i11 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i11 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return F0(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String N0(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i11 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i11 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return G0(sArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static Object O0(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[C6559l.j0(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int P0(int[] iArr, int i10) {
        C6496s.h(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static int Q0(Object[] objArr, Object obj) {
        C6496s.h(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (C6496s.c(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    public static Iterable R(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        if (objArr.length == 0) {
            return C6565s.n();
        }
        return new a(objArr);
    }

    public static List R0(Object[] objArr, C6798l lVar) {
        C6496s.h(objArr, "<this>");
        C6496s.h(lVar, "transform");
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object invoke : objArr) {
            arrayList.add(lVar.invoke(invoke));
        }
        return arrayList;
    }

    public static h S(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        if (objArr.length == 0) {
            return k.e();
        }
        return new b(objArr);
    }

    public static Comparable S0(Comparable[] comparableArr) {
        C6496s.h(comparableArr, "<this>");
        if (comparableArr.length == 0) {
            return null;
        }
        Comparable comparable = comparableArr[0];
        int j02 = C6559l.j0(comparableArr);
        int i10 = 1;
        if (1 <= j02) {
            while (true) {
                Comparable comparable2 = comparableArr[i10];
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
                if (i10 == j02) {
                    break;
                }
                i10++;
            }
        }
        return comparable;
    }

    public static boolean T(byte[] bArr, byte b10) {
        C6496s.h(bArr, "<this>");
        if (n0(bArr, b10) >= 0) {
            return true;
        }
        return false;
    }

    public static Integer T0(int[] iArr) {
        C6496s.h(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int h02 = C6559l.h0(iArr);
        int i11 = 1;
        if (1 <= h02) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == h02) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static boolean U(int[] iArr, int i10) {
        C6496s.h(iArr, "<this>");
        if (C6559l.o0(iArr, i10) >= 0) {
            return true;
        }
        return false;
    }

    public static int U0(int[] iArr) {
        C6496s.h(iArr, "<this>");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            int h02 = C6559l.h0(iArr);
            int i11 = 1;
            if (1 <= h02) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 < i12) {
                        i10 = i12;
                    }
                    if (i11 == h02) {
                        break;
                    }
                    i11++;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    public static boolean V(long[] jArr, long j10) {
        C6496s.h(jArr, "<this>");
        if (p0(jArr, j10) >= 0) {
            return true;
        }
        return false;
    }

    public static Integer V0(int[] iArr) {
        C6496s.h(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int h02 = C6559l.h0(iArr);
        int i11 = 1;
        if (1 <= h02) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == h02) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static boolean W(Object[] objArr, Object obj) {
        C6496s.h(objArr, "<this>");
        if (C6559l.q0(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static int W0(int[] iArr) {
        C6496s.h(iArr, "<this>");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            int h02 = C6559l.h0(iArr);
            int i11 = 1;
            if (1 <= h02) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 > i12) {
                        i10 = i12;
                    }
                    if (i11 == h02) {
                        break;
                    }
                    i11++;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    public static boolean X(short[] sArr, short s10) {
        C6496s.h(sArr, "<this>");
        if (r0(sArr, s10) >= 0) {
            return true;
        }
        return false;
    }

    public static List X0(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        if (objArr.length == 0) {
            return C6565s.n();
        }
        List w12 = C6559l.w1(objArr);
        C6565s.Z(w12);
        return w12;
    }

    public static List Y(Object[] objArr, int i10) {
        C6496s.h(objArr, "<this>");
        if (i10 >= 0) {
            return e1(objArr, m.d(objArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static char Y0(char[] cArr) {
        C6496s.h(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static List Z(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        return (List) a0(objArr, new ArrayList());
    }

    public static Object Z0(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return objArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final Collection a0(Object[] objArr, Collection collection) {
        C6496s.h(objArr, "<this>");
        C6496s.h(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static Object a1(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static Object b0(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Object[] b1(Object[] objArr, Comparator comparator) {
        C6496s.h(objArr, "<this>");
        C6496s.h(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C6496s.g(copyOf, "copyOf(...)");
        C6562o.L(copyOf, comparator);
        return copyOf;
    }

    public static Object c0(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static List c1(Object[] objArr, Comparator comparator) {
        C6496s.h(objArr, "<this>");
        C6496s.h(comparator, "comparator");
        return C6559l.e(b1(objArr, comparator));
    }

    public static i d0(byte[] bArr) {
        C6496s.h(bArr, "<this>");
        return new i(0, g0(bArr));
    }

    public static int d1(int[] iArr) {
        C6496s.h(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    public static i e0(int[] iArr) {
        C6496s.h(iArr, "<this>");
        return new i(0, C6559l.h0(iArr));
    }

    public static final List e1(Object[] objArr, int i10) {
        C6496s.h(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return C6565s.n();
        } else {
            int length = objArr.length;
            if (i10 >= length) {
                return C6559l.n1(objArr);
            }
            if (i10 == 1) {
                return C6565s.e(objArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(objArr[i11]);
            }
            return arrayList;
        }
    }

    public static i f0(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        return new i(0, C6559l.j0(objArr));
    }

    public static final Collection f1(Object[] objArr, Collection collection) {
        C6496s.h(objArr, "<this>");
        C6496s.h(collection, "destination");
        for (Object add : objArr) {
            collection.add(add);
        }
        return collection;
    }

    public static final int g0(byte[] bArr) {
        C6496s.h(bArr, "<this>");
        return bArr.length - 1;
    }

    public static HashSet g1(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        return (HashSet) f1(objArr, new HashSet(O.e(objArr.length)));
    }

    public static int h0(int[] iArr) {
        C6496s.h(iArr, "<this>");
        return iArr.length - 1;
    }

    public static List h1(byte[] bArr) {
        C6496s.h(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length != 1) {
            return q1(bArr);
        }
        return C6565s.e(Byte.valueOf(bArr[0]));
    }

    public static int i0(long[] jArr) {
        C6496s.h(jArr, "<this>");
        return jArr.length - 1;
    }

    public static List i1(char[] cArr) {
        C6496s.h(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length != 1) {
            return r1(cArr);
        }
        return C6565s.e(Character.valueOf(cArr[0]));
    }

    public static int j0(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        return objArr.length - 1;
    }

    public static List j1(double[] dArr) {
        C6496s.h(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length != 1) {
            return s1(dArr);
        }
        return C6565s.e(Double.valueOf(dArr[0]));
    }

    public static Double k0(double[] dArr, int i10) {
        C6496s.h(dArr, "<this>");
        if (i10 < 0 || i10 >= dArr.length) {
            return null;
        }
        return Double.valueOf(dArr[i10]);
    }

    public static List k1(float[] fArr) {
        C6496s.h(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length != 1) {
            return t1(fArr);
        }
        return C6565s.e(Float.valueOf(fArr[0]));
    }

    public static Integer l0(int[] iArr, int i10) {
        C6496s.h(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static List l1(int[] iArr) {
        C6496s.h(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length != 1) {
            return C6559l.u1(iArr);
        }
        return C6565s.e(Integer.valueOf(iArr[0]));
    }

    public static Object m0(Object[] objArr, int i10) {
        C6496s.h(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static List m1(long[] jArr) {
        C6496s.h(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length != 1) {
            return v1(jArr);
        }
        return C6565s.e(Long.valueOf(jArr[0]));
    }

    public static final int n0(byte[] bArr, byte b10) {
        C6496s.h(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static List n1(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length != 1) {
            return C6559l.w1(objArr);
        }
        return C6565s.e(objArr[0]);
    }

    public static int o0(int[] iArr, int i10) {
        C6496s.h(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static List o1(short[] sArr) {
        C6496s.h(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length != 1) {
            return x1(sArr);
        }
        return C6565s.e(Short.valueOf(sArr[0]));
    }

    public static final int p0(long[] jArr, long j10) {
        C6496s.h(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static List p1(boolean[] zArr) {
        C6496s.h(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length != 1) {
            return y1(zArr);
        }
        return C6565s.e(Boolean.valueOf(zArr[0]));
    }

    public static int q0(Object[] objArr, Object obj) {
        C6496s.h(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (C6496s.c(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final List q1(byte[] bArr) {
        C6496s.h(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final int r0(short[] sArr, short s10) {
        C6496s.h(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final List r1(char[] cArr) {
        C6496s.h(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char valueOf : cArr) {
            arrayList.add(Character.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final Appendable s0(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(bArr, "<this>");
        C6496s.h(appendable, "buffer");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.invoke(Byte.valueOf(b10)));
            } else {
                appendable.append(String.valueOf(b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final List s1(double[] dArr) {
        C6496s.h(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double valueOf : dArr) {
            arrayList.add(Double.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final Appendable t0(double[] dArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(dArr, "<this>");
        C6496s.h(appendable, "buffer");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (double d10 : dArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.invoke(Double.valueOf(d10)));
            } else {
                appendable.append(String.valueOf(d10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final List t1(float[] fArr) {
        C6496s.h(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final Appendable u0(float[] fArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(fArr, "<this>");
        C6496s.h(appendable, "buffer");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.invoke(Float.valueOf(f10)));
            } else {
                appendable.append(String.valueOf(f10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static List u1(int[] iArr) {
        C6496s.h(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final Appendable v0(int[] iArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(iArr, "<this>");
        C6496s.h(appendable, "buffer");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.invoke(Integer.valueOf(i12)));
            } else {
                appendable.append(String.valueOf(i12));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final List v1(long[] jArr) {
        C6496s.h(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final Appendable w0(long[] jArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(jArr, "<this>");
        C6496s.h(appendable, "buffer");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.invoke(Long.valueOf(j10)));
            } else {
                appendable.append(String.valueOf(j10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static List w1(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        return new ArrayList(C6567u.i(objArr));
    }

    public static final Appendable x0(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(objArr, "<this>");
        C6496s.h(appendable, "buffer");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            p.a(appendable, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final List x1(short[] sArr) {
        C6496s.h(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short valueOf : sArr) {
            arrayList.add(Short.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final Appendable y0(short[] sArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(sArr, "<this>");
        C6496s.h(appendable, "buffer");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (short s10 : sArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.invoke(Short.valueOf(s10)));
            } else {
                appendable.append(String.valueOf(s10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final List y1(boolean[] zArr) {
        C6496s.h(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean valueOf : zArr) {
            arrayList.add(Boolean.valueOf(valueOf));
        }
        return arrayList;
    }

    public static /* synthetic */ Appendable z0(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i12;
        CharSequence charSequence7;
        C6798l lVar2;
        if ((i11 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i11 & 4) != 0) {
            charSequence6 = charSequence8;
        } else {
            charSequence6 = charSequence2;
        }
        if ((i11 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i11 & 16) != 0) {
            i12 = -1;
        } else {
            i12 = i10;
        }
        if ((i11 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i11 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return x0(objArr, appendable, charSequence5, charSequence6, charSequence8, i12, charSequence7, lVar2);
    }

    public static Set z1(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return Y.e();
        }
        if (length != 1) {
            return (Set) f1(objArr, new LinkedHashSet(O.e(objArr.length)));
        }
        return Y.d(objArr[0]);
    }
}
