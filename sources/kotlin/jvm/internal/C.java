package kotlin.jvm.internal;

import Ff.c;
import Ff.m;

public abstract class C extends I implements m {
    public C(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    /* access modifiers changed from: protected */
    public c computeReflected() {
        return O.h(this);
    }

    public Object invoke() {
        return get();
    }

    public m.a d() {
        return ((m) getReflected()).d();
    }
}
