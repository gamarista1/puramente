package q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q0.l  reason: case insensitive filesystem */
public abstract class C2426l {
    public static final C2425k a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long a10 = C2416b.a(f14, f15);
        return new C2425k(f10, f11, f12, f13, a10, a10, a10, a10, (DefaultConstructorMarker) null);
    }

    public static final C2425k b(C2423i iVar, long j10, long j11, long j12, long j13) {
        return new C2425k(iVar.i(), iVar.l(), iVar.j(), iVar.e(), j10, j11, j12, j13, (DefaultConstructorMarker) null);
    }

    public static final C2425k c(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, C2415a.d(j10), C2415a.e(j10));
    }

    public static final C2423i d(C2425k kVar) {
        return new C2423i(kVar.e(), kVar.g(), kVar.f(), kVar.a());
    }

    public static final boolean e(C2425k kVar) {
        if (C2415a.d(kVar.h()) == C2415a.e(kVar.h()) && C2415a.d(kVar.h()) == C2415a.d(kVar.i()) && C2415a.d(kVar.h()) == C2415a.e(kVar.i()) && C2415a.d(kVar.h()) == C2415a.d(kVar.c()) && C2415a.d(kVar.h()) == C2415a.e(kVar.c()) && C2415a.d(kVar.h()) == C2415a.d(kVar.b()) && C2415a.d(kVar.h()) == C2415a.e(kVar.b())) {
            return true;
        }
        return false;
    }
}
