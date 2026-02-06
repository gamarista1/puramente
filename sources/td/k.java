package Td;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class k extends CodedException {
    public k(Uri uri) {
        super("File '" + uri + "' could not be copied because it could not be found", (Throwable) null, 2, (DefaultConstructorMarker) null);
    }
}
