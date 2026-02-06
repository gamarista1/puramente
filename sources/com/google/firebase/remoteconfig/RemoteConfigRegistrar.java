package com.google.firebase.remoteconfig;

import Cc.h;
import Dc.x;
import Eb.C4282c;
import Eb.C4283d;
import Eb.E;
import Eb.q;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import jc.C5046e;
import ub.C5230g;
import xb.C5276a;
import yb.b;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* access modifiers changed from: private */
    public static /* synthetic */ c lambda$getComponents$0(E e10, C4283d dVar) {
        return new c((Context) dVar.get(Context.class), (ScheduledExecutorService) dVar.d(e10), (C5230g) dVar.get(C5230g.class), (C5046e) dVar.get(C5046e.class), ((a) dVar.get(a.class)).b("frc"), dVar.e(C5276a.class));
    }

    public List<C4282c> getComponents() {
        E a10 = E.a(b.class, ScheduledExecutorService.class);
        return Arrays.asList(new C4282c[]{C4282c.f(c.class, Fc.a.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.k(a10)).b(q.l(C5230g.class)).b(q.l(C5046e.class)).b(q.l(a.class)).b(q.j(C5276a.class)).f(new x(a10)).e().d(), h.b(LIBRARY_NAME, "22.0.0")});
    }
}
