package mf;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

/* renamed from: mf.E  reason: case insensitive filesystem */
public final class C6545E implements List, Serializable, RandomAccess, C6828a {

    /* renamed from: a  reason: collision with root package name */
    public static final C6545E f72029a = new C6545E();
    private static final long serialVersionUID = -7390468764508069838L;

    private C6545E() {
    }

    private final Object readResolve() {
        return f72029a;
    }

    public boolean a(Void voidR) {
        C6496s.h(voidR, "element");
        return false;
    }

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void get(int i10) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i10 + '.');
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return a((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C6496s.h(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof List) || !((List) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public int g() {
        return 0;
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return k((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C6544D.f72028a;
    }

    public int k(Void voidR) {
        C6496s.h(voidR, "element");
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return n((Void) obj);
    }

    public ListIterator listIterator() {
        return C6544D.f72028a;
    }

    public int n(Void voidR) {
        C6496s.h(voidR, "element");
        return -1;
    }

    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return g();
    }

    public List subList(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11);
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    public String toString() {
        return "[]";
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i10) {
        if (i10 == 0) {
            return C6544D.f72028a;
        }
        throw new IndexOutOfBoundsException("Index: " + i10);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        return C6488j.b(this, objArr);
    }
}
