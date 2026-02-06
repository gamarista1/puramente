package D;

import E.C1139h;
import java.util.List;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import x.C2848L;
import yf.p;
import z.v;
import z.y;

public final class e implements C1139h {

    /* renamed from: a  reason: collision with root package name */
    private final A f1232a;

    public e(A a10) {
        this.f1232a = a10;
    }

    private final int h(p pVar) {
        List k10 = pVar.k();
        int size = k10.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((k) k10.get(i11)).getSize();
        }
        return (i10 / k10.size()) + pVar.i();
    }

    public int a() {
        return this.f1232a.x().h();
    }

    public int b() {
        k kVar = (k) C6565s.B0(this.f1232a.x().k());
        if (kVar != null) {
            return kVar.getIndex();
        }
        return 0;
    }

    public float c(int i10) {
        Object obj;
        p x10 = this.f1232a.x();
        if (x10.k().isEmpty()) {
            return 0.0f;
        }
        List k10 = x10.k();
        int size = k10.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = k10.get(i11);
            if (((k) obj).getIndex() == i10) {
                break;
            }
            i11++;
        }
        k kVar = (k) obj;
        if (kVar == null) {
            return ((float) (h(x10) * (i10 - g()))) - ((float) f());
        }
        return (float) kVar.a();
    }

    public void d(v vVar, int i10, int i11) {
        this.f1232a.O(i10, i11, true);
    }

    public Object e(p pVar, C6658d dVar) {
        Object a10 = y.a(this.f1232a, (C2848L) null, pVar, dVar, 1, (Object) null);
        if (a10 == C6680b.f()) {
            return a10;
        }
        return C6514M.f71813a;
    }

    public int f() {
        return this.f1232a.t();
    }

    public int g() {
        return this.f1232a.s();
    }
}
