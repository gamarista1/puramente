package Y;

import i0.r;
import mf.C6559l;

abstract /* synthetic */ class u1 {
    public static final r a() {
        return new r();
    }

    public static final r b(Object... objArr) {
        r rVar = new r();
        rVar.addAll(C6559l.n1(objArr));
        return rVar;
    }

    public static final C1510r0 c(Object obj, o1 o1Var) {
        return C1471b.d(obj, o1Var);
    }

    public static /* synthetic */ C1510r0 d(Object obj, o1 o1Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            o1Var = p1.q();
        }
        return p1.h(obj, o1Var);
    }

    public static final A1 e(Object obj, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        Object A10 = mVar.A();
        if (A10 == C1500m.f10026a.a()) {
            A10 = d(obj, (o1) null, 2, (Object) null);
            mVar.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        r0Var.setValue(obj);
        if (C1506p.H()) {
            C1506p.P();
        }
        return r0Var;
    }
}
