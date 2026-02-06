package com.revenuecat.purchases.google;

import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.ProductType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "subsPurchasesList", "Llf/M;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$queryAllPurchases$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onReceivePurchaseHistory;
    final /* synthetic */ C6798l $onReceivePurchaseHistoryError;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BillingWrapper$queryAllPurchases$1(BillingWrapper billingWrapper, C6798l lVar, C6798l lVar2) {
        super(1);
        this.this$0 = billingWrapper;
        this.$onReceivePurchaseHistoryError = lVar;
        this.$onReceivePurchaseHistory = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends PurchaseHistoryRecord>) (List) obj);
        return C6514M.f71813a;
    }

    public final void invoke(final List<? extends PurchaseHistoryRecord> list) {
        C6496s.h(list, "subsPurchasesList");
        BillingWrapper billingWrapper = this.this$0;
        final C6798l lVar = this.$onReceivePurchaseHistory;
        billingWrapper.queryPurchaseHistoryAsync("inapp", new C6798l() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends PurchaseHistoryRecord>) (List) obj);
                return C6514M.f71813a;
            }

            public final void invoke(List<? extends PurchaseHistoryRecord> list) {
                C6496s.h(list, "inAppPurchasesList");
                C6798l lVar = lVar;
                Iterable<PurchaseHistoryRecord> iterable = list;
                ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
                for (PurchaseHistoryRecord storeTransaction : iterable) {
                    arrayList.add(StoreTransactionConversionsKt.toStoreTransaction(storeTransaction, ProductType.SUBS));
                }
                Iterable<PurchaseHistoryRecord> iterable2 = list;
                ArrayList arrayList2 = new ArrayList(C6565s.y(iterable2, 10));
                for (PurchaseHistoryRecord storeTransaction2 : iterable2) {
                    arrayList2.add(StoreTransactionConversionsKt.toStoreTransaction(storeTransaction2, ProductType.INAPP));
                }
                lVar.invoke(C6565s.K0(arrayList, arrayList2));
            }
        }, this.$onReceivePurchaseHistoryError);
    }
}
