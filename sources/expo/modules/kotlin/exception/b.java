package expo.modules.kotlin.exception;

import Ff.d;
import Ff.p;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.C6496s;

public final class b extends c {
    private b(p pVar, p pVar2, String str, CodedException codedException) {
        super("Cannot cast '" + str + "' to '" + pVar2 + "' required by the collection of type: '" + pVar + "'.", codedException);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(p pVar, p pVar2, ReadableType readableType, CodedException codedException) {
        this(pVar, pVar2, readableType.name(), codedException);
        C6496s.h(pVar, "collectionType");
        C6496s.h(pVar2, "elementType");
        C6496s.h(readableType, "providedType");
        C6496s.h(codedException, "cause");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(p pVar, p pVar2, d dVar, CodedException codedException) {
        this(pVar, pVar2, dVar.toString(), codedException);
        C6496s.h(pVar, "collectionType");
        C6496s.h(pVar2, "elementType");
        C6496s.h(dVar, "providedType");
        C6496s.h(codedException, "cause");
    }
}
