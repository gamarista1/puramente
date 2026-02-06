package Td;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class r extends CodedException {
    public r() {
        super("Can't read Storage Access Framework directory, use StorageAccessFramework.readDirectoryAsync() instead", (Throwable) null, 2, (DefaultConstructorMarker) null);
    }
}
