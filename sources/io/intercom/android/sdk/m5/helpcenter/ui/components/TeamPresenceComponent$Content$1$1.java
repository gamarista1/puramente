package io.intercom.android.sdk.m5.helpcenter.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TeamPresenceComponent$Content$1$1 implements p {
    final /* synthetic */ ArticleViewState.TeamPresenceState $it;
    final /* synthetic */ TeamPresenceComponent this$0;

    TeamPresenceComponent$Content$1$1(TeamPresenceComponent teamPresenceComponent, ArticleViewState.TeamPresenceState teamPresenceState) {
        this.this$0 = teamPresenceComponent;
        this.$it = teamPresenceState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) == 2 && mVar.i()) {
            mVar.I();
        } else if (this.this$0.getNeedsChatBubble()) {
            mVar.T(-365619251);
            TeamPresenceComponentKt.TeamPresenceComponentWithBubble(this.$it, mVar, 0);
            mVar.M();
        } else {
            mVar.T(-365539209);
            TeamPresenceComponentKt.TeamPresenceComponent(this.$it, false, (TeamPresenceButtonStyle) null, mVar, 0, 6);
            mVar.M();
        }
    }
}
