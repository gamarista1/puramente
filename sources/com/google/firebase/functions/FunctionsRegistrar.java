package com.google.firebase.functions;

import Cb.b;
import Cc.h;
import Db.C4253b;
import Eb.C4282c;
import Eb.E;
import Eb.q;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ec.C4950b;
import hc.C5010a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import ub.p;
import yb.c;
import yb.d;

@Keep
public class FunctionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fn";

    public List<C4282c> getComponents() {
        Class<Executor> cls = Executor.class;
        E a10 = E.a(c.class, cls);
        E a11 = E.a(d.class, cls);
        return Arrays.asList(new C4282c[]{C4282c.e(s.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.l(p.class)).b(q.j(C4253b.class)).b(q.n(C5010a.class)).b(q.a(b.class)).b(q.k(a10)).b(q.k(a11)).f(new C4950b(a10, a11)).d(), h.b(LIBRARY_NAME, "21.0.0")});
    }
}
