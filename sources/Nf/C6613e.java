package nf;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

/* renamed from: nf.e  reason: case insensitive filesystem */
public final class C6613e extends C6609a {

    /* renamed from: a  reason: collision with root package name */
    private final C6612d f72264a;

    public C6613e(C6612d dVar) {
        C6496s.h(dVar, "backing");
        this.f72264a = dVar;
    }

    public int a() {
        return this.f72264a.size();
    }

    public boolean addAll(Collection collection) {
        C6496s.h(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f72264a.clear();
    }

    public boolean containsAll(Collection collection) {
        C6496s.h(collection, "elements");
        return this.f72264a.t(collection);
    }

    public boolean g(Map.Entry entry) {
        C6496s.h(entry, "element");
        return this.f72264a.u(entry);
    }

    public boolean isEmpty() {
        return this.f72264a.isEmpty();
    }

    public Iterator iterator() {
        return this.f72264a.z();
    }

    public boolean k(Map.Entry entry) {
        C6496s.h(entry, "element");
        return this.f72264a.S(entry);
    }

    /* renamed from: n */
    public boolean add(Map.Entry entry) {
        C6496s.h(entry, "element");
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection) {
        C6496s.h(collection, "elements");
        this.f72264a.r();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C6496s.h(collection, "elements");
        this.f72264a.r();
        return super.retainAll(collection);
    }
}
