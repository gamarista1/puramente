package io.intercom.android.sdk.m5.conversation.data;

import io.intercom.android.nexus.NexusClient;
import yf.C6787a;

public final /* synthetic */ class b implements C6787a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NexusClient f68923a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1 f68924b;

    public /* synthetic */ b(NexusClient nexusClient, NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1 nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1) {
        this.f68923a = nexusClient;
        this.f68924b = nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1;
    }

    public final Object invoke() {
        return NexusEventAsFlowKt$nexusEventAsFlow$1.invokeSuspend$lambda$0(this.f68923a, this.f68924b);
    }
}
