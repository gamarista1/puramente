package Jf;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public interface h {

    public static final class a {
        public static void a(h hVar, Object[] objArr) {
            C6496s.h(objArr, "args");
            if (j.a(hVar) != objArr.length) {
                throw new IllegalArgumentException("Callable expects " + j.a(hVar) + " arguments, but " + objArr.length + " were provided.");
            }
        }
    }

    List a();

    Object call(Object[] objArr);

    Member getMember();

    Type getReturnType();
}
