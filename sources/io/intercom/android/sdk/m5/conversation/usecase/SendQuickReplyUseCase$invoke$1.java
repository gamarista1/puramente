package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase", f = "SendQuickReplyUseCase.kt", l = {37, 54}, m = "invoke")
final class SendQuickReplyUseCase$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendQuickReplyUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SendQuickReplyUseCase$invoke$1(SendQuickReplyUseCase sendQuickReplyUseCase, C6658d<? super SendQuickReplyUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = sendQuickReplyUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((x) null, (ReplyOption) null, (Part) null, this);
    }
}
