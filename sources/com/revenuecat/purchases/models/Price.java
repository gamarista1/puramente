package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/models/Price;", "Landroid/os/Parcelable;", "", "formatted", "", "amountMicros", "currencyCode", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/revenuecat/purchases/models/Price;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFormatted", "J", "getAmountMicros", "getCurrencyCode", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Price implements Parcelable {
    public static final Parcelable.Creator<Price> CREATOR = new Creator();
    private final long amountMicros;
    private final String currencyCode;
    private final String formatted;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Price> {
        public final Price createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new Price(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        public final Price[] newArray(int i10) {
            return new Price[i10];
        }
    }

    public Price(String str, long j10, String str2) {
        C6496s.h(str, "formatted");
        C6496s.h(str2, "currencyCode");
        this.formatted = str;
        this.amountMicros = j10;
        this.currencyCode = str2;
    }

    public static /* synthetic */ Price copy$default(Price price, String str, long j10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = price.formatted;
        }
        if ((i10 & 2) != 0) {
            j10 = price.amountMicros;
        }
        if ((i10 & 4) != 0) {
            str2 = price.currencyCode;
        }
        return price.copy(str, j10, str2);
    }

    public final String component1() {
        return this.formatted;
    }

    public final long component2() {
        return this.amountMicros;
    }

    public final String component3() {
        return this.currencyCode;
    }

    public final Price copy(String str, long j10, String str2) {
        C6496s.h(str, "formatted");
        C6496s.h(str2, "currencyCode");
        return new Price(str, j10, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return C6496s.c(this.formatted, price.formatted) && this.amountMicros == price.amountMicros && C6496s.c(this.currencyCode, price.currencyCode);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public int hashCode() {
        return (((this.formatted.hashCode() * 31) + Long.hashCode(this.amountMicros)) * 31) + this.currencyCode.hashCode();
    }

    public String toString() {
        return "Price(formatted=" + this.formatted + ", amountMicros=" + this.amountMicros + ", currencyCode=" + this.currencyCode + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeString(this.formatted);
        parcel.writeLong(this.amountMicros);
        parcel.writeString(this.currencyCode);
    }
}
