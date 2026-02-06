package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0001\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b1\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b2\u00100J\u0010\u00103\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u0010!J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u0010!J\u0010\u00107\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b7\u0010+J\u0012\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b8\u00100J\u0012\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b9\u00100J\u0010\u0010:\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b<\u0010=J¸\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020&HÖ\u0001¢\u0006\u0004\b@\u0010(J \u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020&HÖ\u0001¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\b\u0007\u0010+R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bN\u00100R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bO\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bP\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Q\u001a\u0004\bR\u00104R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bS\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bT\u0010!R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\b\u0013\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bU\u00100R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\bV\u00100R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010W\u001a\u0004\bX\u0010;R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010YR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010Z\u001a\u0004\b[\u0010=R\u001a\u0010_\u001a\u00020\u00038VX\u0004¢\u0006\f\u0012\u0004\b]\u0010^\u001a\u0004\b\\\u0010\u001f¨\u0006`"}, d2 = {"Lcom/revenuecat/purchases/EntitlementInfo;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/RawDataContainer;", "Lorg/json/JSONObject;", "", "identifier", "", "isActive", "willRenew", "Lcom/revenuecat/purchases/PeriodType;", "periodType", "Ljava/util/Date;", "latestPurchaseDate", "originalPurchaseDate", "expirationDate", "Lcom/revenuecat/purchases/Store;", "store", "productIdentifier", "productPlanIdentifier", "isSandbox", "unsubscribeDetectedAt", "billingIssueDetectedAt", "Lcom/revenuecat/purchases/OwnershipType;", "ownershipType", "jsonObject", "Lcom/revenuecat/purchases/VerificationResult;", "verification", "<init>", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lorg/json/JSONObject;Lcom/revenuecat/purchases/VerificationResult;)V", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lorg/json/JSONObject;)V", "component15", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "component2", "()Z", "component3", "component4", "()Lcom/revenuecat/purchases/PeriodType;", "component5", "()Ljava/util/Date;", "component6", "component7", "component8", "()Lcom/revenuecat/purchases/Store;", "component9", "component10", "component11", "component12", "component13", "component14", "()Lcom/revenuecat/purchases/OwnershipType;", "component16", "()Lcom/revenuecat/purchases/VerificationResult;", "copy", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lorg/json/JSONObject;Lcom/revenuecat/purchases/VerificationResult;)Lcom/revenuecat/purchases/EntitlementInfo;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIdentifier", "Z", "getWillRenew", "Lcom/revenuecat/purchases/PeriodType;", "getPeriodType", "Ljava/util/Date;", "getLatestPurchaseDate", "getOriginalPurchaseDate", "getExpirationDate", "Lcom/revenuecat/purchases/Store;", "getStore", "getProductIdentifier", "getProductPlanIdentifier", "getUnsubscribeDetectedAt", "getBillingIssueDetectedAt", "Lcom/revenuecat/purchases/OwnershipType;", "getOwnershipType", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/VerificationResult;", "getVerification", "getRawData", "getRawData$annotations", "()V", "rawData", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EntitlementInfo implements Parcelable, RawDataContainer<JSONObject> {
    public static final Parcelable.Creator<EntitlementInfo> CREATOR = new Creator();
    private final Date billingIssueDetectedAt;
    private final Date expirationDate;
    private final String identifier;
    private final boolean isActive;
    private final boolean isSandbox;
    private final JSONObject jsonObject;
    private final Date latestPurchaseDate;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final String productIdentifier;
    private final String productPlanIdentifier;
    private final Store store;
    private final Date unsubscribeDetectedAt;
    private final VerificationResult verification;
    private final boolean willRenew;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EntitlementInfo> {
        public final EntitlementInfo createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C6496s.h(parcel2, "parcel");
            return new EntitlementInfo(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, PeriodType.valueOf(parcel.readString()), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), Store.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), OwnershipType.valueOf(parcel.readString()), JSONObjectParceler.INSTANCE.create(parcel2), VerificationResult.valueOf(parcel.readString()));
        }

        public final EntitlementInfo[] newArray(int i10) {
            return new EntitlementInfo[i10];
        }
    }

    public EntitlementInfo(String str, boolean z10, boolean z11, PeriodType periodType2, Date date, Date date2, Date date3, Store store2, String str2, String str3, boolean z12, Date date4, Date date5, OwnershipType ownershipType2, JSONObject jSONObject, VerificationResult verificationResult) {
        Date date6 = date;
        Date date7 = date2;
        Store store3 = store2;
        String str4 = str2;
        OwnershipType ownershipType3 = ownershipType2;
        JSONObject jSONObject2 = jSONObject;
        VerificationResult verificationResult2 = verificationResult;
        C6496s.h(str, "identifier");
        C6496s.h(periodType2, "periodType");
        C6496s.h(date6, "latestPurchaseDate");
        C6496s.h(date7, "originalPurchaseDate");
        C6496s.h(store3, ProductResponseJsonKeys.STORE);
        C6496s.h(str4, "productIdentifier");
        C6496s.h(ownershipType3, "ownershipType");
        C6496s.h(jSONObject2, "jsonObject");
        C6496s.h(verificationResult2, "verification");
        this.identifier = str;
        this.isActive = z10;
        this.willRenew = z11;
        this.periodType = periodType2;
        this.latestPurchaseDate = date6;
        this.originalPurchaseDate = date7;
        this.expirationDate = date3;
        this.store = store3;
        this.productIdentifier = str4;
        this.productPlanIdentifier = str3;
        this.isSandbox = z12;
        this.unsubscribeDetectedAt = date4;
        this.billingIssueDetectedAt = date5;
        this.ownershipType = ownershipType3;
        this.jsonObject = jSONObject2;
        this.verification = verificationResult2;
    }

    private final JSONObject component15() {
        return this.jsonObject;
    }

    public static /* synthetic */ EntitlementInfo copy$default(EntitlementInfo entitlementInfo, String str, boolean z10, boolean z11, PeriodType periodType2, Date date, Date date2, Date date3, Store store2, String str2, String str3, boolean z12, Date date4, Date date5, OwnershipType ownershipType2, JSONObject jSONObject, VerificationResult verificationResult, int i10, Object obj) {
        EntitlementInfo entitlementInfo2 = entitlementInfo;
        int i11 = i10;
        return entitlementInfo.copy((i11 & 1) != 0 ? entitlementInfo2.identifier : str, (i11 & 2) != 0 ? entitlementInfo2.isActive : z10, (i11 & 4) != 0 ? entitlementInfo2.willRenew : z11, (i11 & 8) != 0 ? entitlementInfo2.periodType : periodType2, (i11 & 16) != 0 ? entitlementInfo2.latestPurchaseDate : date, (i11 & 32) != 0 ? entitlementInfo2.originalPurchaseDate : date2, (i11 & 64) != 0 ? entitlementInfo2.expirationDate : date3, (i11 & 128) != 0 ? entitlementInfo2.store : store2, (i11 & 256) != 0 ? entitlementInfo2.productIdentifier : str2, (i11 & 512) != 0 ? entitlementInfo2.productPlanIdentifier : str3, (i11 & 1024) != 0 ? entitlementInfo2.isSandbox : z12, (i11 & 2048) != 0 ? entitlementInfo2.unsubscribeDetectedAt : date4, (i11 & 4096) != 0 ? entitlementInfo2.billingIssueDetectedAt : date5, (i11 & 8192) != 0 ? entitlementInfo2.ownershipType : ownershipType2, (i11 & 16384) != 0 ? entitlementInfo2.jsonObject : jSONObject, (i11 & 32768) != 0 ? entitlementInfo2.verification : verificationResult);
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component10() {
        return this.productPlanIdentifier;
    }

    public final boolean component11() {
        return this.isSandbox;
    }

    public final Date component12() {
        return this.unsubscribeDetectedAt;
    }

    public final Date component13() {
        return this.billingIssueDetectedAt;
    }

    public final OwnershipType component14() {
        return this.ownershipType;
    }

    public final VerificationResult component16() {
        return this.verification;
    }

    public final boolean component2() {
        return this.isActive;
    }

    public final boolean component3() {
        return this.willRenew;
    }

    public final PeriodType component4() {
        return this.periodType;
    }

    public final Date component5() {
        return this.latestPurchaseDate;
    }

    public final Date component6() {
        return this.originalPurchaseDate;
    }

    public final Date component7() {
        return this.expirationDate;
    }

    public final Store component8() {
        return this.store;
    }

    public final String component9() {
        return this.productIdentifier;
    }

    public final EntitlementInfo copy(String str, boolean z10, boolean z11, PeriodType periodType2, Date date, Date date2, Date date3, Store store2, String str2, String str3, boolean z12, Date date4, Date date5, OwnershipType ownershipType2, JSONObject jSONObject, VerificationResult verificationResult) {
        String str4 = str;
        C6496s.h(str4, "identifier");
        C6496s.h(periodType2, "periodType");
        C6496s.h(date, "latestPurchaseDate");
        C6496s.h(date2, "originalPurchaseDate");
        C6496s.h(store2, ProductResponseJsonKeys.STORE);
        C6496s.h(str2, "productIdentifier");
        C6496s.h(ownershipType2, "ownershipType");
        C6496s.h(jSONObject, "jsonObject");
        C6496s.h(verificationResult, "verification");
        return new EntitlementInfo(str4, z10, z11, periodType2, date, date2, date3, store2, str2, str3, z12, date4, date5, ownershipType2, jSONObject, verificationResult);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C6496s.c(EntitlementInfo.class, cls)) {
            return false;
        }
        C6496s.f(obj, "null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfo");
        EntitlementInfo entitlementInfo = (EntitlementInfo) obj;
        if (C6496s.c(this.identifier, entitlementInfo.identifier) && this.isActive == entitlementInfo.isActive && this.willRenew == entitlementInfo.willRenew && this.periodType == entitlementInfo.periodType && C6496s.c(this.latestPurchaseDate, entitlementInfo.latestPurchaseDate) && C6496s.c(this.originalPurchaseDate, entitlementInfo.originalPurchaseDate) && C6496s.c(this.expirationDate, entitlementInfo.expirationDate) && this.store == entitlementInfo.store && C6496s.c(this.productIdentifier, entitlementInfo.productIdentifier) && C6496s.c(this.productPlanIdentifier, entitlementInfo.productPlanIdentifier) && this.isSandbox == entitlementInfo.isSandbox && C6496s.c(this.unsubscribeDetectedAt, entitlementInfo.unsubscribeDetectedAt) && C6496s.c(this.billingIssueDetectedAt, entitlementInfo.billingIssueDetectedAt) && this.ownershipType == entitlementInfo.ownershipType && this.verification == entitlementInfo.verification) {
            return true;
        }
        return false;
    }

    public final Date getBillingIssueDetectedAt() {
        return this.billingIssueDetectedAt;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Date getLatestPurchaseDate() {
        return this.latestPurchaseDate;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    public final Store getStore() {
        return this.store;
    }

    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final VerificationResult getVerification() {
        return this.verification;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = ((((((((((this.identifier.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.willRenew)) * 31) + this.periodType.hashCode()) * 31) + this.latestPurchaseDate.hashCode()) * 31) + this.originalPurchaseDate.hashCode()) * 31;
        Date date = this.expirationDate;
        int i13 = 0;
        if (date != null) {
            i10 = date.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (((((hashCode + i10) * 31) + this.store.hashCode()) * 31) + this.productIdentifier.hashCode()) * 31;
        String str = this.productPlanIdentifier;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int hashCode3 = (((hashCode2 + i11) * 31) + Boolean.hashCode(this.isSandbox)) * 31;
        Date date2 = this.unsubscribeDetectedAt;
        if (date2 != null) {
            i12 = date2.hashCode();
        } else {
            i12 = 0;
        }
        int i14 = (hashCode3 + i12) * 31;
        Date date3 = this.billingIssueDetectedAt;
        if (date3 != null) {
            i13 = date3.hashCode();
        }
        return ((i14 + i13) * 31) + this.ownershipType.hashCode();
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return "EntitlementInfo(identifier='" + this.identifier + "', isActive=" + this.isActive + ", willRenew=" + this.willRenew + ", periodType=" + this.periodType + ", latestPurchaseDate=" + this.latestPurchaseDate + ", originalPurchaseDate=" + this.originalPurchaseDate + ", expirationDate=" + this.expirationDate + ", store=" + this.store + ", productIdentifier='" + this.productIdentifier + "', productPlanIdentifier='" + this.productPlanIdentifier + "', isSandbox=" + this.isSandbox + ", unsubscribeDetectedAt=" + this.unsubscribeDetectedAt + ", billingIssueDetectedAt=" + this.billingIssueDetectedAt + ", ownershipType=" + this.ownershipType + ", verification=" + this.verification + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeString(this.identifier);
        parcel.writeInt(this.isActive ? 1 : 0);
        parcel.writeInt(this.willRenew ? 1 : 0);
        parcel.writeString(this.periodType.name());
        parcel.writeSerializable(this.latestPurchaseDate);
        parcel.writeSerializable(this.originalPurchaseDate);
        parcel.writeSerializable(this.expirationDate);
        parcel.writeString(this.store.name());
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productPlanIdentifier);
        parcel.writeInt(this.isSandbox ? 1 : 0);
        parcel.writeSerializable(this.unsubscribeDetectedAt);
        parcel.writeSerializable(this.billingIssueDetectedAt);
        parcel.writeString(this.ownershipType.name());
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, i10);
        parcel.writeString(this.verification.name());
    }

    public JSONObject getRawData() {
        return this.jsonObject;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EntitlementInfo(String str, boolean z10, boolean z11, PeriodType periodType2, Date date, Date date2, Date date3, Store store2, String str2, String str3, boolean z12, Date date4, Date date5, OwnershipType ownershipType2, JSONObject jSONObject, VerificationResult verificationResult, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, z11, periodType2, date, date2, date3, store2, str2, str3, z12, date4, date5, ownershipType2, jSONObject, (i10 & 32768) != 0 ? VerificationResult.NOT_REQUESTED : verificationResult);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @lf.C6521e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EntitlementInfo(java.lang.String r20, boolean r21, boolean r22, com.revenuecat.purchases.PeriodType r23, java.util.Date r24, java.util.Date r25, java.util.Date r26, com.revenuecat.purchases.Store r27, java.lang.String r28, java.lang.String r29, boolean r30, java.util.Date r31, java.util.Date r32, com.revenuecat.purchases.OwnershipType r33, org.json.JSONObject r34) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r17 = r0
            java.lang.String r0 = "identifier"
            r18 = r1
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "periodType"
            r1 = r23
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "latestPurchaseDate"
            r1 = r24
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "originalPurchaseDate"
            r1 = r25
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "store"
            r1 = r27
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "productIdentifier"
            r1 = r28
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "ownershipType"
            r1 = r33
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "jsonObject"
            r1 = r34
            kotlin.jvm.internal.C6496s.h(r1, r0)
            com.revenuecat.purchases.VerificationResult r16 = com.revenuecat.purchases.VerificationResult.NOT_REQUESTED
            r0 = r17
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.EntitlementInfo.<init>(java.lang.String, boolean, boolean, com.revenuecat.purchases.PeriodType, java.util.Date, java.util.Date, java.util.Date, com.revenuecat.purchases.Store, java.lang.String, java.lang.String, boolean, java.util.Date, java.util.Date, com.revenuecat.purchases.OwnershipType, org.json.JSONObject):void");
    }
}
