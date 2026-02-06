package io.intercom.android.sdk.m5.conversation.ui.components;

import M0.i;
import Y.C1500m;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MediaInputSheetContentKt$lambda-4$1  reason: invalid class name */
final class ComposableSingletons$MediaInputSheetContentKt$lambda4$1 implements p {
    public static final ComposableSingletons$MediaInputSheetContentKt$lambda4$1 INSTANCE = new ComposableSingletons$MediaInputSheetContentKt$lambda4$1();

    ComposableSingletons$MediaInputSheetContentKt$lambda4$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            MediaInputSheetContentKt.MediaInputSheetContentItem(i.a(R.string.intercom_select_files, mVar, 0), R.drawable.intercom_ic_attachment, mVar, 0);
        } else {
            mVar.I();
        }
    }
}
