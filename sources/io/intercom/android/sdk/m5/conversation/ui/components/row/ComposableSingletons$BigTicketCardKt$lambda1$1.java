package io.intercom.android.sdk.m5.conversation.ui.components.row;

import Y.C1500m;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BigTicketCardKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$BigTicketCardKt$lambda1$1 implements p {
    public static final ComposableSingletons$BigTicketCardKt$lambda1$1 INSTANCE = new ComposableSingletons$BigTicketCardKt$lambda1$1();

    ComposableSingletons$BigTicketCardKt$lambda1$1() {
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
            BigTicketCardKt.BigTicketCard(TicketDetailContentKt.getSampleTicketDetailState(), new C6155w(), true, (i) null, mVar, 440, 8);
        } else {
            mVar.I();
        }
    }
}
