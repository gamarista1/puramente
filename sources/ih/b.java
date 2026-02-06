package ih;

import Ff.d;
import gh.C5978b;
import java.util.List;
import kh.s0;
import kotlin.jvm.internal.C6496s;
import nh.C6624e;

public abstract class b {
    public static final d a(f fVar) {
        C6496s.h(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f68470b;
        }
        if (fVar instanceof s0) {
            return a(((s0) fVar).k());
        }
        return null;
    }

    public static final f b(C6624e eVar, f fVar) {
        C5978b c10;
        C6496s.h(eVar, "<this>");
        C6496s.h(fVar, "descriptor");
        d a10 = a(fVar);
        if (a10 == null || (c10 = C6624e.c(eVar, a10, (List) null, 2, (Object) null)) == null) {
            return null;
        }
        return c10.getDescriptor();
    }

    public static final f c(f fVar, d dVar) {
        C6496s.h(fVar, "<this>");
        C6496s.h(dVar, "context");
        return new c(fVar, dVar);
    }
}
