package expo.modules.kotlin.exception;

import Ff.n;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class k extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(n nVar) {
        super("Value for field '" + nVar + "' is required, got nil", (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(nVar, "property");
    }
}
