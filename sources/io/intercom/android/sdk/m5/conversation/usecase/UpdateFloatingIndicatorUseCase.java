package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.FinStreamingData;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.FooterNotice;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/UpdateFloatingIndicatorUseCase;", "", "<init>", "()V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientState", "Lio/intercom/android/sdk/m5/conversation/usecase/ConversationScrolledState;", "conversationScrolledState", "Llf/M;", "invoke", "(LXg/x;Lio/intercom/android/sdk/m5/conversation/usecase/ConversationScrolledState;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateFloatingIndicatorUseCase {
    public static final int $stable = 0;

    public final void invoke(x xVar, ConversationScrolledState conversationScrolledState) {
        FooterNotice footerNotice;
        Object value;
        Object value2;
        FloatingIndicatorState.JumpToBottomIndicator jumpToBottomIndicator;
        Object value3;
        ConversationClientState conversationClientState;
        List list;
        FloatingIndicatorState.FooterNoticeIndicator footerNoticeIndicator;
        List<Avatar.Builder> avatars;
        x xVar2 = xVar;
        C6496s.h(xVar2, "clientState");
        C6496s.h(conversationScrolledState, "conversationScrolledState");
        boolean scrolled = conversationScrolledState.getScrolled();
        Conversation conversation = ((ConversationClientState) xVar.getValue()).getConversation();
        if (conversation != null) {
            footerNotice = conversation.getFooterNotice();
        } else {
            footerNotice = null;
        }
        if (footerNotice == null || conversationScrolledState.isLandscape() || conversationScrolledState.isLargeFont()) {
            if (scrolled && !(((ConversationClientState) xVar.getValue()).getFloatingIndicatorState() instanceof FloatingIndicatorState.JumpToBottomIndicator)) {
                do {
                    value2 = xVar.getValue();
                    jumpToBottomIndicator = r5;
                    FloatingIndicatorState.JumpToBottomIndicator jumpToBottomIndicator2 = new FloatingIndicatorState.JumpToBottomIndicator(new JumpToBottomButtonState(0, conversationScrolledState.getScrollToPosition(), conversationScrolledState.getLastSeenItemIndex(), 1, (DefaultConstructorMarker) null));
                } while (!xVar2.e(value2, ConversationClientState.copy$default((ConversationClientState) value2, (Map) null, (Conversation) null, (String) null, (CurrentlyTypingState) null, (ComposerState) null, (BottomSheetState) null, (LaunchMode) null, (NetworkResponse) null, (ArticleMetadata) null, (NetworkState) null, (List) null, (List) null, (FinStreamingData) null, (OpenMessengerResponse) null, 0, 0, jumpToBottomIndicator, (String) null, false, false, 983039, (Object) null)));
            }
        } else if (scrolled && !(((ConversationClientState) xVar.getValue()).getFloatingIndicatorState() instanceof FloatingIndicatorState.FooterNoticeIndicator)) {
            do {
                value3 = xVar.getValue();
                conversationClientState = (ConversationClientState) value3;
                String title = footerNotice.getTitle();
                String subtitle = footerNotice.getSubtitle();
                if (subtitle == null) {
                    subtitle = "";
                }
                AvatarDetails avatarDetails = footerNotice.getAvatarDetails();
                if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
                    list = C6565s.n();
                } else {
                    Iterable<Avatar.Builder> iterable = avatars;
                    list = new ArrayList(C6565s.y(iterable, 10));
                    for (Avatar.Builder build : iterable) {
                        Avatar build2 = build.build();
                        C6496s.g(build2, "build(...)");
                        list.add(new AvatarWrapper(build2, false, 2, (DefaultConstructorMarker) null));
                    }
                }
                footerNoticeIndicator = r6;
                FloatingIndicatorState.FooterNoticeIndicator footerNoticeIndicator2 = new FloatingIndicatorState.FooterNoticeIndicator(new FooterNoticeState(title, subtitle, list));
            } while (!xVar2.e(value3, ConversationClientState.copy$default(conversationClientState, (Map) null, (Conversation) null, (String) null, (CurrentlyTypingState) null, (ComposerState) null, (BottomSheetState) null, (LaunchMode) null, (NetworkResponse) null, (ArticleMetadata) null, (NetworkState) null, (List) null, (List) null, (FinStreamingData) null, (OpenMessengerResponse) null, 0, 0, footerNoticeIndicator, (String) null, false, false, 983039, (Object) null)));
        }
        if (!scrolled && !(((ConversationClientState) xVar.getValue()).getFloatingIndicatorState() instanceof FloatingIndicatorState.None)) {
            do {
                value = xVar.getValue();
            } while (!xVar2.e(value, ConversationClientState.copy$default((ConversationClientState) value, (Map) null, (Conversation) null, (String) null, (CurrentlyTypingState) null, (ComposerState) null, (BottomSheetState) null, (LaunchMode) null, (NetworkResponse) null, (ArticleMetadata) null, (NetworkState) null, (List) null, (List) null, (FinStreamingData) null, (OpenMessengerResponse) null, 0, 0, FloatingIndicatorState.None.INSTANCE, (String) null, false, false, 983039, (Object) null)));
        }
    }
}
