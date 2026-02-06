package io.intercom.android.sdk.survey.model;

import Oc.c;
import io.intercom.android.sdk.survey.model.SurveyData;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0007H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/survey/model/SubmitSurveyResponse;", "", "complete", "", "nextStep", "Lio/intercom/android/sdk/survey/model/SurveyData$Step;", "surveyId", "", "<init>", "(ZLio/intercom/android/sdk/survey/model/SurveyData$Step;Ljava/lang/String;)V", "getComplete", "()Z", "getNextStep", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step;", "getSurveyId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubmitSurveyResponse {
    public static final int $stable = 8;
    @c("complete")
    private final boolean complete;
    @c("next_step")
    private final SurveyData.Step nextStep;
    @c("survey_id")
    private final String surveyId;

    public SubmitSurveyResponse(boolean z10, SurveyData.Step step, String str) {
        C6496s.h(step, "nextStep");
        C6496s.h(str, "surveyId");
        this.complete = z10;
        this.nextStep = step;
        this.surveyId = str;
    }

    public static /* synthetic */ SubmitSurveyResponse copy$default(SubmitSurveyResponse submitSurveyResponse, boolean z10, SurveyData.Step step, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = submitSurveyResponse.complete;
        }
        if ((i10 & 2) != 0) {
            step = submitSurveyResponse.nextStep;
        }
        if ((i10 & 4) != 0) {
            str = submitSurveyResponse.surveyId;
        }
        return submitSurveyResponse.copy(z10, step, str);
    }

    public final boolean component1() {
        return this.complete;
    }

    public final SurveyData.Step component2() {
        return this.nextStep;
    }

    public final String component3() {
        return this.surveyId;
    }

    public final SubmitSurveyResponse copy(boolean z10, SurveyData.Step step, String str) {
        C6496s.h(step, "nextStep");
        C6496s.h(str, "surveyId");
        return new SubmitSurveyResponse(z10, step, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitSurveyResponse)) {
            return false;
        }
        SubmitSurveyResponse submitSurveyResponse = (SubmitSurveyResponse) obj;
        return this.complete == submitSurveyResponse.complete && C6496s.c(this.nextStep, submitSurveyResponse.nextStep) && C6496s.c(this.surveyId, submitSurveyResponse.surveyId);
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final SurveyData.Step getNextStep() {
        return this.nextStep;
    }

    public final String getSurveyId() {
        return this.surveyId;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.complete) * 31) + this.nextStep.hashCode()) * 31) + this.surveyId.hashCode();
    }

    public String toString() {
        return "SubmitSurveyResponse(complete=" + this.complete + ", nextStep=" + this.nextStep + ", surveyId=" + this.surveyId + ')';
    }
}
