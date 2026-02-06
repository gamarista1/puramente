package Td;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class i extends CodedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Uri uri, Uri uri2) {
        super("File '" + uri + "' could not be moved to '" + uri2 + "'", (Throwable) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(uri, "fromUri");
        C6496s.h(uri2, "toUri");
    }
}
