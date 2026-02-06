package io.intercom.android.sdk.survey.ui.questiontype.files;

import Y.C1500m;
import android.net.Uri;
import com.amazon.a.a.n.a.a.g;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileAttachmentListKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$FileAttachmentListKt$lambda3$1 implements p {
    public static final ComposableSingletons$FileAttachmentListKt$lambda3$1 INSTANCE = new ComposableSingletons$FileAttachmentListKt$lambda3$1();

    ComposableSingletons$FileAttachmentListKt$lambda3$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(Answer.MediaAnswer.MediaItem mediaItem) {
        C6496s.h(mediaItem, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            Uri uri = Uri.EMPTY;
            C6496s.g(uri, g.f37322a);
            Answer.MediaAnswer.MediaItem mediaItem = new Answer.MediaAnswer.MediaItem(new MediaData.Media.Image(ClipboardModule.MIMETYPE_PNG, 0, 0, 0, "google.png", uri));
            mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(C6565s.e(new StringProvider.StringRes(R.string.intercom_file_max_limit, (List) null, 2, (DefaultConstructorMarker) null)))));
            FileAttachmentListKt.FileAttachmentList(C6565s.e(mediaItem), new C6304d(), mVar, 48);
            return;
        }
        mVar.I();
    }
}
