package com.google.firebase.abt.component;

import Cc.h;
import Eb.C4282c;
import Eb.C4283d;
import Eb.q;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import wb.C5262a;
import xb.C5276a;

@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(C4283d dVar) {
        return new a((Context) dVar.get(Context.class), dVar.e(C5276a.class));
    }

    public List<C4282c> getComponents() {
        return Arrays.asList(new C4282c[]{C4282c.e(a.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.j(C5276a.class)).f(new C5262a()).d(), h.b(LIBRARY_NAME, "21.1.1")});
    }
}
