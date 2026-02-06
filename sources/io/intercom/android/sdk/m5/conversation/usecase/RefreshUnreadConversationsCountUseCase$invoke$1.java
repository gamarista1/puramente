package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase", f = "RefreshUnreadConversationsCountUseCase.kt", l = {21}, m = "invoke")
final class RefreshUnreadConversationsCountUseCase$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RefreshUnreadConversationsCountUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RefreshUnreadConversationsCountUseCase$invoke$1(RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, C6658d<? super RefreshUnreadConversationsCountUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = refreshUnreadConversationsCountUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((x) null, this);
    }
}
