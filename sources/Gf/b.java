package Gf;

import kotlin.jvm.internal.C6496s;

public final class b extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
        C6496s.h(illegalAccessException, "cause");
    }
}
