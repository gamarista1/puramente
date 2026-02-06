package com.revenuecat.purchases;

import com.revenuecat.purchases.data.LogInResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import qf.C6658d;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CoroutinesExtensionsKt$awaitLogIn$2$2 extends C6498u implements p {
    final /* synthetic */ C6658d<LogInResult> $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutinesExtensionsKt$awaitLogIn$2$2(C6658d<? super LogInResult> dVar) {
        super(2);
        this.$continuation = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
        return C6514M.f71813a;
    }

    public final void invoke(CustomerInfo customerInfo, boolean z10) {
        C6496s.h(customerInfo, "customerInfo");
        C6658d<LogInResult> dVar = this.$continuation;
        v.a aVar = v.f71841b;
        dVar.resumeWith(v.b(new LogInResult(customerInfo, z10)));
    }
}
