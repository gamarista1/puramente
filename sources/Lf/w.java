package lf;

import kotlin.jvm.internal.C6496s;
import lf.v;

public abstract class w {
    public static final Object a(Throwable th2) {
        C6496s.h(th2, "exception");
        return new v.b(th2);
    }

    public static final void b(Object obj) {
        if (obj instanceof v.b) {
            throw ((v.b) obj).f71843a;
        }
    }
}
