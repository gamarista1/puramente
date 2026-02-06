package io.intercom.android.sdk.m5.navigation;

import androidx.activity.C1554j;
import g0.c;
import j3.C2126C;
import j3.C2135f;
import j3.i;
import j3.v;
import j3.x;
import java.util.List;
import k3.C2159k;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u0002"}, d2 = {"Lj3/v;", "Lj3/x;", "navController", "Landroidx/activity/j;", "rootActivity", "Llf/M;", "createTicketDestination", "(Lj3/v;Lj3/x;Landroidx/activity/j;)V", "", "TICKET_TYPE_ID", "Ljava/lang/String;", "CONVERSATION_ID", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "uiState", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CreateTicketDestinationKt {
    public static final String CONVERSATION_ID = "conversation_id";
    public static final String TICKET_TYPE_ID = "ticket_type_id";

    public static final void createTicketDestination(v vVar, x xVar, C1554j jVar) {
        C6496s.h(vVar, "<this>");
        C6496s.h(xVar, "navController");
        C6496s.h(jVar, "rootActivity");
        v vVar2 = vVar;
        C2159k.b(vVar2, "CREATE_TICKET/{ticket_type_id}?conversation_id={conversation_id}?from={from}", C6565s.q(C2135f.a(TICKET_TYPE_ID, new C6255v()), C2135f.a(CONVERSATION_ID, new C6257w()), C2135f.a(TicketDetailDestinationKt.LAUNCHED_FROM, new C6259x())), (List) null, IntercomTransitionsKt.getSlideUpEnterTransition(), IntercomTransitionsKt.getSlideDownExitTransition(), (C6798l) null, (C6798l) null, (C6798l) null, c.c(-521503931, true, new CreateTicketDestinationKt$createTicketDestination$4(jVar, xVar)), 228, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C6514M createTicketDestination$lambda$0(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.IntType);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M createTicketDestination$lambda$1(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.StringType);
        iVar.c(true);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M createTicketDestination$lambda$2(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.StringType);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void createTicketDestination$navigateUp(x xVar, C1554j jVar) {
        if (!xVar.X()) {
            jVar.finish();
        }
    }
}
