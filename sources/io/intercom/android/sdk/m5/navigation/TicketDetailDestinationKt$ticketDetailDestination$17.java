package io.intercom.android.sdk.m5.navigation;

import Y.C1500m;
import Y.p1;
import a2.C1542a;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.C1554j;
import androidx.lifecycle.e0;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
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
final class TicketDetailDestinationKt$ticketDetailDestination$17 implements r {
    final /* synthetic */ x $navController;
    final /* synthetic */ C1554j $rootActivity;

    TicketDetailDestinationKt$ticketDetailDestination$17(x xVar, C1554j jVar) {
        this.$navController = xVar;
        this.$rootActivity = jVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C2719b) obj, (k) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2719b bVar, k kVar, C1500m mVar, int i10) {
        String str;
        String str2;
        TicketLaunchedFrom ticketLaunchedFrom;
        C6496s.h(bVar, "$this$composable");
        C6496s.h(kVar, "it");
        Bundle c10 = kVar.c();
        if (c10 == null || (str = c10.getString(TicketDetailDestinationKt.TICKET_ID)) == null) {
            str = "";
        }
        Bundle c11 = kVar.c();
        boolean z10 = c11 != null ? c11.getBoolean("isLaunchedProgrammatically") : false;
        Bundle c12 = kVar.c();
        if (c12 == null || (str2 = c12.getString(TicketDetailDestinationKt.LAUNCHED_FROM)) == null) {
            str2 = MetricTracker.Context.FROM_TICKETS_SPACE;
        }
        if (this.$navController.K() == null) {
            Intent intent = this.$rootActivity.getIntent();
            C6496s.g(intent, "getIntent(...)");
            IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
            if (argsForIntent instanceof IntercomRootActivityArgs.TicketDetailsScreenArgs) {
                IntercomRootActivityArgs.TicketDetailsScreenArgs ticketDetailsScreenArgs = (IntercomRootActivityArgs.TicketDetailsScreenArgs) argsForIntent;
                str = ticketDetailsScreenArgs.getTicketId();
                str2 = ticketDetailsScreenArgs.getFrom();
            }
        }
        TicketDetailViewModel.Companion companion = TicketDetailViewModel.Companion;
        e0 a10 = C1542a.f10582a.a(mVar, C1542a.f10584c);
        if (a10 == null) {
            a10 = this.$rootActivity;
        }
        if (C6496s.c(str2, "conversation")) {
            ticketLaunchedFrom = new TicketLaunchedFrom.Conversation((Ticket) null, 1, (DefaultConstructorMarker) null);
        } else {
            ticketLaunchedFrom = new TicketLaunchedFrom.Other(str, str2);
        }
        final x xVar = this.$navController;
        final C1554j jVar = this.$rootActivity;
        AnonymousClass1 r12 = new C6787a() {
            public final void invoke() {
                TicketDetailDestinationKt.ticketDetailDestination$onBackClicked(x.this, jVar);
            }
        };
        final x xVar2 = this.$navController;
        TicketDetailDestinationKt.TicketDetailScreen((TicketDetailState) p1.b(companion.create(a10, ticketLaunchedFrom).getStateFlow(), (g) null, mVar, 8, 1).getValue(), r12, new p() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, ((Boolean) obj2).booleanValue());
                return C6514M.f71813a;
            }

            public final void invoke(String str, boolean z10) {
                TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked(x.this, str, z10);
            }
        }, false, z10, mVar, 3072, 0);
    }
}
