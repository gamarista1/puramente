package Td;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class q extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(String str) {
        super("No readable files with the uri '" + str + "'. Please use other uri", (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(str, "uri");
    }
}
