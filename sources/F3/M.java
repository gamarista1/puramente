package f3;

import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import java.util.List;
import z2.C2962f;
import z2.O;
import z2.r;

final class M {

    /* renamed from: a  reason: collision with root package name */
    private final List f20484a;

    /* renamed from: b  reason: collision with root package name */
    private final O[] f20485b;

    public M(List list) {
        this.f20484a = list;
        this.f20485b = new O[list.size()];
    }

    public void a(long j10, C2073A a10) {
        if (a10.a() >= 9) {
            int q10 = a10.q();
            int q11 = a10.q();
            int H10 = a10.H();
            if (q10 == 434 && q11 == 1195456820 && H10 == 3) {
                C2962f.b(j10, a10, this.f20485b);
            }
        }
    }

    public void b(r rVar, K.d dVar) {
        boolean z10;
        for (int i10 = 0; i10 < this.f20485b.length; i10++) {
            dVar.a();
            O d10 = rVar.d(dVar.c(), 3);
            s sVar = (s) this.f20484a.get(i10);
            String str = sVar.f20083n;
            if ("application/cea-608".equals(str) || "application/cea-708".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.b(z10, "Invalid closed caption MIME type provided: " + str);
            d10.c(new s.b().a0(dVar.b()).o0(str).q0(sVar.f20074e).e0(sVar.f20073d).L(sVar.f20064G).b0(sVar.f20086q).K());
            this.f20485b[i10] = d10;
        }
    }
}
