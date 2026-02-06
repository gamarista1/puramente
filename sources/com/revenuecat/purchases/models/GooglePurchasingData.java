package com.revenuecat.purchases.models;

import com.android.billingclient.api.C3201h;
import com.revenuecat.purchases.ProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData;", "Lcom/revenuecat/purchases/models/PurchasingData;", "()V", "productType", "Lcom/revenuecat/purchases/ProductType;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "InAppProduct", "Subscription", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class GooglePurchasingData implements PurchasingData {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "Lcom/android/billingclient/api/h;", "productDetails", "<init>", "(Ljava/lang/String;Lcom/android/billingclient/api/h;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/android/billingclient/api/h;", "copy", "(Ljava/lang/String;Lcom/android/billingclient/api/h;)Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "Lcom/android/billingclient/api/h;", "getProductDetails", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InAppProduct extends GooglePurchasingData {
        private final C3201h productDetails;
        private final String productId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InAppProduct(String str, C3201h hVar) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "productId");
            C6496s.h(hVar, "productDetails");
            this.productId = str;
            this.productDetails = hVar;
        }

        public static /* synthetic */ InAppProduct copy$default(InAppProduct inAppProduct, String str, C3201h hVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inAppProduct.productId;
            }
            if ((i10 & 2) != 0) {
                hVar = inAppProduct.productDetails;
            }
            return inAppProduct.copy(str, hVar);
        }

        public final String component1() {
            return this.productId;
        }

        public final C3201h component2() {
            return this.productDetails;
        }

        public final InAppProduct copy(String str, C3201h hVar) {
            C6496s.h(str, "productId");
            C6496s.h(hVar, "productDetails");
            return new InAppProduct(str, hVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppProduct)) {
                return false;
            }
            InAppProduct inAppProduct = (InAppProduct) obj;
            return C6496s.c(this.productId, inAppProduct.productId) && C6496s.c(this.productDetails, inAppProduct.productDetails);
        }

        public final C3201h getProductDetails() {
            return this.productDetails;
        }

        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return (this.productId.hashCode() * 31) + this.productDetails.hashCode();
        }

        public String toString() {
            return "InAppProduct(productId=" + this.productId + ", productDetails=" + this.productDetails + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "optionId", "Lcom/android/billingclient/api/h;", "productDetails", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/h;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/android/billingclient/api/h;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/h;Ljava/lang/String;)Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getOptionId", "Lcom/android/billingclient/api/h;", "getProductDetails", "getToken", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Subscription extends GooglePurchasingData {
        private final String optionId;
        private final C3201h productDetails;
        private final String productId;
        private final String token;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Subscription(String str, String str2, C3201h hVar, String str3) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "productId");
            C6496s.h(str2, "optionId");
            C6496s.h(hVar, "productDetails");
            C6496s.h(str3, "token");
            this.productId = str;
            this.optionId = str2;
            this.productDetails = hVar;
            this.token = str3;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, C3201h hVar, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = subscription.productId;
            }
            if ((i10 & 2) != 0) {
                str2 = subscription.optionId;
            }
            if ((i10 & 4) != 0) {
                hVar = subscription.productDetails;
            }
            if ((i10 & 8) != 0) {
                str3 = subscription.token;
            }
            return subscription.copy(str, str2, hVar, str3);
        }

        public final String component1() {
            return this.productId;
        }

        public final String component2() {
            return this.optionId;
        }

        public final C3201h component3() {
            return this.productDetails;
        }

        public final String component4() {
            return this.token;
        }

        public final Subscription copy(String str, String str2, C3201h hVar, String str3) {
            C6496s.h(str, "productId");
            C6496s.h(str2, "optionId");
            C6496s.h(hVar, "productDetails");
            C6496s.h(str3, "token");
            return new Subscription(str, str2, hVar, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return C6496s.c(this.productId, subscription.productId) && C6496s.c(this.optionId, subscription.optionId) && C6496s.c(this.productDetails, subscription.productDetails) && C6496s.c(this.token, subscription.token);
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final C3201h getProductDetails() {
            return this.productDetails;
        }

        public String getProductId() {
            return this.productId;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return (((((this.productId.hashCode() * 31) + this.optionId.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.token.hashCode();
        }

        public String toString() {
            return "Subscription(productId=" + this.productId + ", optionId=" + this.optionId + ", productDetails=" + this.productDetails + ", token=" + this.token + ')';
        }
    }

    public /* synthetic */ GooglePurchasingData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public ProductType getProductType() {
        if (this instanceof InAppProduct) {
            return ProductType.INAPP;
        }
        if (this instanceof Subscription) {
            return ProductType.SUBS;
        }
        throw new C6535s();
    }

    private GooglePurchasingData() {
    }
}
