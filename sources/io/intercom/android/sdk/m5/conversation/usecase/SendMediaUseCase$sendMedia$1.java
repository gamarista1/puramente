package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.w;
import Xg.x;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase", f = "SendMediaUseCase.kt", l = {111, 120, 123, 173}, m = "sendMedia")
final class SendMediaUseCase$sendMedia$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendMediaUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SendMediaUseCase$sendMedia$1(SendMediaUseCase sendMediaUseCase, C6658d<? super SendMediaUseCase$sendMedia$1> dVar) {
        super(dVar);
        this.this$0 = sendMediaUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendMedia((x) null, (w) null, (MediaData.Media) null, (String) null, this);
    }
}
