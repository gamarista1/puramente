package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase", f = "SendSuggestionUseCase.kt", l = {58}, m = "invoke")
final class SendSuggestionUseCase$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendSuggestionUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SendSuggestionUseCase$invoke$1(SendSuggestionUseCase sendSuggestionUseCase, C6658d<? super SendSuggestionUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = sendSuggestionUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((x) null, (ReplySuggestion) null, this);
    }
}
