package io.intercom.android.sdk.m5.navigation;

import C.N;
import Y.C1500m;
import io.intercom.android.sdk.tickets.TicketDetailState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketDetailDestinationKt$TicketDetailScreen$4 implements q {
    final /* synthetic */ boolean $isLaunchedProgrammatically;
    final /* synthetic */ p $onConversationCTAClicked;
    final /* synthetic */ boolean $showSubmissionCard;
    final /* synthetic */ TicketDetailState $ticketDetailState;

    TicketDetailDestinationKt$TicketDetailScreen$4(TicketDetailState ticketDetailState, p pVar, boolean z10, boolean z11) {
        this.$ticketDetailState = ticketDetailState;
        this.$onConversationCTAClicked = pVar;
        this.$isLaunchedProgrammatically = z10;
        this.$showSubmissionCard = z11;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(p pVar, TicketDetailState ticketDetailState, boolean z10, String str) {
        C6496s.h(ticketDetailState, "$ticketDetailState");
        pVar.invoke(((TicketDetailState.TicketDetailContentState) ticketDetailState).getConversationId(), Boolean.valueOf(z10));
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((N) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(C.N r8, Y.C1500m r9, int r10) {
        /*
            r7 = this;
            java.lang.String r0 = "contentPadding"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            r0 = r10 & 14
            if (r0 != 0) goto L_0x0013
            boolean r0 = r9.S(r8)
            if (r0 == 0) goto L_0x0011
            r0 = 4
            goto L_0x0012
        L_0x0011:
            r0 = 2
        L_0x0012:
            r10 = r10 | r0
        L_0x0013:
            r10 = r10 & 91
            r0 = 18
            if (r10 != r0) goto L_0x0025
            boolean r10 = r9.i()
            if (r10 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            r9.I()
            goto L_0x00d9
        L_0x0025:
            io.intercom.android.sdk.tickets.TicketDetailState r10 = r7.$ticketDetailState
            io.intercom.android.sdk.tickets.TicketDetailState$Initial r0 = io.intercom.android.sdk.tickets.TicketDetailState.Initial.INSTANCE
            boolean r0 = kotlin.jvm.internal.C6496s.c(r10, r0)
            r1 = 0
            if (r0 != 0) goto L_0x00c7
            io.intercom.android.sdk.tickets.TicketDetailState$Loading r0 = io.intercom.android.sdk.tickets.TicketDetailState.Loading.INSTANCE
            boolean r0 = kotlin.jvm.internal.C6496s.c(r10, r0)
            if (r0 == 0) goto L_0x003a
            goto L_0x00c7
        L_0x003a:
            boolean r0 = r10 instanceof io.intercom.android.sdk.tickets.TicketDetailState.Error
            if (r0 == 0) goto L_0x005a
            r10 = 332916057(0x13d7e559, float:5.4499785E-27)
            r9.T(r10)
            k0.i$a r10 = k0.i.f23074a
            k0.i r8 = androidx.compose.foundation.layout.n.h(r10, r8)
            io.intercom.android.sdk.tickets.TicketDetailState r10 = r7.$ticketDetailState
            io.intercom.android.sdk.tickets.TicketDetailState$Error r10 = (io.intercom.android.sdk.tickets.TicketDetailState.Error) r10
            io.intercom.android.sdk.m5.components.ErrorState r10 = r10.getErrorState()
            io.intercom.android.sdk.tickets.TicketDetailErrorScreenKt.TicketDetailErrorScreen(r10, r8, r9, r1, r1)
            r9.M()
            goto L_0x00d9
        L_0x005a:
            boolean r10 = r10 instanceof io.intercom.android.sdk.tickets.TicketDetailState.TicketDetailContentState
            if (r10 == 0) goto L_0x00b8
            r10 = 333141954(0x13db57c2, float:5.536991E-27)
            r9.T(r10)
            k0.i$a r10 = k0.i.f23074a
            k0.i r0 = androidx.compose.foundation.layout.n.h(r10, r8)
            io.intercom.android.sdk.tickets.TicketDetailState r8 = r7.$ticketDetailState
            r1 = r8
            io.intercom.android.sdk.tickets.TicketDetailState$TicketDetailContentState r1 = (io.intercom.android.sdk.tickets.TicketDetailState.TicketDetailContentState) r1
            r8 = 1534773801(0x5b7aca29, float:7.0591022E16)
            r9.T(r8)
            yf.p r8 = r7.$onConversationCTAClicked
            boolean r8 = r9.S(r8)
            io.intercom.android.sdk.tickets.TicketDetailState r10 = r7.$ticketDetailState
            boolean r10 = r9.S(r10)
            r8 = r8 | r10
            boolean r10 = r7.$isLaunchedProgrammatically
            boolean r10 = r9.b(r10)
            r8 = r8 | r10
            yf.p r10 = r7.$onConversationCTAClicked
            io.intercom.android.sdk.tickets.TicketDetailState r2 = r7.$ticketDetailState
            boolean r3 = r7.$isLaunchedProgrammatically
            java.lang.Object r4 = r9.A()
            if (r8 != 0) goto L_0x009d
            Y.m$a r8 = Y.C1500m.f10026a
            java.lang.Object r8 = r8.a()
            if (r4 != r8) goto L_0x00a5
        L_0x009d:
            io.intercom.android.sdk.m5.navigation.S0 r4 = new io.intercom.android.sdk.m5.navigation.S0
            r4.<init>(r10, r2, r3)
            r9.r(r4)
        L_0x00a5:
            r2 = r4
            yf.l r2 = (yf.C6798l) r2
            r9.M()
            boolean r3 = r7.$showSubmissionCard
            r5 = 64
            r6 = 0
            r4 = r9
            io.intercom.android.sdk.tickets.TicketDetailContentKt.TicketDetailContent(r0, r1, r2, r3, r4, r5, r6)
            r9.M()
            goto L_0x00d9
        L_0x00b8:
            r8 = 1534752236(0x5b7a75ec, float:7.0498401E16)
            r9.T(r8)
            r9.M()
            lf.s r8 = new lf.s
            r8.<init>()
            throw r8
        L_0x00c7:
            r10 = 1534755158(0x5b7a8156, float:7.0510951E16)
            r9.T(r10)
            k0.i$a r10 = k0.i.f23074a
            k0.i r8 = androidx.compose.foundation.layout.n.h(r10, r8)
            io.intercom.android.sdk.tickets.TicketDetailsLoadingScreenKt.TicketDetailsLoadingScreen(r8, r9, r1, r1)
            r9.M()
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$4.invoke(C.N, Y.m, int):void");
    }
}
