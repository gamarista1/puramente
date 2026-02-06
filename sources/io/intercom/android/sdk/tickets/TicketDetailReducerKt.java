package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002\u001a\u0014\u0010\u0012\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0013*\u00020\u0017H\u0000¨\u0006\u0018"}, d2 = {"computeTicketViewState", "Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "ticket", "Lio/intercom/android/sdk/models/Ticket;", "user", "Lio/intercom/android/sdk/identity/UserIdentity;", "activeAdminsAvatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "launchedFrom", "Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;", "conversationButtonState", "Lio/intercom/android/sdk/tickets/ConversationButtonState;", "conversationButton", "Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "isUnassignedOrBot", "", "Lio/intercom/android/sdk/models/Participant;", "isDone", "Lio/intercom/android/sdk/tickets/TicketStatus;", "currentTicketStatus", "isLoading", "toTicketStatus", "Lio/intercom/android/sdk/models/Ticket$Status;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketDetailReducerKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.models.Ticket$ConversationButton$IconType[] r0 = io.intercom.android.sdk.models.Ticket.ConversationButton.IconType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.models.Ticket$ConversationButton$IconType r1 = io.intercom.android.sdk.models.Ticket.ConversationButton.IconType.SEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.models.Ticket$ConversationButton$IconType r1 = io.intercom.android.sdk.models.Ticket.ConversationButton.IconType.CONVERSATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.TicketDetailReducerKt.WhenMappings.<clinit>():void");
        }
    }

    public static final TicketDetailState.TicketDetailContentState computeTicketViewState(Ticket ticket, UserIdentity userIdentity, List<AvatarWrapper> list, TicketLaunchedFrom ticketLaunchedFrom) {
        List e10;
        List<AvatarWrapper> list2 = list;
        TicketLaunchedFrom ticketLaunchedFrom2 = ticketLaunchedFrom;
        Ticket ticket2 = ticket;
        C6496s.h(ticket, "ticket");
        C6496s.h(userIdentity, Participant.USER_TYPE);
        C6496s.h(list2, "activeAdminsAvatars");
        C6496s.h(ticketLaunchedFrom2, "launchedFrom");
        String title = ticket.getTitle();
        Participant build = ticket.getAssignee().build();
        C6496s.g(build, "build(...)");
        if (!isUnassignedOrBot(build) || list2.isEmpty()) {
            Avatar avatar = ticket.getAssignee().build().getAvatar();
            C6496s.g(avatar, "getAvatar(...)");
            e10 = C6565s.e(new AvatarWrapper(avatar, false, 2, (DefaultConstructorMarker) null));
        } else {
            e10 = C6565s.V0(list2, 3);
        }
        List list3 = e10;
        String statusDetail = ticket.getCurrentStatus().getStatusDetail();
        long r92 = toTicketStatus(ticket.getCurrentStatus()).m537getColor0d7_KjU();
        Iterable<Ticket.Status> statusList = ticket.getStatusList();
        ArrayList arrayList = new ArrayList(C6565s.y(statusList, 10));
        for (Ticket.Status status : statusList) {
            arrayList.add(new TicketTimelineCardState.ProgressSection(isDone(toTicketStatus(status), toTicketStatus(ticket.getCurrentStatus())), isLoading(toTicketStatus(status), toTicketStatus(ticket.getCurrentStatus()))));
        }
        TicketTimelineCardState ticketTimelineCardState = new TicketTimelineCardState(list3, statusDetail, "", r92, arrayList, ticket.getCurrentStatus().getTitle(), Long.valueOf(ticket.getLatestStatusUpdatedAt()), (DefaultConstructorMarker) null);
        ArrayList arrayList2 = new ArrayList();
        for (Object next : ticket.getAttributes()) {
            if (((Ticket.TicketAttribute) next).hasValue()) {
                arrayList2.add(next);
            }
        }
        String email = userIdentity.getEmail();
        C6496s.g(email, "getEmail(...)");
        return new TicketDetailState.TicketDetailContentState(title, ticketTimelineCardState, arrayList2, email, ticket.getConversationId(), conversationButtonState(ticket.getConversationButton(), ticketLaunchedFrom2));
    }

    public static /* synthetic */ TicketDetailState.TicketDetailContentState computeTicketViewState$default(Ticket ticket, UserIdentity userIdentity, List list, TicketLaunchedFrom ticketLaunchedFrom, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = C6565s.n();
        }
        return computeTicketViewState(ticket, userIdentity, list, ticketLaunchedFrom);
    }

    private static final ConversationButtonState conversationButtonState(Ticket.ConversationButton conversationButton, TicketLaunchedFrom ticketLaunchedFrom) {
        boolean z10;
        Ticket.ConversationButton.IconType iconType;
        int i10;
        String str;
        if ((ticketLaunchedFrom instanceof TicketLaunchedFrom.Conversation) || conversationButton == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        Integer num = null;
        if (conversationButton != null) {
            iconType = conversationButton.getIcon();
        } else {
            iconType = null;
        }
        if (iconType == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[iconType.ordinal()];
        }
        if (i10 == 1) {
            num = Integer.valueOf(R.drawable.intercom_send_message_icon);
        } else if (i10 == 2) {
            num = Integer.valueOf(R.drawable.intercom_messages_icon);
        }
        if (conversationButton == null || (str = conversationButton.getText()) == null) {
            str = "";
        }
        return new ConversationButtonState(z10, num, new StringProvider.ActualString(str));
    }

    public static final boolean isDone(TicketStatus ticketStatus, TicketStatus ticketStatus2) {
        C6496s.h(ticketStatus, "<this>");
        C6496s.h(ticketStatus2, "currentTicketStatus");
        if (ticketStatus2.ordinal() >= ticketStatus.ordinal()) {
            return true;
        }
        return false;
    }

    public static final boolean isLoading(TicketStatus ticketStatus, TicketStatus ticketStatus2) {
        C6496s.h(ticketStatus, "<this>");
        C6496s.h(ticketStatus2, "currentTicketStatus");
        if (ticketStatus2.ordinal() != ticketStatus.ordinal() || ticketStatus2.ordinal() >= C6559l.j0(TicketStatus.values())) {
            return false;
        }
        return true;
    }

    private static final boolean isUnassignedOrBot(Participant participant) {
        if (C6496s.c(participant, Participant.create("", "", Participant.USER_TYPE, "", Avatar.create("", ""), Boolean.FALSE)) || participant.isBot().booleanValue()) {
            return true;
        }
        return false;
    }

    public static final TicketStatus toTicketStatus(Ticket.Status status) {
        C6496s.h(status, "<this>");
        String type = status.getType();
        switch (type.hashCode()) {
            case -882067636:
                if (type.equals("waiting_on_customer")) {
                    return TicketStatus.WaitingOnCustomer;
                }
                break;
            case -753541113:
                if (type.equals("in_progress")) {
                    return TicketStatus.InProgress;
                }
                break;
            case -341328904:
                if (type.equals("resolved")) {
                    return TicketStatus.Resolved;
                }
                break;
            case 348678395:
                if (type.equals(MetricTracker.Action.SUBMITTED)) {
                    return TicketStatus.Submitted;
                }
                break;
        }
        return TicketStatus.Submitted;
    }
}
