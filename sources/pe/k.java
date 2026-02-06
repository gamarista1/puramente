package pe;

import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

public final class k implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final e f61336a;

    /* renamed from: b  reason: collision with root package name */
    private int f61337b;

    public k(e eVar) {
        C6496s.h(eVar, "typedArray");
        this.f61336a = eVar;
    }

    public boolean hasNext() {
        if (this.f61337b < this.f61336a.a()) {
            return true;
        }
        return false;
    }

    public Object next() {
        e eVar = this.f61336a;
        int i10 = this.f61337b;
        this.f61337b = i10 + 1;
        return eVar.get(i10);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
