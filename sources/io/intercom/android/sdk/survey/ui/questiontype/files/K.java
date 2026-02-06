package io.intercom.android.sdk.survey.ui.questiontype.files;

import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import yf.C6798l;

public final /* synthetic */ class K implements C6798l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6798l f70459a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurveyData.Step.Question.UploadFileQuestionModel f70460b;

    public /* synthetic */ K(C6798l lVar, SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel) {
        this.f70459a = lVar;
        this.f70460b = uploadFileQuestionModel;
    }

    public final Object invoke(Object obj) {
        return UploadFileQuestionKt$UploadFileQuestion$2.invoke$lambda$5$lambda$0(this.f70459a, this.f70460b, (Answer.MediaAnswer.MediaItem) obj);
    }
}
