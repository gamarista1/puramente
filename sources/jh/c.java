package jh;

import gh.C5977a;
import ih.f;
import kotlin.jvm.internal.C6496s;
import nh.C6624e;

public interface c {

    public static final class a {
        public static int a(c cVar, f fVar) {
            C6496s.h(fVar, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, f fVar, int i10, C5977a aVar, Object obj, int i11, Object obj2) {
            if (obj2 == null) {
                if ((i11 & 8) != 0) {
                    obj = null;
                }
                return cVar.C(fVar, i10, aVar, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    String A(f fVar, int i10);

    Object C(f fVar, int i10, C5977a aVar, Object obj);

    int E(f fVar, int i10);

    long G(f fVar, int i10);

    C6624e a();

    void c(f fVar);

    e e(f fVar, int i10);

    float f(f fVar, int i10);

    Object i(f fVar, int i10, C5977a aVar, Object obj);

    byte k(f fVar, int i10);

    int o(f fVar);

    boolean p();

    int q(f fVar);

    short r(f fVar, int i10);

    boolean s(f fVar, int i10);

    char v(f fVar, int i10);

    double x(f fVar, int i10);
}
