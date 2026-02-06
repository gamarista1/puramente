package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase", f = "OpenConversationUseCase.kt", l = {24, 40, 44}, m = "invoke")
final class OpenConversationUseCase$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OpenConversationUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OpenConversationUseCase$invoke$1(OpenConversationUseCase openConversationUseCase, C6658d<? super OpenConversationUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = openConversationUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((x) null, (GetConversationReason) null, this);
    }
}
