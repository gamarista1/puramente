package ae;

import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

/* renamed from: ae.b  reason: case insensitive filesystem */
public final class C4465b implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final Iterator f53614a;

    /* renamed from: b  reason: collision with root package name */
    private final Iterator f53615b;

    public C4465b(Iterator it, Iterator it2) {
        C6496s.h(it, "first");
        C6496s.h(it2, "second");
        this.f53614a = it;
        this.f53615b = it2;
    }

    public boolean hasNext() {
        if (this.f53614a.hasNext() || this.f53615b.hasNext()) {
            return true;
        }
        return false;
    }

    public Object next() {
        if (this.f53614a.hasNext()) {
            return this.f53614a.next();
        }
        return this.f53615b.next();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
