package Xf;

import Of.C5484b;
import Of.C5502u;
import Of.C5507z;
import Of.x0;
import Pf.c;
import Zf.e;
import ag.g;
import ag.k;
import eg.C5822C;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class V {
    public static final c a(k kVar, C5822C c10) {
        Object obj;
        C6496s.h(kVar, "c");
        C6496s.h(c10, "wildcardType");
        if (c10.x() != null) {
            Iterator it = new g(kVar, c10, false, 4, (DefaultConstructorMarker) null).iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                c cVar = (c) obj;
                ng.c[] f10 = B.f();
                int length = f10.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (C6496s.c(cVar.f(), f10[i10])) {
                            break loop0;
                        }
                        i10++;
                    }
                }
            }
            return (c) obj;
        }
        throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
    }

    public static final boolean b(C5484b bVar) {
        C6496s.h(bVar, "memberDescriptor");
        if (!(bVar instanceof C5507z) || !C6496s.c(bVar.B(e.f66932H), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public static final boolean c(D d10) {
        C6496s.h(d10, "javaTypeEnhancementState");
        if (d10.c().invoke(B.e()) == O.STRICT) {
            return true;
        }
        return false;
    }

    public static final C5502u d(x0 x0Var) {
        C6496s.h(x0Var, "<this>");
        C5502u g10 = y.g(x0Var);
        C6496s.g(g10, "toDescriptorVisibility(...)");
        return g10;
    }
}
