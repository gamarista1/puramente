package io.intercom.android.sdk.tickets;

import Y.C1500m;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$TicketProgressBannerKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$TicketProgressBannerKt$lambda2$1 implements p {
    public static final ComposableSingletons$TicketProgressBannerKt$lambda2$1 INSTANCE = new ComposableSingletons$TicketProgressBannerKt$lambda2$1();

    ComposableSingletons$TicketProgressBannerKt$lambda2$1() {
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
            TicketProgressBannerKt.TicketProgressBanner("API issue very very very long and boring title", new C6324d(), true, (i) null, mVar, 438, 8);
        } else {
            mVar.I();
        }
    }
}
