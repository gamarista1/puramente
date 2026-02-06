package mf;

import java.util.Iterator;
import zf.C6828a;

public abstract class L implements Iterator, C6828a {
    public abstract int a();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
