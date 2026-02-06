package ah;

import Ug.B;
import Ug.F0;
import Ug.c1;
import Zg.C;
import Zg.K;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import lf.v;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

public abstract class b {
    public static final void a(p pVar, Object obj, C6658d dVar) {
        g context;
        Object c10;
        Object obj2;
        C6658d a10 = h.a(dVar);
        try {
            context = dVar.getContext();
            c10 = K.c(context, (Object) null);
            if (!(pVar instanceof a)) {
                obj2 = C6680b.d(pVar, obj, a10);
            } else {
                obj2 = ((p) V.f(pVar, 2)).invoke(obj, a10);
            }
            K.a(context, c10);
            if (obj2 != C6680b.f()) {
                a10.resumeWith(v.b(obj2));
            }
        } catch (Throwable th2) {
            v.a aVar = v.f71841b;
            a10.resumeWith(v.b(w.a(th2)));
        }
    }

    public static final Object b(C c10, Object obj, p pVar) {
        Object obj2;
        try {
            if (!(pVar instanceof a)) {
                obj2 = C6680b.d(pVar, obj, c10);
            } else {
                obj2 = ((p) V.f(pVar, 2)).invoke(obj, c10);
            }
        } catch (Throwable th2) {
            obj2 = new B(th2, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj2 == C6680b.f()) {
            return C6680b.f();
        }
        Object A02 = c10.A0(obj2);
        if (A02 == F0.f65305b) {
            return C6680b.f();
        }
        if (!(A02 instanceof B)) {
            return F0.h(A02);
        }
        throw ((B) A02).f65278a;
    }

    public static final Object c(C c10, Object obj, p pVar) {
        Object obj2;
        try {
            if (!(pVar instanceof a)) {
                obj2 = C6680b.d(pVar, obj, c10);
            } else {
                obj2 = ((p) V.f(pVar, 2)).invoke(obj, c10);
            }
        } catch (Throwable th2) {
            obj2 = new B(th2, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj2 == C6680b.f()) {
            return C6680b.f();
        }
        Object A02 = c10.A0(obj2);
        if (A02 == F0.f65305b) {
            return C6680b.f();
        }
        if (A02 instanceof B) {
            Throwable th3 = ((B) A02).f65278a;
            if (!(th3 instanceof c1) || ((c1) th3).f65354a != c10) {
                throw th3;
            } else if (obj2 instanceof B) {
                throw ((B) obj2).f65278a;
            }
        } else {
            obj2 = F0.h(A02);
        }
        return obj2;
    }
}
