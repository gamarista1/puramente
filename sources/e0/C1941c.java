package e0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import zf.C6828a;

/* renamed from: e0.c  reason: case insensitive filesystem */
public class C1941c implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private Object f19531a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f19532b;

    /* renamed from: c  reason: collision with root package name */
    private int f19533c;

    public C1941c(Object obj, Map map) {
        this.f19531a = obj;
        this.f19532b = map;
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        if (this.f19533c < this.f19532b.size()) {
            return true;
        }
        return false;
    }

    public Object next() {
        a();
        Object obj = this.f19531a;
        this.f19533c++;
        Object obj2 = this.f19532b.get(obj);
        if (obj2 != null) {
            this.f19531a = ((C1939a) obj2).c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
