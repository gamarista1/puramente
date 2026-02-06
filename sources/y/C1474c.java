package Y;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.V;
import yf.p;

/* renamed from: Y.c  reason: case insensitive filesystem */
public abstract class C1474c {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    public static final String b() {
        return Thread.currentThread().getName();
    }

    public static final int c(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void d(C1500m mVar, p pVar) {
        C6496s.f(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((p) V.f(pVar, 2)).invoke(mVar, 1);
    }
}
