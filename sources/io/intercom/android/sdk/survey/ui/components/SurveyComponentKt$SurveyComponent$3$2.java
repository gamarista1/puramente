package io.intercom.android.sdk.survey.ui.components;

import C.N;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import io.intercom.android.sdk.survey.SurveyState;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SurveyComponentKt$SurveyComponent$3$2 implements q {
    final /* synthetic */ C6798l $onAnswerUpdated;
    final /* synthetic */ C6798l $onContinue;
    final /* synthetic */ C6798l $onSecondaryCtaClicked;
    final /* synthetic */ SurveyState $state;

    SurveyComponentKt$SurveyComponent$3$2(SurveyState surveyState, C6798l lVar, C6798l lVar2, C6798l lVar3) {
        this.$state = surveyState;
        this.$onContinue = lVar;
        this.$onAnswerUpdated = lVar2;
        this.$onSecondaryCtaClicked = lVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((N) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(N n10, C1500m mVar, int i10) {
        C6496s.h(n10, "contentPadding");
        if ((i10 & 14) == 0) {
            i10 |= mVar.S(n10) ? 4 : 2;
        }
        if ((i10 & 91) != 18 || !mVar.i()) {
            SurveyState surveyState = this.$state;
            if (surveyState instanceof SurveyState.Content) {
                mVar.T(-509523482);
                SurveyComponentKt.SurveyContent((SurveyState.Content) this.$state, this.$onContinue, this.$onAnswerUpdated, this.$onSecondaryCtaClicked, n.h(i.f23074a, n10), mVar, 8, 0);
                mVar.M();
            } else if (surveyState instanceof SurveyState.Error) {
                mVar.T(-509512239);
                ErrorComponentKt.SurveyError((SurveyState.Error) this.$state, n.h(i.f23074a, n10), mVar, 0, 0);
                mVar.M();
            } else if (surveyState instanceof SurveyState.Loading) {
                mVar.T(-509506157);
                LoadingComponentKt.SurveyLoading((SurveyState.Loading) this.$state, n.h(i.f23074a, n10), mVar, 0, 0);
                mVar.M();
            } else if (C6496s.c(surveyState, SurveyState.Initial.INSTANCE)) {
                mVar.T(1385361405);
                mVar.M();
            } else {
                mVar.T(-509524940);
                mVar.M();
                throw new C6535s();
            }
        } else {
            mVar.I();
        }
    }
}
