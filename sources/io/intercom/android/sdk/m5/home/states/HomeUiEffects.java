package io.intercom.android.sdk.m5.home.states;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiEffects;", "", "<init>", "()V", "NavigateToMessages", "NavigateToNewConversation", "NavigateToConversation", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToConversation;", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToMessages;", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToNewConversation;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HomeUiEffects {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToConversation;", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToConversation extends HomeUiEffects {
        public static final int $stable = 0;
        private final String conversationId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NavigateToConversation(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "conversationId");
            this.conversationId = str;
        }

        public static /* synthetic */ NavigateToConversation copy$default(NavigateToConversation navigateToConversation, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = navigateToConversation.conversationId;
            }
            return navigateToConversation.copy(str);
        }

        public final String component1() {
            return this.conversationId;
        }

        public final NavigateToConversation copy(String str) {
            C6496s.h(str, "conversationId");
            return new NavigateToConversation(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToConversation) && C6496s.c(this.conversationId, ((NavigateToConversation) obj).conversationId);
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        public String toString() {
            return "NavigateToConversation(conversationId=" + this.conversationId + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToMessages;", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToMessages extends HomeUiEffects {
        public static final int $stable = 0;
        public static final NavigateToMessages INSTANCE = new NavigateToMessages();

        private NavigateToMessages() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToMessages);
        }

        public int hashCode() {
            return 982177798;
        }

        public String toString() {
            return "NavigateToMessages";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToNewConversation;", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToNewConversation extends HomeUiEffects {
        public static final int $stable = 0;
        public static final NavigateToNewConversation INSTANCE = new NavigateToNewConversation();

        private NavigateToNewConversation() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToNewConversation);
        }

        public int hashCode() {
            return 453078601;
        }

        public String toString() {
            return "NavigateToNewConversation";
        }
    }

    public /* synthetic */ HomeUiEffects(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HomeUiEffects() {
    }
}
