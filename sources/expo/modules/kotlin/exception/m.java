package expo.modules.kotlin.exception;

import Ff.p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class m extends CodedException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, p pVar2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, pVar2, (i10 & 4) != 0 ? null : th2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(p pVar, p pVar2, Throwable th2) {
        super("Argument type '" + pVar + "' is not compatible with expected type '" + pVar2 + "'.", th2);
        C6496s.h(pVar, "argumentType");
        C6496s.h(pVar2, "desiredType");
    }
}
