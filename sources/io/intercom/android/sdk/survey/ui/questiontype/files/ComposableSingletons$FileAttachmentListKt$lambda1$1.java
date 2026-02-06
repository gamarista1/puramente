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
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileAttachmentListKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$FileAttachmentListKt$lambda1$1 implements p {
    public static final ComposableSingletons$FileAttachmentListKt$lambda1$1 INSTANCE = new ComposableSingletons$FileAttachmentListKt$lambda1$1();

    ComposableSingletons$FileAttachmentListKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(Answer.MediaAnswer.MediaItem mediaItem) {
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
            FileAttachmentListKt.FileAttachmentList(C6565s.e(new Answer.MediaAnswer.MediaItem(new MediaData.Media.Image(ClipboardModule.MIMETYPE_PNG, 0, 0, 0, "google.png", uri))), new C6303c(), mVar, 48);
            return;
        }
        mVar.I();
    }
}
