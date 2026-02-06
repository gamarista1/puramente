package a0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import mf.C6565s;
import zf.C6828a;
import zf.C6831d;

/* renamed from: a0.b  reason: case insensitive filesystem */
public final class C1538b implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final int f10554d = 8;

    /* renamed from: a  reason: collision with root package name */
    private Object[] f10555a;

    /* renamed from: b  reason: collision with root package name */
    private List f10556b;

    /* renamed from: c  reason: collision with root package name */
    private int f10557c;

    /* renamed from: a0.b$a */
    private static final class a implements List, C6831d {

        /* renamed from: a  reason: collision with root package name */
        private final C1538b f10558a;

        public a(C1538b bVar) {
            this.f10558a = bVar;
        }

        public int a() {
            return this.f10558a.q();
        }

        public boolean add(Object obj) {
            return this.f10558a.b(obj);
        }

        public boolean addAll(int i10, Collection collection) {
            return this.f10558a.e(i10, collection);
        }

        public Object b(int i10) {
            C1539c.c(this, i10);
            return this.f10558a.y(i10);
        }

        public void clear() {
            this.f10558a.i();
        }

        public boolean contains(Object obj) {
            return this.f10558a.j(obj);
        }

        public boolean containsAll(Collection collection) {
            return this.f10558a.k(collection);
        }

        public Object get(int i10) {
            C1539c.c(this, i10);
            return this.f10558a.p()[i10];
        }

        public int indexOf(Object obj) {
            return this.f10558a.r(obj);
        }

        public boolean isEmpty() {
            return this.f10558a.s();
        }

        public Iterator iterator() {
            return new c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            return this.f10558a.v(obj);
        }

        public ListIterator listIterator() {
            return new c(this, 0);
        }

        public final /* bridge */ Object remove(int i10) {
            return b(i10);
        }

        public boolean removeAll(Collection collection) {
            return this.f10558a.x(collection);
        }

        public boolean retainAll(Collection collection) {
            return this.f10558a.A(collection);
        }

        public Object set(int i10, Object obj) {
            C1539c.c(this, i10);
            return this.f10558a.B(i10, obj);
        }

        public final /* bridge */ int size() {
            return a();
        }

        public List subList(int i10, int i11) {
            C1539c.d(this, i10, i11);
            return new C0199b(this, i10, i11);
        }

        public Object[] toArray() {
            return C6488j.a(this);
        }

        public void add(int i10, Object obj) {
            this.f10558a.a(i10, obj);
        }

        public boolean addAll(Collection collection) {
            return this.f10558a.g(collection);
        }

        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        public boolean remove(Object obj) {
            return this.f10558a.w(obj);
        }

        public Object[] toArray(Object[] objArr) {
            return C6488j.b(this, objArr);
        }
    }

    /* renamed from: a0.b$b  reason: collision with other inner class name */
    private static final class C0199b implements List, C6831d {

        /* renamed from: a  reason: collision with root package name */
        private final List f10559a;

        /* renamed from: b  reason: collision with root package name */
        private final int f10560b;

        /* renamed from: c  reason: collision with root package name */
        private int f10561c;

        public C0199b(List list, int i10, int i11) {
            this.f10559a = list;
            this.f10560b = i10;
            this.f10561c = i11;
        }

        public int a() {
            return this.f10561c - this.f10560b;
        }

        public boolean add(Object obj) {
            List list = this.f10559a;
            int i10 = this.f10561c;
            this.f10561c = i10 + 1;
            list.add(i10, obj);
            return true;
        }

        public boolean addAll(int i10, Collection collection) {
            this.f10559a.addAll(i10 + this.f10560b, collection);
            this.f10561c += collection.size();
            return collection.size() > 0;
        }

        public Object b(int i10) {
            C1539c.c(this, i10);
            this.f10561c--;
            return this.f10559a.remove(i10 + this.f10560b);
        }

        public void clear() {
            int i10 = this.f10561c - 1;
            int i11 = this.f10560b;
            if (i11 <= i10) {
                while (true) {
                    this.f10559a.remove(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10--;
                }
            }
            this.f10561c = this.f10560b;
        }

        public boolean contains(Object obj) {
            int i10 = this.f10561c;
            for (int i11 = this.f10560b; i11 < i10; i11++) {
                if (C6496s.c(this.f10559a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public Object get(int i10) {
            C1539c.c(this, i10);
            return this.f10559a.get(i10 + this.f10560b);
        }

        public int indexOf(Object obj) {
            int i10 = this.f10561c;
            for (int i11 = this.f10560b; i11 < i10; i11++) {
                if (C6496s.c(this.f10559a.get(i11), obj)) {
                    return i11 - this.f10560b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            if (this.f10561c == this.f10560b) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return new c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            int i10 = this.f10561c - 1;
            int i11 = this.f10560b;
            if (i11 > i10) {
                return -1;
            }
            while (!C6496s.c(this.f10559a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f10560b;
        }

        public ListIterator listIterator() {
            return new c(this, 0);
        }

        public final /* bridge */ Object remove(int i10) {
            return b(i10);
        }

        public boolean removeAll(Collection collection) {
            int i10 = this.f10561c;
            for (Object remove : collection) {
                remove(remove);
            }
            if (i10 != this.f10561c) {
                return true;
            }
            return false;
        }

        public boolean retainAll(Collection collection) {
            int i10 = this.f10561c;
            int i11 = i10 - 1;
            int i12 = this.f10560b;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f10559a.get(i11))) {
                        this.f10559a.remove(i11);
                        this.f10561c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            if (i10 != this.f10561c) {
                return true;
            }
            return false;
        }

        public Object set(int i10, Object obj) {
            C1539c.c(this, i10);
            return this.f10559a.set(i10 + this.f10560b, obj);
        }

        public final /* bridge */ int size() {
            return a();
        }

        public List subList(int i10, int i11) {
            C1539c.d(this, i10, i11);
            return new C0199b(this, i10, i11);
        }

        public Object[] toArray() {
            return C6488j.a(this);
        }

        public void add(int i10, Object obj) {
            this.f10559a.add(i10 + this.f10560b, obj);
            this.f10561c++;
        }

        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        public boolean remove(Object obj) {
            int i10 = this.f10561c;
            for (int i11 = this.f10560b; i11 < i10; i11++) {
                if (C6496s.c(this.f10559a.get(i11), obj)) {
                    this.f10559a.remove(i11);
                    this.f10561c--;
                    return true;
                }
            }
            return false;
        }

        public Object[] toArray(Object[] objArr) {
            return C6488j.b(this, objArr);
        }

        public boolean addAll(Collection collection) {
            this.f10559a.addAll(this.f10561c, collection);
            this.f10561c += collection.size();
            return collection.size() > 0;
        }
    }

    /* renamed from: a0.b$c */
    private static final class c implements ListIterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final List f10562a;

        /* renamed from: b  reason: collision with root package name */
        private int f10563b;

        public c(List list, int i10) {
            this.f10562a = list;
            this.f10563b = i10;
        }

        public void add(Object obj) {
            this.f10562a.add(this.f10563b, obj);
            this.f10563b++;
        }

        public boolean hasNext() {
            if (this.f10563b < this.f10562a.size()) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.f10563b > 0) {
                return true;
            }
            return false;
        }

        public Object next() {
            List list = this.f10562a;
            int i10 = this.f10563b;
            this.f10563b = i10 + 1;
            return list.get(i10);
        }

        public int nextIndex() {
            return this.f10563b;
        }

        public Object previous() {
            int i10 = this.f10563b - 1;
            this.f10563b = i10;
            return this.f10562a.get(i10);
        }

        public int previousIndex() {
            return this.f10563b - 1;
        }

        public void remove() {
            int i10 = this.f10563b - 1;
            this.f10563b = i10;
            this.f10562a.remove(i10);
        }

        public void set(Object obj) {
            this.f10562a.set(this.f10563b, obj);
        }
    }

    public C1538b(Object[] objArr, int i10) {
        this.f10555a = objArr;
        this.f10557c = i10;
    }

    public final boolean A(Collection collection) {
        int i10 = this.f10557c;
        for (int q10 = q() - 1; -1 < q10; q10--) {
            if (!collection.contains(p()[q10])) {
                y(q10);
            }
        }
        if (i10 != this.f10557c) {
            return true;
        }
        return false;
    }

    public final Object B(int i10, Object obj) {
        Object[] objArr = this.f10555a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final void C(int i10) {
        this.f10557c = i10;
    }

    public final void D(Comparator comparator) {
        C6559l.M(this.f10555a, comparator, 0, this.f10557c);
    }

    public final void a(int i10, Object obj) {
        m(this.f10557c + 1);
        Object[] objArr = this.f10555a;
        int i11 = this.f10557c;
        if (i10 != i11) {
            C6559l.m(objArr, objArr, i10 + 1, i10, i11);
        }
        objArr[i10] = obj;
        this.f10557c++;
    }

    public final boolean b(Object obj) {
        m(this.f10557c + 1);
        Object[] objArr = this.f10555a;
        int i10 = this.f10557c;
        objArr[i10] = obj;
        this.f10557c = i10 + 1;
        return true;
    }

    public final boolean d(int i10, C1538b bVar) {
        if (bVar.s()) {
            return false;
        }
        m(this.f10557c + bVar.f10557c);
        Object[] objArr = this.f10555a;
        int i11 = this.f10557c;
        if (i10 != i11) {
            C6559l.m(objArr, objArr, bVar.f10557c + i10, i10, i11);
        }
        C6559l.m(bVar.f10555a, objArr, i10, 0, bVar.f10557c);
        this.f10557c += bVar.f10557c;
        return true;
    }

    public final boolean e(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        m(this.f10557c + collection.size());
        Object[] objArr = this.f10555a;
        if (i10 != this.f10557c) {
            C6559l.m(objArr, objArr, collection.size() + i10, i10, this.f10557c);
        }
        for (Object next : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C6565s.x();
            }
            objArr[i11 + i10] = next;
            i11 = i12;
        }
        this.f10557c += collection.size();
        return true;
    }

    public final boolean f(int i10, List list) {
        if (list.isEmpty()) {
            return false;
        }
        m(this.f10557c + list.size());
        Object[] objArr = this.f10555a;
        if (i10 != this.f10557c) {
            C6559l.m(objArr, objArr, list.size() + i10, i10, this.f10557c);
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = list.get(i11);
        }
        this.f10557c += list.size();
        return true;
    }

    public final boolean g(Collection collection) {
        return e(this.f10557c, collection);
    }

    public final List h() {
        List list = this.f10556b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f10556b = aVar;
        return aVar;
    }

    public final void i() {
        Object[] objArr = this.f10555a;
        int q10 = q();
        while (true) {
            q10--;
            if (-1 < q10) {
                objArr[q10] = null;
            } else {
                this.f10557c = 0;
                return;
            }
        }
    }

    public final boolean j(Object obj) {
        int q10 = q() - 1;
        if (q10 >= 0) {
            int i10 = 0;
            while (!C6496s.c(p()[i10], obj)) {
                if (i10 != q10) {
                    i10++;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean k(Collection collection) {
        for (Object j10 : collection) {
            if (!j(j10)) {
                return false;
            }
        }
        return true;
    }

    public final void m(int i10) {
        Object[] objArr = this.f10555a;
        if (objArr.length < i10) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i10, objArr.length * 2));
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f10555a = copyOf;
        }
    }

    public final Object n() {
        if (!s()) {
            return p()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final Object[] p() {
        return this.f10555a;
    }

    public final int q() {
        return this.f10557c;
    }

    public final int r(Object obj) {
        int i10 = this.f10557c;
        if (i10 <= 0) {
            return -1;
        }
        Object[] objArr = this.f10555a;
        int i11 = 0;
        while (!C6496s.c(obj, objArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean s() {
        if (this.f10557c == 0) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (this.f10557c != 0) {
            return true;
        }
        return false;
    }

    public final Object u() {
        if (!s()) {
            return p()[q() - 1];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final int v(Object obj) {
        int i10 = this.f10557c;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f10555a;
        while (!C6496s.c(obj, objArr[i11])) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean w(Object obj) {
        int r10 = r(obj);
        if (r10 < 0) {
            return false;
        }
        y(r10);
        return true;
    }

    public final boolean x(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f10557c;
        for (Object w10 : collection) {
            w(w10);
        }
        if (i10 != this.f10557c) {
            return true;
        }
        return false;
    }

    public final Object y(int i10) {
        Object[] objArr = this.f10555a;
        Object obj = objArr[i10];
        if (i10 != q() - 1) {
            C6559l.m(objArr, objArr, i10, i10 + 1, this.f10557c);
        }
        int i11 = this.f10557c - 1;
        this.f10557c = i11;
        objArr[i11] = null;
        return obj;
    }

    public final void z(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f10557c;
            if (i11 < i12) {
                Object[] objArr = this.f10555a;
                C6559l.m(objArr, objArr, i10, i11, i12);
            }
            int i13 = this.f10557c - (i11 - i10);
            int q10 = q() - 1;
            if (i13 <= q10) {
                int i14 = i13;
                while (true) {
                    this.f10555a[i14] = null;
                    if (i14 == q10) {
                        break;
                    }
                    i14++;
                }
            }
            this.f10557c = i13;
        }
    }
}
