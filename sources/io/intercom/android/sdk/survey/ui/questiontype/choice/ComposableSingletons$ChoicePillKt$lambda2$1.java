package io.intercom.android.sdk.survey.ui.questiontype.choice;

import Y.C1500m;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$ChoicePillKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$ChoicePillKt$lambda2$1 implements p {
    public static final ComposableSingletons$ChoicePillKt$lambda2$1 INSTANCE = new ComposableSingletons$ChoicePillKt$lambda2$1();

    ComposableSingletons$ChoicePillKt$lambda2$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            ChoicePillKt.m475ChoicePillUdaoDFU(true, (C6798l) null, "Option 1", 0, 0.0f, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)).m423getButton0d7_KjU(), (V0.p) null, 0, mVar, 390, 218);
        } else {
            mVar.I();
        }
    }
}
