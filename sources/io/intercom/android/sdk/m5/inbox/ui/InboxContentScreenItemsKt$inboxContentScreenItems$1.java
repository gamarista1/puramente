package io.intercom.android.sdk.m5.inbox.ui;

import D.c;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import n3.C2331a;
import yf.C6798l;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InboxContentScreenItemsKt$inboxContentScreenItems$1 implements r {
    final /* synthetic */ C2331a $inboxConversations;
    final /* synthetic */ C6798l $onConversationClick;

    InboxContentScreenItemsKt$inboxContentScreenItems$1(C2331a aVar, C6798l lVar) {
        this.$inboxConversations = aVar;
        this.$onConversationClick = lVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(C6798l lVar, Conversation conversation) {
        C6496s.h(lVar, "$onConversationClick");
        C6496s.h(conversation, "$conversation");
        lVar.invoke(conversation);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((c) obj, ((Number) obj2).intValue(), (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, int i10, C1500m mVar, int i11) {
        C6496s.h(cVar, "$this$items");
        if ((i11 & 112) == 0) {
            i11 |= mVar.d(i10) ? 32 : 16;
        }
        if ((i11 & 721) != 144 || !mVar.i()) {
            Conversation conversation = (Conversation) this.$inboxConversations.f(i10);
            if (conversation != null) {
                C6798l lVar = this.$onConversationClick;
                i.a aVar = i.f23074a;
                float f10 = (float) 16;
                ConversationItemKt.ConversationItem(conversation, q.h(aVar, 0.0f, 1, (Object) null), n.a(h.j(f10)), false, new i(lVar, conversation), mVar, 440, 8);
                IntercomDividerKt.IntercomDivider(n.k(aVar, h.j(f10), 0.0f, 2, (Object) null), mVar, 6, 0);
                return;
            }
            return;
        }
        mVar.I();
    }
}
