package io.intercom.android.sdk.models;

import Ef.m;
import Oc.c;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import mf.O;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020D0CJ\f\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u0007J\f\u0010G\u001a\b\u0012\u0004\u0012\u00020D0\u0007J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020FJ\u0006\u0010K\u001a\u00020FJ\u0006\u0010L\u001a\u00020DJ\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010R\u001a\u00020\rHÆ\u0003J\t\u0010S\u001a\u00020\u000fHÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010Z\u001a\u00020\u0018HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jñ\u0001\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010b\u001a\u00020\u00052\b\u0010c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010d\u001a\u00020eH×\u0001J\t\u0010f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010'R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&¨\u0006g"}, d2 = {"Lio/intercom/android/sdk/models/Conversation;", "", "id", "", "isRead", "", "participantBuilderList", "", "Lio/intercom/android/sdk/models/Participant$Builder;", "partBuilderList", "Lio/intercom/android/sdk/models/Part$Builder;", "groupConversationParticipantIds", "lastParticipatingAdminBuilder", "Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;", "composerState", "Lio/intercom/android/sdk/models/ComposerState;", "preventEndUserReplies", "inboundConversationsDisabled", "notificationStatus", "state", "isInbound", "ticket", "Lio/intercom/android/sdk/models/Ticket;", "uiFlags", "Lio/intercom/android/sdk/models/ConversationUiFlags;", "header", "Lio/intercom/android/sdk/models/Header;", "conversationEndedButton", "Lio/intercom/android/sdk/models/ConversationEndedButton;", "footerNotice", "Lio/intercom/android/sdk/models/FooterNotice;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "teamIntro", "specialNotice", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;Lio/intercom/android/sdk/models/ComposerState;ZZLjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/Ticket;Lio/intercom/android/sdk/models/ConversationUiFlags;Lio/intercom/android/sdk/models/Header;Lio/intercom/android/sdk/models/ConversationEndedButton;Lio/intercom/android/sdk/models/FooterNotice;Lio/intercom/android/sdk/models/PoweredBy;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getParticipantBuilderList", "()Ljava/util/List;", "getPartBuilderList", "getGroupConversationParticipantIds", "getLastParticipatingAdminBuilder", "()Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;", "getComposerState", "()Lio/intercom/android/sdk/models/ComposerState;", "getPreventEndUserReplies", "getInboundConversationsDisabled", "getNotificationStatus", "getState", "getTicket", "()Lio/intercom/android/sdk/models/Ticket;", "getUiFlags", "()Lio/intercom/android/sdk/models/ConversationUiFlags;", "getHeader", "()Lio/intercom/android/sdk/models/Header;", "getConversationEndedButton", "()Lio/intercom/android/sdk/models/ConversationEndedButton;", "getFooterNotice", "()Lio/intercom/android/sdk/models/FooterNotice;", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "getTeamIntro", "getSpecialNotice", "getParticipants", "", "Lio/intercom/android/sdk/models/Participant;", "parts", "Lio/intercom/android/sdk/models/Part;", "groupConversationParticipants", "lastParticipatingAdmin", "Lio/intercom/android/sdk/models/LastParticipatingAdmin;", "lastPart", "getLastAdminPart", "lastAdmin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Conversation {
    public static final int $stable = 8;
    @c("composer_state")
    private final ComposerState composerState;
    @c("conversation_ended_button")
    private final ConversationEndedButton conversationEndedButton;
    @c("footer_notice")
    private final FooterNotice footerNotice;
    @c("group_conversation_participant_ids")
    private final List<String> groupConversationParticipantIds;
    private final Header header;

    /* renamed from: id  reason: collision with root package name */
    private final String f70031id;
    @c("inbound_conversations_disabled")
    private final boolean inboundConversationsDisabled;
    @c("is_inbound")
    private final boolean isInbound;
    @c("read")
    private final boolean isRead;
    @c("last_participating_admin")
    private final LastParticipatingAdmin.Builder lastParticipatingAdminBuilder;
    @c("notification_status")
    private final String notificationStatus;
    @c("conversation_parts")
    private final List<Part.Builder> partBuilderList;
    @c("participants")
    private final List<Participant.Builder> participantBuilderList;
    @c("powered_by")
    private final PoweredBy poweredBy;
    @c("prevent_end_user_replies")
    private final boolean preventEndUserReplies;
    @c("special_notice")
    private final String specialNotice;
    private final String state;
    @c("team_intro")
    private final String teamIntro;
    private final Ticket ticket;
    @c("ui_flags")
    private final ConversationUiFlags uiFlags;

    public Conversation() {
        this((String) null, false, (List) null, (List) null, (List) null, (LastParticipatingAdmin.Builder) null, (ComposerState) null, false, false, (String) null, (String) null, false, (Ticket) null, (ConversationUiFlags) null, (Header) null, (ConversationEndedButton) null, (FooterNotice) null, (PoweredBy) null, (String) null, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, boolean z10, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState2, boolean z11, boolean z12, String str2, String str3, boolean z13, Ticket ticket2, ConversationUiFlags conversationUiFlags, Header header2, ConversationEndedButton conversationEndedButton2, FooterNotice footerNotice2, PoweredBy poweredBy2, String str4, String str5, int i10, Object obj) {
        Conversation conversation2 = conversation;
        int i11 = i10;
        return conversation.copy((i11 & 1) != 0 ? conversation2.f70031id : str, (i11 & 2) != 0 ? conversation2.isRead : z10, (i11 & 4) != 0 ? conversation2.participantBuilderList : list, (i11 & 8) != 0 ? conversation2.partBuilderList : list2, (i11 & 16) != 0 ? conversation2.groupConversationParticipantIds : list3, (i11 & 32) != 0 ? conversation2.lastParticipatingAdminBuilder : builder, (i11 & 64) != 0 ? conversation2.composerState : composerState2, (i11 & 128) != 0 ? conversation2.preventEndUserReplies : z11, (i11 & 256) != 0 ? conversation2.inboundConversationsDisabled : z12, (i11 & 512) != 0 ? conversation2.notificationStatus : str2, (i11 & 1024) != 0 ? conversation2.state : str3, (i11 & 2048) != 0 ? conversation2.isInbound : z13, (i11 & 4096) != 0 ? conversation2.ticket : ticket2, (i11 & 8192) != 0 ? conversation2.uiFlags : conversationUiFlags, (i11 & 16384) != 0 ? conversation2.header : header2, (i11 & 32768) != 0 ? conversation2.conversationEndedButton : conversationEndedButton2, (i11 & 65536) != 0 ? conversation2.footerNotice : footerNotice2, (i11 & 131072) != 0 ? conversation2.poweredBy : poweredBy2, (i11 & 262144) != 0 ? conversation2.teamIntro : str4, (i11 & 524288) != 0 ? conversation2.specialNotice : str5);
    }

    public final String component1() {
        return this.f70031id;
    }

    public final String component10() {
        return this.notificationStatus;
    }

    public final String component11() {
        return this.state;
    }

    public final boolean component12() {
        return this.isInbound;
    }

    public final Ticket component13() {
        return this.ticket;
    }

    public final ConversationUiFlags component14() {
        return this.uiFlags;
    }

    public final Header component15() {
        return this.header;
    }

    public final ConversationEndedButton component16() {
        return this.conversationEndedButton;
    }

    public final FooterNotice component17() {
        return this.footerNotice;
    }

    public final PoweredBy component18() {
        return this.poweredBy;
    }

    public final String component19() {
        return this.teamIntro;
    }

    public final boolean component2() {
        return this.isRead;
    }

    public final String component20() {
        return this.specialNotice;
    }

    public final List<Participant.Builder> component3() {
        return this.participantBuilderList;
    }

    public final List<Part.Builder> component4() {
        return this.partBuilderList;
    }

    public final List<String> component5() {
        return this.groupConversationParticipantIds;
    }

    public final LastParticipatingAdmin.Builder component6() {
        return this.lastParticipatingAdminBuilder;
    }

    public final ComposerState component7() {
        return this.composerState;
    }

    public final boolean component8() {
        return this.preventEndUserReplies;
    }

    public final boolean component9() {
        return this.inboundConversationsDisabled;
    }

    public final Conversation copy(String str, boolean z10, List<Participant.Builder> list, List<Part.Builder> list2, List<String> list3, LastParticipatingAdmin.Builder builder, ComposerState composerState2, boolean z11, boolean z12, String str2, String str3, boolean z13, Ticket ticket2, ConversationUiFlags conversationUiFlags, Header header2, ConversationEndedButton conversationEndedButton2, FooterNotice footerNotice2, PoweredBy poweredBy2, String str4, String str5) {
        String str6 = str;
        C6496s.h(str6, "id");
        C6496s.h(list, "participantBuilderList");
        C6496s.h(list2, "partBuilderList");
        C6496s.h(list3, "groupConversationParticipantIds");
        C6496s.h(builder, "lastParticipatingAdminBuilder");
        C6496s.h(composerState2, "composerState");
        C6496s.h(str2, "notificationStatus");
        C6496s.h(str3, "state");
        C6496s.h(conversationUiFlags, "uiFlags");
        return new Conversation(str6, z10, list, list2, list3, builder, composerState2, z11, z12, str2, str3, z13, ticket2, conversationUiFlags, header2, conversationEndedButton2, footerNotice2, poweredBy2, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) obj;
        return C6496s.c(this.f70031id, conversation.f70031id) && this.isRead == conversation.isRead && C6496s.c(this.participantBuilderList, conversation.participantBuilderList) && C6496s.c(this.partBuilderList, conversation.partBuilderList) && C6496s.c(this.groupConversationParticipantIds, conversation.groupConversationParticipantIds) && C6496s.c(this.lastParticipatingAdminBuilder, conversation.lastParticipatingAdminBuilder) && C6496s.c(this.composerState, conversation.composerState) && this.preventEndUserReplies == conversation.preventEndUserReplies && this.inboundConversationsDisabled == conversation.inboundConversationsDisabled && C6496s.c(this.notificationStatus, conversation.notificationStatus) && C6496s.c(this.state, conversation.state) && this.isInbound == conversation.isInbound && C6496s.c(this.ticket, conversation.ticket) && C6496s.c(this.uiFlags, conversation.uiFlags) && C6496s.c(this.header, conversation.header) && C6496s.c(this.conversationEndedButton, conversation.conversationEndedButton) && C6496s.c(this.footerNotice, conversation.footerNotice) && C6496s.c(this.poweredBy, conversation.poweredBy) && C6496s.c(this.teamIntro, conversation.teamIntro) && C6496s.c(this.specialNotice, conversation.specialNotice);
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final ConversationEndedButton getConversationEndedButton() {
        return this.conversationEndedButton;
    }

    public final FooterNotice getFooterNotice() {
        return this.footerNotice;
    }

    public final List<String> getGroupConversationParticipantIds() {
        return this.groupConversationParticipantIds;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.f70031id;
    }

    public final boolean getInboundConversationsDisabled() {
        return this.inboundConversationsDisabled;
    }

    public final Part getLastAdminPart() {
        Part part;
        List<Part> parts = parts();
        ListIterator<Part> listIterator = parts.listIterator(parts.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                part = null;
                break;
            }
            part = listIterator.previous();
            if (part.isAdmin()) {
                break;
            }
        }
        Part part2 = part;
        if (part2 != null) {
            return part2;
        }
        Part part3 = Part.NULL;
        C6496s.g(part3, "NULL");
        return part3;
    }

    public final LastParticipatingAdmin.Builder getLastParticipatingAdminBuilder() {
        return this.lastParticipatingAdminBuilder;
    }

    public final String getNotificationStatus() {
        return this.notificationStatus;
    }

    public final List<Part.Builder> getPartBuilderList() {
        return this.partBuilderList;
    }

    public final List<Participant.Builder> getParticipantBuilderList() {
        return this.participantBuilderList;
    }

    public final Map<String, Participant> getParticipants() {
        Iterable<Participant.Builder> iterable = this.participantBuilderList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(iterable, 10)), 16));
        for (Participant.Builder builder : iterable) {
            Pair a10 = C6502A.a(builder.build().getId(), builder.build());
            linkedHashMap.put(a10.c(), a10.d());
        }
        return linkedHashMap;
    }

    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final boolean getPreventEndUserReplies() {
        return this.preventEndUserReplies;
    }

    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTeamIntro() {
        return this.teamIntro;
    }

    public final Ticket getTicket() {
        return this.ticket;
    }

    public final ConversationUiFlags getUiFlags() {
        return this.uiFlags;
    }

    public final List<Participant> groupConversationParticipants() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.groupConversationParticipantIds) {
            Participant participant = getParticipants().get(str);
            if (participant != null) {
                arrayList.add(participant);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.f70031id.hashCode() * 31) + Boolean.hashCode(this.isRead)) * 31) + this.participantBuilderList.hashCode()) * 31) + this.partBuilderList.hashCode()) * 31) + this.groupConversationParticipantIds.hashCode()) * 31) + this.lastParticipatingAdminBuilder.hashCode()) * 31) + this.composerState.hashCode()) * 31) + Boolean.hashCode(this.preventEndUserReplies)) * 31) + Boolean.hashCode(this.inboundConversationsDisabled)) * 31) + this.notificationStatus.hashCode()) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.isInbound)) * 31;
        Ticket ticket2 = this.ticket;
        int i10 = 0;
        int hashCode2 = (((hashCode + (ticket2 == null ? 0 : ticket2.hashCode())) * 31) + this.uiFlags.hashCode()) * 31;
        Header header2 = this.header;
        int hashCode3 = (hashCode2 + (header2 == null ? 0 : header2.hashCode())) * 31;
        ConversationEndedButton conversationEndedButton2 = this.conversationEndedButton;
        int hashCode4 = (hashCode3 + (conversationEndedButton2 == null ? 0 : conversationEndedButton2.hashCode())) * 31;
        FooterNotice footerNotice2 = this.footerNotice;
        int hashCode5 = (hashCode4 + (footerNotice2 == null ? 0 : footerNotice2.hashCode())) * 31;
        PoweredBy poweredBy2 = this.poweredBy;
        int hashCode6 = (hashCode5 + (poweredBy2 == null ? 0 : poweredBy2.hashCode())) * 31;
        String str = this.teamIntro;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.specialNotice;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode7 + i10;
    }

    public final boolean isInbound() {
        return this.isInbound;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: io.intercom.android.sdk.models.Participant} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: io.intercom.android.sdk.models.Participant} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: io.intercom.android.sdk.models.Participant} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: io.intercom.android.sdk.models.Participant} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: io.intercom.android.sdk.models.Participant} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.intercom.android.sdk.models.Participant lastAdmin() {
        /*
            r4 = this;
            java.util.Map r0 = r4.getParticipants()
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x000f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0024
            java.lang.Object r2 = r0.next()
            r3 = r2
            io.intercom.android.sdk.models.Participant r3 = (io.intercom.android.sdk.models.Participant) r3
            boolean r3 = r3.isAdmin()
            if (r3 == 0) goto L_0x000f
            r1 = r2
            goto L_0x000f
        L_0x0024:
            io.intercom.android.sdk.models.Participant r1 = (io.intercom.android.sdk.models.Participant) r1
            if (r1 != 0) goto L_0x002f
            io.intercom.android.sdk.models.Participant r1 = io.intercom.android.sdk.models.Participant.NULL
            java.lang.String r0 = "NULL"
            kotlin.jvm.internal.C6496s.g(r1, r0)
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.Conversation.lastAdmin():io.intercom.android.sdk.models.Participant");
    }

    public final Part lastPart() {
        Part part = (Part) C6565s.B0(parts());
        if (part != null) {
            return part;
        }
        Part part2 = Part.NULL;
        C6496s.g(part2, "NULL");
        return part2;
    }

    public final LastParticipatingAdmin lastParticipatingAdmin() {
        LastParticipatingAdmin build = this.lastParticipatingAdminBuilder.build();
        C6496s.g(build, "build(...)");
        return build;
    }

    public final List<Part> parts() {
        Iterable<Part.Builder> iterable = this.partBuilderList;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Part.Builder build : iterable) {
            Part build2 = build.build();
            Participant participant = getParticipants().get(build2.getParticipantId());
            if (participant != null) {
                build2.setParticipant(participant);
            }
            arrayList.add(build2);
        }
        return arrayList;
    }

    public String toString() {
        return "Conversation(id=" + this.f70031id + ", isRead=" + this.isRead + ", participantBuilderList=" + this.participantBuilderList + ", partBuilderList=" + this.partBuilderList + ", groupConversationParticipantIds=" + this.groupConversationParticipantIds + ", lastParticipatingAdminBuilder=" + this.lastParticipatingAdminBuilder + ", composerState=" + this.composerState + ", preventEndUserReplies=" + this.preventEndUserReplies + ", inboundConversationsDisabled=" + this.inboundConversationsDisabled + ", notificationStatus=" + this.notificationStatus + ", state=" + this.state + ", isInbound=" + this.isInbound + ", ticket=" + this.ticket + ", uiFlags=" + this.uiFlags + ", header=" + this.header + ", conversationEndedButton=" + this.conversationEndedButton + ", footerNotice=" + this.footerNotice + ", poweredBy=" + this.poweredBy + ", teamIntro=" + this.teamIntro + ", specialNotice=" + this.specialNotice + ')';
    }

    public Conversation(String str, boolean z10, List<Participant.Builder> list, List<Part.Builder> list2, List<String> list3, LastParticipatingAdmin.Builder builder, ComposerState composerState2, boolean z11, boolean z12, String str2, String str3, boolean z13, Ticket ticket2, ConversationUiFlags conversationUiFlags, Header header2, ConversationEndedButton conversationEndedButton2, FooterNotice footerNotice2, PoweredBy poweredBy2, String str4, String str5) {
        List<String> list4 = list3;
        LastParticipatingAdmin.Builder builder2 = builder;
        ComposerState composerState3 = composerState2;
        String str6 = str2;
        String str7 = str3;
        ConversationUiFlags conversationUiFlags2 = conversationUiFlags;
        C6496s.h(str, "id");
        C6496s.h(list, "participantBuilderList");
        C6496s.h(list2, "partBuilderList");
        C6496s.h(list4, "groupConversationParticipantIds");
        C6496s.h(builder2, "lastParticipatingAdminBuilder");
        C6496s.h(composerState3, "composerState");
        C6496s.h(str6, "notificationStatus");
        C6496s.h(str7, "state");
        C6496s.h(conversationUiFlags2, "uiFlags");
        this.f70031id = str;
        this.isRead = z10;
        this.participantBuilderList = list;
        this.partBuilderList = list2;
        this.groupConversationParticipantIds = list4;
        this.lastParticipatingAdminBuilder = builder2;
        this.composerState = composerState3;
        this.preventEndUserReplies = z11;
        this.inboundConversationsDisabled = z12;
        this.notificationStatus = str6;
        this.state = str7;
        this.isInbound = z13;
        this.ticket = ticket2;
        this.uiFlags = conversationUiFlags2;
        this.header = header2;
        this.conversationEndedButton = conversationEndedButton2;
        this.footerNotice = footerNotice2;
        this.poweredBy = poweredBy2;
        this.teamIntro = str4;
        this.specialNotice = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Conversation(java.lang.String r22, boolean r23, java.util.List r24, java.util.List r25, java.util.List r26, io.intercom.android.sdk.models.LastParticipatingAdmin.Builder r27, io.intercom.android.sdk.models.ComposerState r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, boolean r33, io.intercom.android.sdk.models.Ticket r34, io.intercom.android.sdk.models.ConversationUiFlags r35, io.intercom.android.sdk.models.Header r36, io.intercom.android.sdk.models.ConversationEndedButton r37, io.intercom.android.sdk.models.FooterNotice r38, io.intercom.android.sdk.models.PoweredBy r39, java.lang.String r40, java.lang.String r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r22
        L_0x000c:
            r3 = r0 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0013
            r3 = r4
            goto L_0x0015
        L_0x0013:
            r3 = r23
        L_0x0015:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001e
            java.util.List r5 = mf.C6565s.n()
            goto L_0x0020
        L_0x001e:
            r5 = r24
        L_0x0020:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0029
            java.util.List r6 = mf.C6565s.n()
            goto L_0x002b
        L_0x0029:
            r6 = r25
        L_0x002b:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0034
            java.util.List r7 = mf.C6565s.n()
            goto L_0x0036
        L_0x0034:
            r7 = r26
        L_0x0036:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0040
            io.intercom.android.sdk.models.LastParticipatingAdmin$Builder r8 = new io.intercom.android.sdk.models.LastParticipatingAdmin$Builder
            r8.<init>()
            goto L_0x0042
        L_0x0040:
            r8 = r27
        L_0x0042:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x004d
            io.intercom.android.sdk.models.ComposerState$Companion r9 = io.intercom.android.sdk.models.ComposerState.Companion
            io.intercom.android.sdk.models.ComposerState r9 = r9.getNULL()
            goto L_0x004f
        L_0x004d:
            r9 = r28
        L_0x004f:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0055
            r10 = r4
            goto L_0x0057
        L_0x0055:
            r10 = r29
        L_0x0057:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x005d
            r11 = r4
            goto L_0x005f
        L_0x005d:
            r11 = r30
        L_0x005f:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0065
            r12 = r2
            goto L_0x0067
        L_0x0065:
            r12 = r31
        L_0x0067:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r2 = r32
        L_0x006e:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r4 = r33
        L_0x0075:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x007b
            r13 = 0
            goto L_0x007d
        L_0x007b:
            r13 = r34
        L_0x007d:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0088
            io.intercom.android.sdk.models.ConversationUiFlags$Companion r15 = io.intercom.android.sdk.models.ConversationUiFlags.Companion
            io.intercom.android.sdk.models.ConversationUiFlags r15 = r15.getDEFAULT()
            goto L_0x008a
        L_0x0088:
            r15 = r35
        L_0x008a:
            r14 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r14 == 0) goto L_0x0090
            r14 = 0
            goto L_0x0092
        L_0x0090:
            r14 = r36
        L_0x0092:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x009c
            r16 = 0
            goto L_0x009e
        L_0x009c:
            r16 = r37
        L_0x009e:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00a7
            r17 = 0
            goto L_0x00a9
        L_0x00a7:
            r17 = r38
        L_0x00a9:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00b2
            r18 = 0
            goto L_0x00b4
        L_0x00b2:
            r18 = r39
        L_0x00b4:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00bd
            r19 = 0
            goto L_0x00bf
        L_0x00bd:
            r19 = r40
        L_0x00bf:
            r20 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x00c7
            r0 = 0
            goto L_0x00c9
        L_0x00c7:
            r0 = r41
        L_0x00c9:
            r22 = r21
            r23 = r1
            r24 = r3
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r2
            r34 = r4
            r35 = r13
            r36 = r15
            r37 = r14
            r38 = r16
            r39 = r17
            r40 = r18
            r41 = r19
            r42 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.Conversation.<init>(java.lang.String, boolean, java.util.List, java.util.List, java.util.List, io.intercom.android.sdk.models.LastParticipatingAdmin$Builder, io.intercom.android.sdk.models.ComposerState, boolean, boolean, java.lang.String, java.lang.String, boolean, io.intercom.android.sdk.models.Ticket, io.intercom.android.sdk.models.ConversationUiFlags, io.intercom.android.sdk.models.Header, io.intercom.android.sdk.models.ConversationEndedButton, io.intercom.android.sdk.models.FooterNotice, io.intercom.android.sdk.models.PoweredBy, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
