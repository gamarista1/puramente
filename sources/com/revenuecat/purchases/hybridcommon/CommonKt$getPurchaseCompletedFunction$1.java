package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.StoreTransactionMapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6502A;
import lf.C6514M;
import mf.O;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "transaction", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class CommonKt$getPurchaseCompletedFunction$1 extends C6498u implements p {
    final /* synthetic */ OnResult $onResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonKt$getPurchaseCompletedFunction$1(OnResult onResult) {
        super(2);
        this.$onResult = onResult;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return C6514M.f71813a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        C6514M m10;
        C6496s.h(customerInfo, "customerInfo");
        if (storeTransaction != null) {
            this.$onResult.onReceived(O.l(C6502A.a("productIdentifier", storeTransaction.getProductIds().get(0)), C6502A.a("customerInfo", CustomerInfoMapperKt.map(customerInfo)), C6502A.a("transaction", StoreTransactionMapperKt.map(storeTransaction))));
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            this.$onResult.onError(new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Error purchasing. Null transaction returned from a successful non-upgrade purchase.", O.i()));
        }
    }
}
