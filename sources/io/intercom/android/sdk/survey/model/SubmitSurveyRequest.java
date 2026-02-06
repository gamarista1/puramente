package io.intercom.android.sdk.survey.model;

import Oc.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/survey/model/SubmitSurveyRequest;", "", "surveyProgressId", "", "currentStepId", "responses", "", "Lio/intercom/android/sdk/survey/model/SubmitSurveyRequestItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSurveyProgressId", "()Ljava/lang/String;", "getCurrentStepId", "getResponses", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubmitSurveyRequest {
    public static final int $stable = 8;
    @c("current_step_id")
    private final String currentStepId;
    @c("responses")
    private final List<SubmitSurveyRequestItem> responses;
    @c("survey_progress_id")
    private final String surveyProgressId;

    public SubmitSurveyRequest(String str, String str2, List<SubmitSurveyRequestItem> list) {
        C6496s.h(str, "surveyProgressId");
        C6496s.h(str2, "currentStepId");
        C6496s.h(list, "responses");
        this.surveyProgressId = str;
        this.currentStepId = str2;
        this.responses = list;
    }

    public static /* synthetic */ SubmitSurveyRequest copy$default(SubmitSurveyRequest submitSurveyRequest, String str, String str2, List<SubmitSurveyRequestItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = submitSurveyRequest.surveyProgressId;
        }
        if ((i10 & 2) != 0) {
            str2 = submitSurveyRequest.currentStepId;
        }
        if ((i10 & 4) != 0) {
            list = submitSurveyRequest.responses;
        }
        return submitSurveyRequest.copy(str, str2, list);
    }

    public final String component1() {
        return this.surveyProgressId;
    }

    public final String component2() {
        return this.currentStepId;
    }

    public final List<SubmitSurveyRequestItem> component3() {
        return this.responses;
    }

    public final SubmitSurveyRequest copy(String str, String str2, List<SubmitSurveyRequestItem> list) {
        C6496s.h(str, "surveyProgressId");
        C6496s.h(str2, "currentStepId");
        C6496s.h(list, "responses");
        return new SubmitSurveyRequest(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitSurveyRequest)) {
            return false;
        }
        SubmitSurveyRequest submitSurveyRequest = (SubmitSurveyRequest) obj;
        return C6496s.c(this.surveyProgressId, submitSurveyRequest.surveyProgressId) && C6496s.c(this.currentStepId, submitSurveyRequest.currentStepId) && C6496s.c(this.responses, submitSurveyRequest.responses);
    }

    public final String getCurrentStepId() {
        return this.currentStepId;
    }

    public final List<SubmitSurveyRequestItem> getResponses() {
        return this.responses;
    }

    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public int hashCode() {
        return (((this.surveyProgressId.hashCode() * 31) + this.currentStepId.hashCode()) * 31) + this.responses.hashCode();
    }

    public String toString() {
        return "SubmitSurveyRequest(surveyProgressId=" + this.surveyProgressId + ", currentStepId=" + this.currentStepId + ", responses=" + this.responses + ')';
    }
}
