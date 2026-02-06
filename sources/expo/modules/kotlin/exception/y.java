package expo.modules.kotlin.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class y extends CodedException {
    public y() {
        super("Cannot use shared object that was already released", (Throwable) null, 2, (DefaultConstructorMarker) null);
    }
}
