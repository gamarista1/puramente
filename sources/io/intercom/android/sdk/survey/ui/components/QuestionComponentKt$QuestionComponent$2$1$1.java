package io.intercom.android.sdk.survey.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class QuestionComponentKt$QuestionComponent$2$1$1 implements p {
    final /* synthetic */ long $questionFontSize;
    final /* synthetic */ V0.p $questionFontWeight;
    final /* synthetic */ QuestionState $questionState;

    QuestionComponentKt$QuestionComponent$2$1$1(QuestionState questionState, V0.p pVar, long j10) {
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
            UploadFileQuestionHeaderKt.m502UploadFileQuestionHeaderINMd_9Y(this.$questionState, this.$questionFontWeight, this.$questionFontSize, mVar, 8);
        } else {
            mVar.I();
        }
    }
}
