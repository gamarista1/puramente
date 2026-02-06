package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SyncPurchasesHelper$syncPurchases$2 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SyncPurchasesHelper$syncPurchases$2(C6798l lVar) {
        super(1);
        this.$onError = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        C6496s.h(purchasesError, "it");
        LogIntent logIntent = LogIntent.RC_ERROR;
        String format = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{purchasesError}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.$onError.invoke(purchasesError);
    }
}
