package io.intercom.android.sdk.models;

import java.util.List;
import java.util.Set;

final class AutoValue_ConversationList extends ConversationList {
    private final List<Conversation> getConversations;
    private final EmptyState getEmptyState;
    private final Set<String> getUnreadConversationIds;
    private final int getUnreadConversationsCount;
    private final boolean hasMorePages;

    AutoValue_ConversationList(List<Conversation> list, Set<String> set, int i10, EmptyState emptyState, boolean z10) {
        if (list != null) {
            this.getConversations = list;
            if (set != null) {
                this.getUnreadConversationIds = set;
                this.getUnreadConversationsCount = i10;
                if (emptyState != null) {
                    this.getEmptyState = emptyState;
                    this.hasMorePages = z10;
                    return;
                }
                throw new NullPointerException("Null getEmptyState");
            }
            throw new NullPointerException("Null getUnreadConversationIds");
        }
        throw new NullPointerException("Null getConversations");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationList)) {
            return false;
        }
        ConversationList conversationList = (ConversationList) obj;
        if (!this.getConversations.equals(conversationList.getConversations()) || !this.getUnreadConversationIds.equals(conversationList.getUnreadConversationIds()) || this.getUnreadConversationsCount != conversationList.getUnreadConversationsCount() || !this.getEmptyState.equals(conversationList.getEmptyState()) || this.hasMorePages != conversationList.hasMorePages()) {
            return false;
        }
        return true;
    }

    public List<Conversation> getConversations() {
        return this.getConversations;
    }

    public EmptyState getEmptyState() {
        return this.getEmptyState;
    }

    public Set<String> getUnreadConversationIds() {
        return this.getUnreadConversationIds;
    }

    public int getUnreadConversationsCount() {
        return this.getUnreadConversationsCount;
    }

    public boolean hasMorePages() {
        return this.hasMorePages;
    }

    public int hashCode() {
        int i10;
        int hashCode = (((((((this.getConversations.hashCode() ^ 1000003) * 1000003) ^ this.getUnreadConversationIds.hashCode()) * 1000003) ^ this.getUnreadConversationsCount) * 1000003) ^ this.getEmptyState.hashCode()) * 1000003;
        if (this.hasMorePages) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "ConversationList{getConversations=" + this.getConversations + ", getUnreadConversationIds=" + this.getUnreadConversationIds + ", getUnreadConversationsCount=" + this.getUnreadConversationsCount + ", getEmptyState=" + this.getEmptyState + ", hasMorePages=" + this.hasMorePages + "}";
    }
}
