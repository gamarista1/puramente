package expo.modules.kotlin.exception;

import Ff.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class x extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(d dVar) {
        super("Unsupported type: '" + dVar + "'", (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(dVar, "clazz");
    }
}
