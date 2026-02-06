package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase", f = "FinStreamingUseCase.kt", l = {17}, m = "invoke")
final class FinStreamingUseCase$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinStreamingUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FinStreamingUseCase$invoke$1(FinStreamingUseCase finStreamingUseCase, C6658d<? super FinStreamingUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = finStreamingUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((x) null, (ParsedNexusEvent.ConversationNexusEvent.FinStreaming) null, this);
    }
}
