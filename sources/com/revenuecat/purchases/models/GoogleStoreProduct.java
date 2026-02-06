package com.revenuecat.purchases.models;

import com.amazon.a.a.o.b;
import com.android.billingclient.api.C3201h;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import mf.C6565s;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018Bu\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0019Bm\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u001aB/\b\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010(J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010(J\u0012\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010(J\u0012\u0010:\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010(J\u0010\u0010@\u001a\u00020?HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bI\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bK\u0010+R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bM\u0010-R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bN\u0010(R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bO\u0010(R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bP\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\bR\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bT\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\bV\u00106R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010W\u001a\u0004\bX\u00108R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010G\u0012\u0004\bZ\u0010[\u001a\u0004\bY\u0010(R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b]\u0010;R\u001a\u0010`\u001a\u00020\u00028VX\u0004¢\u0006\f\u0012\u0004\b_\u0010[\u001a\u0004\b^\u0010(R\u0014\u0010b\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\ba\u0010(R\u0014\u0010f\u001a\u00020c8VX\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006g"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", "", "productId", "basePlanId", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/models/Price;", "price", "name", "title", "description", "Lcom/revenuecat/purchases/models/Period;", "period", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "defaultOption", "Lcom/android/billingclient/api/h;", "productDetails", "presentedOfferingIdentifier", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/android/billingclient/api/h;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/android/billingclient/api/h;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/android/billingclient/api/h;Ljava/lang/String;)V", "otherProduct", "subscriptionOptionsWithOfferingId", "(Lcom/revenuecat/purchases/models/GoogleStoreProduct;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "offeringId", "copyWithOfferingId", "(Ljava/lang/String;)Lcom/revenuecat/purchases/models/StoreProduct;", "copyWithPresentedOfferingContext", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/models/StoreProduct;", "Ljava/util/Locale;", "locale", "formattedPricePerMonth", "(Ljava/util/Locale;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/revenuecat/purchases/ProductType;", "component4", "()Lcom/revenuecat/purchases/models/Price;", "component5", "component6", "component7", "component8", "()Lcom/revenuecat/purchases/models/Period;", "component9", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "component10", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "component11", "()Lcom/android/billingclient/api/h;", "component12", "component13", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/android/billingclient/api/h;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getBasePlanId", "Lcom/revenuecat/purchases/ProductType;", "getType", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "getName", "getTitle", "getDescription", "Lcom/revenuecat/purchases/models/Period;", "getPeriod", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getSubscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDefaultOption", "Lcom/android/billingclient/api/h;", "getProductDetails", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "getSku", "getSku$annotations", "sku", "getId", "id", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GoogleStoreProduct implements StoreProduct {
    private final String basePlanId;
    private final SubscriptionOption defaultOption;
    private final String description;
    private final String name;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final String presentedOfferingIdentifier;
    private final Price price;
    private final C3201h productDetails;
    private final String productId;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    /* JADX WARNING: Illegal instructions before constructor call */
    @lf.C6521e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleStoreProduct(java.lang.String r18, java.lang.String r19, com.revenuecat.purchases.ProductType r20, com.revenuecat.purchases.models.Price r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, com.revenuecat.purchases.models.Period r25, com.revenuecat.purchases.models.SubscriptionOptions r26, com.revenuecat.purchases.models.SubscriptionOption r27, com.android.billingclient.api.C3201h r28) {
        /*
            r17 = this;
            java.lang.String r0 = "productId"
            r2 = r18
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "type"
            r4 = r20
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "price"
            r5 = r21
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "name"
            r6 = r22
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.String r0 = "title"
            r7 = r23
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "description"
            r8 = r24
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "productDetails"
            r12 = r28
            kotlin.jvm.internal.C6496s.h(r12, r0)
            r15 = 6144(0x1800, float:8.61E-42)
            r16 = 0
            r13 = 0
            r14 = 0
            r1 = r17
            r3 = r19
            r9 = r25
            r10 = r26
            r11 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.GoogleStoreProduct.<init>(java.lang.String, java.lang.String, com.revenuecat.purchases.ProductType, com.revenuecat.purchases.models.Price, java.lang.String, java.lang.String, java.lang.String, com.revenuecat.purchases.models.Period, com.revenuecat.purchases.models.SubscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption, com.android.billingclient.api.h):void");
    }

    public static /* synthetic */ GoogleStoreProduct copy$default(GoogleStoreProduct googleStoreProduct, String str, String str2, ProductType productType, Price price2, String str3, String str4, String str5, Period period2, SubscriptionOptions subscriptionOptions2, SubscriptionOption subscriptionOption, C3201h hVar, String str6, PresentedOfferingContext presentedOfferingContext2, int i10, Object obj) {
        GoogleStoreProduct googleStoreProduct2 = googleStoreProduct;
        int i11 = i10;
        return googleStoreProduct.copy((i11 & 1) != 0 ? googleStoreProduct2.productId : str, (i11 & 2) != 0 ? googleStoreProduct2.basePlanId : str2, (i11 & 4) != 0 ? googleStoreProduct2.type : productType, (i11 & 8) != 0 ? googleStoreProduct2.price : price2, (i11 & 16) != 0 ? googleStoreProduct2.name : str3, (i11 & 32) != 0 ? googleStoreProduct2.title : str4, (i11 & 64) != 0 ? googleStoreProduct2.description : str5, (i11 & 128) != 0 ? googleStoreProduct2.period : period2, (i11 & 256) != 0 ? googleStoreProduct2.subscriptionOptions : subscriptionOptions2, (i11 & 512) != 0 ? googleStoreProduct2.defaultOption : subscriptionOption, (i11 & 1024) != 0 ? googleStoreProduct2.productDetails : hVar, (i11 & 2048) != 0 ? googleStoreProduct2.presentedOfferingIdentifier : str6, (i11 & 4096) != 0 ? googleStoreProduct2.presentedOfferingContext : presentedOfferingContext2);
    }

    @C6521e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @C6521e
    public static /* synthetic */ void getSku$annotations() {
    }

    public final String component1() {
        return this.productId;
    }

    public final SubscriptionOption component10() {
        return this.defaultOption;
    }

    public final C3201h component11() {
        return this.productDetails;
    }

    public final String component12() {
        return this.presentedOfferingIdentifier;
    }

    public final PresentedOfferingContext component13() {
        return this.presentedOfferingContext;
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final ProductType component3() {
        return this.type;
    }

    public final Price component4() {
        return this.price;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.title;
    }

    public final String component7() {
        return this.description;
    }

    public final Period component8() {
        return this.period;
    }

    public final SubscriptionOptions component9() {
        return this.subscriptionOptions;
    }

    public final GoogleStoreProduct copy(String str, String str2, ProductType productType, Price price2, String str3, String str4, String str5, Period period2, SubscriptionOptions subscriptionOptions2, SubscriptionOption subscriptionOption, C3201h hVar, String str6, PresentedOfferingContext presentedOfferingContext2) {
        String str7 = str;
        C6496s.h(str7, "productId");
        ProductType productType2 = productType;
        C6496s.h(productType2, "type");
        Price price3 = price2;
        C6496s.h(price3, b.f37501x);
        String str8 = str3;
        C6496s.h(str8, "name");
        String str9 = str4;
        C6496s.h(str9, b.f37461S);
        String str10 = str5;
        C6496s.h(str10, b.f37480c);
        C3201h hVar2 = hVar;
        C6496s.h(hVar2, "productDetails");
        return new GoogleStoreProduct(str7, str2, productType2, price3, str8, str9, str10, period2, subscriptionOptions2, subscriptionOption, hVar2, str6, presentedOfferingContext2);
    }

    @C6521e
    public StoreProduct copyWithOfferingId(String str) {
        PresentedOfferingContext presentedOfferingContext2;
        C6496s.h(str, "offeringId");
        PresentedOfferingContext presentedOfferingContext3 = getPresentedOfferingContext();
        if (presentedOfferingContext3 == null || (presentedOfferingContext2 = PresentedOfferingContext.copy$default(presentedOfferingContext3, str, (String) null, (PresentedOfferingContext.TargetingContext) null, 6, (Object) null)) == null) {
            presentedOfferingContext2 = new PresentedOfferingContext(str);
        }
        return copyWithPresentedOfferingContext(presentedOfferingContext2);
    }

    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext2) {
        ArrayList arrayList;
        GoogleSubscriptionOption googleSubscriptionOption;
        GoogleSubscriptionOption googleSubscriptionOption2;
        GoogleSubscriptionOption googleSubscriptionOption3;
        GoogleSubscriptionOption googleSubscriptionOption4;
        SubscriptionOptions<SubscriptionOption> subscriptionOptions2 = getSubscriptionOptions();
        SubscriptionOptions subscriptionOptions3 = null;
        if (subscriptionOptions2 != null) {
            arrayList = new ArrayList();
            for (SubscriptionOption subscriptionOption : subscriptionOptions2) {
                if (subscriptionOption instanceof GoogleSubscriptionOption) {
                    googleSubscriptionOption3 = (GoogleSubscriptionOption) subscriptionOption;
                } else {
                    googleSubscriptionOption3 = null;
                }
                if (googleSubscriptionOption3 != null) {
                    googleSubscriptionOption4 = new GoogleSubscriptionOption(googleSubscriptionOption3, presentedOfferingContext2);
                } else {
                    googleSubscriptionOption4 = null;
                }
                if (googleSubscriptionOption4 != null) {
                    arrayList.add(googleSubscriptionOption4);
                }
            }
        } else {
            arrayList = null;
        }
        SubscriptionOption defaultOption2 = getDefaultOption();
        if (defaultOption2 instanceof GoogleSubscriptionOption) {
            googleSubscriptionOption = (GoogleSubscriptionOption) defaultOption2;
        } else {
            googleSubscriptionOption = null;
        }
        if (googleSubscriptionOption != null) {
            googleSubscriptionOption2 = new GoogleSubscriptionOption(googleSubscriptionOption, presentedOfferingContext2);
        } else {
            googleSubscriptionOption2 = null;
        }
        if (arrayList != null) {
            subscriptionOptions3 = new SubscriptionOptions(arrayList);
        }
        return new GoogleStoreProduct(this, googleSubscriptionOption2, subscriptionOptions3, presentedOfferingContext2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleStoreProduct)) {
            return false;
        }
        GoogleStoreProduct googleStoreProduct = (GoogleStoreProduct) obj;
        return C6496s.c(this.productId, googleStoreProduct.productId) && C6496s.c(this.basePlanId, googleStoreProduct.basePlanId) && this.type == googleStoreProduct.type && C6496s.c(this.price, googleStoreProduct.price) && C6496s.c(this.name, googleStoreProduct.name) && C6496s.c(this.title, googleStoreProduct.title) && C6496s.c(this.description, googleStoreProduct.description) && C6496s.c(this.period, googleStoreProduct.period) && C6496s.c(this.subscriptionOptions, googleStoreProduct.subscriptionOptions) && C6496s.c(this.defaultOption, googleStoreProduct.defaultOption) && C6496s.c(this.productDetails, googleStoreProduct.productDetails) && C6496s.c(this.presentedOfferingIdentifier, googleStoreProduct.presentedOfferingIdentifier) && C6496s.c(this.presentedOfferingContext, googleStoreProduct.presentedOfferingContext);
    }

    public String formattedPricePerMonth(Locale locale) {
        SubscriptionOption basePlan;
        List<PricingPhase> pricingPhases;
        PricingPhase pricingPhase;
        C6496s.h(locale, "locale");
        SubscriptionOptions subscriptionOptions2 = getSubscriptionOptions();
        if (subscriptionOptions2 == null || (basePlan = subscriptionOptions2.getBasePlan()) == null || (pricingPhases = basePlan.getPricingPhases()) == null || (pricingPhase = (PricingPhase) C6565s.z0(pricingPhases)) == null) {
            return null;
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        if (this.basePlanId != null) {
            String str = this.productId + ':' + this.basePlanId;
            if (str != null) {
                return str;
            }
        }
        return this.productId;
    }

    public String getName() {
        return this.name;
    }

    public Period getPeriod() {
        return this.period;
    }

    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    public Price getPrice() {
        return this.price;
    }

    public final C3201h getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    public PurchasingData getPurchasingData() {
        if (getType() != ProductType.SUBS || getDefaultOption() == null) {
            return new GooglePurchasingData.InAppProduct(getId(), this.productDetails);
        }
        return getDefaultOption().getPurchasingData();
    }

    public String getSku() {
        return this.productId;
    }

    public SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    public String getTitle() {
        return this.title;
    }

    public ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.productId.hashCode() * 31;
        String str = this.basePlanId;
        int i10 = 0;
        int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + this.price.hashCode()) * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        Period period2 = this.period;
        int hashCode3 = (hashCode2 + (period2 == null ? 0 : period2.hashCode())) * 31;
        SubscriptionOptions subscriptionOptions2 = this.subscriptionOptions;
        int hashCode4 = (hashCode3 + (subscriptionOptions2 == null ? 0 : subscriptionOptions2.hashCode())) * 31;
        SubscriptionOption subscriptionOption = this.defaultOption;
        int hashCode5 = (((hashCode4 + (subscriptionOption == null ? 0 : subscriptionOption.hashCode())) * 31) + this.productDetails.hashCode()) * 31;
        String str2 = this.presentedOfferingIdentifier;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext2 = this.presentedOfferingContext;
        if (presentedOfferingContext2 != null) {
            i10 = presentedOfferingContext2.hashCode();
        }
        return hashCode6 + i10;
    }

    public Price pricePerDay(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerDay(this, locale);
    }

    public Price pricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerMonth(this, locale);
    }

    public Price pricePerWeek(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerWeek(this, locale);
    }

    public Price pricePerYear(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerYear(this, locale);
    }

    public String toString() {
        return "GoogleStoreProduct(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", type=" + this.type + ", price=" + this.price + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", productDetails=" + this.productDetails + ", presentedOfferingIdentifier=" + this.presentedOfferingIdentifier + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @lf.C6521e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleStoreProduct(java.lang.String r18, java.lang.String r19, com.revenuecat.purchases.ProductType r20, com.revenuecat.purchases.models.Price r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, com.revenuecat.purchases.models.Period r25, com.revenuecat.purchases.models.SubscriptionOptions r26, com.revenuecat.purchases.models.SubscriptionOption r27, com.android.billingclient.api.C3201h r28, java.lang.String r29) {
        /*
            r17 = this;
            java.lang.String r0 = "productId"
            r2 = r18
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "type"
            r4 = r20
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "price"
            r5 = r21
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "name"
            r6 = r22
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.String r0 = "title"
            r7 = r23
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "description"
            r8 = r24
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "productDetails"
            r12 = r28
            kotlin.jvm.internal.C6496s.h(r12, r0)
            r15 = 4096(0x1000, float:5.74E-42)
            r16 = 0
            r14 = 0
            r1 = r17
            r3 = r19
            r9 = r25
            r10 = r26
            r11 = r27
            r13 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.GoogleStoreProduct.<init>(java.lang.String, java.lang.String, com.revenuecat.purchases.ProductType, com.revenuecat.purchases.models.Price, java.lang.String, java.lang.String, java.lang.String, com.revenuecat.purchases.models.Period, com.revenuecat.purchases.models.SubscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption, com.android.billingclient.api.h, java.lang.String):void");
    }

    @C6521e
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price2, String str3, String str4, String str5, Period period2, SubscriptionOptions subscriptionOptions2, SubscriptionOption subscriptionOption, C3201h hVar, String str6, PresentedOfferingContext presentedOfferingContext2) {
        C6496s.h(str, "productId");
        C6496s.h(productType, "type");
        C6496s.h(price2, b.f37501x);
        C6496s.h(str3, "name");
        C6496s.h(str4, b.f37461S);
        C6496s.h(str5, b.f37480c);
        C6496s.h(hVar, "productDetails");
        this.productId = str;
        this.basePlanId = str2;
        this.type = productType;
        this.price = price2;
        this.name = str3;
        this.title = str4;
        this.description = str5;
        this.period = period2;
        this.subscriptionOptions = subscriptionOptions2;
        this.defaultOption = subscriptionOption;
        this.productDetails = hVar;
        this.presentedOfferingIdentifier = str6;
        this.presentedOfferingContext = presentedOfferingContext2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GoogleStoreProduct(java.lang.String r18, java.lang.String r19, com.revenuecat.purchases.ProductType r20, com.revenuecat.purchases.models.Price r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, com.revenuecat.purchases.models.Period r25, com.revenuecat.purchases.models.SubscriptionOptions r26, com.revenuecat.purchases.models.SubscriptionOption r27, com.android.billingclient.api.C3201h r28, java.lang.String r29, com.revenuecat.purchases.PresentedOfferingContext r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r15 = r2
            goto L_0x000b
        L_0x0009:
            r15 = r29
        L_0x000b:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0012
            r16 = r2
            goto L_0x0014
        L_0x0012:
            r16 = r30
        L_0x0014:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r3.<init>((java.lang.String) r4, (java.lang.String) r5, (com.revenuecat.purchases.ProductType) r6, (com.revenuecat.purchases.models.Price) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (com.revenuecat.purchases.models.Period) r11, (com.revenuecat.purchases.models.SubscriptionOptions) r12, (com.revenuecat.purchases.models.SubscriptionOption) r13, (com.android.billingclient.api.C3201h) r14, (java.lang.String) r15, (com.revenuecat.purchases.PresentedOfferingContext) r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.GoogleStoreProduct.<init>(java.lang.String, java.lang.String, com.revenuecat.purchases.ProductType, com.revenuecat.purchases.models.Price, java.lang.String, java.lang.String, java.lang.String, com.revenuecat.purchases.models.Period, com.revenuecat.purchases.models.SubscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption, com.android.billingclient.api.h, java.lang.String, com.revenuecat.purchases.PresentedOfferingContext, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price2, String str3, String str4, String str5, Period period2, SubscriptionOptions subscriptionOptions2, SubscriptionOption subscriptionOption, C3201h hVar, PresentedOfferingContext presentedOfferingContext2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, productType, price2, str3, str4, str5, period2, subscriptionOptions2, subscriptionOption, hVar, (i10 & 2048) != 0 ? null : presentedOfferingContext2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price2, String str3, String str4, String str5, Period period2, SubscriptionOptions subscriptionOptions2, SubscriptionOption subscriptionOption, C3201h hVar, PresentedOfferingContext presentedOfferingContext2) {
        this(str, str2, productType, price2, str3, str4, str5, period2, subscriptionOptions2, subscriptionOption, hVar, presentedOfferingContext2 != null ? presentedOfferingContext2.getOfferingIdentifier() : null, presentedOfferingContext2);
        C6496s.h(str, "productId");
        C6496s.h(productType, "type");
        C6496s.h(price2, b.f37501x);
        C6496s.h(str3, "name");
        C6496s.h(str4, b.f37461S);
        C6496s.h(str5, b.f37480c);
        C6496s.h(hVar, "productDetails");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price2, String str3, String str4, Period period2, SubscriptionOptions subscriptionOptions2, SubscriptionOption subscriptionOption, C3201h hVar, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, productType, price2, str3, str4, period2, subscriptionOptions2, subscriptionOption, hVar, (i10 & 1024) != 0 ? null : str5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @lf.C6521e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleStoreProduct(java.lang.String r16, java.lang.String r17, com.revenuecat.purchases.ProductType r18, com.revenuecat.purchases.models.Price r19, java.lang.String r20, java.lang.String r21, com.revenuecat.purchases.models.Period r22, com.revenuecat.purchases.models.SubscriptionOptions r23, com.revenuecat.purchases.models.SubscriptionOption r24, com.android.billingclient.api.C3201h r25, java.lang.String r26) {
        /*
            r15 = this;
            r0 = r26
            java.lang.String r1 = "productId"
            r3 = r16
            kotlin.jvm.internal.C6496s.h(r3, r1)
            java.lang.String r1 = "type"
            r5 = r18
            kotlin.jvm.internal.C6496s.h(r5, r1)
            java.lang.String r1 = "price"
            r6 = r19
            kotlin.jvm.internal.C6496s.h(r6, r1)
            java.lang.String r1 = "title"
            r8 = r20
            kotlin.jvm.internal.C6496s.h(r8, r1)
            java.lang.String r1 = "description"
            r9 = r21
            kotlin.jvm.internal.C6496s.h(r9, r1)
            java.lang.String r1 = "productDetails"
            r13 = r25
            kotlin.jvm.internal.C6496s.h(r13, r1)
            if (r0 == 0) goto L_0x0035
            com.revenuecat.purchases.PresentedOfferingContext r1 = new com.revenuecat.purchases.PresentedOfferingContext
            r1.<init>(r0)
            r14 = r1
            goto L_0x0037
        L_0x0035:
            r0 = 0
            r14 = r0
        L_0x0037:
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (com.revenuecat.purchases.ProductType) r5, (com.revenuecat.purchases.models.Price) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (com.revenuecat.purchases.models.Period) r10, (com.revenuecat.purchases.models.SubscriptionOptions) r11, (com.revenuecat.purchases.models.SubscriptionOption) r12, (com.android.billingclient.api.C3201h) r13, (com.revenuecat.purchases.PresentedOfferingContext) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.GoogleStoreProduct.<init>(java.lang.String, java.lang.String, com.revenuecat.purchases.ProductType, com.revenuecat.purchases.models.Price, java.lang.String, java.lang.String, com.revenuecat.purchases.models.Period, com.revenuecat.purchases.models.SubscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption, com.android.billingclient.api.h, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private GoogleStoreProduct(com.revenuecat.purchases.models.GoogleStoreProduct r14, com.revenuecat.purchases.models.SubscriptionOption r15, com.revenuecat.purchases.models.SubscriptionOptions r16, com.revenuecat.purchases.PresentedOfferingContext r17) {
        /*
            r13 = this;
            r0 = r14
            java.lang.String r1 = r0.productId
            java.lang.String r2 = r0.basePlanId
            com.revenuecat.purchases.ProductType r3 = r14.getType()
            com.revenuecat.purchases.models.Price r4 = r14.getPrice()
            java.lang.String r5 = r14.getName()
            java.lang.String r6 = r14.getTitle()
            java.lang.String r7 = r14.getDescription()
            com.revenuecat.purchases.models.Period r8 = r14.getPeriod()
            com.android.billingclient.api.h r11 = r0.productDetails
            r0 = r13
            r9 = r16
            r10 = r15
            r12 = r17
            r0.<init>((java.lang.String) r1, (java.lang.String) r2, (com.revenuecat.purchases.ProductType) r3, (com.revenuecat.purchases.models.Price) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (com.revenuecat.purchases.models.Period) r8, (com.revenuecat.purchases.models.SubscriptionOptions) r9, (com.revenuecat.purchases.models.SubscriptionOption) r10, (com.android.billingclient.api.C3201h) r11, (com.revenuecat.purchases.PresentedOfferingContext) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.GoogleStoreProduct.<init>(com.revenuecat.purchases.models.GoogleStoreProduct, com.revenuecat.purchases.models.SubscriptionOption, com.revenuecat.purchases.models.SubscriptionOptions, com.revenuecat.purchases.PresentedOfferingContext):void");
    }
}
