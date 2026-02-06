package io.intercom.android.sdk.models;

import Oc.c;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/models/ConversationEndedButton;", "", "message", "", "ctaTitle", "reason", "Lio/intercom/android/sdk/models/ConversationEndedButton$Reason;", "metadata", "Lio/intercom/android/sdk/models/ConversationEndedButton$Metadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/ConversationEndedButton$Reason;Lio/intercom/android/sdk/models/ConversationEndedButton$Metadata;)V", "getMessage", "()Ljava/lang/String;", "getCtaTitle", "getReason", "()Lio/intercom/android/sdk/models/ConversationEndedButton$Reason;", "getMetadata", "()Lio/intercom/android/sdk/models/ConversationEndedButton$Metadata;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Metadata", "Reason", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConversationEndedButton {
    public static final int $stable = 0;
    @c("text")
    private final String ctaTitle;
    @c("title")
    private final String message;
    private final Metadata metadata;
    private final Reason reason;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/ConversationEndedButton$Metadata;", "", "mergedIntoConversationId", "", "<init>", "(Ljava/lang/String;)V", "getMergedIntoConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Metadata {
        public static final int $stable = 0;
        @c("merged_into_conversation_id")
        private final String mergedIntoConversationId;

        public Metadata(String str) {
            C6496s.h(str, "mergedIntoConversationId");
            this.mergedIntoConversationId = str;
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = metadata.mergedIntoConversationId;
            }
            return metadata.copy(str);
        }

        public final String component1() {
            return this.mergedIntoConversationId;
        }

        public final Metadata copy(String str) {
            C6496s.h(str, "mergedIntoConversationId");
            return new Metadata(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metadata) && C6496s.c(this.mergedIntoConversationId, ((Metadata) obj).mergedIntoConversationId);
        }

        public final String getMergedIntoConversationId() {
            return this.mergedIntoConversationId;
        }

        public int hashCode() {
            return this.mergedIntoConversationId.hashCode();
        }

        public String toString() {
            return "Metadata(mergedIntoConversationId=" + this.mergedIntoConversationId + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/ConversationEndedButton$Reason;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "MERGED_INTO_CONVERSATION", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Reason {
        UNKNOWN,
        MERGED_INTO_CONVERSATION;

        static {
            Reason[] $values;
            $ENTRIES = C6714a.a($values);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    public ConversationEndedButton(String str, String str2, Reason reason2, Metadata metadata2) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(str2, "ctaTitle");
        C6496s.h(reason2, "reason");
        this.message = str;
        this.ctaTitle = str2;
        this.reason = reason2;
        this.metadata = metadata2;
    }

    public static /* synthetic */ ConversationEndedButton copy$default(ConversationEndedButton conversationEndedButton, String str, String str2, Reason reason2, Metadata metadata2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = conversationEndedButton.message;
        }
        if ((i10 & 2) != 0) {
            str2 = conversationEndedButton.ctaTitle;
        }
        if ((i10 & 4) != 0) {
            reason2 = conversationEndedButton.reason;
        }
        if ((i10 & 8) != 0) {
            metadata2 = conversationEndedButton.metadata;
        }
        return conversationEndedButton.copy(str, str2, reason2, metadata2);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.ctaTitle;
    }

    public final Reason component3() {
        return this.reason;
    }

    public final Metadata component4() {
        return this.metadata;
    }

    public final ConversationEndedButton copy(String str, String str2, Reason reason2, Metadata metadata2) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(str2, "ctaTitle");
        C6496s.h(reason2, "reason");
        return new ConversationEndedButton(str, str2, reason2, metadata2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationEndedButton)) {
            return false;
        }
        ConversationEndedButton conversationEndedButton = (ConversationEndedButton) obj;
        return C6496s.c(this.message, conversationEndedButton.message) && C6496s.c(this.ctaTitle, conversationEndedButton.ctaTitle) && this.reason == conversationEndedButton.reason && C6496s.c(this.metadata, conversationEndedButton.metadata);
    }

    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final Reason getReason() {
        return this.reason;
    }

    public int hashCode() {
        int hashCode = ((((this.message.hashCode() * 31) + this.ctaTitle.hashCode()) * 31) + this.reason.hashCode()) * 31;
        Metadata metadata2 = this.metadata;
        return hashCode + (metadata2 == null ? 0 : metadata2.hashCode());
    }

    public String toString() {
        return "ConversationEndedButton(message=" + this.message + ", ctaTitle=" + this.ctaTitle + ", reason=" + this.reason + ", metadata=" + this.metadata + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConversationEndedButton(String str, String str2, Reason reason2, Metadata metadata2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, reason2, (i10 & 8) != 0 ? null : metadata2);
    }
}
