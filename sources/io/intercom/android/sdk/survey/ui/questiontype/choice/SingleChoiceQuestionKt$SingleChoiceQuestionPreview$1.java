package io.intercom.android.sdk.survey.ui.questiontype.choice;

import Y.C1500m;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.UUID;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SingleChoiceQuestionKt$SingleChoiceQuestionPreview$1 implements p {
    final /* synthetic */ SurveyUiColors $surveyUiColors;

    SingleChoiceQuestionKt$SingleChoiceQuestionPreview$1(SurveyUiColors surveyUiColors) {
        this.$surveyUiColors = surveyUiColors;
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
            String uuid = UUID.randomUUID().toString();
            C6496s.g(uuid, "toString(...)");
            SingleChoiceQuestionKt.SingleChoiceQuestion((i) null, new SurveyData.Step.Question.SingleChoiceQuestionModel(uuid, C6565s.e(new Block.Builder().withText("Question title")), true, C6565s.q("Option 1", "Option 2", "Option 3", "Option 4"), false), new Answer.SingleAnswer("Option 2"), new C(), this.$surveyUiColors, (p) null, mVar, 3136, 33);
            return;
        }
        mVar.I();
    }
}
