package io.intercom.android.sdk.survey.ui.questiontype.choice;

import V.B0;
import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import com.amazon.a.a.o.b;
import g0.c;
import io.intercom.android.sdk.R;
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
import p0.e;
import r0.C2544x0;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u001aW\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$SingleChoiceQuestionModel;", "singleChoiceQuestionModel", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "Lkotlin/Function1;", "Llf/M;", "onAnswer", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "colors", "Lkotlin/Function0;", "questionHeader", "SingleChoiceQuestion", "(Lk0/i;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$SingleChoiceQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lyf/l;Lio/intercom/android/sdk/survey/SurveyUiColors;Lyf/p;LY/m;II)V", "", "unParsedOption", "getTranslatedOption", "(Ljava/lang/String;LY/m;I)Ljava/lang/String;", "SingleChoiceQuestionPreviewLight", "(LY/m;I)V", "SingleChoiceQuestionPreviewDark", "surveyUiColors", "SingleChoiceQuestionPreview", "(Lio/intercom/android/sdk/survey/SurveyUiColors;LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SingleChoiceQuestionKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SingleChoiceQuestion(k0.i r31, io.intercom.android.sdk.survey.model.SurveyData.Step.Question.SingleChoiceQuestionModel r32, io.intercom.android.sdk.survey.ui.models.Answer r33, yf.C6798l r34, io.intercom.android.sdk.survey.SurveyUiColors r35, yf.p r36, Y.C1500m r37, int r38, int r39) {
        /*
            r4 = r34
            r7 = r38
            java.lang.String r0 = "singleChoiceQuestionModel"
            r2 = r32
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "onAnswer"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "colors"
            r5 = r35
            kotlin.jvm.internal.C6496s.h(r5, r0)
            r0 = -538592394(0xffffffffdfe5bb76, float:-3.310791E19)
            r1 = r37
            Y.m r0 = r1.h(r0)
            r1 = 1
            r3 = r39 & 1
            if (r3 == 0) goto L_0x0028
            k0.i$a r3 = k0.i.f23074a
            goto L_0x002a
        L_0x0028:
            r3 = r31
        L_0x002a:
            r6 = r39 & 4
            if (r6 == 0) goto L_0x0031
            io.intercom.android.sdk.survey.ui.models.Answer$NoAnswer$InitialNoAnswer r6 = io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer.InitialNoAnswer.INSTANCE
            goto L_0x0033
        L_0x0031:
            r6 = r33
        L_0x0033:
            r8 = r39 & 32
            if (r8 == 0) goto L_0x003f
            io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$SingleChoiceQuestionKt r8 = io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$SingleChoiceQuestionKt.INSTANCE
            yf.p r8 = r8.m482getLambda1$intercom_sdk_base_release()
            r14 = r8
            goto L_0x0041
        L_0x003f:
            r14 = r36
        L_0x0041:
            Y.I0 r8 = androidx.compose.ui.platform.C1644k0.f()
            java.lang.Object r8 = r0.m(r8)
            r15 = r8
            p0.e r15 = (p0.e) r15
            k0.c$a r8 = k0.c.f23044a
            k0.c r9 = r8.o()
            r13 = 0
            H0.F r9 = androidx.compose.foundation.layout.d.h(r9, r13)
            int r10 = Y.C1494j.a(r0, r13)
            Y.y r11 = r0.p()
            k0.i r12 = k0.h.e(r0, r3)
            J0.g$a r16 = J0.C1241g.f3853J
            yf.a r1 = r16.a()
            Y.f r17 = r0.j()
            if (r17 != 0) goto L_0x0072
            Y.C1494j.c()
        L_0x0072:
            r0.F()
            boolean r17 = r0.f()
            if (r17 == 0) goto L_0x007f
            r0.U(r1)
            goto L_0x0082
        L_0x007f:
            r0.q()
        L_0x0082:
            Y.m r1 = Y.F1.a(r0)
            yf.p r13 = r16.c()
            Y.F1.b(r1, r9, r13)
            yf.p r9 = r16.e()
            Y.F1.b(r1, r11, r9)
            yf.p r9 = r16.b()
            boolean r11 = r1.f()
            if (r11 != 0) goto L_0x00ac
            java.lang.Object r11 = r1.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r13)
            if (r11 != 0) goto L_0x00ba
        L_0x00ac:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r1.r(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1.V(r10, r9)
        L_0x00ba:
            yf.p r9 = r16.d()
            Y.F1.b(r1, r12, r9)
            androidx.compose.foundation.layout.f r1 = androidx.compose.foundation.layout.f.f12848a
            r1 = 924114601(0x3714dea9, float:8.8733295E-6)
            r0.T(r1)
            java.lang.Object r1 = r0.A()
            Y.m$a r9 = Y.C1500m.f10026a
            java.lang.Object r9 = r9.a()
            r13 = 2
            if (r1 != r9) goto L_0x00e0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r9 = 0
            Y.r0 r1 = Y.u1.d(r1, r9, r13, r9)
            r0.r(r1)
        L_0x00e0:
            Y.r0 r1 = (Y.C1510r0) r1
            r0.M()
            k0.i$a r9 = k0.i.f23074a
            C.c r10 = C.C1085c.f882a
            C.c$m r10 = r10.g()
            k0.c$b r8 = r8.k()
            r11 = 0
            H0.F r8 = C.C1090h.a(r10, r8, r0, r11)
            int r10 = Y.C1494j.a(r0, r11)
            Y.y r11 = r0.p()
            k0.i r9 = k0.h.e(r0, r9)
            yf.a r12 = r16.a()
            Y.f r17 = r0.j()
            if (r17 != 0) goto L_0x010f
            Y.C1494j.c()
        L_0x010f:
            r0.F()
            boolean r17 = r0.f()
            if (r17 == 0) goto L_0x011c
            r0.U(r12)
            goto L_0x011f
        L_0x011c:
            r0.q()
        L_0x011f:
            Y.m r12 = Y.F1.a(r0)
            yf.p r13 = r16.c()
            Y.F1.b(r12, r8, r13)
            yf.p r8 = r16.e()
            Y.F1.b(r12, r11, r8)
            yf.p r8 = r16.b()
            boolean r11 = r12.f()
            if (r11 != 0) goto L_0x0149
            java.lang.Object r11 = r12.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r13)
            if (r11 != 0) goto L_0x0157
        L_0x0149:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12.r(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12.V(r10, r8)
        L_0x0157:
            yf.p r8 = r16.d()
            Y.F1.b(r12, r9, r8)
            C.k r8 = C.C1093k.f978a
            int r8 = r7 >> 15
            r8 = r8 & 14
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14.invoke(r0, r8)
            r8 = 891864023(0x3528c3d7, float:6.286986E-7)
            r0.T(r8)
            java.util.List r8 = r32.getOptions()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r22 = r8.iterator()
        L_0x017b:
            boolean r8 = r22.hasNext()
            r9 = 6
            r10 = 8
            if (r8 == 0) goto L_0x0249
            java.lang.Object r8 = r22.next()
            java.lang.String r8 = (java.lang.String) r8
            k0.i$a r11 = k0.i.f23074a
            float r10 = (float) r10
            float r10 = c1.h.j(r10)
            k0.i r10 = androidx.compose.foundation.layout.q.i(r11, r10)
            C.a0.a(r10, r0, r9)
            boolean r9 = r6 instanceof io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer
            if (r9 == 0) goto L_0x01ab
            r9 = r6
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r9 = (io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer) r9
            java.lang.String r9 = r9.getAnswer()
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r8)
            if (r9 == 0) goto L_0x01ab
            r9 = 1
            goto L_0x01ac
        L_0x01ab:
            r9 = 0
        L_0x01ac:
            r10 = 891870284(0x3528dc4c, float:6.290545E-7)
            r0.T(r10)
            if (r9 == 0) goto L_0x01bf
            long r10 = r35.m423getButton0d7_KjU()
            long r10 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(r10)
        L_0x01bc:
            r16 = r10
            goto L_0x01cc
        L_0x01bf:
            io.intercom.android.sdk.ui.theme.IntercomTheme r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r11 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r10 = r10.getColors(r0, r11)
            long r10 = r10.m678getBackground0d7_KjU()
            goto L_0x01bc
        L_0x01cc:
            r0.M()
            io.intercom.android.sdk.ui.theme.IntercomTheme r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r11 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r10 = r10.getColors(r0, r11)
            long r23 = r10.m700getPrimaryText0d7_KjU()
            r29 = 14
            r30 = 0
            r25 = 1036831949(0x3dcccccd, float:0.1)
            r26 = 0
            r27 = 0
            r28 = 0
            long r11 = r0.C2544x0.o(r23, r25, r26, r27, r28, r29, r30)
            r10 = 1
            float r13 = (float) r10
            float r13 = c1.h.j(r13)
            V0.p$a r10 = V0.p.f8210b
            if (r9 == 0) goto L_0x01fd
            V0.p r10 = r10.a()
        L_0x01fa:
            r18 = r10
            goto L_0x0202
        L_0x01fd:
            V0.p r10 = r10.c()
            goto L_0x01fa
        L_0x0202:
            long r23 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m712generateTextColor8_81llA(r16)
            r10 = 0
            float r25 = io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.contentAlpha(r9, r0, r10)
            r29 = 14
            r30 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            long r19 = r0.C2544x0.o(r23, r25, r26, r27, r28, r29, r30)
            r10 = 0
            java.lang.String r21 = getTranslatedOption(r8, r0, r10)
            io.intercom.android.sdk.survey.ui.questiontype.choice.x r10 = new io.intercom.android.sdk.survey.ui.questiontype.choice.x
            r10.<init>(r15, r1, r4, r8)
            r23 = 24576(0x6000, float:3.4438E-41)
            r24 = 0
            r8 = r9
            r9 = r10
            r25 = 0
            r10 = r21
            r2 = 2
            r26 = r14
            r27 = r15
            r14 = r16
            r16 = r18
            r17 = r19
            r19 = r0
            r20 = r23
            r21 = r24
            io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt.m475ChoicePillUdaoDFU(r8, r9, r10, r11, r13, r14, r16, r17, r19, r20, r21)
            r2 = r32
            r14 = r26
            r15 = r27
            goto L_0x017b
        L_0x0249:
            r26 = r14
            r2 = 2
            r25 = 0
            r0.M()
            r8 = 891905968(0x352967b0, float:6.310829E-7)
            r0.T(r8)
            boolean r8 = r32.getIncludeOther()
            if (r8 == 0) goto L_0x0345
            k0.i$a r8 = k0.i.f23074a
            float r10 = (float) r10
            float r10 = c1.h.j(r10)
            k0.i r8 = androidx.compose.foundation.layout.q.i(r8, r10)
            C.a0.a(r8, r0, r9)
            java.lang.Object r8 = r1.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r9 = 891911980(0x35297f2c, float:6.3142465E-7)
            r0.T(r9)
            if (r8 == 0) goto L_0x0288
            long r9 = r35.m423getButton0d7_KjU()
            long r9 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(r9)
        L_0x0285:
            r16 = r9
            goto L_0x0295
        L_0x0288:
            io.intercom.android.sdk.ui.theme.IntercomTheme r9 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r9 = r9.getColors(r0, r10)
            long r9 = r9.m678getBackground0d7_KjU()
            goto L_0x0285
        L_0x0295:
            r0.M()
            long r13 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m713getAccessibleBorderColor8_81llA(r16)
            if (r8 == 0) goto L_0x02a6
            float r2 = (float) r2
            float r2 = c1.h.j(r2)
            r15 = r2
            r2 = 1
            goto L_0x02ad
        L_0x02a6:
            r2 = 1
            float r9 = (float) r2
            float r9 = c1.h.j(r9)
            r15 = r9
        L_0x02ad:
            V0.p$a r9 = V0.p.f8210b
            if (r8 == 0) goto L_0x02b8
            V0.p r9 = r9.a()
        L_0x02b5:
            r18 = r9
            goto L_0x02bd
        L_0x02b8:
            V0.p r9 = r9.c()
            goto L_0x02b5
        L_0x02bd:
            boolean r9 = r6 instanceof io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer
            if (r9 == 0) goto L_0x02ca
            r9 = r6
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r9 = (io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer) r9
            java.lang.String r9 = r9.getAnswer()
        L_0x02c8:
            r10 = r9
            goto L_0x02cd
        L_0x02ca:
            java.lang.String r9 = ""
            goto L_0x02c8
        L_0x02cd:
            r9 = 891929809(0x3529c4d1, float:6.324381E-7)
            r0.T(r9)
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 ^ 3072(0xc00, float:4.305E-42)
            r11 = 2048(0x800, float:2.87E-42)
            if (r9 <= r11) goto L_0x02e1
            boolean r12 = r0.S(r4)
            if (r12 != 0) goto L_0x02e5
        L_0x02e1:
            r12 = r7 & 3072(0xc00, float:4.305E-42)
            if (r12 != r11) goto L_0x02e7
        L_0x02e5:
            r12 = r2
            goto L_0x02e9
        L_0x02e7:
            r12 = r25
        L_0x02e9:
            java.lang.Object r2 = r0.A()
            if (r12 != 0) goto L_0x02f7
            Y.m$a r12 = Y.C1500m.f10026a
            java.lang.Object r12 = r12.a()
            if (r2 != r12) goto L_0x02ff
        L_0x02f7:
            io.intercom.android.sdk.survey.ui.questiontype.choice.y r2 = new io.intercom.android.sdk.survey.ui.questiontype.choice.y
            r2.<init>(r4, r1)
            r0.r(r2)
        L_0x02ff:
            r1 = r2
            yf.a r1 = (yf.C6787a) r1
            r0.M()
            r2 = 891936400(0x3529de90, float:6.3281277E-7)
            r0.T(r2)
            if (r9 <= r11) goto L_0x0313
            boolean r2 = r0.S(r4)
            if (r2 != 0) goto L_0x0317
        L_0x0313:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            if (r2 != r11) goto L_0x0319
        L_0x0317:
            r25 = 1
        L_0x0319:
            java.lang.Object r2 = r0.A()
            if (r25 != 0) goto L_0x0327
            Y.m$a r9 = Y.C1500m.f10026a
            java.lang.Object r9 = r9.a()
            if (r2 != r9) goto L_0x032f
        L_0x0327:
            io.intercom.android.sdk.survey.ui.questiontype.choice.z r2 = new io.intercom.android.sdk.survey.ui.questiontype.choice.z
            r2.<init>(r4)
            r0.r(r2)
        L_0x032f:
            r12 = r2
            yf.l r12 = (yf.C6798l) r12
            r0.M()
            int r2 = r7 >> 9
            r22 = r2 & 112(0x70, float:1.57E-43)
            r23 = 512(0x200, float:7.175E-43)
            r19 = 0
            r9 = r35
            r11 = r1
            r21 = r0
            io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt.m483OtherOptionYCJL08c(r8, r9, r10, r11, r12, r13, r15, r16, r18, r19, r21, r22, r23)
        L_0x0345:
            r0.M()
            r0.u()
            r0.u()
            Y.Y0 r9 = r0.k()
            if (r9 == 0) goto L_0x036b
            io.intercom.android.sdk.survey.ui.questiontype.choice.A r10 = new io.intercom.android.sdk.survey.ui.questiontype.choice.A
            r0 = r10
            r1 = r3
            r2 = r32
            r3 = r6
            r4 = r34
            r5 = r35
            r6 = r26
            r7 = r38
            r8 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x036b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt.SingleChoiceQuestion(k0.i, io.intercom.android.sdk.survey.model.SurveyData$Step$Question$SingleChoiceQuestionModel, io.intercom.android.sdk.survey.ui.models.Answer, yf.l, io.intercom.android.sdk.survey.SurveyUiColors, yf.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M SingleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1(e eVar, C1510r0 r0Var, C6798l lVar, String str, String str2) {
        C6496s.h(eVar, "$focusManager");
        C6496s.h(r0Var, "$otherOptionSelectionState");
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(str, "$unparsedOption");
        C6496s.h(str2, "it");
        e.c(eVar, false, 1, (Object) null);
        r0Var.setValue(Boolean.FALSE);
        lVar.invoke(new Answer.SingleAnswer(str));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SingleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(C6798l lVar, C1510r0 r0Var) {
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(r0Var, "$otherOptionSelectionState");
        lVar.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        r0Var.setValue(Boolean.valueOf(!((Boolean) r0Var.getValue()).booleanValue()));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(C6798l lVar, String str) {
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(str, "it");
        lVar.invoke(new Answer.SingleAnswer(str));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SingleChoiceQuestion$lambda$9(i iVar, SurveyData.Step.Question.SingleChoiceQuestionModel singleChoiceQuestionModel, Answer answer, C6798l lVar, SurveyUiColors surveyUiColors, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(singleChoiceQuestionModel, "$singleChoiceQuestionModel");
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(surveyUiColors, "$colors");
        SingleChoiceQuestion(iVar, singleChoiceQuestionModel, answer, lVar, surveyUiColors, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void SingleChoiceQuestionPreview(SurveyUiColors surveyUiColors, C1500m mVar, int i10) {
        int i11;
        int i12;
        C6496s.h(surveyUiColors, "surveyUiColors");
        C1500m h10 = mVar.h(1547860655);
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
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(1452787289, true, new SingleChoiceQuestionKt$SingleChoiceQuestionPreview$1(surveyUiColors), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new v(surveyUiColors, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SingleChoiceQuestionPreview$lambda$12(SurveyUiColors surveyUiColors, int i10, C1500m mVar, int i11) {
        C6496s.h(surveyUiColors, "$surveyUiColors");
        SingleChoiceQuestionPreview(surveyUiColors, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SingleChoiceQuestionPreviewDark(C1500m mVar, int i10) {
        int i11 = i10;
        C1500m h10 = mVar.h(567326043);
        if (i11 != 0 || !h10.i()) {
            SingleChoiceQuestionPreview(SurveyUiColors.m415copyqa9m3tE$default(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), 0, 0, C2544x0.f25560b.b(), 0, (C2544x0) null, 27, (Object) null), h10, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new w(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SingleChoiceQuestionPreviewDark$lambda$11(int i10, C1500m mVar, int i11) {
        SingleChoiceQuestionPreviewDark(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SingleChoiceQuestionPreviewLight(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1626655857);
        if (i10 != 0 || !h10.i()) {
            SingleChoiceQuestionPreview(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), h10, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new B(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SingleChoiceQuestionPreviewLight$lambda$10(int i10, C1500m mVar, int i11) {
        SingleChoiceQuestionPreviewLight(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final String getTranslatedOption(String str, C1500m mVar, int i10) {
        mVar.T(-1189227411);
        if (C6496s.c(str, b.f37475af)) {
            mVar.T(-1210053749);
            str = M0.i.a(R.string.intercom_attribute_collector_positive, mVar, 0);
            mVar.M();
        } else if (C6496s.c(str, b.f37476ag)) {
            mVar.T(-1210051093);
            str = M0.i.a(R.string.intercom_attribute_collector_negative, mVar, 0);
            mVar.M();
        } else {
            mVar.T(-1210048586);
            mVar.M();
        }
        mVar.M();
        return str;
    }
}
