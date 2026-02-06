package kotlin.jvm.internal;

import Ff.c;
import Ff.n;

public abstract class E extends I implements n {
    public E() {
    }

    /* access modifiers changed from: protected */
    public c computeReflected() {
        return O.i(this);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public E(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    public n.a d() {
        return ((n) getReflected()).d();
    }
}
