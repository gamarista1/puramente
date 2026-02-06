package com.revenuecat.purchases.models;

import Sg.p;
import com.android.billingclient.api.C3201h;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.SubscriptionOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012BW\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0014B\u001b\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J|\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u001cR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b6\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b9\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010$R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\f\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010\u0018R\u0014\u0010C\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0018R\u0014\u0010G\u001a\u00020D8VX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "", "productId", "basePlanId", "offerId", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "pricingPhases", "tags", "Lcom/android/billingclient/api/h;", "productDetails", "offerToken", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "installmentsInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/android/billingclient/api/h;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;)V", "presentedOfferingId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/android/billingclient/api/h;Ljava/lang/String;Ljava/lang/String;)V", "subscriptionOption", "(Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/android/billingclient/api/h;", "component7", "component8", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "component9", "()Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/android/billingclient/api/h;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getBasePlanId", "getOfferId", "Ljava/util/List;", "getPricingPhases", "getTags", "Lcom/android/billingclient/api/h;", "getProductDetails", "getOfferToken", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getInstallmentsInfo", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "presentedOfferingIdentifier", "getId", "id", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GoogleSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final GoogleInstallmentsInfo installmentsInfo;
    private final String offerId;
    private final String offerToken;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<PricingPhase> pricingPhases;
    private final C3201h productDetails;
    private final String productId;
    private final List<String> tags;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleSubscriptionOption(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List<com.revenuecat.purchases.models.PricingPhase> r17, java.util.List<java.lang.String> r18, com.android.billingclient.api.C3201h r19, java.lang.String r20) {
        /*
            r13 = this;
            java.lang.String r0 = "productId"
            r2 = r14
            kotlin.jvm.internal.C6496s.h(r14, r0)
            java.lang.String r0 = "basePlanId"
            r3 = r15
            kotlin.jvm.internal.C6496s.h(r15, r0)
            java.lang.String r0 = "pricingPhases"
            r5 = r17
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "tags"
            r6 = r18
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.String r0 = "productDetails"
            r7 = r19
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "offerToken"
            r8 = r20
            kotlin.jvm.internal.C6496s.h(r8, r0)
            r11 = 384(0x180, float:5.38E-43)
            r12 = 0
            r9 = 0
            r10 = 0
            r1 = r13
            r4 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.GoogleSubscriptionOption.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, com.android.billingclient.api.h, java.lang.String):void");
    }

    public static /* synthetic */ GoogleSubscriptionOption copy$default(GoogleSubscriptionOption googleSubscriptionOption, String str, String str2, String str3, List list, List list2, C3201h hVar, String str4, PresentedOfferingContext presentedOfferingContext2, GoogleInstallmentsInfo googleInstallmentsInfo, int i10, Object obj) {
        GoogleSubscriptionOption googleSubscriptionOption2 = googleSubscriptionOption;
        int i11 = i10;
        return googleSubscriptionOption.copy((i11 & 1) != 0 ? googleSubscriptionOption2.productId : str, (i11 & 2) != 0 ? googleSubscriptionOption2.basePlanId : str2, (i11 & 4) != 0 ? googleSubscriptionOption2.offerId : str3, (i11 & 8) != 0 ? googleSubscriptionOption2.pricingPhases : list, (i11 & 16) != 0 ? googleSubscriptionOption2.tags : list2, (i11 & 32) != 0 ? googleSubscriptionOption2.productDetails : hVar, (i11 & 64) != 0 ? googleSubscriptionOption2.offerToken : str4, (i11 & 128) != 0 ? googleSubscriptionOption2.presentedOfferingContext : presentedOfferingContext2, (i11 & 256) != 0 ? googleSubscriptionOption2.installmentsInfo : googleInstallmentsInfo);
    }

    @C6521e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final String component3() {
        return this.offerId;
    }

    public final List<PricingPhase> component4() {
        return this.pricingPhases;
    }

    public final List<String> component5() {
        return this.tags;
    }

    public final C3201h component6() {
        return this.productDetails;
    }

    public final String component7() {
        return this.offerToken;
    }

    public final PresentedOfferingContext component8() {
        return this.presentedOfferingContext;
    }

    public final GoogleInstallmentsInfo component9() {
        return this.installmentsInfo;
    }

    public final GoogleSubscriptionOption copy(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, C3201h hVar, String str4, PresentedOfferingContext presentedOfferingContext2, GoogleInstallmentsInfo googleInstallmentsInfo) {
        C6496s.h(str, "productId");
        C6496s.h(str2, "basePlanId");
        C6496s.h(list, "pricingPhases");
        List<String> list3 = list2;
        C6496s.h(list3, "tags");
        C3201h hVar2 = hVar;
        C6496s.h(hVar2, "productDetails");
        String str5 = str4;
        C6496s.h(str5, "offerToken");
        return new GoogleSubscriptionOption(str, str2, str3, list, list3, hVar2, str5, presentedOfferingContext2, googleInstallmentsInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleSubscriptionOption)) {
            return false;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) obj;
        return C6496s.c(this.productId, googleSubscriptionOption.productId) && C6496s.c(this.basePlanId, googleSubscriptionOption.basePlanId) && C6496s.c(this.offerId, googleSubscriptionOption.offerId) && C6496s.c(this.pricingPhases, googleSubscriptionOption.pricingPhases) && C6496s.c(this.tags, googleSubscriptionOption.tags) && C6496s.c(this.productDetails, googleSubscriptionOption.productDetails) && C6496s.c(this.offerToken, googleSubscriptionOption.offerToken) && C6496s.c(this.presentedOfferingContext, googleSubscriptionOption.presentedOfferingContext) && C6496s.c(this.installmentsInfo, googleSubscriptionOption.installmentsInfo);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public Period getBillingPeriod() {
        return SubscriptionOption.DefaultImpls.getBillingPeriod(this);
    }

    public PricingPhase getFreePhase() {
        return SubscriptionOption.DefaultImpls.getFreePhase(this);
    }

    public PricingPhase getFullPricePhase() {
        return SubscriptionOption.DefaultImpls.getFullPricePhase(this);
    }

    public String getId() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.basePlanId);
        String str2 = this.offerId;
        if (str2 == null || p.d0(str2)) {
            str = "";
        } else {
            str = ':' + this.offerId;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public PricingPhase getIntroPhase() {
        return SubscriptionOption.DefaultImpls.getIntroPhase(this);
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext2 = getPresentedOfferingContext();
        if (presentedOfferingContext2 != null) {
            return presentedOfferingContext2.getOfferingIdentifier();
        }
        return null;
    }

    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final C3201h getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    public PurchasingData getPurchasingData() {
        return new GooglePurchasingData.Subscription(this.productId, getId(), this.productDetails, this.offerToken);
    }

    public List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int hashCode = ((this.productId.hashCode() * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        int i10 = 0;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.pricingPhases.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.offerToken.hashCode()) * 31;
        PresentedOfferingContext presentedOfferingContext2 = this.presentedOfferingContext;
        int hashCode3 = (hashCode2 + (presentedOfferingContext2 == null ? 0 : presentedOfferingContext2.hashCode())) * 31;
        GoogleInstallmentsInfo googleInstallmentsInfo = this.installmentsInfo;
        if (googleInstallmentsInfo != null) {
            i10 = googleInstallmentsInfo.hashCode();
        }
        return hashCode3 + i10;
    }

    public boolean isBasePlan() {
        return SubscriptionOption.DefaultImpls.isBasePlan(this);
    }

    public boolean isPrepaid() {
        return SubscriptionOption.DefaultImpls.isPrepaid(this);
    }

    public String toString() {
        return "GoogleSubscriptionOption(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", pricingPhases=" + this.pricingPhases + ", tags=" + this.tags + ", productDetails=" + this.productDetails + ", offerToken=" + this.offerToken + ", presentedOfferingContext=" + this.presentedOfferingContext + ", installmentsInfo=" + this.installmentsInfo + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleSubscriptionOption(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List<com.revenuecat.purchases.models.PricingPhase> r17, java.util.List<java.lang.String> r18, com.android.billingclient.api.C3201h r19, java.lang.String r20, com.revenuecat.purchases.PresentedOfferingContext r21) {
        /*
            r13 = this;
            java.lang.String r0 = "productId"
            r2 = r14
            kotlin.jvm.internal.C6496s.h(r14, r0)
            java.lang.String r0 = "basePlanId"
            r3 = r15
            kotlin.jvm.internal.C6496s.h(r15, r0)
            java.lang.String r0 = "pricingPhases"
            r5 = r17
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "tags"
            r6 = r18
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.String r0 = "productDetails"
            r7 = r19
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "offerToken"
            r8 = r20
            kotlin.jvm.internal.C6496s.h(r8, r0)
            r11 = 256(0x100, float:3.59E-43)
            r12 = 0
            r10 = 0
            r1 = r13
            r4 = r16
            r9 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.GoogleSubscriptionOption.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, com.android.billingclient.api.h, java.lang.String, com.revenuecat.purchases.PresentedOfferingContext):void");
    }

    public GoogleInstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    public GoogleSubscriptionOption(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, C3201h hVar, String str4, PresentedOfferingContext presentedOfferingContext2, GoogleInstallmentsInfo googleInstallmentsInfo) {
        C6496s.h(str, "productId");
        C6496s.h(str2, "basePlanId");
        C6496s.h(list, "pricingPhases");
        C6496s.h(list2, "tags");
        C6496s.h(hVar, "productDetails");
        C6496s.h(str4, "offerToken");
        this.productId = str;
        this.basePlanId = str2;
        this.offerId = str3;
        this.pricingPhases = list;
        this.tags = list2;
        this.productDetails = hVar;
        this.offerToken = str4;
        this.presentedOfferingContext = presentedOfferingContext2;
        this.installmentsInfo = googleInstallmentsInfo;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GoogleSubscriptionOption(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, java.util.List r18, com.android.billingclient.api.C3201h r19, java.lang.String r20, com.revenuecat.purchases.PresentedOfferingContext r21, com.revenuecat.purchases.models.GoogleInstallmentsInfo r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r21
        L_0x000b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0011
            r12 = r2
            goto L_0x0013
        L_0x0011:
            r12 = r22
        L_0x0013:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.GoogleSubscriptionOption.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, com.android.billingclient.api.h, java.lang.String, com.revenuecat.purchases.PresentedOfferingContext, com.revenuecat.purchases.models.GoogleInstallmentsInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @lf.C6521e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleSubscriptionOption(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.List<com.revenuecat.purchases.models.PricingPhase> r18, java.util.List<java.lang.String> r19, com.android.billingclient.api.C3201h r20, java.lang.String r21, java.lang.String r22) {
        /*
            r14 = this;
            r0 = r22
            java.lang.String r1 = "productId"
            r3 = r15
            kotlin.jvm.internal.C6496s.h(r15, r1)
            java.lang.String r1 = "basePlanId"
            r4 = r16
            kotlin.jvm.internal.C6496s.h(r4, r1)
            java.lang.String r1 = "pricingPhases"
            r6 = r18
            kotlin.jvm.internal.C6496s.h(r6, r1)
            java.lang.String r1 = "tags"
            r7 = r19
            kotlin.jvm.internal.C6496s.h(r7, r1)
            java.lang.String r1 = "productDetails"
            r8 = r20
            kotlin.jvm.internal.C6496s.h(r8, r1)
            java.lang.String r1 = "offerToken"
            r9 = r21
            kotlin.jvm.internal.C6496s.h(r9, r1)
            java.lang.String r1 = "presentedOfferingId"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            com.revenuecat.purchases.PresentedOfferingContext r10 = new com.revenuecat.purchases.PresentedOfferingContext
            r10.<init>(r0)
            r12 = 256(0x100, float:3.59E-43)
            r13 = 0
            r11 = 0
            r2 = r14
            r5 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.GoogleSubscriptionOption.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, com.android.billingclient.api.h, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(GoogleSubscriptionOption googleSubscriptionOption, PresentedOfferingContext presentedOfferingContext2) {
        this(googleSubscriptionOption.productId, googleSubscriptionOption.basePlanId, googleSubscriptionOption.offerId, googleSubscriptionOption.getPricingPhases(), googleSubscriptionOption.getTags(), googleSubscriptionOption.productDetails, googleSubscriptionOption.offerToken, presentedOfferingContext2, googleSubscriptionOption.getInstallmentsInfo());
        C6496s.h(googleSubscriptionOption, "subscriptionOption");
    }
}
