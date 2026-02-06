package expo.modules.kotlin.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class s extends CodedException {
    public s() {
        super("Cannot assigned null to not nullable type.", (Throwable) null, 2, (DefaultConstructorMarker) null);
    }
}
