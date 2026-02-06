package expo.modules.kotlin.exception;

import Ff.p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class n extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(p pVar, Class cls) {
        super("Cannot convert received '" + cls + "' to the '" + pVar + "', because of the inner ref type mismatch", (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(pVar, "desiredType");
        C6496s.h(cls, "receivedClass");
    }
}
