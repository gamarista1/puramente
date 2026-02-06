package mf;

import java.util.Iterator;
import zf.C6828a;

public abstract class M implements Iterator, C6828a {
    public abstract long a();

    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
