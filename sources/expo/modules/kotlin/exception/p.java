package expo.modules.kotlin.exception;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class p extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Ff.p pVar) {
        super("Cannot convert provided JavaScriptObject to the '" + pVar + "', because the native type doesn't match", (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(pVar, "sharedType");
    }
}
