package com.revenuecat.purchases.amazon;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bg\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006<"}, d2 = {"Lcom/revenuecat/purchases/amazon/ComparableData;", "", "amazonStoreProduct", "Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;", "(Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;)V", "id", "", "type", "Lcom/revenuecat/purchases/ProductType;", "title", "description", "period", "Lcom/revenuecat/purchases/models/Period;", "price", "Lcom/revenuecat/purchases/models/Price;", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "defaultOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "iconUrl", "freeTrialPeriod", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "getDefaultOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDescription", "()Ljava/lang/String;", "getFreeTrialPeriod", "()Lcom/revenuecat/purchases/models/Period;", "getIconUrl", "getId", "getPeriod", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "getSubscriptionOptions", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getTitle", "getType", "()Lcom/revenuecat/purchases/ProductType;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ComparableData {
    private final SubscriptionOption defaultOption;
    private final String description;
    private final Period freeTrialPeriod;
    private final String iconUrl;

    /* renamed from: id  reason: collision with root package name */
    private final String f59463id;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Price price;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    public ComparableData(String str, ProductType productType, String str2, String str3, Period period2, Price price2, SubscriptionOptions subscriptionOptions2, SubscriptionOption subscriptionOption, String str4, Period period3, PresentedOfferingContext presentedOfferingContext2) {
        C6496s.h(str, "id");
        C6496s.h(productType, "type");
        C6496s.h(str2, b.f37461S);
        C6496s.h(str3, b.f37480c);
        C6496s.h(price2, b.f37501x);
        C6496s.h(str4, b.f37487j);
        this.f59463id = str;
        this.type = productType;
        this.title = str2;
        this.description = str3;
        this.period = period2;
        this.price = price2;
        this.subscriptionOptions = subscriptionOptions2;
        this.defaultOption = subscriptionOption;
        this.iconUrl = str4;
        this.freeTrialPeriod = period3;
        this.presentedOfferingContext = presentedOfferingContext2;
    }

    public static /* synthetic */ ComparableData copy$default(ComparableData comparableData, String str, ProductType productType, String str2, String str3, Period period2, Price price2, SubscriptionOptions subscriptionOptions2, SubscriptionOption subscriptionOption, String str4, Period period3, PresentedOfferingContext presentedOfferingContext2, int i10, Object obj) {
        ComparableData comparableData2 = comparableData;
        int i11 = i10;
        return comparableData.copy((i11 & 1) != 0 ? comparableData2.f59463id : str, (i11 & 2) != 0 ? comparableData2.type : productType, (i11 & 4) != 0 ? comparableData2.title : str2, (i11 & 8) != 0 ? comparableData2.description : str3, (i11 & 16) != 0 ? comparableData2.period : period2, (i11 & 32) != 0 ? comparableData2.price : price2, (i11 & 64) != 0 ? comparableData2.subscriptionOptions : subscriptionOptions2, (i11 & 128) != 0 ? comparableData2.defaultOption : subscriptionOption, (i11 & 256) != 0 ? comparableData2.iconUrl : str4, (i11 & 512) != 0 ? comparableData2.freeTrialPeriod : period3, (i11 & 1024) != 0 ? comparableData2.presentedOfferingContext : presentedOfferingContext2);
    }

    public final String component1() {
        return this.f59463id;
    }

    public final Period component10() {
        return this.freeTrialPeriod;
    }

    public final PresentedOfferingContext component11() {
        return this.presentedOfferingContext;
    }

    public final ProductType component2() {
        return this.type;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final Period component5() {
        return this.period;
    }

    public final Price component6() {
        return this.price;
    }

    public final SubscriptionOptions component7() {
        return this.subscriptionOptions;
    }

    public final SubscriptionOption component8() {
        return this.defaultOption;
    }

    public final String component9() {
        return this.iconUrl;
    }

    public final ComparableData copy(String str, ProductType productType, String str2, String str3, Period period2, Price price2, SubscriptionOptions subscriptionOptions2, SubscriptionOption subscriptionOption, String str4, Period period3, PresentedOfferingContext presentedOfferingContext2) {
        C6496s.h(str, "id");
        C6496s.h(productType, "type");
        String str5 = str2;
        C6496s.h(str5, b.f37461S);
        String str6 = str3;
        C6496s.h(str6, b.f37480c);
        Price price3 = price2;
        C6496s.h(price3, b.f37501x);
        String str7 = str4;
        C6496s.h(str7, b.f37487j);
        return new ComparableData(str, productType, str5, str6, period2, price3, subscriptionOptions2, subscriptionOption, str7, period3, presentedOfferingContext2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparableData)) {
            return false;
        }
        ComparableData comparableData = (ComparableData) obj;
        return C6496s.c(this.f59463id, comparableData.f59463id) && this.type == comparableData.type && C6496s.c(this.title, comparableData.title) && C6496s.c(this.description, comparableData.description) && C6496s.c(this.period, comparableData.period) && C6496s.c(this.price, comparableData.price) && C6496s.c(this.subscriptionOptions, comparableData.subscriptionOptions) && C6496s.c(this.defaultOption, comparableData.defaultOption) && C6496s.c(this.iconUrl, comparableData.iconUrl) && C6496s.c(this.freeTrialPeriod, comparableData.freeTrialPeriod) && C6496s.c(this.presentedOfferingContext, comparableData.presentedOfferingContext);
    }

    public final SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.f59463id;
    }

    public final Period getPeriod() {
        return this.period;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((this.f59463id.hashCode() * 31) + this.type.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        Period period2 = this.period;
        int i10 = 0;
        int hashCode2 = (((hashCode + (period2 == null ? 0 : period2.hashCode())) * 31) + this.price.hashCode()) * 31;
        SubscriptionOptions subscriptionOptions2 = this.subscriptionOptions;
        int hashCode3 = (hashCode2 + (subscriptionOptions2 == null ? 0 : subscriptionOptions2.hashCode())) * 31;
        SubscriptionOption subscriptionOption = this.defaultOption;
        int hashCode4 = (((hashCode3 + (subscriptionOption == null ? 0 : subscriptionOption.hashCode())) * 31) + this.iconUrl.hashCode()) * 31;
        Period period3 = this.freeTrialPeriod;
        int hashCode5 = (hashCode4 + (period3 == null ? 0 : period3.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext2 = this.presentedOfferingContext;
        if (presentedOfferingContext2 != null) {
            i10 = presentedOfferingContext2.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "ComparableData(id=" + this.f59463id + ", type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", price=" + this.price + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", iconUrl=" + this.iconUrl + ", freeTrialPeriod=" + this.freeTrialPeriod + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComparableData(AmazonStoreProduct amazonStoreProduct) {
        this(amazonStoreProduct.getId(), amazonStoreProduct.getType(), amazonStoreProduct.getTitle(), amazonStoreProduct.getDescription(), amazonStoreProduct.getPeriod(), amazonStoreProduct.getPrice(), amazonStoreProduct.getSubscriptionOptions(), amazonStoreProduct.getDefaultOption(), amazonStoreProduct.getIconUrl(), amazonStoreProduct.getFreeTrialPeriod(), amazonStoreProduct.getPresentedOfferingContext());
        C6496s.h(amazonStoreProduct, "amazonStoreProduct");
    }
}
