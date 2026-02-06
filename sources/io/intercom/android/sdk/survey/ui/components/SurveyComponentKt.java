package io.intercom.android.sdk.survey.ui.components;

import C.C1087e;
import Ef.i;
import Ug.K;
import Y.B;
import Y.C1500m;
import Y.M0;
import Y.P;
import Y.Y0;
import androidx.compose.foundation.layout.q;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.survey.ProgressBarState;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import mf.L;
import mf.Y;
import qf.h;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0014\"\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState;", "state", "Lkotlin/Function1;", "LUg/K;", "Llf/M;", "onContinue", "Lkotlin/Function0;", "onClose", "", "onAnswerUpdated", "Lio/intercom/android/sdk/survey/SurveyState$Content$SecondaryCta;", "onSecondaryCtaClicked", "SurveyComponent", "(Lio/intercom/android/sdk/survey/SurveyState;Lyf/l;Lyf/a;Lyf/l;Lyf/l;LY/m;II)V", "Lio/intercom/android/sdk/survey/SurveyState$Content;", "Lk0/i;", "modifier", "SurveyContent", "(Lio/intercom/android/sdk/survey/SurveyState$Content;Lyf/l;Lyf/l;Lyf/l;Lk0/i;LY/m;II)V", "SimpleSurvey", "(LY/m;I)V", "SurveyErrorState", "Lio/intercom/android/sdk/identity/AppConfig;", "emptyAppConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "getEmptyAppConfig", "()Lio/intercom/android/sdk/identity/AppConfig;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SurveyComponentKt {
    private static final AppConfig emptyAppConfig;

    static {
        Set e10 = Y.e();
        Set e11 = Y.e();
        NexusConfig nexusConfig = r1;
        NexusConfig nexusConfig2 = new NexusConfig();
        emptyAppConfig = new AppConfig("", 0, 0, 0, false, false, false, 100, 1000, 1000, 1000, 1000, true, true, "", "", false, true, "", e10, e11, "", "", false, true, false, false, false, (ConfigModules) null, nexusConfig, false, AttachmentSettings.Companion.getDEFAULT(), true, false, ConversationStateSyncSettings.Companion.getDEFAULT());
    }

    public static final void SimpleSurvey(C1500m mVar, int i10) {
        int i11 = i10;
        C1500m h10 = mVar.h(126014647);
        if (i11 != 0 || !h10.i()) {
            SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null));
            Avatar create = Avatar.create("", "AD");
            C6496s.g(create, "create(...)");
            TopBarState.SenderTopBarState senderTopBarState = new TopBarState.SenderTopBarState(create, "Andy", emptyAppConfig, true, surveyUiColors, new ProgressBarState(true, 0.5f));
            List q10 = C6565s.q(new Block.Builder().withText("<b>Step 1</b>").withType(BlockType.HEADING.getSerializedName()), new Block.Builder().withText("Get tailored discounts to your inbox").withType(BlockType.PARAGRAPH.getSerializedName()));
            String uuid = UUID.randomUUID().toString();
            C6496s.g(uuid, "toString(...)");
            QuestionState questionState = new QuestionState(new SurveyData.Step.Question.ShortTextQuestionModel(uuid, C6565s.e(new Block.Builder().withText("Is this a preview?")), true, "Let us know", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 250, false, (Integer) null, (Integer) null, 448, (DefaultConstructorMarker) null), surveyUiColors);
            String uuid2 = UUID.randomUUID().toString();
            C6496s.g(uuid2, "toString(...)");
            QuestionState questionState2 = new QuestionState(new SurveyData.Step.Question.SingleChoiceQuestionModel(uuid2, C6565s.e(new Block.Builder().withText("Question Title")), true, C6565s.q("Option A", "Option B", "Option C", "Option D"), false), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)));
            String uuid3 = UUID.randomUUID().toString();
            C6496s.g(uuid3, "toString(...)");
            List e10 = C6565s.e(new Block.Builder().withText("How would your rate your experience?"));
            SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType = SurveyData.Step.Question.QuestionData.QuestionSubType.STARS;
            i iVar = new i(1, 5);
            ArrayList arrayList = new ArrayList(C6565s.y(iVar, 10));
            Iterator it = iVar.iterator();
            while (it.hasNext()) {
                arrayList.add(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption(((L) it).a()));
            }
            SurveyComponent(new SurveyState.Content(q10, C6565s.q(questionState, questionState2, new QuestionState(new SurveyData.Step.Question.NumericRatingQuestionModel(uuid3, e10, true, arrayList, "Poor", "Excellent", 1, 5, questionSubType), surveyUiColors)), C6565s.n(), new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button), surveyUiColors, senderTopBarState), new v(), new w(), new x(), (C6798l) null, h10, 3512, 16);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new y(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SimpleSurvey$lambda$6(K k10) {
        C6496s.h(k10, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SimpleSurvey$lambda$7() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SimpleSurvey$lambda$8(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SimpleSurvey$lambda$9(int i10, C1500m mVar, int i11) {
        SimpleSurvey(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SurveyComponent(io.intercom.android.sdk.survey.SurveyState r23, yf.C6798l r24, yf.C6787a r25, yf.C6798l r26, yf.C6798l r27, Y.C1500m r28, int r29, int r30) {
        /*
            r1 = r23
            r2 = r24
            r3 = r25
            r6 = r29
            r0 = 16
            r4 = 2
            r5 = 4
            java.lang.String r7 = "state"
            kotlin.jvm.internal.C6496s.h(r1, r7)
            java.lang.String r7 = "onContinue"
            kotlin.jvm.internal.C6496s.h(r2, r7)
            java.lang.String r7 = "onClose"
            kotlin.jvm.internal.C6496s.h(r3, r7)
            r7 = 290100480(0x114a9500, float:1.5980904E-28)
            r8 = r28
            Y.m r7 = r8.h(r7)
            r8 = 1
            r9 = r30 & 1
            if (r9 == 0) goto L_0x002c
            r9 = r6 | 6
            goto L_0x003c
        L_0x002c:
            r9 = r6 & 14
            if (r9 != 0) goto L_0x003b
            boolean r9 = r7.S(r1)
            if (r9 == 0) goto L_0x0038
            r9 = r5
            goto L_0x0039
        L_0x0038:
            r9 = r4
        L_0x0039:
            r9 = r9 | r6
            goto L_0x003c
        L_0x003b:
            r9 = r6
        L_0x003c:
            r4 = r30 & 2
            if (r4 == 0) goto L_0x0043
            r9 = r9 | 48
            goto L_0x0052
        L_0x0043:
            r4 = r6 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0052
            boolean r4 = r7.C(r2)
            if (r4 == 0) goto L_0x0050
            r4 = 32
            goto L_0x0051
        L_0x0050:
            r4 = r0
        L_0x0051:
            r9 = r9 | r4
        L_0x0052:
            r4 = r30 & 4
            if (r4 == 0) goto L_0x0059
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0059:
            r4 = r6 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0069
            boolean r4 = r7.C(r3)
            if (r4 == 0) goto L_0x0066
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r9 = r9 | r4
        L_0x0069:
            r4 = r30 & 8
            if (r4 == 0) goto L_0x0072
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x006f:
            r5 = r26
            goto L_0x0084
        L_0x0072:
            r5 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x006f
            r5 = r26
            boolean r10 = r7.C(r5)
            if (r10 == 0) goto L_0x0081
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r9 = r9 | r10
        L_0x0084:
            r0 = r30 & 16
            if (r0 == 0) goto L_0x008d
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x008a:
            r10 = r27
            goto L_0x00a1
        L_0x008d:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r6
            if (r10 != 0) goto L_0x008a
            r10 = r27
            boolean r11 = r7.C(r10)
            if (r11 == 0) goto L_0x009e
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r9 = r9 | r11
        L_0x00a1:
            r11 = 46811(0xb6db, float:6.5596E-41)
            r9 = r9 & r11
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r11) goto L_0x00b7
            boolean r9 = r7.i()
            if (r9 != 0) goto L_0x00b0
            goto L_0x00b7
        L_0x00b0:
            r7.I()
            r4 = r5
            r5 = r10
            goto L_0x0228
        L_0x00b7:
            if (r4 == 0) goto L_0x00bf
            io.intercom.android.sdk.survey.ui.components.s r4 = new io.intercom.android.sdk.survey.ui.components.s
            r4.<init>()
            goto L_0x00c0
        L_0x00bf:
            r4 = r5
        L_0x00c0:
            if (r0 == 0) goto L_0x00c8
            io.intercom.android.sdk.survey.ui.components.t r0 = new io.intercom.android.sdk.survey.ui.components.t
            r0.<init>()
            goto L_0x00c9
        L_0x00c8:
            r0 = r10
        L_0x00c9:
            io.intercom.android.sdk.survey.SurveyUiColors r5 = r23.getSurveyUiColors()
            long r9 = r5.m422getBackground0d7_KjU()
            boolean r5 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m718isDarkColor8_81llA(r9)
            if (r5 == 0) goto L_0x0119
            io.intercom.android.sdk.survey.SurveyUiColors r5 = r23.getSurveyUiColors()
            long r9 = r5.m422getBackground0d7_KjU()
            long r9 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m711darken8_81llA(r9)
            r0.x0 r5 = r0.C2544x0.k(r9)
            io.intercom.android.sdk.survey.SurveyUiColors r9 = r23.getSurveyUiColors()
            long r9 = r9.m422getBackground0d7_KjU()
            r0.x0 r9 = r0.C2544x0.k(r9)
            io.intercom.android.sdk.survey.SurveyUiColors r10 = r23.getSurveyUiColors()
            long r10 = r10.m422getBackground0d7_KjU()
            r0.x0 r10 = r0.C2544x0.k(r10)
            io.intercom.android.sdk.survey.SurveyUiColors r11 = r23.getSurveyUiColors()
            long r11 = r11.m422getBackground0d7_KjU()
            long r11 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m711darken8_81llA(r11)
            r0.x0 r11 = r0.C2544x0.k(r11)
            r0.x0[] r5 = new r0.C2544x0[]{r5, r9, r10, r11}
            java.util.List r5 = mf.C6565s.q(r5)
        L_0x0117:
            r10 = r5
            goto L_0x015a
        L_0x0119:
            io.intercom.android.sdk.survey.SurveyUiColors r5 = r23.getSurveyUiColors()
            long r9 = r5.m422getBackground0d7_KjU()
            long r9 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m721lighten8_81llA(r9)
            r0.x0 r5 = r0.C2544x0.k(r9)
            io.intercom.android.sdk.survey.SurveyUiColors r9 = r23.getSurveyUiColors()
            long r9 = r9.m422getBackground0d7_KjU()
            r0.x0 r9 = r0.C2544x0.k(r9)
            io.intercom.android.sdk.survey.SurveyUiColors r10 = r23.getSurveyUiColors()
            long r10 = r10.m422getBackground0d7_KjU()
            r0.x0 r10 = r0.C2544x0.k(r10)
            io.intercom.android.sdk.survey.SurveyUiColors r11 = r23.getSurveyUiColors()
            long r11 = r11.m422getBackground0d7_KjU()
            long r11 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m721lighten8_81llA(r11)
            r0.x0 r11 = r0.C2544x0.k(r11)
            r0.x0[] r5 = new r0.C2544x0[]{r5, r9, r10, r11}
            java.util.List r5 = mf.C6565s.q(r5)
            goto L_0x0117
        L_0x015a:
            r0.n0$a r9 = r0.C2514n0.f25547b
            r14 = 14
            r15 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r0.n0 r17 = r0.C2514n0.a.j(r9, r10, r11, r12, r13, r14, r15)
            k0.i$a r5 = k0.i.f23074a
            r20 = 6
            r21 = 0
            r18 = 0
            r19 = 0
            r16 = r5
            k0.i r9 = androidx.compose.foundation.b.b(r16, r17, r18, r19, r20, r21)
            k0.c$a r10 = k0.c.f23044a
            k0.c r10 = r10.o()
            r11 = 0
            H0.F r10 = androidx.compose.foundation.layout.d.h(r10, r11)
            int r11 = Y.C1494j.a(r7, r11)
            Y.y r12 = r7.p()
            k0.i r9 = k0.h.e(r7, r9)
            J0.g$a r13 = J0.C1241g.f3853J
            yf.a r14 = r13.a()
            Y.f r15 = r7.j()
            if (r15 != 0) goto L_0x019c
            Y.C1494j.c()
        L_0x019c:
            r7.F()
            boolean r15 = r7.f()
            if (r15 == 0) goto L_0x01a9
            r7.U(r14)
            goto L_0x01ac
        L_0x01a9:
            r7.q()
        L_0x01ac:
            Y.m r14 = Y.F1.a(r7)
            yf.p r15 = r13.c()
            Y.F1.b(r14, r10, r15)
            yf.p r10 = r13.e()
            Y.F1.b(r14, r12, r10)
            yf.p r10 = r13.b()
            boolean r12 = r14.f()
            if (r12 != 0) goto L_0x01d6
            java.lang.Object r12 = r14.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r15)
            if (r12 != 0) goto L_0x01e4
        L_0x01d6:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r14.r(r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14.V(r11, r10)
        L_0x01e4:
            yf.p r10 = r13.d()
            Y.F1.b(r14, r9, r10)
            androidx.compose.foundation.layout.f r9 = androidx.compose.foundation.layout.f.f12848a
            k0.i r5 = C.j0.a(r5)
            r0.x0$a r9 = r0.C2544x0.f25560b
            long r14 = r9.g()
            io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1 r9 = new io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
            r9.<init>(r1, r3)
            r10 = -365860662(0xffffffffea3168ca, float:-5.361868E25)
            r11 = 54
            g0.a r9 = g0.c.e(r10, r8, r9, r7, r11)
            io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2 r10 = new io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
            r10.<init>(r1, r2, r4, r0)
            r12 = -1342576427(0xffffffffaff9e8d5, float:-4.5458273E-10)
            g0.a r19 = g0.c.e(r12, r8, r10, r7, r11)
            r21 = 806879280(0x30180030, float:5.5297544E-10)
            r22 = 444(0x1bc, float:6.22E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r8 = r5
            r20 = r7
            V.C1415x0.a(r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22)
            r7.u()
            r5 = r0
        L_0x0228:
            Y.Y0 r8 = r7.k()
            if (r8 == 0) goto L_0x0241
            io.intercom.android.sdk.survey.ui.components.u r9 = new io.intercom.android.sdk.survey.ui.components.u
            r0 = r9
            r1 = r23
            r2 = r24
            r3 = r25
            r6 = r29
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt.SurveyComponent(io.intercom.android.sdk.survey.SurveyState, yf.l, yf.a, yf.l, yf.l, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyComponent$lambda$0(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyComponent$lambda$1(SurveyState.Content.SecondaryCta secondaryCta) {
        C6496s.h(secondaryCta, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyComponent$lambda$3(SurveyState surveyState, C6798l lVar, C6787a aVar, C6798l lVar2, C6798l lVar3, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(surveyState, "$state");
        C6496s.h(lVar, "$onContinue");
        C6496s.h(aVar, "$onClose");
        SurveyComponent(surveyState, lVar, aVar, lVar2, lVar3, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void SurveyContent(SurveyState.Content content, C6798l lVar, C6798l lVar2, C6798l lVar3, k0.i iVar, C1500m mVar, int i10, int i11) {
        i.a aVar;
        C6496s.h(content, "state");
        C6496s.h(lVar, "onContinue");
        C6496s.h(lVar2, "onAnswerUpdated");
        C6496s.h(lVar3, "onSecondaryCtaClicked");
        C1500m h10 = mVar.h(433920899);
        if ((i11 & 16) != 0) {
            aVar = k0.i.f23074a;
        } else {
            aVar = iVar;
        }
        Object A10 = h10.A();
        if (A10 == C1500m.f10026a.a()) {
            B b10 = new B(P.j(h.f72645a, h10));
            h10.r(b10);
            A10 = b10;
        }
        K a10 = ((B) A10).a();
        k0.i iVar2 = aVar;
        C1087e.a(q.f(aVar, 0.0f, 1, (Object) null), (c) null, false, g0.c.e(-1844267539, true, new SurveyComponentKt$SurveyContent$1(content, lVar3, lVar2, lVar, a10), h10, 54), h10, 3072, 6);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new r(content, lVar, lVar2, lVar3, iVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyContent$lambda$4(SurveyState.Content content, C6798l lVar, C6798l lVar2, C6798l lVar3, k0.i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(content, "$state");
        C6496s.h(lVar, "$onContinue");
        C6496s.h(lVar2, "$onAnswerUpdated");
        C6496s.h(lVar3, "$onSecondaryCtaClicked");
        SurveyContent(content, lVar, lVar2, lVar3, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void SurveyErrorState(C1500m mVar, int i10) {
        int i11 = i10;
        C1500m h10 = mVar.h(-1165269984);
        if (i11 != 0 || !h10.i()) {
            Avatar create = Avatar.create("", "AD");
            C6496s.g(create, "create(...)");
            SurveyComponent(new SurveyState.Error.WithCTA(0, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), new TopBarState.SenderTopBarState(create, "Andy", emptyAppConfig, true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), (ProgressBarState) null, 32, (DefaultConstructorMarker) null), new z(), 1, (DefaultConstructorMarker) null), new A(), new B(), new C(), (C6798l) null, h10, 3504, 16);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new D(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyErrorState$lambda$10() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyErrorState$lambda$11(K k10) {
        C6496s.h(k10, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyErrorState$lambda$12() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyErrorState$lambda$13(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyErrorState$lambda$14(int i10, C1500m mVar, int i11) {
        SurveyErrorState(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final AppConfig getEmptyAppConfig() {
        return emptyAppConfig;
    }
}
