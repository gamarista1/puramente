package com.google.firebase.installations;

import Eb.C4282c;
import Eb.C4283d;
import Eb.E;
import Eb.q;
import Fb.j;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gc.h;
import gc.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import jc.C5046e;
import jc.C5047f;
import ub.C5230g;
import yb.C5292a;
import yb.b;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static /* synthetic */ C5046e lambda$getComponents$0(C4283d dVar) {
        return new c((C5230g) dVar.get(C5230g.class), dVar.e(i.class), (ExecutorService) dVar.d(E.a(C5292a.class, ExecutorService.class)), j.c((Executor) dVar.d(E.a(b.class, Executor.class))));
    }

    public List<C4282c> getComponents() {
        return Arrays.asList(new C4282c[]{C4282c.e(C5046e.class).h(LIBRARY_NAME).b(q.l(C5230g.class)).b(q.j(i.class)).b(q.k(E.a(C5292a.class, ExecutorService.class))).b(q.k(E.a(b.class, Executor.class))).f(new C5047f()).d(), h.a(), Cc.h.b(LIBRARY_NAME, "18.0.0")});
    }
}
