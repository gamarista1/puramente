package io.intercom.android.sdk.m5.navigation;

import Y.C1500m;
import Y.p1;
import a2.C1542a;
import android.os.Bundle;
import androidx.activity.C1554j;
import androidx.lifecycle.e0;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketDetailViewModel;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import j3.k;
import j3.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.g;
import v.C2719b;
import yf.C6787a;
import yf.p;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketDetailDestinationKt$ticketDetailDestination$8 implements r {
    final /* synthetic */ x $navController;
    final /* synthetic */ C1554j $rootActivity;

    TicketDetailDestinationKt$ticketDetailDestination$8(C1554j jVar, x xVar) {
        this.$rootActivity = jVar;
        this.$navController = xVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C2719b) obj, (k) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2719b bVar, k kVar, C1500m mVar, int i10) {
        C6496s.h(bVar, "$this$composable");
        C6496s.h(kVar, "it");
        Bundle c10 = kVar.c();
        boolean z10 = false;
        boolean z11 = c10 != null ? c10.getBoolean(TicketDetailDestinationKt.SHOW_SUBMISSION_CARD) : false;
        Bundle c11 = kVar.c();
        if (c11 != null) {
            z10 = c11.getBoolean("isLaunchedProgrammatically");
        }
        boolean z12 = z10;
        TicketDetailViewModel.Companion companion = TicketDetailViewModel.Companion;
        e0 a10 = C1542a.f10582a.a(mVar, C1542a.f10584c);
        if (a10 == null) {
            a10 = this.$rootActivity;
        }
        final x xVar = this.$navController;
        final C1554j jVar = this.$rootActivity;
        AnonymousClass1 r12 = new C6787a() {
            public final void invoke() {
                TicketDetailDestinationKt.ticketDetailDestination$onBackClicked(x.this, jVar);
            }
        };
        final x xVar2 = this.$navController;
        TicketDetailDestinationKt.TicketDetailScreen((TicketDetailState) p1.b(companion.create(a10, new TicketLaunchedFrom.Conversation((Ticket) null, 1, (DefaultConstructorMarker) null)).getStateFlow(), (g) null, mVar, 8, 1).getValue(), r12, new p() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, ((Boolean) obj2).booleanValue());
                return C6514M.f71813a;
            }

            public final void invoke(String str, boolean z10) {
                TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked(x.this, str, z10);
            }
        }, z11, z12, mVar, 0, 0);
    }
}
