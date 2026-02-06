package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/DateProvider;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transaction", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "createPurchasedProduct", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "purchaseAssociatedToProduct", "Ljava/util/Date;", "getExpirationDate", "(Lcom/revenuecat/purchases/models/StoreTransaction;)Ljava/util/Date;", "", "appUserID", "Lkotlin/Function1;", "", "Llf/M;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "queryActiveProducts", "(Ljava/lang/String;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/DateProvider;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasedProductsFetcher {
    private final BillingAbstract billing;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.SUBS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchasedProductsFetcher(DeviceCache deviceCache2, BillingAbstract billingAbstract, DateProvider dateProvider2) {
        C6496s.h(deviceCache2, "deviceCache");
        C6496s.h(billingAbstract, "billing");
        C6496s.h(dateProvider2, "dateProvider");
        this.deviceCache = deviceCache2;
        this.billing = billingAbstract;
        this.dateProvider = dateProvider2;
    }

    /* access modifiers changed from: private */
    public final PurchasedProduct createPurchasedProduct(StoreTransaction storeTransaction, ProductEntitlementMapping productEntitlementMapping) {
        String str;
        List<String> n10;
        Date expirationDate = getExpirationDate(storeTransaction);
        String str2 = (String) C6565s.o0(storeTransaction.getProductIds());
        ProductEntitlementMapping.Mapping mapping = productEntitlementMapping.getMappings().get(str2);
        if (mapping != null) {
            str = mapping.getBasePlanId();
        } else {
            str = null;
        }
        String str3 = str;
        if (mapping == null || (n10 = mapping.getEntitlements()) == null) {
            n10 = C6565s.n();
        }
        return new PurchasedProduct(str2, str3, storeTransaction, n10, expirationDate);
    }

    private final Date getExpirationDate(StoreTransaction storeTransaction) {
        if (WhenMappings.$EnumSwitchMapping$0[storeTransaction.getType().ordinal()] == 1) {
            return new Date(this.dateProvider.getNow().getTime() + TimeUnit.DAYS.toMillis(1));
        }
        return null;
    }

    public final void queryActiveProducts(String str, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "appUserID");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        ProductEntitlementMapping productEntitlementMapping = this.deviceCache.getProductEntitlementMapping();
        if (productEntitlementMapping == null) {
            lVar2.invoke(new PurchasesError(PurchasesErrorCode.CustomerInfoError, OfflineEntitlementsStrings.PRODUCT_ENTITLEMENT_MAPPING_REQUIRED));
        } else {
            this.billing.queryPurchases(str, new PurchasedProductsFetcher$queryActiveProducts$1(lVar, this, productEntitlementMapping), lVar2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PurchasedProductsFetcher(DeviceCache deviceCache2, BillingAbstract billingAbstract, DateProvider dateProvider2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceCache2, billingAbstract, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider2);
    }
}
