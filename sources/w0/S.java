package W0;

import Q0.C1321d;
import Q0.Q;

public abstract class S {
    public static final C1321d a(Q q10) {
        return q10.e().r(q10.g());
    }

    public static final C1321d b(Q q10, int i10) {
        return q10.e().subSequence(Q.k(q10.g()), Math.min(Q.k(q10.g()) + i10, q10.h().length()));
    }

    public static final C1321d c(Q q10, int i10) {
        return q10.e().subSequence(Math.max(0, Q.l(q10.g()) - i10), Q.l(q10.g()));
    }
}
