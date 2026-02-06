package io.intercom.android.sdk.m5.conversation;

import Ff.d;
import Ug.G;
import Ug.K;
import Z1.a;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.reducers.ConversationReducer;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.usecase.ChangeInputUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState;
import io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.MarkUserContentAsSeenByAdmin;
import io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RecordOpenedInteractionUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendGifUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.TrackLastReceivedPartsUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.UpdateFloatingIndicatorUseCase;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"io/intercom/android/sdk/m5/conversation/ConversationViewModel$Companion$factory$1", "Landroidx/lifecycle/c0$c;", "Landroidx/lifecycle/a0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/a0;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConversationViewModel$Companion$factory$1 implements c0.c {
    final /* synthetic */ ArticleMetadata $articleMetadata;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ String $initialMessage;
    final /* synthetic */ LaunchMode $launchMode;

    ConversationViewModel$Companion$factory$1(String str, LaunchMode launchMode, ArticleMetadata articleMetadata, String str2) {
        this.$conversationId = str;
        this.$launchMode = launchMode;
        this.$articleMetadata = articleMetadata;
        this.$initialMessage = str2;
    }

    public /* bridge */ /* synthetic */ a0 create(d dVar, a aVar) {
        return super.create(dVar, aVar);
    }

    public /* bridge */ /* synthetic */ a0 create(Class cls, a aVar) {
        return super.create(cls, aVar);
    }

    public <T extends a0> T create(Class<T> cls) {
        C6496s.h(cls, "modelClass");
        return new ConversationViewModel(this.$conversationId, this.$launchMode, this.$articleMetadata, this.$initialMessage, (NetworkConnectivityMonitor) null, (SoundPlayer) null, (K) null, (ConversationRepository) null, (ConversationReducer) null, (TrackLastReceivedPartsUseCase) null, (RecordOpenedInteractionUseCase) null, (SoundEffectsUseCase) null, (SendSuggestionUseCase) null, (RefreshUnreadConversationsCountUseCase) null, (RefreshConversationUseCase) null, (OpenConversationUseCase) null, (SendMessageUseCase) null, (SendQuickReplyUseCase) null, (LoadGifUseCase) null, (ChangeInputUseCase) null, (SendGifUseCase) null, (SendMediaUseCase) null, (UpdateFloatingIndicatorUseCase) null, (GetNetworkState) null, (ShowAdminIsTypingUseCase) null, (SubmitAttributeUseCase) null, (FallbackPollingUseCase) null, (MarkUserContentAsSeenByAdmin) null, (FinStreamingUseCase) null, (G) null, (MetricTracker) null, 2147483632, (DefaultConstructorMarker) null);
    }
}
