package w;

import kotlin.jvm.internal.DefaultConstructorMarker;
import w.C2774S;
import yf.C6798l;

/* renamed from: w.j  reason: case insensitive filesystem */
public abstract class C2798j {
    /* access modifiers changed from: private */
    public static final C2805q b(r0 r0Var, Object obj) {
        if (obj == null) {
            return null;
        }
        return (C2805q) r0Var.a().invoke(obj);
    }

    public static final C2797i c(C2797i iVar, long j10) {
        return new h0(iVar, j10);
    }

    public static final C2769M d(C2759C c10, C2785b0 b0Var, long j10) {
        return new C2769M(c10, b0Var, j10, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C2769M e(C2759C c10, C2785b0 b0Var, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            b0Var = C2785b0.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = j0.c(0, 0, 2, (DefaultConstructorMarker) null);
        }
        return d(c10, b0Var, j10);
    }

    public static final C2774S f(C6798l lVar) {
        C2774S.b bVar = new C2774S.b();
        lVar.invoke(bVar);
        return new C2774S(bVar);
    }

    public static final C2795g0 g(float f10, float f11, Object obj) {
        return new C2795g0(f10, f11, obj);
    }

    public static /* synthetic */ C2795g0 h(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return g(f10, f11, obj);
    }

    public static final q0 i(int i10, int i11, C2760D d10) {
        return new q0(i10, i11, d10);
    }

    public static /* synthetic */ q0 j(int i10, int i11, C2760D d10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            d10 = C2762F.d();
        }
        return i(i10, i11, d10);
    }
}
