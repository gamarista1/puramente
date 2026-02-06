package io.intercom.android.sdk.survey.ui.questiontype.files;

import Y.C1500m;
import android.net.Uri;
import com.amazon.a.a.n.a.a.g;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FileActionSheetKt$FileActionSheetPreviewForStatus$1 implements p {
    final /* synthetic */ Answer.MediaAnswer.FileUploadStatus $uploadStatus;

    FileActionSheetKt$FileActionSheetPreviewForStatus$1(Answer.MediaAnswer.FileUploadStatus fileUploadStatus) {
        this.$uploadStatus = fileUploadStatus;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4() {
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
            mediaItem.setUploadStatus(this.$uploadStatus);
            FileActionSheetKt.FileActionSheet(mediaItem, new q(), new r(), new s(), new t(), mVar, 28080);
            return;
        }
        mVar.I();
    }
}
