package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"MICRO_MULTIPLIER", "", "pricePerDay", "Lcom/revenuecat/purchases/models/Price;", "billingPeriod", "Lcom/revenuecat/purchases/models/Period;", "locale", "Ljava/util/Locale;", "pricePerMonth", "pricePerPeriod", "units", "pricePerWeek", "pricePerYear", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PriceExtensionsKt {
    private static final double MICRO_MULTIPLIER = 1000000.0d;

    public static final /* synthetic */ Price pricePerDay(Price price, Period period, Locale locale) {
        C6496s.h(price, "<this>");
        C6496s.h(period, "billingPeriod");
        C6496s.h(locale, "locale");
        return pricePerPeriod(price, period.getValueInDays(), locale);
    }

    public static final Price pricePerMonth(Price price, Period period, Locale locale) {
        C6496s.h(price, "<this>");
        C6496s.h(period, "billingPeriod");
        C6496s.h(locale, "locale");
        return pricePerPeriod(price, period.getValueInMonths(), locale);
    }

    private static final Price pricePerPeriod(Price price, double d10, Locale locale) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(price.getCurrencyCode()));
        double amountMicros = ((double) price.getAmountMicros()) / d10;
        String format = currencyInstance.format(amountMicros / MICRO_MULTIPLIER);
        C6496s.g(format, "formatted");
        return new Price(format, (long) amountMicros, price.getCurrencyCode());
    }

    public static final Price pricePerWeek(Price price, Period period, Locale locale) {
        C6496s.h(price, "<this>");
        C6496s.h(period, "billingPeriod");
        C6496s.h(locale, "locale");
        return pricePerPeriod(price, period.getValueInWeeks(), locale);
    }

    public static final Price pricePerYear(Price price, Period period, Locale locale) {
        C6496s.h(price, "<this>");
        C6496s.h(period, "billingPeriod");
        C6496s.h(locale, "locale");
        return pricePerPeriod(price, period.getValueInYears(), locale);
    }
}
