package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.utils.PriceExtensionsKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001dR\u0013\u0010;\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/revenuecat/purchases/models/PricingPhase;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/Period;", "billingPeriod", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "recurrenceMode", "", "billingCycleCount", "Lcom/revenuecat/purchases/models/Price;", "price", "<init>", "(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)V", "Ljava/util/Locale;", "locale", "pricePerDay", "(Ljava/util/Locale;)Lcom/revenuecat/purchases/models/Price;", "pricePerWeek", "pricePerMonth", "pricePerYear", "", "formattedPriceInMonths", "(Ljava/util/Locale;)Ljava/lang/String;", "component1", "()Lcom/revenuecat/purchases/models/Period;", "component2", "()Lcom/revenuecat/purchases/models/RecurrenceMode;", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/revenuecat/purchases/models/Price;", "copy", "(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)Lcom/revenuecat/purchases/models/PricingPhase;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "getRecurrenceMode", "Ljava/lang/Integer;", "getBillingCycleCount", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "Lcom/revenuecat/purchases/models/OfferPaymentMode;", "getOfferPaymentMode", "()Lcom/revenuecat/purchases/models/OfferPaymentMode;", "offerPaymentMode", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PricingPhase implements Parcelable {
    public static final Parcelable.Creator<PricingPhase> CREATOR = new Creator();
    private final Integer billingCycleCount;
    private final Period billingPeriod;
    private final Price price;
    private final RecurrenceMode recurrenceMode;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PricingPhase> {
        public final PricingPhase createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new PricingPhase(Period.CREATOR.createFromParcel(parcel), RecurrenceMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), Price.CREATOR.createFromParcel(parcel));
        }

        public final PricingPhase[] newArray(int i10) {
            return new PricingPhase[i10];
        }
    }

    public PricingPhase(Period period, RecurrenceMode recurrenceMode2, Integer num, Price price2) {
        C6496s.h(period, "billingPeriod");
        C6496s.h(recurrenceMode2, "recurrenceMode");
        C6496s.h(price2, b.f37501x);
        this.billingPeriod = period;
        this.recurrenceMode = recurrenceMode2;
        this.billingCycleCount = num;
        this.price = price2;
    }

    public static /* synthetic */ PricingPhase copy$default(PricingPhase pricingPhase, Period period, RecurrenceMode recurrenceMode2, Integer num, Price price2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            period = pricingPhase.billingPeriod;
        }
        if ((i10 & 2) != 0) {
            recurrenceMode2 = pricingPhase.recurrenceMode;
        }
        if ((i10 & 4) != 0) {
            num = pricingPhase.billingCycleCount;
        }
        if ((i10 & 8) != 0) {
            price2 = pricingPhase.price;
        }
        return pricingPhase.copy(period, recurrenceMode2, num, price2);
    }

    public static /* synthetic */ String formattedPriceInMonths$default(PricingPhase pricingPhase, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            C6496s.g(locale, "getDefault()");
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public static /* synthetic */ Price pricePerDay$default(PricingPhase pricingPhase, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            C6496s.g(locale, "getDefault()");
        }
        return pricingPhase.pricePerDay(locale);
    }

    public static /* synthetic */ Price pricePerMonth$default(PricingPhase pricingPhase, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            C6496s.g(locale, "getDefault()");
        }
        return pricingPhase.pricePerMonth(locale);
    }

    public static /* synthetic */ Price pricePerWeek$default(PricingPhase pricingPhase, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            C6496s.g(locale, "getDefault()");
        }
        return pricingPhase.pricePerWeek(locale);
    }

    public static /* synthetic */ Price pricePerYear$default(PricingPhase pricingPhase, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            C6496s.g(locale, "getDefault()");
        }
        return pricingPhase.pricePerYear(locale);
    }

    public final Period component1() {
        return this.billingPeriod;
    }

    public final RecurrenceMode component2() {
        return this.recurrenceMode;
    }

    public final Integer component3() {
        return this.billingCycleCount;
    }

    public final Price component4() {
        return this.price;
    }

    public final PricingPhase copy(Period period, RecurrenceMode recurrenceMode2, Integer num, Price price2) {
        C6496s.h(period, "billingPeriod");
        C6496s.h(recurrenceMode2, "recurrenceMode");
        C6496s.h(price2, b.f37501x);
        return new PricingPhase(period, recurrenceMode2, num, price2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricingPhase)) {
            return false;
        }
        PricingPhase pricingPhase = (PricingPhase) obj;
        return C6496s.c(this.billingPeriod, pricingPhase.billingPeriod) && this.recurrenceMode == pricingPhase.recurrenceMode && C6496s.c(this.billingCycleCount, pricingPhase.billingCycleCount) && C6496s.c(this.price, pricingPhase.price);
    }

    @C6521e
    public final String formattedPriceInMonths() {
        return formattedPriceInMonths$default(this, (Locale) null, 1, (Object) null);
    }

    public final Integer getBillingCycleCount() {
        return this.billingCycleCount;
    }

    public final Period getBillingPeriod() {
        return this.billingPeriod;
    }

    public final OfferPaymentMode getOfferPaymentMode() {
        if (this.recurrenceMode != RecurrenceMode.FINITE_RECURRING) {
            return null;
        }
        if (this.price.getAmountMicros() == 0) {
            return OfferPaymentMode.FREE_TRIAL;
        }
        Integer num = this.billingCycleCount;
        if (num != null && num.intValue() == 1) {
            return OfferPaymentMode.SINGLE_PAYMENT;
        }
        Integer num2 = this.billingCycleCount;
        if (num2 == null || num2.intValue() <= 1) {
            return null;
        }
        return OfferPaymentMode.DISCOUNTED_RECURRING_PAYMENT;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final RecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public int hashCode() {
        int hashCode = ((this.billingPeriod.hashCode() * 31) + this.recurrenceMode.hashCode()) * 31;
        Integer num = this.billingCycleCount;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.price.hashCode();
    }

    public final Price pricePerDay() {
        return pricePerDay$default(this, (Locale) null, 1, (Object) null);
    }

    public final Price pricePerMonth() {
        return pricePerMonth$default(this, (Locale) null, 1, (Object) null);
    }

    public final Price pricePerWeek() {
        return pricePerWeek$default(this, (Locale) null, 1, (Object) null);
    }

    public final Price pricePerYear() {
        return pricePerYear$default(this, (Locale) null, 1, (Object) null);
    }

    public String toString() {
        return "PricingPhase(billingPeriod=" + this.billingPeriod + ", recurrenceMode=" + this.recurrenceMode + ", billingCycleCount=" + this.billingCycleCount + ", price=" + this.price + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int intValue;
        C6496s.h(parcel, "out");
        this.billingPeriod.writeToParcel(parcel, i10);
        parcel.writeString(this.recurrenceMode.name());
        Integer num = this.billingCycleCount;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        this.price.writeToParcel(parcel, i10);
    }

    @C6521e
    public final String formattedPriceInMonths(Locale locale) {
        C6496s.h(locale, "locale");
        return pricePerMonth(locale).getFormatted();
    }

    public final Price pricePerDay(Locale locale) {
        C6496s.h(locale, "locale");
        return PriceExtensionsKt.pricePerDay(this.price, this.billingPeriod, locale);
    }

    public final Price pricePerMonth(Locale locale) {
        C6496s.h(locale, "locale");
        return PriceExtensionsKt.pricePerMonth(this.price, this.billingPeriod, locale);
    }

    public final Price pricePerWeek(Locale locale) {
        C6496s.h(locale, "locale");
        return PriceExtensionsKt.pricePerWeek(this.price, this.billingPeriod, locale);
    }

    public final Price pricePerYear(Locale locale) {
        C6496s.h(locale, "locale");
        return PriceExtensionsKt.pricePerYear(this.price, this.billingPeriod, locale);
    }
}
