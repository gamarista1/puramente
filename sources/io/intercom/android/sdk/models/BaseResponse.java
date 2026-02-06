package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.User;

public abstract class BaseResponse {
    private final Config config;
    private final boolean hasConversations;
    private final User user;

    static abstract class Builder {
        Config config;
        boolean has_conversations;
        User.Builder user;

        Builder() {
        }

        public abstract BaseResponse build();
    }

    protected BaseResponse(Builder builder) {
        User user2;
        Config config2 = builder.config;
        this.config = config2 == null ? new Config() : config2;
        this.hasConversations = builder.has_conversations;
        User.Builder builder2 = builder.user;
        if (builder2 == null) {
            user2 = User.NULL;
        } else {
            user2 = builder2.build();
        }
        this.user = user2;
    }

    public Config getConfig() {
        return this.config;
    }

    public User getUser() {
        return this.user;
    }

    public boolean hasConversations() {
        return this.hasConversations;
    }
}
