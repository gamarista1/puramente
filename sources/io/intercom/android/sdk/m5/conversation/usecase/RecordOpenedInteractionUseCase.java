package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.NotificationStatuses;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/RecordOpenedInteractionUseCase;", "", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "conversationRepository", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;)V", "Lio/intercom/android/sdk/models/Conversation;", "conversation", "", "shouldRecordOpenedInteraction", "(Lio/intercom/android/sdk/models/Conversation;)Z", "Llf/M;", "invoke", "(Lio/intercom/android/sdk/models/Conversation;)V", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordOpenedInteractionUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    public RecordOpenedInteractionUseCase(ConversationRepository conversationRepository2) {
        C6496s.h(conversationRepository2, "conversationRepository");
        this.conversationRepository = conversationRepository2;
    }

    private final boolean shouldRecordOpenedInteraction(Conversation conversation) {
        return C6565s.q(NotificationStatuses.DELIVERED_STATUS, NotificationStatuses.RENOTIFYING_STATUS).contains(conversation.getNotificationStatus());
    }

    public final void invoke(Conversation conversation) {
        C6496s.h(conversation, "conversation");
        if (shouldRecordOpenedInteraction(conversation)) {
            this.conversationRepository.recordInteractions(conversation.getId(), new String[]{"opened"});
        }
    }
}
