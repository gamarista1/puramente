package io.intercom.android.sdk.m5.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.data.CommonRepository", f = "CommonRepository.kt", l = {17}, m = "openMessenger")
final class CommonRepository$openMessenger$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonRepository$openMessenger$1(CommonRepository commonRepository, C6658d<? super CommonRepository$openMessenger$1> dVar) {
        super(dVar);
        this.this$0 = commonRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.openMessenger(this);
    }
}
