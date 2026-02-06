package mf;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

/* renamed from: mf.G  reason: case insensitive filesystem */
public final class C6547G implements Set, Serializable, C6828a {

    /* renamed from: a  reason: collision with root package name */
    public static final C6547G f72031a = new C6547G();
    private static final long serialVersionUID = 3406603774387020532L;

    private C6547G() {
    }

    private final Object readResolve() {
        return f72031a;
    }

    public boolean a(Void voidR) {
        C6496s.h(voidR, "element");
        return false;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return 0;
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
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C6544D.f72028a;
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
        return b();
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    public String toString() {
        return "[]";
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        return C6488j.b(this, objArr);
    }
}
