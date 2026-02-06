package expo.modules.kotlin.exception;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class u extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(String str) {
        super("Promise passed to '" + str + "' was already settled. It will lead to a crash in the production environment!", (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(str, "functionName");
    }
}
