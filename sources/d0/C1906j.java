package d0;

import java.util.Iterator;
import java.util.Set;
import mf.C6555h;
import zf.C6833f;

/* renamed from: d0.j  reason: case insensitive filesystem */
public final class C1906j extends C6555h implements Set, C6833f {

    /* renamed from: a  reason: collision with root package name */
    private final C1902f f19420a;

    public C1906j(C1902f fVar) {
        this.f19420a = fVar;
    }

    public int a() {
        return this.f19420a.size();
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f19420a.clear();
    }

    public boolean contains(Object obj) {
        return this.f19420a.containsKey(obj);
    }

    public Iterator iterator() {
        return new C1907k(this.f19420a);
    }

    public boolean remove(Object obj) {
        if (!this.f19420a.containsKey(obj)) {
            return false;
        }
        this.f19420a.remove(obj);
        return true;
    }
}
