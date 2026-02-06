package expo.modules.kotlin.exception;

import Ff.p;
import kotlin.jvm.internal.C6496s;

public final class w extends c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(p pVar, CodedException codedException) {
        super("Cannot create a record of the type: '" + pVar + "'.", codedException);
        C6496s.h(pVar, "recordType");
        C6496s.h(codedException, "cause");
    }
}
