package io.intercom.android.sdk.m5.conversation.ui;

import V.K0;
import android.content.Context;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;
import yf.C6787a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt", f = "ConversationScreen.kt", l = {322, 330}, m = "showNetworkMessage")
final class ConversationScreenKt$showNetworkMessage$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ConversationScreenKt$showNetworkMessage$1(C6658d<? super ConversationScreenKt$showNetworkMessage$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ConversationScreenKt.showNetworkMessage((NetworkState) null, (K0) null, (Context) null, (C6787a) null, this);
    }
}
