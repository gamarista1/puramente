package io.intercom.android.sdk.m5.conversation.reducers;

import Sg.p;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.BotIntro;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.FooterNotice;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6787a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/reducers/ConversationReducer;", "", "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/AppConfig;", "config", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "timeProvider", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "<init>", "(Lyf/a;Lyf/a;Lio/intercom/android/sdk/utilities/commons/TimeProvider;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientState", "", "isBotIntroEmpty", "(Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;)Z", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "Lio/intercom/android/sdk/models/Part;", "toArticlePart", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;)Lio/intercom/android/sdk/models/Part;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "computeUiState$intercom_sdk_base_release", "(Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;)Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "computeUiState", "Lyf/a;", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConversationReducer {
    public static final int $stable = 8;
    private final C6787a config;
    private final IntercomDataLayer intercomDataLayer;
    private final TimeProvider timeProvider;
    private final C6787a userIdentity;

    public ConversationReducer() {
        this((C6787a) null, (C6787a) null, (TimeProvider) null, (IntercomDataLayer) null, 15, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getAppConfigProvider().get();
    }

    /* access modifiers changed from: private */
    public static final UserIdentity _init_$lambda$1() {
        return Injector.get().getUserIdentity();
    }

    private final boolean isBotIntroEmpty(ConversationClientState conversationClientState) {
        List<Part.Builder> list;
        ComposerSuggestions composerSuggestions;
        OpenMessengerResponse.NewConversationData newConversationData;
        if (((BotIntro) this.intercomDataLayer.getBotIntro().getValue()).getBlocks().isEmpty()) {
            OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
            List<ComposerSuggestions.Suggestion> list2 = null;
            if (openMessengerResponse == null || (newConversationData = openMessengerResponse.getNewConversationData()) == null) {
                list = null;
            } else {
                list = newConversationData.getParts();
            }
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
                if (!(openMessengerResponse2 == null || (composerSuggestions = openMessengerResponse2.getComposerSuggestions()) == null)) {
                    list2 = composerSuggestions.getSuggestions();
                }
                Collection collection2 = list2;
                if (collection2 == null || collection2.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final Part toArticlePart(ArticleMetadata articleMetadata) {
        Part build = new Part.Builder().withIsInitialMessage(Boolean.TRUE).withBlocks(C6565s.e(new Block.Builder().withArticleId(articleMetadata.getId()).withTitle(articleMetadata.getTitle()))).build();
        C6496s.g(build, "build(...)");
        return build;
    }

    public final ConversationUiState computeUiState$intercom_sdk_base_release(ConversationClientState conversationClientState) {
        List<Part> list;
        FooterNotice footerNotice;
        List list2;
        List<Avatar.Builder> avatars;
        ActiveBot activeBot;
        StreamingPart streamingPart;
        List<Part> parts;
        OpenMessengerResponse openMessengerResponse;
        ComposerSuggestions composerSuggestions;
        ContentRow reduceComposerSuggestions;
        OpenMessengerResponse.NewConversationData newConversationData;
        ConversationClientState conversationClientState2 = conversationClientState;
        C6496s.h(conversationClientState2, "clientState");
        Conversation conversation = conversationClientState.getConversation();
        String conversationId = conversationClientState.getConversationId();
        NetworkResponse<Object> lastNetworkCall = conversationClientState.getLastNetworkCall();
        boolean z10 = true;
        boolean z11 = conversation == null && conversationId != null;
        boolean z12 = conversation == null && conversationId == null;
        boolean z13 = z12 && (conversationClientState.getArticleMetadata() != null) && isBotIntroEmpty(conversationClientState);
        boolean z14 = z12 && conversationClientState.getOpenMessengerResponse() == null;
        TeamPresenceState reduceTeamPresenceState = TeamPresenceReducerKt.reduceTeamPresenceState(conversationClientState.getConversation(), conversationClientState.getOpenMessengerResponse());
        boolean z15 = !conversationClientState.getPendingMessages().isEmpty();
        Conversation conversation2 = conversationClientState.getConversation();
        OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
        TopAppBarUiState reduceTopAppBarUiState = HeaderReducerKt.reduceTopAppBarUiState(z12, z15, conversation2, (openMessengerResponse2 == null || (newConversationData = openMessengerResponse2.getNewConversationData()) == null) ? null : newConversationData.getHeader(), (AppConfig) this.config.invoke(), conversationClientState.getUnreadConversationsCount(), conversationClientState.getUnreadTicketsCount(), conversationClientState.getLaunchMode());
        if (z11 && lastNetworkCall != null && !(lastNetworkCall instanceof NetworkResponse.Success)) {
            return ErrorReducerKt.reduceError(lastNetworkCall, reduceTopAppBarUiState);
        }
        if (z11 || z14) {
            return LoadingStateReducerKt.reduceLoadingState(reduceTopAppBarUiState);
        }
        NetworkState networkState = conversationClientState.getNetworkState();
        BottomSheetState bottomSheetState = conversationClientState.getBottomSheetState();
        BottomBarUiState reduceComposerState = ComposerStateReducerKt.reduceComposerState(conversationClientState2, (AppConfig) this.config.invoke(), z12);
        List c10 = C6565s.c();
        if (!p.d0(reduceTeamPresenceState.getTeamIntro())) {
            c10.add(new ContentRow.TeamIntroRow(reduceTeamPresenceState.getTeamIntro()));
        }
        if (!p.d0(reduceTeamPresenceState.getSpecialNotice())) {
            c10.add(new ContentRow.SpecialNoticeRow(reduceTeamPresenceState.getSpecialNotice()));
        }
        if (z13 && conversationClientState.getArticleMetadata() != null) {
            c10.add(new ContentRow.AskedAboutRow(toArticlePart(conversationClientState.getArticleMetadata())));
        }
        if (z12) {
            c10.addAll(IntroPartsReducerKt.reduceIntroParts(conversationClientState2, (BotIntro) this.intercomDataLayer.getBotIntro().getValue(), this.timeProvider));
        }
        c10.addAll(ConversationPartsReducerKt.reduceMessages(conversationClientState2, (UserIdentity) this.userIdentity.invoke(), (AppConfig) this.config.invoke()));
        if (!(!z12 || !conversationClientState.getPendingMessages().isEmpty() || (openMessengerResponse = conversationClientState.getOpenMessengerResponse()) == null || (composerSuggestions = openMessengerResponse.getComposerSuggestions()) == null || (reduceComposerSuggestions = ComposerSuggestionsReducerKt.reduceComposerSuggestions(composerSuggestions)) == null)) {
            c10.add(reduceComposerSuggestions);
        }
        Conversation conversation3 = conversationClientState.getConversation();
        if (conversation3 == null || (list = conversation3.parts()) == null) {
            list = C6565s.n();
        }
        Collection collection = list;
        Iterable<PendingMessage> values = conversationClientState.getPendingMessages().values();
        ArrayList arrayList = new ArrayList(C6565s.y(values, 10));
        for (PendingMessage part : values) {
            arrayList.add(part.getPart());
        }
        List K02 = C6565s.K0(collection, arrayList);
        Conversation conversation4 = conversationClientState.getConversation();
        int size = (conversation4 == null || (parts = conversation4.parts()) == null) ? 0 : parts.size();
        int i10 = 0;
        for (Object next : conversationClientState.getPendingMessages().values()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            PendingMessage pendingMessage = (PendingMessage) next;
            c10.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(pendingMessage.getPart(), i10 == conversationClientState.getPendingMessages().size() - 1, ConversationPartsReducerKt.isAdminOrAltParticipant(pendingMessage.getPart(), (UserIdentity) this.userIdentity.invoke()), (List) null, (List) null, 24, (DefaultConstructorMarker) null), ConversationPartsReducerKt.getGroupingPosition(K02, size + i10), pendingMessage.getFailedImageUploadData(), pendingMessage.isFailed(), true));
            i10 = i11;
        }
        if (conversation != null) {
            Iterable parts2 = conversation.parts();
            if (!(parts2 instanceof Collection) || !((Collection) parts2).isEmpty()) {
                Iterator it = parts2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Part part2 = (Part) it.next();
                    String uuid = part2.getUuid();
                    C6496s.g(uuid, "getUuid(...)");
                    if (!p.d0(uuid) && C6496s.c(part2.getUuid(), conversationClientState.getFinStreamingData().getClientAssignedUUID())) {
                        break;
                    }
                }
            }
            z10 = false;
            if (conversationClientState.getFinStreamingData().isFinStreaming() && !z10 && (activeBot = ((TeamPresence) this.intercomDataLayer.getTeamPresence().getValue()).getActiveBot()) != null && (streamingPart = activeBot.getStreamingPart()) != null) {
                c10.add(new ContentRow.FinStreamingRow(conversationClientState.getFinStreamingData().getBlocks(), streamingPart));
            }
        }
        if (conversationClientState.getCurrentlyTypingState().getUserType() != TypingIndicatorType.NONE) {
            c10.add(new ContentRow.TypingIndicatorRow(conversationClientState.getCurrentlyTypingState()));
        }
        if (!(conversation == null || (footerNotice = conversation.getFooterNotice()) == null)) {
            String title = footerNotice.getTitle();
            String subtitle = footerNotice.getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            AvatarDetails avatarDetails = footerNotice.getAvatarDetails();
            if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
                list2 = C6565s.n();
            } else {
                Iterable<Avatar.Builder> iterable = avatars;
                list2 = new ArrayList(C6565s.y(iterable, 10));
                for (Avatar.Builder build : iterable) {
                    Avatar build2 = build.build();
                    C6496s.g(build2, "build(...)");
                    list2.add(new AvatarWrapper(build2, false, 2, (DefaultConstructorMarker) null));
                }
            }
            c10.add(new ContentRow.FooterNoticeRow(new FooterNoticeState(title, subtitle, list2)));
        }
        return new ConversationUiState.Content(reduceTopAppBarUiState, C6565s.a(c10), reduceComposerState, networkState, bottomSheetState, conversationClientState.getFloatingIndicatorState(), reduceTeamPresenceState);
    }

    public ConversationReducer(C6787a aVar, C6787a aVar2, TimeProvider timeProvider2, IntercomDataLayer intercomDataLayer2) {
        C6496s.h(aVar, "config");
        C6496s.h(aVar2, "userIdentity");
        C6496s.h(timeProvider2, "timeProvider");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        this.config = aVar;
        this.userIdentity = aVar2;
        this.timeProvider = timeProvider2;
        this.intercomDataLayer = intercomDataLayer2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConversationReducer(yf.C6787a r1, yf.C6787a r2, io.intercom.android.sdk.utilities.commons.TimeProvider r3, io.intercom.android.sdk.m5.data.IntercomDataLayer r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0009
            Me.a r1 = new Me.a
            r1.<init>()
        L_0x0009:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x0012
            Me.b r2 = new Me.b
            r2.<init>()
        L_0x0012:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0018
            io.intercom.android.sdk.utilities.commons.TimeProvider r3 = io.intercom.android.sdk.utilities.commons.TimeProvider.SYSTEM
        L_0x0018:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0024
            io.intercom.android.sdk.Injector r4 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.m5.data.IntercomDataLayer r4 = r4.getDataLayer()
        L_0x0024:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.reducers.ConversationReducer.<init>(yf.a, yf.a, io.intercom.android.sdk.utilities.commons.TimeProvider, io.intercom.android.sdk.m5.data.IntercomDataLayer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
