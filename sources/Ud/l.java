package Ud;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super("Unable to write to a file handle: '" + str + "'", (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(str, "reason");
    }
}
