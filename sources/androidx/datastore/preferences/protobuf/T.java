package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.c;
import java.util.Iterator;
import java.util.Map;

final class T implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final O f16301a;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f16302b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f16303c;

    /* renamed from: d  reason: collision with root package name */
    private final C1743p f16304d;

    private T(l0 l0Var, C1743p pVar, O o10) {
        this.f16302b = l0Var;
        this.f16303c = pVar.e(o10);
        this.f16304d = pVar;
        this.f16301a = o10;
    }

    private int j(l0 l0Var, Object obj) {
        return l0Var.i(l0Var.g(obj));
    }

    private void k(l0 l0Var, C1743p pVar, Object obj, d0 d0Var, C1742o oVar) {
        Object f10 = l0Var.f(obj);
        C1745s d10 = pVar.d(obj);
        do {
            try {
                if (d0Var.E() == Integer.MAX_VALUE) {
                    l0Var.o(obj, f10);
                    return;
                }
            } finally {
                l0Var.o(obj, f10);
            }
        } while (m(d0Var, oVar, pVar, d10, l0Var, f10));
    }

    static T l(l0 l0Var, C1743p pVar, O o10) {
        return new T(l0Var, pVar, o10);
    }

    private boolean m(d0 d0Var, C1742o oVar, C1743p pVar, C1745s sVar, l0 l0Var, Object obj) {
        int m10 = d0Var.m();
        if (m10 == r0.f16447a) {
            Object obj2 = null;
            int i10 = 0;
            C1734g gVar = null;
            while (d0Var.E() != Integer.MAX_VALUE) {
                int m11 = d0Var.m();
                if (m11 == r0.f16449c) {
                    i10 = d0Var.h();
                    obj2 = pVar.b(oVar, this.f16301a, i10);
                } else if (m11 == r0.f16450d) {
                    if (obj2 != null) {
                        pVar.h(d0Var, obj2, oVar, sVar);
                    } else {
                        gVar = d0Var.p();
                    }
                } else if (!d0Var.I()) {
                    break;
                }
            }
            if (d0Var.m() == r0.f16448b) {
                if (gVar != null) {
                    if (obj2 != null) {
                        pVar.i(gVar, obj2, oVar, sVar);
                    } else {
                        l0Var.d(obj, i10, gVar);
                    }
                }
                return true;
            }
            throw C1752z.a();
        } else if (r0.b(m10) != 2) {
            return d0Var.I();
        } else {
            Object b10 = pVar.b(oVar, this.f16301a, r0.a(m10));
            if (b10 == null) {
                return l0Var.m(obj, d0Var);
            }
            pVar.h(d0Var, b10, oVar, sVar);
            return true;
        }
    }

    private void n(l0 l0Var, Object obj, s0 s0Var) {
        l0Var.s(l0Var.g(obj), s0Var);
    }

    public void a(Object obj, Object obj2) {
        g0.F(this.f16302b, obj, obj2);
        if (this.f16303c) {
            g0.D(this.f16304d, obj, obj2);
        }
    }

    public Object b() {
        return this.f16301a.c().n();
    }

    public int c(Object obj) {
        int hashCode = this.f16302b.g(obj).hashCode();
        if (this.f16303c) {
            return (hashCode * 53) + this.f16304d.c(obj).hashCode();
        }
        return hashCode;
    }

    public boolean d(Object obj, Object obj2) {
        if (!this.f16302b.g(obj).equals(this.f16302b.g(obj2))) {
            return false;
        }
        if (this.f16303c) {
            return this.f16304d.c(obj).equals(this.f16304d.c(obj2));
        }
        return true;
    }

    public void e(Object obj) {
        this.f16302b.j(obj);
        this.f16304d.f(obj);
    }

    public final boolean f(Object obj) {
        return this.f16304d.c(obj).k();
    }

    public int g(Object obj) {
        int j10 = j(this.f16302b, obj);
        if (this.f16303c) {
            return j10 + this.f16304d.c(obj).f();
        }
        return j10;
    }

    public void h(Object obj, d0 d0Var, C1742o oVar) {
        k(this.f16302b, this.f16304d, obj, d0Var, oVar);
    }

    public void i(Object obj, s0 s0Var) {
        Iterator n10 = this.f16304d.c(obj).n();
        if (!n10.hasNext()) {
            n(this.f16302b, obj, s0Var);
        } else {
            c.a(((Map.Entry) n10.next()).getKey());
            throw null;
        }
    }
}
