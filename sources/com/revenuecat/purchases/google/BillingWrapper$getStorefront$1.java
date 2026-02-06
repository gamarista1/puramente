package com.revenuecat.purchases.google;

import com.android.billingclient.api.C3196c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/android/billingclient/api/c;", "billingConfig", "Llf/M;", "invoke", "(Lcom/android/billingclient/api/c;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$getStorefront$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onSuccess;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BillingWrapper$getStorefront$1(C6798l lVar) {
        super(1);
        this.$onSuccess = lVar;
    }

    public final void invoke(C3196c cVar) {
        C6496s.h(cVar, "billingConfig");
        C6798l lVar = this.$onSuccess;
        String a10 = cVar.a();
        C6496s.g(a10, "billingConfig.countryCode");
        lVar.invoke(a10);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C3196c) obj);
        return C6514M.f71813a;
    }
}
