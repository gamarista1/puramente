package P;

import H0.C1197s;
import H0.C1198t;
import q0.C2421g;
import q0.C2423i;
import q0.C2424j;

public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    private static final C2423i f4755a = new C2423i(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean a(C2423i iVar, long j10) {
        float i10 = iVar.i();
        float j11 = iVar.j();
        float m10 = C2421g.m(j10);
        if (i10 <= m10 && m10 <= j11) {
            float l10 = iVar.l();
            float e10 = iVar.e();
            float n10 = C2421g.n(j10);
            if (l10 > n10 || n10 > e10) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final C2423i b(C1197s sVar) {
        C2423i c10 = C1198t.c(sVar);
        return C2424j.a(sVar.L(c10.m()), sVar.L(c10.f()));
    }
}
