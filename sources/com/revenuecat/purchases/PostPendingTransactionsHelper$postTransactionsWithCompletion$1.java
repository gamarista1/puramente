package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.utils.Result;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PostPendingTransactionsHelper$postTransactionsWithCompletion$1 extends C6498u implements p {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ List<Result<CustomerInfo, PurchasesError>> $results;
    final /* synthetic */ List<StoreTransaction> $transactionsToSync;
    final /* synthetic */ PostPendingTransactionsHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PostPendingTransactionsHelper$postTransactionsWithCompletion$1(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, C6798l lVar, C6798l lVar2) {
        super(2);
        this.$results = list;
        this.this$0 = postPendingTransactionsHelper;
        this.$transactionsToSync = list2;
        this.$onError = lVar;
        this.$onSuccess = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return C6514M.f71813a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        C6496s.h(storeTransaction, "<anonymous parameter 0>");
        C6496s.h(customerInfo, "customerInfo");
        this.$results.add(new Result.Success(customerInfo));
        this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
    }
}
