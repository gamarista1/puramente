package mf;

import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

public final class K implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final Iterator f72035a;

    /* renamed from: b  reason: collision with root package name */
    private int f72036b;

    public K(Iterator it) {
        C6496s.h(it, "iterator");
        this.f72035a = it;
    }

    /* renamed from: a */
    public final I next() {
        int i10 = this.f72036b;
        this.f72036b = i10 + 1;
        if (i10 < 0) {
            C6565s.x();
        }
        return new I(i10, this.f72035a.next());
    }

    public final boolean hasNext() {
        return this.f72035a.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
