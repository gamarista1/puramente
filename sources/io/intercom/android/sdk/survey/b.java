package io.intercom.android.sdk.survey;

import yf.C6787a;

public final /* synthetic */ class b implements C6787a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SurveyViewModel f70089a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f70090b;

    public /* synthetic */ b(SurveyViewModel surveyViewModel, String str) {
        this.f70089a = surveyViewModel;
        this.f70090b = str;
    }

    public final Object invoke() {
        return SurveyViewModel$fetchAndShowSurvey$1.invokeSuspend$lambda$0(this.f70089a, this.f70090b);
    }
}
