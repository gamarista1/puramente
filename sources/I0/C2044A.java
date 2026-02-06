package i0;

import Ef.m;
import Y.C0;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.L;
import lf.C6527k;
import zf.C6828a;
import zf.C6831d;

/* renamed from: i0.A  reason: case insensitive filesystem */
final class C2044A implements List, C6831d {

    /* renamed from: a  reason: collision with root package name */
    private final r f21684a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21685b;

    /* renamed from: c  reason: collision with root package name */
    private int f21686c;

    /* renamed from: d  reason: collision with root package name */
    private int f21687d;

    /* renamed from: i0.A$a */
    public static final class a implements ListIterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L f21688a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2044A f21689b;

        a(L l10, C2044A a10) {
            this.f21688a = l10;
            this.f21689b = a10;
        }

        /* renamed from: a */
        public Void add(Object obj) {
            Void unused = s.f();
            throw new C6527k();
        }

        /* renamed from: b */
        public Void remove() {
            Void unused = s.f();
            throw new C6527k();
        }

        /* renamed from: c */
        public Void set(Object obj) {
            Void unused = s.f();
            throw new C6527k();
        }

        public boolean hasNext() {
            if (this.f21688a.f71757a < this.f21689b.size() - 1) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.f21688a.f71757a >= 0) {
                return true;
            }
            return false;
        }

        public Object next() {
            int i10 = this.f21688a.f71757a + 1;
            s.g(i10, this.f21689b.size());
            this.f21688a.f71757a = i10;
            return this.f21689b.get(i10);
        }

        public int nextIndex() {
            return this.f21688a.f71757a + 1;
        }

        public Object previous() {
            int i10 = this.f21688a.f71757a;
            s.g(i10, this.f21689b.size());
            this.f21688a.f71757a = i10 - 1;
            return this.f21689b.get(i10);
        }

        public int previousIndex() {
            return this.f21688a.f71757a;
        }
    }

    public C2044A(r rVar, int i10, int i11) {
        this.f21684a = rVar;
        this.f21685b = i10;
        this.f21686c = rVar.r();
        this.f21687d = i11 - i10;
    }

    private final void g() {
        if (this.f21684a.r() != this.f21686c) {
            throw new ConcurrentModificationException();
        }
    }

    public int a() {
        return this.f21687d;
    }

    public boolean add(Object obj) {
        g();
        this.f21684a.add(this.f21685b + size(), obj);
        this.f21687d = size() + 1;
        this.f21686c = this.f21684a.r();
        return true;
    }

    public boolean addAll(int i10, Collection collection) {
        g();
        boolean addAll = this.f21684a.addAll(i10 + this.f21685b, collection);
        if (addAll) {
            this.f21687d = size() + collection.size();
            this.f21686c = this.f21684a.r();
        }
        return addAll;
    }

    public Object b(int i10) {
        g();
        Object remove = this.f21684a.remove(this.f21685b + i10);
        this.f21687d = size() - 1;
        this.f21686c = this.f21684a.r();
        return remove;
    }

    public void clear() {
        if (size() > 0) {
            g();
            r rVar = this.f21684a;
            int i10 = this.f21685b;
            rVar.x(i10, size() + i10);
            this.f21687d = 0;
            this.f21686c = this.f21684a.r();
        }
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i10) {
        g();
        s.g(i10, size());
        return this.f21684a.get(this.f21685b + i10);
    }

    public int indexOf(Object obj) {
        g();
        int i10 = this.f21685b;
        Iterator it = m.u(i10, size() + i10).iterator();
        while (it.hasNext()) {
            int a10 = ((mf.L) it).a();
            if (C6496s.c(obj, this.f21684a.get(a10))) {
                return a10 - this.f21685b;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        g();
        int size = this.f21685b + size();
        while (true) {
            size--;
            if (size < this.f21685b) {
                return -1;
            }
            if (C6496s.c(obj, this.f21684a.get(size))) {
                return size - this.f21685b;
            }
        }
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final /* bridge */ Object remove(int i10) {
        return b(i10);
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z10;
                }
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
        }
    }

    public boolean retainAll(Collection collection) {
        g();
        r rVar = this.f21684a;
        int i10 = this.f21685b;
        int z10 = rVar.z(collection, i10, size() + i10);
        if (z10 > 0) {
            this.f21686c = this.f21684a.r();
            this.f21687d = size() - z10;
        }
        if (z10 > 0) {
            return true;
        }
        return false;
    }

    public Object set(int i10, Object obj) {
        s.g(i10, size());
        g();
        Object obj2 = this.f21684a.set(i10 + this.f21685b, obj);
        this.f21686c = this.f21684a.r();
        return obj2;
    }

    public final /* bridge */ int size() {
        return a();
    }

    public List subList(int i10, int i11) {
        boolean z10;
        if (i10 < 0 || i10 > i11 || i11 > size()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C0.a("fromIndex or toIndex are out of bounds");
        }
        g();
        r rVar = this.f21684a;
        int i12 = this.f21685b;
        return new C2044A(rVar, i10 + i12, i11 + i12);
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    public ListIterator listIterator(int i10) {
        g();
        L l10 = new L();
        l10.f71757a = i10 - 1;
        return new a(l10, this);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public Object[] toArray(Object[] objArr) {
        return C6488j.b(this, objArr);
    }

    public void add(int i10, Object obj) {
        g();
        this.f21684a.add(this.f21685b + i10, obj);
        this.f21687d = size() + 1;
        this.f21686c = this.f21684a.r();
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
