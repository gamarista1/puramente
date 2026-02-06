package com.swmansion.gesturehandler.react;

import kotlin.jvm.internal.C6496s;
import vd.C5256B;
import vd.C5258b;
import vd.C5260d;
import vd.m;
import vd.o;
import vd.p;
import vd.q;
import vd.t;
import vd.u;
import vd.x;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f59582a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final C5260d.c[] f59583b = {new q.d(), new C5256B.b(), new o.b(), new t.b(), new u.a(), new x.b(), new C5258b.C0913b(), new p.a(), new m.b()};

    private e() {
    }

    public final C5260d.c a(C5260d dVar) {
        C6496s.h(dVar, "handler");
        for (C5260d.c cVar : f59583b) {
            if (C6496s.c(cVar.e(), dVar.getClass())) {
                return cVar;
            }
        }
        return null;
    }

    public final C5260d.c b(String str) {
        C6496s.h(str, "handlerName");
        for (C5260d.c cVar : f59583b) {
            if (C6496s.c(cVar.d(), str)) {
                return cVar;
            }
        }
        return null;
    }
}
