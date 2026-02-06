package io.intercom.android.sdk.survey.model;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/survey/model/StatsCtaRequestModel;", "", "surveyProgressId", "", "stepId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSurveyProgressId", "()Ljava/lang/String;", "getStepId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatsCtaRequestModel {
    public static final int $stable = 0;
    @c("step_id")
    private final String stepId;
    @c("survey_progress_id")
    private final String surveyProgressId;

    public StatsCtaRequestModel(String str, String str2) {
        C6496s.h(str, "surveyProgressId");
        C6496s.h(str2, "stepId");
        this.surveyProgressId = str;
        this.stepId = str2;
    }

    public static /* synthetic */ StatsCtaRequestModel copy$default(StatsCtaRequestModel statsCtaRequestModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = statsCtaRequestModel.surveyProgressId;
        }
        if ((i10 & 2) != 0) {
            str2 = statsCtaRequestModel.stepId;
        }
        return statsCtaRequestModel.copy(str, str2);
    }

    public final String component1() {
        return this.surveyProgressId;
    }

    public final String component2() {
        return this.stepId;
    }

    public final StatsCtaRequestModel copy(String str, String str2) {
        C6496s.h(str, "surveyProgressId");
        C6496s.h(str2, "stepId");
        return new StatsCtaRequestModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCtaRequestModel)) {
            return false;
        }
        StatsCtaRequestModel statsCtaRequestModel = (StatsCtaRequestModel) obj;
        return C6496s.c(this.surveyProgressId, statsCtaRequestModel.surveyProgressId) && C6496s.c(this.stepId, statsCtaRequestModel.stepId);
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public int hashCode() {
        return (this.surveyProgressId.hashCode() * 31) + this.stepId.hashCode();
    }

    public String toString() {
        return "StatsCtaRequestModel(surveyProgressId=" + this.surveyProgressId + ", stepId=" + this.stepId + ')';
    }
}
