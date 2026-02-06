package mf;

import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zf.C6828a;

/* renamed from: mf.c  reason: case insensitive filesystem */
public abstract class C6550c extends C6548a implements List, C6828a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72053a = new a((DefaultConstructorMarker) null);

    /* renamed from: mf.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            } else if (i10 > i11) {
                throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            } else if (i10 > i11) {
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 <= 0) {
                return i12;
            }
            if (i11 > 2147483639) {
                return a.e.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }

        public final boolean f(Collection collection, Collection collection2) {
            C6496s.h(collection, "c");
            C6496s.h(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object c10 : collection) {
                if (!C6496s.c(c10, it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection collection) {
            int i10;
            C6496s.h(collection, "c");
            int i11 = 1;
            for (Object next : collection) {
                int i12 = i11 * 31;
                if (next != null) {
                    i10 = next.hashCode();
                } else {
                    i10 = 0;
                }
                i11 = i12 + i10;
            }
            return i11;
        }

        private a() {
        }
    }

    /* renamed from: mf.c$b */
    private class b implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f72054a;

        public b() {
        }

        /* access modifiers changed from: protected */
        public final int a() {
            return this.f72054a;
        }

        /* access modifiers changed from: protected */
        public final void b(int i10) {
            this.f72054a = i10;
        }

        public boolean hasNext() {
            if (this.f72054a < C6550c.this.size()) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (hasNext()) {
                C6550c cVar = C6550c.this;
                int i10 = this.f72054a;
                this.f72054a = i10 + 1;
                return cVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: mf.c$c  reason: collision with other inner class name */
    private class C1038c extends b implements ListIterator, C6828a {
        public C1038c(int i10) {
            super();
            C6550c.f72053a.c(i10, C6550c.this.size());
            b(i10);
        }

        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            if (a() > 0) {
                return true;
            }
            return false;
        }

        public int nextIndex() {
            return a();
        }

        public Object previous() {
            if (hasPrevious()) {
                C6550c cVar = C6550c.this;
                b(a() - 1);
                return cVar.get(a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return a() - 1;
        }

        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: mf.c$d */
    private static final class d extends C6550c implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        private final C6550c f72057b;

        /* renamed from: c  reason: collision with root package name */
        private final int f72058c;

        /* renamed from: d  reason: collision with root package name */
        private int f72059d;

        public d(C6550c cVar, int i10, int i11) {
            C6496s.h(cVar, AttributeType.LIST);
            this.f72057b = cVar;
            this.f72058c = i10;
            C6550c.f72053a.d(i10, i11, cVar.size());
            this.f72059d = i11 - i10;
        }

        public int a() {
            return this.f72059d;
        }

        public Object get(int i10) {
            C6550c.f72053a.b(i10, this.f72059d);
            return this.f72057b.get(this.f72058c + i10);
        }
    }

    protected C6550c() {
    }

    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f72053a.f(this, (Collection) obj);
    }

    public abstract Object get(int i10);

    public int hashCode() {
        return f72053a.g(this);
    }

    public int indexOf(Object obj) {
        int i10 = 0;
        for (Object c10 : this) {
            if (C6496s.c(c10, obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C6496s.c(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C1038c(0);
    }

    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    public ListIterator listIterator(int i10) {
        return new C1038c(i10);
    }
}
