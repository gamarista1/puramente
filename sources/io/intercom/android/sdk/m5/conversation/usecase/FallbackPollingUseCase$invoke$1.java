package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase", f = "FallbackPollingUseCase.kt", l = {32, 38}, m = "invoke")
final class FallbackPollingUseCase$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FallbackPollingUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FallbackPollingUseCase$invoke$1(FallbackPollingUseCase fallbackPollingUseCase, C6658d<? super FallbackPollingUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = fallbackPollingUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((x) null, this);
    }
}
