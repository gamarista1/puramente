package kotlin.jvm.internal;

import Ff.d;
import Ff.f;
import Ff.g;
import Ff.i;
import Ff.j;
import Ff.m;
import Ff.n;
import Ff.o;
import Ff.p;
import Ff.r;
import If.b1;
import java.util.Arrays;
import java.util.Collections;

public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    private static final P f71760a;

    /* renamed from: b  reason: collision with root package name */
    private static final d[] f71761b = new d[0];

    static {
        P p10 = null;
        try {
            p10 = b1.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (p10 == null) {
            p10 = new P();
        }
        f71760a = p10;
    }

    public static g a(C6493o oVar) {
        return f71760a.a(oVar);
    }

    public static d b(Class cls) {
        return f71760a.b(cls);
    }

    public static f c(Class cls) {
        return f71760a.c(cls, "");
    }

    public static f d(Class cls, String str) {
        return f71760a.c(cls, str);
    }

    public static i e(C6500w wVar) {
        return f71760a.d(wVar);
    }

    public static j f(y yVar) {
        return f71760a.e(yVar);
    }

    public static p g(Class cls) {
        return f71760a.k(b(cls), Collections.emptyList(), true);
    }

    public static m h(C c10) {
        return f71760a.f(c10);
    }

    public static n i(E e10) {
        return f71760a.g(e10);
    }

    public static o j(G g10) {
        return f71760a.h(g10);
    }

    public static String k(C6492n nVar) {
        return f71760a.i(nVar);
    }

    public static String l(C6498u uVar) {
        return f71760a.j(uVar);
    }

    public static p m(Class cls) {
        return f71760a.k(b(cls), Collections.emptyList(), false);
    }

    public static p n(Class cls, r rVar, r rVar2) {
        return f71760a.k(b(cls), Arrays.asList(new r[]{rVar, rVar2}), false);
    }
}
