package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ComposerState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationEndedButton;
import io.intercom.android.sdk.models.ConversationUiFlags;
import io.intercom.android.sdk.models.FooterNotice;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6787a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase;", "", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "<init>", "(Lio/intercom/android/sdk/metrics/MetricTracker;Lyf/a;)V", "Lio/intercom/android/sdk/models/Conversation;", "newConversation", "Llf/M;", "invoke", "(Lio/intercom/android/sdk/models/Conversation;)V", "Lio/intercom/android/sdk/metrics/MetricTracker;", "Lyf/a;", "currentConversation", "Lio/intercom/android/sdk/models/Conversation;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackLastReceivedPartsUseCase {
    public static final int $stable = 8;
    private Conversation currentConversation;
    private final MetricTracker metricTracker;
    private final C6787a userIdentity;

    public TrackLastReceivedPartsUseCase() {
        this((MetricTracker) null, (C6787a) null, 3, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final UserIdentity _init_$lambda$0() {
        return Injector.get().getUserIdentity();
    }

    public final synchronized void invoke(Conversation conversation) {
        List<Part> list;
        try {
            C6496s.h(conversation, "newConversation");
            int size = this.currentConversation.parts().size();
            int size2 = conversation.parts().size();
            if (size == 0 && this.currentConversation.getTicket() == null) {
                if (conversation.isRead() || !conversation.lastPart().isReply()) {
                    list = C6565s.n();
                } else {
                    list = C6565s.e(conversation.lastPart());
                }
            } else if (size2 > size) {
                list = conversation.parts().subList(size, size2);
            } else {
                list = C6565s.n();
            }
            ArrayList<Part> arrayList = new ArrayList<>();
            for (Object next : list) {
                Part part = (Part) next;
                if (part.isAdmin() || (!part.getParticipant().isUserWithId(((UserIdentity) this.userIdentity.invoke()).getIntercomId()) && !C6496s.c(part, Part.NULL))) {
                    arrayList.add(next);
                }
            }
            for (Part part2 : arrayList) {
                this.metricTracker.receivedReply(part2.hasAttachments(), PartExtensionsKt.isLinkCard(part2), part2.getId(), conversation.getId());
                if (C6496s.c(part2.getId(), ((Part) C6565s.z0(list)).getId())) {
                    List<ReplyOption> replyOptions = part2.getReplyOptions();
                    C6496s.g(replyOptions, "getReplyOptions(...)");
                    for (ReplyOption uuid : replyOptions) {
                        this.metricTracker.receivedQuickReply(uuid.getUuid(), conversation.getId(), part2.getId());
                    }
                }
            }
            this.currentConversation = conversation;
        } finally {
            while (true) {
            }
        }
    }

    public TrackLastReceivedPartsUseCase(MetricTracker metricTracker2, C6787a aVar) {
        MetricTracker metricTracker3 = metricTracker2;
        C6787a aVar2 = aVar;
        C6496s.h(metricTracker3, "metricTracker");
        C6496s.h(aVar2, "userIdentity");
        this.metricTracker = metricTracker3;
        this.userIdentity = aVar2;
        this.currentConversation = new Conversation((String) null, false, (List) null, (List) null, (List) null, (LastParticipatingAdmin.Builder) null, (ComposerState) null, false, false, (String) null, (String) null, false, (Ticket) null, (ConversationUiFlags) null, (Header) null, (ConversationEndedButton) null, (FooterNotice) null, (PoweredBy) null, (String) null, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TrackLastReceivedPartsUseCase(io.intercom.android.sdk.metrics.MetricTracker r1, yf.C6787a r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L_0x000c
            io.intercom.android.sdk.Injector r1 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.metrics.MetricTracker r1 = r1.getMetricTracker()
        L_0x000c:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0015
            io.intercom.android.sdk.m5.conversation.usecase.d r2 = new io.intercom.android.sdk.m5.conversation.usecase.d
            r2.<init>()
        L_0x0015:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.TrackLastReceivedPartsUseCase.<init>(io.intercom.android.sdk.metrics.MetricTracker, yf.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
