package Y;

import j0.C2117b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import zf.C6828a;

/* renamed from: Y.d1  reason: case insensitive filesystem */
final class C1479d1 implements C2117b, Iterable, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final C1476c1 f9972a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9973b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9974c;

    public C1479d1(C1476c1 c1Var, int i10, int i11) {
        this.f9972a = c1Var;
        this.f9973b = i10;
        this.f9974c = i11;
    }

    private final void a() {
        if (this.f9972a.H() != this.f9974c) {
            throw new ConcurrentModificationException();
        }
    }

    public Iterator iterator() {
        a();
        this.f9972a.W(this.f9973b);
        C1476c1 c1Var = this.f9972a;
        int i10 = this.f9973b;
        return new T(c1Var, i10 + 1, i10 + C1482e1.I(c1Var.z(), this.f9973b));
    }
}
