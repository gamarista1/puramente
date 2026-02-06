package io.intercom.android.sdk.survey.ui.questiontype.files;

import V0.p;
import Y.C1500m;
import Y.M0;
import io.intercom.android.sdk.survey.QuestionState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/survey/QuestionState;", "questionState", "LV0/p;", "questionFontWeight", "Lc1/v;", "questionFontSize", "Llf/M;", "UploadFileQuestionHeader-INMd_9Y", "(Lio/intercom/android/sdk/survey/QuestionState;LV0/p;JLY/m;I)V", "UploadFileQuestionHeader", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UploadFileQuestionHeaderKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (r1 != null) goto L_0x0066;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: UploadFileQuestionHeader-INMd_9Y  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m502UploadFileQuestionHeaderINMd_9Y(io.intercom.android.sdk.survey.QuestionState r16, V0.p r17, long r18, Y.C1500m r20, int r21) {
        /*
            java.lang.String r0 = "questionState"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "questionFontWeight"
            r15 = r17
            kotlin.jvm.internal.C6496s.h(r15, r0)
            r0 = 43160084(0x2929214, float:2.1536617E-37)
            r1 = r20
            Y.m r0 = r1.h(r0)
            io.intercom.android.sdk.survey.ui.models.Answer r1 = r16.getAnswer()
            boolean r3 = r1 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer
            r4 = 0
            if (r3 == 0) goto L_0x0023
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer r1 = (io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer) r1
            goto L_0x0024
        L_0x0023:
            r1 = r4
        L_0x0024:
            if (r1 == 0) goto L_0x0062
            java.util.List r1 = r1.getMediaItems()
            if (r1 == 0) goto L_0x0062
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0032:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()
            r5 = r3
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem r5 = (io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.MediaItem) r5
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus r5 = r5.getUploadStatus()
            boolean r5 = r5 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error
            if (r5 == 0) goto L_0x0032
            r4 = r3
        L_0x0048:
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem r4 = (io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.MediaItem) r4
            if (r4 == 0) goto L_0x0062
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus r1 = r4.getUploadStatus()
            java.lang.String r3 = "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error"
            kotlin.jvm.internal.C6496s.f(r1, r3)
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$Error r1 = (io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error) r1
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadError r1 = r1.getError()
            java.util.List r1 = r1.getErrorMessages()
            if (r1 == 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            java.util.List r1 = mf.C6565s.n()
        L_0x0066:
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r3 = r16.getQuestionModel()
            java.util.List r3 = r3.getTitle()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r4 = r16.getQuestionModel()
            io.intercom.android.sdk.ui.common.StringProvider r4 = r4.getDescription()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r5 = r16.getQuestionModel()
            boolean r5 = r5.isRequired()
            io.intercom.android.sdk.survey.ValidationError r6 = r16.getValidationError()
            io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt$UploadFileQuestionHeader$1 r7 = new io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt$UploadFileQuestionHeader$1
            r7.<init>(r1)
            r1 = 54
            r8 = 1052404026(0x3eba693a, float:0.36408406)
            r9 = 1
            g0.a r10 = g0.c.e(r8, r9, r7, r0, r1)
            int r1 = io.intercom.android.sdk.ui.common.StringProvider.$stable
            int r1 = r1 << 3
            r7 = 1572872(0x180008, float:2.204063E-39)
            r1 = r1 | r7
            int r7 = r21 << 9
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r7
            r1 = r1 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r8
            r13 = r1 | r7
            r14 = 128(0x80, float:1.794E-43)
            r11 = 0
            r7 = r17
            r8 = r18
            r12 = r0
            io.intercom.android.sdk.survey.ui.components.QuestionHeaderComponentKt.m468QuestionHeadern1tc1qA(r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            Y.Y0 r0 = r0.k()
            if (r0 == 0) goto L_0x00c7
            io.intercom.android.sdk.survey.ui.questiontype.files.G r7 = new io.intercom.android.sdk.survey.ui.questiontype.files.G
            r1 = r7
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r21
            r1.<init>(r2, r3, r4, r6)
            r0.a(r7)
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt.m502UploadFileQuestionHeaderINMd_9Y(io.intercom.android.sdk.survey.QuestionState, V0.p, long, Y.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M UploadFileQuestionHeader_INMd_9Y$lambda$2(QuestionState questionState, p pVar, long j10, int i10, C1500m mVar, int i11) {
        C6496s.h(questionState, "$questionState");
        C6496s.h(pVar, "$questionFontWeight");
        m502UploadFileQuestionHeaderINMd_9Y(questionState, pVar, j10, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
