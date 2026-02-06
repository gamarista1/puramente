package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$queryProductDetailsAsync$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onReceive;
    final /* synthetic */ Set<String> $productIds;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$queryProductDetailsAsync$1(AmazonBilling amazonBilling, C6798l lVar, Set<String> set, C6798l lVar2) {
        super(1);
        this.this$0 = amazonBilling;
        this.$onError = lVar;
        this.$productIds = set;
        this.$onReceive = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        if (purchasesError == null) {
            UserDataResponseListener access$getUserDataHandler$p = this.this$0.userDataHandler;
            final AmazonBilling amazonBilling = this.this$0;
            final Set<String> set = this.$productIds;
            final C6798l lVar = this.$onReceive;
            final C6798l lVar2 = this.$onError;
            access$getUserDataHandler$p.getUserData(new C6798l() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((UserData) obj);
                    return C6514M.f71813a;
                }

                public final void invoke(UserData userData) {
                    C6496s.h(userData, "userData");
                    final Date now = amazonBilling.dateProvider.getNow();
                    ProductDataResponseListener access$getProductDataHandler$p = amazonBilling.productDataHandler;
                    Set<String> set = set;
                    String marketplace = userData.getMarketplace();
                    C6496s.g(marketplace, "userData.marketplace");
                    final AmazonBilling amazonBilling = amazonBilling;
                    final C6798l lVar = lVar;
                    AnonymousClass1 r32 = new C6798l() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((List<? extends StoreProduct>) (List) obj);
                            return C6514M.f71813a;
                        }

                        public final void invoke(List<? extends StoreProduct> list) {
                            C6496s.h(list, "it");
                            amazonBilling.trackAmazonQueryProductDetailsRequestIfNeeded(true, now);
                            lVar.invoke(list);
                        }
                    };
                    final AmazonBilling amazonBilling2 = amazonBilling;
                    final C6798l lVar2 = lVar2;
                    access$getProductDataHandler$p.getProductData(set, marketplace, r32, new C6798l() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((PurchasesError) obj);
                            return C6514M.f71813a;
                        }

                        public final void invoke(PurchasesError purchasesError) {
                            C6496s.h(purchasesError, "it");
                            amazonBilling2.trackAmazonQueryProductDetailsRequestIfNeeded(false, now);
                            lVar2.invoke(purchasesError);
                        }
                    });
                }
            }, this.$onError);
            return;
        }
        this.$onError.invoke(purchasesError);
    }
}
