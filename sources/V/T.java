package V;

import X.m;
import Y.C1500m;
import Y.C1506p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.g2;

public final class T {

    /* renamed from: a  reason: collision with root package name */
    public static final T f7048a = new T();

    /* renamed from: b  reason: collision with root package name */
    public static final int f7049b = 0;

    private T() {
    }

    public final S a(r rVar, long j10) {
        S e10 = rVar.e();
        if (e10 != null) {
            return e10;
        }
        C2544x0.a aVar = C2544x0.f25560b;
        S s10 = new S(aVar.g(), j10, aVar.g(), C2544x0.o(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        rVar.X(s10);
        return s10;
    }

    public final S b(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1857395287, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:719)");
        }
        S c10 = c(X.f7146a.a(mVar, 6));
        if (C1506p.H()) {
            C1506p.P();
        }
        return c10;
    }

    public final S c(r rVar) {
        r rVar2 = rVar;
        S d10 = rVar.d();
        if (d10 != null) {
            return d10;
        }
        m mVar = m.f9160a;
        S s10 = new S(C1404s.f(rVar2, mVar.a()), C1404s.b(rVar2, C1404s.f(rVar2, mVar.a())), C2544x0.o(C1404s.f(rVar2, mVar.f()), mVar.g(), 0.0f, 0.0f, 0.0f, 14, (Object) null), C2544x0.o(C1404s.f(rVar2, mVar.e()), mVar.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        rVar2.W(s10);
        return s10;
    }

    public final g2 d(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1265841879, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:584)");
        }
        g2 d10 = C0.d(m.f9160a.c(), mVar, 6);
        if (C1506p.H()) {
            C1506p.P();
        }
        return d10;
    }

    public final S e(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        mVar2.T(-1519621781);
        if (C1506p.H()) {
            C1506p.Q(-1519621781, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
        }
        long y10 = ((C2544x0) mVar2.m(A.a())).y();
        S a10 = a(X.f7146a.a(mVar2, 6), y10);
        if (C2544x0.q(a10.e(), y10)) {
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return a10;
        }
        S d10 = S.d(a10, 0, y10, 0, C2544x0.o(y10, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 5, (Object) null);
        if (C1506p.H()) {
            C1506p.P();
        }
        mVar.M();
        return d10;
    }

    public final S f(long j10, long j11, long j12, long j13, C1500m mVar, int i10, int i11) {
        long j14;
        long j15;
        long j16;
        long j17;
        C1500m mVar2 = mVar;
        if ((i11 & 1) != 0) {
            j14 = C2544x0.f25560b.h();
        } else {
            j14 = j10;
        }
        if ((i11 & 2) != 0) {
            j15 = ((C2544x0) mVar2.m(A.a())).y();
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
            C1506p.Q(999008085, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:622)");
        }
        r a10 = X.f7146a.a(mVar2, 6);
        long y10 = ((C2544x0) mVar2.m(A.a())).y();
        S c10 = a(a10, y10).c(j14, j15, j16, j17);
        if (C1506p.H()) {
            C1506p.P();
        }
        return c10;
    }
}
