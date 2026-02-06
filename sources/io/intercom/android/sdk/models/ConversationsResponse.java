package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.ConversationList;

public class ConversationsResponse extends BaseResponse {
    private final ConversationList conversationPage;

    public static final class Builder extends BaseResponse.Builder {
        ConversationList.Builder conversation_page;

        public Builder withConversationPage(ConversationList.Builder builder) {
            this.conversation_page = builder;
            return this;
        }

        public ConversationsResponse build() {
            return new ConversationsResponse(this);
        }
    }

    ConversationsResponse(Builder builder) {
        super(builder);
        ConversationList conversationList;
        ConversationList.Builder builder2 = builder.conversation_page;
        if (builder2 == null) {
            conversationList = new ConversationList.Builder().build();
        } else {
            conversationList = builder2.build();
        }
        this.conversationPage = conversationList;
    }

    public ConversationList getConversationPage() {
        return this.conversationPage;
    }
}
