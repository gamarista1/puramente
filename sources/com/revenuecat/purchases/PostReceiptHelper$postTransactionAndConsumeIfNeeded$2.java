package com.revenuecat.purchases;

import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import org.json.JSONObject;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PostReceiptHelper$postTransactionAndConsumeIfNeeded$2 extends C6498u implements q {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ p $onError;
    final /* synthetic */ p $onSuccess;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ PostReceiptHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PostReceiptHelper$postTransactionAndConsumeIfNeeded$2(PostReceiptHelper postReceiptHelper, StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, String str, p pVar, p pVar2) {
        super(3);
        this.this$0 = postReceiptHelper;
        this.$purchase = storeTransaction;
        this.$initiationSource = postReceiptInitiationSource;
        this.$appUserID = str;
        this.$onSuccess = pVar;
        this.$onError = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
        return C6514M.f71813a;
    }

    public final void invoke(final PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
        C6496s.h(purchasesError, "backendError");
        C6496s.h(postReceiptErrorHandlingBehavior, "errorHandlingBehavior");
        if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
            this.this$0.billing.consumeAndSave(this.this$0.getFinishTransactions(), this.$purchase, false, this.$initiationSource);
        }
        PostReceiptHelper postReceiptHelper = this.this$0;
        String str = this.$appUserID;
        final p pVar = this.$onSuccess;
        final StoreTransaction storeTransaction = this.$purchase;
        AnonymousClass1 r12 = new C6798l() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return C6514M.f71813a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                C6496s.h(customerInfo, "customerInfo");
                p pVar = pVar;
                if (pVar != null) {
                    pVar.invoke(storeTransaction, customerInfo);
                }
            }
        };
        final p pVar2 = this.$onError;
        final StoreTransaction storeTransaction2 = this.$purchase;
        postReceiptHelper.useOfflineEntitlementsCustomerInfoIfNeeded(postReceiptErrorHandlingBehavior, str, r12, new C6787a() {
            public final void invoke() {
                p pVar = pVar2;
                if (pVar != null) {
                    pVar.invoke(storeTransaction2, purchasesError);
                }
            }
        });
    }
}
