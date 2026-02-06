package kotlin.jvm.internal;

import Ff.c;
import Ff.o;

public abstract class G extends I implements o {
    public G(Class cls, String str, String str2, int i10) {
        super(C6484f.NO_RECEIVER, cls, str, str2, i10);
    }

    /* access modifiers changed from: protected */
    public c computeReflected() {
        return O.j(this);
    }

    public Object invoke(Object obj, Object obj2) {
        return p(obj, obj2);
    }

    public o.a d() {
        return ((o) getReflected()).d();
    }
}
