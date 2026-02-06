package io.intercom.android.sdk.m5.conversation.reducers;

import android.text.format.DateUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.tickets.TicketDetailReducerKt;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002\u001a\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0002\u001a$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002\u001a\u001e\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¨\u0006\u001a"}, d2 = {"reduceMessages", "", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "clientState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "config", "Lio/intercom/android/sdk/identity/AppConfig;", "shouldShowQuickReplies", "", "Lio/intercom/android/sdk/models/Part;", "isLastPart", "isAdminOrAltParticipant", "part", "reduceEvent", "hasPendingMessageAfter", "pendingMessages", "", "", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage;", "getGroupingPosition", "Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "allParts", "index", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationPartsReducerKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.models.MessageStyle[] r0 = io.intercom.android.sdk.models.MessageStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.models.MessageStyle r1 = io.intercom.android.sdk.models.MessageStyle.TICKET_STATE_UPDATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.models.MessageStyle r1 = io.intercom.android.sdk.models.MessageStyle.MERGED_PRIMARY_CONVERSATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.reducers.ConversationPartsReducerKt.WhenMappings.<clinit>():void");
        }
    }

    public static final GroupingPosition getGroupingPosition(List<? extends Part> list, int i10) {
        C6496s.h(list, "allParts");
        if (PartExtensionsKt.hasPreviousConcatPartNewStyle(list, i10) && PartExtensionsKt.hasNextConcatPartNewStyle(list, i10)) {
            return GroupingPosition.MIDDLE;
        }
        if (PartExtensionsKt.hasPreviousConcatPartNewStyle(list, i10)) {
            return GroupingPosition.BOTTOM;
        }
        if (PartExtensionsKt.hasNextConcatPartNewStyle(list, i10)) {
            return GroupingPosition.TOP;
        }
        return GroupingPosition.STANDALONE;
    }

    private static final boolean hasPendingMessageAfter(Part part, Map<String, PendingMessage> map) {
        Long l10;
        long createdAt = part.getCreatedAt();
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            l10 = null;
        } else {
            Long valueOf = Long.valueOf(((PendingMessage) it.next()).getPart().getCreatedAt());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((PendingMessage) it.next()).getPart().getCreatedAt());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l10 = valueOf;
        }
        if (l10 == null || createdAt >= l10.longValue()) {
            return false;
        }
        return true;
    }

    public static final boolean isAdminOrAltParticipant(Part part, UserIdentity userIdentity) {
        C6496s.h(part, "part");
        C6496s.h(userIdentity, "userIdentity");
        if (part.isAdmin() || !part.getParticipant().isUserWithId(userIdentity.getIntercomId())) {
            return true;
        }
        return false;
    }

    private static final ContentRow reduceEvent(Part part) {
        int i10;
        MessageStyle messageStyle = part.getMessageStyle();
        if (messageStyle == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[messageStyle.ordinal()];
        }
        if (i10 == 1) {
            String status = part.getEventData().getStatus();
            String eventAsPlainText = part.getEventData().getEventAsPlainText();
            long createdAt = part.getCreatedAt();
            String customStateLabel = part.getEventData().getCustomStateLabel();
            String customStatePrefix = part.getEventData().getCustomStatePrefix();
            String id2 = part.getId();
            C6496s.g(id2, "getId(...)");
            return new ContentRow.TicketStatusRow(status, eventAsPlainText, createdAt, customStateLabel, customStatePrefix, id2);
        } else if (i10 != 2) {
            String eventAsPlainText2 = part.getEventData().getEventAsPlainText();
            Avatar create = Avatar.create(part.getEventData().getParticipant().getAvatar().getImageUrl(), part.getEventData().getParticipant().getInitial());
            C6496s.g(create, "create(...)");
            String id3 = part.getId();
            C6496s.g(id3, "getId(...)");
            return new ContentRow.EventRow(eventAsPlainText2, create, id3);
        } else {
            String mergedConversationId = part.getEventData().getMergedConversationId();
            String description = part.getEventData().getDescription();
            String id4 = part.getId();
            C6496s.g(id4, "getId(...)");
            return new ContentRow.MergedConversationRow(description, mergedConversationId, id4);
        }
    }

    public static final List<ContentRow> reduceMessages(ConversationClientState conversationClientState, UserIdentity userIdentity, AppConfig appConfig) {
        int i10;
        boolean z10;
        String str;
        boolean z11;
        UserIdentity userIdentity2 = userIdentity;
        C6496s.h(conversationClientState, "clientState");
        C6496s.h(userIdentity2, "userIdentity");
        C6496s.h(appConfig, "config");
        Conversation conversation = conversationClientState.getConversation();
        if (conversation == null) {
            return C6565s.n();
        }
        if (conversation.getTicket() == null || ConversationExtensionsKt.hasNonTicketParts(conversation) || !conversationClientState.getPendingMessages().isEmpty()) {
            List c10 = C6565s.c();
            ArrayList arrayList = new ArrayList();
            for (Object next : conversation.parts()) {
                List<ReplyOption> replyOptions = ((Part) next).getReplyOptions();
                C6496s.g(replyOptions, "getReplyOptions(...)");
                if (replyOptions.isEmpty() || !conversation.getPreventEndUserReplies()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i11 = 0;
            for (Object next2 : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C6565s.x();
                }
                Part part = (Part) next2;
                if (part.getMessageStyle() != MessageStyle.QUICK_REPLY || (i11 == C6565s.p(conversation.parts()) && !hasPendingMessageAfter(part, conversationClientState.getPendingMessages()))) {
                    arrayList2.add(next2);
                }
                i11 = i12;
            }
            Object B02 = C6565s.B0(arrayList2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList2.iterator();
            while (true) {
                i10 = 1000;
                if (!it.hasNext()) {
                    break;
                }
                Object next3 = it.next();
                Calendar instance = Calendar.getInstance();
                C6496s.g(instance, "getInstance(...)");
                instance.setTime(new Date(((long) 1000) * ((Part) next3).getCreatedAt()));
                Integer valueOf = Integer.valueOf(instance.get(6));
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(valueOf, obj);
                }
                ((List) obj).add(next3);
            }
            for (List list : linkedHashMap.values()) {
                boolean isToday = DateUtils.isToday(((Part) C6565s.o0(list)).getCreatedAt() * ((long) i10));
                if (!((Part) C6565s.o0(list)).isInitialMessage() || (!PartExtensionsKt.isLinkCard((Part) C6565s.o0(list)) && !isToday)) {
                    c10.add(new ContentRow.DayDividerRow(((Part) C6565s.o0(list)).getCreatedAt()));
                }
                Collection collection = list;
                Iterable<PendingMessage> values = conversationClientState.getPendingMessages().values();
                ArrayList arrayList3 = new ArrayList(C6565s.y(values, 10));
                for (PendingMessage part2 : values) {
                    arrayList3.add(part2.getPart());
                }
                List K02 = C6565s.K0(collection, arrayList3);
                List c11 = C6565s.c();
                Iterable iterable = list;
                ArrayList arrayList4 = new ArrayList(C6565s.y(iterable, 10));
                int i13 = 0;
                for (Object next4 : iterable) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C6565s.x();
                    }
                    Part part3 = (Part) next4;
                    if (conversationClientState.getNewMessageId() != null && C6496s.c(conversationClientState.getNewMessageId(), part3.getId())) {
                        String id2 = part3.getId();
                        C6496s.g(id2, "getId(...)");
                        c11.add(new ContentRow.NewMessagesRow(id2));
                    }
                    if (part3.isInitialMessage() && PartExtensionsKt.isLinkCard(part3)) {
                        z10 = c11.add(new ContentRow.AskedAboutRow(part3));
                    } else if (part3.isEvent().booleanValue()) {
                        z10 = c11.add(reduceEvent(part3));
                    } else if (part3.getMessageStyle() == MessageStyle.POST) {
                        z10 = c11.add(new ContentRow.PostCardRow(part3, appConfig.getName()));
                    } else if (part3.getMessageStyle() == MessageStyle.NOTE) {
                        z10 = c11.add(new ContentRow.NoteCardRow(part3, appConfig.getName()));
                    } else if (part3.getMessageStyle() == MessageStyle.FIN_ANSWER) {
                        z10 = c11.add(new ContentRow.FinAnswerRow(part3, getGroupingPosition(K02, i13)));
                    } else if (PartExtensionsKt.isQuickReplyOnly(part3)) {
                        List<ReplyOption> replyOptions2 = part3.getReplyOptions();
                        C6496s.g(replyOptions2, "getReplyOptions(...)");
                        String id3 = part3.getId();
                        C6496s.g(id3, "getId(...)");
                        z10 = c11.add(new ContentRow.QuickRepliesRow(replyOptions2, id3));
                    } else {
                        boolean isAdminOrAltParticipant = isAdminOrAltParticipant(part3, userIdentity2);
                        String id4 = part3.getId();
                        Part part4 = (Part) B02;
                        if (part4 != null) {
                            str = part4.getId();
                        } else {
                            str = null;
                        }
                        if (!C6496s.c(id4, str) || !conversationClientState.getPendingMessages().isEmpty() || conversationClientState.getFinStreamingData().isFinStreaming() || !C6496s.c(conversationClientState.getCurrentlyTypingState(), new CurrentlyTypingState((AvatarWrapper) null, false, (StringProvider) null, TypingIndicatorType.NONE, 7, (DefaultConstructorMarker) null))) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        part3.setParentConversation(conversation);
                        ContentRow.BubbleMessageRow bubbleMessageRow = new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(part3, z11, isAdminOrAltParticipant, conversationClientState.getFailedAttributeIdentifiers(), conversationClientState.getLoadingAttributeIdentifiers()), getGroupingPosition(K02, i13), (PendingMessage.FailedImageUploadData) null, false, false, 16, (DefaultConstructorMarker) null);
                        if (shouldShowQuickReplies(part3, z11, isAdminOrAltParticipant)) {
                            c11.add(bubbleMessageRow);
                            List<ReplyOption> replyOptions3 = part3.getReplyOptions();
                            C6496s.g(replyOptions3, "getReplyOptions(...)");
                            String id5 = part3.getId();
                            C6496s.g(id5, "getId(...)");
                            z10 = c11.add(new ContentRow.QuickRepliesRow(replyOptions3, id5));
                        } else {
                            z10 = c11.add(bubbleMessageRow);
                        }
                    }
                    arrayList4.add(Boolean.valueOf(z10));
                    ConversationClientState conversationClientState2 = conversationClientState;
                    userIdentity2 = userIdentity;
                    i13 = i14;
                }
                c10.addAll(C6565s.a(c11));
                i10 = 1000;
                ConversationClientState conversationClientState3 = conversationClientState;
                userIdentity2 = userIdentity;
            }
            return C6565s.a(c10);
        }
        return C6565s.e(new ContentRow.BigTicketRow(TicketDetailReducerKt.computeTicketViewState$default(conversation.getTicket(), userIdentity, (List) null, new TicketLaunchedFrom.Conversation(conversation.getTicket()), 4, (Object) null), conversation.getTicket().getId()));
    }

    private static final boolean shouldShowQuickReplies(Part part, boolean z10, boolean z11) {
        if (z10) {
            List<ReplyOption> replyOptions = part.getReplyOptions();
            C6496s.g(replyOptions, "getReplyOptions(...)");
            if (replyOptions.isEmpty() || !z11) {
                return false;
            }
            return true;
        }
        return false;
    }
}
