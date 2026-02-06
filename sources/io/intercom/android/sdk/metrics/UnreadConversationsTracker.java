package io.intercom.android.sdk.metrics;

import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/metrics/UnreadConversationsTracker;", "", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "trackerProvider", "<init>", "(Lio/intercom/android/sdk/Provider;)V", "Lio/intercom/android/sdk/models/Part;", "part", "", "conversationId", "Llf/M;", "trackReceivedPart", "(Lio/intercom/android/sdk/models/Part;Ljava/lang/String;)V", "Lio/intercom/android/sdk/models/UsersResponse;", "response", "track", "(Lio/intercom/android/sdk/models/UsersResponse;)V", "clear", "()V", "Lio/intercom/android/sdk/Provider;", "", "trackedPartIds", "Ljava/util/Set;", "getTracker", "()Lio/intercom/android/sdk/metrics/MetricTracker;", "tracker", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnreadConversationsTracker {
    public static final int $stable = 8;
    private final Set<String> trackedPartIds = new LinkedHashSet();
    private final Provider<MetricTracker> trackerProvider;

    public UnreadConversationsTracker(Provider<MetricTracker> provider) {
        C6496s.h(provider, "trackerProvider");
        this.trackerProvider = provider;
    }

    private final MetricTracker getTracker() {
        MetricTracker metricTracker = this.trackerProvider.get();
        C6496s.g(metricTracker, "get(...)");
        return metricTracker;
    }

    private final void trackReceivedPart(Part part, String str) {
        boolean hasAttachments = part.hasAttachments();
        boolean isLinkCard = PartExtensionsKt.isLinkCard(part);
        String id2 = part.getId();
        MessageStyle messageStyle = part.getMessageStyle();
        if (DeliveryOption.SUMMARY != part.getDeliveryOption()) {
            getTracker().receivedMessageFromFullWhenClosed(hasAttachments, isLinkCard, str, id2, messageStyle);
        } else if (part.isInitialMessage()) {
            getTracker().receivedMessageFromSnippetWhenClosed(hasAttachments, isLinkCard, str, id2, messageStyle);
        } else {
            getTracker().receivedReplyFromSnippetWhenClosed(hasAttachments, isLinkCard, str, id2);
        }
    }

    public final void clear() {
        this.trackedPartIds.clear();
    }

    public final void track(UsersResponse usersResponse) {
        C6496s.h(usersResponse, "response");
        List<Conversation> conversations = usersResponse.getUnreadConversations().getConversations();
        C6496s.e(conversations);
        for (Conversation conversation : conversations) {
            Part lastPart = conversation.lastPart();
            if (!this.trackedPartIds.contains(lastPart.getId())) {
                Set<String> set = this.trackedPartIds;
                String id2 = lastPart.getId();
                C6496s.g(id2, "getId(...)");
                set.add(id2);
                trackReceivedPart(lastPart, conversation.getId());
            }
        }
    }
}
