package io.intercom.android.sdk.survey;

import com.google.gson.e;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.StatsCtaRequestModel;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import mf.O;
import qf.C6658d;
import rf.C6680b;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u000e\u001a\u00020\bH@¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH@¢\u0006\u0004\b\u0016\u0010\u0012J \u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyRepository;", "", "Lio/intercom/android/sdk/api/SurveyApi;", "surveyApi", "<init>", "(Lio/intercom/android/sdk/api/SurveyApi;)V", "Lio/intercom/android/sdk/survey/model/SubmitSurveyRequest;", "submitSurveyRequest", "", "id", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/survey/model/SubmitSurveyResponse;", "submitSurvey", "(Lio/intercom/android/sdk/survey/model/SubmitSurveyRequest;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "surveyId", "surveyProgressId", "Llf/M;", "dismissSurvey", "(Ljava/lang/String;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/survey/model/FetchSurveyRequest;", "fetchSurvey", "(Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "reportFailure", "Lio/intercom/android/sdk/survey/model/StatsCtaRequestModel;", "statsCtaRequestModel", "submitCtaStat", "(Ljava/lang/String;Lio/intercom/android/sdk/survey/model/StatsCtaRequestModel;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/api/SurveyApi;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SurveyRepository {
    public static final int $stable = 8;
    private final SurveyApi surveyApi;

    public SurveyRepository() {
        this((SurveyApi) null, 1, (DefaultConstructorMarker) null);
    }

    public final Object dismissSurvey(String str, String str2, C6658d<? super NetworkResponse<C6514M>> dVar) {
        return this.surveyApi.dismissSurvey(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(O.f(C6502A.a("survey_progress_id", str2))), dVar);
    }

    public final Object fetchSurvey(String str, C6658d<? super NetworkResponse<FetchSurveyRequest>> dVar) {
        return this.surveyApi.fetchSurvey(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, (Map) null, 1, (Object) null), dVar);
    }

    public final Object reportFailure(String str, String str2, C6658d<? super NetworkResponse<C6514M>> dVar) {
        return this.surveyApi.reportFailure(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(O.f(C6502A.a("survey_progress_id", str2))), dVar);
    }

    public final Object submitCtaStat(String str, StatsCtaRequestModel statsCtaRequestModel, C6658d<? super C6514M> dVar) {
        Object m10 = new e().m(new e().v(statsCtaRequestModel), Map.class);
        C6496s.f(m10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Object submitCtaStat = this.surveyApi.submitCtaStat(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release((Map) m10), dVar);
        if (submitCtaStat == C6680b.f()) {
            return submitCtaStat;
        }
        return C6514M.f71813a;
    }

    public final Object submitSurvey(SubmitSurveyRequest submitSurveyRequest, String str, C6658d<? super NetworkResponse<SubmitSurveyResponse>> dVar) {
        Object m10 = new e().m(new e().v(submitSurveyRequest), Map.class);
        C6496s.f(m10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        return this.surveyApi.submitSurveyStep(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release((Map) m10), dVar);
    }

    public SurveyRepository(SurveyApi surveyApi2) {
        C6496s.h(surveyApi2, "surveyApi");
        this.surveyApi = surveyApi2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SurveyRepository(SurveyApi surveyApi2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getSurveyApi() : surveyApi2);
    }
}
