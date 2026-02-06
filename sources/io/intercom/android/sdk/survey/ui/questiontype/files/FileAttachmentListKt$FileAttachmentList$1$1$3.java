package io.intercom.android.sdk.survey.ui.questiontype.files;

import C.Y;
import V.C1400p0;
import Y.C1500m;
import c1.h;
import io.intercom.android.sdk.survey.ui.models.Answer;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FileAttachmentListKt$FileAttachmentList$1$1$3 implements q {
    final /* synthetic */ Answer.MediaAnswer.MediaItem $it;

    FileAttachmentListKt$FileAttachmentList$1$1$3(Answer.MediaAnswer.MediaItem mediaItem) {
        this.$it = mediaItem;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C6496s.h(y10, "$this$FileAttachment");
        if ((i10 & 81) != 16 || !mVar.i()) {
            Answer.MediaAnswer.FileUploadStatus uploadStatus = this.$it.getUploadStatus();
            if (C6496s.c(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE)) {
                C1400p0.a(androidx.compose.foundation.layout.q.n(i.f23074a, h.j((float) 16)), 0, h.j((float) 1), 0, 0, mVar, 390, 26);
            } else if (!C6496s.c(uploadStatus, Answer.MediaAnswer.FileUploadStatus.None.INSTANCE) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Error) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Queued)) {
                throw new C6535s();
            }
        } else {
            mVar.I();
        }
    }
}
