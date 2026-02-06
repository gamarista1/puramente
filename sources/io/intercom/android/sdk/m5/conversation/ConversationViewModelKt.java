package io.intercom.android.sdk.m5.conversation;

import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"isFastFinTyping", "", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$AdminIsTyping;", "clientState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationViewModelKt {
    /* access modifiers changed from: private */
    public static final boolean isFastFinTyping(ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping adminIsTyping, ConversationClientState conversationClientState) {
        if (adminIsTyping.getClientId().length() > 0) {
            Map<String, PendingMessage> pendingMessages = conversationClientState.getPendingMessages();
            if (!pendingMessages.isEmpty()) {
                for (Map.Entry<String, PendingMessage> value : pendingMessages.entrySet()) {
                    if (C6496s.c(((PendingMessage) value.getValue()).getPart().getUuid(), adminIsTyping.getClientId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
