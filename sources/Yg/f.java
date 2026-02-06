package Yg;

import Xg.C5695g;
import Zg.K;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.V;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

public abstract class f {
    /* JADX INFO: finally extract failed */
    public static final Object b(g gVar, Object obj, Object obj2, p pVar, C6658d dVar) {
        Object obj3;
        Object c10 = K.c(gVar, obj2);
        try {
            y yVar = new y(dVar, gVar);
            if (!(pVar instanceof a)) {
                obj3 = C6680b.d(pVar, obj, yVar);
            } else {
                obj3 = ((p) V.f(pVar, 2)).invoke(obj, yVar);
            }
            K.a(gVar, c10);
            if (obj3 == C6680b.f()) {
                h.c(dVar);
            }
            return obj3;
        } catch (Throwable th2) {
            K.a(gVar, c10);
            throw th2;
        }
    }

    public static /* synthetic */ Object c(g gVar, Object obj, Object obj2, p pVar, C6658d dVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = K.b(gVar);
        }
        return b(gVar, obj, obj2, pVar, dVar);
    }

    /* access modifiers changed from: private */
    public static final C5695g d(C5695g gVar, g gVar2) {
        boolean z10;
        if (gVar instanceof x) {
            z10 = true;
        } else {
            z10 = gVar instanceof s;
        }
        if (z10) {
            return gVar;
        }
        return new A(gVar, gVar2);
    }
}
