package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import Y.C1500m;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import yf.p;

public final /* synthetic */ class j implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f70535a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f70536b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SurveyData.Step.Question.QuestionData.QuestionSubType f70537c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Answer f70538d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f70539e;

    public /* synthetic */ j(int i10, int i11, SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, Answer answer, int i12) {
        this.f70535a = i10;
        this.f70536b = i11;
        this.f70537c = questionSubType;
        this.f70538d = answer;
        this.f70539e = i12;
    }

    public final Object invoke(Object obj, Object obj2) {
        return NumericRatingQuestionKt.GeneratePreview$lambda$17(this.f70535a, this.f70536b, this.f70537c, this.f70538d, this.f70539e, (C1500m) obj, ((Integer) obj2).intValue());
    }
}
