package io.intercom.android.sdk.api;

import gi.a;
import gi.o;
import gi.s;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import kotlin.Metadata;
import lf.C6514M;
import qf.C6658d;
import rh.D;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\r\u0010\tJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/api/SurveyApi;", "", "", "surveyId", "Lrh/D;", "options", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/survey/model/SubmitSurveyResponse;", "submitSurveyStep", "(Ljava/lang/String;Lrh/D;Lqf/d;)Ljava/lang/Object;", "Llf/M;", "dismissSurvey", "submitCtaStat", "reportFailure", "Lio/intercom/android/sdk/survey/model/FetchSurveyRequest;", "fetchSurvey", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SurveyApi {
    @o("surveys/{surveyId}/dismiss")
    Object dismissSurvey(@s("surveyId") String str, @a D d10, C6658d<? super NetworkResponse<C6514M>> dVar);

    @o("surveys/{surveyId}/fetch")
    Object fetchSurvey(@s("surveyId") String str, @a D d10, C6658d<? super NetworkResponse<FetchSurveyRequest>> dVar);

    @o("surveys/{survey_id}/failure")
    Object reportFailure(@s("survey_id") String str, @a D d10, C6658d<? super NetworkResponse<C6514M>> dVar);

    @o("surveys/{surveyId}/action_button_clicked")
    Object submitCtaStat(@s("surveyId") String str, @a D d10, C6658d<? super NetworkResponse<C6514M>> dVar);

    @o("surveys/{surveyId}/submit")
    Object submitSurveyStep(@s("surveyId") String str, @a D d10, C6658d<? super NetworkResponse<SubmitSurveyResponse>> dVar);
}
