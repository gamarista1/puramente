package io.intercom.android.sdk.m5.conversation.usecase;

import Wg.r;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWg/r;", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "Llf/M;", "<anonymous>", "(LWg/r;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1", f = "GetNetworkState.kt", l = {24}, m = "invokeSuspend")
final class GetNetworkState$invoke$1 extends l implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GetNetworkState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetNetworkState$invoke$1(GetNetworkState getNetworkState, C6658d<? super GetNetworkState$invoke$1> dVar) {
        super(2, dVar);
        this.this$0 = getNetworkState;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$0(GetNetworkState getNetworkState) {
        getNetworkState.networkConnectivityMonitor.setListener((NetworkConnectivityMonitor.ConnectivityEventListener) null);
        return C6514M.f71813a;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        GetNetworkState$invoke$1 getNetworkState$invoke$1 = new GetNetworkState$invoke$1(this.this$0, dVar);
        getNetworkState$invoke$1.L$0 = obj;
        return getNetworkState$invoke$1;
    }

    public final Object invoke(r rVar, C6658d<? super C6514M> dVar) {
        return ((GetNetworkState$invoke$1) create(rVar, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            final r rVar = (r) this.L$0;
            this.this$0.networkConnectivityMonitor.setListener(new NetworkConnectivityMonitor.ConnectivityEventListener() {
                public void onDisconnect() {
                    rVar.c(NetworkState.Disconnected.INSTANCE);
                }

                public void onReconnect() {
                    rVar.c(NetworkState.Reconnected.INSTANCE);
                }
            });
            b bVar = new b(this.this$0);
            this.label = 1;
            if (Wg.p.a(rVar, bVar, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C6514M.f71813a;
    }
}
