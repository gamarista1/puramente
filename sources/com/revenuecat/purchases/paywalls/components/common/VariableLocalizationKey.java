package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5985i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;

@C5985i
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b1\b\u0001\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "(Ljava/lang/String;I)V", "DAY", "DAILY", "DAY_SHORT", "WEEK", "WEEKLY", "WEEK_SHORT", "MONTH", "MONTHLY", "MONTH_SHORT", "YEAR", "YEARLY", "YEAR_SHORT", "ANNUAL", "ANNUALLY", "ANNUAL_SHORT", "LIFETIME", "FREE_PRICE", "PERCENT", "NUM_DAY_ZERO", "NUM_DAY_ONE", "NUM_DAY_TWO", "NUM_DAY_FEW", "NUM_DAY_MANY", "NUM_DAY_OTHER", "NUM_WEEK_ZERO", "NUM_WEEK_ONE", "NUM_WEEK_TWO", "NUM_WEEK_FEW", "NUM_WEEK_MANY", "NUM_WEEK_OTHER", "NUM_MONTH_ZERO", "NUM_MONTH_ONE", "NUM_MONTH_TWO", "NUM_MONTH_FEW", "NUM_MONTH_MANY", "NUM_MONTH_OTHER", "NUM_YEAR_ZERO", "NUM_YEAR_ONE", "NUM_YEAR_TWO", "NUM_YEAR_FEW", "NUM_YEAR_MANY", "NUM_YEAR_OTHER", "NUM_DAYS_SHORT", "NUM_WEEKS_SHORT", "NUM_MONTHS_SHORT", "NUM_YEARS_SHORT", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public enum VariableLocalizationKey {
    DAY,
    DAILY,
    DAY_SHORT,
    WEEK,
    WEEKLY,
    WEEK_SHORT,
    MONTH,
    MONTHLY,
    MONTH_SHORT,
    YEAR,
    YEARLY,
    YEAR_SHORT,
    ANNUAL,
    ANNUALLY,
    ANNUAL_SHORT,
    LIFETIME,
    FREE_PRICE,
    PERCENT,
    NUM_DAY_ZERO,
    NUM_DAY_ONE,
    NUM_DAY_TWO,
    NUM_DAY_FEW,
    NUM_DAY_MANY,
    NUM_DAY_OTHER,
    NUM_WEEK_ZERO,
    NUM_WEEK_ONE,
    NUM_WEEK_TWO,
    NUM_WEEK_FEW,
    NUM_WEEK_MANY,
    NUM_WEEK_OTHER,
    NUM_MONTH_ZERO,
    NUM_MONTH_ONE,
    NUM_MONTH_TWO,
    NUM_MONTH_FEW,
    NUM_MONTH_MANY,
    NUM_MONTH_OTHER,
    NUM_YEAR_ZERO,
    NUM_YEAR_ONE,
    NUM_YEAR_TWO,
    NUM_YEAR_FEW,
    NUM_YEAR_MANY,
    NUM_YEAR_OTHER,
    NUM_DAYS_SHORT,
    NUM_WEEKS_SHORT,
    NUM_MONTHS_SHORT,
    NUM_YEARS_SHORT;
    
    /* access modifiers changed from: private */
    public static final Lazy $cachedSerializer$delegate = null;
    public static final Companion Companion = null;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ C5978b get$cachedSerializer() {
            return (C5978b) VariableLocalizationKey.$cachedSerializer$delegate.getValue();
        }

        public final C5978b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
    }
}
