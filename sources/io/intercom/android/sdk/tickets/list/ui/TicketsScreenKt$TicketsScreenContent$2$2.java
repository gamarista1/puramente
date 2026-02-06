package io.intercom.android.sdk.tickets.list.ui;

import B.l;
import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.N;
import D.c;
import H0.F;
import J0.C1241g;
import Q0.T;
import V.C1387j;
import V.C1391l;
import V.C1393m;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.m5.components.ErrorState;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketsScreenKt$TicketsScreenContent$2$2 implements q {
    final /* synthetic */ ErrorState $errorState;

    TicketsScreenKt$TicketsScreenContent$2$2(ErrorState errorState) {
        this.$errorState = errorState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((c) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(cVar, "$this$item");
        if ((i10 & 81) != 16 || !mVar.i()) {
            i.a aVar = i.f23074a;
            i h10 = androidx.compose.foundation.layout.q.h(n.k(aVar, 0.0f, h.j((float) 16), 1, (Object) null), 0.0f, 1, (Object) null);
            c.a aVar2 = k0.c.f23044a;
            k0.c e10 = aVar2.e();
            ErrorState errorState = this.$errorState;
            F h11 = d.h(e10, false);
            int a10 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e11 = k0.h.e(mVar2, h10);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a11 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a11);
            } else {
                mVar.q();
            }
            C1500m a12 = F1.a(mVar);
            F1.b(a12, h11, aVar3.c());
            F1.b(a12, p10, aVar3.e());
            p b10 = aVar3.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e11, aVar3.d());
            f fVar = f.f12848a;
            F a13 = C1090h.a(C1085c.f882a.g(), aVar2.g(), mVar2, 48);
            int a14 = C1494j.a(mVar2, 0);
            C1523y p11 = mVar.p();
            i e12 = k0.h.e(mVar2, aVar);
            C6787a a15 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a15);
            } else {
                mVar.q();
            }
            C1500m a16 = F1.a(mVar);
            F1.b(a16, a13, aVar3.c());
            F1.b(a16, p11, aVar3.e());
            p b11 = aVar3.b();
            if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
                a16.r(Integer.valueOf(a14));
                a16.V(Integer.valueOf(a14), b11);
            }
            F1.b(a16, e12, aVar3.d());
            C1093k kVar = C1093k.f978a;
            T0.b(M0.i.a(errorState.getMessageResId(), mVar2, 0), (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, (T) null, mVar, 0, 0, 131070);
            C1500m mVar3 = mVar;
            mVar3.T(-309108390);
            ErrorState errorState2 = errorState;
            if (errorState2 instanceof ErrorState.WithCTA) {
                C1393m.c(((ErrorState.WithCTA) errorState2).getOnCtaClick(), (i) null, false, (g2) null, (C1387j) null, (C1391l) null, (C2868g) null, (N) null, (l) null, g0.c.e(-1722718916, true, new TicketsScreenKt$TicketsScreenContent$2$2$1$1$1(errorState2), mVar3, 54), mVar, 805306368, 510);
            }
            mVar.M();
            mVar.u();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
