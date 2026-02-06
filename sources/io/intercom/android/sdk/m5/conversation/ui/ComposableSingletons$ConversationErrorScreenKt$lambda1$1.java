package io.intercom.android.sdk.m5.conversation.ui;

import Y.C1500m;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.ComposableSingletons$ConversationErrorScreenKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$ConversationErrorScreenKt$lambda1$1 implements p {
    public static final ComposableSingletons$ConversationErrorScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationErrorScreenKt$lambda1$1();

    ComposableSingletons$ConversationErrorScreenKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            ConversationErrorScreenKt.ConversationErrorScreen(new ConversationUiState.Error(true, TopAppBarUiState.Companion.getDefault()), new C6064a(), (i) null, mVar, 56, 4);
        } else {
            mVar.I();
        }
    }
}
