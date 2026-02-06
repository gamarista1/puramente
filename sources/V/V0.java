package V;

import C.f0;
import C.h0;
import C.k0;
import W.x;
import X.C;
import X.D;
import X.E;
import Y.C1500m;
import Y.C1506p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

public final class V0 {

    /* renamed from: a  reason: collision with root package name */
    public static final V0 f7135a = new V0();

    /* renamed from: b  reason: collision with root package name */
    private static final float f7136b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f7137c;

    /* renamed from: d  reason: collision with root package name */
    private static final float f7138d = D.f8744a.a();

    /* renamed from: e  reason: collision with root package name */
    private static final float f7139e;

    /* renamed from: f  reason: collision with root package name */
    private static final float f7140f = C.f8732a.a();

    /* renamed from: g  reason: collision with root package name */
    public static final int f7141g = 0;

    static {
        E e10 = E.f8756a;
        f7136b = e10.b();
        f7137c = e10.b();
        f7139e = e10.b();
    }

    private V0() {
    }

    public final U0 a(r rVar) {
        U0 k10 = rVar.k();
        if (k10 != null) {
            return k10;
        }
        E e10 = E.f8756a;
        U0 u02 = new U0(C1404s.f(rVar, e10.a()), C1404s.f(rVar, e10.f()), C1404s.f(rVar, e10.e()), C1404s.f(rVar, e10.c()), C1404s.f(rVar, e10.g()), (DefaultConstructorMarker) null);
        rVar.d0(u02);
        return u02;
    }

    public final float b() {
        return f7136b;
    }

    public final f0 c(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(2143182847, i10, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1025)");
        }
        f0 a10 = x.a(f0.f925a, mVar, 6);
        k0.a aVar = k0.f979a;
        f0 g10 = h0.g(a10, k0.l(aVar.f(), aVar.g()));
        if (C1506p.H()) {
            C1506p.P();
        }
        return g10;
    }

    public final U0 d(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1388520854, i10, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:977)");
        }
        U0 a10 = a(X.f7146a.a(mVar, 6));
        if (C1506p.H()) {
            C1506p.P();
        }
        return a10;
    }

    public final U0 e(long j10, long j11, long j12, long j13, long j14, C1500m mVar, int i10, int i11) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        if ((i11 & 1) != 0) {
            j15 = C2544x0.f25560b.h();
        } else {
            j15 = j10;
        }
        if ((i11 & 2) != 0) {
            j16 = C2544x0.f25560b.h();
        } else {
            j16 = j11;
        }
        if ((i11 & 4) != 0) {
            j17 = C2544x0.f25560b.h();
        } else {
            j17 = j12;
        }
        if ((i11 & 8) != 0) {
            j18 = C2544x0.f25560b.h();
        } else {
            j18 = j13;
        }
        if ((i11 & 16) != 0) {
            j19 = C2544x0.f25560b.h();
        } else {
            j19 = j14;
        }
        if (C1506p.H()) {
            C1506p.Q(2142919275, i10, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:998)");
        }
        U0 b10 = a(X.f7146a.a(mVar, 6)).b(j15, j16, j17, j18, j19);
        if (C1506p.H()) {
            C1506p.P();
        }
        return b10;
    }
}
