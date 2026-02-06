package io.intercom.android.sdk.m5.conversation.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import sf.C6714a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;", "", "<init>", "(Ljava/lang/String;I)V", "NEW_COMMENT", "NEXUS_CONNECTED", "NETWORK_CONNECTED", "OPEN_CONVERSATION", "POLLING", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum GetConversationReason {
    NEW_COMMENT,
    NEXUS_CONNECTED,
    NETWORK_CONNECTED,
    OPEN_CONVERSATION,
    POLLING;

    static {
        GetConversationReason[] $values;
        $ENTRIES = C6714a.a($values);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }
}
