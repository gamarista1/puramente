package C;

import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;
import yf.p;

public abstract class a0 {
    public static final void a(i iVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-72882467, i10, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        b0 b0Var = b0.f880a;
        int a10 = C1494j.a(mVar, 0);
        i e10 = h.e(mVar, iVar);
        C1523y p10 = mVar.p();
        C1241g.a aVar = C1241g.f3853J;
        C6787a a11 = aVar.a();
        if (mVar.j() == null) {
            C1494j.c();
        }
        mVar.F();
        if (mVar.f()) {
            mVar.U(a11);
        } else {
            mVar.q();
        }
        C1500m a12 = F1.a(mVar);
        F1.b(a12, b0Var, aVar.c());
        F1.b(a12, p10, aVar.e());
        F1.b(a12, e10, aVar.d());
        p b10 = aVar.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b10);
        }
        mVar.u();
        if (C1506p.H()) {
            C1506p.P();
        }
    }
}
