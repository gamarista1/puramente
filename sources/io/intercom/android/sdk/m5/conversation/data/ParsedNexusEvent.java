package io.intercom.android.sdk.m5.conversation.data;

import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "", "<init>", "()V", "ConversationNexusEvent", "NexusConnected", "UnSupportedEvent", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$NexusConnected;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$UnSupportedEvent;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ParsedNexusEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "conversationId", "", "eventType", "Lio/intercom/android/nexus/NexusEventType;", "<init>", "(Ljava/lang/String;Lio/intercom/android/nexus/NexusEventType;)V", "getConversationId", "()Ljava/lang/String;", "getEventType", "()Lio/intercom/android/nexus/NexusEventType;", "NewComment", "AdminIsTyping", "UserContentSeenByAdmin", "FinStreaming", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class ConversationNexusEvent extends ParsedNexusEvent {
        public static final int $stable = 0;
        private final String conversationId;
        private final NexusEventType eventType;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020 H×\u0001J\t\u0010!\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$AdminIsTyping;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "conversationId", "", "createdByUser", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "isBot", "", "showAvatar", "clientId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Avatar;ZZLjava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getCreatedByUser", "getAvatar", "()Lio/intercom/android/sdk/models/Avatar;", "()Z", "getShowAvatar", "getClientId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AdminIsTyping extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final Avatar avatar;
            private final String clientId;
            private final String conversationId;
            private final String createdByUser;
            private final boolean isBot;
            private final boolean showAvatar;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AdminIsTyping(String str, String str2, Avatar avatar2, boolean z10, boolean z11, String str3) {
                super(str, NexusEventType.AdminIsTyping);
                C6496s.h(str, "conversationId");
                C6496s.h(str2, "createdByUser");
                C6496s.h(avatar2, "avatar");
                C6496s.h(str3, "clientId");
                this.conversationId = str;
                this.createdByUser = str2;
                this.avatar = avatar2;
                this.isBot = z10;
                this.showAvatar = z11;
                this.clientId = str3;
            }

            public static /* synthetic */ AdminIsTyping copy$default(AdminIsTyping adminIsTyping, String str, String str2, Avatar avatar2, boolean z10, boolean z11, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = adminIsTyping.conversationId;
                }
                if ((i10 & 2) != 0) {
                    str2 = adminIsTyping.createdByUser;
                }
                String str4 = str2;
                if ((i10 & 4) != 0) {
                    avatar2 = adminIsTyping.avatar;
                }
                Avatar avatar3 = avatar2;
                if ((i10 & 8) != 0) {
                    z10 = adminIsTyping.isBot;
                }
                boolean z12 = z10;
                if ((i10 & 16) != 0) {
                    z11 = adminIsTyping.showAvatar;
                }
                boolean z13 = z11;
                if ((i10 & 32) != 0) {
                    str3 = adminIsTyping.clientId;
                }
                return adminIsTyping.copy(str, str4, avatar3, z12, z13, str3);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.createdByUser;
            }

            public final Avatar component3() {
                return this.avatar;
            }

            public final boolean component4() {
                return this.isBot;
            }

            public final boolean component5() {
                return this.showAvatar;
            }

            public final String component6() {
                return this.clientId;
            }

            public final AdminIsTyping copy(String str, String str2, Avatar avatar2, boolean z10, boolean z11, String str3) {
                C6496s.h(str, "conversationId");
                C6496s.h(str2, "createdByUser");
                C6496s.h(avatar2, "avatar");
                C6496s.h(str3, "clientId");
                return new AdminIsTyping(str, str2, avatar2, z10, z11, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdminIsTyping)) {
                    return false;
                }
                AdminIsTyping adminIsTyping = (AdminIsTyping) obj;
                return C6496s.c(this.conversationId, adminIsTyping.conversationId) && C6496s.c(this.createdByUser, adminIsTyping.createdByUser) && C6496s.c(this.avatar, adminIsTyping.avatar) && this.isBot == adminIsTyping.isBot && this.showAvatar == adminIsTyping.showAvatar && C6496s.c(this.clientId, adminIsTyping.clientId);
            }

            public final Avatar getAvatar() {
                return this.avatar;
            }

            public final String getClientId() {
                return this.clientId;
            }

            public String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public final boolean getShowAvatar() {
                return this.showAvatar;
            }

            public int hashCode() {
                return (((((((((this.conversationId.hashCode() * 31) + this.createdByUser.hashCode()) * 31) + this.avatar.hashCode()) * 31) + Boolean.hashCode(this.isBot)) * 31) + Boolean.hashCode(this.showAvatar)) * 31) + this.clientId.hashCode();
            }

            public final boolean isBot() {
                return this.isBot;
            }

            public String toString() {
                return "AdminIsTyping(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", avatar=" + this.avatar + ", isBot=" + this.isBot + ", showAvatar=" + this.showAvatar + ", clientId=" + this.clientId + ')';
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u0007H×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$FinStreaming;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "conversationId", "", "clientAssignedUUID", "partType", "tokenSequenceIndex", "", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getConversationId", "()Ljava/lang/String;", "getClientAssignedUUID", "getPartType", "getTokenSequenceIndex", "()I", "getBlocks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FinStreaming extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final List<Block> blocks;
            private final String clientAssignedUUID;
            private final String conversationId;
            private final String partType;
            private final int tokenSequenceIndex;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public FinStreaming(String str, String str2, String str3, int i10, List<? extends Block> list) {
                super(str, NexusEventType.ConversationPartToken);
                C6496s.h(str, "conversationId");
                C6496s.h(str2, "clientAssignedUUID");
                C6496s.h(str3, "partType");
                C6496s.h(list, "blocks");
                this.conversationId = str;
                this.clientAssignedUUID = str2;
                this.partType = str3;
                this.tokenSequenceIndex = i10;
                this.blocks = list;
            }

            public static /* synthetic */ FinStreaming copy$default(FinStreaming finStreaming, String str, String str2, String str3, int i10, List<Block> list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = finStreaming.conversationId;
                }
                if ((i11 & 2) != 0) {
                    str2 = finStreaming.clientAssignedUUID;
                }
                String str4 = str2;
                if ((i11 & 4) != 0) {
                    str3 = finStreaming.partType;
                }
                String str5 = str3;
                if ((i11 & 8) != 0) {
                    i10 = finStreaming.tokenSequenceIndex;
                }
                int i12 = i10;
                if ((i11 & 16) != 0) {
                    list = finStreaming.blocks;
                }
                return finStreaming.copy(str, str4, str5, i12, list);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.clientAssignedUUID;
            }

            public final String component3() {
                return this.partType;
            }

            public final int component4() {
                return this.tokenSequenceIndex;
            }

            public final List<Block> component5() {
                return this.blocks;
            }

            public final FinStreaming copy(String str, String str2, String str3, int i10, List<? extends Block> list) {
                C6496s.h(str, "conversationId");
                C6496s.h(str2, "clientAssignedUUID");
                C6496s.h(str3, "partType");
                C6496s.h(list, "blocks");
                return new FinStreaming(str, str2, str3, i10, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FinStreaming)) {
                    return false;
                }
                FinStreaming finStreaming = (FinStreaming) obj;
                return C6496s.c(this.conversationId, finStreaming.conversationId) && C6496s.c(this.clientAssignedUUID, finStreaming.clientAssignedUUID) && C6496s.c(this.partType, finStreaming.partType) && this.tokenSequenceIndex == finStreaming.tokenSequenceIndex && C6496s.c(this.blocks, finStreaming.blocks);
            }

            public final List<Block> getBlocks() {
                return this.blocks;
            }

            public final String getClientAssignedUUID() {
                return this.clientAssignedUUID;
            }

            public String getConversationId() {
                return this.conversationId;
            }

            public final String getPartType() {
                return this.partType;
            }

            public final int getTokenSequenceIndex() {
                return this.tokenSequenceIndex;
            }

            public int hashCode() {
                return (((((((this.conversationId.hashCode() * 31) + this.clientAssignedUUID.hashCode()) * 31) + this.partType.hashCode()) * 31) + Integer.hashCode(this.tokenSequenceIndex)) * 31) + this.blocks.hashCode();
            }

            public String toString() {
                return "FinStreaming(conversationId=" + this.conversationId + ", clientAssignedUUID=" + this.clientAssignedUUID + ", partType=" + this.partType + ", tokenSequenceIndex=" + this.tokenSequenceIndex + ", blocks=" + this.blocks + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$NewComment;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "conversationId", "", "createdByUser", "ticketId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getCreatedByUser", "getTicketId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NewComment extends ConversationNexusEvent {
            public static final int $stable = 0;
            private final String conversationId;
            private final String createdByUser;
            private final String ticketId;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ NewComment(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i10 & 4) != 0 ? null : str3);
            }

            public static /* synthetic */ NewComment copy$default(NewComment newComment, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = newComment.conversationId;
                }
                if ((i10 & 2) != 0) {
                    str2 = newComment.createdByUser;
                }
                if ((i10 & 4) != 0) {
                    str3 = newComment.ticketId;
                }
                return newComment.copy(str, str2, str3);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.createdByUser;
            }

            public final String component3() {
                return this.ticketId;
            }

            public final NewComment copy(String str, String str2, String str3) {
                C6496s.h(str, "conversationId");
                C6496s.h(str2, "createdByUser");
                return new NewComment(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NewComment)) {
                    return false;
                }
                NewComment newComment = (NewComment) obj;
                return C6496s.c(this.conversationId, newComment.conversationId) && C6496s.c(this.createdByUser, newComment.createdByUser) && C6496s.c(this.ticketId, newComment.ticketId);
            }

            public String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public final String getTicketId() {
                return this.ticketId;
            }

            public int hashCode() {
                int hashCode = ((this.conversationId.hashCode() * 31) + this.createdByUser.hashCode()) * 31;
                String str = this.ticketId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "NewComment(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", ticketId=" + this.ticketId + ')';
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public NewComment(String str, String str2, String str3) {
                super(str, NexusEventType.NewComment);
                C6496s.h(str, "conversationId");
                C6496s.h(str2, "createdByUser");
                this.conversationId = str;
                this.createdByUser = str2;
                this.ticketId = str3;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$UserContentSeenByAdmin;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "conversationId", "", "createdByUser", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "isBot", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Avatar;Z)V", "getConversationId", "()Ljava/lang/String;", "getCreatedByUser", "getAvatar", "()Lio/intercom/android/sdk/models/Avatar;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UserContentSeenByAdmin extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final Avatar avatar;
            private final String conversationId;
            private final String createdByUser;
            private final boolean isBot;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public UserContentSeenByAdmin(String str, String str2, Avatar avatar2, boolean z10) {
                super(str, NexusEventType.AdminIsTyping);
                C6496s.h(str, "conversationId");
                C6496s.h(str2, "createdByUser");
                C6496s.h(avatar2, "avatar");
                this.conversationId = str;
                this.createdByUser = str2;
                this.avatar = avatar2;
                this.isBot = z10;
            }

            public static /* synthetic */ UserContentSeenByAdmin copy$default(UserContentSeenByAdmin userContentSeenByAdmin, String str, String str2, Avatar avatar2, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = userContentSeenByAdmin.conversationId;
                }
                if ((i10 & 2) != 0) {
                    str2 = userContentSeenByAdmin.createdByUser;
                }
                if ((i10 & 4) != 0) {
                    avatar2 = userContentSeenByAdmin.avatar;
                }
                if ((i10 & 8) != 0) {
                    z10 = userContentSeenByAdmin.isBot;
                }
                return userContentSeenByAdmin.copy(str, str2, avatar2, z10);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.createdByUser;
            }

            public final Avatar component3() {
                return this.avatar;
            }

            public final boolean component4() {
                return this.isBot;
            }

            public final UserContentSeenByAdmin copy(String str, String str2, Avatar avatar2, boolean z10) {
                C6496s.h(str, "conversationId");
                C6496s.h(str2, "createdByUser");
                C6496s.h(avatar2, "avatar");
                return new UserContentSeenByAdmin(str, str2, avatar2, z10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UserContentSeenByAdmin)) {
                    return false;
                }
                UserContentSeenByAdmin userContentSeenByAdmin = (UserContentSeenByAdmin) obj;
                return C6496s.c(this.conversationId, userContentSeenByAdmin.conversationId) && C6496s.c(this.createdByUser, userContentSeenByAdmin.createdByUser) && C6496s.c(this.avatar, userContentSeenByAdmin.avatar) && this.isBot == userContentSeenByAdmin.isBot;
            }

            public final Avatar getAvatar() {
                return this.avatar;
            }

            public String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public int hashCode() {
                return (((((this.conversationId.hashCode() * 31) + this.createdByUser.hashCode()) * 31) + this.avatar.hashCode()) * 31) + Boolean.hashCode(this.isBot);
            }

            public final boolean isBot() {
                return this.isBot;
            }

            public String toString() {
                return "UserContentSeenByAdmin(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", avatar=" + this.avatar + ", isBot=" + this.isBot + ')';
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ConversationNexusEvent(String str, NexusEventType nexusEventType) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "conversationId");
            C6496s.h(nexusEventType, "eventType");
            this.conversationId = str;
            this.eventType = nexusEventType;
        }

        public String getConversationId() {
            return this.conversationId;
        }

        public final NexusEventType getEventType() {
            return this.eventType;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$NexusConnected;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NexusConnected extends ParsedNexusEvent {
        public static final int $stable = 0;
        public static final NexusConnected INSTANCE = new NexusConnected();

        private NexusConnected() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NexusConnected);
        }

        public int hashCode() {
            return -1135156447;
        }

        public String toString() {
            return "NexusConnected";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$UnSupportedEvent;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnSupportedEvent extends ParsedNexusEvent {
        public static final int $stable = 0;
        public static final UnSupportedEvent INSTANCE = new UnSupportedEvent();

        private UnSupportedEvent() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UnSupportedEvent);
        }

        public int hashCode() {
            return -2056396516;
        }

        public String toString() {
            return "UnSupportedEvent";
        }
    }

    public /* synthetic */ ParsedNexusEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ParsedNexusEvent() {
    }
}
