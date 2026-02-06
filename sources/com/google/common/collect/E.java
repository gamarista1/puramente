package com.google.common.collect;

import com.google.common.primitives.f;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import nb.C5112g;
import nb.k;
import nb.o;

public abstract class E {

    private static class a extends AbstractList implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        final List f56603a;

        /* renamed from: b  reason: collision with root package name */
        final C5112g f56604b;

        /* renamed from: com.google.common.collect.E$a$a  reason: collision with other inner class name */
        class C0842a extends f0 {
            C0842a(ListIterator listIterator) {
                super(listIterator);
            }

            /* access modifiers changed from: package-private */
            public Object a(Object obj) {
                return a.this.f56604b.apply(obj);
            }
        }

        a(List list, C5112g gVar) {
            this.f56603a = (List) o.j(list);
            this.f56604b = (C5112g) o.j(gVar);
        }

        public Object get(int i10) {
            return this.f56604b.apply(this.f56603a.get(i10));
        }

        public boolean isEmpty() {
            return this.f56603a.isEmpty();
        }

        public Iterator iterator() {
            return listIterator();
        }

        public ListIterator listIterator(int i10) {
            return new C0842a(this.f56603a.listIterator(i10));
        }

        public Object remove(int i10) {
            return this.f56604b.apply(this.f56603a.remove(i10));
        }

        /* access modifiers changed from: protected */
        public void removeRange(int i10, int i11) {
            this.f56603a.subList(i10, i11).clear();
        }

        public int size() {
            return this.f56603a.size();
        }
    }

    private static class b extends AbstractSequentialList implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        final List f56606a;

        /* renamed from: b  reason: collision with root package name */
        final C5112g f56607b;

        class a extends f0 {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            /* access modifiers changed from: package-private */
            public Object a(Object obj) {
                return b.this.f56607b.apply(obj);
            }
        }

        b(List list, C5112g gVar) {
            this.f56606a = (List) o.j(list);
            this.f56607b = (C5112g) o.j(gVar);
        }

        public ListIterator listIterator(int i10) {
            return new a(this.f56606a.listIterator(i10));
        }

        /* access modifiers changed from: protected */
        public void removeRange(int i10, int i11) {
            this.f56606a.subList(i10, i11).clear();
        }

        public int size() {
            return this.f56606a.size();
        }
    }

    static List a(Iterable iterable) {
        return (List) iterable;
    }

    static int b(int i10) {
        C4758i.b(i10, "arraySize");
        return f.m(((long) i10) + 5 + ((long) (i10 / 10)));
    }

    static boolean c(List list, Object obj) {
        if (obj == o.j(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C.e(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!k.a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (k.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int e(List list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static int f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (k.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList h() {
        return new ArrayList();
    }

    public static ArrayList i(Iterator it) {
        ArrayList h10 = h();
        C.a(h10, it);
        return h10;
    }

    public static ArrayList j(Object... objArr) {
        o.j(objArr);
        ArrayList arrayList = new ArrayList(b(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static List k(List list, C5112g gVar) {
        if (list instanceof RandomAccess) {
            return new a(list, gVar);
        }
        return new b(list, gVar);
    }
}
