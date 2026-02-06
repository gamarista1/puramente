package nf;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6555h;
import zf.C6833f;

/* renamed from: nf.f  reason: case insensitive filesystem */
public final class C6614f extends C6555h implements Set, C6833f {

    /* renamed from: a  reason: collision with root package name */
    private final C6612d f72265a;

    public C6614f(C6612d dVar) {
        C6496s.h(dVar, "backing");
        this.f72265a = dVar;
    }

    public int a() {
        return this.f72265a.size();
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        C6496s.h(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f72265a.clear();
    }

    public boolean contains(Object obj) {
        return this.f72265a.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f72265a.isEmpty();
    }

    public Iterator iterator() {
        return this.f72265a.M();
    }

    public boolean remove(Object obj) {
        return this.f72265a.V(obj);
    }

    public boolean removeAll(Collection collection) {
        C6496s.h(collection, "elements");
        this.f72265a.r();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C6496s.h(collection, "elements");
        this.f72265a.r();
        return super.retainAll(collection);
    }
}
