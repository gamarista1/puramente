package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mf.C6565s;
import yf.C6798l;
import zf.C6828a;

public final class X implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f16029a;

    /* renamed from: b  reason: collision with root package name */
    private final List f16030b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Iterator f16031c;

    public X(Iterator it, C6798l lVar) {
        this.f16029a = lVar;
        this.f16031c = it;
    }

    private final void a(Object obj) {
        Iterator it = (Iterator) this.f16029a.invoke(obj);
        if (it == null || !it.hasNext()) {
            while (!this.f16031c.hasNext() && !this.f16030b.isEmpty()) {
                this.f16031c = (Iterator) C6565s.z0(this.f16030b);
                C6565s.N(this.f16030b);
            }
            return;
        }
        this.f16030b.add(this.f16031c);
        this.f16031c = it;
    }

    public boolean hasNext() {
        return this.f16031c.hasNext();
    }

    public Object next() {
        Object next = this.f16031c.next();
        a(next);
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
