package d0;

import java.util.Collection;
import java.util.Iterator;
import mf.C6552e;
import zf.C6829b;

/* renamed from: d0.l  reason: case insensitive filesystem */
public final class C1908l extends C6552e implements Collection, C6829b {

    /* renamed from: a  reason: collision with root package name */
    private final C1902f f19421a;

    public C1908l(C1902f fVar) {
        this.f19421a = fVar;
    }

    public int a() {
        return this.f19421a.size();
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f19421a.clear();
    }

    public boolean contains(Object obj) {
        return this.f19421a.containsValue(obj);
    }

    public Iterator iterator() {
        return new C1909m(this.f19421a);
    }
}
