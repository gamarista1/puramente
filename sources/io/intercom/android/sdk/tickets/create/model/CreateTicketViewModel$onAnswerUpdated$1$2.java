package io.intercom.android.sdk.tickets.create.model;

import Ug.K;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerUpdated$1$2", f = "CreateTicketViewModel.kt", l = {}, m = "invokeSuspend")
final class CreateTicketViewModel$onAnswerUpdated$1$2 extends l implements p {
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState.Content $content;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CreateTicketViewModel$onAnswerUpdated$1$2(CreateTicketViewModel.CreateTicketFormUiState.Content content, CreateTicketViewModel createTicketViewModel, C6658d<? super CreateTicketViewModel$onAnswerUpdated$1$2> dVar) {
        super(2, dVar);
        this.$content = content;
        this.this$0 = createTicketViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new CreateTicketViewModel$onAnswerUpdated$1$2(this.$content, this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((CreateTicketViewModel$onAnswerUpdated$1$2) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            ArrayList<QuestionState> arrayList = new ArrayList<>();
            for (Object next : this.$content.getQuestions()) {
                if (((QuestionState) next).getQuestionModel() instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                    arrayList.add(next);
                }
            }
            CreateTicketViewModel createTicketViewModel = this.this$0;
            for (QuestionState questionState : arrayList) {
                SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                C6496s.f(questionModel, "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.UploadFileQuestionModel");
                SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel = (SurveyData.Step.Question.UploadFileQuestionModel) questionModel;
                Answer answer = questionState.getAnswer();
                if (answer instanceof Answer.MediaAnswer) {
                    Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                    int i10 = 0;
                    for (Object next2 : mediaAnswer.getMediaItems()) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            C6565s.x();
                        }
                        Answer.MediaAnswer.MediaItem mediaItem = (Answer.MediaAnswer.MediaItem) next2;
                        if (i10 >= uploadFileQuestionModel.getMaxSelection()) {
                            mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(C6565s.q(new StringProvider.StringRes(R.string.intercom_upload_failed, (List) null, 2, (DefaultConstructorMarker) null), new StringProvider.StringRes(R.string.intercom_upload_max_files_allowed, C6565s.e(C6502A.a("limit", String.valueOf(uploadFileQuestionModel.getMaxSelection()))))))));
                        } else if (createTicketViewModel.isUnsupportedFileType(mediaItem.getData(), uploadFileQuestionModel.getSupportedFileType())) {
                            mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.UnsupportedFileType(C6565s.e(new StringProvider.StringRes(R.string.intercom_upload_failed, (List) null, 2, (DefaultConstructorMarker) null)))));
                        } else if (C6496s.c(mediaItem.getUploadStatus(), Answer.MediaAnswer.FileUploadStatus.None.INSTANCE)) {
                            mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE);
                        } else if (createTicketViewModel.canRetryFileLimitExceededError(mediaItem, i10, uploadFileQuestionModel.getMaxSelection())) {
                            mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE);
                        }
                        i10 = i11;
                    }
                    createTicketViewModel.compressAndUploadFileAttachments(mediaAnswer.getMediaItems());
                    questionState.validate();
                }
            }
            this.this$0.updateCtaState();
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
