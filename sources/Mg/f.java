package Mg;

import Of.C5507z;
import kotlin.jvm.internal.C6496s;

public interface f {

    public static final class a {
        public static String a(f fVar, C5507z zVar) {
            C6496s.h(zVar, "functionDescriptor");
            if (!fVar.a(zVar)) {
                return fVar.getDescription();
            }
            return null;
        }
    }

    boolean a(C5507z zVar);

    String b(C5507z zVar);

    String getDescription();
}
