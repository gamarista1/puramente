package io.intercom.android.sdk.survey.ui.questiontype.files;

import V.B0;
import V.O0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g0.c;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import x.C2868g;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ae\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$UploadFileQuestionModel;", "questionModel", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "Lkotlin/Function1;", "Llf/M;", "onAnswer", "Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "onAnswerClick", "Lkotlin/Function0;", "questionHeader", "UploadFileQuestion", "(Lk0/i;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$UploadFileQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lyf/l;Lyf/l;Lyf/p;LY/m;II)V", "UploadFileQuestionPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UploadFileQuestionKt {
    public static final void UploadFileQuestion(i iVar, SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel, Answer answer, C6798l lVar, C6798l lVar2, p pVar, C1500m mVar, int i10, int i11) {
        i.a aVar;
        Answer.NoAnswer.InitialNoAnswer initialNoAnswer;
        H h10;
        p pVar2;
        C6496s.h(uploadFileQuestionModel, "questionModel");
        C6496s.h(lVar, "onAnswer");
        C1500m h11 = mVar.h(1688907441);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            initialNoAnswer = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
        } else {
            initialNoAnswer = answer;
        }
        if ((i11 & 16) != 0) {
            h10 = new H();
        } else {
            h10 = lVar2;
        }
        if ((i11 & 32) != 0) {
            pVar2 = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m499getLambda1$intercom_sdk_base_release();
        } else {
            pVar2 = pVar;
        }
        O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, c.e(1739158412, true, new UploadFileQuestionKt$UploadFileQuestion$2(aVar, pVar2, initialNoAnswer, uploadFileQuestionModel, h10, lVar, (Context) h11.m(AndroidCompositionLocals_androidKt.g())), h11, 54), h11, 12582912, 127);
        Y0 k10 = h11.k();
        if (k10 != null) {
            k10.a(new I(aVar, uploadFileQuestionModel, initialNoAnswer, lVar, h10, pVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UploadFileQuestion$lambda$0(AnswerClickData answerClickData) {
        C6496s.h(answerClickData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M UploadFileQuestion$lambda$1(i iVar, SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel, Answer answer, C6798l lVar, C6798l lVar2, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(uploadFileQuestionModel, "$questionModel");
        C6496s.h(lVar, "$onAnswer");
        UploadFileQuestion(iVar, uploadFileQuestionModel, answer, lVar, lVar2, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void UploadFileQuestionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(21672603);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$UploadFileQuestionKt.INSTANCE.m500getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new J(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UploadFileQuestionPreview$lambda$2(int i10, C1500m mVar, int i11) {
        UploadFileQuestionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
