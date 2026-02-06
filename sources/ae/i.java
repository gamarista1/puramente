package ae;

import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

public final class i implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final Iterator f53621a;

    /* renamed from: b  reason: collision with root package name */
    private final h f53622b;

    /* renamed from: c  reason: collision with root package name */
    private Object f53623c;

    public i(Iterator it, h hVar) {
        C6496s.h(it, "iterator");
        C6496s.h(hVar, "filter");
        this.f53621a = it;
        this.f53622b = hVar;
        a();
    }

    private final void a() {
        while (this.f53621a.hasNext()) {
            Object next = this.f53621a.next();
            this.f53623c = next;
            if (this.f53622b.apply(next)) {
                return;
            }
        }
        this.f53623c = null;
    }

    public boolean hasNext() {
        if (this.f53623c != null) {
            return true;
        }
        return false;
    }

    public Object next() {
        Object obj = this.f53623c;
        C6496s.e(obj);
        a();
        return obj;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
