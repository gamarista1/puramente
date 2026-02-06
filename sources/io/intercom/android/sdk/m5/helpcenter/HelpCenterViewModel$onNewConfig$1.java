package io.intercom.android.sdk.m5.helpcenter;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel", f = "HelpCenterViewModel.kt", l = {371, 379}, m = "onNewConfig")
final class HelpCenterViewModel$onNewConfig$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HelpCenterViewModel$onNewConfig$1(HelpCenterViewModel helpCenterViewModel, C6658d<? super HelpCenterViewModel$onNewConfig$1> dVar) {
        super(dVar);
        this.this$0 = helpCenterViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onNewConfig(this);
    }
}
