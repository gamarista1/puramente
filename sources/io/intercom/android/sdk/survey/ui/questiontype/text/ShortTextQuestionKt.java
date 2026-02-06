package io.intercom.android.sdk.survey.ui.questiontype.text;

import H.b;
import J.C1225v;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import p0.l;
import qf.C6658d;
import qf.g;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001au\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$ShortTextQuestionModel;", "textQuestionModel", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "Lkotlin/Function1;", "Llf/M;", "onAnswer", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "colors", "Lio/intercom/android/sdk/survey/ValidationError;", "validationError", "LJ/v;", "onImeActionNext", "Lkotlin/Function0;", "questionHeader", "ShortTextQuestion", "(Lk0/i;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$ShortTextQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lyf/l;Lio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/ValidationError;Lyf/l;Lyf/p;LY/m;II)V", "ShortTextPreview", "(LY/m;I)V", "ShortTextAnsweredPreview", "ShortTextPhoneNumberPreview", "ShortTextDisabledPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ShortTextQuestionKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
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
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt.WhenMappings.<clinit>():void");
        }
    }

    public static final void ShortTextAnsweredPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1590545552);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m509getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new o(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ShortTextAnsweredPreview$lambda$10(int i10, C1500m mVar, int i11) {
        ShortTextAnsweredPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void ShortTextDisabledPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1539795729);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m511getLambda5$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new v(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ShortTextDisabledPreview$lambda$12(int i10, C1500m mVar, int i11) {
        ShortTextDisabledPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void ShortTextPhoneNumberPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-38271892);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m510getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new t(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ShortTextPhoneNumberPreview$lambda$11(int i10, C1500m mVar, int i11) {
        ShortTextPhoneNumberPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void ShortTextPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2147193389);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m508getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new u(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ShortTextPreview$lambda$9(int i10, C1500m mVar, int i11) {
        ShortTextPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: io.intercom.android.sdk.survey.ui.questiontype.text.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ShortTextQuestion(k0.i r40, io.intercom.android.sdk.survey.model.SurveyData.Step.Question.ShortTextQuestionModel r41, io.intercom.android.sdk.survey.ui.models.Answer r42, yf.C6798l r43, io.intercom.android.sdk.survey.SurveyUiColors r44, io.intercom.android.sdk.survey.ValidationError r45, yf.C6798l r46, yf.p r47, Y.C1500m r48, int r49, int r50) {
        /*
            r2 = r41
            r4 = r43
            r5 = r44
            r6 = r45
            r9 = r49
            r10 = r50
            r0 = 8
            r1 = 128(0x80, float:1.794E-43)
            r3 = 16
            r7 = 32
            r8 = 6
            java.lang.String r11 = "textQuestionModel"
            kotlin.jvm.internal.C6496s.h(r2, r11)
            java.lang.String r11 = "onAnswer"
            kotlin.jvm.internal.C6496s.h(r4, r11)
            java.lang.String r11 = "colors"
            kotlin.jvm.internal.C6496s.h(r5, r11)
            java.lang.String r11 = "validationError"
            kotlin.jvm.internal.C6496s.h(r6, r11)
            r11 = 13974558(0xd53c1e, float:1.9582527E-38)
            r12 = r48
            Y.m r11 = r12.h(r11)
            r12 = 1
            r13 = r10 & 1
            r14 = 2
            r15 = 4
            if (r13 == 0) goto L_0x003e
            r16 = r9 | 6
            r12 = r40
            goto L_0x0054
        L_0x003e:
            r16 = r9 & 14
            r12 = r40
            if (r16 != 0) goto L_0x0052
            boolean r16 = r11.S(r12)
            if (r16 == 0) goto L_0x004d
            r16 = r15
            goto L_0x004f
        L_0x004d:
            r16 = r14
        L_0x004f:
            r16 = r9 | r16
            goto L_0x0054
        L_0x0052:
            r16 = r9
        L_0x0054:
            r17 = r10 & 2
            if (r17 == 0) goto L_0x005d
            r16 = r16 | 48
        L_0x005a:
            r14 = r16
            goto L_0x006f
        L_0x005d:
            r17 = r9 & 112(0x70, float:1.57E-43)
            if (r17 != 0) goto L_0x005a
            boolean r17 = r11.S(r2)
            if (r17 == 0) goto L_0x006a
            r17 = r7
            goto L_0x006c
        L_0x006a:
            r17 = r3
        L_0x006c:
            r16 = r16 | r17
            goto L_0x005a
        L_0x006f:
            r16 = r10 & 4
            if (r16 == 0) goto L_0x0078
            r14 = r14 | 384(0x180, float:5.38E-43)
        L_0x0075:
            r15 = r42
            goto L_0x008b
        L_0x0078:
            r15 = r9 & 896(0x380, float:1.256E-42)
            if (r15 != 0) goto L_0x0075
            r15 = r42
            boolean r18 = r11.S(r15)
            if (r18 == 0) goto L_0x0087
            r18 = 256(0x100, float:3.59E-43)
            goto L_0x0089
        L_0x0087:
            r18 = r1
        L_0x0089:
            r14 = r14 | r18
        L_0x008b:
            r18 = r10 & 8
            if (r18 == 0) goto L_0x0092
            r14 = r14 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a2
        L_0x0092:
            r8 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x00a2
            boolean r8 = r11.C(r4)
            if (r8 == 0) goto L_0x009f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x00a1
        L_0x009f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x00a1:
            r14 = r14 | r8
        L_0x00a2:
            r3 = r3 & r10
            if (r3 == 0) goto L_0x00a8
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ba
        L_0x00a8:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r9
            if (r3 != 0) goto L_0x00ba
            boolean r3 = r11.S(r5)
            if (r3 == 0) goto L_0x00b7
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b9
        L_0x00b7:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00b9:
            r14 = r14 | r3
        L_0x00ba:
            r3 = r10 & 32
            if (r3 == 0) goto L_0x00c2
            r3 = 196608(0x30000, float:2.75506E-40)
        L_0x00c0:
            r14 = r14 | r3
            goto L_0x00d3
        L_0x00c2:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r9
            if (r3 != 0) goto L_0x00d3
            boolean r3 = r11.S(r6)
            if (r3 == 0) goto L_0x00d0
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00d0:
            r3 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00c0
        L_0x00d3:
            r3 = r10 & 64
            if (r3 == 0) goto L_0x00dd
            r7 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 | r7
        L_0x00da:
            r7 = r46
            goto L_0x00f0
        L_0x00dd:
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r9
            if (r7 != 0) goto L_0x00da
            r7 = r46
            boolean r8 = r11.C(r7)
            if (r8 == 0) goto L_0x00ed
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ef
        L_0x00ed:
            r8 = 524288(0x80000, float:7.34684E-40)
        L_0x00ef:
            r14 = r14 | r8
        L_0x00f0:
            r1 = r1 & r10
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            if (r1 == 0) goto L_0x00fc
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r14 = r14 | r21
            r8 = r47
            goto L_0x010f
        L_0x00fc:
            r21 = r9 & r8
            r8 = r47
            if (r21 != 0) goto L_0x010f
            boolean r22 = r11.C(r8)
            if (r22 == 0) goto L_0x010b
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010d
        L_0x010b:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x010d:
            r14 = r14 | r22
        L_0x010f:
            r22 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r14 & r22
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x0127
            boolean r0 = r11.i()
            if (r0 != 0) goto L_0x0120
            goto L_0x0127
        L_0x0120:
            r11.I()
            r1 = r12
            r3 = r15
            goto L_0x04fb
        L_0x0127:
            if (r13 == 0) goto L_0x012c
            k0.i$a r0 = k0.i.f23074a
            goto L_0x012d
        L_0x012c:
            r0 = r12
        L_0x012d:
            if (r16 == 0) goto L_0x0132
            io.intercom.android.sdk.survey.ui.models.Answer$NoAnswer$InitialNoAnswer r2 = io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer.InitialNoAnswer.INSTANCE
            goto L_0x0133
        L_0x0132:
            r2 = r15
        L_0x0133:
            if (r3 == 0) goto L_0x013b
            io.intercom.android.sdk.survey.ui.questiontype.text.p r3 = new io.intercom.android.sdk.survey.ui.questiontype.text.p
            r3.<init>()
            r7 = r3
        L_0x013b:
            if (r1 == 0) goto L_0x0144
            io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$ShortTextQuestionKt r1 = io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$ShortTextQuestionKt.INSTANCE
            yf.p r1 = r1.m507getLambda1$intercom_sdk_base_release()
            r8 = r1
        L_0x0144:
            r1 = -1483108825(0xffffffffa7998e27, float:-4.2620153E-15)
            r11.T(r1)
            java.lang.Object r1 = r11.A()
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r12 = r3.a()
            if (r1 != r12) goto L_0x015d
            H.b r1 = androidx.compose.foundation.relocation.b.a()
            r11.r(r1)
        L_0x015d:
            H.b r1 = (H.b) r1
            r11.M()
            java.lang.Object r12 = r11.A()
            java.lang.Object r13 = r3.a()
            if (r12 != r13) goto L_0x017b
            qf.h r12 = qf.h.f72645a
            Ug.K r12 = Y.P.j(r12, r11)
            Y.B r13 = new Y.B
            r13.<init>(r12)
            r11.r(r13)
            r12 = r13
        L_0x017b:
            Y.B r12 = (Y.B) r12
            Ug.K r12 = r12.a()
            k0.i r13 = androidx.compose.foundation.relocation.b.b(r0, r1)
            io.intercom.android.sdk.survey.ui.questiontype.text.q r15 = new io.intercom.android.sdk.survey.ui.questiontype.text.q
            r15.<init>(r12, r1)
            k0.i r1 = androidx.compose.ui.focus.e.a(r13, r15)
            k0.c$a r31 = k0.c.f23044a
            k0.c r12 = r31.o()
            r15 = 0
            H0.F r12 = androidx.compose.foundation.layout.d.h(r12, r15)
            int r13 = Y.C1494j.a(r11, r15)
            Y.y r15 = r11.p()
            k0.i r1 = k0.h.e(r11, r1)
            J0.g$a r16 = J0.C1241g.f3853J
            r37 = r0
            yf.a r0 = r16.a()
            Y.f r22 = r11.j()
            if (r22 != 0) goto L_0x01b6
            Y.C1494j.c()
        L_0x01b6:
            r11.F()
            boolean r22 = r11.f()
            if (r22 == 0) goto L_0x01c3
            r11.U(r0)
            goto L_0x01c6
        L_0x01c3:
            r11.q()
        L_0x01c6:
            Y.m r0 = Y.F1.a(r11)
            yf.p r5 = r16.c()
            Y.F1.b(r0, r12, r5)
            yf.p r5 = r16.e()
            Y.F1.b(r0, r15, r5)
            yf.p r5 = r16.b()
            boolean r12 = r0.f()
            if (r12 != 0) goto L_0x01f0
            java.lang.Object r12 = r0.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r15)
            if (r12 != 0) goto L_0x01fe
        L_0x01f0:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r0.r(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r0.V(r12, r5)
        L_0x01fe:
            yf.p r5 = r16.d()
            Y.F1.b(r0, r1, r5)
            androidx.compose.foundation.layout.f r0 = androidx.compose.foundation.layout.f.f12848a
            k0.i$a r0 = k0.i.f23074a
            C.c r1 = C.C1085c.f882a
            C.c$m r1 = r1.g()
            k0.c$b r5 = r31.k()
            r12 = 0
            H0.F r1 = C.C1090h.a(r1, r5, r11, r12)
            int r5 = Y.C1494j.a(r11, r12)
            Y.y r12 = r11.p()
            k0.i r13 = k0.h.e(r11, r0)
            yf.a r15 = r16.a()
            Y.f r22 = r11.j()
            if (r22 != 0) goto L_0x0231
            Y.C1494j.c()
        L_0x0231:
            r11.F()
            boolean r22 = r11.f()
            if (r22 == 0) goto L_0x023e
            r11.U(r15)
            goto L_0x0241
        L_0x023e:
            r11.q()
        L_0x0241:
            Y.m r15 = Y.F1.a(r11)
            yf.p r9 = r16.c()
            Y.F1.b(r15, r1, r9)
            yf.p r1 = r16.e()
            Y.F1.b(r15, r12, r1)
            yf.p r1 = r16.b()
            boolean r9 = r15.f()
            if (r9 != 0) goto L_0x026b
            java.lang.Object r9 = r15.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r12)
            if (r9 != 0) goto L_0x0279
        L_0x026b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r15.r(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15.V(r5, r1)
        L_0x0279:
            yf.p r1 = r16.d()
            Y.F1.b(r15, r13, r1)
            C.k r1 = C.C1093k.f978a
            int r5 = r14 >> 21
            r5 = r5 & 14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.invoke(r11, r5)
            r5 = 8
            float r5 = (float) r5
            float r5 = c1.h.j(r5)
            k0.i r5 = androidx.compose.foundation.layout.q.i(r0, r5)
            r9 = 6
            C.a0.a(r5, r11, r9)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r5 = r41.getValidationType()
            int[] r9 = io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r9[r5]
            r9 = 3
            r12 = 1
            if (r5 == r12) goto L_0x02d2
            r12 = 2
            if (r5 == r12) goto L_0x02ca
            if (r5 == r9) goto L_0x02c2
            r15 = 4
            if (r5 == r15) goto L_0x02bb
            W0.y$a r5 = W0.C1456y.f8623b
            int r5 = r5.h()
            goto L_0x02d9
        L_0x02bb:
            W0.y$a r5 = W0.C1456y.f8623b
            int r5 = r5.d()
            goto L_0x02d9
        L_0x02c2:
            r15 = 4
            W0.y$a r5 = W0.C1456y.f8623b
            int r5 = r5.g()
            goto L_0x02d9
        L_0x02ca:
            r15 = 4
            W0.y$a r5 = W0.C1456y.f8623b
            int r5 = r5.c()
            goto L_0x02d9
        L_0x02d2:
            r15 = 4
            W0.y$a r5 = W0.C1456y.f8623b
            int r5 = r5.d()
        L_0x02d9:
            boolean r12 = r2 instanceof io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer
            if (r12 == 0) goto L_0x02e5
            r12 = r2
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r12 = (io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer) r12
            java.lang.String r12 = r12.getAnswer()
            goto L_0x02e7
        L_0x02e5:
            java.lang.String r12 = ""
        L_0x02e7:
            r13 = 1720968786(0x6693e652, float:3.4921827E23)
            r11.T(r13)
            java.lang.Integer r13 = r41.getPlaceHolderStringRes()
            if (r13 == 0) goto L_0x0301
            java.lang.Integer r13 = r41.getPlaceHolderStringRes()
            int r13 = r13.intValue()
            r15 = 0
            java.lang.String r13 = M0.i.a(r13, r11, r15)
            goto L_0x0306
        L_0x0301:
            r15 = 0
            java.lang.String r13 = r41.getPlaceholder()
        L_0x0306:
            r11.M()
            r15 = 1720978057(0x66940a89, float:3.495523E23)
            r11.T(r15)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r15 = r41.getValidationType()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r9 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE
            r16 = 0
            if (r15 != r9) goto L_0x036e
            Y.I0 r9 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r9 = r11.m(r9)
            android.content.Context r9 = (android.content.Context) r9
            io.intercom.android.sdk.utilities.PhoneNumberValidator.loadCountryAreaCodes(r9)
            java.util.Locale r9 = io.intercom.android.sdk.utilities.UtilsKt.getLocaleCompat(r9)
            boolean r13 = r2 instanceof io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer
            if (r13 != 0) goto L_0x0337
            java.lang.String r9 = io.intercom.android.sdk.utilities.PhoneNumberValidator.stripPrefix(r12)
            io.intercom.android.sdk.models.CountryAreaCode r9 = io.intercom.android.sdk.utilities.PhoneNumberValidator.getCountryAreaCodeFromNumber(r9)
            goto L_0x033f
        L_0x0337:
            java.lang.String r9 = r9.getCountry()
            io.intercom.android.sdk.models.CountryAreaCode r9 = io.intercom.android.sdk.utilities.PhoneNumberValidator.getCountryAreaCodeFromLocale(r9)
        L_0x033f:
            boolean r13 = r2 instanceof io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer.InitialNoAnswer
            if (r13 == 0) goto L_0x0358
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r13 = 43
            r12.append(r13)
            java.lang.String r13 = r9.getDialCode()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
        L_0x0358:
            io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1 r13 = new io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
            r13.<init>(r9)
            r9 = 54
            r15 = 854302399(0x32eb9ebf, float:2.742979E-8)
            r46 = r8
            r8 = 1
            g0.a r9 = g0.c.e(r15, r8, r13, r11, r9)
            java.lang.String r13 = "+1 123 456 7890"
            r24 = r9
            goto L_0x0373
        L_0x036e:
            r46 = r8
            r8 = 1
            r24 = r16
        L_0x0373:
            r11.M()
            boolean r9 = r6 instanceof io.intercom.android.sdk.survey.ValidationError.ValidationStringError
            if (r9 == 0) goto L_0x0395
            boolean r9 = r2 instanceof io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer.InitialNoAnswer
            if (r9 != 0) goto L_0x0395
            r9 = r6
            io.intercom.android.sdk.survey.ValidationError$ValidationStringError r9 = (io.intercom.android.sdk.survey.ValidationError.ValidationStringError) r9
            int r9 = r9.getStringRes()
            int r15 = io.intercom.android.sdk.R.string.intercom_surveys_required_response
            if (r9 == r15) goto L_0x0395
            r0.x0$a r9 = r0.C2544x0.f25560b
            long r15 = r9.f()
            r0.x0 r9 = r0.C2544x0.k(r15)
            r15 = r9
            goto L_0x0397
        L_0x0395:
            r15 = r16
        L_0x0397:
            long r16 = r44.m423getButton0d7_KjU()
            long r16 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(r16)
            boolean r9 = r41.getEnabled()
            if (r9 == 0) goto L_0x03b0
            boolean r9 = r6 instanceof io.intercom.android.sdk.survey.ValidationError.NoValidationError
            if (r9 == 0) goto L_0x03b0
            boolean r9 = r2 instanceof io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer
            if (r9 != 0) goto L_0x03b0
            r23 = r8
            goto L_0x03b2
        L_0x03b0:
            r23 = 0
        L_0x03b2:
            W0.r$a r9 = W0.r.f8593b
            int r22 = r9.d()
            boolean r25 = r41.getEnabled()
            r9 = 1721011229(0x66948c1d, float:3.5074744E23)
            r11.T(r9)
            r9 = r14 & 7168(0x1c00, float:1.0045E-41)
            r8 = 2048(0x800, float:2.87E-42)
            if (r9 != r8) goto L_0x03ca
            r8 = 1
            goto L_0x03cb
        L_0x03ca:
            r8 = 0
        L_0x03cb:
            java.lang.Object r9 = r11.A()
            if (r8 != 0) goto L_0x03d7
            java.lang.Object r3 = r3.a()
            if (r9 != r3) goto L_0x03df
        L_0x03d7:
            io.intercom.android.sdk.survey.ui.questiontype.text.r r9 = new io.intercom.android.sdk.survey.ui.questiontype.text.r
            r9.<init>(r4)
            r11.r(r9)
        L_0x03df:
            r3 = r9
            yf.l r3 = (yf.C6798l) r3
            r8 = r14
            r14 = r3
            r11.M()
            r3 = 3
            int r3 = r8 << 3
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r8
            r8 = 806879232(0x30180000, float:5.529728E-10)
            r28 = r3 | r8
            r29 = 0
            r30 = 8224(0x2020, float:1.1524E-41)
            r18 = 0
            r19 = 1
            r26 = 0
            r3 = 4
            r8 = 0
            r20 = r7
            r21 = r5
            r27 = r11
            io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt.m517TextInputPillg5ZjG94(r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r5 = r41.getValidationType()
            r9 = 1721048004(0x66951bc4, float:3.520724E23)
            r11.T(r9)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r9 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION
            r38 = 4285756278(0xff737376, double:2.1174449434E-314)
            if (r5 == r9) goto L_0x041d
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r9 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT
            if (r5 != r9) goto L_0x048b
        L_0x041d:
            java.lang.Integer r5 = r41.getCharacterLimit()
            if (r5 != 0) goto L_0x0424
            goto L_0x048b
        L_0x0424:
            int r5 = r5.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r12 = r2.getLength()
            r9.append(r12)
            r12 = 47
            r9.append(r12)
            r9.append(r5)
            java.lang.String r12 = r9.toString()
            r5 = 12
            long r16 = c1.w.f(r5)
            long r14 = r0.C2550z0.d(r38)
            k0.c$b r5 = r31.j()
            k0.i r18 = r1.b(r0, r5)
            float r1 = (float) r3
            float r20 = c1.h.j(r1)
            r23 = 13
            r24 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            k0.i r13 = androidx.compose.foundation.layout.n.m(r18, r19, r20, r21, r22, r23, r24)
            r35 = 0
            r36 = 131056(0x1fff0, float:1.83649E-40)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 3456(0xd80, float:4.843E-42)
            r33 = r11
            V.T0.b(r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            lf.M r1 = lf.C6514M.f71813a
        L_0x048b:
            r11.M()
            r1 = 1721066757(0x66956505, float:3.5274804E23)
            r11.T(r1)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r1 = r41.getValidationType()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r5 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL
            if (r1 != r5) goto L_0x04ed
            int r1 = io.intercom.android.sdk.R.string.intercom_tickets_email_copy
            java.lang.String r12 = M0.i.a(r1, r11, r8)
            long r14 = r0.C2550z0.d(r38)
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r1 = r1.getTypography(r11, r5)
            Q0.T r32 = r1.getType04()
            float r1 = (float) r3
            float r26 = c1.h.j(r1)
            r29 = 13
            r30 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r24 = r0
            k0.i r13 = androidx.compose.foundation.layout.n.m(r24, r25, r26, r27, r28, r29, r30)
            r35 = 0
            r36 = 65528(0xfff8, float:9.1824E-41)
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r34 = 432(0x1b0, float:6.05E-43)
            r33 = r11
            V.T0.b(r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x04ed:
            r11.M()
            r11.u()
            r11.u()
            r8 = r46
            r3 = r2
            r1 = r37
        L_0x04fb:
            Y.Y0 r11 = r11.k()
            if (r11 == 0) goto L_0x0516
            io.intercom.android.sdk.survey.ui.questiontype.text.s r12 = new io.intercom.android.sdk.survey.ui.questiontype.text.s
            r0 = r12
            r2 = r41
            r4 = r43
            r5 = r44
            r6 = r45
            r9 = r49
            r10 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0516:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt.ShortTextQuestion(k0.i, io.intercom.android.sdk.survey.model.SurveyData$Step$Question$ShortTextQuestionModel, io.intercom.android.sdk.survey.ui.models.Answer, yf.l, io.intercom.android.sdk.survey.SurveyUiColors, io.intercom.android.sdk.survey.ValidationError, yf.l, yf.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ShortTextQuestion$lambda$0(C1225v vVar) {
        C6496s.h(vVar, "<this>");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ShortTextQuestion$lambda$2(K k10, b bVar, l lVar) {
        C6496s.h(k10, "$coroutineScope");
        C6496s.h(bVar, "$bringIntoViewRequester");
        C6496s.h(lVar, "it");
        if (lVar.a()) {
            C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new ShortTextQuestionKt$ShortTextQuestion$2$1(bVar, (C6658d<? super ShortTextQuestionKt$ShortTextQuestion$2$1>) null), 3, (Object) null);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(C6798l lVar, String str) {
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
    public static final C6514M ShortTextQuestion$lambda$8(i iVar, SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel, Answer answer, C6798l lVar, SurveyUiColors surveyUiColors, ValidationError validationError, C6798l lVar2, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(shortTextQuestionModel, "$textQuestionModel");
        C6496s.h(lVar, "$onAnswer");
        SurveyUiColors surveyUiColors2 = surveyUiColors;
        C6496s.h(surveyUiColors2, "$colors");
        ValidationError validationError2 = validationError;
        C6496s.h(validationError2, "$validationError");
        ShortTextQuestion(iVar, shortTextQuestionModel, answer, lVar, surveyUiColors2, validationError2, lVar2, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
