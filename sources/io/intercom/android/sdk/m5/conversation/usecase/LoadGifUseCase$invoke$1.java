package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase", f = "LoadGifUseCase.kt", l = {17}, m = "invoke")
final class LoadGifUseCase$invoke$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoadGifUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoadGifUseCase$invoke$1(LoadGifUseCase loadGifUseCase, C6658d<? super LoadGifUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = loadGifUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((x) null, (String) null, this);
    }
}
