package C;

import H0.C1193n;
import H0.U;

public abstract class S {
    public static final C1095m a(V v10) {
        if (v10 != null) {
            return v10.a();
        }
        return null;
    }

    public static final boolean b(V v10) {
        if (v10 != null) {
            return v10.b();
        }
        return true;
    }

    public static final V c(C1193n nVar) {
        Object a10 = nVar.a();
        if (a10 instanceof V) {
            return (V) a10;
        }
        return null;
    }

    public static final V d(U u10) {
        Object a10 = u10.a();
        if (a10 instanceof V) {
            return (V) a10;
        }
        return null;
    }

    public static final float e(V v10) {
        if (v10 != null) {
            return v10.d();
        }
        return 0.0f;
    }

    public static final boolean f(V v10) {
        C1095m a10 = a(v10);
        if (a10 != null) {
            return a10.c();
        }
        return false;
    }
}
