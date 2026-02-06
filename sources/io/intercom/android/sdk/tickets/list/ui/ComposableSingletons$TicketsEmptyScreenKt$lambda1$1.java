package io.intercom.android.sdk.tickets.list.ui;

import Y.C1500m;
import io.intercom.android.sdk.models.EmptyState;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsEmptyScreenKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$TicketsEmptyScreenKt$lambda1$1 implements p {
    public static final ComposableSingletons$TicketsEmptyScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketsEmptyScreenKt$lambda1$1();

    ComposableSingletons$TicketsEmptyScreenKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            TicketsEmptyScreenKt.TicketsEmptyScreen(new EmptyState("No Tickets", "Your tickets will be shown here", (EmptyState.Action) null, 4, (DefaultConstructorMarker) null), (i) null, mVar, 0, 2);
        } else {
            mVar.I();
        }
    }
}
