package z;

import D0.A;
import D0.C1124o;
import c1.d;
import c1.h;
import java.util.List;
import q0.C2421g;

/* renamed from: z.a  reason: case insensitive filesystem */
final class C2943a implements t {

    /* renamed from: a  reason: collision with root package name */
    public static final C2943a f28892a = new C2943a();

    private C2943a() {
    }

    public long a(d dVar, C1124o oVar, long j10) {
        List c10 = oVar.c();
        C2421g d10 = C2421g.d(C2421g.f25320b.c());
        int size = c10.size();
        for (int i10 = 0; i10 < size; i10++) {
            d10 = C2421g.d(C2421g.r(d10.v(), ((A) c10.get(i10)).m()));
        }
        return C2421g.s(d10.v(), -dVar.t1(h.j((float) 64)));
    }
}
