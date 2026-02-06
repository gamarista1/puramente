package io.intercom.android.sdk.m5.conversation.states;

import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bB\b\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010L\u001a\u00020%H\u0000¢\u0006\u0002\bMJ\u0015\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010Q\u001a\u00020\nHÆ\u0003J\t\u0010R\u001a\u00020\fHÆ\u0003J\t\u0010S\u001a\u00020\u000eHÆ\u0003J\t\u0010T\u001a\u00020\u0010HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010W\u001a\u00020\u0016HÆ\u0003J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018HÆ\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018HÆ\u0003J\t\u0010Z\u001a\u00020\u001bHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010\\\u001a\u00020\u001fHÆ\u0003J\t\u0010]\u001a\u00020\u001fHÆ\u0003J\t\u0010^\u001a\u00020\"HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010`\u001a\u00020%HÆ\u0003J\t\u0010a\u001a\u00020%HÆ\u0003Jû\u0001\u0010b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%HÇ\u0001J\u0013\u0010c\u001a\u00020%2\b\u0010d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010e\u001a\u00020\u001fH×\u0001J\t\u0010f\u001a\u00020\u0004H×\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010 \u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bF\u0010ER\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b$\u0010JR\u0011\u0010&\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bK\u0010J¨\u0006g"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "", "pendingMessages", "", "", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage;", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "conversationId", "currentlyTypingState", "Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "composerState", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "bottomSheetState", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "launchMode", "Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;", "lastNetworkCall", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "networkState", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "failedAttributeIdentifiers", "", "loadingAttributeIdentifiers", "finStreamingData", "Lio/intercom/android/sdk/m5/conversation/states/FinStreamingData;", "openMessengerResponse", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "unreadConversationsCount", "", "unreadTicketsCount", "floatingIndicatorState", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "newMessageId", "isConversationScrolled", "", "dismissedPrivacyNotice", "<init>", "(Ljava/util/Map;Lio/intercom/android/sdk/models/Conversation;Ljava/lang/String;Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;Lio/intercom/android/sdk/m5/conversation/states/ComposerState;Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/m5/conversation/states/NetworkState;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/m5/conversation/states/FinStreamingData;Lio/intercom/android/sdk/models/OpenMessengerResponse;IILio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;Ljava/lang/String;ZZ)V", "getPendingMessages", "()Ljava/util/Map;", "getConversation", "()Lio/intercom/android/sdk/models/Conversation;", "getConversationId", "()Ljava/lang/String;", "getCurrentlyTypingState", "()Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "getComposerState", "()Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "getBottomSheetState", "()Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "getLaunchMode", "()Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;", "getLastNetworkCall", "()Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "getArticleMetadata", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "getNetworkState", "()Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "getFailedAttributeIdentifiers", "()Ljava/util/List;", "getLoadingAttributeIdentifiers", "getFinStreamingData", "()Lio/intercom/android/sdk/m5/conversation/states/FinStreamingData;", "getOpenMessengerResponse", "()Lio/intercom/android/sdk/models/OpenMessengerResponse;", "getUnreadConversationsCount", "()I", "getUnreadTicketsCount", "getFloatingIndicatorState", "()Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "getNewMessageId", "()Z", "getDismissedPrivacyNotice", "hasUserSentAMessage", "hasUserSentAMessage$intercom_sdk_base_release", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConversationClientState {
    public static final int $stable = 8;
    private final ArticleMetadata articleMetadata;
    private final BottomSheetState bottomSheetState;
    private final ComposerState composerState;
    private final Conversation conversation;
    private final String conversationId;
    private final CurrentlyTypingState currentlyTypingState;
    private final boolean dismissedPrivacyNotice;
    private final List<String> failedAttributeIdentifiers;
    private final FinStreamingData finStreamingData;
    private final FloatingIndicatorState floatingIndicatorState;
    private final boolean isConversationScrolled;
    private final NetworkResponse<Object> lastNetworkCall;
    private final LaunchMode launchMode;
    private final List<String> loadingAttributeIdentifiers;
    private final NetworkState networkState;
    private final String newMessageId;
    private final OpenMessengerResponse openMessengerResponse;
    private final Map<String, PendingMessage> pendingMessages;
    private final int unreadConversationsCount;
    private final int unreadTicketsCount;

    public ConversationClientState() {
        this((Map) null, (Conversation) null, (String) null, (CurrentlyTypingState) null, (ComposerState) null, (BottomSheetState) null, (LaunchMode) null, (NetworkResponse) null, (ArticleMetadata) null, (NetworkState) null, (List) null, (List) null, (FinStreamingData) null, (OpenMessengerResponse) null, 0, 0, (FloatingIndicatorState) null, (String) null, false, false, 1048575, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ConversationClientState copy$default(ConversationClientState conversationClientState, Map map, Conversation conversation2, String str, CurrentlyTypingState currentlyTypingState2, ComposerState composerState2, BottomSheetState bottomSheetState2, LaunchMode launchMode2, NetworkResponse networkResponse, ArticleMetadata articleMetadata2, NetworkState networkState2, List list, List list2, FinStreamingData finStreamingData2, OpenMessengerResponse openMessengerResponse2, int i10, int i11, FloatingIndicatorState floatingIndicatorState2, String str2, boolean z10, boolean z11, int i12, Object obj) {
        ConversationClientState conversationClientState2 = conversationClientState;
        int i13 = i12;
        return conversationClientState.copy((i13 & 1) != 0 ? conversationClientState2.pendingMessages : map, (i13 & 2) != 0 ? conversationClientState2.conversation : conversation2, (i13 & 4) != 0 ? conversationClientState2.conversationId : str, (i13 & 8) != 0 ? conversationClientState2.currentlyTypingState : currentlyTypingState2, (i13 & 16) != 0 ? conversationClientState2.composerState : composerState2, (i13 & 32) != 0 ? conversationClientState2.bottomSheetState : bottomSheetState2, (i13 & 64) != 0 ? conversationClientState2.launchMode : launchMode2, (i13 & 128) != 0 ? conversationClientState2.lastNetworkCall : networkResponse, (i13 & 256) != 0 ? conversationClientState2.articleMetadata : articleMetadata2, (i13 & 512) != 0 ? conversationClientState2.networkState : networkState2, (i13 & 1024) != 0 ? conversationClientState2.failedAttributeIdentifiers : list, (i13 & 2048) != 0 ? conversationClientState2.loadingAttributeIdentifiers : list2, (i13 & 4096) != 0 ? conversationClientState2.finStreamingData : finStreamingData2, (i13 & 8192) != 0 ? conversationClientState2.openMessengerResponse : openMessengerResponse2, (i13 & 16384) != 0 ? conversationClientState2.unreadConversationsCount : i10, (i13 & 32768) != 0 ? conversationClientState2.unreadTicketsCount : i11, (i13 & 65536) != 0 ? conversationClientState2.floatingIndicatorState : floatingIndicatorState2, (i13 & 131072) != 0 ? conversationClientState2.newMessageId : str2, (i13 & 262144) != 0 ? conversationClientState2.isConversationScrolled : z10, (i13 & 524288) != 0 ? conversationClientState2.dismissedPrivacyNotice : z11);
    }

    public final Map<String, PendingMessage> component1() {
        return this.pendingMessages;
    }

    public final NetworkState component10() {
        return this.networkState;
    }

    public final List<String> component11() {
        return this.failedAttributeIdentifiers;
    }

    public final List<String> component12() {
        return this.loadingAttributeIdentifiers;
    }

    public final FinStreamingData component13() {
        return this.finStreamingData;
    }

    public final OpenMessengerResponse component14() {
        return this.openMessengerResponse;
    }

    public final int component15() {
        return this.unreadConversationsCount;
    }

    public final int component16() {
        return this.unreadTicketsCount;
    }

    public final FloatingIndicatorState component17() {
        return this.floatingIndicatorState;
    }

    public final String component18() {
        return this.newMessageId;
    }

    public final boolean component19() {
        return this.isConversationScrolled;
    }

    public final Conversation component2() {
        return this.conversation;
    }

    public final boolean component20() {
        return this.dismissedPrivacyNotice;
    }

    public final String component3() {
        return this.conversationId;
    }

    public final CurrentlyTypingState component4() {
        return this.currentlyTypingState;
    }

    public final ComposerState component5() {
        return this.composerState;
    }

    public final BottomSheetState component6() {
        return this.bottomSheetState;
    }

    public final LaunchMode component7() {
        return this.launchMode;
    }

    public final NetworkResponse<Object> component8() {
        return this.lastNetworkCall;
    }

    public final ArticleMetadata component9() {
        return this.articleMetadata;
    }

    public final ConversationClientState copy(Map<String, PendingMessage> map, Conversation conversation2, String str, CurrentlyTypingState currentlyTypingState2, ComposerState composerState2, BottomSheetState bottomSheetState2, LaunchMode launchMode2, NetworkResponse<? extends Object> networkResponse, ArticleMetadata articleMetadata2, NetworkState networkState2, List<String> list, List<String> list2, FinStreamingData finStreamingData2, OpenMessengerResponse openMessengerResponse2, int i10, int i11, FloatingIndicatorState floatingIndicatorState2, String str2, boolean z10, boolean z11) {
        Map<String, PendingMessage> map2 = map;
        C6496s.h(map2, "pendingMessages");
        C6496s.h(currentlyTypingState2, "currentlyTypingState");
        C6496s.h(composerState2, "composerState");
        C6496s.h(bottomSheetState2, "bottomSheetState");
        C6496s.h(launchMode2, "launchMode");
        C6496s.h(networkState2, "networkState");
        C6496s.h(list, "failedAttributeIdentifiers");
        C6496s.h(list2, "loadingAttributeIdentifiers");
        C6496s.h(finStreamingData2, "finStreamingData");
        C6496s.h(floatingIndicatorState2, "floatingIndicatorState");
        return new ConversationClientState(map2, conversation2, str, currentlyTypingState2, composerState2, bottomSheetState2, launchMode2, networkResponse, articleMetadata2, networkState2, list, list2, finStreamingData2, openMessengerResponse2, i10, i11, floatingIndicatorState2, str2, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationClientState)) {
            return false;
        }
        ConversationClientState conversationClientState = (ConversationClientState) obj;
        return C6496s.c(this.pendingMessages, conversationClientState.pendingMessages) && C6496s.c(this.conversation, conversationClientState.conversation) && C6496s.c(this.conversationId, conversationClientState.conversationId) && C6496s.c(this.currentlyTypingState, conversationClientState.currentlyTypingState) && C6496s.c(this.composerState, conversationClientState.composerState) && C6496s.c(this.bottomSheetState, conversationClientState.bottomSheetState) && this.launchMode == conversationClientState.launchMode && C6496s.c(this.lastNetworkCall, conversationClientState.lastNetworkCall) && C6496s.c(this.articleMetadata, conversationClientState.articleMetadata) && C6496s.c(this.networkState, conversationClientState.networkState) && C6496s.c(this.failedAttributeIdentifiers, conversationClientState.failedAttributeIdentifiers) && C6496s.c(this.loadingAttributeIdentifiers, conversationClientState.loadingAttributeIdentifiers) && C6496s.c(this.finStreamingData, conversationClientState.finStreamingData) && C6496s.c(this.openMessengerResponse, conversationClientState.openMessengerResponse) && this.unreadConversationsCount == conversationClientState.unreadConversationsCount && this.unreadTicketsCount == conversationClientState.unreadTicketsCount && C6496s.c(this.floatingIndicatorState, conversationClientState.floatingIndicatorState) && C6496s.c(this.newMessageId, conversationClientState.newMessageId) && this.isConversationScrolled == conversationClientState.isConversationScrolled && this.dismissedPrivacyNotice == conversationClientState.dismissedPrivacyNotice;
    }

    public final ArticleMetadata getArticleMetadata() {
        return this.articleMetadata;
    }

    public final BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final Conversation getConversation() {
        return this.conversation;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    public final boolean getDismissedPrivacyNotice() {
        return this.dismissedPrivacyNotice;
    }

    public final List<String> getFailedAttributeIdentifiers() {
        return this.failedAttributeIdentifiers;
    }

    public final FinStreamingData getFinStreamingData() {
        return this.finStreamingData;
    }

    public final FloatingIndicatorState getFloatingIndicatorState() {
        return this.floatingIndicatorState;
    }

    public final NetworkResponse<Object> getLastNetworkCall() {
        return this.lastNetworkCall;
    }

    public final LaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final List<String> getLoadingAttributeIdentifiers() {
        return this.loadingAttributeIdentifiers;
    }

    public final NetworkState getNetworkState() {
        return this.networkState;
    }

    public final String getNewMessageId() {
        return this.newMessageId;
    }

    public final OpenMessengerResponse getOpenMessengerResponse() {
        return this.openMessengerResponse;
    }

    public final Map<String, PendingMessage> getPendingMessages() {
        return this.pendingMessages;
    }

    public final int getUnreadConversationsCount() {
        return this.unreadConversationsCount;
    }

    public final int getUnreadTicketsCount() {
        return this.unreadTicketsCount;
    }

    public final boolean hasUserSentAMessage$intercom_sdk_base_release() {
        List<Part> parts;
        boolean z10 = true;
        if (!this.pendingMessages.isEmpty()) {
            return true;
        }
        Conversation conversation2 = this.conversation;
        if (conversation2 == null || (parts = conversation2.parts()) == null) {
            return false;
        }
        Iterable iterable = parts;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Part) it.next()).isUser()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        return z10;
    }

    public int hashCode() {
        int hashCode = this.pendingMessages.hashCode() * 31;
        Conversation conversation2 = this.conversation;
        int i10 = 0;
        int hashCode2 = (hashCode + (conversation2 == null ? 0 : conversation2.hashCode())) * 31;
        String str = this.conversationId;
        int hashCode3 = (((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.currentlyTypingState.hashCode()) * 31) + this.composerState.hashCode()) * 31) + this.bottomSheetState.hashCode()) * 31) + this.launchMode.hashCode()) * 31;
        NetworkResponse<Object> networkResponse = this.lastNetworkCall;
        int hashCode4 = (hashCode3 + (networkResponse == null ? 0 : networkResponse.hashCode())) * 31;
        ArticleMetadata articleMetadata2 = this.articleMetadata;
        int hashCode5 = (((((((((hashCode4 + (articleMetadata2 == null ? 0 : articleMetadata2.hashCode())) * 31) + this.networkState.hashCode()) * 31) + this.failedAttributeIdentifiers.hashCode()) * 31) + this.loadingAttributeIdentifiers.hashCode()) * 31) + this.finStreamingData.hashCode()) * 31;
        OpenMessengerResponse openMessengerResponse2 = this.openMessengerResponse;
        int hashCode6 = (((((((hashCode5 + (openMessengerResponse2 == null ? 0 : openMessengerResponse2.hashCode())) * 31) + Integer.hashCode(this.unreadConversationsCount)) * 31) + Integer.hashCode(this.unreadTicketsCount)) * 31) + this.floatingIndicatorState.hashCode()) * 31;
        String str2 = this.newMessageId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((hashCode6 + i10) * 31) + Boolean.hashCode(this.isConversationScrolled)) * 31) + Boolean.hashCode(this.dismissedPrivacyNotice);
    }

    public final boolean isConversationScrolled() {
        return this.isConversationScrolled;
    }

    public String toString() {
        return "ConversationClientState(pendingMessages=" + this.pendingMessages + ", conversation=" + this.conversation + ", conversationId=" + this.conversationId + ", currentlyTypingState=" + this.currentlyTypingState + ", composerState=" + this.composerState + ", bottomSheetState=" + this.bottomSheetState + ", launchMode=" + this.launchMode + ", lastNetworkCall=" + this.lastNetworkCall + ", articleMetadata=" + this.articleMetadata + ", networkState=" + this.networkState + ", failedAttributeIdentifiers=" + this.failedAttributeIdentifiers + ", loadingAttributeIdentifiers=" + this.loadingAttributeIdentifiers + ", finStreamingData=" + this.finStreamingData + ", openMessengerResponse=" + this.openMessengerResponse + ", unreadConversationsCount=" + this.unreadConversationsCount + ", unreadTicketsCount=" + this.unreadTicketsCount + ", floatingIndicatorState=" + this.floatingIndicatorState + ", newMessageId=" + this.newMessageId + ", isConversationScrolled=" + this.isConversationScrolled + ", dismissedPrivacyNotice=" + this.dismissedPrivacyNotice + ')';
    }

    public ConversationClientState(Map<String, PendingMessage> map, Conversation conversation2, String str, CurrentlyTypingState currentlyTypingState2, ComposerState composerState2, BottomSheetState bottomSheetState2, LaunchMode launchMode2, NetworkResponse<? extends Object> networkResponse, ArticleMetadata articleMetadata2, NetworkState networkState2, List<String> list, List<String> list2, FinStreamingData finStreamingData2, OpenMessengerResponse openMessengerResponse2, int i10, int i11, FloatingIndicatorState floatingIndicatorState2, String str2, boolean z10, boolean z11) {
        CurrentlyTypingState currentlyTypingState3 = currentlyTypingState2;
        ComposerState composerState3 = composerState2;
        BottomSheetState bottomSheetState3 = bottomSheetState2;
        LaunchMode launchMode3 = launchMode2;
        NetworkState networkState3 = networkState2;
        List<String> list3 = list;
        List<String> list4 = list2;
        FinStreamingData finStreamingData3 = finStreamingData2;
        FloatingIndicatorState floatingIndicatorState3 = floatingIndicatorState2;
        C6496s.h(map, "pendingMessages");
        C6496s.h(currentlyTypingState3, "currentlyTypingState");
        C6496s.h(composerState3, "composerState");
        C6496s.h(bottomSheetState3, "bottomSheetState");
        C6496s.h(launchMode3, "launchMode");
        C6496s.h(networkState3, "networkState");
        C6496s.h(list3, "failedAttributeIdentifiers");
        C6496s.h(list4, "loadingAttributeIdentifiers");
        C6496s.h(finStreamingData3, "finStreamingData");
        C6496s.h(floatingIndicatorState3, "floatingIndicatorState");
        this.pendingMessages = map;
        this.conversation = conversation2;
        this.conversationId = str;
        this.currentlyTypingState = currentlyTypingState3;
        this.composerState = composerState3;
        this.bottomSheetState = bottomSheetState3;
        this.launchMode = launchMode3;
        this.lastNetworkCall = networkResponse;
        this.articleMetadata = articleMetadata2;
        this.networkState = networkState3;
        this.failedAttributeIdentifiers = list3;
        this.loadingAttributeIdentifiers = list4;
        this.finStreamingData = finStreamingData3;
        this.openMessengerResponse = openMessengerResponse2;
        this.unreadConversationsCount = i10;
        this.unreadTicketsCount = i11;
        this.floatingIndicatorState = floatingIndicatorState3;
        this.newMessageId = str2;
        this.isConversationScrolled = z10;
        this.dismissedPrivacyNotice = z11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$TextInput} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$TextInput} */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConversationClientState(java.util.Map r22, io.intercom.android.sdk.models.Conversation r23, java.lang.String r24, io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState r25, io.intercom.android.sdk.m5.conversation.states.ComposerState r26, io.intercom.android.sdk.m5.conversation.states.BottomSheetState r27, io.intercom.android.sdk.m5.conversation.states.LaunchMode r28, io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r29, io.intercom.android.sdk.helpcenter.articles.ArticleMetadata r30, io.intercom.android.sdk.m5.conversation.states.NetworkState r31, java.util.List r32, java.util.List r33, io.intercom.android.sdk.m5.conversation.states.FinStreamingData r34, io.intercom.android.sdk.models.OpenMessengerResponse r35, int r36, int r37, io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState r38, java.lang.String r39, boolean r40, boolean r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000b
            java.util.Map r1 = mf.O.i()
            goto L_0x000d
        L_0x000b:
            r1 = r22
        L_0x000d:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0014
            r2 = r3
            goto L_0x0016
        L_0x0014:
            r2 = r23
        L_0x0016:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001c
            r4 = r3
            goto L_0x001e
        L_0x001c:
            r4 = r24
        L_0x001e:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0030
            io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState r5 = new io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState
            io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType r10 = io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType.NONE
            r11 = 7
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0032
        L_0x0030:
            r5 = r25
        L_0x0032:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x004a
            io.intercom.android.sdk.m5.conversation.states.ComposerState$TextInput r6 = new io.intercom.android.sdk.m5.conversation.states.ComposerState$TextInput
            io.intercom.android.sdk.ui.common.StringProvider$StringRes r9 = new io.intercom.android.sdk.ui.common.StringProvider$StringRes
            int r7 = io.intercom.android.sdk.R.string.intercom_reply_to_conversation
            r8 = 2
            r9.<init>(r7, r3, r8, r3)
            r11 = 4
            r12 = 0
            java.lang.String r8 = ""
            r10 = 0
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x004c
        L_0x004a:
            r6 = r26
        L_0x004c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0053
            io.intercom.android.sdk.m5.conversation.states.BottomSheetState$Empty r7 = io.intercom.android.sdk.m5.conversation.states.BottomSheetState.Empty.INSTANCE
            goto L_0x0055
        L_0x0053:
            r7 = r27
        L_0x0055:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x005c
            io.intercom.android.sdk.m5.conversation.states.LaunchMode r8 = io.intercom.android.sdk.m5.conversation.states.LaunchMode.CLASSIC
            goto L_0x005e
        L_0x005c:
            r8 = r28
        L_0x005e:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0064
            r9 = r3
            goto L_0x0066
        L_0x0064:
            r9 = r29
        L_0x0066:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x006c
            r10 = r3
            goto L_0x006e
        L_0x006c:
            r10 = r30
        L_0x006e:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0075
            io.intercom.android.sdk.m5.conversation.states.NetworkState$Connected r11 = io.intercom.android.sdk.m5.conversation.states.NetworkState.Connected.INSTANCE
            goto L_0x0077
        L_0x0075:
            r11 = r31
        L_0x0077:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0080
            java.util.List r12 = mf.C6565s.n()
            goto L_0x0082
        L_0x0080:
            r12 = r32
        L_0x0082:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x008b
            java.util.List r13 = mf.C6565s.n()
            goto L_0x008d
        L_0x008b:
            r13 = r33
        L_0x008d:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            r15 = 0
            if (r14 == 0) goto L_0x00a0
            io.intercom.android.sdk.m5.conversation.states.FinStreamingData r14 = new io.intercom.android.sdk.m5.conversation.states.FinStreamingData
            java.util.List r3 = mf.C6565s.n()
            r43 = r13
            java.lang.String r13 = ""
            r14.<init>(r15, r3, r13, r15)
            goto L_0x00a4
        L_0x00a0:
            r43 = r13
            r14 = r34
        L_0x00a4:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x00aa
            r3 = 0
            goto L_0x00ac
        L_0x00aa:
            r3 = r35
        L_0x00ac:
            r13 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x00b2
            r13 = r15
            goto L_0x00b4
        L_0x00b2:
            r13 = r36
        L_0x00b4:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x00be
            r16 = r15
            goto L_0x00c0
        L_0x00be:
            r16 = r37
        L_0x00c0:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00c9
            io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState$None r17 = io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState.None.INSTANCE
            goto L_0x00cb
        L_0x00c9:
            r17 = r38
        L_0x00cb:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00d4
            r18 = 0
            goto L_0x00d6
        L_0x00d4:
            r18 = r39
        L_0x00d6:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00df
            r19 = r15
            goto L_0x00e1
        L_0x00df:
            r19 = r40
        L_0x00e1:
            r20 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x00e8
            goto L_0x00ea
        L_0x00e8:
            r15 = r41
        L_0x00ea:
            r22 = r21
            r23 = r1
            r24 = r2
            r25 = r4
            r26 = r5
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r33 = r12
            r34 = r43
            r35 = r14
            r36 = r3
            r37 = r13
            r38 = r16
            r39 = r17
            r40 = r18
            r41 = r19
            r42 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.states.ConversationClientState.<init>(java.util.Map, io.intercom.android.sdk.models.Conversation, java.lang.String, io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState, io.intercom.android.sdk.m5.conversation.states.ComposerState, io.intercom.android.sdk.m5.conversation.states.BottomSheetState, io.intercom.android.sdk.m5.conversation.states.LaunchMode, io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse, io.intercom.android.sdk.helpcenter.articles.ArticleMetadata, io.intercom.android.sdk.m5.conversation.states.NetworkState, java.util.List, java.util.List, io.intercom.android.sdk.m5.conversation.states.FinStreamingData, io.intercom.android.sdk.models.OpenMessengerResponse, int, int, io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
