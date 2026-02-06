package Ug;

import Zg.C;
import Zg.K;
import ah.C5730a;
import ah.b;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;
import qf.e;
import qf.g;
import qf.h;
import rf.C6680b;
import yf.C6798l;
import yf.p;

/* renamed from: Ug.k  reason: case insensitive filesystem */
abstract /* synthetic */ class C5576k {
    public static final S a(K k10, g gVar, M m10, p pVar) {
        T t10;
        g d10 = F.d(k10, gVar);
        if (m10.c()) {
            t10 = new G0(d10, pVar);
        } else {
            t10 = new T(d10, true);
        }
        t10.f1(m10, t10, pVar);
        return t10;
    }

    public static /* synthetic */ S b(K k10, g gVar, M m10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f72645a;
        }
        if ((i10 & 2) != 0) {
            m10 = M.DEFAULT;
        }
        return C5572i.a(k10, gVar, m10, pVar);
    }

    public static final C5600w0 c(K k10, g gVar, M m10, p pVar) {
        C5556a aVar;
        g d10 = F.d(k10, gVar);
        if (m10.c()) {
            aVar = new H0(d10, pVar);
        } else {
            aVar = new R0(d10, true);
        }
        aVar.f1(m10, aVar, pVar);
        return aVar;
    }

    public static /* synthetic */ C5600w0 d(K k10, g gVar, M m10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f72645a;
        }
        if ((i10 & 2) != 0) {
            m10 = M.DEFAULT;
        }
        return C5572i.c(k10, gVar, m10, pVar);
    }

    /* JADX INFO: finally extract failed */
    public static final Object e(g gVar, p pVar, C6658d dVar) {
        Object obj;
        g context = dVar.getContext();
        g e10 = F.e(context, gVar);
        A0.m(e10);
        if (e10 == context) {
            C c10 = new C(e10, dVar);
            obj = b.b(c10, c10, pVar);
        } else {
            e.b bVar = e.f72642c0;
            if (C6496s.c(e10.b(bVar), context.b(bVar))) {
                g1 g1Var = new g1(e10, dVar);
                g context2 = g1Var.getContext();
                Object c11 = K.c(context2, (Object) null);
                try {
                    Object b10 = b.b(g1Var, g1Var, pVar);
                    K.a(context2, c11);
                    obj = b10;
                } catch (Throwable th2) {
                    K.a(context2, c11);
                    throw th2;
                }
            } else {
                W w10 = new W(e10, dVar);
                C5730a.d(pVar, w10, w10, (C6798l) null, 4, (Object) null);
                obj = w10.g1();
            }
        }
        if (obj == C6680b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return obj;
    }
}
