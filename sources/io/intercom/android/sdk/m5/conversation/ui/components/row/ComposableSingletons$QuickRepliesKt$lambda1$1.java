package io.intercom.android.sdk.m5.conversation.ui.components.row;

import Y.C1500m;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$QuickRepliesKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$QuickRepliesKt$lambda1$1 implements p {
    public static final ComposableSingletons$QuickRepliesKt$lambda1$1 INSTANCE = new ComposableSingletons$QuickRepliesKt$lambda1$1();

    ComposableSingletons$QuickRepliesKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(QuickReply quickReply) {
        C6496s.h(quickReply, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            QuickRepliesKt.QuickReplies(C6565s.q(new QuickReply("1", "Option 1"), new QuickReply("2", "Option 2"), new QuickReply("3", "Option 3"), new QuickReply("4", "Option 4"), new QuickReply("5", "Option 5")), new C6158z(), (i) null, mVar, 48, 4);
        } else {
            mVar.I();
        }
    }
}
