package com.google.firebase.messaging;

import Cc.h;
import Cc.i;
import Eb.C4282c;
import Eb.C4283d;
import Eb.E;
import Eb.q;
import Wb.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import dc.C4945d;
import gc.j;
import hc.C5010a;
import java.util.Arrays;
import java.util.List;
import jc.C5046e;
import ub.C5230g;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(E e10, C4283d dVar) {
        return new FirebaseMessaging((C5230g) dVar.get(C5230g.class), (C5010a) dVar.get(C5010a.class), dVar.e(i.class), dVar.e(j.class), (C5046e) dVar.get(C5046e.class), dVar.f(e10), (C4945d) dVar.get(C4945d.class));
    }

    @Keep
    public List<C4282c> getComponents() {
        E a10 = E.a(b.class, W8.i.class);
        return Arrays.asList(new C4282c[]{C4282c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(q.l(C5230g.class)).b(q.h(C5010a.class)).b(q.j(i.class)).b(q.j(j.class)).b(q.l(C5046e.class)).b(q.i(a10)).b(q.l(C4945d.class)).f(new F(a10)).c().d(), h.b(LIBRARY_NAME, "24.1.1")});
    }
}
