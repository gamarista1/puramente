package com.revenuecat.purchases.models;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import mf.C6565s;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fBO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\n\u00102\u001a\u0004\u0018\u00010*H\u0002J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÂ\u0003J_\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0010\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u0003H\u0017J\u0012\u0010>\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0016\u0010)\u001a\u0004\u0018\u00010*8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0014R\u0014\u0010.\u001a\u00020/8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006F"}, d2 = {"Lcom/revenuecat/purchases/models/TestStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", "id", "", "title", "description", "price", "Lcom/revenuecat/purchases/models/Price;", "period", "Lcom/revenuecat/purchases/models/Period;", "freeTrialPeriod", "introPrice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;)V", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;)V", "defaultOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDefaultOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDescription", "()Ljava/lang/String;", "getId", "getName", "getPeriod", "()Lcom/revenuecat/purchases/models/Period;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "getPresentedOfferingIdentifier", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "sku", "getSku", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getSubscriptionOptions", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getTitle", "type", "Lcom/revenuecat/purchases/ProductType;", "getType", "()Lcom/revenuecat/purchases/ProductType;", "buildSubscriptionOptions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copyWithOfferingId", "offeringId", "copyWithPresentedOfferingContext", "equals", "", "other", "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TestStoreProduct implements StoreProduct {
    private final String description;
    private final Period freeTrialPeriod;

    /* renamed from: id  reason: collision with root package name */
    private final String f59540id;
    private final Price introPrice;
    private final String name;
    private final Period period;
    private final Price price;
    private final String title;

    public TestStoreProduct(String str, String str2, String str3, String str4, Price price2, Period period2, Period period3, Price price3) {
        C6496s.h(str, "id");
        C6496s.h(str2, "name");
        C6496s.h(str3, b.f37461S);
        C6496s.h(str4, b.f37480c);
        C6496s.h(price2, b.f37501x);
        this.f59540id = str;
        this.name = str2;
        this.title = str3;
        this.description = str4;
        this.price = price2;
        this.period = period2;
        this.freeTrialPeriod = period3;
        this.introPrice = price3;
    }

    private final SubscriptionOptions buildSubscriptionOptions() {
        PricingPhase pricingPhase;
        PricingPhase pricingPhase2;
        TestSubscriptionOption testSubscriptionOption = null;
        if (getPeriod() == null) {
            return null;
        }
        Period period2 = this.freeTrialPeriod;
        if (period2 != null) {
            pricingPhase = new PricingPhase(period2, RecurrenceMode.FINITE_RECURRING, 1, new Price("Free", 0, getPrice().getCurrencyCode()));
        } else {
            pricingPhase = null;
        }
        Price price2 = this.introPrice;
        if (price2 != null) {
            pricingPhase2 = new PricingPhase(new Period(1, Period.Unit.MONTH, "P1M"), RecurrenceMode.FINITE_RECURRING, 1, price2);
        } else {
            pricingPhase2 = null;
        }
        PricingPhase pricingPhase3 = new PricingPhase(getPeriod(), RecurrenceMode.INFINITE_RECURRING, (Integer) null, getPrice());
        TestSubscriptionOption testSubscriptionOption2 = new TestSubscriptionOption(getId(), C6565s.s(pricingPhase, pricingPhase2, pricingPhase3), (String) null, (List) null, (PresentedOfferingContext) null, (InstallmentsInfo) null, 60, (DefaultConstructorMarker) null);
        if (!(this.freeTrialPeriod == null && pricingPhase2 == null)) {
            testSubscriptionOption = testSubscriptionOption2;
        }
        return new SubscriptionOptions(C6565s.s(testSubscriptionOption, new TestSubscriptionOption(getId(), C6565s.e(pricingPhase3), (String) null, (List) null, (PresentedOfferingContext) null, (InstallmentsInfo) null, 60, (DefaultConstructorMarker) null)));
    }

    private final Period component7() {
        return this.freeTrialPeriod;
    }

    private final Price component8() {
        return this.introPrice;
    }

    public static /* synthetic */ TestStoreProduct copy$default(TestStoreProduct testStoreProduct, String str, String str2, String str3, String str4, Price price2, Period period2, Period period3, Price price3, int i10, Object obj) {
        TestStoreProduct testStoreProduct2 = testStoreProduct;
        int i11 = i10;
        return testStoreProduct.copy((i11 & 1) != 0 ? testStoreProduct2.f59540id : str, (i11 & 2) != 0 ? testStoreProduct2.name : str2, (i11 & 4) != 0 ? testStoreProduct2.title : str3, (i11 & 8) != 0 ? testStoreProduct2.description : str4, (i11 & 16) != 0 ? testStoreProduct2.price : price2, (i11 & 32) != 0 ? testStoreProduct2.period : period2, (i11 & 64) != 0 ? testStoreProduct2.freeTrialPeriod : period3, (i11 & 128) != 0 ? testStoreProduct2.introPrice : price3);
    }

    @C6521e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public final String component1() {
        return this.f59540id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final Price component5() {
        return this.price;
    }

    public final Period component6() {
        return this.period;
    }

    public final TestStoreProduct copy(String str, String str2, String str3, String str4, Price price2, Period period2, Period period3, Price price3) {
        C6496s.h(str, "id");
        C6496s.h(str2, "name");
        C6496s.h(str3, b.f37461S);
        C6496s.h(str4, b.f37480c);
        C6496s.h(price2, b.f37501x);
        return new TestStoreProduct(str, str2, str3, str4, price2, period2, period3, price3);
    }

    @C6521e
    public StoreProduct copyWithOfferingId(String str) {
        C6496s.h(str, "offeringId");
        return copyWithPresentedOfferingContext(new PresentedOfferingContext(str));
    }

    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestStoreProduct)) {
            return false;
        }
        TestStoreProduct testStoreProduct = (TestStoreProduct) obj;
        return C6496s.c(this.f59540id, testStoreProduct.f59540id) && C6496s.c(this.name, testStoreProduct.name) && C6496s.c(this.title, testStoreProduct.title) && C6496s.c(this.description, testStoreProduct.description) && C6496s.c(this.price, testStoreProduct.price) && C6496s.c(this.period, testStoreProduct.period) && C6496s.c(this.freeTrialPeriod, testStoreProduct.freeTrialPeriod) && C6496s.c(this.introPrice, testStoreProduct.introPrice);
    }

    public String formattedPricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.formattedPricePerMonth(this, locale);
    }

    public SubscriptionOption getDefaultOption() {
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            return subscriptionOptions.getDefaultOffer();
        }
        return null;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.f59540id;
    }

    public String getName() {
        return this.name;
    }

    public Period getPeriod() {
        return this.period;
    }

    public PresentedOfferingContext getPresentedOfferingContext() {
        return null;
    }

    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    public Price getPrice() {
        return this.price;
    }

    public PurchasingData getPurchasingData() {
        return new TestStoreProduct$purchasingData$1(this);
    }

    public String getSku() {
        return getId();
    }

    public SubscriptionOptions getSubscriptionOptions() {
        return buildSubscriptionOptions();
    }

    public String getTitle() {
        return this.title;
    }

    public ProductType getType() {
        if (getPeriod() == null) {
            return ProductType.INAPP;
        }
        return ProductType.SUBS;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f59540id.hashCode() * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.price.hashCode()) * 31;
        Period period2 = this.period;
        int i10 = 0;
        int hashCode2 = (hashCode + (period2 == null ? 0 : period2.hashCode())) * 31;
        Period period3 = this.freeTrialPeriod;
        int hashCode3 = (hashCode2 + (period3 == null ? 0 : period3.hashCode())) * 31;
        Price price2 = this.introPrice;
        if (price2 != null) {
            i10 = price2.hashCode();
        }
        return hashCode3 + i10;
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
        return "TestStoreProduct(id=" + this.f59540id + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", price=" + this.price + ", period=" + this.period + ", freeTrialPeriod=" + this.freeTrialPeriod + ", introPrice=" + this.introPrice + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TestStoreProduct(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, com.revenuecat.purchases.models.Price r17, com.revenuecat.purchases.models.Period r18, com.revenuecat.purchases.models.Period r19, com.revenuecat.purchases.models.Price r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r10 = r2
            goto L_0x000b
        L_0x0009:
            r10 = r19
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0011
            r11 = r2
            goto L_0x0013
        L_0x0011:
            r11 = r20
        L_0x0013:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.TestStoreProduct.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.revenuecat.purchases.models.Price, com.revenuecat.purchases.models.Period, com.revenuecat.purchases.models.Period, com.revenuecat.purchases.models.Price, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, Price price2, Period period2, Period period3, Price price3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, price2, period2, (i10 & 32) != 0 ? null : period3, (i10 & 64) != 0 ? null : price3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C6521e
    public TestStoreProduct(String str, String str2, String str3, Price price2, Period period2, Period period3, Price price3) {
        this(str, str2, str2, str3, price2, period2, period3, price3);
        C6496s.h(str, "id");
        C6496s.h(str2, b.f37461S);
        C6496s.h(str3, b.f37480c);
        C6496s.h(price2, b.f37501x);
    }
}
