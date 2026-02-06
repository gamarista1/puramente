package com.google.firebase.auth;

import Cb.b;
import Db.C4253b;
import Db.C4256d;
import Eb.C4282c;
import Eb.C4283d;
import Eb.E;
import Eb.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gc.h;
import gc.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import ub.C5230g;
import yb.C5292a;
import yb.c;
import yb.d;

@Keep
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    static /* synthetic */ FirebaseAuth lambda$getComponents$0(E e10, E e11, E e12, E e13, E e14, C4283d dVar) {
        return new C4256d((C5230g) dVar.get(C5230g.class), dVar.e(b.class), dVar.e(i.class), (Executor) dVar.d(e10), (Executor) dVar.d(e11), (Executor) dVar.d(e12), (ScheduledExecutorService) dVar.d(e13), (Executor) dVar.d(e14));
    }

    @Keep
    public List<C4282c> getComponents() {
        Class<Executor> cls = Executor.class;
        E a10 = E.a(C5292a.class, cls);
        E a11 = E.a(yb.b.class, cls);
        Class<c> cls2 = c.class;
        E a12 = E.a(cls2, cls);
        E a13 = E.a(cls2, ScheduledExecutorService.class);
        E a14 = E.a(d.class, cls);
        return Arrays.asList(new C4282c[]{C4282c.f(FirebaseAuth.class, C4253b.class).b(q.l(C5230g.class)).b(q.n(i.class)).b(q.k(a10)).b(q.k(a11)).b(q.k(a12)).b(q.k(a13)).b(q.k(a14)).b(q.j(b.class)).f(new C4792i0(a10, a11, a12, a13, a14)).d(), h.a(), Cc.h.b("fire-auth", "23.0.0")});
    }
}
