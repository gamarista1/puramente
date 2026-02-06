package io.intercom.android.sdk.survey;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.survey.SurveyViewModel", f = "SurveyViewModel.kt", l = {459}, m = "reportFailure")
final class SurveyViewModel$reportFailure$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SurveyViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SurveyViewModel$reportFailure$1(SurveyViewModel surveyViewModel, C6658d<? super SurveyViewModel$reportFailure$1> dVar) {
        super(dVar);
        this.this$0 = surveyViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.reportFailure((String) null, (String) null, this);
    }
}
