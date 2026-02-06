package A9;

import A9.I;
import ja.B;
import ja.C3645a;
import java.util.List;
import k9.C3717q0;
import q9.C3962B;
import q9.C3967b;
import q9.m;

final class K {

    /* renamed from: a  reason: collision with root package name */
    private final List f29510a;

    /* renamed from: b  reason: collision with root package name */
    private final C3962B[] f29511b;

    public K(List list) {
        this.f29510a = list;
        this.f29511b = new C3962B[list.size()];
    }

    public void a(long j10, B b10) {
        if (b10.a() >= 9) {
            int n10 = b10.n();
            int n11 = b10.n();
            int D10 = b10.D();
            if (n10 == 434 && n11 == 1195456820 && D10 == 3) {
                C3967b.b(j10, b10, this.f29511b);
            }
        }
    }

    public void b(m mVar, I.d dVar) {
        boolean z10;
        for (int i10 = 0; i10 < this.f29511b.length; i10++) {
            dVar.a();
            C3962B d10 = mVar.d(dVar.c(), 3);
            C3717q0 q0Var = (C3717q0) this.f29510a.get(i10);
            String str = q0Var.f45770l;
            if ("application/cea-608".equals(str) || "application/cea-708".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.b(z10, "Invalid closed caption mime type provided: " + str);
            d10.c(new C3717q0.b().S(dVar.b()).e0(str).g0(q0Var.f45762d).V(q0Var.f45761c).F(q0Var.f45756D).T(q0Var.f45772n).E());
            this.f29511b[i10] = d10;
        }
    }
}
