package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import qf.C6658d;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CoroutinesExtensionsKt$awaitLogOut$2$2 extends C6498u implements C6798l {
    final /* synthetic */ C6658d<CustomerInfo> $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutinesExtensionsKt$awaitLogOut$2$2(C6658d<? super CustomerInfo> dVar) {
        super(1);
        this.$continuation = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return C6514M.f71813a;
    }

    public final void invoke(CustomerInfo customerInfo) {
        C6496s.h(customerInfo, "it");
        this.$continuation.resumeWith(v.b(customerInfo));
    }
}
