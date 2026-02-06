package io.intercom.android.sdk.m5.notification;

import V.B0;
import Y.C1500m;
import g0.c;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InAppNotificationCardKt$addInappNotificationCardToView$1$1 implements p {
    final /* synthetic */ Conversation $conversation;

    InAppNotificationCardKt$addInappNotificationCardToView$1$1(Conversation conversation) {
        this.$conversation = conversation;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            final Conversation conversation = this.$conversation;
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(-395652032, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        InAppNotificationCardKt.InAppNotificationCard(conversation, (i) null, mVar, 8, 2);
                    } else {
                        mVar.I();
                    }
                }
            }, mVar, 54), mVar, 3072, 7);
            return;
        }
        mVar.I();
    }
}
