package Ud;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class h extends CodedException {
    public h() {
        super("A file with the same name already exists in the folder location", (Throwable) null, 2, (DefaultConstructorMarker) null);
    }
}
