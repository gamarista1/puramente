package io.intercom.android.sdk.m5.inbox.ui;

import C.C1085c;
import C.N;
import C.i0;
import D.A;
import D.C1109b;
import D.x;
import Y.C1500m;
import g0.c;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.models.Conversation;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.q;
import z.n;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InboxScreenKt$InboxScreen$5 implements q {
    final /* synthetic */ C6787a $onBrowseHelpCenterButtonClick;
    final /* synthetic */ C6787a $onSendMessageButtonClick;
    final /* synthetic */ InboxUiState $uiState;
    final /* synthetic */ InboxViewModel $viewModel;

    InboxScreenKt$InboxScreen$5(InboxUiState inboxUiState, InboxViewModel inboxViewModel, C6787a aVar, C6787a aVar2) {
        this.$uiState = inboxUiState;
        this.$viewModel = inboxViewModel;
        this.$onSendMessageButtonClick = aVar;
        this.$onBrowseHelpCenterButtonClick = aVar2;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2(InboxUiState inboxUiState, InboxViewModel inboxViewModel, C6787a aVar, C6787a aVar2, x xVar) {
        C6496s.h(inboxUiState, "$uiState");
        C6496s.h(inboxViewModel, "$viewModel");
        C6496s.h(aVar, "$onSendMessageButtonClick");
        C6496s.h(aVar2, "$onBrowseHelpCenterButtonClick");
        C6496s.h(xVar, "$this$LazyColumn");
        if (inboxUiState instanceof InboxUiState.Content) {
            InboxUiState.Content content = (InboxUiState.Content) inboxUiState;
            InboxContentScreenItemsKt.inboxContentScreenItems(xVar, content.getInboxConversations(), new z(inboxViewModel));
            ErrorState errorState = content.getErrorState();
            if (errorState != null) {
                x.c(xVar, (Object) null, (Object) null, c.c(73339207, true, new InboxScreenKt$InboxScreen$5$1$2$1(errorState)), 3, (Object) null);
            }
            if (content.isLoadingMore()) {
                x.c(xVar, (Object) null, (Object) null, ComposableSingletons$InboxScreenKt.INSTANCE.m402getLambda2$intercom_sdk_base_release(), 3, (Object) null);
            }
        } else if (inboxUiState instanceof InboxUiState.Empty) {
            x.c(xVar, (Object) null, (Object) null, c.c(-1966270794, true, new InboxScreenKt$InboxScreen$5$1$3(inboxUiState, aVar, aVar2)), 3, (Object) null);
        } else if (inboxUiState instanceof InboxUiState.Error) {
            x.c(xVar, (Object) null, (Object) null, c.c(1263729271, true, new InboxScreenKt$InboxScreen$5$1$4(inboxUiState)), 3, (Object) null);
        } else if ((inboxUiState instanceof InboxUiState.Initial) || (inboxUiState instanceof InboxUiState.Loading)) {
            x.c(xVar, (Object) null, (Object) null, ComposableSingletons$InboxScreenKt.INSTANCE.m403getLambda3$intercom_sdk_base_release(), 3, (Object) null);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2$lambda$0(InboxViewModel inboxViewModel, Conversation conversation) {
        C6496s.h(inboxViewModel, "$viewModel");
        C6496s.h(conversation, "conversation");
        inboxViewModel.onConversationClick(conversation);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((N) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(N n10, C1500m mVar, int i10) {
        int i11;
        N n11 = n10;
        C6496s.h(n10, "paddingValues");
        C1500m mVar2 = mVar;
        if ((i10 & 14) == 0) {
            i11 = i10 | (mVar2.S(n10) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) != 18 || !mVar.i()) {
            C1109b.a(i0.a(androidx.compose.foundation.layout.q.f(i.f23074a, 0.0f, 1, (Object) null), n10), (A) null, n10, false, (C1085c.m) null, k0.c.f23044a.g(), (n) null, false, new y(this.$uiState, this.$viewModel, this.$onSendMessageButtonClick, this.$onBrowseHelpCenterButtonClick), mVar, ((i11 << 6) & 896) | 196608, 218);
            return;
        }
        mVar.I();
    }
}
