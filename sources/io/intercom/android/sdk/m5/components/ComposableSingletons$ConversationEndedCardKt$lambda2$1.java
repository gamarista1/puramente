package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$ConversationEndedCardKt$lambda2$1 implements p {
    public static final ComposableSingletons$ConversationEndedCardKt$lambda2$1 INSTANCE = new ComposableSingletons$ConversationEndedCardKt$lambda2$1();

    ComposableSingletons$ConversationEndedCardKt$lambda2$1() {
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
            ConversationEndedCardKt.ConversationEndedCard((i) null, new C6037m(), new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, (List) null, 2, (DefaultConstructorMarker) null), new ComposerState.ConversationEnded.ConversationEndedCta(new StringProvider.ActualString("Send a message"), R.drawable.intercom_send_message_icon, (String) null, 4, (DefaultConstructorMarker) null)), mVar, (StringProvider.$stable << 6) | 48, 1);
            return;
        }
        mVar.I();
    }
}
