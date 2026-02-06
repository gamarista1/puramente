package Gf;

import kotlin.jvm.internal.C6496s;

public final class a extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(IllegalAccessException illegalAccessException) {
        super(illegalAccessException);
        C6496s.h(illegalAccessException, "cause");
    }
}
