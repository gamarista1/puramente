package io.intercom.android.sdk.survey;

import H.b;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Y.A1;
import Y.C1510r0;
import Y.o1;
import Y.p1;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;
import qf.g;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0017R+\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00105\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8B@BX\u0002¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u00103\"\u0004\b4\u0010\fR\u001b\u0010\t\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00103R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lio/intercom/android/sdk/survey/QuestionState;", "", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "questionModel", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "surveyUiColors", "<init>", "(Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;Lio/intercom/android/sdk/survey/SurveyUiColors;)V", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "Llf/M;", "setAnswer", "(Lio/intercom/android/sdk/survey/ui/models/Answer;)V", "validate", "()V", "LUg/K;", "compositionAwareScope", "LUg/w0;", "bringIntoView", "(LUg/K;)LUg/w0;", "component1", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "component2", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "copy", "(Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;Lio/intercom/android/sdk/survey/SurveyUiColors;)Lio/intercom/android/sdk/survey/QuestionState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "getQuestionModel", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "getSurveyUiColors", "Lio/intercom/android/sdk/survey/ValidationError;", "<set-?>", "validationError$delegate", "LY/r0;", "getValidationError", "()Lio/intercom/android/sdk/survey/ValidationError;", "setValidationError", "(Lio/intercom/android/sdk/survey/ValidationError;)V", "validationError", "_answer$delegate", "get_answer", "()Lio/intercom/android/sdk/survey/ui/models/Answer;", "set_answer", "_answer", "answer$delegate", "LY/A1;", "getAnswer", "LH/b;", "bringIntoViewRequester", "LH/b;", "getBringIntoViewRequester", "()LH/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuestionState {
    public static final int $stable = 8;
    private final C1510r0 _answer$delegate = u1.d(Answer.NoAnswer.InitialNoAnswer.INSTANCE, (o1) null, 2, (Object) null);
    private final A1 answer$delegate = p1.e(new a(this));
    private final b bringIntoViewRequester = androidx.compose.foundation.relocation.b.a();
    private final SurveyData.Step.Question.QuestionModel questionModel;
    private final SurveyUiColors surveyUiColors;
    private final C1510r0 validationError$delegate = u1.d(ValidationError.Unchecked.INSTANCE, (o1) null, 2, (Object) null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType[] r0 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.QuestionState.WhenMappings.<clinit>():void");
        }
    }

    public QuestionState(SurveyData.Step.Question.QuestionModel questionModel2, SurveyUiColors surveyUiColors2) {
        C6496s.h(questionModel2, "questionModel");
        C6496s.h(surveyUiColors2, "surveyUiColors");
        this.questionModel = questionModel2;
        this.surveyUiColors = surveyUiColors2;
    }

    /* access modifiers changed from: private */
    public static final Answer answer_delegate$lambda$0(QuestionState questionState) {
        C6496s.h(questionState, "this$0");
        return questionState.get_answer();
    }

    public static /* synthetic */ QuestionState copy$default(QuestionState questionState, SurveyData.Step.Question.QuestionModel questionModel2, SurveyUiColors surveyUiColors2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            questionModel2 = questionState.questionModel;
        }
        if ((i10 & 2) != 0) {
            surveyUiColors2 = questionState.surveyUiColors;
        }
        return questionState.copy(questionModel2, surveyUiColors2);
    }

    private final Answer get_answer() {
        return (Answer) this._answer$delegate.getValue();
    }

    private final void set_answer(Answer answer) {
        this._answer$delegate.setValue(answer);
    }

    public final C5600w0 bringIntoView(K k10) {
        C6496s.h(k10, "compositionAwareScope");
        return C5576k.d(k10, (g) null, (M) null, new QuestionState$bringIntoView$1(this, (C6658d<? super QuestionState$bringIntoView$1>) null), 3, (Object) null);
    }

    public final SurveyData.Step.Question.QuestionModel component1() {
        return this.questionModel;
    }

    public final SurveyUiColors component2() {
        return this.surveyUiColors;
    }

    public final QuestionState copy(SurveyData.Step.Question.QuestionModel questionModel2, SurveyUiColors surveyUiColors2) {
        C6496s.h(questionModel2, "questionModel");
        C6496s.h(surveyUiColors2, "surveyUiColors");
        return new QuestionState(questionModel2, surveyUiColors2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionState)) {
            return false;
        }
        QuestionState questionState = (QuestionState) obj;
        return C6496s.c(this.questionModel, questionState.questionModel) && C6496s.c(this.surveyUiColors, questionState.surveyUiColors);
    }

    public final Answer getAnswer() {
        return (Answer) this.answer$delegate.getValue();
    }

    public final b getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final SurveyData.Step.Question.QuestionModel getQuestionModel() {
        return this.questionModel;
    }

    public final SurveyUiColors getSurveyUiColors() {
        return this.surveyUiColors;
    }

    public final ValidationError getValidationError() {
        return (ValidationError) this.validationError$delegate.getValue();
    }

    public int hashCode() {
        return (this.questionModel.hashCode() * 31) + this.surveyUiColors.hashCode();
    }

    public final void setAnswer(Answer answer) {
        C6496s.h(answer, "answer");
        set_answer(answer);
        if (answer instanceof Answer.NoAnswer.ResetNoAnswer) {
            setValidationError(ValidationError.Unchecked.INSTANCE);
        }
    }

    public final void setValidationError(ValidationError validationError) {
        C6496s.h(validationError, "<set-?>");
        this.validationError$delegate.setValue(validationError);
    }

    public String toString() {
        return "QuestionState(questionModel=" + this.questionModel + ", surveyUiColors=" + this.surveyUiColors + ')';
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [io.intercom.android.sdk.survey.ui.models.Answer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void validate() {
        /*
            r5 = this;
            io.intercom.android.sdk.survey.ui.models.Answer r0 = r5.getAnswer()
            boolean r0 = r0 instanceof io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x001d
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r0 = r5.questionModel
            boolean r0 = r0.isRequired()
            if (r0 == 0) goto L_0x001d
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r3 = io.intercom.android.sdk.R.string.intercom_surveys_required_response
            r0.<init>(r3, r2, r1, r2)
            r5.setValidationError(r0)
            return
        L_0x001d:
            io.intercom.android.sdk.survey.ui.models.Answer r0 = r5.getAnswer()
            boolean r0 = r0 instanceof io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer
            if (r0 == 0) goto L_0x002b
            io.intercom.android.sdk.survey.ValidationError$NoValidationError r0 = io.intercom.android.sdk.survey.ValidationError.NoValidationError.INSTANCE
            r5.setValidationError(r0)
            return
        L_0x002b:
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r0 = r5.questionModel
            boolean r3 = r0 instanceof io.intercom.android.sdk.survey.model.SurveyData.Step.Question.MultipleChoiceQuestionModel
            if (r3 == 0) goto L_0x00ab
            io.intercom.android.sdk.survey.ui.models.Answer r0 = r5.getAnswer()
            boolean r0 = r0 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer
            if (r0 == 0) goto L_0x0276
            io.intercom.android.sdk.survey.ui.models.Answer r0 = r5.getAnswer()
            java.lang.String r1 = "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer"
            kotlin.jvm.internal.C6496s.f(r0, r1)
            io.intercom.android.sdk.survey.ui.models.Answer$MultipleAnswer r0 = (io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer) r0
            java.util.List r0 = r0.getAnswers()
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r1 = r5.questionModel
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$MultipleChoiceQuestionModel r1 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.MultipleChoiceQuestionModel) r1
            int r1 = r1.getMinSelection()
            java.lang.String r2 = "response_count"
            if (r0 >= r1) goto L_0x007a
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r1 = io.intercom.android.sdk.R.string.intercom_surveys_multi_select_too_few_responses
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r3 = r5.questionModel
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$MultipleChoiceQuestionModel r3 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.MultipleChoiceQuestionModel) r3
            int r3 = r3.getMinSelection()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            kotlin.Pair r2 = lf.C6502A.a(r2, r3)
            java.util.List r2 = mf.C6565s.e(r2)
            r0.<init>(r1, r2)
            r5.setValidationError(r0)
            goto L_0x0276
        L_0x007a:
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r1 = r5.questionModel
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$MultipleChoiceQuestionModel r1 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.MultipleChoiceQuestionModel) r1
            int r1 = r1.getMaxSelection()
            if (r0 <= r1) goto L_0x00a4
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r1 = io.intercom.android.sdk.R.string.intercom_surveys_multi_select_too_many_responses
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r3 = r5.questionModel
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$MultipleChoiceQuestionModel r3 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.MultipleChoiceQuestionModel) r3
            int r3 = r3.getMaxSelection()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            kotlin.Pair r2 = lf.C6502A.a(r2, r3)
            java.util.List r2 = mf.C6565s.e(r2)
            r0.<init>(r1, r2)
            r5.setValidationError(r0)
            goto L_0x0276
        L_0x00a4:
            io.intercom.android.sdk.survey.ValidationError$NoValidationError r0 = io.intercom.android.sdk.survey.ValidationError.NoValidationError.INSTANCE
            r5.setValidationError(r0)
            goto L_0x0276
        L_0x00ab:
            boolean r3 = r0 instanceof io.intercom.android.sdk.survey.model.SurveyData.Step.Question.ShortTextQuestionModel
            java.lang.String r4 = "character_count"
            if (r3 == 0) goto L_0x017b
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$ShortTextQuestionModel r0 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.ShortTextQuestionModel) r0
            boolean r0 = r0.getEnabled()
            if (r0 != 0) goto L_0x00bd
            io.intercom.android.sdk.survey.ValidationError$NoValidationError r0 = io.intercom.android.sdk.survey.ValidationError.NoValidationError.INSTANCE
            goto L_0x0176
        L_0x00bd:
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r0 = r5.questionModel
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$ShortTextQuestionModel r0 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.ShortTextQuestionModel) r0
            java.lang.Integer r0 = r0.getCharacterLimit()
            if (r0 == 0) goto L_0x00fa
            io.intercom.android.sdk.survey.ui.models.Answer r0 = r5.getAnswer()
            int r0 = r0.getLength()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r3 = r5.questionModel
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$ShortTextQuestionModel r3 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.ShortTextQuestionModel) r3
            java.lang.Integer r3 = r3.getCharacterLimit()
            int r3 = r3.intValue()
            if (r0 <= r3) goto L_0x00fa
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r1 = io.intercom.android.sdk.R.string.intercom_surveys_response_too_long
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r2 = r5.questionModel
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$ShortTextQuestionModel r2 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.ShortTextQuestionModel) r2
            java.lang.Integer r2 = r2.getCharacterLimit()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlin.Pair r2 = lf.C6502A.a(r4, r2)
            java.util.List r2 = mf.C6565s.e(r2)
            r0.<init>(r1, r2)
            goto L_0x0176
        L_0x00fa:
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r0 = r5.questionModel
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$ShortTextQuestionModel r0 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.ShortTextQuestionModel) r0
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r0 = r0.getValidationType()
            int[] r3 = io.intercom.android.sdk.survey.QuestionState.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r3[r0]
            switch(r0) {
                case 1: goto L_0x0122;
                case 2: goto L_0x0122;
                case 3: goto L_0x011f;
                case 4: goto L_0x011c;
                case 5: goto L_0x0119;
                case 6: goto L_0x0116;
                case 7: goto L_0x0113;
                default: goto L_0x010d;
            }
        L_0x010d:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x0113:
            java.lang.String r0 = "integer"
            goto L_0x0124
        L_0x0116:
            java.lang.String r0 = "float"
            goto L_0x0124
        L_0x0119:
            java.lang.String r0 = "phone"
            goto L_0x0124
        L_0x011c:
            java.lang.String r0 = "email"
            goto L_0x0124
        L_0x011f:
            java.lang.String r0 = "number"
            goto L_0x0124
        L_0x0122:
            java.lang.String r0 = "text"
        L_0x0124:
            io.intercom.android.sdk.survey.ui.models.Answer r3 = r5.getAnswer()
            boolean r4 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer
            if (r4 == 0) goto L_0x0133
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r3 = (io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer) r3
            java.lang.String r3 = r3.getAnswer()
            goto L_0x0135
        L_0x0133:
            java.lang.String r3 = ""
        L_0x0135:
            int r0 = io.intercom.android.sdk.utilities.AttributeValidatorUtils.validateAttribute(r3, r0)
            switch(r0) {
                case 1: goto L_0x016f;
                case 2: goto L_0x0167;
                case 3: goto L_0x015f;
                case 4: goto L_0x0157;
                case 5: goto L_0x014f;
                case 6: goto L_0x0147;
                case 7: goto L_0x013f;
                default: goto L_0x013c;
            }
        L_0x013c:
            io.intercom.android.sdk.survey.ValidationError$NoValidationError r0 = io.intercom.android.sdk.survey.ValidationError.NoValidationError.INSTANCE
            goto L_0x0176
        L_0x013f:
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r3 = io.intercom.android.sdk.R.string.intercom_that_number_is_missing_a_few_digits
            r0.<init>(r3, r2, r1, r2)
            goto L_0x0176
        L_0x0147:
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r3 = io.intercom.android.sdk.R.string.intercom_that_country_code_doesnt_look_quite_right
            r0.<init>(r3, r2, r1, r2)
            goto L_0x0176
        L_0x014f:
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r3 = io.intercom.android.sdk.R.string.intercom_that_number_has_too_many_digits
            r0.<init>(r3, r2, r1, r2)
            goto L_0x0176
        L_0x0157:
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r3 = io.intercom.android.sdk.R.string.intercom_that_number_needs_a_prefix
            r0.<init>(r3, r2, r1, r2)
            goto L_0x0176
        L_0x015f:
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r3 = io.intercom.android.sdk.R.string.intercom_number_is_incorrect
            r0.<init>(r3, r2, r1, r2)
            goto L_0x0176
        L_0x0167:
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r3 = io.intercom.android.sdk.R.string.intercom_surveys_email_error
            r0.<init>(r3, r2, r1, r2)
            goto L_0x0176
        L_0x016f:
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r3 = io.intercom.android.sdk.R.string.intercom_string_is_incorrect
            r0.<init>(r3, r2, r1, r2)
        L_0x0176:
            r5.setValidationError(r0)
            goto L_0x0276
        L_0x017b:
            boolean r3 = r0 instanceof io.intercom.android.sdk.survey.model.SurveyData.Step.Question.LongTextQuestionModel
            if (r3 == 0) goto L_0x01c0
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$LongTextQuestionModel r0 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.LongTextQuestionModel) r0
            java.lang.Integer r0 = r0.getCharacterLimit()
            if (r0 == 0) goto L_0x01b9
            io.intercom.android.sdk.survey.ui.models.Answer r0 = r5.getAnswer()
            int r0 = r0.getLength()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r1 = r5.questionModel
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$LongTextQuestionModel r1 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.LongTextQuestionModel) r1
            java.lang.Integer r1 = r1.getCharacterLimit()
            int r1 = r1.intValue()
            if (r0 <= r1) goto L_0x01b9
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r1 = io.intercom.android.sdk.R.string.intercom_surveys_response_too_long
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r2 = r5.questionModel
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$LongTextQuestionModel r2 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.LongTextQuestionModel) r2
            java.lang.Integer r2 = r2.getCharacterLimit()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlin.Pair r2 = lf.C6502A.a(r4, r2)
            java.util.List r2 = mf.C6565s.e(r2)
            r0.<init>(r1, r2)
            goto L_0x01bb
        L_0x01b9:
            io.intercom.android.sdk.survey.ValidationError$NoValidationError r0 = io.intercom.android.sdk.survey.ValidationError.NoValidationError.INSTANCE
        L_0x01bb:
            r5.setValidationError(r0)
            goto L_0x0276
        L_0x01c0:
            boolean r3 = r0 instanceof io.intercom.android.sdk.survey.model.SurveyData.Step.Question.DatePickerQuestionModel
            if (r3 == 0) goto L_0x01f0
            io.intercom.android.sdk.survey.ui.models.Answer r0 = r5.getAnswer()
            boolean r0 = r0 instanceof io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer
            if (r0 == 0) goto L_0x0276
            io.intercom.android.sdk.survey.ui.models.Answer r0 = r5.getAnswer()
            java.lang.String r3 = "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer"
            kotlin.jvm.internal.C6496s.f(r0, r3)
            io.intercom.android.sdk.survey.ui.models.Answer$DateTimeAnswer r0 = (io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer) r0
            java.lang.String r0 = r0.getDateAsString()
            boolean r0 = Sg.p.d0(r0)
            if (r0 == 0) goto L_0x01e9
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r0 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r3 = io.intercom.android.sdk.R.string.intercom_choose_the_date
            r0.<init>(r3, r2, r1, r2)
            goto L_0x01eb
        L_0x01e9:
            io.intercom.android.sdk.survey.ValidationError$NoValidationError r0 = io.intercom.android.sdk.survey.ValidationError.NoValidationError.INSTANCE
        L_0x01eb:
            r5.setValidationError(r0)
            goto L_0x0276
        L_0x01f0:
            boolean r0 = r0 instanceof io.intercom.android.sdk.survey.model.SurveyData.Step.Question.UploadFileQuestionModel
            if (r0 == 0) goto L_0x0271
            io.intercom.android.sdk.survey.ui.models.Answer r0 = r5.getAnswer()
            boolean r1 = r0 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer
            if (r1 == 0) goto L_0x01ff
            r2 = r0
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer r2 = (io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer) r2
        L_0x01ff:
            if (r2 == 0) goto L_0x026b
            java.util.List r0 = r2.getMediaItems()
            if (r0 == 0) goto L_0x026b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = mf.C6565s.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0218:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x022c
            java.lang.Object r2 = r0.next()
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem r2 = (io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.MediaItem) r2
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus r2 = r2.getUploadStatus()
            r1.add(r2)
            goto L_0x0218
        L_0x022c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0235:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0247
            java.lang.Object r2 = r1.next()
            boolean r3 = r2 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error
            if (r3 == 0) goto L_0x0235
            r0.add(r2)
            goto L_0x0235
        L_0x0247:
            java.lang.Object r0 = mf.C6565s.q0(r0)
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$Error r0 = (io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error) r0
            if (r0 == 0) goto L_0x026b
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadError r0 = r0.getError()
            java.util.List r0 = r0.getErrorMessages()
            java.lang.Object r0 = mf.C6565s.o0(r0)
            io.intercom.android.sdk.ui.common.StringProvider$StringRes r0 = (io.intercom.android.sdk.ui.common.StringProvider.StringRes) r0
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r1 = new io.intercom.android.sdk.survey.ValidationError$ValidationStringError
            int r2 = r0.getStringRes()
            java.util.List r0 = r0.getParams()
            r1.<init>(r2, r0)
            goto L_0x026d
        L_0x026b:
            io.intercom.android.sdk.survey.ValidationError$NoValidationError r1 = io.intercom.android.sdk.survey.ValidationError.NoValidationError.INSTANCE
        L_0x026d:
            r5.setValidationError(r1)
            goto L_0x0276
        L_0x0271:
            io.intercom.android.sdk.survey.ValidationError$NoValidationError r0 = io.intercom.android.sdk.survey.ValidationError.NoValidationError.INSTANCE
            r5.setValidationError(r0)
        L_0x0276:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.QuestionState.validate():void");
    }
}
