package expo.modules.kotlin.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class o extends CodedException {
    public o() {
        super("Cannot convert provided JavaScriptObject to the SharedObject, because it doesn't contain valid id", (Throwable) null, 2, (DefaultConstructorMarker) null);
    }
}
