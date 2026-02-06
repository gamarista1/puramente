package F;

import E.C1139h;
import c1.n;
import c1.r;
import java.util.List;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import x.C2848L;
import yf.p;
import z.q;
import z.v;
import z.y;

/* renamed from: F.b  reason: case insensitive filesystem */
public final class C1167b implements C1139h {

    /* renamed from: a  reason: collision with root package name */
    private final E f1973a;

    public C1167b(E e10) {
        this.f1973a = e10;
    }

    private final int h(q qVar) {
        int i10;
        List k10 = qVar.k();
        int size = k10.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C1174i iVar = (C1174i) k10.get(i12);
            if (qVar.c() == q.Vertical) {
                i10 = r.f(iVar.b());
            } else {
                i10 = r.g(iVar.b());
            }
            i11 += i10;
        }
        return (i11 / k10.size()) + qVar.i();
    }

    public int a() {
        return this.f1973a.w().h();
    }

    public int b() {
        C1174i iVar = (C1174i) C6565s.B0(this.f1973a.w().k());
        if (iVar != null) {
            return iVar.getIndex();
        }
        return 0;
    }

    public float c(int i10) {
        Object obj;
        int i11;
        q w10 = this.f1973a.w();
        if (w10.k().isEmpty()) {
            return 0.0f;
        }
        List k10 = w10.k();
        int size = k10.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = k10.get(i12);
            if (((C1174i) obj).getIndex() == i10) {
                break;
            }
            i12++;
        }
        C1174i iVar = (C1174i) obj;
        if (iVar == null) {
            int h10 = h(w10);
            int u10 = this.f1973a.u();
            return (((float) h10) * ((float) ((i10 / u10) - (g() / u10)))) - ((float) f());
        }
        if (w10.c() == q.Vertical) {
            i11 = n.k(iVar.a());
        } else {
            i11 = n.j(iVar.a());
        }
        return (float) i11;
    }

    public void d(v vVar, int i10, int i11) {
        this.f1973a.O(i10, i11, true);
    }

    public Object e(p pVar, C6658d dVar) {
        Object a10 = y.a(this.f1973a, (C2848L) null, pVar, dVar, 1, (Object) null);
        if (a10 == C6680b.f()) {
            return a10;
        }
        return C6514M.f71813a;
    }

    public int f() {
        return this.f1973a.s();
    }

    public int g() {
        return this.f1973a.r();
    }
}
