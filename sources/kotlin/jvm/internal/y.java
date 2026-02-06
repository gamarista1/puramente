package kotlin.jvm.internal;

import Ff.c;
import Ff.j;
import Ff.n;

public abstract class y extends A implements j {
    public y(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    /* access modifiers changed from: protected */
    public c computeReflected() {
        return O.f(this);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public n.a d() {
        return ((j) getReflected()).d();
    }

    public j.a g() {
        return ((j) getReflected()).g();
    }
}
