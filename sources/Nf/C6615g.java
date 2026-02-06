package nf;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import mf.C6552e;
import zf.C6829b;

/* renamed from: nf.g  reason: case insensitive filesystem */
public final class C6615g extends C6552e implements Collection, C6829b {

    /* renamed from: a  reason: collision with root package name */
    private final C6612d f72266a;

    public C6615g(C6612d dVar) {
        C6496s.h(dVar, "backing");
        this.f72266a = dVar;
    }

    public int a() {
        return this.f72266a.size();
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        C6496s.h(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f72266a.clear();
    }

    public boolean contains(Object obj) {
        return this.f72266a.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.f72266a.isEmpty();
    }

    public Iterator iterator() {
        return this.f72266a.Y();
    }

    public boolean remove(Object obj) {
        return this.f72266a.W(obj);
    }

    public boolean removeAll(Collection collection) {
        C6496s.h(collection, "elements");
        this.f72266a.r();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C6496s.h(collection, "elements");
        this.f72266a.r();
        return super.retainAll(collection);
    }
}
