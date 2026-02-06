package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "purchasedProducts", "Llf/M;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$1 extends C6498u implements C6798l {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ OfflineCustomerInfoCalculator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$1(OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, C6798l lVar, String str, C6798l lVar2) {
        super(1);
        this.this$0 = offlineCustomerInfoCalculator;
        this.$onError = lVar;
        this.$appUserID = str;
        this.$onSuccess = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<PurchasedProduct>) (List) obj);
        return C6514M.f71813a;
    }

    public final void invoke(List<PurchasedProduct> list) {
        C6496s.h(list, "purchasedProducts");
        Iterable<PurchasedProduct> iterable = list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (PurchasedProduct storeTransaction : iterable) {
                if (storeTransaction.getStoreTransaction().getType() == ProductType.INAPP) {
                    PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_UNSUPPORTED_INAPP_PURCHASES);
                    String format = String.format(CustomerInfoStrings.COMPUTING_OFFLINE_CUSTOMER_INFO_FAILED, Arrays.copyOf(new Object[]{purchasesError}, 1));
                    C6496s.g(format, "format(this, *args)");
                    LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
                    DiagnosticsTracker access$getDiagnosticsTracker$p = this.this$0.diagnosticsTracker;
                    if (access$getDiagnosticsTracker$p != null) {
                        access$getDiagnosticsTracker$p.trackErrorEnteringOfflineEntitlementsMode(purchasesError);
                    }
                    this.$onError.invoke(purchasesError);
                    return;
                }
            }
        }
        this.$onSuccess.invoke(this.this$0.buildCustomerInfoUsingListOfPurchases(this.$appUserID, list));
    }
}
