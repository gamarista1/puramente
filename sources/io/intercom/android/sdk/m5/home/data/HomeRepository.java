package io.intercom.android.sdk.m5.home.data;

import Xg.C5694f;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.C6658d;
import rh.D;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeRepository;", "", "Lio/intercom/android/sdk/api/MessengerApi;", "messengerApi", "Lio/intercom/android/nexus/NexusClient;", "nexusClient", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/nexus/NexusClient;)V", "LXg/f;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "realTimeEvents", "()LXg/f;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/m5/home/data/HomeV2Response;", "getHomeCards", "(Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/api/MessengerApi;", "Lio/intercom/android/nexus/NexusClient;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeRepository {
    public static final int $stable = 8;
    private final MessengerApi messengerApi;
    private final NexusClient nexusClient;

    public HomeRepository() {
        this((MessengerApi) null, (NexusClient) null, 3, (DefaultConstructorMarker) null);
    }

    public final Object getHomeCards(C6658d<? super NetworkResponse<HomeV2Response>> dVar) {
        return MessengerApi.DefaultImpls.getHomeCardsV2Suspend$default(this.messengerApi, (D) null, dVar, 1, (Object) null);
    }

    public final C5694f realTimeEvents() {
        return NexusEventAsFlowKt.nexusEventAsFlow(this.nexusClient);
    }

    public HomeRepository(MessengerApi messengerApi2, NexusClient nexusClient2) {
        C6496s.h(messengerApi2, "messengerApi");
        C6496s.h(nexusClient2, "nexusClient");
        this.messengerApi = messengerApi2;
        this.nexusClient = nexusClient2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeRepository(MessengerApi messengerApi2, NexusClient nexusClient2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi2, (i10 & 2) != 0 ? Injector.get().getNexusClient() : nexusClient2);
    }
}
