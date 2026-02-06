package expo.modules.kotlin.exception;

import Ff.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class i extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(d dVar, int i10) {
        super("Unable to find the " + dVar + " view with tag " + i10, (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(dVar, "viewType");
    }
}
