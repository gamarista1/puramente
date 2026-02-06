package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase", f = "RefreshConversationUseCase.kt", l = {34, 85}, m = "invoke")
final class RefreshConversationUseCase$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RefreshConversationUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RefreshConversationUseCase$invoke$1(RefreshConversationUseCase refreshConversationUseCase, C6658d<? super RefreshConversationUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = refreshConversationUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((x) null, (GetConversationReason) null, this);
    }
}
