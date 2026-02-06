package io.intercom.android.sdk.survey.ui.questiontype.choice;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import g0.c;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
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
import r0.C2544x0;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aW\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$MultipleChoiceQuestionModel;", "multipleChoiceQuestionModel", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "Lkotlin/Function1;", "Llf/M;", "onAnswer", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "colors", "Lkotlin/Function0;", "questionHeader", "MultipleChoiceQuestion", "(Lk0/i;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$MultipleChoiceQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lyf/l;Lio/intercom/android/sdk/survey/SurveyUiColors;Lyf/p;LY/m;II)V", "MultipleChoiceQuestionPreview", "(LY/m;I)V", "MultipleChoiceQuestionPreviewDark", "surveyUiColors", "PreviewQuestion", "(Lio/intercom/android/sdk/survey/SurveyUiColors;LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultipleChoiceQuestionKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v45, resolved type: yf.l} */
    /* JADX WARNING: type inference failed for: r15v13, types: [java.util.Set] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void MultipleChoiceQuestion(k0.i r34, io.intercom.android.sdk.survey.model.SurveyData.Step.Question.MultipleChoiceQuestionModel r35, io.intercom.android.sdk.survey.ui.models.Answer r36, yf.C6798l r37, io.intercom.android.sdk.survey.SurveyUiColors r38, yf.p r39, Y.C1500m r40, int r41, int r42) {
        /*
            r4 = r37
            r7 = r41
            java.lang.String r0 = "multipleChoiceQuestionModel"
            r2 = r35
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "onAnswer"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "colors"
            r5 = r38
            kotlin.jvm.internal.C6496s.h(r5, r0)
            r0 = 928787358(0x375c2b9e, float:1.3123177E-5)
            r1 = r40
            Y.m r0 = r1.h(r0)
            r1 = 1
            r3 = r42 & 1
            if (r3 == 0) goto L_0x0028
            k0.i$a r3 = k0.i.f23074a
            goto L_0x002a
        L_0x0028:
            r3 = r34
        L_0x002a:
            r6 = r42 & 4
            if (r6 == 0) goto L_0x0031
            io.intercom.android.sdk.survey.ui.models.Answer$NoAnswer$InitialNoAnswer r6 = io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer.InitialNoAnswer.INSTANCE
            goto L_0x0033
        L_0x0031:
            r6 = r36
        L_0x0033:
            r8 = r42 & 32
            if (r8 == 0) goto L_0x003f
            io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$MultipleChoiceQuestionKt r8 = io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE
            yf.p r8 = r8.m480getLambda1$intercom_sdk_base_release()
            r14 = r8
            goto L_0x0041
        L_0x003f:
            r14 = r39
        L_0x0041:
            k0.c$a r8 = k0.c.f23044a
            k0.c r9 = r8.o()
            r15 = 0
            H0.F r9 = androidx.compose.foundation.layout.d.h(r9, r15)
            int r10 = Y.C1494j.a(r0, r15)
            Y.y r11 = r0.p()
            k0.i r12 = k0.h.e(r0, r3)
            J0.g$a r13 = J0.C1241g.f3853J
            yf.a r1 = r13.a()
            Y.f r16 = r0.j()
            if (r16 != 0) goto L_0x0067
            Y.C1494j.c()
        L_0x0067:
            r0.F()
            boolean r16 = r0.f()
            if (r16 == 0) goto L_0x0074
            r0.U(r1)
            goto L_0x0077
        L_0x0074:
            r0.q()
        L_0x0077:
            Y.m r1 = Y.F1.a(r0)
            yf.p r15 = r13.c()
            Y.F1.b(r1, r9, r15)
            yf.p r9 = r13.e()
            Y.F1.b(r1, r11, r9)
            yf.p r9 = r13.b()
            boolean r11 = r1.f()
            if (r11 != 0) goto L_0x00a1
            java.lang.Object r11 = r1.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r15)
            if (r11 != 0) goto L_0x00af
        L_0x00a1:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r1.r(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1.V(r10, r9)
        L_0x00af:
            yf.p r9 = r13.d()
            Y.F1.b(r1, r12, r9)
            androidx.compose.foundation.layout.f r1 = androidx.compose.foundation.layout.f.f12848a
            k0.i$a r1 = k0.i.f23074a
            C.c r9 = C.C1085c.f882a
            C.c$m r9 = r9.g()
            k0.c$b r8 = r8.k()
            r15 = 0
            H0.F r8 = C.C1090h.a(r9, r8, r0, r15)
            int r9 = Y.C1494j.a(r0, r15)
            Y.y r10 = r0.p()
            k0.i r1 = k0.h.e(r0, r1)
            yf.a r11 = r13.a()
            Y.f r12 = r0.j()
            if (r12 != 0) goto L_0x00e2
            Y.C1494j.c()
        L_0x00e2:
            r0.F()
            boolean r12 = r0.f()
            if (r12 == 0) goto L_0x00ef
            r0.U(r11)
            goto L_0x00f2
        L_0x00ef:
            r0.q()
        L_0x00f2:
            Y.m r11 = Y.F1.a(r0)
            yf.p r12 = r13.c()
            Y.F1.b(r11, r8, r12)
            yf.p r8 = r13.e()
            Y.F1.b(r11, r10, r8)
            yf.p r8 = r13.b()
            boolean r10 = r11.f()
            if (r10 != 0) goto L_0x011c
            java.lang.Object r10 = r11.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C6496s.c(r10, r12)
            if (r10 != 0) goto L_0x012a
        L_0x011c:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11.r(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.V(r9, r8)
        L_0x012a:
            yf.p r8 = r13.d()
            Y.F1.b(r11, r1, r8)
            C.k r1 = C.C1093k.f978a
            int r1 = r7 >> 15
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r0, r1)
            r1 = 1187769308(0x46cbebdc, float:26101.93)
            r0.T(r1)
            java.util.List r1 = r35.getOptions()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x014e:
            boolean r8 = r1.hasNext()
            r9 = 2
            r13 = 6
            r12 = 8
            r11 = 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0237
            java.lang.Object r8 = r1.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r15 = r6 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer
            if (r15 == 0) goto L_0x0170
            r15 = r6
            io.intercom.android.sdk.survey.ui.models.Answer$MultipleAnswer r15 = (io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer) r15
            java.util.Set r15 = r15.getAnswers()
            boolean r15 = r15.contains(r8)
            goto L_0x0171
        L_0x0170:
            r15 = 0
        L_0x0171:
            k0.i$a r10 = k0.i.f23074a
            float r12 = (float) r12
            float r12 = c1.h.j(r12)
            k0.i r10 = androidx.compose.foundation.layout.q.i(r10, r12)
            C.a0.a(r10, r0, r13)
            r10 = 1187778356(0x46cc0f34, float:26119.602)
            r0.T(r10)
            if (r15 == 0) goto L_0x0192
            long r12 = r38.m423getButton0d7_KjU()
            long r12 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(r12)
        L_0x018f:
            r16 = r12
            goto L_0x019f
        L_0x0192:
            io.intercom.android.sdk.ui.theme.IntercomTheme r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r12 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r10 = r10.getColors(r0, r12)
            long r12 = r10.m678getBackground0d7_KjU()
            goto L_0x018f
        L_0x019f:
            r0.M()
            long r12 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m713getAccessibleBorderColor8_81llA(r16)
            if (r15 == 0) goto L_0x01b0
            float r9 = (float) r9
            float r9 = c1.h.j(r9)
        L_0x01ad:
            r18 = r9
            goto L_0x01b7
        L_0x01b0:
            r9 = 1
            float r10 = (float) r9
            float r9 = c1.h.j(r10)
            goto L_0x01ad
        L_0x01b7:
            V0.p$a r9 = V0.p.f8210b
            if (r15 == 0) goto L_0x01c2
            V0.p r9 = r9.a()
        L_0x01bf:
            r19 = r9
            goto L_0x01c7
        L_0x01c2:
            V0.p r9 = r9.c()
            goto L_0x01bf
        L_0x01c7:
            r9 = -1655251098(0xffffffff9d56df66, float:-2.8438158E-21)
            r0.T(r9)
            r9 = r7 & 896(0x380, float:1.256E-42)
            r9 = r9 ^ 384(0x180, float:5.38E-43)
            if (r9 <= r11) goto L_0x01d9
            boolean r9 = r0.S(r6)
            if (r9 != 0) goto L_0x01dd
        L_0x01d9:
            r9 = r7 & 384(0x180, float:5.38E-43)
            if (r9 != r11) goto L_0x01df
        L_0x01dd:
            r9 = 1
            goto L_0x01e0
        L_0x01df:
            r9 = 0
        L_0x01e0:
            r10 = r7 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 ^ 3072(0xc00, float:4.305E-42)
            r11 = 2048(0x800, float:2.87E-42)
            if (r10 <= r11) goto L_0x01ee
            boolean r10 = r0.S(r4)
            if (r10 != 0) goto L_0x01f2
        L_0x01ee:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != r11) goto L_0x01f4
        L_0x01f2:
            r10 = 1
            goto L_0x01f5
        L_0x01f4:
            r10 = 0
        L_0x01f5:
            r9 = r9 | r10
            boolean r10 = r0.S(r8)
            r9 = r9 | r10
            java.lang.Object r10 = r0.A()
            if (r9 != 0) goto L_0x0209
            Y.m$a r9 = Y.C1500m.f10026a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x0211
        L_0x0209:
            io.intercom.android.sdk.survey.ui.questiontype.choice.k r10 = new io.intercom.android.sdk.survey.ui.questiontype.choice.k
            r10.<init>(r6, r4, r8)
            r0.r(r10)
        L_0x0211:
            r9 = r10
            yf.l r9 = (yf.C6798l) r9
            r0.M()
            r20 = 0
            r21 = 128(0x80, float:1.794E-43)
            r22 = 0
            r10 = r8
            r8 = r15
            r11 = r12
            r13 = r18
            r33 = r14
            r24 = 0
            r14 = r16
            r16 = r19
            r17 = r22
            r19 = r0
            io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt.m475ChoicePillUdaoDFU(r8, r9, r10, r11, r13, r14, r16, r17, r19, r20, r21)
            r15 = r24
            r14 = r33
            goto L_0x014e
        L_0x0237:
            r33 = r14
            r24 = r15
            r0.M()
            r1 = 1187812115(0x46cc9313, float:26185.537)
            r0.T(r1)
            boolean r1 = r35.getIncludeOther()
            if (r1 == 0) goto L_0x037a
            boolean r1 = r6 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer
            if (r1 == 0) goto L_0x025f
            r8 = r6
            io.intercom.android.sdk.survey.ui.models.Answer$MultipleAnswer r8 = (io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer) r8
            io.intercom.android.sdk.survey.ui.models.Answer$MultipleAnswer$OtherAnswer r8 = r8.getOtherAnswer()
            io.intercom.android.sdk.survey.ui.models.Answer$MultipleAnswer$OtherAnswer$NotSelected r10 = io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer.OtherAnswer.NotSelected.INSTANCE
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r10)
            if (r8 != 0) goto L_0x025f
            r8 = 1
            goto L_0x0261
        L_0x025f:
            r8 = r24
        L_0x0261:
            k0.i$a r10 = k0.i.f23074a
            float r14 = (float) r12
            float r14 = c1.h.j(r14)
            k0.i r10 = androidx.compose.foundation.layout.q.i(r10, r14)
            C.a0.a(r10, r0, r13)
            r10 = 1187840539(0x46cd021b, float:26241.053)
            r0.T(r10)
            if (r8 == 0) goto L_0x0282
            long r14 = r38.m423getButton0d7_KjU()
            long r14 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(r14)
        L_0x027f:
            r16 = r14
            goto L_0x028f
        L_0x0282:
            io.intercom.android.sdk.ui.theme.IntercomTheme r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r14 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r10 = r10.getColors(r0, r14)
            long r14 = r10.m678getBackground0d7_KjU()
            goto L_0x027f
        L_0x028f:
            r0.M()
            long r14 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m713getAccessibleBorderColor8_81llA(r16)
            if (r8 == 0) goto L_0x02a0
            float r9 = (float) r9
            float r9 = c1.h.j(r9)
        L_0x029d:
            r18 = r9
            goto L_0x02a7
        L_0x02a0:
            r9 = 1
            float r10 = (float) r9
            float r9 = c1.h.j(r10)
            goto L_0x029d
        L_0x02a7:
            V0.p$a r9 = V0.p.f8210b
            if (r8 == 0) goto L_0x02b2
            V0.p r9 = r9.a()
        L_0x02af:
            r19 = r9
            goto L_0x02b7
        L_0x02b2:
            V0.p r9 = r9.c()
            goto L_0x02af
        L_0x02b7:
            if (r1 == 0) goto L_0x02c6
            r1 = r6
            io.intercom.android.sdk.survey.ui.models.Answer$MultipleAnswer r1 = (io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer) r1
            io.intercom.android.sdk.survey.ui.models.Answer$MultipleAnswer$OtherAnswer r1 = r1.getOtherAnswer()
            java.lang.String r1 = r1.toString()
        L_0x02c4:
            r10 = r1
            goto L_0x02c9
        L_0x02c6:
            java.lang.String r1 = ""
            goto L_0x02c4
        L_0x02c9:
            r1 = 1187859972(0x46cd4e04, float:26279.008)
            r0.T(r1)
            boolean r1 = r0.b(r8)
            r9 = r7 & 896(0x380, float:1.256E-42)
            r9 = r9 ^ 384(0x180, float:5.38E-43)
            if (r9 <= r11) goto L_0x02df
            boolean r20 = r0.S(r6)
            if (r20 != 0) goto L_0x02e3
        L_0x02df:
            r12 = r7 & 384(0x180, float:5.38E-43)
            if (r12 != r11) goto L_0x02e5
        L_0x02e3:
            r12 = 1
            goto L_0x02e7
        L_0x02e5:
            r12 = r24
        L_0x02e7:
            r1 = r1 | r12
            r12 = r7 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 ^ 3072(0xc00, float:4.305E-42)
            r13 = 2048(0x800, float:2.87E-42)
            if (r12 <= r13) goto L_0x02f6
            boolean r20 = r0.S(r4)
            if (r20 != 0) goto L_0x02fa
        L_0x02f6:
            r11 = r7 & 3072(0xc00, float:4.305E-42)
            if (r11 != r13) goto L_0x02fc
        L_0x02fa:
            r11 = 1
            goto L_0x02fe
        L_0x02fc:
            r11 = r24
        L_0x02fe:
            r1 = r1 | r11
            java.lang.Object r11 = r0.A()
            if (r1 != 0) goto L_0x030d
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r11 != r1) goto L_0x0315
        L_0x030d:
            io.intercom.android.sdk.survey.ui.questiontype.choice.l r11 = new io.intercom.android.sdk.survey.ui.questiontype.choice.l
            r11.<init>(r8, r6, r4)
            r0.r(r11)
        L_0x0315:
            yf.a r11 = (yf.C6787a) r11
            r0.M()
            r1 = 1187870912(0x46cd78c0, float:26300.375)
            r0.T(r1)
            r1 = 256(0x100, float:3.59E-43)
            if (r9 <= r1) goto L_0x032a
            boolean r9 = r0.S(r6)
            if (r9 != 0) goto L_0x032e
        L_0x032a:
            r9 = r7 & 384(0x180, float:5.38E-43)
            if (r9 != r1) goto L_0x0332
        L_0x032e:
            r1 = 1
        L_0x032f:
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0335
        L_0x0332:
            r1 = r24
            goto L_0x032f
        L_0x0335:
            if (r12 <= r9) goto L_0x033d
            boolean r12 = r0.S(r4)
            if (r12 != 0) goto L_0x0341
        L_0x033d:
            r12 = r7 & 3072(0xc00, float:4.305E-42)
            if (r12 != r9) goto L_0x0343
        L_0x0341:
            r24 = 1
        L_0x0343:
            r1 = r1 | r24
            java.lang.Object r9 = r0.A()
            if (r1 != 0) goto L_0x0353
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r9 != r1) goto L_0x035b
        L_0x0353:
            io.intercom.android.sdk.survey.ui.questiontype.choice.m r9 = new io.intercom.android.sdk.survey.ui.questiontype.choice.m
            r9.<init>(r6, r4)
            r0.r(r9)
        L_0x035b:
            r12 = r9
            yf.l r12 = (yf.C6798l) r12
            r0.M()
            int r1 = r7 >> 9
            r22 = r1 & 112(0x70, float:1.57E-43)
            r23 = 512(0x200, float:7.175E-43)
            r20 = 0
            r9 = r38
            r1 = 8
            r13 = r14
            r15 = r18
            r18 = r19
            r19 = r20
            r21 = r0
            io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt.m483OtherOptionYCJL08c(r8, r9, r10, r11, r12, r13, r15, r16, r18, r19, r21, r22, r23)
            goto L_0x037b
        L_0x037a:
            r1 = r12
        L_0x037b:
            r0.M()
            r8 = 1187882858(0x46cda76a, float:26323.707)
            r0.T(r8)
            int r8 = r35.getMinSelection()
            r9 = 1
            if (r8 <= r9) goto L_0x03fe
            Y.I0 r8 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r8 = r0.m(r8)
            android.content.Context r8 = (android.content.Context) r8
            int r9 = io.intercom.android.sdk.R.string.intercom_surveys_multi_select_too_few_responses
            io.intercom.android.sdk.utilities.Phrase r8 = io.intercom.android.sdk.utilities.Phrase.from((android.content.Context) r8, (int) r9)
            java.lang.String r9 = "response_count"
            int r10 = r35.getMinSelection()
            r8.put((java.lang.String) r9, (int) r10)
            k0.i$a r11 = k0.i.f23074a
            float r9 = (float) r1
            float r13 = c1.h.j(r9)
            r16 = 13
            r17 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            k0.i r9 = androidx.compose.foundation.layout.n.m(r11, r12, r13, r14, r15, r16, r17)
            java.lang.CharSequence r8 = r8.format()
            java.lang.String r8 = r8.toString()
            io.intercom.android.sdk.ui.theme.IntercomTheme r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r11 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r10 = r10.getTypography(r0, r11)
            Q0.T r28 = r10.getType05()
            r0.x0$a r10 = r0.C2544x0.f25560b
            long r10 = r10.c()
            r12 = 11
            long r12 = c1.w.f(r12)
            V0.p$a r14 = V0.p.f8210b
            V0.p r15 = r14.c()
            r31 = 0
            r32 = 65488(0xffd0, float:9.1768E-41)
            r14 = 0
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
            r30 = 200112(0x30db0, float:2.80417E-40)
            r29 = r0
            V.T0.b(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x03fe:
            r0.M()
            k0.i$a r8 = k0.i.f23074a
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
            k0.i r1 = androidx.compose.foundation.layout.q.i(r8, r1)
            r8 = 6
            C.a0.a(r1, r0, r8)
            r0.u()
            r0.u()
            Y.Y0 r9 = r0.k()
            if (r9 == 0) goto L_0x0433
            io.intercom.android.sdk.survey.ui.questiontype.choice.n r10 = new io.intercom.android.sdk.survey.ui.questiontype.choice.n
            r0 = r10
            r1 = r3
            r2 = r35
            r3 = r6
            r4 = r37
            r5 = r38
            r6 = r33
            r7 = r41
            r8 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0433:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt.MultipleChoiceQuestion(k0.i, io.intercom.android.sdk.survey.model.SurveyData$Step$Question$MultipleChoiceQuestionModel, io.intercom.android.sdk.survey.ui.models.Answer, yf.l, io.intercom.android.sdk.survey.SurveyUiColors, yf.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(Answer answer, C6798l lVar, String str, String str2) {
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(str, "$option");
        C6496s.h(str2, "it");
        if (answer instanceof Answer.MultipleAnswer) {
            lVar.invoke(((Answer.MultipleAnswer) answer).copyWithAnswerToggled(str));
        } else {
            lVar.invoke(new Answer.MultipleAnswer(Y.d(str), (Answer.MultipleAnswer.OtherAnswer) null, 2, (DefaultConstructorMarker) null));
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(boolean z10, Answer answer, C6798l lVar) {
        C6496s.h(lVar, "$onAnswer");
        if (!z10) {
            MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, lVar, Answer.MultipleAnswer.OtherAnswer.SelectedNoText.INSTANCE);
        } else {
            MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, lVar, Answer.MultipleAnswer.OtherAnswer.NotSelected.INSTANCE);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(Answer answer, C6798l lVar, String str) {
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(str, "it");
        MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, lVar, new Answer.MultipleAnswer.OtherAnswer.SelectedWithText(str));
        return C6514M.f71813a;
    }

    private static final void MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(Answer answer, C6798l lVar, Answer.MultipleAnswer.OtherAnswer otherAnswer) {
        if (answer instanceof Answer.MultipleAnswer) {
            lVar.invoke(((Answer.MultipleAnswer) answer).copyWithOther(otherAnswer));
        } else {
            lVar.invoke(new Answer.MultipleAnswer(Y.e(), otherAnswer));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MultipleChoiceQuestion$lambda$9(i iVar, SurveyData.Step.Question.MultipleChoiceQuestionModel multipleChoiceQuestionModel, Answer answer, C6798l lVar, SurveyUiColors surveyUiColors, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(multipleChoiceQuestionModel, "$multipleChoiceQuestionModel");
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(surveyUiColors, "$colors");
        MultipleChoiceQuestion(iVar, multipleChoiceQuestionModel, answer, lVar, surveyUiColors, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void MultipleChoiceQuestionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1537454351);
        if (i10 != 0 || !h10.i()) {
            PreviewQuestion(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), h10, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new p(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MultipleChoiceQuestionPreview$lambda$10(int i10, C1500m mVar, int i11) {
        MultipleChoiceQuestionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void MultipleChoiceQuestionPreviewDark(C1500m mVar, int i10) {
        int i11 = i10;
        C1500m h10 = mVar.h(756027931);
        if (i11 != 0 || !h10.i()) {
            PreviewQuestion(SurveyUiColors.m415copyqa9m3tE$default(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), 0, 0, C2544x0.f25560b.b(), 0, (C2544x0) null, 27, (Object) null), h10, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new q(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MultipleChoiceQuestionPreviewDark$lambda$11(int i10, C1500m mVar, int i11) {
        MultipleChoiceQuestionPreviewDark(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void PreviewQuestion(SurveyUiColors surveyUiColors, C1500m mVar, int i10) {
        int i11;
        int i12;
        C6496s.h(surveyUiColors, "surveyUiColors");
        C1500m h10 = mVar.h(-1753720526);
        if ((i10 & 14) == 0) {
            if (h10.S(surveyUiColors)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) != 2 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(-245477028, true, new MultipleChoiceQuestionKt$PreviewQuestion$1(surveyUiColors), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new o(surveyUiColors, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewQuestion$lambda$12(SurveyUiColors surveyUiColors, int i10, C1500m mVar, int i11) {
        C6496s.h(surveyUiColors, "$surveyUiColors");
        PreviewQuestion(surveyUiColors, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
