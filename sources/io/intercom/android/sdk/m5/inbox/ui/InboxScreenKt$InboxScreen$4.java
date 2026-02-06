package io.intercom.android.sdk.m5.inbox.ui;

import B.l;
import I.g;
import V.O;
import V.Q;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InboxScreenKt$InboxScreen$4 implements p {
    final /* synthetic */ C6787a $onSendMessageButtonClick;
    final /* synthetic */ InboxUiState $uiState;

    InboxScreenKt$InboxScreen$4(InboxUiState inboxUiState, C6787a aVar) {
        this.$uiState = inboxUiState;
        this.$onSendMessageButtonClick = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            InboxUiState inboxUiState = this.$uiState;
            if ((inboxUiState instanceof InboxUiState.Content) && ((InboxUiState.Content) inboxUiState).getShowSendMessageFab()) {
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i11 = IntercomTheme.$stable;
                long r42 = intercomTheme.getColors(mVar2, i11).m672getAction0d7_KjU();
                long r62 = intercomTheme.getColors(mVar2, i11).m694getOnAction0d7_KjU();
                Q.a(this.$onSendMessageButtonClick, n.m(i.f23074a, 0.0f, 0.0f, 0.0f, h.j((float) 16), 7, (Object) null), g.e(), r42, r62, (O) null, (l) null, ComposableSingletons$InboxScreenKt.INSTANCE.m401getLambda1$intercom_sdk_base_release(), mVar, 12582960, 96);
                return;
            }
            return;
        }
        mVar.I();
    }
}
