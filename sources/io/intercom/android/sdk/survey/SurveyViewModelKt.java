package io.intercom.android.sdk.survey;

import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ColorUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.C2550z0;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toSurveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "Lio/intercom/android/sdk/survey/model/SurveyCustomization;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SurveyViewModelKt {
    public static final SurveyUiColors toSurveyUiColors(SurveyCustomization surveyCustomization) {
        C6496s.h(surveyCustomization, "<this>");
        long b10 = C2550z0.b(ColorUtils.parseColor(surveyCustomization.getBackgroundColor()));
        long b11 = C2550z0.b(ColorUtils.parseColor(surveyCustomization.getButtonColor()));
        return new SurveyUiColors(b10, ColorExtensionsKt.m712generateTextColor8_81llA(b10), b11, ColorExtensionsKt.m712generateTextColor8_81llA(b11), (C2544x0) null, 16, (DefaultConstructorMarker) null);
    }
}
