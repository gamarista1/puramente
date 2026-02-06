package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"formatAnswerForServer", "", "questionState", "Lio/intercom/android/sdk/survey/QuestionState;", "EmailId", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CreateTicketViewModelKt {
    public static final String EmailId = "-1";

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType[] r0 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final Object formatAnswerForServer(QuestionState questionState) {
        Answer answer = questionState.getAnswer();
        if (answer instanceof Answer.DateTimeAnswer) {
            return ((Answer.DateTimeAnswer) answer).getAnswer();
        }
        if (answer instanceof Answer.MultipleAnswer) {
            return ((Answer.MultipleAnswer) answer).getAnswers().toString();
        }
        if (C6496s.c(answer, Answer.NoAnswer.InitialNoAnswer.INSTANCE) || C6496s.c(answer, Answer.NoAnswer.ResetNoAnswer.INSTANCE)) {
            return C6514M.f71813a;
        }
        if (answer instanceof Answer.SingleAnswer) {
            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
            if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                return Boolean.valueOf(Boolean.parseBoolean(((Answer.SingleAnswer) answer).getAnswer()));
            }
            if (!(questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel)) {
                return ((Answer.SingleAnswer) answer).getAnswer();
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[((SurveyData.Step.Question.ShortTextQuestionModel) questionModel).getValidationType().ordinal()];
            if (i10 == 1) {
                return Integer.valueOf(Integer.parseInt(((Answer.SingleAnswer) answer).getAnswer()));
            }
            if (i10 == 2) {
                return Float.valueOf(Float.parseFloat(((Answer.SingleAnswer) answer).getAnswer()));
            }
            if (i10 != 3) {
                return ((Answer.SingleAnswer) answer).getAnswer();
            }
            return Integer.valueOf(Integer.parseInt(((Answer.SingleAnswer) answer).getAnswer()));
        } else if (answer instanceof Answer.MediaAnswer) {
            ArrayList arrayList = new ArrayList();
            Iterable<Answer.MediaAnswer.MediaItem> mediaItems = ((Answer.MediaAnswer) answer).getMediaItems();
            ArrayList<Answer.MediaAnswer.FileUploadStatus> arrayList2 = new ArrayList<>(C6565s.y(mediaItems, 10));
            for (Answer.MediaAnswer.MediaItem uploadStatus : mediaItems) {
                arrayList2.add(uploadStatus.getUploadStatus());
            }
            for (Answer.MediaAnswer.FileUploadStatus fileUploadStatus : arrayList2) {
                if (fileUploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) {
                    arrayList.add(Integer.valueOf(((Answer.MediaAnswer.FileUploadStatus.Success) fileUploadStatus).getId()));
                }
            }
            return arrayList;
        } else {
            throw new C6535s();
        }
    }
}
