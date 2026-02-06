package io.intercom.android.sdk.survey;

import io.intercom.android.sdk.survey.model.SurveyData;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyLaunchMode;", "", "<init>", "()V", "Automatic", "Programmatic", "Lio/intercom/android/sdk/survey/SurveyLaunchMode$Automatic;", "Lio/intercom/android/sdk/survey/SurveyLaunchMode$Programmatic;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SurveyLaunchMode {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyLaunchMode$Automatic;", "Lio/intercom/android/sdk/survey/SurveyLaunchMode;", "surveyData", "Lio/intercom/android/sdk/survey/model/SurveyData;", "<init>", "(Lio/intercom/android/sdk/survey/model/SurveyData;)V", "getSurveyData", "()Lio/intercom/android/sdk/survey/model/SurveyData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Automatic extends SurveyLaunchMode {
        public static final int $stable = 8;
        private final SurveyData surveyData;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Automatic(SurveyData surveyData2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(surveyData2, "surveyData");
            this.surveyData = surveyData2;
        }

        public static /* synthetic */ Automatic copy$default(Automatic automatic, SurveyData surveyData2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                surveyData2 = automatic.surveyData;
            }
            return automatic.copy(surveyData2);
        }

        public final SurveyData component1() {
            return this.surveyData;
        }

        public final Automatic copy(SurveyData surveyData2) {
            C6496s.h(surveyData2, "surveyData");
            return new Automatic(surveyData2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Automatic) && C6496s.c(this.surveyData, ((Automatic) obj).surveyData);
        }

        public final SurveyData getSurveyData() {
            return this.surveyData;
        }

        public int hashCode() {
            return this.surveyData.hashCode();
        }

        public String toString() {
            return "Automatic(surveyData=" + this.surveyData + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyLaunchMode$Programmatic;", "Lio/intercom/android/sdk/survey/SurveyLaunchMode;", "surveyId", "", "<init>", "(Ljava/lang/String;)V", "getSurveyId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Programmatic extends SurveyLaunchMode {
        public static final int $stable = 0;
        private final String surveyId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Programmatic(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "surveyId");
            this.surveyId = str;
        }

        public static /* synthetic */ Programmatic copy$default(Programmatic programmatic, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = programmatic.surveyId;
            }
            return programmatic.copy(str);
        }

        public final String component1() {
            return this.surveyId;
        }

        public final Programmatic copy(String str) {
            C6496s.h(str, "surveyId");
            return new Programmatic(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Programmatic) && C6496s.c(this.surveyId, ((Programmatic) obj).surveyId);
        }

        public final String getSurveyId() {
            return this.surveyId;
        }

        public int hashCode() {
            return this.surveyId.hashCode();
        }

        public String toString() {
            return "Programmatic(surveyId=" + this.surveyId + ')';
        }
    }

    public /* synthetic */ SurveyLaunchMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SurveyLaunchMode() {
    }
}
