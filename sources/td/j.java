package Td;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class j extends CodedException {
    public j(Uri uri) {
        super("Uri '" + uri + "' doesn't exist or isn't a directory", (Throwable) null, 2, (DefaultConstructorMarker) null);
    }
}
