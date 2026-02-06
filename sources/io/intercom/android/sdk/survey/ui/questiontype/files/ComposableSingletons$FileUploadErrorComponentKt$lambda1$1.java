package io.intercom.android.sdk.survey.ui.questiontype.files;

import Y.C1500m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileUploadErrorComponentKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$FileUploadErrorComponentKt$lambda1$1 implements p {
    public static final ComposableSingletons$FileUploadErrorComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$FileUploadErrorComponentKt$lambda1$1();

    ComposableSingletons$FileUploadErrorComponentKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            FileUploadErrorComponentKt.FileUploadErrorComponent("Error", new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(C6565s.e(new StringProvider.StringRes(R.string.intercom_upload_failed, (List) null, 2, (DefaultConstructorMarker) null))), new C6305e(), new C6306f(), mVar, 3462);
        } else {
            mVar.I();
        }
    }
}
