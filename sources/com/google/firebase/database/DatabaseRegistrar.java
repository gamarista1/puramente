package com.google.firebase.database;

import Cb.b;
import Cc.h;
import Db.C4253b;
import Eb.C4282c;
import Eb.C4283d;
import Eb.q;
import Gb.d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import ub.C5230g;

@Keep
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* access modifiers changed from: private */
    public static /* synthetic */ d lambda$getComponents$0(C4283d dVar) {
        return new d((C5230g) dVar.get(C5230g.class), dVar.h(C4253b.class), dVar.h(b.class));
    }

    public List<C4282c> getComponents() {
        return Arrays.asList(new C4282c[]{C4282c.e(d.class).h(LIBRARY_NAME).b(q.l(C5230g.class)).b(q.a(C4253b.class)).b(q.a(b.class)).f(new d()).d(), h.b(LIBRARY_NAME, "21.0.0")});
    }
}
