package Td;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l extends CodedException {
    public l(Uri uri) {
        super("File '" + uri + "' could not be deleted because it could not be found", (Throwable) null, 2, (DefaultConstructorMarker) null);
    }
}
