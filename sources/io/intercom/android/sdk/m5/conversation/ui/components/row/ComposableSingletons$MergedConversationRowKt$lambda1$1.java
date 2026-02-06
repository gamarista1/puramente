package io.intercom.android.sdk.m5.conversation.ui.components.row;

import Y.C1500m;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$MergedConversationRowKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$MergedConversationRowKt$lambda1$1 implements p {
    public static final ComposableSingletons$MergedConversationRowKt$lambda1$1 INSTANCE = new ComposableSingletons$MergedConversationRowKt$lambda1$1();

    ComposableSingletons$MergedConversationRowKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            MergedConversationRowKt.MergedConversationRow((i) null, "A conversation was merged into this one", "123", (C6798l) null, mVar, 432, 9);
        } else {
            mVar.I();
        }
    }
}
