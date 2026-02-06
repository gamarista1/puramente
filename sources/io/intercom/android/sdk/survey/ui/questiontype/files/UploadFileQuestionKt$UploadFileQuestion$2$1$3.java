package io.intercom.android.sdk.survey.ui.questiontype.files;

import Y.C1500m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.model.SurveyData;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class UploadFileQuestionKt$UploadFileQuestion$2$1$3 implements p {
    final /* synthetic */ SurveyData.Step.Question.UploadFileQuestionModel $questionModel;

    UploadFileQuestionKt$UploadFileQuestion$2$1$3(SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel) {
        this.$questionModel = uploadFileQuestionModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            AddFileButtonKt.AddFileButton((i) null, this.$questionModel.getMaxSelection() == 1 ? R.string.intercom_tickets_add_file : R.string.intercom_tickets_add_files, mVar, 0, 1);
        } else {
            mVar.I();
        }
    }
}
