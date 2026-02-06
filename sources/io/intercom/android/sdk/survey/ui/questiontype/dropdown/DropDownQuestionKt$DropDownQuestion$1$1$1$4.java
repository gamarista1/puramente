package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import C.C1092j;
import Y.C1500m;
import Y.C1510r0;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import p0.e;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DropDownQuestionKt$DropDownQuestion$1$1$1$4 implements q {
    final /* synthetic */ SurveyData.Step.Question.DropDownQuestionModel $dropDownQuestionModel;
    final /* synthetic */ C1510r0 $expanded$delegate;
    final /* synthetic */ e $focusManager;
    final /* synthetic */ C6798l $onAnswer;

    DropDownQuestionKt$DropDownQuestion$1$1$1$4(SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel, e eVar, C6798l lVar, C1510r0 r0Var) {
        this.$dropDownQuestionModel = dropDownQuestionModel;
        this.$focusManager = eVar;
        this.$onAnswer = lVar;
        this.$expanded$delegate = r0Var;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2$lambda$1$lambda$0(C6798l lVar, String str, C1510r0 r0Var) {
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(str, "$optionText");
        C6496s.h(r0Var, "$expanded$delegate");
        lVar.invoke(new Answer.SingleAnswer(str));
        DropDownQuestionKt.DropDownQuestion$lambda$2(r0Var, false);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(C.C1092j r19, Y.C1500m r20, int r21) {
        /*
            r18 = this;
            r0 = r18
            r13 = r20
            java.lang.String r1 = "$this$DropdownMenu"
            r2 = r19
            kotlin.jvm.internal.C6496s.h(r2, r1)
            r1 = r21 & 81
            r2 = 16
            if (r1 != r2) goto L_0x001d
            boolean r1 = r20.i()
            if (r1 != 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            r20.I()
            goto L_0x009c
        L_0x001d:
            io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$1 r1 = new io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$1
            p0.e r2 = r0.$focusManager
            r3 = 0
            r1.<init>(r2, r3)
            r2 = 70
            java.lang.String r3 = ""
            Y.P.g(r3, r1, r13, r2)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$DropDownQuestionModel r1 = r0.$dropDownQuestionModel
            java.util.List r1 = r1.getOptions()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            yf.l r14 = r0.$onAnswer
            Y.r0 r15 = r0.$expanded$delegate
            java.util.Iterator r16 = r1.iterator()
            r1 = 0
        L_0x003d:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x009c
            java.lang.Object r2 = r16.next()
            int r17 = r1 + 1
            if (r1 >= 0) goto L_0x004e
            mf.C6565s.x()
        L_0x004e:
            java.lang.String r2 = (java.lang.String) r2
            io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$2$1 r1 = new io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$2$1
            r1.<init>(r2)
            r3 = 54
            r4 = -864903633(0xffffffffcc729e2f, float:-6.3600828E7)
            r5 = 1
            g0.a r1 = g0.c.e(r4, r5, r1, r13, r3)
            r3 = 55713486(0x3521ece, float:6.1748815E-37)
            r13.T(r3)
            boolean r3 = r13.S(r14)
            boolean r4 = r13.S(r2)
            r3 = r3 | r4
            java.lang.Object r4 = r20.A()
            if (r3 != 0) goto L_0x007c
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0084
        L_0x007c:
            io.intercom.android.sdk.survey.ui.questiontype.dropdown.j r4 = new io.intercom.android.sdk.survey.ui.questiontype.dropdown.j
            r4.<init>(r14, r2, r15)
            r13.r(r4)
        L_0x0084:
            r2 = r4
            yf.a r2 = (yf.C6787a) r2
            r20.M()
            r11 = 6
            r12 = 508(0x1fc, float:7.12E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = r20
            V.C1375d.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r17
            goto L_0x003d
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4.invoke(C.j, Y.m, int):void");
    }
}
