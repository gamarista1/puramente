package com.revenuecat.purchases;

import android.app.Activity;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.TestStoreProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068@X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00188@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001e8@X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/PurchaseParams;", "", "builder", "Lcom/revenuecat/purchases/PurchaseParams$Builder;", "(Lcom/revenuecat/purchases/PurchaseParams$Builder;)V", "activity", "Landroid/app/Activity;", "getActivity$purchases_defaultsRelease", "()Landroid/app/Activity;", "getBuilder", "()Lcom/revenuecat/purchases/PurchaseParams$Builder;", "googleReplacementMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getGoogleReplacementMode", "()Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "isPersonalizedPrice", "", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "oldProductId", "", "getOldProductId", "()Ljava/lang/String;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "setPresentedOfferingContext$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/models/PurchasingData;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "Builder", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchaseParams {
    private final Activity activity;
    private final Builder builder;
    private final GoogleReplacementMode googleReplacementMode;
    private final Boolean isPersonalizedPrice;
    private final String oldProductId;
    private PresentedOfferingContext presentedOfferingContext;
    private final PurchasingData purchasingData;

    public PurchaseParams(Builder builder2) {
        C6496s.h(builder2, "builder");
        this.builder = builder2;
        this.isPersonalizedPrice = builder2.isPersonalizedPrice$purchases_defaultsRelease();
        this.oldProductId = builder2.getOldProductId$purchases_defaultsRelease();
        this.googleReplacementMode = builder2.getGoogleReplacementMode$purchases_defaultsRelease();
        this.purchasingData = builder2.getPurchasingData$purchases_defaultsRelease();
        this.activity = builder2.getActivity$purchases_defaultsRelease();
        this.presentedOfferingContext = builder2.getPresentedOfferingContext$purchases_defaultsRelease();
    }

    public static /* synthetic */ PurchaseParams copy$default(PurchaseParams purchaseParams, Builder builder2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            builder2 = purchaseParams.builder;
        }
        return purchaseParams.copy(builder2);
    }

    public final Builder component1() {
        return this.builder;
    }

    public final PurchaseParams copy(Builder builder2) {
        C6496s.h(builder2, "builder");
        return new PurchaseParams(builder2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchaseParams) && C6496s.c(this.builder, ((PurchaseParams) obj).builder);
    }

    public final /* synthetic */ Activity getActivity$purchases_defaultsRelease() {
        return this.activity;
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    public final GoogleReplacementMode getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    public final String getOldProductId() {
        return this.oldProductId;
    }

    public final /* synthetic */ PresentedOfferingContext getPresentedOfferingContext$purchases_defaultsRelease() {
        return this.presentedOfferingContext;
    }

    public final /* synthetic */ PurchasingData getPurchasingData$purchases_defaultsRelease() {
        return this.purchasingData;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }

    public final Boolean isPersonalizedPrice() {
        return this.isPersonalizedPrice;
    }

    public final void setPresentedOfferingContext$purchases_defaultsRelease(PresentedOfferingContext presentedOfferingContext2) {
        this.presentedOfferingContext = presentedOfferingContext2;
    }

    public String toString() {
        return "PurchaseParams(builder=" + this.builder + ')';
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\n\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R.\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u00102\u001a\u0004\u0018\u00010\u00188@@@X\u000e¢\u0006\u0012\n\u0004\b\u0019\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R.\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u00102\u001a\u0004\u0018\u00010\u001b8@@@X\u000e¢\u0006\u0012\n\u0004\b\u001c\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010\u001f\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u001e8@@@X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lcom/revenuecat/purchases/PurchaseParams$Builder;", "", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "Lcom/revenuecat/purchases/models/StoreProduct;", "product", "<init>", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/StoreProduct;)V", "Lcom/revenuecat/purchases/Package;", "packageToPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;)V", "storeProduct", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;)V", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOption", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/SubscriptionOption;)V", "Llf/M;", "ensureNoTestProduct", "(Lcom/revenuecat/purchases/models/StoreProduct;)V", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "", "isPersonalizedPrice", "(Z)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "", "oldProductId", "(Ljava/lang/String;)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "googleReplacementMode", "(Lcom/revenuecat/purchases/models/GoogleReplacementMode;)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "Lcom/revenuecat/purchases/PurchaseParams;", "build", "()Lcom/revenuecat/purchases/PurchaseParams;", "Landroid/app/Activity;", "getActivity$purchases_defaultsRelease", "()Landroid/app/Activity;", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/models/PurchasingData;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "setPresentedOfferingContext$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Lcom/revenuecat/purchases/models/StoreProduct;", "getProduct$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/models/StoreProduct;", "<set-?>", "Ljava/lang/Boolean;", "isPersonalizedPrice$purchases_defaultsRelease", "()Ljava/lang/Boolean;", "setPersonalizedPrice$purchases_defaultsRelease", "(Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getOldProductId$purchases_defaultsRelease", "()Ljava/lang/String;", "setOldProductId$purchases_defaultsRelease", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getGoogleReplacementMode$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "setGoogleReplacementMode$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/models/GoogleReplacementMode;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Builder {
        private final Activity activity;
        private GoogleReplacementMode googleReplacementMode;
        private Boolean isPersonalizedPrice;
        private String oldProductId;
        private PresentedOfferingContext presentedOfferingContext;
        private final StoreProduct product;
        private final PurchasingData purchasingData;

        private Builder(Activity activity2, PurchasingData purchasingData2, PresentedOfferingContext presentedOfferingContext2, StoreProduct storeProduct) {
            this.activity = activity2;
            this.purchasingData = purchasingData2;
            this.presentedOfferingContext = presentedOfferingContext2;
            this.product = storeProduct;
            this.googleReplacementMode = GoogleReplacementMode.WITHOUT_PRORATION;
        }

        private final void ensureNoTestProduct(StoreProduct storeProduct) {
            if (storeProduct instanceof TestStoreProduct) {
                PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.ProductNotAvailableForPurchaseError;
                throw new PurchasesException(new PurchasesError(purchasesErrorCode, "Cannot purchase " + storeProduct));
            }
        }

        public PurchaseParams build() {
            StoreProduct storeProduct = this.product;
            if (storeProduct != null) {
                ensureNoTestProduct(storeProduct);
            }
            return new PurchaseParams(this);
        }

        public final /* synthetic */ Activity getActivity$purchases_defaultsRelease() {
            return this.activity;
        }

        public final /* synthetic */ GoogleReplacementMode getGoogleReplacementMode$purchases_defaultsRelease() {
            return this.googleReplacementMode;
        }

        public final /* synthetic */ String getOldProductId$purchases_defaultsRelease() {
            return this.oldProductId;
        }

        public final /* synthetic */ PresentedOfferingContext getPresentedOfferingContext$purchases_defaultsRelease() {
            return this.presentedOfferingContext;
        }

        public final /* synthetic */ StoreProduct getProduct$purchases_defaultsRelease() {
            return this.product;
        }

        public final /* synthetic */ PurchasingData getPurchasingData$purchases_defaultsRelease() {
            return this.purchasingData;
        }

        public final Builder googleReplacementMode(GoogleReplacementMode googleReplacementMode2) {
            C6496s.h(googleReplacementMode2, "googleReplacementMode");
            this.googleReplacementMode = googleReplacementMode2;
            return this;
        }

        public final Builder isPersonalizedPrice(boolean z10) {
            this.isPersonalizedPrice = Boolean.valueOf(z10);
            return this;
        }

        public final /* synthetic */ Boolean isPersonalizedPrice$purchases_defaultsRelease() {
            return this.isPersonalizedPrice;
        }

        public final Builder oldProductId(String str) {
            C6496s.h(str, "oldProductId");
            this.oldProductId = str;
            return this;
        }

        public final Builder presentedOfferingContext(PresentedOfferingContext presentedOfferingContext2) {
            C6496s.h(presentedOfferingContext2, "presentedOfferingContext");
            this.presentedOfferingContext = presentedOfferingContext2;
            return this;
        }

        public final /* synthetic */ void setGoogleReplacementMode$purchases_defaultsRelease(GoogleReplacementMode googleReplacementMode2) {
            C6496s.h(googleReplacementMode2, "<set-?>");
            this.googleReplacementMode = googleReplacementMode2;
        }

        public final /* synthetic */ void setOldProductId$purchases_defaultsRelease(String str) {
            this.oldProductId = str;
        }

        public final /* synthetic */ void setPersonalizedPrice$purchases_defaultsRelease(Boolean bool) {
            this.isPersonalizedPrice = bool;
        }

        public final void setPresentedOfferingContext$purchases_defaultsRelease(PresentedOfferingContext presentedOfferingContext2) {
            this.presentedOfferingContext = presentedOfferingContext2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity2, Package packageR) {
            this(activity2, packageR.getProduct().getPurchasingData(), packageR.getPresentedOfferingContext(), packageR.getProduct());
            C6496s.h(activity2, "activity");
            C6496s.h(packageR, "packageToPurchase");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity2, StoreProduct storeProduct) {
            this(activity2, storeProduct.getPurchasingData(), storeProduct.getPresentedOfferingContext(), storeProduct);
            C6496s.h(activity2, "activity");
            C6496s.h(storeProduct, "storeProduct");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity2, SubscriptionOption subscriptionOption) {
            this(activity2, subscriptionOption.getPurchasingData(), subscriptionOption.getPresentedOfferingContext(), (StoreProduct) null);
            C6496s.h(activity2, "activity");
            C6496s.h(subscriptionOption, "subscriptionOption");
        }
    }
}
