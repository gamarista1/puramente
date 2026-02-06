package io.intercom.android.sdk.survey.ui.questiontype.text;

import Y.C1500m;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
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

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$ShortTextQuestionKt$lambda-5$1  reason: invalid class name */
final class ComposableSingletons$ShortTextQuestionKt$lambda5$1 implements p {
    public static final ComposableSingletons$ShortTextQuestionKt$lambda5$1 INSTANCE = new ComposableSingletons$ShortTextQuestionKt$lambda5$1();

    ComposableSingletons$ShortTextQuestionKt$lambda5$1() {
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
            String uuid = UUID.randomUUID().toString();
            C6496s.g(uuid, "toString(...)");
            SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = new SurveyData.Step.Question.ShortTextQuestionModel(uuid, C6565s.e(new Block.Builder().withText("Is this a preview?").withType(BlockType.PARAGRAPH.getSerializedName())), true, "Placeholder text", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 250, false, (Integer) null, (Integer) null, 384, (DefaultConstructorMarker) null);
            SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel2 = shortTextQuestionModel;
            ShortTextQuestionKt.ShortTextQuestion((i) null, shortTextQuestionModel2, new Answer.SingleAnswer("Answer"), new C6316d(), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), ValidationError.NoValidationError.INSTANCE, (C6798l) null, (p) null, mVar, 199680, 193);
            return;
        }
        mVar.I();
    }
}
