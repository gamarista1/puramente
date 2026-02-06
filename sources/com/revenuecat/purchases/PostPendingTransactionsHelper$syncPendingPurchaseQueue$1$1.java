package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchasesByHashedToken", "Llf/M;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1 extends C6498u implements C6798l {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ PostPendingTransactionsHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z10, String str, C6798l lVar, C6798l lVar2) {
        super(1);
        this.this$0 = postPendingTransactionsHelper;
        this.$allowSharingPlayStoreAccount = z10;
        this.$appUserID = str;
        this.$onError = lVar;
        this.$onSuccess = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, StoreTransaction>) (Map) obj);
        return C6514M.f71813a;
    }

    public final void invoke(Map<String, StoreTransaction> map) {
        C6496s.h(map, "purchasesByHashedToken");
        for (Map.Entry next : map.entrySet()) {
            LogIntent logIntent = LogIntent.DEBUG;
            String format = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_HASH, Arrays.copyOf(new Object[]{((StoreTransaction) next.getValue()).getType(), (String) next.getKey()}, 2));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
        }
        this.this$0.deviceCache.cleanPreviouslySentTokens(map.keySet());
        this.this$0.postTransactionsWithCompletion(this.this$0.deviceCache.getActivePurchasesNotInCache(map), this.$allowSharingPlayStoreAccount, this.$appUserID, this.$onError, this.$onSuccess);
    }
}
