package U;

import B.b;
import B.d;
import B.g;
import B.i;
import B.j;
import J0.C1244j;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.p1;
import c1.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2443E0;
import r0.C2544x0;
import w.C2762F;
import w.C2797i;
import w.q0;
import x.C2843G;
import yf.C6787a;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private static final q0 f6277a = new q0(15, 0, C2762F.e(), 2, (DefaultConstructorMarker) null);

    public static final C1244j c(j jVar, boolean z10, float f10, C2443E0 e02, C6787a aVar) {
        return t.d(jVar, z10, f10, e02, aVar);
    }

    /* access modifiers changed from: private */
    public static final C2797i d(i iVar) {
        if (iVar instanceof g) {
            return f6277a;
        }
        if (iVar instanceof d) {
            return new q0(45, 0, C2762F.e(), 2, (DefaultConstructorMarker) null);
        }
        if (iVar instanceof b) {
            return new q0(45, 0, C2762F.e(), 2, (DefaultConstructorMarker) null);
        }
        return f6277a;
    }

    /* access modifiers changed from: private */
    public static final C2797i e(i iVar) {
        if (iVar instanceof g) {
            return f6277a;
        }
        if (iVar instanceof d) {
            return f6277a;
        }
        if (iVar instanceof b) {
            return new q0(150, 0, C2762F.e(), 2, (DefaultConstructorMarker) null);
        }
        return f6277a;
    }

    public static final C2843G f(boolean z10, float f10, long j10, C1500m mVar, int i10, int i11) {
        boolean z11;
        boolean z12 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = h.f19213b.c();
        }
        if ((i11 & 4) != 0) {
            j10 = C2544x0.f25560b.h();
        }
        if (C1506p.H()) {
            C1506p.Q(1635163520, i10, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)");
        }
        A1 o10 = p1.o(C2544x0.k(j10), mVar, (i10 >> 6) & 14);
        if ((((i10 & 14) ^ 6) <= 4 || !mVar.b(z10)) && (i10 & 6) != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((((i10 & 112) ^ 48) <= 32 || !mVar.c(f10)) && (i10 & 48) != 32) {
            z12 = false;
        }
        boolean z13 = z11 | z12;
        Object A10 = mVar.A();
        if (z13 || A10 == C1500m.f10026a.a()) {
            A10 = new e(z10, f10, o10, (DefaultConstructorMarker) null);
            mVar.r(A10);
        }
        e eVar = (e) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return eVar;
    }
}
