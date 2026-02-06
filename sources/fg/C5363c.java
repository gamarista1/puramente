package Fg;

import Fg.u0;
import Jg.d;
import Jg.i;
import Jg.j;
import Jg.m;
import Jg.o;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

/* renamed from: Fg.c  reason: case insensitive filesystem */
public final class C5363c {

    /* renamed from: a  reason: collision with root package name */
    public static final C5363c f62993a = new C5363c();

    private C5363c() {
    }

    private final boolean c(u0 u0Var, j jVar, m mVar) {
        o j10 = u0Var.j();
        if (j10.y0(jVar)) {
            return true;
        }
        if (j10.i(jVar)) {
            return false;
        }
        if (!u0Var.n() || !j10.t(jVar)) {
            return j10.F(j10.b(jVar), mVar);
        }
        return true;
    }

    private final boolean e(u0 u0Var, j jVar, j jVar2) {
        o j10 = u0Var.j();
        if (C5371g.f63010b) {
            if (!j10.g(jVar) && !j10.p0(j10.b(jVar))) {
                boolean l10 = u0Var.l(jVar);
            }
            if (!j10.g(jVar2)) {
                boolean l11 = u0Var.l(jVar2);
            }
        }
        if (j10.i(jVar2) || j10.S(jVar) || j10.z0(jVar)) {
            return true;
        }
        if ((jVar instanceof d) && j10.p((d) jVar)) {
            return true;
        }
        C5363c cVar = f62993a;
        if (cVar.a(u0Var, jVar, u0.c.b.f63070a)) {
            return true;
        }
        if (!j10.S(jVar2) && !cVar.a(u0Var, jVar2, u0.c.d.f63072a) && !j10.k0(jVar)) {
            return cVar.b(u0Var, jVar, j10.b(jVar2));
        }
        return false;
    }

    public final boolean a(u0 u0Var, j jVar, u0.c cVar) {
        u0.c cVar2;
        u0 u0Var2 = u0Var;
        j jVar2 = jVar;
        C6496s.h(u0Var2, "<this>");
        C6496s.h(jVar2, "type");
        u0.c cVar3 = cVar;
        C6496s.h(cVar3, "supertypesPolicy");
        o j10 = u0Var.j();
        if ((j10.k0(jVar2) && !j10.i(jVar2)) || j10.S(jVar2)) {
            return true;
        }
        u0Var.k();
        ArrayDeque h10 = u0Var.h();
        C6496s.e(h10);
        Set i10 = u0Var.i();
        C6496s.e(i10);
        h10.push(jVar2);
        while (!h10.isEmpty()) {
            if (i10.size() <= 1000) {
                j jVar3 = (j) h10.pop();
                C6496s.e(jVar3);
                if (i10.add(jVar3)) {
                    if (j10.i(jVar3)) {
                        cVar2 = u0.c.C0933c.f63071a;
                    } else {
                        cVar2 = cVar3;
                    }
                    if (C6496s.c(cVar2, u0.c.C0933c.f63071a)) {
                        cVar2 = null;
                    }
                    if (cVar2 == null) {
                        continue;
                    } else {
                        o j11 = u0Var.j();
                        for (i a10 : j11.w0(j11.b(jVar3))) {
                            j a11 = cVar2.a(u0Var2, a10);
                            if ((!j10.k0(a11) || j10.i(a11)) && !j10.S(a11)) {
                                h10.add(a11);
                            } else {
                                u0Var.e();
                                return true;
                            }
                        }
                        continue;
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + jVar2 + ". Supertypes = " + C6565s.x0(i10, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null)).toString());
            }
        }
        u0Var.e();
        return false;
    }

    public final boolean b(u0 u0Var, j jVar, m mVar) {
        u0.c cVar;
        u0 u0Var2 = u0Var;
        j jVar2 = jVar;
        m mVar2 = mVar;
        C6496s.h(u0Var2, "state");
        C6496s.h(jVar2, OpsMetricTracker.START);
        C6496s.h(mVar2, "end");
        o j10 = u0Var.j();
        if (f62993a.c(u0Var2, jVar2, mVar2)) {
            return true;
        }
        u0Var.k();
        ArrayDeque h10 = u0Var.h();
        C6496s.e(h10);
        Set i10 = u0Var.i();
        C6496s.e(i10);
        h10.push(jVar2);
        while (!h10.isEmpty()) {
            if (i10.size() <= 1000) {
                j jVar3 = (j) h10.pop();
                C6496s.e(jVar3);
                if (i10.add(jVar3)) {
                    if (j10.i(jVar3)) {
                        cVar = u0.c.C0933c.f63071a;
                    } else {
                        cVar = u0.c.b.f63070a;
                    }
                    if (C6496s.c(cVar, u0.c.C0933c.f63071a)) {
                        cVar = null;
                    }
                    if (cVar == null) {
                        continue;
                    } else {
                        o j11 = u0Var.j();
                        for (i a10 : j11.w0(j11.b(jVar3))) {
                            j a11 = cVar.a(u0Var2, a10);
                            if (f62993a.c(u0Var2, a11, mVar2)) {
                                u0Var.e();
                                return true;
                            }
                            h10.add(a11);
                        }
                        continue;
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + jVar2 + ". Supertypes = " + C6565s.x0(i10, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null)).toString());
            }
        }
        u0Var.e();
        return false;
    }

    public final boolean d(u0 u0Var, j jVar, j jVar2) {
        C6496s.h(u0Var, "state");
        C6496s.h(jVar, "subType");
        C6496s.h(jVar2, "superType");
        return e(u0Var, jVar, jVar2);
    }
}
