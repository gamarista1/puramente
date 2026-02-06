package io.intercom.android.sdk.survey.ui.questiontype.choice;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.a0;
import H0.F;
import J0.C1241g;
import V.T0;
import V0.n;
import W0.r;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import b1.j;
import b1.k;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import v.C2722e;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class OtherOptionKt$OtherOption$1$2 implements q {
    final /* synthetic */ C6798l $onTextChanged;
    final /* synthetic */ SurveyUiColors $surveyUiColors;
    final /* synthetic */ String $text;

    OtherOptionKt$OtherOption$1$2(SurveyUiColors surveyUiColors, String str, C6798l lVar) {
        this.$surveyUiColors = surveyUiColors;
        this.$text = str;
        this.$onTextChanged = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2722e eVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(eVar, "$this$AnimatedVisibility");
        SurveyUiColors surveyUiColors = this.$surveyUiColors;
        String str = this.$text;
        C6798l lVar = this.$onTextChanged;
        i.a aVar = i.f23074a;
        F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
        int a11 = C1494j.a(mVar2, 0);
        C1523y p10 = mVar.p();
        i e10 = h.e(mVar2, aVar);
        C1241g.a aVar2 = C1241g.f3853J;
        C6787a a12 = aVar2.a();
        if (mVar.j() == null) {
            C1494j.c();
        }
        mVar.F();
        if (mVar.f()) {
            mVar2.U(a12);
        } else {
            mVar.q();
        }
        C1500m a13 = F1.a(mVar);
        F1.b(a13, a10, aVar2.c());
        F1.b(a13, p10, aVar2.e());
        p b10 = aVar2.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar2.d());
        C1093k kVar = C1093k.f978a;
        T0.b(M0.i.a(R.string.intercom_surveys_multiselect_other_option_input_label, mVar2, 0), (i) null, 0, 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType04(), mVar, 0, 0, 65534);
        C1500m mVar3 = mVar;
        a0.a(androidx.compose.foundation.layout.q.i(aVar, c1.h.j((float) 4)), mVar3, 6);
        long r52 = ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m423getButton0d7_KjU());
        int d10 = r.f8593b.d();
        TextInputPillKt.m517TextInputPillg5ZjG94(str, M0.i.a(R.string.intercom_surveys_multiselect_other_option_input_placeholder, mVar3, 0), lVar, (C2544x0) null, r52, 0, false, (C6798l) null, 0, d10, false, (p) null, false, 0.0f, mVar, 805306368, 6, 14824);
        mVar.u();
    }
}
