package com.revenuecat.purchases;

import android.util.Pair;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$getPurchasesUpdatedListener$1", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchases", "Llf/M;", "onPurchasesUpdated", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "onPurchasesFailedToUpdate", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator$getPurchasesUpdatedListener$1 implements BillingAbstract.PurchasesUpdatedListener {
    final /* synthetic */ PurchasesOrchestrator this$0;

    PurchasesOrchestrator$getPurchasesUpdatedListener$1(PurchasesOrchestrator purchasesOrchestrator) {
        this.this$0 = purchasesOrchestrator;
    }

    public void onPurchasesFailedToUpdate(PurchasesError purchasesError) {
        C6514M m10;
        C6496s.h(purchasesError, "purchasesError");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        synchronized (purchasesOrchestrator) {
            try {
                ProductChangeCallback access$getAndClearProductChangeCallback = purchasesOrchestrator.getAndClearProductChangeCallback();
                if (access$getAndClearProductChangeCallback != null) {
                    purchasesOrchestrator.dispatch(access$getAndClearProductChangeCallback, purchasesError);
                    m10 = C6514M.f71813a;
                } else {
                    m10 = null;
                }
                if (m10 == null) {
                    for (PurchaseCallback access$dispatch : purchasesOrchestrator.getAndClearAllPurchaseCallbacks()) {
                        purchasesOrchestrator.dispatch(access$dispatch, purchasesError);
                    }
                }
                C6514M m11 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onPurchasesUpdated(List<StoreTransaction> list) {
        Pair pair;
        C6496s.h(list, "purchases");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        synchronized (purchasesOrchestrator) {
            try {
                if (purchasesOrchestrator.getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback() != null) {
                    pair = purchasesOrchestrator.getProductChangeCompletedCallbacks(purchasesOrchestrator.getAndClearProductChangeCallback());
                } else {
                    pair = purchasesOrchestrator.getPurchaseCompletedCallbacks();
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.this$0.postTransactionWithProductDetailsHelper.postTransactions(list, this.this$0.getAllowSharingPlayStoreAccount(), this.this$0.getAppUserID(), PostReceiptInitiationSource.PURCHASE, (p) pair.first, (p) pair.second);
        this.this$0.flushPaywallEvents();
    }
}
