package io.intercom.android.sdk.m5.navigation;

import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import j3.C2128E;
import j3.n;
import j3.x;
import j3.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u001aW\u0010\f\u001a\u00020\u000b*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0015\u001a-\u0010\u0018\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001a\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001c\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a'\u0010\u001d\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lj3/x;", "", "conversationId", "initialMessage", "", "isLaunchedProgrammatically", "articleId", "Lj3/z;", "navOptions", "Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "transitionArgs", "Llf/M;", "openConversation", "(Lj3/x;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lj3/z;Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;)V", "openNewConversation", "(Lj3/x;ZLj3/z;Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;)V", "showSubmissionCard", "openTicketDetailScreen", "(Lj3/x;ZLio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;Z)V", "ticketId", "from", "(Lj3/x;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;Z)V", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "ticketTypeData", "openCreateTicketsScreen", "(Lj3/x;Lio/intercom/android/sdk/blocks/lib/models/TicketType;Ljava/lang/String;Ljava/lang/String;)V", "openMessages", "(Lj3/x;Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;Z)V", "openHelpCenter", "openTicketList", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomRouterKt {
    public static final void openConversation(x xVar, String str, String str2, boolean z10, String str3, z zVar, TransitionArgs transitionArgs) {
        String str4;
        x xVar2 = xVar;
        C6496s.h(xVar, "<this>");
        C6496s.h(transitionArgs, "transitionArgs");
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        n.V(xVar, new IntercomRootActivityArgs.ConversationScreenArgs(str, str4, z10, str3, (String) null, transitionArgs, 16, (DefaultConstructorMarker) null).getRoute(), zVar, (C2128E.a) null, 4, (Object) null);
    }

    public static /* synthetic */ void openConversation$default(x xVar, String str, String str2, boolean z10, String str3, z zVar, TransitionArgs transitionArgs, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            zVar = null;
        }
        if ((i10 & 32) != 0) {
            transitionArgs = new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null);
        }
        openConversation(xVar, str, str2, z10, str3, zVar, transitionArgs);
    }

    public static final void openCreateTicketsScreen(x xVar, TicketType ticketType, String str, String str2) {
        C6496s.h(xVar, "<this>");
        C6496s.h(ticketType, "ticketTypeData");
        C6496s.h(str2, TicketDetailDestinationKt.LAUNCHED_FROM);
        n.V(xVar, "CREATE_TICKET/" + ticketType.getId() + "?conversation_id=" + str + "?from=" + str2, (z) null, (C2128E.a) null, 6, (Object) null);
    }

    public static final void openHelpCenter(x xVar, TransitionArgs transitionArgs, boolean z10) {
        C6496s.h(xVar, "<this>");
        C6496s.h(transitionArgs, "transitionArgs");
        n.V(xVar, "HELP_CENTER?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, (z) null, (C2128E.a) null, 6, (Object) null);
    }

    public static /* synthetic */ void openHelpCenter$default(x xVar, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            transitionArgs = new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null);
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        openHelpCenter(xVar, transitionArgs, z10);
    }

    public static final void openMessages(x xVar, TransitionArgs transitionArgs, boolean z10) {
        C6496s.h(xVar, "<this>");
        C6496s.h(transitionArgs, "transitionArgs");
        n.V(xVar, "MESSAGES?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, (z) null, (C2128E.a) null, 6, (Object) null);
    }

    public static /* synthetic */ void openMessages$default(x xVar, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            transitionArgs = new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null);
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        openMessages(xVar, transitionArgs, z10);
    }

    public static final void openNewConversation(x xVar, boolean z10, z zVar, TransitionArgs transitionArgs) {
        C6496s.h(xVar, "<this>");
        C6496s.h(transitionArgs, "transitionArgs");
        openConversation$default(xVar, (String) null, (String) null, z10, (String) null, zVar, transitionArgs, 11, (Object) null);
    }

    public static /* synthetic */ void openNewConversation$default(x xVar, boolean z10, z zVar, TransitionArgs transitionArgs, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            zVar = null;
        }
        if ((i10 & 4) != 0) {
            transitionArgs = new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null);
        }
        openNewConversation(xVar, z10, zVar, transitionArgs);
    }

    public static final void openTicketDetailScreen(x xVar, boolean z10, TransitionArgs transitionArgs, boolean z11) {
        C6496s.h(xVar, "<this>");
        C6496s.h(transitionArgs, "transitionArgs");
        n.V(xVar, "TICKET_DETAIL?show_submission_card=" + z10 + "&transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z11, (z) null, (C2128E.a) null, 6, (Object) null);
    }

    public static /* synthetic */ void openTicketDetailScreen$default(x xVar, boolean z10, TransitionArgs transitionArgs, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            transitionArgs = new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null);
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        openTicketDetailScreen(xVar, z10, transitionArgs, z11);
    }

    public static final void openTicketList(x xVar, TransitionArgs transitionArgs, boolean z10) {
        C6496s.h(xVar, "<this>");
        C6496s.h(transitionArgs, "transitionArgs");
        n.V(xVar, "TICKETS?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, (z) null, (C2128E.a) null, 6, (Object) null);
    }

    public static /* synthetic */ void openTicketList$default(x xVar, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            transitionArgs = new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null);
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        openTicketList(xVar, transitionArgs, z10);
    }

    public static final void openTicketDetailScreen(x xVar, String str, String str2, TransitionArgs transitionArgs, boolean z10) {
        C6496s.h(xVar, "<this>");
        C6496s.h(str, "ticketId");
        C6496s.h(str2, TicketDetailDestinationKt.LAUNCHED_FROM);
        C6496s.h(transitionArgs, "transitionArgs");
        n.V(xVar, "TICKET_DETAIL/" + str + "?from=" + str2 + "&transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, (z) null, (C2128E.a) null, 6, (Object) null);
    }

    public static /* synthetic */ void openTicketDetailScreen$default(x xVar, String str, String str2, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            transitionArgs = new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null);
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        openTicketDetailScreen(xVar, str, str2, transitionArgs, z10);
    }
}
