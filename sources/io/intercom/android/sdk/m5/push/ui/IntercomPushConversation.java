package io.intercom.android.sdk.m5.push.ui;

import android.net.Uri;
import androidx.core.app.u;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation;", "", "conversationId", "", "conversationTitle", "messages", "", "Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation$Message;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getConversationId", "()Ljava/lang/String;", "getConversationTitle", "getMessages", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Message", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomPushConversation {
    public static final int $stable = 8;
    private final String conversationId;
    private final String conversationTitle;
    private final List<Message> messages;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010&\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, d2 = {"Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation$Message;", "", "Landroidx/core/app/u;", "person", "", "timestamp", "", "message", "Landroid/net/Uri;", "contentImageUri", "<init>", "(Landroidx/core/app/u;JLjava/lang/String;Landroid/net/Uri;)V", "component1", "()Landroidx/core/app/u;", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "()Landroid/net/Uri;", "copy", "(Landroidx/core/app/u;JLjava/lang/String;Landroid/net/Uri;)Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation$Message;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/core/app/u;", "getPerson", "J", "getTimestamp", "Ljava/lang/String;", "getMessage", "Landroid/net/Uri;", "getContentImageUri", "isCurrentUser", "Z", "()Z", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Message {
        public static final int $stable = 8;
        private final Uri contentImageUri;
        private final boolean isCurrentUser;
        private final String message;
        private final u person;
        private final long timestamp;

        public Message(u uVar, long j10, String str, Uri uri) {
            boolean z10;
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            this.person = uVar;
            this.timestamp = j10;
            this.message = str;
            this.contentImageUri = uri;
            if (uVar == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.isCurrentUser = z10;
        }

        public static /* synthetic */ Message copy$default(Message message2, u uVar, long j10, String str, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uVar = message2.person;
            }
            if ((i10 & 2) != 0) {
                j10 = message2.timestamp;
            }
            long j11 = j10;
            if ((i10 & 4) != 0) {
                str = message2.message;
            }
            String str2 = str;
            if ((i10 & 8) != 0) {
                uri = message2.contentImageUri;
            }
            return message2.copy(uVar, j11, str2, uri);
        }

        public final u component1() {
            return this.person;
        }

        public final long component2() {
            return this.timestamp;
        }

        public final String component3() {
            return this.message;
        }

        public final Uri component4() {
            return this.contentImageUri;
        }

        public final Message copy(u uVar, long j10, String str, Uri uri) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            return new Message(uVar, j10, str, uri);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message2 = (Message) obj;
            return C6496s.c(this.person, message2.person) && this.timestamp == message2.timestamp && C6496s.c(this.message, message2.message) && C6496s.c(this.contentImageUri, message2.contentImageUri);
        }

        public final Uri getContentImageUri() {
            return this.contentImageUri;
        }

        public final String getMessage() {
            return this.message;
        }

        public final u getPerson() {
            return this.person;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            u uVar = this.person;
            int i10 = 0;
            int hashCode = (((((uVar == null ? 0 : uVar.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.message.hashCode()) * 31;
            Uri uri = this.contentImageUri;
            if (uri != null) {
                i10 = uri.hashCode();
            }
            return hashCode + i10;
        }

        public final boolean isCurrentUser() {
            return this.isCurrentUser;
        }

        public String toString() {
            return "Message(person=" + this.person + ", timestamp=" + this.timestamp + ", message=" + this.message + ", contentImageUri=" + this.contentImageUri + ')';
        }
    }

    public IntercomPushConversation(String str, String str2, List<Message> list) {
        C6496s.h(str, "conversationId");
        C6496s.h(str2, "conversationTitle");
        C6496s.h(list, "messages");
        this.conversationId = str;
        this.conversationTitle = str2;
        this.messages = list;
    }

    public static /* synthetic */ IntercomPushConversation copy$default(IntercomPushConversation intercomPushConversation, String str, String str2, List<Message> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = intercomPushConversation.conversationId;
        }
        if ((i10 & 2) != 0) {
            str2 = intercomPushConversation.conversationTitle;
        }
        if ((i10 & 4) != 0) {
            list = intercomPushConversation.messages;
        }
        return intercomPushConversation.copy(str, str2, list);
    }

    public final String component1() {
        return this.conversationId;
    }

    public final String component2() {
        return this.conversationTitle;
    }

    public final List<Message> component3() {
        return this.messages;
    }

    public final IntercomPushConversation copy(String str, String str2, List<Message> list) {
        C6496s.h(str, "conversationId");
        C6496s.h(str2, "conversationTitle");
        C6496s.h(list, "messages");
        return new IntercomPushConversation(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomPushConversation)) {
            return false;
        }
        IntercomPushConversation intercomPushConversation = (IntercomPushConversation) obj;
        return C6496s.c(this.conversationId, intercomPushConversation.conversationId) && C6496s.c(this.conversationTitle, intercomPushConversation.conversationTitle) && C6496s.c(this.messages, intercomPushConversation.messages);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return (((this.conversationId.hashCode() * 31) + this.conversationTitle.hashCode()) * 31) + this.messages.hashCode();
    }

    public String toString() {
        return "IntercomPushConversation(conversationId=" + this.conversationId + ", conversationTitle=" + this.conversationTitle + ", messages=" + this.messages + ')';
    }
}
