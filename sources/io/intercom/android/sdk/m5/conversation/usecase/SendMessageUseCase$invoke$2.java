package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase", f = "SendMessageUseCase.kt", l = {87, 115, 139, 144, 162}, m = "invoke")
final class SendMessageUseCase$invoke$2 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendMessageUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SendMessageUseCase$invoke$2(SendMessageUseCase sendMessageUseCase, C6658d<? super SendMessageUseCase$invoke$2> dVar) {
        super(dVar);
        this.this$0 = sendMessageUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((x) null, (List<Block.Builder>) null, (String) null, false, this);
    }
}
