package com.google.firebase.storage;

import Cc.h;
import Db.C4253b;
import Eb.C4282c;
import Eb.C4283d;
import Eb.E;
import Eb.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import ub.C5230g;
import yb.b;
import yb.d;

@Keep
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    E blockingExecutor;
    E uiExecutor;

    public StorageRegistrar() {
        Class<Executor> cls = Executor.class;
        this.blockingExecutor = E.a(b.class, cls);
        this.uiExecutor = E.a(d.class, cls);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C4850f lambda$getComponents$0(C4283d dVar) {
        return new C4850f((C5230g) dVar.get(C5230g.class), dVar.e(C4253b.class), dVar.e(Cb.b.class), (Executor) dVar.d(this.blockingExecutor), (Executor) dVar.d(this.uiExecutor));
    }

    public List<C4282c> getComponents() {
        return Arrays.asList(new C4282c[]{C4282c.e(C4850f.class).h(LIBRARY_NAME).b(q.l(C5230g.class)).b(q.k(this.blockingExecutor)).b(q.k(this.uiExecutor)).b(q.j(C4253b.class)).b(q.j(Cb.b.class)).f(new p(this)).d(), h.b(LIBRARY_NAME, "21.0.0")});
    }
}
