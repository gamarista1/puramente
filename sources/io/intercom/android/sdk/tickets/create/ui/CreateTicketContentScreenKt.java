package io.intercom.android.sdk.tickets.create.ui;

import B.l;
import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import C.N;
import C.a0;
import C.f0;
import C.i0;
import C.l0;
import H0.F;
import I.a;
import J0.C1241g;
import V.B0;
import V.C1389k;
import V.C1391l;
import V.C1393m;
import V.C1415x0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.m;
import c1.h;
import c1.w;
import g0.C2005a;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.components.QuestionComponentKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001ai\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\f\u0010\r\u001ae\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u000f\u0010\u0018\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0015\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "uiState", "Lkotlin/Function0;", "Llf/M;", "onBackClick", "onCreateTicket", "onCancel", "Lkotlin/Function1;", "", "onAnswerUpdated", "Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "onAnswerClick", "CreateTicketScreen", "(Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;Lyf/a;Lyf/a;Lyf/a;Lyf/l;Lyf/l;LY/m;I)V", "Lk0/i;", "modifier", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Content;", "state", "CreateTicketContentScreen", "(Lk0/i;Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Content;Lyf/a;Lyf/a;Lyf/l;Lyf/l;LY/m;II)V", "CreateTicketContentScreenPreview", "(LY/m;I)V", "CreateTicketLoadingPreview", "CreateTicketErrorPreview", "CreateTicketContentErrorScreenPreview", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "", "Lio/intercom/android/sdk/survey/QuestionState;", "questions", "Ljava/util/List;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CreateTicketContentScreenKt {
    /* access modifiers changed from: private */
    public static final List<QuestionState> questions;
    private static final SurveyUiColors surveyUiColors;

    static {
        C2544x0.a aVar = C2544x0.f25560b;
        SurveyUiColors surveyUiColors2 = new SurveyUiColors(aVar.a(), aVar.i(), aVar.j(), aVar.b(), (C2544x0) null, 16, (DefaultConstructorMarker) null);
        surveyUiColors = surveyUiColors2;
        List e10 = C6565s.e(new Block.Builder().withText("Email").withType("paragraph"));
        SurveyData.Step.Question.QuestionValidation.ValidationType validationType = SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL;
        questions = C6565s.q(new QuestionState(new SurveyData.Step.Question.ShortTextQuestionModel("1", e10, false, "abc@example.com", validationType, (Integer) null, false, (Integer) null, (Integer) null, 448, (DefaultConstructorMarker) null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.LongTextQuestionModel("2", C6565s.e(new Block.Builder().withText("Multiline text").withType("paragraph")), true, "Enter text here...", validationType, (Integer) null, h.j((float) 120), 0, (Integer) null, 384, (DefaultConstructorMarker) null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DropDownQuestionModel("3", C6565s.e(new Block.Builder().withText("List attribute").withType("paragraph")), true, C6565s.q("Option A", "Option B", "Option C"), "Please select...", (Integer) null, 32, (DefaultConstructorMarker) null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.SingleChoiceQuestionModel("4", C6565s.e(new Block.Builder().withText("Boolean").withType("paragraph")), false, C6565s.q("True", "False"), false), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DatePickerQuestionModel("5", C6565s.e(new Block.Builder().withText("Date and Time").withType("paragraph")), true), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DatePickerQuestionModel("5", C6565s.e(new Block.Builder().withText("Date and Time").withType("paragraph")), true), surveyUiColors2));
    }

    @IntercomPreviews
    private static final void CreateTicketContentErrorScreenPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1908579859);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m548getLambda5$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new B(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CreateTicketContentErrorScreenPreview$lambda$8(int i10, C1500m mVar, int i11) {
        CreateTicketContentErrorScreenPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void CreateTicketContentScreen(i iVar, CreateTicketViewModel.CreateTicketFormUiState.Content content, C6787a aVar, C6787a aVar2, C6798l lVar, C6798l lVar2, C1500m mVar, int i10, int i11) {
        i.a aVar3;
        SurveyUiColors surveyUiColors2;
        CreateTicketViewModel.CreateTicketFormUiState.Content content2 = content;
        C6496s.h(content2, "state");
        C6496s.h(aVar, "onCreateTicket");
        C6496s.h(aVar2, "onCancel");
        C6496s.h(lVar, "onAnswerUpdated");
        C6496s.h(lVar2, "onAnswerClick");
        C1500m h10 = mVar.h(-296750187);
        if ((i11 & 1) != 0) {
            aVar3 = i.f23074a;
        } else {
            aVar3 = iVar;
        }
        float f10 = (float) 16;
        i k10 = n.k(b.d(m.d(q.f(aVar3, 0.0f, 1, (Object) null), m.a(0, h10, 0, 1), true, (z.n) null, false, 12, (Object) null), IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), h.j(f10), 0.0f, 2, (Object) null);
        F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), h10, 0);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, k10);
        C1241g.a aVar4 = C1241g.f3853J;
        C6787a a12 = aVar4.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a12);
        } else {
            h10.q();
        }
        C1500m a13 = F1.a(h10);
        F1.b(a13, a10, aVar4.c());
        F1.b(a13, p10, aVar4.e());
        p b10 = aVar4.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar4.d());
        C1093k kVar = C1093k.f978a;
        a0.a(q.i(i.f23074a, h.j(f10)), h10, 6);
        h10.T(-210345224);
        for (QuestionState questionState : content.getQuestions()) {
            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                h10.T(-267718574);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i12 = IntercomTheme.$stable;
                SurveyUiColors surveyUiColors3 = new SurveyUiColors(intercomTheme.getColors(h10, i12).m678getBackground0d7_KjU(), intercomTheme.getColors(h10, i12).m700getPrimaryText0d7_KjU(), intercomTheme.getColors(h10, i12).m672getAction0d7_KjU(), intercomTheme.getColors(h10, i12).m694getOnAction0d7_KjU(), (C2544x0) null, 16, (DefaultConstructorMarker) null);
                h10.M();
                surveyUiColors2 = surveyUiColors3;
            } else {
                h10.T(-267313094);
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i13 = IntercomTheme.$stable;
                surveyUiColors2 = new SurveyUiColors(intercomTheme2.getColors(h10, i13).m678getBackground0d7_KjU(), intercomTheme2.getColors(h10, i13).m700getPrimaryText0d7_KjU(), intercomTheme2.getColors(h10, i13).m678getBackground0d7_KjU(), intercomTheme2.getColors(h10, i13).m700getPrimaryText0d7_KjU(), C2544x0.k(intercomTheme2.getColors(h10, i13).m672getAction0d7_KjU()), (DefaultConstructorMarker) null);
                h10.M();
            }
            i.a aVar5 = i.f23074a;
            i a14 = androidx.compose.ui.focus.b.a(aVar5, new C(questionState));
            long r24 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m678getBackground0d7_KjU();
            float j10 = h.j((float) 0);
            i m10 = n.m(aVar5, 0.0f, h.j((float) 24), 0.0f, 0.0f, 13, (Object) null);
            long f11 = w.f(16);
            i iVar2 = a14;
            QuestionState questionState2 = questionState;
            QuestionComponentKt.m467QuestionComponentlzVJ5Jw(iVar2, m10, questionState2, surveyUiColors2, lVar, r24, j10, V0.p.f8210b.d(), f11, lVar2, h10, (i10 & 57344) | 114819632 | ((i10 << 12) & 1879048192), 0);
            f10 = f10;
        }
        float f12 = f10;
        h10.M();
        boolean z10 = false;
        a0.a(C1092j.c(kVar, aVar3, 1.0f, false, 2, (Object) null), h10, 0);
        i.a aVar6 = i.f23074a;
        i m11 = n.m(q.h(aVar6, 0.0f, 1, (Object) null), 0.0f, h.j((float) 24), 0.0f, 0.0f, 13, (Object) null);
        if (content.getEnableCta() && !content.getShowCreatingTicketProgress()) {
            z10 = true;
        }
        i iVar3 = aVar3;
        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(aVar, m11, z10, (yf.q) g0.c.e(-964987781, true, new CreateTicketContentScreenKt$CreateTicketContentScreen$1$2(content2), h10, 54), h10, ((i10 >> 6) & 14) | 3120, 0);
        i i14 = q.i(n.m(q.h(aVar6, 0.0f, 1, (Object) null), 0.0f, h.j((float) 8), 0.0f, h.j(f12), 5, (Object) null), h.j((float) 48));
        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
        int i15 = IntercomTheme.$stable;
        a e11 = intercomTheme3.getShapes(h10, i15).e();
        i.a aVar7 = aVar6;
        C6787a aVar8 = aVar2;
        i iVar4 = i14;
        a aVar9 = e11;
        C1500m mVar2 = h10;
        C1393m.c(aVar8, iVar4, false, aVar9, C1389k.f7680a.r(0, intercomTheme3.getColors(h10, i15).m700getPrimaryText0d7_KjU(), 0, 0, h10, C1389k.f7694o << 12, 13), (C1391l) null, (C2868g) null, (N) null, (l) null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m544getLambda1$intercom_sdk_base_release(), mVar2, ((i10 >> 9) & 14) | 805306416, 484);
        a0.a(q.i(aVar7, h.j(f12)), h10, 6);
        h10.u();
        Y0 k11 = h10.k();
        if (k11 != null) {
            k11.a(new D(iVar3, content, aVar, aVar2, lVar, lVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CreateTicketContentScreen$lambda$3$lambda$2$lambda$1(QuestionState questionState, p0.l lVar) {
        C6496s.h(questionState, "$questionState");
        C6496s.h(lVar, "it");
        if ((questionState.getQuestionModel() instanceof SurveyData.Step.Question.ShortTextQuestionModel) && !(questionState.getAnswer() instanceof Answer.NoAnswer.InitialNoAnswer) && !lVar.b()) {
            questionState.validate();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M CreateTicketContentScreen$lambda$4(i iVar, CreateTicketViewModel.CreateTicketFormUiState.Content content, C6787a aVar, C6787a aVar2, C6798l lVar, C6798l lVar2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(content, "$state");
        C6496s.h(aVar, "$onCreateTicket");
        C6496s.h(aVar2, "$onCancel");
        C6496s.h(lVar, "$onAnswerUpdated");
        C6496s.h(lVar2, "$onAnswerClick");
        CreateTicketContentScreen(iVar, content, aVar, aVar2, lVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void CreateTicketContentScreenPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1070922859);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m545getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new A(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CreateTicketContentScreenPreview$lambda$5(int i10, C1500m mVar, int i11) {
        CreateTicketContentScreenPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void CreateTicketErrorPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-627794766);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m547getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new y(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CreateTicketErrorPreview$lambda$7(int i10, C1500m mVar, int i11) {
        CreateTicketErrorPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void CreateTicketLoadingPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1078617214);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m546getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new z(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CreateTicketLoadingPreview$lambda$6(int i10, C1500m mVar, int i11) {
        CreateTicketLoadingPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void CreateTicketScreen(CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar, C6798l lVar2, C1500m mVar, int i10) {
        int i11;
        C1500m mVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState2 = createTicketFormUiState;
        C6787a aVar4 = aVar;
        C6787a aVar5 = aVar2;
        C6787a aVar6 = aVar3;
        C6798l lVar3 = lVar;
        C6798l lVar4 = lVar2;
        int i18 = i10;
        C6496s.h(createTicketFormUiState2, "uiState");
        C6496s.h(aVar4, "onBackClick");
        C6496s.h(aVar5, "onCreateTicket");
        C6496s.h(aVar6, "onCancel");
        C6496s.h(lVar3, "onAnswerUpdated");
        C6496s.h(lVar4, "onAnswerClick");
        C1500m h10 = mVar.h(-2129527205);
        if ((i18 & 14) == 0) {
            if (h10.S(createTicketFormUiState2)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i18;
        } else {
            i11 = i18;
        }
        if ((i18 & 112) == 0) {
            if (h10.C(aVar4)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i18 & 896) == 0) {
            if (h10.C(aVar5)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i18 & 7168) == 0) {
            if (h10.C(aVar6)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i11 |= i14;
        }
        if ((57344 & i18) == 0) {
            if (h10.C(lVar3)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i11 |= i13;
        }
        if ((458752 & i18) == 0) {
            if (h10.C(lVar4)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        if ((i11 & 374491) != 74898 || !h10.i()) {
            i d10 = i0.d(b.d(i.f23074a, IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), l0.b(f0.f925a, h10, 8));
            C2005a e10 = g0.c.e(-2106967777, true, new CreateTicketContentScreenKt$CreateTicketScreen$1(createTicketFormUiState2, aVar4), h10, 54);
            CreateTicketContentScreenKt$CreateTicketScreen$2 createTicketContentScreenKt$CreateTicketScreen$2 = r0;
            CreateTicketContentScreenKt$CreateTicketScreen$2 createTicketContentScreenKt$CreateTicketScreen$22 = new CreateTicketContentScreenKt$CreateTicketScreen$2(createTicketFormUiState, aVar2, aVar3, lVar, lVar2);
            mVar2 = h10;
            C1415x0.a(d10, e10, (p) null, (p) null, (p) null, 0, 0, 0, (f0) null, g0.c.e(426563690, true, createTicketContentScreenKt$CreateTicketScreen$2, h10, 54), mVar2, 805306416, 508);
        } else {
            h10.I();
            mVar2 = h10;
        }
        Y0 k10 = mVar2.k();
        if (k10 != null) {
            k10.a(new x(createTicketFormUiState, aVar, aVar2, aVar3, lVar, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CreateTicketScreen$lambda$0(CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar, C6798l lVar2, int i10, C1500m mVar, int i11) {
        C6496s.h(createTicketFormUiState, "$uiState");
        C6496s.h(aVar, "$onBackClick");
        C6496s.h(aVar2, "$onCreateTicket");
        C6496s.h(aVar3, "$onCancel");
        C6496s.h(lVar, "$onAnswerUpdated");
        C6496s.h(lVar2, "$onAnswerClick");
        CreateTicketScreen(createTicketFormUiState, aVar, aVar2, aVar3, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
