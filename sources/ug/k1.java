package Ug;

import Zg.C5722k;
import Zg.C5723l;
import kotlin.coroutines.jvm.internal.h;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import rf.C6680b;

public abstract class k1 {
    public static final Object a(C6658d dVar) {
        C5722k kVar;
        Object obj;
        g context = dVar.getContext();
        A0.m(context);
        C6658d c10 = C6680b.c(dVar);
        if (c10 instanceof C5722k) {
            kVar = (C5722k) c10;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            obj = C6514M.f71813a;
        } else {
            if (kVar.f66977d.B1(context)) {
                kVar.k(context, C6514M.f71813a);
            } else {
                j1 j1Var = new j1();
                g n12 = context.n1(j1Var);
                C6514M m10 = C6514M.f71813a;
                kVar.k(n12, m10);
                if (j1Var.f65391b) {
                    if (C5723l.d(kVar)) {
                        obj = C6680b.f();
                    } else {
                        obj = m10;
                    }
                }
            }
            obj = C6680b.f();
        }
        if (obj == C6680b.f()) {
            h.c(dVar);
        }
        if (obj == C6680b.f()) {
            return obj;
        }
        return C6514M.f71813a;
    }
}
