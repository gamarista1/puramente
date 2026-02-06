package io.intercom.android.sdk.m5.conversation.ui.components;

import Y.C1500m;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$UploadSizeLimitDialogKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$UploadSizeLimitDialogKt$lambda2$1 implements p {
    public static final ComposableSingletons$UploadSizeLimitDialogKt$lambda2$1 INSTANCE = new ComposableSingletons$UploadSizeLimitDialogKt$lambda2$1();

    ComposableSingletons$UploadSizeLimitDialogKt$lambda2$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            UploadSizeLimitDialogKt.UploadSizeLimitDialog("Couldn't send", "Can't send files over 100MB", (C6787a) null, mVar, 54, 4);
        } else {
            mVar.I();
        }
    }
}
