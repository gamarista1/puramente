package V;

import X.l;
import Y.C1500m;
import Y.C1506p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.C2550z0;
import r0.g2;

/* renamed from: V.o  reason: case insensitive filesystem */
public final class C1397o {

    /* renamed from: a  reason: collision with root package name */
    public static final C1397o f7854a = new C1397o();

    /* renamed from: b  reason: collision with root package name */
    public static final int f7855b = 0;

    private C1397o() {
    }

    public final C1395n a(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1876034303, i10, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)");
        }
        C1395n d10 = d(X.f7146a.a(mVar, 6));
        if (C1506p.H()) {
            C1506p.P();
        }
        return d10;
    }

    public final C1395n b(long j10, long j11, long j12, long j13, C1500m mVar, int i10, int i11) {
        long j14;
        long j15;
        long j16;
        long j17;
        C1500m mVar2 = mVar;
        int i12 = i10;
        if ((i11 & 1) != 0) {
            j14 = C2544x0.f25560b.h();
        } else {
            j14 = j10;
        }
        if ((i11 & 2) != 0) {
            j15 = C1404s.c(j14, mVar2, i12 & 14);
        } else {
            j15 = j11;
        }
        if ((i11 & 4) != 0) {
            j16 = C2544x0.f25560b.h();
        } else {
            j16 = j12;
        }
        if ((i11 & 8) != 0) {
            j17 = C2544x0.o(j15, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j17 = j13;
        }
        if (C1506p.H()) {
            C1506p.Q(-1589582123, i12, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:494)");
        }
        C1395n c10 = d(X.f7146a.a(mVar2, 6)).c(j14, j15, j16, j17);
        if (C1506p.H()) {
            C1506p.P();
        }
        return c10;
    }

    public final C1399p c(float f10, float f11, float f12, float f13, float f14, float f15, C1500m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = l.f9146a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = l.f9146a.j();
        }
        float f16 = f11;
        if ((i11 & 4) != 0) {
            f12 = l.f9146a.h();
        }
        float f17 = f12;
        if ((i11 & 8) != 0) {
            f13 = l.f9146a.i();
        }
        float f18 = f13;
        if ((i11 & 16) != 0) {
            f14 = l.f9146a.g();
        }
        float f19 = f14;
        if ((i11 & 32) != 0) {
            f15 = l.f9146a.e();
        }
        float f20 = f15;
        if (C1506p.H()) {
            C1506p.Q(-574898487, i10, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)");
        }
        C1399p pVar = new C1399p(f10, f16, f17, f18, f19, f20, (DefaultConstructorMarker) null);
        if (C1506p.H()) {
            C1506p.P();
        }
        return pVar;
    }

    public final C1395n d(r rVar) {
        r rVar2 = rVar;
        C1395n c10 = rVar.c();
        if (c10 != null) {
            return c10;
        }
        l lVar = l.f9146a;
        C1395n nVar = new C1395n(C1404s.f(rVar2, lVar.a()), C1404s.b(rVar2, C1404s.f(rVar2, lVar.a())), C2550z0.h(C2544x0.o(C1404s.f(rVar2, lVar.d()), lVar.f(), 0.0f, 0.0f, 0.0f, 14, (Object) null), C1404s.f(rVar2, lVar.a())), C2544x0.o(C1404s.b(rVar2, C1404s.f(rVar2, lVar.a())), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        rVar2.V(nVar);
        return nVar;
    }

    public final g2 e(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1266660211, i10, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)");
        }
        g2 d10 = C0.d(l.f9146a.c(), mVar, 6);
        if (C1506p.H()) {
            C1506p.P();
        }
        return d10;
    }
}
