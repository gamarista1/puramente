package com.google.firebase.appcheck;

import Ab.f;
import Eb.C4282c;
import Eb.C4283d;
import Eb.E;
import Eb.q;
import com.google.firebase.components.ComponentRegistrar;
import gc.h;
import gc.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import ub.C5230g;
import yb.C5292a;
import yb.b;
import yb.c;
import yb.d;
import zb.C5301c;
import zb.C5302d;

public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public static /* synthetic */ C5301c b(E e10, E e11, E e12, E e13, C4283d dVar) {
        return new f((C5230g) dVar.get(C5230g.class), dVar.e(i.class), (Executor) dVar.d(e10), (Executor) dVar.d(e11), (Executor) dVar.d(e12), (ScheduledExecutorService) dVar.d(e13));
    }

    public List getComponents() {
        Class<Executor> cls = Executor.class;
        E a10 = E.a(d.class, cls);
        E a11 = E.a(c.class, cls);
        E a12 = E.a(C5292a.class, cls);
        E a13 = E.a(b.class, ScheduledExecutorService.class);
        return Arrays.asList(new C4282c[]{C4282c.f(C5301c.class, Cb.b.class).h("fire-app-check").b(q.l(C5230g.class)).b(q.k(a10)).b(q.k(a11)).b(q.k(a12)).b(q.k(a13)).b(q.j(i.class)).f(new C5302d(a10, a11, a12, a13)).c().d(), h.a(), Cc.h.b("fire-app-check", "18.0.0")});
    }
}
