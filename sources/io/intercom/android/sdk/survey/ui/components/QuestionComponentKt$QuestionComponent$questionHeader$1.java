package io.intercom.android.sdk.survey.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class QuestionComponentKt$QuestionComponent$questionHeader$1 implements p {
    final /* synthetic */ long $questionFontSize;
    final /* synthetic */ V0.p $questionFontWeight;
    final /* synthetic */ QuestionState $questionState;

    QuestionComponentKt$QuestionComponent$questionHeader$1(QuestionState questionState, V0.p pVar, long j10) {
        this.$questionState = questionState;
        this.$questionFontWeight = pVar;
        this.$questionFontSize = j10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            List<Block.Builder> title = this.$questionState.getQuestionModel().getTitle();
            StringProvider description = this.$questionState.getQuestionModel().getDescription();
            boolean isRequired = this.$questionState.getQuestionModel().isRequired();
            ValidationError validationError = this.$questionState.getValidationError();
            V0.p pVar = this.$questionFontWeight;
            long j10 = this.$questionFontSize;
            SurveyData.Step.Question.QuestionModel questionModel = this.$questionState.getQuestionModel();
            Integer num = null;
            SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
            if (shortTextQuestionModel != null) {
                num = shortTextQuestionModel.getTitleStringRes();
            }
            QuestionHeaderComponentKt.m468QuestionHeadern1tc1qA(title, description, isRequired, validationError, pVar, j10, (p) null, num, mVar, (StringProvider.$stable << 3) | 8, 64);
            return;
        }
        mVar.I();
    }
}
