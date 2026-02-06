package io.intercom.android.sdk.survey.ui.questiontype.files;

import Y.C1500m;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class UploadFileQuestionHeaderKt$UploadFileQuestionHeader$1 implements p {
    final /* synthetic */ List<StringProvider.StringRes> $errorMessages;

    UploadFileQuestionHeaderKt$UploadFileQuestionHeader$1(List<StringProvider.StringRes> list) {
        this.$errorMessages = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            ErrorMessageLayoutKt.ErrorMessageLayout((i) null, this.$errorMessages, mVar, 64, 1);
        } else {
            mVar.I();
        }
    }
}
