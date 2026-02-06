package expo.modules.kotlin.exception;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str, String str2) {
        super("Expected to run on " + str2 + " thread, but was run on " + str, (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(str, "currentThreadName");
        C6496s.h(str2, "expectedThreadName");
    }
}
