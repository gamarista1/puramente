package com.revenuecat.purchases.amazon;

import com.amazon.a.a.o.b;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.O;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$queryPurchases$1 extends C6498u implements C6798l {
    final /* synthetic */ boolean $filterOnlyActivePurchases;
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$queryPurchases$1(AmazonBilling amazonBilling, C6798l lVar, boolean z10, C6798l lVar2) {
        super(1);
        this.this$0 = amazonBilling;
        this.$onError = lVar;
        this.$filterOnlyActivePurchases = z10;
        this.$onSuccess = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        if (purchasesError == null) {
            final Date now = this.this$0.dateProvider.getNow();
            PurchaseUpdatesResponseListener access$getPurchaseUpdatesHandler$p = this.this$0.purchaseUpdatesHandler;
            final AmazonBilling amazonBilling = this.this$0;
            final boolean z10 = this.$filterOnlyActivePurchases;
            final C6798l lVar = this.$onSuccess;
            final C6798l lVar2 = this.$onError;
            final Date date = now;
            AnonymousClass1 r02 = new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((List<Receipt>) (List) obj, (UserData) obj2);
                    return C6514M.f71813a;
                }

                public final void invoke(List<Receipt> list, UserData userData) {
                    C6496s.h(list, b.f37449G);
                    C6496s.h(userData, "userData");
                    amazonBilling.trackAmazonQueryPurchasesRequestIfNeeded(true, date);
                    if (z10) {
                        AmazonBilling amazonBilling = amazonBilling;
                        ArrayList arrayList = new ArrayList();
                        for (Object next : list) {
                            Receipt receipt = (Receipt) next;
                            if (receipt.getCancelDate() == null || receipt.getCancelDate().compareTo(amazonBilling.dateProvider.getNow()) > 0) {
                                arrayList.add(next);
                            }
                        }
                        list = arrayList;
                    }
                    if (list.isEmpty()) {
                        lVar.invoke(O.i());
                        return;
                    }
                    AmazonBilling amazonBilling2 = amazonBilling;
                    String userId = userData.getUserId();
                    C6496s.g(userId, "userData.userId");
                    final AmazonBilling amazonBilling3 = amazonBilling;
                    final C6798l lVar = lVar2;
                    final C6798l lVar2 = lVar;
                    final List<Receipt> list2 = list;
                    final UserData userData2 = userData;
                    amazonBilling2.getMissingSkusForReceipts(userId, list, new p() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Map<String, String>) (Map) obj, (Map<String, PurchasesError>) (Map) obj2);
                            return C6514M.f71813a;
                        }

                        public final void invoke(Map<String, String> map, Map<String, PurchasesError> map2) {
                            C6496s.h(map, "tokensToSkusMap");
                            C6496s.h(map2, "errors");
                            amazonBilling3.logErrorsIfAny(map2);
                            if (map.isEmpty()) {
                                lVar.invoke(new PurchasesError(PurchasesErrorCode.InvalidReceiptError, AmazonStrings.ERROR_FETCHING_PURCHASE_HISTORY_ALL_RECEIPTS_INVALID));
                                return;
                            }
                            lVar2.invoke(amazonBilling3.toMapOfReceiptHashesToRestoredPurchases(list2, map, userData2));
                        }
                    });
                }
            };
            final AmazonBilling amazonBilling2 = this.this$0;
            final C6798l lVar3 = this.$onError;
            access$getPurchaseUpdatesHandler$p.queryPurchases(r02, new C6798l() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PurchasesError) obj);
                    return C6514M.f71813a;
                }

                public final void invoke(PurchasesError purchasesError) {
                    C6496s.h(purchasesError, "it");
                    amazonBilling2.trackAmazonQueryPurchasesRequestIfNeeded(false, now);
                    lVar3.invoke(purchasesError);
                }
            });
            return;
        }
        this.$onError.invoke(purchasesError);
    }
}
