package com.google.firebase.perf;

import Cc.h;
import Eb.C4282c;
import Eb.C4283d;
import Eb.E;
import Eb.q;
import W8.i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import jc.C5046e;
import rc.b;
import rc.e;
import sc.C5200a;
import tc.C5209a;
import ub.C5230g;
import ub.r;
import yb.d;

@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* access modifiers changed from: private */
    public static /* synthetic */ b lambda$getComponents$0(E e10, C4283d dVar) {
        return new b((C5230g) dVar.get(C5230g.class), (r) dVar.e(r.class).get(), (Executor) dVar.d(e10));
    }

    /* access modifiers changed from: private */
    public static e providesFirebasePerformance(C4283d dVar) {
        dVar.get(b.class);
        return C5200a.b().b(new C5209a((C5230g) dVar.get(C5230g.class), (C5046e) dVar.get(C5046e.class), dVar.e(c.class), dVar.e(i.class))).a().a();
    }

    @Keep
    public List<C4282c> getComponents() {
        E a10 = E.a(d.class, Executor.class);
        Class<C5230g> cls = C5230g.class;
        Class<b> cls2 = b.class;
        return Arrays.asList(new C4282c[]{C4282c.e(e.class).h(LIBRARY_NAME).b(q.l(cls)).b(q.n(c.class)).b(q.l(C5046e.class)).b(q.n(i.class)).b(q.l(cls2)).f(new rc.c()).d(), C4282c.e(cls2).h(EARLY_LIBRARY_NAME).b(q.l(cls)).b(q.j(r.class)).b(q.k(a10)).e().f(new rc.d(a10)).d(), h.b(LIBRARY_NAME, "21.0.1")});
    }
}
