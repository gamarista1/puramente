package io.intercom.android.sdk.survey.ui.questiontype;

import Y.C1500m;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$DatePickerQuestionKt$lambda2$1 implements p {
    public static final ComposableSingletons$DatePickerQuestionKt$lambda2$1 INSTANCE = new ComposableSingletons$DatePickerQuestionKt$lambda2$1();

    ComposableSingletons$DatePickerQuestionKt$lambda2$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(Answer answer) {
        C6496s.h(answer, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            DatePickerQuestionKt.DatePickerQuestion((i) null, new SurveyData.Step.Question.DatePickerQuestionModel("123", C6565s.e(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Choose date")), true), (Answer) null, new a(), (p) null, mVar, 3072, 21);
        } else {
            mVar.I();
        }
    }
}
