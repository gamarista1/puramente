package io.intercom.android.sdk.m5.push;

import io.intercom.android.sdk.push.SystemNotificationManager;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import sf.C6714a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/push/NotificationChannel;", "", "channelName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getChannelName", "()Ljava/lang/String;", "CHAT_REPLIES_CHANNEL", "NEW_CHATS_CHANNEL", "ACTIONS_CHANNEL", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum NotificationChannel {
    CHAT_REPLIES_CHANNEL(SystemNotificationManager.CHAT_REPLIES_CHANNEL),
    NEW_CHATS_CHANNEL(SystemNotificationManager.NEW_CHATS_CHANNEL),
    ACTIONS_CHANNEL(SystemNotificationManager.ACTIONS_CHANNEL);
    
    private final String channelName;

    static {
        NotificationChannel[] $values;
        $ENTRIES = C6714a.a($values);
    }

    private NotificationChannel(String str) {
        this.channelName = str;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public final String getChannelName() {
        return this.channelName;
    }
}
