package io.intercom.android.sdk.survey.ui.components;

import C.C1085c;
import C.W;
import C.Y;
import C.Z;
import H0.F;
import J0.C1241g;
import Q.b;
import Q0.T;
import V.T0;
import V.V;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.n;
import b1.j;
import b1.k;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ui.components.icons.LaunchKt;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2 implements q {
    final /* synthetic */ SurveyState.Content.SecondaryCta $it;
    final /* synthetic */ SurveyUiColors $surveyUiColors;

    SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2(SurveyState.Content.SecondaryCta secondaryCta, SurveyUiColors surveyUiColors) {
        this.$it = secondaryCta;
        this.$surveyUiColors = surveyUiColors;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(y10, "$this$Button");
        if ((i10 & 81) != 16 || !mVar.i()) {
            c.C0368c i11 = c.f23044a.i();
            SurveyState.Content.SecondaryCta secondaryCta = this.$it;
            SurveyUiColors surveyUiColors = this.$surveyUiColors;
            i.a aVar = i.f23074a;
            F b10 = W.b(C1085c.f882a.f(), i11, mVar2, 48);
            int a10 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
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
            F1.b(a12, b10, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b11 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b11);
            }
            F1.b(a12, e10, aVar2.d());
            Z z10 = Z.f873a;
            mVar2.T(410192915);
            if (secondaryCta.isExternalUrl()) {
                V.b(LaunchKt.getLaunch(b.f5154a.a()), (String) null, n.k(aVar, c1.h.j((float) 4), 0.0f, 2, (Object) null), surveyUiColors.m427getOnButton0d7_KjU(), mVar, 432, 0);
            }
            mVar.M();
            T0.b(secondaryCta.getButtonText(), (i) null, surveyUiColors.m427getOnButton0d7_KjU(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, (T) null, mVar, 0, 0, 131066);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
