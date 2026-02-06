package androidx.compose.ui.platform;

import lf.C6535s;
import q0.C2415a;
import q0.C2423i;
import q0.C2425k;
import r0.C2472Y;
import r0.O1;
import r0.S1;
import r0.W1;

/* renamed from: androidx.compose.ui.platform.l1  reason: case insensitive filesystem */
public abstract class C1648l1 {
    private static final boolean a(C2425k kVar) {
        if (C2415a.d(kVar.h()) + C2415a.d(kVar.i()) > kVar.j() || C2415a.d(kVar.b()) + C2415a.d(kVar.c()) > kVar.j() || C2415a.e(kVar.h()) + C2415a.e(kVar.b()) > kVar.d() || C2415a.e(kVar.i()) + C2415a.e(kVar.c()) > kVar.d()) {
            return false;
        }
        return true;
    }

    public static final boolean b(O1 o12, float f10, float f11, S1 s12, S1 s13) {
        if (o12 instanceof O1.b) {
            return e(((O1.b) o12).b(), f10, f11);
        }
        if (o12 instanceof O1.c) {
            return f((O1.c) o12, f10, f11, s12, s13);
        }
        if (o12 instanceof O1.a) {
            return d(((O1.a) o12).b(), f10, f11, s12, s13);
        }
        throw new C6535s();
    }

    public static /* synthetic */ boolean c(O1 o12, float f10, float f11, S1 s12, S1 s13, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            s12 = null;
        }
        if ((i10 & 16) != 0) {
            s13 = null;
        }
        return b(o12, f10, f11, s12, s13);
    }

    private static final boolean d(S1 s12, float f10, float f11, S1 s13, S1 s14) {
        C2423i iVar = new C2423i(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (s13 == null) {
            s13 = C2472Y.a();
        }
        S1.h(s13, iVar, (S1.b) null, 2, (Object) null);
        if (s14 == null) {
            s14 = C2472Y.a();
        }
        s14.l(s12, s13, W1.f25474a.b());
        boolean isEmpty = s14.isEmpty();
        s14.reset();
        s13.reset();
        return !isEmpty;
    }

    private static final boolean e(C2423i iVar, float f10, float f11) {
        if (iVar.i() > f10 || f10 >= iVar.j() || iVar.l() > f11 || f11 >= iVar.e()) {
            return false;
        }
        return true;
    }

    private static final boolean f(O1.c cVar, float f10, float f11, S1 s12, S1 s13) {
        S1 s14;
        float f12 = f10;
        float f13 = f11;
        S1 s15 = s13;
        C2425k b10 = cVar.b();
        if (f12 < b10.e() || f12 >= b10.f() || f13 < b10.g() || f13 >= b10.a()) {
            return false;
        }
        if (!a(b10)) {
            if (s15 == null) {
                s14 = C2472Y.a();
            } else {
                s14 = s15;
            }
            S1.a(s14, b10, (S1.b) null, 2, (Object) null);
            return d(s14, f10, f11, s12, s15);
        }
        float d10 = C2415a.d(b10.h()) + b10.e();
        float e10 = C2415a.e(b10.h()) + b10.g();
        float f14 = b10.f() - C2415a.d(b10.i());
        float e11 = C2415a.e(b10.i()) + b10.g();
        float f15 = b10.f() - C2415a.d(b10.c());
        float a10 = b10.a() - C2415a.e(b10.c());
        float a11 = b10.a() - C2415a.e(b10.b());
        float d11 = C2415a.d(b10.b()) + b10.e();
        if (f12 < d10 && f13 < e10) {
            return g(f10, f11, b10.h(), d10, e10);
        } else if (f12 < d11 && f13 > a11) {
            return g(f10, f11, b10.b(), d11, a11);
        } else if (f12 > f14 && f13 < e11) {
            return g(f10, f11, b10.i(), f14, e11);
        } else if (f12 <= f15 || f13 <= a10) {
            return true;
        } else {
            return g(f10, f11, b10.c(), f15, a10);
        }
    }

    private static final boolean g(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float d10 = C2415a.d(j10);
        float e10 = C2415a.e(j10);
        if (((f14 * f14) / (d10 * d10)) + ((f15 * f15) / (e10 * e10)) <= 1.0f) {
            return true;
        }
        return false;
    }
}
