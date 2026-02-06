package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.models.Conversation;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationHistoryCardKt$ConversationHistoryCard$2 implements p {
    final /* synthetic */ List<Conversation> $conversations;
    final /* synthetic */ C6798l $onConversationClick;

    ConversationHistoryCardKt$ConversationHistoryCard$2(List<Conversation> list, C6798l lVar) {
        this.$conversations = list;
        this.$onConversationClick = lVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(C6798l lVar, Conversation conversation) {
        C6496s.h(conversation, "$it");
        lVar.invoke(conversation);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            C6798l lVar = this.$onConversationClick;
            for (Conversation conversation : this.$conversations) {
                ConversationItemKt.ConversationItem(conversation, q.h(i.f23074a, 0.0f, 1, (Object) null), n.b(h.j((float) 20), h.j((float) 8)), false, new V(lVar, conversation), mVar, 56, 8);
            }
            return;
        }
        mVar.I();
    }
}
