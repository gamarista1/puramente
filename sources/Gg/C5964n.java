package gg;

import Bg.C5323i;
import Bg.C5328n;
import Bg.C5338y;
import Dg.M;
import Dg.r;
import Of.C5487e;
import Of.N;
import Pg.c;
import hg.C5996a;
import ig.l;
import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.Y;
import mg.C6577e;
import mg.C6578f;
import mg.C6581i;
import pg.C6649k;
import yg.C6812k;

/* renamed from: gg.n  reason: case insensitive filesystem */
public final class C5964n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f67794b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final Set f67795c = Y.d(C5996a.C1007a.CLASS);

    /* renamed from: d  reason: collision with root package name */
    private static final Set f67796d = Y.j(C5996a.C1007a.FILE_FACADE, C5996a.C1007a.MULTIFILE_CLASS_PART);

    /* renamed from: e  reason: collision with root package name */
    private static final C6577e f67797e = new C6577e(1, 1, 2);

    /* renamed from: f  reason: collision with root package name */
    private static final C6577e f67798f = new C6577e(1, 1, 11);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C6577e f67799g = new C6577e(1, 1, 13);

    /* renamed from: a  reason: collision with root package name */
    public C5328n f67800a;

    /* renamed from: gg.n$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6577e a() {
            return C5964n.f67799g;
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final Collection d() {
        return C6565s.n();
    }

    private final r e(C5974x xVar) {
        if (f().g().e()) {
            return r.STABLE;
        }
        if (xVar.e().j()) {
            return r.UNSTABLE;
        }
        return r.STABLE;
    }

    private final C5338y g(C5974x xVar) {
        if (i() || xVar.e().d().h(h())) {
            return null;
        }
        return new C5338y(xVar.e().d(), C6577e.f72097i, h(), h().k(xVar.e().d().j()), xVar.a(), xVar.d());
    }

    private final C6577e h() {
        return c.a(f().g());
    }

    private final boolean i() {
        return f().g().f();
    }

    private final boolean j(C5974x xVar) {
        if (f().g().b() || !xVar.e().i() || !C6496s.c(xVar.e().d(), f67798f)) {
            return false;
        }
        return true;
    }

    private final boolean k(C5974x xVar) {
        if ((!f().g().g() || (!xVar.e().i() && !C6496s.c(xVar.e().d(), f67797e))) && !j(xVar)) {
            return false;
        }
        return true;
    }

    private final String[] m(C5974x xVar, Set set) {
        C5996a e10 = xVar.e();
        String[] a10 = e10.a();
        if (a10 == null) {
            a10 = e10.b();
        }
        if (a10 == null || !set.contains(e10.c())) {
            return null;
        }
        return a10;
    }

    public final C6812k c(N n10, C5974x xVar) {
        String[] g10;
        Pair pair;
        C6496s.h(n10, "descriptor");
        C6496s.h(xVar, "kotlinClass");
        String[] m10 = m(xVar, f67796d);
        if (m10 == null || (g10 = xVar.e().g()) == null) {
            return null;
        }
        try {
            pair = C6581i.m(m10, g10);
        } catch (C6649k e10) {
            throw new IllegalStateException("Could not read data from " + xVar.a(), e10);
        } catch (Throwable th2) {
            if (i() || xVar.e().d().h(h())) {
                throw th2;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        l lVar = (l) pair.b();
        C6578f fVar = (C6578f) pair.a();
        C5968r rVar = new C5968r(xVar, lVar, fVar, g(xVar), k(xVar), e(xVar));
        return new M(n10, lVar, fVar, xVar.e().d(), rVar, f(), "scope for " + rVar + " in " + n10, C5963m.f67793a);
    }

    public final C5328n f() {
        C5328n nVar = this.f67800a;
        if (nVar != null) {
            return nVar;
        }
        C6496s.v("components");
        return null;
    }

    public final C5323i l(C5974x xVar) {
        String[] g10;
        Pair pair;
        C6496s.h(xVar, "kotlinClass");
        String[] m10 = m(xVar, f67795c);
        if (m10 == null || (g10 = xVar.e().g()) == null) {
            return null;
        }
        try {
            pair = C6581i.i(m10, g10);
        } catch (C6649k e10) {
            throw new IllegalStateException("Could not read data from " + xVar.a(), e10);
        } catch (Throwable th2) {
            if (i() || xVar.e().d().h(h())) {
                throw th2;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new C5323i((C6578f) pair.a(), (ig.c) pair.b(), xVar.e().d(), new C5976z(xVar, g(xVar), k(xVar), e(xVar)));
    }

    public final C5487e n(C5974x xVar) {
        C6496s.h(xVar, "kotlinClass");
        C5323i l10 = l(xVar);
        if (l10 == null) {
            return null;
        }
        return f().f().e(xVar.d(), l10);
    }

    public final void o(C5328n nVar) {
        C6496s.h(nVar, "<set-?>");
        this.f67800a = nVar;
    }

    public final void p(C5961k kVar) {
        C6496s.h(kVar, "components");
        o(kVar.a());
    }
}
