package io.intercom.android.sdk.m5.conversation.data;

import Wg.r;
import Wg.u;
import android.util.Log;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"io/intercom/android/sdk/m5/conversation/data/NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1", "Lio/intercom/android/nexus/NexusListener;", "Lio/intercom/android/nexus/NexusEvent;", "nexusEvent", "Llf/M;", "notifyEvent", "(Lio/intercom/android/nexus/NexusEvent;)V", "onConnect", "()V", "onConnectFailed", "onShutdown", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1 implements NexusListener {
    final /* synthetic */ r $$this$callbackFlow;

    NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1(r rVar) {
        this.$$this$callbackFlow = rVar;
    }

    public void notifyEvent(NexusEvent nexusEvent) {
        C6496s.h(nexusEvent, "nexusEvent");
        Log.d("nexus", "notifyEvent " + nexusEvent.getEventType() + ": " + nexusEvent.getEventData());
        this.$$this$callbackFlow.c(NexusEventAsFlowKt.asNexusData(nexusEvent));
    }

    public void onConnect() {
        Log.d("nexus", "onConnect");
        this.$$this$callbackFlow.c(ParsedNexusEvent.NexusConnected.INSTANCE);
    }

    public void onConnectFailed() {
        Log.d("nexus", "onConnectFailed");
    }

    public void onShutdown() {
        Log.d("nexus", "onShutdown");
        u.a.a(this.$$this$callbackFlow.t(), (Throwable) null, 1, (Object) null);
    }
}
