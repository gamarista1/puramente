package com.google.firebase.datatransport;

import Cc.h;
import Eb.C4282c;
import Eb.E;
import Eb.q;
import W8.i;
import Wb.a;
import Wb.b;
import Wb.c;
import Wb.d;
import Wb.e;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<C4282c> getComponents() {
        Class<i> cls = i.class;
        Class<Context> cls2 = Context.class;
        return Arrays.asList(new C4282c[]{C4282c.e(cls).h(LIBRARY_NAME).b(q.l(cls2)).f(new c()).d(), C4282c.c(E.a(a.class, cls)).b(q.l(cls2)).f(new d()).d(), C4282c.c(E.a(b.class, cls)).b(q.l(cls2)).f(new e()).d(), h.b(LIBRARY_NAME, "18.2.0")});
    }
}
