package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJX\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0012R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b2\u0010\u0012R \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b7\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001a¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/models/Transaction;", "Landroid/os/Parcelable;", "", "transactionIdentifier", "revenuecatId", "productIdentifier", "productId", "Ljava/util/Date;", "purchaseDate", "storeTransactionId", "Lcom/revenuecat/purchases/Store;", "store", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/Store;)V", "Lorg/json/JSONObject;", "jsonObject", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Date;", "component6", "component7", "()Lcom/revenuecat/purchases/Store;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/Store;)Lcom/revenuecat/purchases/models/Transaction;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTransactionIdentifier", "getRevenuecatId", "getRevenuecatId$annotations", "()V", "getProductIdentifier", "getProductId", "getProductId$annotations", "Ljava/util/Date;", "getPurchaseDate", "getStoreTransactionId", "Lcom/revenuecat/purchases/Store;", "getStore", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Transaction implements Parcelable {
    public static final Parcelable.Creator<Transaction> CREATOR = new Creator();
    private final String productId;
    private final String productIdentifier;
    private final Date purchaseDate;
    private final String revenuecatId;
    private final Store store;
    private final String storeTransactionId;
    private final String transactionIdentifier;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Transaction> {
        public final Transaction createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new Transaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), Store.valueOf(parcel.readString()));
        }

        public final Transaction[] newArray(int i10) {
            return new Transaction[i10];
        }
    }

    public Transaction(String str, String str2, String str3, String str4, Date date, String str5, Store store2) {
        C6496s.h(str, "transactionIdentifier");
        C6496s.h(str2, "revenuecatId");
        C6496s.h(str3, "productIdentifier");
        C6496s.h(str4, "productId");
        C6496s.h(date, b.f37459Q);
        C6496s.h(store2, ProductResponseJsonKeys.STORE);
        this.transactionIdentifier = str;
        this.revenuecatId = str2;
        this.productIdentifier = str3;
        this.productId = str4;
        this.purchaseDate = date;
        this.storeTransactionId = str5;
        this.store = store2;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, String str, String str2, String str3, String str4, Date date, String str5, Store store2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transaction.transactionIdentifier;
        }
        if ((i10 & 2) != 0) {
            str2 = transaction.revenuecatId;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = transaction.productIdentifier;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = transaction.productId;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            date = transaction.purchaseDate;
        }
        Date date2 = date;
        if ((i10 & 32) != 0) {
            str5 = transaction.storeTransactionId;
        }
        String str9 = str5;
        if ((i10 & 64) != 0) {
            store2 = transaction.store;
        }
        return transaction.copy(str, str6, str7, str8, date2, str9, store2);
    }

    @C6521e
    public static /* synthetic */ void getProductId$annotations() {
    }

    @C6521e
    public static /* synthetic */ void getRevenuecatId$annotations() {
    }

    public final String component1() {
        return this.transactionIdentifier;
    }

    public final String component2() {
        return this.revenuecatId;
    }

    public final String component3() {
        return this.productIdentifier;
    }

    public final String component4() {
        return this.productId;
    }

    public final Date component5() {
        return this.purchaseDate;
    }

    public final String component6() {
        return this.storeTransactionId;
    }

    public final Store component7() {
        return this.store;
    }

    public final Transaction copy(String str, String str2, String str3, String str4, Date date, String str5, Store store2) {
        C6496s.h(str, "transactionIdentifier");
        C6496s.h(str2, "revenuecatId");
        C6496s.h(str3, "productIdentifier");
        C6496s.h(str4, "productId");
        C6496s.h(date, b.f37459Q);
        Store store3 = store2;
        C6496s.h(store3, ProductResponseJsonKeys.STORE);
        return new Transaction(str, str2, str3, str4, date, str5, store3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return C6496s.c(this.transactionIdentifier, transaction.transactionIdentifier) && C6496s.c(this.revenuecatId, transaction.revenuecatId) && C6496s.c(this.productIdentifier, transaction.productIdentifier) && C6496s.c(this.productId, transaction.productId) && C6496s.c(this.purchaseDate, transaction.purchaseDate) && C6496s.c(this.storeTransactionId, transaction.storeTransactionId) && this.store == transaction.store;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final String getRevenuecatId() {
        return this.revenuecatId;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public int hashCode() {
        int hashCode = ((((((((this.transactionIdentifier.hashCode() * 31) + this.revenuecatId.hashCode()) * 31) + this.productIdentifier.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.purchaseDate.hashCode()) * 31;
        String str = this.storeTransactionId;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.store.hashCode();
    }

    public String toString() {
        return "Transaction(transactionIdentifier=" + this.transactionIdentifier + ", revenuecatId=" + this.revenuecatId + ", productIdentifier=" + this.productIdentifier + ", productId=" + this.productId + ", purchaseDate=" + this.purchaseDate + ", storeTransactionId=" + this.storeTransactionId + ", store=" + this.store + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeString(this.transactionIdentifier);
        parcel.writeString(this.revenuecatId);
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productId);
        parcel.writeSerializable(this.purchaseDate);
        parcel.writeString(this.storeTransactionId);
        parcel.writeString(this.store.name());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Transaction(java.lang.String r10, org.json.JSONObject r11) {
        /*
            r9 = this;
            java.lang.String r0 = "productId"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            java.lang.String r0 = "jsonObject"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            java.lang.String r0 = "id"
            java.lang.String r2 = r11.getString(r0)
            java.lang.String r1 = "jsonObject.getString(\"id\")"
            kotlin.jvm.internal.C6496s.g(r2, r1)
            java.lang.String r3 = r11.getString(r0)
            kotlin.jvm.internal.C6496s.g(r3, r1)
            java.lang.String r0 = "purchase_date"
            java.util.Date r6 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.getDate(r11, r0)
            java.lang.String r0 = "store_transaction_id"
            java.lang.String r0 = r11.optString(r0)
            java.lang.String r1 = "it"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            boolean r4 = Sg.p.d0(r0)
            if (r4 != 0) goto L_0x0035
        L_0x0033:
            r7 = r0
            goto L_0x0037
        L_0x0035:
            r0 = 0
            goto L_0x0033
        L_0x0037:
            java.lang.String r0 = "store"
            java.lang.String r11 = r11.getString(r0)
            com.revenuecat.purchases.Store$Companion r0 = com.revenuecat.purchases.Store.Companion
            kotlin.jvm.internal.C6496s.g(r11, r1)
            com.revenuecat.purchases.Store r8 = r0.fromString(r11)
            r1 = r9
            r4 = r10
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.Transaction.<init>(java.lang.String, org.json.JSONObject):void");
    }
}
