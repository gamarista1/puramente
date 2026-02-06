package io.intercom.android.sdk.survey.ui.questiontype.text;

import J.C1225v;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.UUID;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001au\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$LongTextQuestionModel;", "textQuestionModel", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "Lkotlin/Function1;", "Llf/M;", "onAnswer", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "colors", "Lio/intercom/android/sdk/survey/ValidationError;", "validationError", "LJ/v;", "onImeActionNext", "Lkotlin/Function0;", "questionHeader", "LongTextQuestion", "(Lk0/i;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$LongTextQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lyf/l;Lio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/ValidationError;Lyf/l;Lyf/p;LY/m;II)V", "LongTextPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LongTextQuestionKt {
    public static final void LongTextPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-479343201);
        if (i10 != 0 || !h10.i()) {
            String uuid = UUID.randomUUID().toString();
            C6496s.g(uuid, "toString(...)");
            LongTextQuestion((i) null, new SurveyData.Step.Question.LongTextQuestionModel(uuid, C6565s.e(new Block.Builder().withText("Is this a preview?")), true, "Placeholder text", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 2000, 0.0f, 0, (Integer) null, 448, (DefaultConstructorMarker) null), (Answer) null, new m(), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), ValidationError.NoValidationError.INSTANCE, (C6798l) null, (p) null, h10, 199680, 197);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new n(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M LongTextPreview$lambda$6(Answer answer) {
        C6496s.h(answer, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M LongTextPreview$lambda$7(int i10, C1500m mVar, int i11) {
        LongTextPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: io.intercom.android.sdk.survey.ui.questiontype.text.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void LongTextQuestion(k0.i r40, io.intercom.android.sdk.survey.model.SurveyData.Step.Question.LongTextQuestionModel r41, io.intercom.android.sdk.survey.ui.models.Answer r42, yf.C6798l r43, io.intercom.android.sdk.survey.SurveyUiColors r44, io.intercom.android.sdk.survey.ValidationError r45, yf.C6798l r46, yf.p r47, Y.C1500m r48, int r49, int r50) {
        /*
            r2 = r41
            r4 = r43
            r5 = r44
            r6 = r45
            r9 = r49
            r10 = r50
            r0 = 8
            r3 = 16
            r7 = 32
            r8 = 2
            r11 = 14
            r12 = 6
            java.lang.String r13 = "textQuestionModel"
            kotlin.jvm.internal.C6496s.h(r2, r13)
            java.lang.String r13 = "onAnswer"
            kotlin.jvm.internal.C6496s.h(r4, r13)
            java.lang.String r13 = "colors"
            kotlin.jvm.internal.C6496s.h(r5, r13)
            java.lang.String r13 = "validationError"
            kotlin.jvm.internal.C6496s.h(r6, r13)
            r13 = 977241530(0x3a3f85ba, float:7.3059986E-4)
            r14 = r48
            Y.m r13 = r14.h(r13)
            r14 = 1
            r15 = r10 & 1
            r1 = 4
            if (r15 == 0) goto L_0x003e
            r17 = r9 | 6
            r14 = r40
            goto L_0x0054
        L_0x003e:
            r17 = r9 & 14
            r14 = r40
            if (r17 != 0) goto L_0x0052
            boolean r17 = r13.S(r14)
            if (r17 == 0) goto L_0x004d
            r17 = r1
            goto L_0x004f
        L_0x004d:
            r17 = r8
        L_0x004f:
            r17 = r9 | r17
            goto L_0x0054
        L_0x0052:
            r17 = r9
        L_0x0054:
            r8 = r8 & r10
            if (r8 == 0) goto L_0x005c
            r17 = r17 | 48
        L_0x0059:
            r8 = r17
            goto L_0x006c
        L_0x005c:
            r8 = r9 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0059
            boolean r8 = r13.S(r2)
            if (r8 == 0) goto L_0x0068
            r8 = r7
            goto L_0x0069
        L_0x0068:
            r8 = r3
        L_0x0069:
            r17 = r17 | r8
            goto L_0x0059
        L_0x006c:
            r17 = r10 & 4
            if (r17 == 0) goto L_0x0075
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0072:
            r1 = r42
            goto L_0x0088
        L_0x0075:
            r1 = r9 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0072
            r1 = r42
            boolean r18 = r13.S(r1)
            if (r18 == 0) goto L_0x0084
            r18 = 256(0x100, float:3.59E-43)
            goto L_0x0086
        L_0x0084:
            r18 = 128(0x80, float:1.794E-43)
        L_0x0086:
            r8 = r8 | r18
        L_0x0088:
            r18 = r10 & 8
            if (r18 == 0) goto L_0x008f
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x009f
        L_0x008f:
            r12 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x009f
            boolean r12 = r13.C(r4)
            if (r12 == 0) goto L_0x009c
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x009e
        L_0x009c:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x009e:
            r8 = r8 | r12
        L_0x009f:
            r3 = r3 & r10
            if (r3 == 0) goto L_0x00a5
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b7
        L_0x00a5:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r9
            if (r3 != 0) goto L_0x00b7
            boolean r3 = r13.S(r5)
            if (r3 == 0) goto L_0x00b4
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b6
        L_0x00b4:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00b6:
            r8 = r8 | r3
        L_0x00b7:
            r3 = r10 & 32
            if (r3 == 0) goto L_0x00bf
            r3 = 196608(0x30000, float:2.75506E-40)
        L_0x00bd:
            r8 = r8 | r3
            goto L_0x00d0
        L_0x00bf:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r9
            if (r3 != 0) goto L_0x00d0
            boolean r3 = r13.S(r6)
            if (r3 == 0) goto L_0x00cd
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00cd:
            r3 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00bd
        L_0x00d0:
            r3 = r10 & 64
            if (r3 == 0) goto L_0x00dc
            r7 = 1572864(0x180000, float:2.204052E-39)
            r8 = r8 | r7
        L_0x00d7:
            r7 = r46
        L_0x00d9:
            r12 = 128(0x80, float:1.794E-43)
            goto L_0x00f0
        L_0x00dc:
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r9
            if (r7 != 0) goto L_0x00d7
            r7 = r46
            boolean r12 = r13.C(r7)
            if (r12 == 0) goto L_0x00ec
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ee
        L_0x00ec:
            r12 = 524288(0x80000, float:7.34684E-40)
        L_0x00ee:
            r8 = r8 | r12
            goto L_0x00d9
        L_0x00f0:
            r12 = r12 & r10
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            if (r12 == 0) goto L_0x00fc
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r8 = r8 | r16
            r0 = r47
            goto L_0x010f
        L_0x00fc:
            r16 = r9 & r20
            r0 = r47
            if (r16 != 0) goto L_0x010f
            boolean r21 = r13.C(r0)
            if (r21 == 0) goto L_0x010b
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010d
        L_0x010b:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x010d:
            r8 = r8 | r21
        L_0x010f:
            r21 = 23967451(0x16db6db, float:4.3661218E-38)
            r11 = r8 & r21
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r11 != r0) goto L_0x0129
            boolean r0 = r13.i()
            if (r0 != 0) goto L_0x0120
            goto L_0x0129
        L_0x0120:
            r13.I()
            r8 = r47
            r3 = r1
            r1 = r14
            goto L_0x038c
        L_0x0129:
            if (r15 == 0) goto L_0x012e
            k0.i$a r0 = k0.i.f23074a
            goto L_0x012f
        L_0x012e:
            r0 = r14
        L_0x012f:
            if (r17 == 0) goto L_0x0133
            io.intercom.android.sdk.survey.ui.models.Answer$NoAnswer$InitialNoAnswer r1 = io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer.InitialNoAnswer.INSTANCE
        L_0x0133:
            if (r3 == 0) goto L_0x013b
            io.intercom.android.sdk.survey.ui.questiontype.text.j r3 = new io.intercom.android.sdk.survey.ui.questiontype.text.j
            r3.<init>()
            r7 = r3
        L_0x013b:
            if (r12 == 0) goto L_0x0144
            io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$LongTextQuestionKt r3 = io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$LongTextQuestionKt.INSTANCE
            yf.p r3 = r3.m506getLambda1$intercom_sdk_base_release()
            goto L_0x0146
        L_0x0144:
            r3 = r47
        L_0x0146:
            k0.c$a r11 = k0.c.f23044a
            k0.c r12 = r11.o()
            r14 = 0
            H0.F r12 = androidx.compose.foundation.layout.d.h(r12, r14)
            int r15 = Y.C1494j.a(r13, r14)
            Y.y r14 = r13.p()
            k0.i r2 = k0.h.e(r13, r0)
            J0.g$a r17 = J0.C1241g.f3853J
            r39 = r0
            yf.a r0 = r17.a()
            Y.f r21 = r13.j()
            if (r21 != 0) goto L_0x016e
            Y.C1494j.c()
        L_0x016e:
            r13.F()
            boolean r21 = r13.f()
            if (r21 == 0) goto L_0x017b
            r13.U(r0)
            goto L_0x017e
        L_0x017b:
            r13.q()
        L_0x017e:
            Y.m r0 = Y.F1.a(r13)
            yf.p r5 = r17.c()
            Y.F1.b(r0, r12, r5)
            yf.p r5 = r17.e()
            Y.F1.b(r0, r14, r5)
            yf.p r5 = r17.b()
            boolean r12 = r0.f()
            if (r12 != 0) goto L_0x01a8
            java.lang.Object r12 = r0.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r14)
            if (r12 != 0) goto L_0x01b6
        L_0x01a8:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r0.r(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r0.V(r12, r5)
        L_0x01b6:
            yf.p r5 = r17.d()
            Y.F1.b(r0, r2, r5)
            androidx.compose.foundation.layout.f r0 = androidx.compose.foundation.layout.f.f12848a
            k0.i$a r0 = k0.i.f23074a
            C.c r2 = C.C1085c.f882a
            C.c$m r2 = r2.g()
            k0.c$b r5 = r11.k()
            r12 = 0
            H0.F r2 = C.C1090h.a(r2, r5, r13, r12)
            int r5 = Y.C1494j.a(r13, r12)
            Y.y r12 = r13.p()
            k0.i r14 = k0.h.e(r13, r0)
            yf.a r15 = r17.a()
            Y.f r21 = r13.j()
            if (r21 != 0) goto L_0x01e9
            Y.C1494j.c()
        L_0x01e9:
            r13.F()
            boolean r21 = r13.f()
            if (r21 == 0) goto L_0x01f6
            r13.U(r15)
            goto L_0x01f9
        L_0x01f6:
            r13.q()
        L_0x01f9:
            Y.m r15 = Y.F1.a(r13)
            yf.p r9 = r17.c()
            Y.F1.b(r15, r2, r9)
            yf.p r2 = r17.e()
            Y.F1.b(r15, r12, r2)
            yf.p r2 = r17.b()
            boolean r9 = r15.f()
            if (r9 != 0) goto L_0x0223
            java.lang.Object r9 = r15.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r12)
            if (r9 != 0) goto L_0x0231
        L_0x0223:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r15.r(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15.V(r5, r2)
        L_0x0231:
            yf.p r2 = r17.d()
            Y.F1.b(r15, r14, r2)
            C.k r2 = C.C1093k.f978a
            int r5 = r8 >> 21
            r9 = 14
            r5 = r5 & r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.invoke(r13, r5)
            r5 = 8
            float r5 = (float) r5
            float r5 = c1.h.j(r5)
            k0.i r5 = androidx.compose.foundation.layout.q.i(r0, r5)
            r9 = 6
            C.a0.a(r5, r13, r9)
            r5 = -497967796(0xffffffffe2519d4c, float:-9.66676E20)
            r13.T(r5)
            java.lang.Integer r5 = r41.getPlaceHolderStringRes()
            if (r5 == 0) goto L_0x0270
            java.lang.Integer r5 = r41.getPlaceHolderStringRes()
            int r5 = r5.intValue()
            r9 = 0
            java.lang.String r5 = M0.i.a(r5, r13, r9)
        L_0x026e:
            r15 = r5
            goto L_0x0276
        L_0x0270:
            r9 = 0
            java.lang.String r5 = r41.getPlaceholder()
            goto L_0x026e
        L_0x0276:
            r13.M()
            boolean r5 = r1 instanceof io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer
            if (r5 == 0) goto L_0x0286
            r5 = r1
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r5 = (io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer) r5
            java.lang.String r5 = r5.getAnswer()
        L_0x0284:
            r14 = r5
            goto L_0x0289
        L_0x0286:
            java.lang.String r5 = ""
            goto L_0x0284
        L_0x0289:
            boolean r5 = r6 instanceof io.intercom.android.sdk.survey.ValidationError.ValidationStringError
            if (r5 == 0) goto L_0x029e
            boolean r5 = r1 instanceof io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer.InitialNoAnswer
            if (r5 != 0) goto L_0x029e
            r0.x0$a r5 = r0.C2544x0.f25560b
            long r16 = r5.f()
            r0.x0 r5 = r0.C2544x0.k(r16)
        L_0x029b:
            r17 = r5
            goto L_0x02a0
        L_0x029e:
            r5 = 0
            goto L_0x029b
        L_0x02a0:
            long r21 = r44.m423getButton0d7_KjU()
            long r28 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(r21)
            W0.r$a r5 = W0.r.f8593b
            int r24 = r5.a()
            int r5 = r41.getMaxLine()
            float r12 = r41.m464getMinHeightD9Ej5fM()
            r9 = -497955273(0xffffffffe251ce37, float:-9.675572E20)
            r13.T(r9)
            r9 = r8 & 7168(0x1c00, float:1.0045E-41)
            r42 = r3
            r3 = 2048(0x800, float:2.87E-42)
            if (r9 != r3) goto L_0x02c6
            r3 = 1
            goto L_0x02c7
        L_0x02c6:
            r3 = 0
        L_0x02c7:
            java.lang.Object r9 = r13.A()
            if (r3 != 0) goto L_0x02d5
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r9 != r3) goto L_0x02dd
        L_0x02d5:
            io.intercom.android.sdk.survey.ui.questiontype.text.k r9 = new io.intercom.android.sdk.survey.ui.questiontype.text.k
            r9.<init>(r4)
            r13.r(r9)
        L_0x02dd:
            r16 = r9
            yf.l r16 = (yf.C6798l) r16
            r13.M()
            int r3 = r8 << 3
            r3 = r3 & r20
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r30 = r3 | r8
            r31 = 6
            r32 = 6464(0x1940, float:9.058E-42)
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r18 = r28
            r20 = r5
            r22 = r7
            r28 = r12
            r29 = r13
            io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt.m517TextInputPillg5ZjG94(r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r3 = -497931568(0xffffffffe2522ad0, float:-9.692253E20)
            r13.T(r3)
            java.lang.Integer r3 = r41.getCharacterLimit()
            if (r3 == 0) goto L_0x037e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r5 = r1.getLength()
            r3.append(r5)
            r5 = 47
            r3.append(r5)
            java.lang.Integer r5 = r41.getCharacterLimit()
            r3.append(r5)
            java.lang.String r14 = r3.toString()
            r3 = 14
            long r18 = c1.w.f(r3)
            r8 = 4285756278(0xff737376, double:2.1174449434E-314)
            long r16 = r0.C2550z0.d(r8)
            k0.c$b r3 = r11.j()
            k0.i r20 = r2.b(r0, r3)
            r0 = 4
            float r0 = (float) r0
            float r22 = c1.h.j(r0)
            r25 = 13
            r26 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            k0.i r15 = androidx.compose.foundation.layout.n.m(r20, r21, r22, r23, r24, r25, r26)
            r37 = 0
            r38 = 131056(0x1fff0, float:1.83649E-40)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r36 = 3456(0xd80, float:4.843E-42)
            r35 = r13
            V.T0.b(r14, r15, r16, r18, r20, r21, r22, r23, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x037e:
            r13.M()
            r13.u()
            r13.u()
            r8 = r42
            r3 = r1
            r1 = r39
        L_0x038c:
            Y.Y0 r11 = r13.k()
            if (r11 == 0) goto L_0x03a7
            io.intercom.android.sdk.survey.ui.questiontype.text.l r12 = new io.intercom.android.sdk.survey.ui.questiontype.text.l
            r0 = r12
            r2 = r41
            r4 = r43
            r5 = r44
            r6 = r45
            r9 = r49
            r10 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x03a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt.LongTextQuestion(k0.i, io.intercom.android.sdk.survey.model.SurveyData$Step$Question$LongTextQuestionModel, io.intercom.android.sdk.survey.ui.models.Answer, yf.l, io.intercom.android.sdk.survey.SurveyUiColors, io.intercom.android.sdk.survey.ValidationError, yf.l, yf.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M LongTextQuestion$lambda$0(C1225v vVar) {
        C6496s.h(vVar, "<this>");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(C6798l lVar, String str) {
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(str, "it");
        if (str.length() > 0) {
            lVar.invoke(new Answer.SingleAnswer(str));
        } else {
            lVar.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M LongTextQuestion$lambda$5(i iVar, SurveyData.Step.Question.LongTextQuestionModel longTextQuestionModel, Answer answer, C6798l lVar, SurveyUiColors surveyUiColors, ValidationError validationError, C6798l lVar2, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(longTextQuestionModel, "$textQuestionModel");
        C6496s.h(lVar, "$onAnswer");
        SurveyUiColors surveyUiColors2 = surveyUiColors;
        C6496s.h(surveyUiColors2, "$colors");
        ValidationError validationError2 = validationError;
        C6496s.h(validationError2, "$validationError");
        LongTextQuestion(iVar, longTextQuestionModel, answer, lVar, surveyUiColors2, validationError2, lVar2, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
