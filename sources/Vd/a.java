package Vd;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class a extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super("File '" + str + "' doesn't exist", (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(str, "uri");
    }
}
