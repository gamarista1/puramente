package Gd;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super("Unable to download asset from url: " + str, (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(str, "url");
    }
}
