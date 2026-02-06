package expo.modules.kotlin.exception;

import Ff.d;
import kotlin.jvm.internal.C6496s;

public final class v extends c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(String str, d dVar, CodedException codedException) {
        super("Cannot set prop '" + str + "' on view '" + dVar + "'", codedException);
        C6496s.h(str, "propName");
        C6496s.h(dVar, "viewType");
        C6496s.h(codedException, "cause");
    }
}
