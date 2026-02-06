package Zg;

import Ug.I0;
import java.util.List;
import lf.C6527k;

public abstract class w {
    private static final x a(Throwable th2, String str) {
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new C6527k();
    }

    static /* synthetic */ x b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(I0 i02) {
        return i02.D1() instanceof x;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final I0 e(u uVar, List list) {
        try {
            return uVar.b(list);
        } catch (Throwable th2) {
            return a(th2, uVar.a());
        }
    }
}
