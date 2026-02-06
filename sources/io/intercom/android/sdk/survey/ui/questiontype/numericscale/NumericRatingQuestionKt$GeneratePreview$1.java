package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import Ef.i;
import Y.C1500m;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import mf.L;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class NumericRatingQuestionKt$GeneratePreview$1 implements p {
    final /* synthetic */ Answer $answer;
    final /* synthetic */ int $end;
    final /* synthetic */ SurveyData.Step.Question.QuestionData.QuestionSubType $questionSubType;
    final /* synthetic */ int $start;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionData.QuestionSubType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    NumericRatingQuestionKt$GeneratePreview$1(SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, int i10, int i11, Answer answer) {
        this.$questionSubType = questionSubType;
        this.$start = i10;
        this.$end = i11;
        this.$answer = answer;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(Answer answer) {
        C6496s.h(answer, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        ArrayList arrayList;
        if ((i10 & 11) != 2 || !mVar.i()) {
            String uuid = UUID.randomUUID().toString();
            C6496s.g(uuid, "toString(...)");
            List e10 = C6565s.e(new Block.Builder().withText("How cool is this preview?"));
            if (WhenMappings.$EnumSwitchMapping$0[this.$questionSubType.ordinal()] == 1) {
                arrayList = C6565s.q(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(1, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😖"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(2, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😕"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(3, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😐"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(4, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😃"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(5, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩"));
            } else {
                i iVar = new i(this.$start, this.$end);
                ArrayList arrayList2 = new ArrayList(C6565s.y(iVar, 10));
                Iterator it = iVar.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption(((L) it).a()));
                }
                arrayList = arrayList2;
            }
            NumericRatingQuestionKt.NumericRatingQuestion((k0.i) null, new SurveyData.Step.Question.NumericRatingQuestionModel(uuid, e10, true, arrayList, "Not likely", "Very likely", this.$start, this.$end, this.$questionSubType), this.$answer, new q(), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), (p) null, mVar, 3136, 33);
            return;
        }
        mVar.I();
    }
}
