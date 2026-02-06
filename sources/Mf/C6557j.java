package mf;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

/* renamed from: mf.j  reason: case insensitive filesystem */
final class C6557j implements Collection, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f72073a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f72074b;

    public C6557j(Object[] objArr, boolean z10) {
        C6496s.h(objArr, "values");
        this.f72073a = objArr;
        this.f72074b = z10;
    }

    public int a() {
        return this.f72073a.length;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C6559l.W(this.f72073a, obj);
    }

    public boolean containsAll(Collection collection) {
        C6496s.h(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        if (this.f72073a.length == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return C6481c.a(this.f72073a);
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

    public final /* bridge */ int size() {
        return a();
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        return C6488j.b(this, objArr);
    }

    public final Object[] toArray() {
        return C6566t.b(this.f72073a, this.f72074b);
    }
}
