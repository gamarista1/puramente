package io.intercom.android.sdk.survey.ui.components;

import I.a;
import J.C1225v;
import V.C1395n;
import V.C1397o;
import V.C1399p;
import V.C1401q;
import V0.p;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.relocation.b;
import androidx.compose.ui.platform.C1644k0;
import androidx.compose.ui.platform.C1651m1;
import c1.h;
import c1.w;
import g0.C2005a;
import g0.c;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import p0.e;
import r0.C2550z0;
import x.C2868g;
import yf.C6798l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0001\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lk0/i;", "modifier", "contentModifier", "Lio/intercom/android/sdk/survey/QuestionState;", "questionState", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "surveyUiColors", "Lkotlin/Function1;", "", "Llf/M;", "onAnswerUpdated", "Lr0/x0;", "backgroundColor", "Lc1/h;", "elevation", "LV0/p;", "questionFontWeight", "Lc1/v;", "questionFontSize", "Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "onAnswerClick", "QuestionComponent-lzVJ5Jw", "(Lk0/i;Lk0/i;Lio/intercom/android/sdk/survey/QuestionState;Lio/intercom/android/sdk/survey/SurveyUiColors;Lyf/l;JFLV0/p;JLyf/l;LY/m;II)V", "QuestionComponent", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuestionComponentKt {
    /* renamed from: QuestionComponent-lzVJ5Jw  reason: not valid java name */
    public static final void m467QuestionComponentlzVJ5Jw(i iVar, i iVar2, QuestionState questionState, SurveyUiColors surveyUiColors, C6798l lVar, long j10, float f10, p pVar, long j11, C6798l lVar2, C1500m mVar, int i10, int i11) {
        SurveyUiColors surveyUiColors2;
        int i12;
        QuestionState questionState2 = questionState;
        C6798l lVar3 = lVar;
        int i13 = i11;
        C6496s.h(questionState2, "questionState");
        C6496s.h(lVar3, "onAnswerUpdated");
        C1500m h10 = mVar.h(435304450);
        i iVar3 = (i13 & 1) != 0 ? i.f23074a : iVar;
        i i14 = (i13 & 2) != 0 ? n.i(i.f23074a, h.j((float) 16)) : iVar2;
        if ((i13 & 8) != 0) {
            i12 = i10 & -7169;
            surveyUiColors2 = questionState.getSurveyUiColors();
        } else {
            surveyUiColors2 = surveyUiColors;
            i12 = i10;
        }
        long d10 = (i13 & 32) != 0 ? C2550z0.d(4294309365L) : j10;
        float j12 = (i13 & 64) != 0 ? h.j((float) 1) : f10;
        p c10 = (i13 & 128) != 0 ? p.f8210b.c() : pVar;
        long f11 = (i13 & 256) != 0 ? w.f(16) : j11;
        C6288k kVar = (i13 & 512) != 0 ? new C6288k() : lVar2;
        C6289l lVar4 = new C6289l(questionState2, lVar3);
        C6290m mVar2 = new C6290m(questionState2, lVar3, (C1651m1) h10.m(C1644k0.o()), (e) h10.m(C1644k0.f()));
        C2005a e10 = c.e(1322549775, true, new QuestionComponentKt$QuestionComponent$questionHeader$1(questionState2, c10, f11), h10, 54);
        i b10 = b.b(iVar3, questionState.getBringIntoViewRequester());
        C1397o oVar = C1397o.f7854a;
        int i15 = C1397o.f7855b;
        C1395n b11 = oVar.b(d10, 0, 0, 0, h10, ((i12 >> 15) & 14) | (i15 << 12), 14);
        long j13 = f11;
        p pVar2 = c10;
        C1399p c11 = oVar.c(j12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, h10, ((i12 >> 18) & 14) | (i15 << 18), 62);
        a e11 = IntercomTheme.INSTANCE.getShapes(h10, IntercomTheme.$stable).e();
        i iVar4 = iVar3;
        QuestionComponentKt$QuestionComponent$2 questionComponentKt$QuestionComponent$2 = r0;
        QuestionComponentKt$QuestionComponent$2 questionComponentKt$QuestionComponent$22 = new QuestionComponentKt$QuestionComponent$2(questionState, i14, lVar4, surveyUiColors2, e10, mVar2, kVar, pVar2, j13);
        C1401q.a(b10, e11, b11, c11, (C2868g) null, c.e(2001737844, true, questionComponentKt$QuestionComponent$2, h10, 54), h10, 196608, 16);
        Y0 k10 = h10.k();
        if (k10 != null) {
            C6291n nVar = r0;
            C6291n nVar2 = new C6291n(iVar4, i14, questionState, surveyUiColors2, lVar, d10, j12, pVar2, j13, kVar, i10, i11);
            k10.a(nVar);
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M QuestionComponent_lzVJ5Jw$lambda$0(AnswerClickData answerClickData) {
        C6496s.h(answerClickData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M QuestionComponent_lzVJ5Jw$lambda$1(QuestionState questionState, C6798l lVar, Answer answer) {
        C6496s.h(questionState, "$questionState");
        C6496s.h(lVar, "$onAnswerUpdated");
        C6496s.h(answer, "it");
        questionState.setAnswer(answer);
        if (!(questionState.getQuestionModel() instanceof SurveyData.Step.Question.ShortTextQuestionModel) && !(questionState.getQuestionModel() instanceof SurveyData.Step.Question.LongTextQuestionModel)) {
            questionState.validate();
        }
        lVar.invoke(questionState.getQuestionModel().getId());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M QuestionComponent_lzVJ5Jw$lambda$2(QuestionState questionState, C6798l lVar, C1651m1 m1Var, e eVar, C1225v vVar) {
        C6496s.h(questionState, "$questionState");
        C6496s.h(lVar, "$onAnswerUpdated");
        C6496s.h(eVar, "$focusManager");
        C6496s.h(vVar, "<this>");
        questionState.validate();
        lVar.invoke(questionState.getQuestionModel().getId());
        if (questionState.getValidationError() instanceof ValidationError.NoValidationError) {
            if (m1Var != null) {
                m1Var.a();
            }
            e.c(eVar, false, 1, (Object) null);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M QuestionComponent_lzVJ5Jw$lambda$3(i iVar, i iVar2, QuestionState questionState, SurveyUiColors surveyUiColors, C6798l lVar, long j10, float f10, p pVar, long j11, C6798l lVar2, int i10, int i11, C1500m mVar, int i12) {
        QuestionState questionState2 = questionState;
        C6496s.h(questionState2, "$questionState");
        C6798l lVar3 = lVar;
        C6496s.h(lVar3, "$onAnswerUpdated");
        m467QuestionComponentlzVJ5Jw(iVar, iVar2, questionState2, surveyUiColors, lVar3, j10, f10, pVar, j11, lVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
