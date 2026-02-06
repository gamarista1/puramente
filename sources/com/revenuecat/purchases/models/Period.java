package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.LogUtilsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0010\b\b\u0018\u0000 42\u00020\u0001:\u000245B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010+\u001a\u00020&8FX\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020&8FX\u0004¢\u0006\f\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010(R\u001a\u00101\u001a\u00020&8FX\u0004¢\u0006\f\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010(R\u0011\u00103\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b2\u0010(¨\u00066"}, d2 = {"Lcom/revenuecat/purchases/models/Period;", "Landroid/os/Parcelable;", "", "value", "Lcom/revenuecat/purchases/models/Period$Unit;", "unit", "", "iso8601", "<init>", "(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V", "component1", "()I", "component2", "()Lcom/revenuecat/purchases/models/Period$Unit;", "component3", "()Ljava/lang/String;", "copy", "(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)Lcom/revenuecat/purchases/models/Period;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getValue", "Lcom/revenuecat/purchases/models/Period$Unit;", "getUnit", "Ljava/lang/String;", "getIso8601", "", "getValueInDays", "()D", "getValueInDays$annotations", "()V", "valueInDays", "getValueInWeeks", "getValueInWeeks$annotations", "valueInWeeks", "getValueInYears", "getValueInYears$annotations", "valueInYears", "getValueInMonths", "valueInMonths", "Factory", "Unit", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Period implements Parcelable {
    public static final Parcelable.Creator<Period> CREATOR = new Creator();
    public static final Factory Factory = new Factory((DefaultConstructorMarker) null);
    private final String iso8601;
    private final Unit unit;
    private final int value;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Period> {
        public final Period createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new Period(parcel.readInt(), Unit.valueOf(parcel.readString()), parcel.readString());
        }

        public final Period[] newArray(int i10) {
            return new Period[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/models/Period$Factory;", "", "()V", "create", "Lcom/revenuecat/purchases/models/Period;", "iso8601", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Period create(String str) {
            C6496s.h(str, "iso8601");
            Pair access$toPeriod = PeriodKt.toPeriod(str);
            return new Period(((Number) access$toPeriod.c()).intValue(), (Unit) access$toPeriod.d(), str);
        }

        private Factory() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/models/Period$Unit;", "", "(Ljava/lang/String;I)V", "DAY", "WEEK", "MONTH", "YEAR", "UNKNOWN", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Unit {
        DAY,
        WEEK,
        MONTH,
        YEAR,
        UNKNOWN
    }

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
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.DAY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.WEEK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.MONTH     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.YEAR     // Catch:{ NoSuchFieldError -> 0x002b }
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
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.Period.WhenMappings.<clinit>():void");
        }
    }

    public Period(int i10, Unit unit2, String str) {
        C6496s.h(unit2, "unit");
        C6496s.h(str, "iso8601");
        this.value = i10;
        this.unit = unit2;
        this.iso8601 = str;
    }

    public static /* synthetic */ Period copy$default(Period period, int i10, Unit unit2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = period.value;
        }
        if ((i11 & 2) != 0) {
            unit2 = period.unit;
        }
        if ((i11 & 4) != 0) {
            str = period.iso8601;
        }
        return period.copy(i10, unit2, str);
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getValueInDays$annotations() {
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getValueInWeeks$annotations() {
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getValueInYears$annotations() {
    }

    public final int component1() {
        return this.value;
    }

    public final Unit component2() {
        return this.unit;
    }

    public final String component3() {
        return this.iso8601;
    }

    public final Period copy(int i10, Unit unit2, String str) {
        C6496s.h(unit2, "unit");
        C6496s.h(str, "iso8601");
        return new Period(i10, unit2, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.value == period.value && this.unit == period.unit && C6496s.c(this.iso8601, period.iso8601);
    }

    public final String getIso8601() {
        return this.iso8601;
    }

    public final Unit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public final double getValueInDays() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            return (double) this.value;
        }
        if (i10 == 2) {
            d10 = (double) this.value;
            d11 = 7.0d;
        } else if (i10 == 3) {
            d10 = (double) this.value;
            d11 = 30.0d;
        } else if (i10 == 4) {
            d10 = (double) this.value;
            d11 = 365.0d;
        } else if (i10 == 5) {
            LogUtilsKt.errorLog$default("Unknown period unit trying to get value in days: " + this.unit, (Throwable) null, 2, (Object) null);
            return 0.0d;
        } else {
            throw new C6535s();
        }
        return d10 * d11;
    }

    public final double getValueInMonths() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            d10 = (double) this.value;
            d11 = 30.0d;
        } else if (i10 == 2) {
            d10 = (double) this.value;
            d11 = 4.345238095238096d;
        } else if (i10 == 3) {
            return (double) this.value;
        } else {
            if (i10 == 4) {
                return ((double) this.value) * 12.0d;
            }
            if (i10 == 5) {
                LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, (Throwable) null, 2, (Object) null);
                return 0.0d;
            }
            throw new C6535s();
        }
        return d10 / d11;
    }

    public final double getValueInWeeks() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            return ((double) this.value) / 7.0d;
        }
        if (i10 == 2) {
            return (double) this.value;
        }
        if (i10 == 3) {
            d10 = (double) this.value;
            d11 = 4.345238095238096d;
        } else if (i10 == 4) {
            d10 = (double) this.value;
            d11 = 52.142857142857146d;
        } else if (i10 == 5) {
            LogUtilsKt.errorLog$default("Unknown period unit trying to get value in weeks: " + this.unit, (Throwable) null, 2, (Object) null);
            return 0.0d;
        } else {
            throw new C6535s();
        }
        return d10 * d11;
    }

    public final double getValueInYears() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            d10 = (double) this.value;
            d11 = 365.0d;
        } else if (i10 == 2) {
            d10 = (double) this.value;
            d11 = 52.142857142857146d;
        } else if (i10 == 3) {
            d10 = (double) this.value;
            d11 = 12.0d;
        } else if (i10 == 4) {
            return (double) this.value;
        } else {
            if (i10 == 5) {
                LogUtilsKt.errorLog$default("Unknown period unit trying to get value in years: " + this.unit, (Throwable) null, 2, (Object) null);
                return 0.0d;
            }
            throw new C6535s();
        }
        return d10 / d11;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.value) * 31) + this.unit.hashCode()) * 31) + this.iso8601.hashCode();
    }

    public String toString() {
        return "Period(value=" + this.value + ", unit=" + this.unit + ", iso8601=" + this.iso8601 + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeInt(this.value);
        parcel.writeString(this.unit.name());
        parcel.writeString(this.iso8601);
    }
}
