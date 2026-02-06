package mf;

import java.util.Iterator;
import zf.C6828a;

public abstract class r implements Iterator, C6828a {
    public abstract char a();

    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
