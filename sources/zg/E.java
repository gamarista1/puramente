package Zg;

import kotlin.jvm.internal.C6496s;

public abstract class E {
    public static final D b(Object obj) {
        if (obj != C5715d.f66970a) {
            C6496s.f(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (D) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean c(Object obj) {
        if (obj == C5715d.f66970a) {
            return true;
        }
        return false;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
