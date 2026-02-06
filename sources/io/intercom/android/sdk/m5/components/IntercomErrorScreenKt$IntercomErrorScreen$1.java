package io.intercom.android.sdk.m5.components;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.a0;
import H0.F;
import J0.C1241g;
import M0.e;
import V.T0;
import V.V;
import V0.n;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomErrorScreenKt$IntercomErrorScreen$1 implements p {
    final /* synthetic */ ErrorState $state;

    IntercomErrorScreenKt$IntercomErrorScreen$1(ErrorState errorState) {
        this.$state = errorState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        i.a aVar;
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            c.a aVar2 = c.f23044a;
            c e10 = aVar2.e();
            ErrorState errorState = this.$state;
            i.a aVar3 = i.f23074a;
            F h10 = d.h(e10, false);
            int a10 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e11 = h.e(mVar2, aVar3);
            C1241g.a aVar4 = C1241g.f3853J;
            C6787a a11 = aVar4.a();
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
            F1.b(a12, h10, aVar4.c());
            F1.b(a12, p10, aVar4.e());
            p b10 = aVar4.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e11, aVar4.d());
            f fVar = f.f12848a;
            F a13 = C1090h.a(C1085c.f882a.g(), aVar2.g(), mVar2, 48);
            int a14 = C1494j.a(mVar2, 0);
            C1523y p11 = mVar.p();
            i e12 = h.e(mVar2, aVar3);
            C6787a a15 = aVar4.a();
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
            F1.b(a16, a13, aVar4.c());
            F1.b(a16, p11, aVar4.e());
            p b11 = aVar4.b();
            if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
                a16.r(Integer.valueOf(a14));
                a16.V(Integer.valueOf(a14), b11);
            }
            F1.b(a16, e12, aVar4.d());
            C1093k kVar = C1093k.f978a;
            V.a(e.c(errorState.getIconId(), mVar2, 0), (String) null, q.n(aVar3, c1.h.j((float) 32)), 0, mVar, 440, 8);
            float f10 = (float) 16;
            a0.a(q.i(aVar3, c1.h.j(f10)), mVar2, 6);
            String a17 = M0.i.a(errorState.getMessageResId(), mVar2, 0);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            int i12 = i11;
            IntercomTheme intercomTheme2 = intercomTheme;
            float f11 = f10;
            ErrorState errorState2 = errorState;
            T0.b(a17, (i) null, 0, 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar2, i11).getType03(), mVar, 0, 0, 65534);
            i.a aVar5 = aVar3;
            C1500m mVar3 = mVar;
            a0.a(q.i(aVar5, c1.h.j((float) 8)), mVar3, 6);
            Integer additionalMessageResId = errorState2.getAdditionalMessageResId();
            mVar3.T(1192536998);
            if (additionalMessageResId == null) {
                aVar = aVar5;
            } else {
                aVar = aVar5;
                T0.b(M0.i.a(additionalMessageResId.intValue(), mVar3, 0), (i) null, 0, 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme2.getTypography(mVar3, i12).getType04(), mVar, 0, 0, 65534);
            }
            mVar.M();
            C1500m mVar4 = mVar;
            a0.a(q.i(aVar, c1.h.j(f11)), mVar4, 6);
            mVar4.T(1192545587);
            ErrorState errorState3 = errorState2;
            if (errorState3 instanceof ErrorState.WithCTA) {
                ErrorState.WithCTA withCTA = (ErrorState.WithCTA) errorState3;
                IntercomPrimaryButtonKt.IntercomPrimaryButton(M0.i.a(withCTA.getCtaResId(), mVar4, 0), (i) null, (Integer) null, withCTA.getOnCtaClick(), mVar, 0, 6);
            }
            mVar.M();
            mVar.u();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
