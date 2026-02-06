package gg;

import Bg.C5337x;
import Fg.C5366d0;
import Fg.S;
import Fg.V;
import Hg.k;
import Hg.l;
import ig.q;
import kotlin.jvm.internal.C6496s;
import lg.C6536a;

/* renamed from: gg.p  reason: case insensitive filesystem */
public final class C5966p implements C5337x {

    /* renamed from: a  reason: collision with root package name */
    public static final C5966p f67803a = new C5966p();

    private C5966p() {
    }

    public S a(q qVar, String str, C5366d0 d0Var, C5366d0 d0Var2) {
        C6496s.h(qVar, "proto");
        C6496s.h(str, "flexibleId");
        C6496s.h(d0Var, "lowerBound");
        C6496s.h(d0Var2, "upperBound");
        if (!C6496s.c(str, "kotlin.jvm.PlatformType")) {
            return l.d(k.ERROR_FLEXIBLE_TYPE, str, d0Var.toString(), d0Var2.toString());
        }
        if (qVar.x(C6536a.f71861g)) {
            return new cg.k(d0Var, d0Var2);
        }
        return V.e(d0Var, d0Var2);
    }
}
