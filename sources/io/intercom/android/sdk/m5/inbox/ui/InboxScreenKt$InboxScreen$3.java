package io.intercom.android.sdk.m5.inbox.ui;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import r0.C2544x0;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InboxScreenKt$InboxScreen$3 implements p {
    final /* synthetic */ C6787a $onBackButtonClick;
    final /* synthetic */ InboxUiState $uiState;

    InboxScreenKt$InboxScreen$3(InboxUiState inboxUiState, C6787a aVar) {
        this.$uiState = inboxUiState;
        this.$onBackButtonClick = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            String title = this.$uiState.getIntercomTopBarState().getTitle();
            if (title == null) {
                title = "";
            }
            String str = title;
            C6787a aVar = this.$onBackButtonClick;
            Integer navIcon = this.$uiState.getIntercomTopBarState().getNavIcon();
            C2544x0 r12 = this.$uiState.getIntercomTopBarState().m564getBackgroundColorQN2ZGVo();
            mVar2.T(1816943643);
            long r92 = r12 == null ? IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m691getHeader0d7_KjU() : r12.y();
            mVar.M();
            C2544x0 r13 = this.$uiState.getIntercomTopBarState().m565getContentColorQN2ZGVo();
            mVar2.T(1816947066);
            long r21 = r13 == null ? IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m697getOnHeader0d7_KjU() : r13.y();
            mVar.M();
            TopActionBarKt.m207TopActionBarNpQZenA((i) null, str, (String) null, (Integer) null, (List<AvatarWrapper>) null, aVar, navIcon, false, r92, r21, 0, (C6787a) null, (q) null, mVar, 0, 0, 7325);
            return;
        }
        mVar.I();
    }
}
