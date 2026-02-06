package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import Y.C1500m;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.ui.models.Answer;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2544x0;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.ComposableSingletons$DropDownQuestionKt$lambda-4$1  reason: invalid class name */
final class ComposableSingletons$DropDownQuestionKt$lambda4$1 implements p {
    public static final ComposableSingletons$DropDownQuestionKt$lambda4$1 INSTANCE = new ComposableSingletons$DropDownQuestionKt$lambda4$1();

    ComposableSingletons$DropDownQuestionKt$lambda4$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(Answer answer) {
        C6496s.h(answer, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            DropDownQuestionKt.DropDownQuestion((i) null, DropDownQuestionKt.dropDownQuestionModel, new Answer.SingleAnswer("Option A"), new c(), SurveyUiColors.m415copyqa9m3tE$default(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), 0, 0, C2544x0.f25560b.b(), 0, (C2544x0) null, 27, (Object) null), (p) null, mVar, 3136, 33);
        } else {
            mVar.I();
        }
    }
}
