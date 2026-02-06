package io.intercom.android.sdk.survey.model;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/model/FetchSurveyRequest;", "", "survey", "Lio/intercom/android/sdk/survey/model/SurveyData;", "<init>", "(Lio/intercom/android/sdk/survey/model/SurveyData;)V", "getSurvey", "()Lio/intercom/android/sdk/survey/model/SurveyData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchSurveyRequest {
    public static final int $stable = 8;
    @c("survey")
    private final SurveyData survey;

    public FetchSurveyRequest(SurveyData surveyData) {
        C6496s.h(surveyData, "survey");
        this.survey = surveyData;
    }

    public static /* synthetic */ FetchSurveyRequest copy$default(FetchSurveyRequest fetchSurveyRequest, SurveyData surveyData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surveyData = fetchSurveyRequest.survey;
        }
        return fetchSurveyRequest.copy(surveyData);
    }

    public final SurveyData component1() {
        return this.survey;
    }

    public final FetchSurveyRequest copy(SurveyData surveyData) {
        C6496s.h(surveyData, "survey");
        return new FetchSurveyRequest(surveyData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FetchSurveyRequest) && C6496s.c(this.survey, ((FetchSurveyRequest) obj).survey);
    }

    public final SurveyData getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        return this.survey.hashCode();
    }

    public String toString() {
        return "FetchSurveyRequest(survey=" + this.survey + ')';
    }
}
