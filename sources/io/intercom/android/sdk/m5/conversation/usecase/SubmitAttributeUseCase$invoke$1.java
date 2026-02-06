package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.models.Attribute;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase", f = "SubmitAttributeUseCase.kt", l = {27}, m = "invoke")
final class SubmitAttributeUseCase$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubmitAttributeUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubmitAttributeUseCase$invoke$1(SubmitAttributeUseCase submitAttributeUseCase, C6658d<? super SubmitAttributeUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = submitAttributeUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((x) null, (Attribute) null, (String) null, this);
    }
}
