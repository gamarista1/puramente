package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.C5694f;
import Xg.C5696h;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/GetNetworkState;", "", "Lio/intercom/android/sdk/utilities/connectivity/NetworkConnectivityMonitor;", "networkConnectivityMonitor", "<init>", "(Lio/intercom/android/sdk/utilities/connectivity/NetworkConnectivityMonitor;)V", "LXg/f;", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "invoke", "()LXg/f;", "Lio/intercom/android/sdk/utilities/connectivity/NetworkConnectivityMonitor;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetNetworkState {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public final NetworkConnectivityMonitor networkConnectivityMonitor;

    public GetNetworkState(NetworkConnectivityMonitor networkConnectivityMonitor2) {
        C6496s.h(networkConnectivityMonitor2, "networkConnectivityMonitor");
        this.networkConnectivityMonitor = networkConnectivityMonitor2;
    }

    public final C5694f invoke() {
        return C5696h.e(new GetNetworkState$invoke$1(this, (C6658d<? super GetNetworkState$invoke$1>) null));
    }
}
