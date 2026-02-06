package io.intercom.android.sdk.m5.inbox.data;

import Xg.C5694f;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ConversationsResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;
import qf.C6658d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;", "", "Lio/intercom/android/sdk/api/MessengerApi;", "api", "Lio/intercom/android/nexus/NexusClient;", "nexusClient", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/nexus/NexusClient;)V", "LXg/f;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "realTimeEvents", "()LXg/f;", "", "before", "", "pageSize", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/ConversationsResponse$Builder;", "getConversations", "(Ljava/lang/Long;ILqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/api/MessengerApi;", "Lio/intercom/android/nexus/NexusClient;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InboxRepository {
    public static final int $stable = 8;
    private final MessengerApi api;
    private final NexusClient nexusClient;

    public InboxRepository() {
        this((MessengerApi) null, (NexusClient) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object getConversations$default(InboxRepository inboxRepository, Long l10, int i10, C6658d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l10 = null;
        }
        if ((i11 & 2) != 0) {
            i10 = 20;
        }
        return inboxRepository.getConversations(l10, i10, dVar);
    }

    public final Object getConversations(Long l10, int i10, C6658d<? super NetworkResponse<ConversationsResponse.Builder>> dVar) {
        Map map;
        MessengerApi messengerApi = this.api;
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        if (l10 == null) {
            map = O.f(C6502A.a("per_page", b.c(i10)));
        } else {
            map = O.l(C6502A.a("per_page", b.c(i10)), C6502A.a("before", l10));
        }
        return messengerApi.getConversationsSuspend(messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(map), dVar);
    }

    public final C5694f realTimeEvents() {
        return NexusEventAsFlowKt.nexusEventAsFlow(this.nexusClient);
    }

    public InboxRepository(MessengerApi messengerApi, NexusClient nexusClient2) {
        C6496s.h(messengerApi, MetricTracker.Place.API);
        C6496s.h(nexusClient2, "nexusClient");
        this.api = messengerApi;
        this.nexusClient = nexusClient2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InboxRepository(MessengerApi messengerApi, NexusClient nexusClient2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i10 & 2) != 0 ? Injector.get().getNexusClient() : nexusClient2);
    }
}
