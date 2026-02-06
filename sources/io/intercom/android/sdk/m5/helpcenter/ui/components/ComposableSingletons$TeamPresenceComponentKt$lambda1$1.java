package io.intercom.android.sdk.m5.helpcenter.ui.components;

import Y.C1500m;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$TeamPresenceComponentKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$TeamPresenceComponentKt$lambda1$1 implements p {
    public static final ComposableSingletons$TeamPresenceComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$TeamPresenceComponentKt$lambda1$1();

    ComposableSingletons$TeamPresenceComponentKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            TeamPresenceComponentKt.TeamPresenceComponentWithBubble(TeamPresenceComponentKt.mockTeamPresenceState, mVar, 6);
        } else {
            mVar.I();
        }
    }
}
