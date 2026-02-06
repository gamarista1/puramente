package io.intercom.android.sdk.survey;

import Ug.K;
import io.intercom.android.sdk.survey.SurveyState;
import yf.C6787a;

public final /* synthetic */ class c implements C6787a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SurveyViewModel f70221a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurveyState.Content f70222b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ K f70223c;

    public /* synthetic */ c(SurveyViewModel surveyViewModel, SurveyState.Content content, K k10) {
        this.f70221a = surveyViewModel;
        this.f70222b = content;
        this.f70223c = k10;
    }

    public final Object invoke() {
        return SurveyViewModel$submitSurvey$1.invokeSuspend$lambda$7(this.f70221a, this.f70222b, this.f70223c);
    }
}
