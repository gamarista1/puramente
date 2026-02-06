package mf;

import Ef.i;
import Ef.m;
import Rg.h;
import Sg.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6502A;
import yf.C6787a;
import yf.C6798l;

/* renamed from: mf.C  reason: case insensitive filesystem */
abstract class C6543C extends C6542B {

    /* renamed from: mf.C$a */
    public static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f72025a;

        public a(Iterable iterable) {
            this.f72025a = iterable;
        }

        public Iterator iterator() {
            return this.f72025a.iterator();
        }
    }

    /* renamed from: mf.C$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f72026a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f72026a = i10;
        }

        public final Object invoke(int i10) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f72026a + '.');
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* renamed from: mf.C$c */
    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f72027a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Iterable iterable) {
            super(0);
            this.f72027a = iterable;
        }

        /* renamed from: a */
        public final Iterator invoke() {
            return this.f72027a.iterator();
        }
    }

    public static Object A0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object B0(List list) {
        C6496s.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List C0(Iterable iterable, C6798l lVar) {
        C6496s.h(iterable, "<this>");
        C6496s.h(lVar, "transform");
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Object invoke : iterable) {
            arrayList.add(lVar.invoke(invoke));
        }
        return arrayList;
    }

    public static Comparable D0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float E0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Comparable F0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float G0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static List H0(Iterable iterable, Object obj) {
        C6496s.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        boolean z10 = false;
        for (Object next : iterable) {
            boolean z11 = true;
            if (!z10 && C6496s.c(next, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static List I0(Iterable iterable, Iterable iterable2) {
        C6496s.h(iterable, "<this>");
        C6496s.h(iterable2, "elements");
        if (iterable instanceof Collection) {
            return C6565s.K0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        C6565s.D(arrayList, iterable);
        C6565s.D(arrayList, iterable2);
        return arrayList;
    }

    public static List J0(Iterable iterable, Object obj) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return C6565s.L0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        C6565s.D(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static List K0(Collection collection, Iterable iterable) {
        C6496s.h(collection, "<this>");
        C6496s.h(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C6565s.D(arrayList2, iterable);
        return arrayList2;
    }

    public static List L0(Collection collection, Object obj) {
        C6496s.h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object M0(Collection collection, Cf.c cVar) {
        C6496s.h(collection, "<this>");
        C6496s.h(cVar, "random");
        if (!collection.isEmpty()) {
            return i0(collection, cVar.e(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static List N0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return C6565s.e1(iterable);
        }
        List g12 = g1(iterable);
        C6565s.Z(g12);
        return g12;
    }

    public static Object O0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return C6565s.P0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object P0(List list) {
        C6496s.h(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static Object Q0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object R0(List list) {
        C6496s.h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List S0(List list, i iVar) {
        C6496s.h(list, "<this>");
        C6496s.h(iVar, "indices");
        if (iVar.isEmpty()) {
            return C6565s.n();
        }
        return C6565s.e1(list.subList(iVar.a().intValue(), iVar.g().intValue() + 1));
    }

    public static List T0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C6565s.e1(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C6559l.K((Comparable[]) array);
            return C6559l.e(array);
        }
        List g12 = g1(iterable);
        C6565s.B(g12);
        return g12;
    }

    public static List U0(Iterable iterable, Comparator comparator) {
        C6496s.h(iterable, "<this>");
        C6496s.h(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C6565s.e1(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C6562o.L(array, comparator);
            return C6559l.e(array);
        }
        List g12 = g1(iterable);
        C6565s.C(g12, comparator);
        return g12;
    }

    public static List V0(Iterable iterable, int i10) {
        C6496s.h(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return C6565s.n();
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return C6565s.e1(iterable);
                }
                if (i10 == 1) {
                    return C6565s.e(C6565s.n0(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (Object add : iterable) {
                arrayList.add(add);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return C6567u.u(arrayList);
        }
    }

    public static List W0(List list, int i10) {
        C6496s.h(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return C6565s.n();
        } else {
            int size = list.size();
            if (i10 >= size) {
                return C6565s.e1(list);
            }
            if (i10 == 1) {
                return C6565s.e(C6565s.z0(list));
            }
            ArrayList arrayList = new ArrayList(i10);
            if (list instanceof RandomAccess) {
                for (int i11 = size - i10; i11 < size; i11++) {
                    arrayList.add(list.get(i11));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i10);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    public static boolean[] X0(Collection collection) {
        C6496s.h(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        return zArr;
    }

    public static byte[] Y0(Collection collection) {
        C6496s.h(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final Collection Z0(Iterable iterable, Collection collection) {
        C6496s.h(iterable, "<this>");
        C6496s.h(collection, "destination");
        for (Object add : iterable) {
            collection.add(add);
        }
        return collection;
    }

    public static boolean a0(Iterable iterable, C6798l lVar) {
        C6496s.h(iterable, "<this>");
        C6496s.h(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object invoke : iterable) {
            if (!((Boolean) lVar.invoke(invoke)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static double[] a1(Collection collection) {
        C6496s.h(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr[i10] = ((Number) it.next()).doubleValue();
            i10++;
        }
        return dArr;
    }

    public static h b0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        return new a(iterable);
    }

    public static float[] b1(Collection collection) {
        C6496s.h(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    public static double c0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        double d10 = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            d10 += (double) ((Number) it.next()).floatValue();
            i10++;
            if (i10 < 0) {
                C6565s.w();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static HashSet c1(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        return (HashSet) Z0(iterable, new HashSet(O.e(C6565s.y(iterable, 12))));
    }

    public static List d0(Iterable iterable, int i10) {
        C6496s.h(iterable, "<this>");
        return C6565s.l1(iterable, i10, i10, true);
    }

    public static int[] d1(Collection collection) {
        C6496s.h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static boolean e0(Iterable iterable, Object obj) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (C6565s.s0(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static List e1(Iterable iterable) {
        Object obj;
        C6496s.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C6567u.u(g1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C6565s.n();
        }
        if (size != 1) {
            return C6565s.h1(collection);
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C6565s.e(obj);
    }

    public static List f0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        return C6565s.e1(C6565s.i1(iterable));
    }

    public static long[] f1(Collection collection) {
        C6496s.h(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public static List g0(Iterable iterable, int i10) {
        ArrayList arrayList;
        C6496s.h(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return C6565s.e1(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i10;
                if (size <= 0) {
                    return C6565s.n();
                }
                if (size == 1) {
                    return C6565s.e(C6565s.y0(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i10 < size2) {
                            arrayList.add(((List) iterable).get(i10));
                            i10++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i10);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i11 = 0;
            for (Object next : iterable) {
                if (i11 >= i10) {
                    arrayList.add(next);
                } else {
                    i11++;
                }
            }
            return C6567u.u(arrayList);
        }
    }

    public static final List g1(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return C6565s.h1((Collection) iterable);
        }
        return (List) Z0(iterable, new ArrayList());
    }

    public static List h0(List list, int i10) {
        C6496s.h(list, "<this>");
        if (i10 >= 0) {
            return C6565s.V0(list, m.d(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List h1(Collection collection) {
        C6496s.h(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final Object i0(Iterable iterable, int i10) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).get(i10);
        }
        return j0(iterable, i10, new b(i10));
    }

    public static Set i1(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) Z0(iterable, new LinkedHashSet());
    }

    public static final Object j0(Iterable iterable, int i10, C6798l lVar) {
        C6496s.h(iterable, "<this>");
        C6496s.h(lVar, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i10 < 0 || i10 >= list.size()) {
                return lVar.invoke(Integer.valueOf(i10));
            }
            return list.get(i10);
        } else if (i10 < 0) {
            return lVar.invoke(Integer.valueOf(i10));
        } else {
            int i11 = 0;
            for (Object next : iterable) {
                int i12 = i11 + 1;
                if (i10 == i11) {
                    return next;
                }
                i11 = i12;
            }
            return lVar.invoke(Integer.valueOf(i10));
        }
    }

    public static Set j1(Iterable iterable) {
        Object obj;
        C6496s.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return a0.i((Set) Z0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return Y.e();
        }
        if (size != 1) {
            return (Set) Z0(iterable, new LinkedHashSet(O.e(collection.size())));
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return Y.d(obj);
    }

    public static List k0(Iterable iterable, C6798l lVar) {
        C6496s.h(iterable, "<this>");
        C6496s.h(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static Set k1(Iterable iterable, Iterable iterable2) {
        C6496s.h(iterable, "<this>");
        C6496s.h(iterable2, "other");
        Set i12 = C6565s.i1(iterable);
        C6565s.D(i12, iterable2);
        return i12;
    }

    public static List l0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        return (List) C6565s.m0(iterable, new ArrayList());
    }

    public static List l1(Iterable iterable, int i10, int i11, boolean z10) {
        int i12;
        C6496s.h(iterable, "<this>");
        c0.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b10 = c0.b(iterable.iterator(), i10, i11, z10, false);
            while (b10.hasNext()) {
                arrayList.add((List) b10.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i13 = size / i11;
        if (size % i11 == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        ArrayList arrayList2 = new ArrayList(i13 + i12);
        int i14 = 0;
        while (i14 >= 0 && i14 < size) {
            int h10 = m.h(i10, size - i14);
            if (h10 < i10 && !z10) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(h10);
            for (int i15 = 0; i15 < h10; i15++) {
                arrayList3.add(list.get(i15 + i14));
            }
            arrayList2.add(arrayList3);
            i14 += i11;
        }
        return arrayList2;
    }

    public static Collection m0(Iterable iterable, Collection collection) {
        C6496s.h(iterable, "<this>");
        C6496s.h(collection, "destination");
        for (Object next : iterable) {
            if (next != null) {
                collection.add(next);
            }
        }
        return collection;
    }

    public static Iterable m1(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        return new J(new c(iterable));
    }

    public static Object n0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return C6565s.o0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static List n1(Iterable iterable, Iterable iterable2) {
        C6496s.h(iterable, "<this>");
        C6496s.h(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C6565s.y(iterable, 10), C6565s.y(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C6502A.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Object o0(List list) {
        C6496s.h(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object p0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object q0(List list) {
        C6496s.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object r0(List list, int i10) {
        C6496s.h(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static int s0(Iterable iterable, Object obj) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 < 0) {
                C6565s.x();
            }
            if (C6496s.c(obj, next)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Set t0(Iterable iterable, Iterable iterable2) {
        C6496s.h(iterable, "<this>");
        C6496s.h(iterable2, "other");
        Set i12 = C6565s.i1(iterable);
        C6572z.Q(i12, iterable2);
        return i12;
    }

    public static final Appendable u0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(iterable, "<this>");
        C6496s.h(appendable, "buffer");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object next : iterable) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            p.a(appendable, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static /* synthetic */ Appendable v0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
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
        return u0(iterable, appendable, charSequence5, charSequence6, charSequence8, i12, charSequence7, lVar2);
    }

    public static final String w0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(iterable, "<this>");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) u0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        C6496s.g(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String x0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
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
        return w0(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static Object y0(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return C6565s.z0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object z0(List list) {
        C6496s.h(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C6565s.p(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
