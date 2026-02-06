package g0;

import Y.C1500m;
import Y.C1506p;
import Y.K0;
import Y.L0;
import kotlin.jvm.internal.C6496s;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f20855a = new Object();

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final C2005a b(C1500m mVar, int i10, boolean z10, Object obj) {
        b bVar;
        mVar.E(Integer.rotateLeft(i10, 1), f20855a);
        Object A10 = mVar.A();
        if (A10 == C1500m.f10026a.a()) {
            bVar = new b(i10, z10, obj);
            mVar.r(bVar);
        } else {
            C6496s.f(A10, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (b) A10;
            bVar.l(obj);
        }
        mVar.Q();
        return bVar;
    }

    public static final C2005a c(int i10, boolean z10, Object obj) {
        return new b(i10, z10, obj);
    }

    public static final int d(int i10) {
        return a(2, i10);
    }

    public static final C2005a e(int i10, boolean z10, Object obj, C1500m mVar, int i11) {
        if (C1506p.H()) {
            C1506p.Q(-1573003438, i11, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        Object A10 = mVar.A();
        if (A10 == C1500m.f10026a.a()) {
            A10 = new b(i10, z10, obj);
            mVar.r(A10);
        }
        b bVar = (b) A10;
        bVar.l(obj);
        if (C1506p.H()) {
            C1506p.P();
        }
        return bVar;
    }

    public static final boolean f(K0 k02, K0 k03) {
        if (k02 != null) {
            if ((k02 instanceof L0) && (k03 instanceof L0)) {
                L0 l02 = (L0) k02;
                if (!l02.r() || C6496s.c(k02, k03) || C6496s.c(l02.i(), ((L0) k03).i())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final int g(int i10) {
        return a(1, i10);
    }
}
