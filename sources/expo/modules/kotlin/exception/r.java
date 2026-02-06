package expo.modules.kotlin.exception;

import Ff.p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class r extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(p pVar) {
        super("Cannot find type converter for '" + pVar + "'. Make sure the class implements `expo.modules.kotlin.records.Record` (i.e. `class MyObj : Record`).", (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(pVar, "forType");
    }
}
