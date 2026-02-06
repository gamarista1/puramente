package com.revenuecat.purchases.models;

import Af.a;
import Sg.k;
import Sg.m;
import com.revenuecat.purchases.models.Period;
import kotlin.Metadata;
import kotlin.Pair;
import lf.C6535s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"toPeriod", "Lkotlin/Pair;", "", "Lcom/revenuecat/purchases/models/Period$Unit;", "", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PeriodKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.revenuecat.purchases.models.Period$Unit[] r0 = com.revenuecat.purchases.models.Period.Unit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.YEAR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.MONTH     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.WEEK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.DAY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.PeriodKt.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final Pair<Integer, Period.Unit> toPeriod(String str) {
        Period.Unit unit;
        double d10;
        double d11;
        double d12;
        k c10 = new m("^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$").c(str);
        if (c10 == null) {
            return new Pair<>(0, Period.Unit.UNKNOWN);
        }
        PeriodKt$toPeriod$1$toInt$1 periodKt$toPeriod$1$toInt$1 = PeriodKt$toPeriod$1$toInt$1.INSTANCE;
        k.b a10 = c10.a();
        int intValue = ((Number) periodKt$toPeriod$1$toInt$1.invoke((String) a10.a().b().get(1))).intValue();
        int intValue2 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((String) a10.a().b().get(2))).intValue();
        int intValue3 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((String) a10.a().b().get(3))).intValue();
        int intValue4 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((String) a10.a().b().get(4))).intValue();
        if (intValue4 > 0) {
            unit = Period.Unit.DAY;
        } else if (intValue3 > 0) {
            unit = Period.Unit.WEEK;
        } else if (intValue2 > 0) {
            unit = Period.Unit.MONTH;
        } else if (intValue > 0) {
            unit = Period.Unit.YEAR;
        } else {
            unit = Period.Unit.UNKNOWN;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                d11 = ((double) intValue) * 12.0d;
                d12 = (double) intValue2;
            } else if (i10 == 3) {
                d11 = (((double) intValue) * 52.142857142857146d) + (((double) intValue2) * 4.345238095238096d);
                d12 = (double) intValue3;
            } else if (i10 == 4) {
                d11 = (((double) intValue) * 365.0d) + (((double) intValue2) * 30.0d) + (((double) intValue3) * 7.0d);
                d12 = (double) intValue4;
            } else if (i10 == 5) {
                d10 = 0.0d;
            } else {
                throw new C6535s();
            }
            d10 = d11 + d12;
        } else {
            d10 = (double) intValue;
        }
        return new Pair<>(Integer.valueOf(a.c(d10)), unit);
    }
}
