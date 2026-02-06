package Y;

import Ug.A0;
import Ug.C5600w0;
import Ug.C5605z;
import Ug.K;
import Ug.L;
import java.util.Arrays;
import qf.g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class P {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final M f9890a = new M();

    public static final void a(Object obj, Object obj2, Object obj3, C6798l lVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1239538271, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        boolean S10 = mVar.S(obj) | mVar.S(obj2) | mVar.S(obj3);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = new K(lVar);
            mVar.r(A10);
        }
        K k10 = (K) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
    }

    public static final void b(Object obj, Object obj2, C6798l lVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        boolean S10 = mVar.S(obj) | mVar.S(obj2);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = new K(lVar);
            mVar.r(A10);
        }
        K k10 = (K) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
    }

    public static final void c(Object obj, C6798l lVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean S10 = mVar.S(obj);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = new K(lVar);
            mVar.r(A10);
        }
        K k10 = (K) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
    }

    public static final void d(Object[] objArr, C6798l lVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        boolean z10 = false;
        for (Object S10 : Arrays.copyOf(objArr, objArr.length)) {
            z10 |= mVar.S(S10);
        }
        Object A10 = mVar.A();
        if (z10 || A10 == C1500m.f10026a.a()) {
            mVar.r(new K(lVar));
        }
        if (C1506p.H()) {
            C1506p.P();
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, p pVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-54093371, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        g o10 = mVar.o();
        boolean S10 = mVar.S(obj) | mVar.S(obj2) | mVar.S(obj3);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = new C1478d0(o10, pVar);
            mVar.r(A10);
        }
        C1478d0 d0Var = (C1478d0) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
    }

    public static final void f(Object obj, Object obj2, p pVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        g o10 = mVar.o();
        boolean S10 = mVar.S(obj) | mVar.S(obj2);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = new C1478d0(o10, pVar);
            mVar.r(A10);
        }
        C1478d0 d0Var = (C1478d0) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
    }

    public static final void g(Object obj, p pVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        g o10 = mVar.o();
        boolean S10 = mVar.S(obj);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = new C1478d0(o10, pVar);
            mVar.r(A10);
        }
        C1478d0 d0Var = (C1478d0) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
    }

    public static final void h(C6787a aVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        mVar.G(aVar);
        if (C1506p.H()) {
            C1506p.P();
        }
    }

    public static final K j(g gVar, C1500m mVar) {
        C5600w0.b bVar = C5600w0.f65416O;
        if (gVar.b(bVar) != null) {
            C5605z b10 = C0.b((C5600w0) null, 1, (Object) null);
            b10.f(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return L.a(b10);
        }
        g o10 = mVar.o();
        return L.a(o10.n1(A0.a((C5600w0) o10.b(bVar))).n1(gVar));
    }
}
