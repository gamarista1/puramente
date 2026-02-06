package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.ConversationList;

public class UsersResponse extends BaseResponse {
    private final ConversationList unreadConversations;
    private final UnreadTickets unreadTickets;

    public static class Builder extends BaseResponse.Builder {
        ConversationList.Builder unread_conversations;
        UnreadTickets unread_tickets;

        public UsersResponse build() {
            return new UsersResponse(this);
        }
    }

    UsersResponse(Builder builder) {
        super(builder);
        ConversationList conversationList;
        ConversationList.Builder builder2 = builder.unread_conversations;
        if (builder2 == null) {
            conversationList = new ConversationList.Builder().build();
        } else {
            conversationList = builder2.build();
        }
        this.unreadConversations = conversationList;
        UnreadTickets unreadTickets2 = builder.unread_tickets;
        this.unreadTickets = unreadTickets2 == null ? UnreadTickets.Companion.getNULL() : unreadTickets2;
    }

    public ConversationList getUnreadConversations() {
        return this.unreadConversations;
    }

    public UnreadTickets getUnreadTickets() {
        return this.unreadTickets;
    }
}
