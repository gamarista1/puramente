package expo.modules.kotlin.exception;

import kotlin.jvm.internal.C6496s;

public final class l extends c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, CodedException codedException) {
        super("Call to function '" + str2 + "." + str + "' has been rejected.", codedException);
        C6496s.h(str, "methodName");
        C6496s.h(str2, "moduleName");
        C6496s.h(codedException, "cause");
    }
}
