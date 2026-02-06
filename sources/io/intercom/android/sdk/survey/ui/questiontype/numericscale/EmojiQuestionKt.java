package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import Y.C1500m;
import Y.M0;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$EmojiRatingOption;", "options", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "Lkotlin/Function1;", "Llf/M;", "onAnswer", "EmojiQuestion", "(Ljava/util/List;Lio/intercom/android/sdk/survey/ui/models/Answer;Lyf/l;LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EmojiQuestionKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void EmojiQuestion(java.util.List<io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption> r22, io.intercom.android.sdk.survey.ui.models.Answer r23, yf.C6798l r24, Y.C1500m r25, int r26) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            java.lang.String r4 = "options"
            kotlin.jvm.internal.C6496s.h(r0, r4)
            java.lang.String r4 = "answer"
            kotlin.jvm.internal.C6496s.h(r1, r4)
            java.lang.String r4 = "onAnswer"
            kotlin.jvm.internal.C6496s.h(r2, r4)
            r4 = 1738433356(0x679e634c, float:1.4959312E24)
            r5 = r25
            Y.m r4 = r5.h(r4)
            k0.i$a r5 = k0.i.f23074a
            r6 = 0
            r7 = 0
            r12 = 1
            k0.i r5 = androidx.compose.foundation.layout.q.h(r5, r7, r12, r6)
            C.c$a r6 = C.C1085c.a.f891a
            r7 = 12
            float r7 = (float) r7
            float r7 = c1.h.j(r7)
            k0.c$a r8 = k0.c.f23044a
            k0.c$b r9 = r8.g()
            C.c$e r6 = r6.e(r7, r9)
            k0.c$c r7 = r8.i()
            r8 = 54
            H0.F r6 = C.W.b(r6, r7, r4, r8)
            r13 = 0
            int r7 = Y.C1494j.a(r4, r13)
            Y.y r8 = r4.p()
            k0.i r5 = k0.h.e(r4, r5)
            J0.g$a r9 = J0.C1241g.f3853J
            yf.a r10 = r9.a()
            Y.f r11 = r4.j()
            if (r11 != 0) goto L_0x0062
            Y.C1494j.c()
        L_0x0062:
            r4.F()
            boolean r11 = r4.f()
            if (r11 == 0) goto L_0x006f
            r4.U(r10)
            goto L_0x0072
        L_0x006f:
            r4.q()
        L_0x0072:
            Y.m r10 = Y.F1.a(r4)
            yf.p r11 = r9.c()
            Y.F1.b(r10, r6, r11)
            yf.p r6 = r9.e()
            Y.F1.b(r10, r8, r6)
            yf.p r6 = r9.b()
            boolean r8 = r10.f()
            if (r8 != 0) goto L_0x009c
            java.lang.Object r8 = r10.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r11)
            if (r8 != 0) goto L_0x00aa
        L_0x009c:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.r(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.V(r7, r6)
        L_0x00aa:
            yf.p r6 = r9.d()
            Y.F1.b(r10, r5, r6)
            C.Z r5 = C.Z.f873a
            r5 = -1487440982(0xffffffffa75773aa, float:-2.9899945E-15)
            r4.T(r5)
            r5 = r0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r14 = r5.iterator()
        L_0x00c0:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x0166
            java.lang.Object r5 = r14.next()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$EmojiRatingOption r5 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption) r5
            boolean r6 = r1 instanceof io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer
            if (r6 == 0) goto L_0x00e7
            r6 = r1
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r6 = (io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer) r6
            java.lang.String r6 = r6.getAnswer()
            int r7 = r5.getValue()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r7)
            if (r6 == 0) goto L_0x00e7
            r6 = r12
            goto L_0x00e8
        L_0x00e7:
            r6 = r13
        L_0x00e8:
            java.lang.String r7 = r5.getEmojiUrl()
            java.lang.String r8 = r5.getUnicode()
            boolean r9 = r1 instanceof io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer
            if (r9 != 0) goto L_0x00f9
            if (r6 == 0) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            r9 = r13
            goto L_0x00fa
        L_0x00f9:
            r9 = r12
        L_0x00fa:
            k0.i$a r10 = k0.i.f23074a
            if (r6 == 0) goto L_0x0106
            r6 = 34
        L_0x0100:
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            goto L_0x0109
        L_0x0106:
            r6 = 32
            goto L_0x0100
        L_0x0109:
            k0.i r15 = androidx.compose.foundation.layout.q.n(r10, r6)
            r6 = 1945180755(0x73f11a53, float:3.8204268E31)
            r4.T(r6)
            r6 = r3 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r6 <= r10) goto L_0x0121
            boolean r6 = r4.S(r2)
            if (r6 != 0) goto L_0x0125
        L_0x0121:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != r10) goto L_0x0127
        L_0x0125:
            r6 = r12
            goto L_0x0128
        L_0x0127:
            r6 = r13
        L_0x0128:
            boolean r10 = r4.S(r5)
            r6 = r6 | r10
            java.lang.Object r10 = r4.A()
            if (r6 != 0) goto L_0x013b
            Y.m$a r6 = Y.C1500m.f10026a
            java.lang.Object r6 = r6.a()
            if (r10 != r6) goto L_0x0143
        L_0x013b:
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.a r10 = new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a
            r10.<init>(r2, r5)
            r4.r(r10)
        L_0x0143:
            r19 = r10
            yf.a r19 = (yf.C6787a) r19
            r4.M()
            r20 = 7
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            k0.i r10 = androidx.compose.foundation.d.d(r15, r16, r17, r18, r19, r20, r21)
            r11 = 0
            r15 = 0
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r4
            r10 = r11
            r11 = r15
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiRatingKt.EmojiRating(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00c0
        L_0x0166:
            r4.M()
            r4.u()
            Y.Y0 r4 = r4.k()
            if (r4 == 0) goto L_0x017a
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.b r5 = new io.intercom.android.sdk.survey.ui.questiontype.numericscale.b
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiQuestionKt.EmojiQuestion(java.util.List, io.intercom.android.sdk.survey.ui.models.Answer, yf.l, Y.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0(C6798l lVar, SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption emojiRatingOption) {
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(emojiRatingOption, "$option");
        lVar.invoke(new Answer.SingleAnswer(String.valueOf(emojiRatingOption.getValue())));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M EmojiQuestion$lambda$4(List list, Answer answer, C6798l lVar, int i10, C1500m mVar, int i11) {
        C6496s.h(list, "$options");
        C6496s.h(answer, "$answer");
        C6496s.h(lVar, "$onAnswer");
        EmojiQuestion(list, answer, lVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
