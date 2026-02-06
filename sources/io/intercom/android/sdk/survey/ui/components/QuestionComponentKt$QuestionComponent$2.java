package io.intercom.android.sdk.survey.ui.components;

import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import H0.F;
import J0.C1241g;
import V0.p;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class QuestionComponentKt$QuestionComponent$2 implements q {
    final /* synthetic */ i $contentModifier;
    final /* synthetic */ C6798l $onAnswer;
    final /* synthetic */ C6798l $onAnswerClick;
    final /* synthetic */ C6798l $onImeActionNext;
    final /* synthetic */ long $questionFontSize;
    final /* synthetic */ p $questionFontWeight;
    final /* synthetic */ yf.p $questionHeader;
    final /* synthetic */ QuestionState $questionState;
    final /* synthetic */ SurveyUiColors $surveyUiColors;

    QuestionComponentKt$QuestionComponent$2(QuestionState questionState, i iVar, C6798l lVar, SurveyUiColors surveyUiColors, yf.p pVar, C6798l lVar2, C6798l lVar3, p pVar2, long j10) {
        this.$questionState = questionState;
        this.$contentModifier = iVar;
        this.$onAnswer = lVar;
        this.$surveyUiColors = surveyUiColors;
        this.$questionHeader = pVar;
        this.$onImeActionNext = lVar2;
        this.$onAnswerClick = lVar3;
        this.$questionFontWeight = pVar2;
        this.$questionFontSize = j10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(jVar, "$this$Card");
        if ((i10 & 81) != 16 || !mVar.i()) {
            QuestionState questionState = this.$questionState;
            i iVar = this.$contentModifier;
            C6798l lVar = this.$onAnswer;
            SurveyUiColors surveyUiColors = this.$surveyUiColors;
            yf.p pVar = this.$questionHeader;
            C6798l lVar2 = this.$onImeActionNext;
            C6798l lVar3 = this.$onAnswerClick;
            p pVar2 = this.$questionFontWeight;
            long j10 = this.$questionFontSize;
            i.a aVar = i.f23074a;
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a12 = aVar2.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            C6798l lVar4 = lVar3;
            F1.b(a13, a10, aVar2.c());
            F1.b(a13, p10, aVar2.e());
            yf.p b10 = aVar2.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar2.d());
            C1093k kVar = C1093k.f978a;
            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
            if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                mVar2.T(1477556771);
                DropDownQuestionKt.DropDownQuestion(iVar, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState.getAnswer(), lVar, surveyUiColors, pVar, mVar, 196672, 0);
                mVar.M();
            } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                mVar2.T(1477996258);
                ShortTextQuestionKt.ShortTextQuestion(iVar, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState.getAnswer(), lVar, surveyUiColors, questionState.getValidationError(), lVar2, pVar, mVar, 12582912, 0);
                mVar.M();
            } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                mVar2.T(1478558691);
                LongTextQuestionKt.LongTextQuestion(iVar, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState.getAnswer(), lVar, surveyUiColors, questionState.getValidationError(), lVar2, pVar, mVar, 12582912, 0);
                mVar.M();
            } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                mVar2.T(1479121465);
                NumericRatingQuestionKt.NumericRatingQuestion(iVar, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState.getAnswer(), lVar, surveyUiColors, pVar, mVar, 196672, 0);
                mVar.M();
            } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                mVar2.T(1479569787);
                SingleChoiceQuestionKt.SingleChoiceQuestion(iVar, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState.getAnswer(), lVar, surveyUiColors, pVar, mVar, 196672, 0);
                mVar.M();
            } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                mVar2.T(1480018295);
                MultipleChoiceQuestionKt.MultipleChoiceQuestion(iVar, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState.getAnswer(), lVar, surveyUiColors, pVar, mVar, 196672, 0);
                mVar.M();
            } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                mVar2.T(1480464602);
                DatePickerQuestionKt.DatePickerQuestion(iVar, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState.getAnswer(), lVar, pVar, mVar, 24576, 0);
                mVar.M();
            } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                mVar2.T(1480853807);
                Answer answer = questionState.getAnswer();
                UploadFileQuestionKt.UploadFileQuestion(iVar, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, answer, lVar, lVar4, g0.c.e(-1590070470, true, new QuestionComponentKt$QuestionComponent$2$1$1(questionState, pVar2, j10), mVar2, 54), mVar, 196672, 0);
                mVar.M();
            } else if (C6496s.c(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                mVar2.T(1481445628);
                mVar.M();
            } else {
                mVar2.T(1481504683);
                mVar.M();
            }
            mVar.u();
            return;
        }
        mVar.I();
    }
}
