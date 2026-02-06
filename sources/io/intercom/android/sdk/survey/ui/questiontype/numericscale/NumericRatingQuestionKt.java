package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import g0.c;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.Y;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0010\u001a/\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel;", "numericRatingQuestionModel", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "Lkotlin/Function1;", "Llf/M;", "onAnswer", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "colors", "Lkotlin/Function0;", "questionHeader", "NumericRatingQuestion", "(Lk0/i;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lyf/l;Lio/intercom/android/sdk/survey/SurveyUiColors;Lyf/p;LY/m;II)V", "NPSQuestionPreview", "(LY/m;I)V", "StarQuestionPreview", "EmojiRatingQuestionPreview", "", "start", "end", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;", "questionSubType", "GeneratePreview", "(IILio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;Lio/intercom/android/sdk/survey/ui/models/Answer;LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NumericRatingQuestionKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType[] r0 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionData.QuestionSubType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionData.QuestionSubType.NPS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionData.QuestionSubType.UNSUPPORTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionData.QuestionSubType.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionData.QuestionSubType.STARS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt.WhenMappings.<clinit>():void");
        }
    }

    public static final void EmojiRatingQuestionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1678291132);
        if (i10 != 0 || !h10.i()) {
            GeneratePreview(1, 5, SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI, new Answer.SingleAnswer("4"), h10, 438);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new p(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmojiRatingQuestionPreview$lambda$16(int i10, C1500m mVar, int i11) {
        EmojiRatingQuestionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void GeneratePreview(int i10, int i11, SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, Answer answer, C1500m mVar, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C1500m h10 = mVar.h(-1397971036);
        if ((i12 & 14) == 0) {
            if (h10.d(i10)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i13 = i17 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (h10.d(i11)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i13 |= i16;
        }
        if ((i12 & 896) == 0) {
            if (h10.S(questionSubType)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        if ((i12 & 7168) == 0) {
            if (h10.S(answer)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 5851) != 1170 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(-2103292486, true, new NumericRatingQuestionKt$GeneratePreview$1(questionSubType, i10, i11, answer), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new j(i10, i11, questionSubType, answer, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M GeneratePreview$lambda$17(int i10, int i11, SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, Answer answer, int i12, C1500m mVar, int i13) {
        C6496s.h(questionSubType, "$questionSubType");
        C6496s.h(answer, "$answer");
        GeneratePreview(i10, i11, questionSubType, answer, mVar, M0.a(i12 | 1));
        return C6514M.f71813a;
    }

    public static final void NPSQuestionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-752808306);
        if (i10 != 0 || !h10.i()) {
            GeneratePreview(0, 10, SurveyData.Step.Question.QuestionData.QuestionSubType.NPS, new Answer.SingleAnswer("4"), h10, 438);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new k(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NPSQuestionPreview$lambda$14(int i10, C1500m mVar, int i11) {
        NPSQuestionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: io.intercom.android.sdk.survey.ui.models.Answer$NoAnswer$InitialNoAnswer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void NumericRatingQuestion(k0.i r62, io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel r63, io.intercom.android.sdk.survey.ui.models.Answer r64, yf.C6798l r65, io.intercom.android.sdk.survey.SurveyUiColors r66, yf.p r67, Y.C1500m r68, int r69, int r70) {
        /*
            r4 = r65
            r7 = r69
            r1 = 4
            java.lang.String r2 = "numericRatingQuestionModel"
            r3 = r63
            kotlin.jvm.internal.C6496s.h(r3, r2)
            java.lang.String r2 = "onAnswer"
            kotlin.jvm.internal.C6496s.h(r4, r2)
            java.lang.String r2 = "colors"
            r5 = r66
            kotlin.jvm.internal.C6496s.h(r5, r2)
            r2 = -1325570147(0xffffffffb0fd679d, float:-1.8437621E-9)
            r6 = r68
            Y.m r2 = r6.h(r2)
            r6 = 1
            r8 = r70 & 1
            if (r8 == 0) goto L_0x002a
            k0.i$a r8 = k0.i.f23074a
            r15 = r8
            goto L_0x002c
        L_0x002a:
            r15 = r62
        L_0x002c:
            r8 = r70 & 4
            if (r8 == 0) goto L_0x0034
            io.intercom.android.sdk.survey.ui.models.Answer$NoAnswer$InitialNoAnswer r8 = io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer.InitialNoAnswer.INSTANCE
            r14 = r8
            goto L_0x0036
        L_0x0034:
            r14 = r64
        L_0x0036:
            r8 = r70 & 32
            if (r8 == 0) goto L_0x0042
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.ComposableSingletons$NumericRatingQuestionKt r8 = io.intercom.android.sdk.survey.ui.questiontype.numericscale.ComposableSingletons$NumericRatingQuestionKt.INSTANCE
            yf.p r8 = r8.m503getLambda1$intercom_sdk_base_release()
            r12 = r8
            goto L_0x0044
        L_0x0042:
            r12 = r67
        L_0x0044:
            k0.c$a r8 = k0.c.f23044a
            k0.c r9 = r8.o()
            r13 = 0
            H0.F r9 = androidx.compose.foundation.layout.d.h(r9, r13)
            int r10 = Y.C1494j.a(r2, r13)
            Y.y r11 = r2.p()
            k0.i r1 = k0.h.e(r2, r15)
            J0.g$a r16 = J0.C1241g.f3853J
            yf.a r0 = r16.a()
            Y.f r18 = r2.j()
            if (r18 != 0) goto L_0x006a
            Y.C1494j.c()
        L_0x006a:
            r2.F()
            boolean r18 = r2.f()
            if (r18 == 0) goto L_0x0077
            r2.U(r0)
            goto L_0x007a
        L_0x0077:
            r2.q()
        L_0x007a:
            Y.m r0 = Y.F1.a(r2)
            yf.p r6 = r16.c()
            Y.F1.b(r0, r9, r6)
            yf.p r6 = r16.e()
            Y.F1.b(r0, r11, r6)
            yf.p r6 = r16.b()
            boolean r9 = r0.f()
            if (r9 != 0) goto L_0x00a4
            java.lang.Object r9 = r0.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r11)
            if (r9 != 0) goto L_0x00b2
        L_0x00a4:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.r(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.V(r9, r6)
        L_0x00b2:
            yf.p r6 = r16.d()
            Y.F1.b(r0, r1, r6)
            androidx.compose.foundation.layout.f r0 = androidx.compose.foundation.layout.f.f12848a
            k0.i$a r0 = k0.i.f23074a
            C.c r1 = C.C1085c.f882a
            C.c$m r6 = r1.g()
            k0.c$b r9 = r8.k()
            H0.F r6 = C.C1090h.a(r6, r9, r2, r13)
            int r9 = Y.C1494j.a(r2, r13)
            Y.y r10 = r2.p()
            k0.i r11 = k0.h.e(r2, r0)
            yf.a r13 = r16.a()
            Y.f r18 = r2.j()
            if (r18 != 0) goto L_0x00e4
            Y.C1494j.c()
        L_0x00e4:
            r2.F()
            boolean r18 = r2.f()
            if (r18 == 0) goto L_0x00f1
            r2.U(r13)
            goto L_0x00f4
        L_0x00f1:
            r2.q()
        L_0x00f4:
            Y.m r13 = Y.F1.a(r2)
            yf.p r3 = r16.c()
            Y.F1.b(r13, r6, r3)
            yf.p r3 = r16.e()
            Y.F1.b(r13, r10, r3)
            yf.p r3 = r16.b()
            boolean r6 = r13.f()
            if (r6 != 0) goto L_0x011e
            java.lang.Object r6 = r13.A()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r10)
            if (r6 != 0) goto L_0x012c
        L_0x011e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r13.r(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r13.V(r6, r3)
        L_0x012c:
            yf.p r3 = r16.d()
            Y.F1.b(r13, r11, r3)
            C.k r3 = C.C1093k.f978a
            int r3 = r7 >> 15
            r3 = r3 & 14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.invoke(r2, r3)
            r3 = 16
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            k0.i r3 = androidx.compose.foundation.layout.q.i(r0, r3)
            r6 = 6
            C.a0.a(r3, r2, r6)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType r3 = r63.getQuestionSubType()
            int[] r9 = io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r9[r3]
            java.lang.String r13 = "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption"
            r11 = 0
            r9 = 0
            r10 = 8
            r18 = r15
            r15 = 2
            r6 = 1
            if (r3 == r6) goto L_0x0361
            if (r3 == r15) goto L_0x0361
            r6 = 3
            if (r3 == r6) goto L_0x0361
            r6 = 4
            if (r3 == r6) goto L_0x01cc
            r0 = 5
            if (r3 != r0) goto L_0x01bd
            r0 = 126368681(0x7883ba9, float:2.049807E-34)
            r2.T(r0)
            java.util.List r0 = r63.getOptions()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = mf.C6565s.y(r0, r3)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x018d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01a4
            java.lang.Object r3 = r0.next()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption r3 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption) r3
            java.lang.String r6 = "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption"
            kotlin.jvm.internal.C6496s.f(r3, r6)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$EmojiRatingOption r3 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption) r3
            r1.add(r3)
            goto L_0x018d
        L_0x01a4:
            r3 = 3
            int r0 = r7 >> 3
            r3 = r0 & 112(0x70, float:1.57E-43)
            r3 = r3 | r10
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiQuestionKt.EmojiQuestion(r1, r14, r4, r2, r0)
            r2.M()
            lf.M r0 = lf.C6514M.f71813a
            r0 = r11
            r58 = r12
            r3 = r14
            r61 = r18
            goto L_0x0562
        L_0x01bd:
            r0 = 3944735(0x3c311f, float:5.527751E-39)
            r2.T(r0)
            r2.M()
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x01cc:
            r3 = 124701005(0x76ec94d, float:1.7964287E-34)
            r2.T(r3)
            r3 = 1
            k0.i r0 = androidx.compose.foundation.layout.q.h(r0, r9, r3, r11)
            C.c$f r1 = r1.b()
            k0.c$c r3 = r8.l()
            r6 = 6
            H0.F r1 = C.W.b(r1, r3, r2, r6)
            r3 = 0
            int r6 = Y.C1494j.a(r2, r3)
            Y.y r8 = r2.p()
            k0.i r0 = k0.h.e(r2, r0)
            yf.a r3 = r16.a()
            Y.f r17 = r2.j()
            if (r17 != 0) goto L_0x01fe
            Y.C1494j.c()
        L_0x01fe:
            r2.F()
            boolean r17 = r2.f()
            if (r17 == 0) goto L_0x020b
            r2.U(r3)
            goto L_0x020e
        L_0x020b:
            r2.q()
        L_0x020e:
            Y.m r3 = Y.F1.a(r2)
            yf.p r9 = r16.c()
            Y.F1.b(r3, r1, r9)
            yf.p r1 = r16.e()
            Y.F1.b(r3, r8, r1)
            yf.p r1 = r16.b()
            boolean r8 = r3.f()
            if (r8 != 0) goto L_0x0238
            java.lang.Object r8 = r3.A()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r9)
            if (r8 != 0) goto L_0x0246
        L_0x0238:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r3.r(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.V(r6, r1)
        L_0x0246:
            yf.p r1 = r16.d()
            Y.F1.b(r3, r0, r1)
            C.Z r0 = C.Z.f873a
            r0 = -1421319679(0xffffffffab486201, float:-7.119028E-13)
            r2.T(r0)
            java.util.List r0 = r63.getOptions()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x025f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0349
            java.lang.Object r1 = r0.next()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption r1 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption) r1
            kotlin.jvm.internal.C6496s.f(r1, r13)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$NumericRatingOption r1 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption) r1
            boolean r3 = r14 instanceof io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer
            if (r3 == 0) goto L_0x0287
            int r3 = r1.getValue()
            r6 = r14
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r6 = (io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer) r6
            java.lang.String r6 = r6.getAnswer()
            int r6 = java.lang.Integer.parseInt(r6)
            if (r3 > r6) goto L_0x0287
            r3 = 1
            goto L_0x0288
        L_0x0287:
            r3 = 0
        L_0x0288:
            r6 = -1421310346(0xffffffffab488676, float:-7.1240876E-13)
            r2.T(r6)
            if (r3 == 0) goto L_0x029b
            long r8 = r66.m423getButton0d7_KjU()
            long r8 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(r8)
        L_0x0298:
            r19 = r8
            goto L_0x02a8
        L_0x029b:
            io.intercom.android.sdk.ui.theme.IntercomTheme r6 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r8 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r6 = r6.getColors(r2, r8)
            long r8 = r6.m678getBackground0d7_KjU()
            goto L_0x0298
        L_0x02a8:
            r2.M()
            long r21 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m713getAccessibleBorderColor8_81llA(r19)
            if (r3 == 0) goto L_0x02b7
            float r3 = (float) r15
            float r3 = c1.h.j(r3)
            goto L_0x02bd
        L_0x02b7:
            r3 = 1
            float r6 = (float) r3
            float r3 = c1.h.j(r6)
        L_0x02bd:
            k0.i$a r6 = k0.i.f23074a
            r8 = 44
            float r8 = (float) r8
            float r9 = c1.h.j(r8)
            k0.i r6 = androidx.compose.foundation.layout.q.r(r6, r9)
            float r8 = c1.h.j(r8)
            k0.i r6 = androidx.compose.foundation.layout.q.i(r6, r8)
            float r8 = (float) r10
            float r8 = c1.h.j(r8)
            k0.i r23 = androidx.compose.foundation.layout.n.i(r6, r8)
            r6 = 268698463(0x1004035f, float:2.6035007E-29)
            r2.T(r6)
            boolean r6 = r2.S(r1)
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 ^ 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r8 <= r9) goto L_0x02f3
            boolean r8 = r2.S(r4)
            if (r8 != 0) goto L_0x02f7
        L_0x02f3:
            r8 = r7 & 3072(0xc00, float:4.305E-42)
            if (r8 != r9) goto L_0x02f9
        L_0x02f7:
            r8 = 1
            goto L_0x02fa
        L_0x02f9:
            r8 = 0
        L_0x02fa:
            r6 = r6 | r8
            java.lang.Object r8 = r2.A()
            if (r6 != 0) goto L_0x0309
            Y.m$a r6 = Y.C1500m.f10026a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x0311
        L_0x0309:
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.n r8 = new io.intercom.android.sdk.survey.ui.questiontype.numericscale.n
            r8.<init>(r1, r4)
            r2.r(r8)
        L_0x0311:
            r27 = r8
            yf.a r27 = (yf.C6787a) r27
            r2.M()
            r28 = 7
            r29 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            k0.i r8 = androidx.compose.foundation.d.d(r23, r24, r25, r26, r27, r28, r29)
            r1 = 0
            r16 = 0
            r6 = 0
            r9 = r19
            r11 = r3
            r58 = r12
            r59 = r13
            r3 = 0
            r12 = r21
            r60 = r14
            r14 = r2
            r61 = r18
            r15 = r1
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.StarRatingKt.m505StarRatingtAjK0ZQ(r8, r9, r11, r12, r14, r15, r16)
            r12 = r58
            r13 = r59
            r14 = r60
            r10 = 8
            r11 = 0
            r15 = 2
            goto L_0x025f
        L_0x0349:
            r58 = r12
            r60 = r14
            r61 = r18
            r3 = 0
            r6 = 0
            r2.M()
            r2.u()
            r2.M()
            lf.M r0 = lf.C6514M.f71813a
            r3 = r60
            r0 = 0
            goto L_0x0562
        L_0x0361:
            r6 = r9
            r58 = r12
            r59 = r13
            r60 = r14
            r61 = r18
            r3 = 0
            r0 = 122317043(0x74a68f3, float:1.5227633E-34)
            r2.T(r0)
            java.util.List r0 = r63.getOptions()
            int r0 = r0.size()
            Y.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
            java.lang.Object r1 = r2.m(r1)
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            int r1 = r1.screenWidthDp
            int r1 = r1 + -60
            int r1 = r1 / 60
            double r8 = (double) r0
            double r0 = (double) r1
            double r0 = r8 / r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            double r0 = (double) r0
            double r8 = r8 / r0
            double r0 = java.lang.Math.ceil(r8)
            int r0 = (int) r0
            java.util.List r1 = r63.getOptions()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = mf.C6565s.d0(r1, r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x03a9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x055a
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            k0.i$a r8 = k0.i.f23074a
            r9 = 1
            r15 = 0
            k0.i r8 = androidx.compose.foundation.layout.q.h(r8, r6, r9, r15)
            C.c$a r9 = C.C1085c.a.f891a
            C.c$e r9 = r9.a()
            k0.c$a r10 = k0.c.f23044a
            k0.c$c r10 = r10.l()
            r11 = 6
            H0.F r9 = C.W.b(r9, r10, r2, r11)
            int r10 = Y.C1494j.a(r2, r3)
            Y.y r11 = r2.p()
            k0.i r8 = k0.h.e(r2, r8)
            J0.g$a r12 = J0.C1241g.f3853J
            yf.a r13 = r12.a()
            Y.f r14 = r2.j()
            if (r14 != 0) goto L_0x03e9
            Y.C1494j.c()
        L_0x03e9:
            r2.F()
            boolean r14 = r2.f()
            if (r14 == 0) goto L_0x03f6
            r2.U(r13)
            goto L_0x03f9
        L_0x03f6:
            r2.q()
        L_0x03f9:
            Y.m r13 = Y.F1.a(r2)
            yf.p r14 = r12.c()
            Y.F1.b(r13, r9, r14)
            yf.p r9 = r12.e()
            Y.F1.b(r13, r11, r9)
            yf.p r9 = r12.b()
            boolean r11 = r13.f()
            if (r11 != 0) goto L_0x0423
            java.lang.Object r11 = r13.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r14)
            if (r11 != 0) goto L_0x0431
        L_0x0423:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r13.r(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.V(r10, r9)
        L_0x0431:
            yf.p r9 = r12.d()
            Y.F1.b(r13, r8, r9)
            C.Z r8 = C.Z.f873a
            r8 = 268602155(0x10028b2b, float:2.574519E-29)
            r2.T(r8)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0446:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x0546
            java.lang.Object r8 = r1.next()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption r8 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption) r8
            r13 = r59
            kotlin.jvm.internal.C6496s.f(r8, r13)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$NumericRatingOption r8 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption) r8
            r14 = r60
            boolean r9 = r14 instanceof io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer
            if (r9 == 0) goto L_0x0476
            r9 = r14
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r9 = (io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer) r9
            java.lang.String r9 = r9.getAnswer()
            int r10 = r8.getValue()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r10)
            if (r9 == 0) goto L_0x0476
            r9 = 1
            goto L_0x0477
        L_0x0476:
            r9 = r3
        L_0x0477:
            r10 = 268611605(0x1002b015, float:2.5773628E-29)
            r2.T(r10)
            if (r9 == 0) goto L_0x048a
            long r10 = r66.m423getButton0d7_KjU()
            long r10 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(r10)
        L_0x0487:
            r16 = r10
            goto L_0x0497
        L_0x048a:
            io.intercom.android.sdk.ui.theme.IntercomTheme r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r11 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r10 = r10.getColors(r2, r11)
            long r10 = r10.m678getBackground0d7_KjU()
            goto L_0x0487
        L_0x0497:
            r2.M()
            long r10 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m713getAccessibleBorderColor8_81llA(r16)
            if (r9 == 0) goto L_0x04a8
            r12 = 2
            float r15 = (float) r12
            float r15 = c1.h.j(r15)
            r12 = r15
            goto L_0x04ae
        L_0x04a8:
            r15 = 1
            float r12 = (float) r15
            float r12 = c1.h.j(r12)
        L_0x04ae:
            if (r9 == 0) goto L_0x04b8
            V0.p$a r9 = V0.p.f8210b
            V0.p r9 = r9.a()
        L_0x04b6:
            r15 = r9
            goto L_0x04bf
        L_0x04b8:
            V0.p$a r9 = V0.p.f8210b
            V0.p r9 = r9.c()
            goto L_0x04b6
        L_0x04bf:
            int r9 = r8.getValue()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            k0.i$a r3 = k0.i.f23074a
            r23 = r0
            r6 = 4
            float r0 = (float) r6
            float r0 = c1.h.j(r0)
            k0.i r25 = androidx.compose.foundation.layout.n.i(r3, r0)
            r0 = -1805377699(0xffffffff94641f5d, float:-1.1517244E-26)
            r2.T(r0)
            r0 = r7 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r0 <= r3) goto L_0x04e9
            boolean r0 = r2.S(r4)
            if (r0 != 0) goto L_0x04ed
        L_0x04e9:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            if (r0 != r3) goto L_0x04ef
        L_0x04ed:
            r0 = 1
            goto L_0x04f0
        L_0x04ef:
            r0 = 0
        L_0x04f0:
            boolean r18 = r2.S(r8)
            r0 = r0 | r18
            java.lang.Object r3 = r2.A()
            if (r0 != 0) goto L_0x0504
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x050c
        L_0x0504:
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.m r3 = new io.intercom.android.sdk.survey.ui.questiontype.numericscale.m
            r3.<init>(r4, r8)
            r2.r(r3)
        L_0x050c:
            r29 = r3
            yf.a r29 = (yf.C6787a) r29
            r2.M()
            r30 = 7
            r31 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            k0.i r0 = androidx.compose.foundation.d.d(r25, r26, r27, r28, r29, r30, r31)
            r21 = 0
            r22 = 192(0xc0, float:2.69E-43)
            r18 = 0
            r25 = 0
            r8 = r9
            r9 = r0
            r0 = 2
            r27 = r13
            r3 = r14
            r13 = r16
            r0 = 0
            r16 = r18
            r18 = r25
            r20 = r2
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingCellKt.m504NumericRatingCelljWvj134(r8, r9, r10, r12, r13, r15, r16, r18, r20, r21, r22)
            r15 = r0
            r60 = r3
            r0 = r23
            r59 = r27
            r3 = 0
            r6 = 0
            goto L_0x0446
        L_0x0546:
            r23 = r0
            r0 = r15
            r27 = r59
            r3 = r60
            r6 = 4
            r2.M()
            r2.u()
            r0 = r23
            r3 = 0
            r6 = 0
            goto L_0x03a9
        L_0x055a:
            r3 = r60
            r0 = 0
            r2.M()
            lf.M r1 = lf.C6514M.f71813a
        L_0x0562:
            r1 = 4087291(0x3e5dfb, float:5.727515E-39)
            r2.T(r1)
            java.lang.String r1 = r63.getLowerLabel()
            boolean r1 = Sg.p.d0(r1)
            r6 = 1
            r1 = r1 ^ r6
            java.lang.String r8 = r63.getUpperLabel()
            boolean r8 = Sg.p.d0(r8)
            r8 = r8 ^ r6
            r1 = r1 & r8
            if (r1 == 0) goto L_0x06cf
            k0.i$a r1 = k0.i.f23074a
            r8 = 0
            k0.i r0 = androidx.compose.foundation.layout.q.h(r1, r8, r6, r0)
            r1 = 8
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
            k0.i r0 = androidx.compose.foundation.layout.n.i(r0, r1)
            C.c r1 = C.C1085c.f882a
            C.c$f r1 = r1.d()
            k0.c$a r6 = k0.c.f23044a
            k0.c$c r6 = r6.l()
            r8 = 6
            H0.F r1 = C.W.b(r1, r6, r2, r8)
            r6 = 0
            int r8 = Y.C1494j.a(r2, r6)
            Y.y r6 = r2.p()
            k0.i r0 = k0.h.e(r2, r0)
            J0.g$a r9 = J0.C1241g.f3853J
            yf.a r10 = r9.a()
            Y.f r11 = r2.j()
            if (r11 != 0) goto L_0x05bd
            Y.C1494j.c()
        L_0x05bd:
            r2.F()
            boolean r11 = r2.f()
            if (r11 == 0) goto L_0x05ca
            r2.U(r10)
            goto L_0x05cd
        L_0x05ca:
            r2.q()
        L_0x05cd:
            Y.m r10 = Y.F1.a(r2)
            yf.p r11 = r9.c()
            Y.F1.b(r10, r1, r11)
            yf.p r1 = r9.e()
            Y.F1.b(r10, r6, r1)
            yf.p r1 = r9.b()
            boolean r6 = r10.f()
            if (r6 != 0) goto L_0x05f7
            java.lang.Object r6 = r10.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r11)
            if (r6 != 0) goto L_0x0605
        L_0x05f7:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r10.r(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r10.V(r6, r1)
        L_0x0605:
            yf.p r1 = r9.d()
            Y.F1.b(r10, r0, r1)
            C.Z r0 = C.Z.f873a
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType r0 = r63.getQuestionSubType()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI
            if (r0 != r1) goto L_0x0628
            java.lang.String r0 = r63.getLowerLabel()
            java.lang.String r1 = r63.getUpperLabel()
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = mf.C6565s.q(r0)
        L_0x0626:
            r1 = 0
            goto L_0x0667
        L_0x0628:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r63.getScaleStart()
            r0.append(r1)
            java.lang.String r1 = " - "
            r0.append(r1)
            java.lang.String r6 = r63.getLowerLabel()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r8 = r63.getScaleEnd()
            r6.append(r8)
            r6.append(r1)
            java.lang.String r1 = r63.getUpperLabel()
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = mf.C6565s.q(r0)
            goto L_0x0626
        L_0x0667:
            java.lang.Object r1 = r0.get(r1)
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            r33 = r0
            java.lang.String r33 = (java.lang.String) r33
            r31 = 0
            r32 = 131070(0x1fffe, float:1.83668E-40)
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r29 = r2
            V.T0.b(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r56 = 0
            r57 = 131070(0x1fffe, float:1.83668E-40)
            r34 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r55 = 0
            r54 = r2
            V.T0.b(r33, r34, r35, r37, r39, r40, r41, r42, r44, r45, r46, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            r2.u()
        L_0x06cf:
            r2.M()
            r2.u()
            r2.u()
            Y.Y0 r9 = r2.k()
            if (r9 == 0) goto L_0x06f5
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.o r10 = new io.intercom.android.sdk.survey.ui.questiontype.numericscale.o
            r0 = r10
            r1 = r61
            r2 = r63
            r4 = r65
            r5 = r66
            r6 = r58
            r7 = r69
            r8 = r70
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x06f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt.NumericRatingQuestion(k0.i, io.intercom.android.sdk.survey.model.SurveyData$Step$Question$NumericRatingQuestionModel, io.intercom.android.sdk.survey.ui.models.Answer, yf.l, io.intercom.android.sdk.survey.SurveyUiColors, yf.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(C6798l lVar, SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption) {
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(numericRatingOption, "$option");
        lVar.invoke(new Answer.SingleAnswer(String.valueOf(numericRatingOption.getValue())));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5(SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption, C6798l lVar) {
        C6496s.h(numericRatingOption, "$currentRating");
        C6496s.h(lVar, "$onAnswer");
        lVar.invoke(new Answer.SingleAnswer(String.valueOf(numericRatingOption.getValue())));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M NumericRatingQuestion$lambda$13(i iVar, SurveyData.Step.Question.NumericRatingQuestionModel numericRatingQuestionModel, Answer answer, C6798l lVar, SurveyUiColors surveyUiColors, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(numericRatingQuestionModel, "$numericRatingQuestionModel");
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(surveyUiColors, "$colors");
        NumericRatingQuestion(iVar, numericRatingQuestionModel, answer, lVar, surveyUiColors, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void StarQuestionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1791167217);
        if (i10 != 0 || !h10.i()) {
            GeneratePreview(1, 5, SurveyData.Step.Question.QuestionData.QuestionSubType.STARS, new Answer.MultipleAnswer(Y.j("1", "2"), (Answer.MultipleAnswer.OtherAnswer) null, 2, (DefaultConstructorMarker) null), h10, 4534);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new l(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M StarQuestionPreview$lambda$15(int i10, C1500m mVar, int i11) {
        StarQuestionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
