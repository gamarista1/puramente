package io.intercom.android.sdk.survey.ui.questiontype.files;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.a0;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.q;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import io.intercom.android.sdk.ui.component.MediaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import x.C2843G;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class UploadFileQuestionKt$UploadFileQuestion$2 implements p {
    final /* synthetic */ Answer $answer;
    final /* synthetic */ Context $context;
    final /* synthetic */ i $modifier;
    final /* synthetic */ C6798l $onAnswer;
    final /* synthetic */ C6798l $onAnswerClick;
    final /* synthetic */ p $questionHeader;
    final /* synthetic */ SurveyData.Step.Question.UploadFileQuestionModel $questionModel;

    UploadFileQuestionKt$UploadFileQuestion$2(i iVar, p pVar, Answer answer, SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel, C6798l lVar, C6798l lVar2, Context context) {
        this.$modifier = iVar;
        this.$questionHeader = pVar;
        this.$answer = answer;
        this.$questionModel = uploadFileQuestionModel;
        this.$onAnswerClick = lVar;
        this.$onAnswer = lVar2;
        this.$context = context;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$5$lambda$0(C6798l lVar, SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel, Answer.MediaAnswer.MediaItem mediaItem) {
        C6496s.h(uploadFileQuestionModel, "$questionModel");
        C6496s.h(mediaItem, "item");
        lVar.invoke(new AnswerClickData(mediaItem, uploadFileQuestionModel.getId()));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$5$lambda$4(Answer answer, C6798l lVar, Context context, List list) {
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(context, "$context");
        C6496s.h(list, "uris");
        ArrayList<MediaData.Media> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaData.Media mediaData$default = URIExtensionsKt.getMediaData$default((Uri) it.next(), context, false, 2, (Object) null);
            if (mediaData$default != null) {
                arrayList.add(mediaData$default);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
        for (MediaData.Media mediaItem : arrayList) {
            arrayList2.add(new Answer.MediaAnswer.MediaItem(mediaItem));
        }
        if (answer instanceof Answer.NoAnswer.InitialNoAnswer) {
            lVar.invoke(new Answer.MediaAnswer(arrayList2));
        } else {
            ArrayList arrayList3 = new ArrayList();
            C6496s.f(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
            arrayList3.addAll(((Answer.MediaAnswer) answer).getMediaItems());
            arrayList3.addAll(arrayList2);
            lVar.invoke(new Answer.MediaAnswer(arrayList3));
        }
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            i iVar = this.$modifier;
            p pVar = this.$questionHeader;
            Answer answer = this.$answer;
            SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel = this.$questionModel;
            C6798l lVar = this.$onAnswerClick;
            C6798l lVar2 = this.$onAnswer;
            Context context = this.$context;
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, iVar);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a12 = aVar.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            F1.b(a13, a10, aVar.c());
            F1.b(a13, p10, aVar.e());
            p b10 = aVar.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar.d());
            C1093k kVar = C1093k.f978a;
            pVar.invoke(mVar2, 0);
            i.a aVar2 = i.f23074a;
            float f10 = (float) 8;
            a0.a(q.i(aVar2, c1.h.j(f10)), mVar2, 6);
            mVar2.T(903574919);
            boolean z10 = answer instanceof Answer.MediaAnswer;
            if (z10) {
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                FileAttachmentListKt.FileAttachmentList(mediaAnswer.getMediaItems(), new K(lVar, uploadFileQuestionModel), mVar2, 8);
                if (!mediaAnswer.getMediaItems().isEmpty()) {
                    a0.a(q.i(aVar2, c1.h.j(f10)), mVar2, 6);
                }
            }
            mVar.M();
            int size = z10 ? ((Answer.MediaAnswer) answer).getMediaItems().size() : 0;
            mVar2.T(903602132);
            if (size < uploadFileQuestionModel.getMaxSelection()) {
                MediaPickerButtonKt.MediaPickerButton(uploadFileQuestionModel.getMaxSelection() - size, (C2843G) null, MediaType.All, uploadFileQuestionModel.getSupportedFileType(), new L(answer, lVar2, context), new MediaPickerButtonCTAStyle.TextButton(M0.i.a(R.string.intercom_add, mVar2, 0)), (C6787a) null, g0.c.e(562613810, true, new UploadFileQuestionKt$UploadFileQuestion$2$1$3(uploadFileQuestionModel), mVar2, 54), mVar, (MediaPickerButtonCTAStyle.TextButton.$stable << 15) | 12587392, 66);
            }
            mVar.M();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
