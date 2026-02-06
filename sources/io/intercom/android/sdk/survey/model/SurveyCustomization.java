package io.intercom.android.sdk.survey.model;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyCustomization;", "", "backgroundColor", "", "buttonColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getButtonColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SurveyCustomization {
    public static final int $stable = 0;
    @c("background_color")
    private final String backgroundColor;
    @c("button_color")
    private final String buttonColor;

    public SurveyCustomization() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SurveyCustomization copy$default(SurveyCustomization surveyCustomization, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveyCustomization.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            str2 = surveyCustomization.buttonColor;
        }
        return surveyCustomization.copy(str, str2);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.buttonColor;
    }

    public final SurveyCustomization copy(String str, String str2) {
        C6496s.h(str, "backgroundColor");
        C6496s.h(str2, "buttonColor");
        return new SurveyCustomization(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyCustomization)) {
            return false;
        }
        SurveyCustomization surveyCustomization = (SurveyCustomization) obj;
        return C6496s.c(this.backgroundColor, surveyCustomization.backgroundColor) && C6496s.c(this.buttonColor, surveyCustomization.buttonColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getButtonColor() {
        return this.buttonColor;
    }

    public int hashCode() {
        return (this.backgroundColor.hashCode() * 31) + this.buttonColor.hashCode();
    }

    public String toString() {
        return "SurveyCustomization(backgroundColor=" + this.backgroundColor + ", buttonColor=" + this.buttonColor + ')';
    }

    public SurveyCustomization(String str, String str2) {
        C6496s.h(str, "backgroundColor");
        C6496s.h(str2, "buttonColor");
        this.backgroundColor = str;
        this.buttonColor = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SurveyCustomization(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "#FFFFFF" : str, (i10 & 2) != 0 ? "#000000" : str2);
    }
}
