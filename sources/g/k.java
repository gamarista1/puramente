package G;

import A.f;
import A.h;
import Y.C1500m;
import Y.C1506p;
import androidx.compose.ui.platform.C1644k0;
import c1.d;
import c1.t;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.r;
import v.C2742y;
import w.C2797i;
import w.C2798j;
import w.C2814z;
import w.G0;
import yf.q;
import z.C2939C;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f2315a = new k();

    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C f2316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f2317b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f2318c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C c10, t tVar, float f10) {
            super(3);
            this.f2316a = c10;
            this.f2317b = tVar;
            this.f2318c = f10;
        }

        public final Float a(float f10, float f11, float f12) {
            return Float.valueOf(f.d(this.f2316a, this.f2317b, this.f2318c, f10, f11, f12));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
        }
    }

    private k() {
    }

    public final C2939C a(C c10, A a10, C2814z zVar, C2797i iVar, float f10, C1500m mVar, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if ((i11 & 2) != 0) {
            a10 = A.f2160a.a(1);
        }
        if ((i11 & 4) != 0) {
            zVar = C2742y.b(mVar, 0);
        }
        if ((i11 & 8) != 0) {
            iVar = C2798j.h(0.0f, 400.0f, Float.valueOf((float) G0.b(r.f71790a)), 1, (Object) null);
        }
        if ((i11 & 16) != 0) {
            f10 = 0.5f;
        }
        if (C1506p.H()) {
            C1506p.Q(1559769181, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:301)");
        }
        if (0.0f > f10 || f10 > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f10).toString());
        }
        d dVar = (d) mVar.m(C1644k0.e());
        t tVar = (t) mVar.m(C1644k0.k());
        if ((((i10 & 14) ^ 6) <= 4 || !mVar.S(c10)) && (i10 & 6) != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean S10 = z10 | mVar.S(zVar) | mVar.S(iVar);
        if ((((i10 & 112) ^ 48) <= 32 || !mVar.S(a10)) && (i10 & 48) != 32) {
            z11 = false;
        }
        boolean S11 = S10 | z11 | mVar.S(dVar) | mVar.S(tVar);
        Object A10 = mVar.A();
        if (S11 || A10 == C1500m.f10026a.a()) {
            A10 = h.l(f.a(c10, a10, new a(c10, tVar, f10)), zVar, iVar);
            mVar.r(A10);
        }
        C2939C c11 = (C2939C) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return c11;
    }

    public final C0.a b(C c10, z.q qVar, C1500m mVar, int i10) {
        boolean z10;
        if (C1506p.H()) {
            C1506p.Q(877583120, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:350)");
        }
        boolean z11 = false;
        if ((((i10 & 14) ^ 6) <= 4 || !mVar.S(c10)) && (i10 & 6) != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((((i10 & 112) ^ 48) > 32 && mVar.S(qVar)) || (i10 & 48) == 32) {
            z11 = true;
        }
        boolean z12 = z10 | z11;
        Object A10 = mVar.A();
        if (z12 || A10 == C1500m.f10026a.a()) {
            A10 = new C1175a(c10, qVar);
            mVar.r(A10);
        }
        C1175a aVar = (C1175a) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return aVar;
    }
}
