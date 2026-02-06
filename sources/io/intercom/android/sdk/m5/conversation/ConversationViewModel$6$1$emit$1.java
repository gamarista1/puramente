package io.intercom.android.sdk.m5.conversation;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import lf.C6514M;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1", f = "ConversationViewModel.kt", l = {294}, m = "emit")
final class ConversationViewModel$6$1$emit$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationViewModel.AnonymousClass6.AnonymousClass1<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationViewModel$6$1$emit$1(ConversationViewModel.AnonymousClass6.AnonymousClass1<? super T> r12, C6658d<? super ConversationViewModel$6$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = r12;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((NetworkState) null, (C6658d<? super C6514M>) this);
    }
}
