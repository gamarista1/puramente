package Y;

import j0.C2117b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import zf.C6828a;

final class T implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final C1476c1 f9899a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9900b;

    /* renamed from: c  reason: collision with root package name */
    private int f9901c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9902d;

    public T(C1476c1 c1Var, int i10, int i11) {
        this.f9899a = c1Var;
        this.f9900b = i11;
        this.f9901c = i10;
        this.f9902d = c1Var.H();
        if (c1Var.I()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void b() {
        if (this.f9899a.H() != this.f9902d) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public C2117b next() {
        b();
        int i10 = this.f9901c;
        this.f9901c = C1482e1.I(this.f9899a.z(), i10) + i10;
        return new C1479d1(this.f9899a, i10, this.f9902d);
    }

    public boolean hasNext() {
        if (this.f9901c < this.f9900b) {
            return true;
        }
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
