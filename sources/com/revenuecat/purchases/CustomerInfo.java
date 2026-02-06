package com.revenuecat.purchases;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.models.Transaction;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6521e;
import lf.C6531o;
import mf.C6565s;
import mf.O;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002Bw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0007¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u001eJ\u0017\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\u001eJ\u0017\u0010%\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\u001eJ\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u00100J\u001e\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006HÆ\u0003¢\u0006\u0004\b1\u00102J\u001e\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006HÆ\u0003¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b6\u0010.J\u0010\u00107\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b7\u00105J\u0010\u00108\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0012\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b;\u00105J\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b>\u0010.J \u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\fHÖ\u0001¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u00100R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u00102R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bI\u00102R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bK\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010.R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bN\u00105R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bS\u00105R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010TR'\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178FX\u0002¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR'\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178FX\u0002¢\u0006\u0012\n\u0004\b\\\u0010V\u0012\u0004\b^\u0010Z\u001a\u0004\b]\u0010XR'\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178FX\u0002¢\u0006\u0012\n\u0004\b`\u0010V\u0012\u0004\bb\u0010Z\u001a\u0004\ba\u0010XR#\u0010g\u001a\u0004\u0018\u00010\b8FX\u0002¢\u0006\u0012\n\u0004\bd\u0010V\u0012\u0004\bf\u0010Z\u001a\u0004\be\u00105R'\u0010n\u001a\b\u0012\u0004\u0012\u00020i0h8FX\u0002¢\u0006\u0012\n\u0004\bj\u0010V\u0012\u0004\bm\u0010Z\u001a\u0004\bk\u0010lR-\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020o0\u00068FX\u0002¢\u0006\u0012\n\u0004\bp\u0010V\u0012\u0004\br\u0010Z\u001a\u0004\bq\u00102R\"\u0010u\u001a\n t*\u0004\u0018\u00010\u00030\u00038\u0002X\u0004¢\u0006\f\n\u0004\bu\u0010T\u0012\u0004\bv\u0010ZR\u001a\u0010y\u001a\u00020\u00038VX\u0004¢\u0006\f\u0012\u0004\bx\u0010Z\u001a\u0004\bw\u0010\u001b¨\u0006z"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/RawDataContainer;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/EntitlementInfos;", "entitlements", "", "", "Ljava/util/Date;", "allExpirationDatesByProduct", "allPurchaseDatesByProduct", "requestDate", "", "schemaVersion", "firstSeen", "originalAppUserId", "Landroid/net/Uri;", "managementURL", "originalPurchaseDate", "jsonObject", "<init>", "(Lcom/revenuecat/purchases/EntitlementInfos;Ljava/util/Map;Ljava/util/Map;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;Lorg/json/JSONObject;)V", "expirations", "", "activeIdentifiers", "(Ljava/util/Map;)Ljava/util/Set;", "component10", "()Lorg/json/JSONObject;", "sku", "getExpirationDateForSku", "(Ljava/lang/String;)Ljava/util/Date;", "productId", "getExpirationDateForProductId", "getPurchaseDateForSku", "getPurchaseDateForProductId", "entitlement", "getExpirationDateForEntitlement", "getPurchaseDateForEntitlement", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Lcom/revenuecat/purchases/EntitlementInfos;", "component2", "()Ljava/util/Map;", "component3", "component4", "()Ljava/util/Date;", "component5", "component6", "component7", "component8", "()Landroid/net/Uri;", "component9", "copy", "(Lcom/revenuecat/purchases/EntitlementInfos;Ljava/util/Map;Ljava/util/Map;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;Lorg/json/JSONObject;)Lcom/revenuecat/purchases/CustomerInfo;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/revenuecat/purchases/EntitlementInfos;", "getEntitlements", "Ljava/util/Map;", "getAllExpirationDatesByProduct", "getAllPurchaseDatesByProduct", "Ljava/util/Date;", "getRequestDate", "I", "getSchemaVersion", "getFirstSeen", "Ljava/lang/String;", "getOriginalAppUserId", "Landroid/net/Uri;", "getManagementURL", "getOriginalPurchaseDate", "Lorg/json/JSONObject;", "activeSubscriptions$delegate", "Lkotlin/Lazy;", "getActiveSubscriptions", "()Ljava/util/Set;", "getActiveSubscriptions$annotations", "()V", "activeSubscriptions", "allPurchasedSkus$delegate", "getAllPurchasedSkus", "getAllPurchasedSkus$annotations", "allPurchasedSkus", "allPurchasedProductIds$delegate", "getAllPurchasedProductIds", "getAllPurchasedProductIds$annotations", "allPurchasedProductIds", "latestExpirationDate$delegate", "getLatestExpirationDate", "getLatestExpirationDate$annotations", "latestExpirationDate", "", "Lcom/revenuecat/purchases/models/Transaction;", "nonSubscriptionTransactions$delegate", "getNonSubscriptionTransactions", "()Ljava/util/List;", "getNonSubscriptionTransactions$annotations", "nonSubscriptionTransactions", "Lcom/revenuecat/purchases/SubscriptionInfo;", "subscriptionsByProductIdentifier$delegate", "getSubscriptionsByProductIdentifier", "getSubscriptionsByProductIdentifier$annotations", "subscriptionsByProductIdentifier", "kotlin.jvm.PlatformType", "subscriberJSONObject", "getSubscriberJSONObject$annotations", "getRawData", "getRawData$annotations", "rawData", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerInfo implements Parcelable, RawDataContainer<JSONObject> {
    public static final Parcelable.Creator<CustomerInfo> CREATOR = new Creator();
    private final Lazy activeSubscriptions$delegate = C6531o.b(new CustomerInfo$activeSubscriptions$2(this));
    private final Map<String, Date> allExpirationDatesByProduct;
    private final Map<String, Date> allPurchaseDatesByProduct;
    private final Lazy allPurchasedProductIds$delegate = C6531o.b(new CustomerInfo$allPurchasedProductIds$2(this));
    private final Lazy allPurchasedSkus$delegate = C6531o.b(new CustomerInfo$allPurchasedSkus$2(this));
    private final EntitlementInfos entitlements;
    private final Date firstSeen;
    private final JSONObject jsonObject;
    private final Lazy latestExpirationDate$delegate = C6531o.b(new CustomerInfo$latestExpirationDate$2(this));
    private final Uri managementURL;
    private final Lazy nonSubscriptionTransactions$delegate = C6531o.b(new CustomerInfo$nonSubscriptionTransactions$2(this));
    private final String originalAppUserId;
    private final Date originalPurchaseDate;
    private final Date requestDate;
    private final int schemaVersion;
    /* access modifiers changed from: private */
    public final JSONObject subscriberJSONObject;
    private final Lazy subscriptionsByProductIdentifier$delegate = C6531o.b(new CustomerInfo$subscriptionsByProductIdentifier$2(this));

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomerInfo> {
        public final CustomerInfo createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            EntitlementInfos createFromParcel = EntitlementInfos.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                linkedHashMap.put(parcel.readString(), parcel.readSerializable());
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                linkedHashMap2.put(parcel.readString(), parcel.readSerializable());
            }
            return new CustomerInfo(createFromParcel, linkedHashMap, linkedHashMap2, (Date) parcel.readSerializable(), parcel.readInt(), (Date) parcel.readSerializable(), parcel.readString(), (Uri) parcel.readParcelable(CustomerInfo.class.getClassLoader()), (Date) parcel.readSerializable(), JSONObjectParceler.INSTANCE.create(parcel));
        }

        public final CustomerInfo[] newArray(int i10) {
            return new CustomerInfo[i10];
        }
    }

    public CustomerInfo(EntitlementInfos entitlementInfos, Map<String, ? extends Date> map, Map<String, ? extends Date> map2, Date date, int i10, Date date2, String str, Uri uri, Date date3, JSONObject jSONObject) {
        C6496s.h(entitlementInfos, CustomerInfoResponseJsonKeys.ENTITLEMENTS);
        C6496s.h(map, "allExpirationDatesByProduct");
        C6496s.h(map2, "allPurchaseDatesByProduct");
        C6496s.h(date, "requestDate");
        C6496s.h(date2, "firstSeen");
        C6496s.h(str, "originalAppUserId");
        C6496s.h(jSONObject, "jsonObject");
        this.entitlements = entitlementInfos;
        this.allExpirationDatesByProduct = map;
        this.allPurchaseDatesByProduct = map2;
        this.requestDate = date;
        this.schemaVersion = i10;
        this.firstSeen = date2;
        this.originalAppUserId = str;
        this.managementURL = uri;
        this.originalPurchaseDate = date3;
        this.jsonObject = jSONObject;
        this.subscriberJSONObject = jSONObject.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIBER);
    }

    /* access modifiers changed from: private */
    public final Set<String> activeIdentifiers(Map<String, ? extends Date> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (DateHelper.Companion.m127isDateActiveSxA4cEA$default(DateHelper.Companion, (Date) next.getValue(), this.requestDate, 0, 4, (Object) null).isActive()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    private final JSONObject component10() {
        return this.jsonObject;
    }

    public static /* synthetic */ CustomerInfo copy$default(CustomerInfo customerInfo, EntitlementInfos entitlementInfos, Map map, Map map2, Date date, int i10, Date date2, String str, Uri uri, Date date3, JSONObject jSONObject, int i11, Object obj) {
        CustomerInfo customerInfo2 = customerInfo;
        int i12 = i11;
        return customerInfo.copy((i12 & 1) != 0 ? customerInfo2.entitlements : entitlementInfos, (i12 & 2) != 0 ? customerInfo2.allExpirationDatesByProduct : map, (i12 & 4) != 0 ? customerInfo2.allPurchaseDatesByProduct : map2, (i12 & 8) != 0 ? customerInfo2.requestDate : date, (i12 & 16) != 0 ? customerInfo2.schemaVersion : i10, (i12 & 32) != 0 ? customerInfo2.firstSeen : date2, (i12 & 64) != 0 ? customerInfo2.originalAppUserId : str, (i12 & 128) != 0 ? customerInfo2.managementURL : uri, (i12 & 256) != 0 ? customerInfo2.originalPurchaseDate : date3, (i12 & 512) != 0 ? customerInfo2.jsonObject : jSONObject);
    }

    public static /* synthetic */ void getActiveSubscriptions$annotations() {
    }

    public static /* synthetic */ void getAllPurchasedProductIds$annotations() {
    }

    @C6521e
    public static /* synthetic */ void getAllPurchasedSkus$annotations() {
    }

    public static /* synthetic */ void getLatestExpirationDate$annotations() {
    }

    public static /* synthetic */ void getNonSubscriptionTransactions$annotations() {
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    private static /* synthetic */ void getSubscriberJSONObject$annotations() {
    }

    public static /* synthetic */ void getSubscriptionsByProductIdentifier$annotations() {
    }

    public final EntitlementInfos component1() {
        return this.entitlements;
    }

    public final Map<String, Date> component2() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> component3() {
        return this.allPurchaseDatesByProduct;
    }

    public final Date component4() {
        return this.requestDate;
    }

    public final int component5() {
        return this.schemaVersion;
    }

    public final Date component6() {
        return this.firstSeen;
    }

    public final String component7() {
        return this.originalAppUserId;
    }

    public final Uri component8() {
        return this.managementURL;
    }

    public final Date component9() {
        return this.originalPurchaseDate;
    }

    public final CustomerInfo copy(EntitlementInfos entitlementInfos, Map<String, ? extends Date> map, Map<String, ? extends Date> map2, Date date, int i10, Date date2, String str, Uri uri, Date date3, JSONObject jSONObject) {
        C6496s.h(entitlementInfos, CustomerInfoResponseJsonKeys.ENTITLEMENTS);
        C6496s.h(map, "allExpirationDatesByProduct");
        C6496s.h(map2, "allPurchaseDatesByProduct");
        Date date4 = date;
        C6496s.h(date4, "requestDate");
        Date date5 = date2;
        C6496s.h(date5, "firstSeen");
        String str2 = str;
        C6496s.h(str2, "originalAppUserId");
        JSONObject jSONObject2 = jSONObject;
        C6496s.h(jSONObject2, "jsonObject");
        return new CustomerInfo(entitlementInfos, map, map2, date4, i10, date5, str2, uri, date3, jSONObject2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CustomerInfo) || !C6496s.c(new ComparableData(this), new ComparableData((CustomerInfo) obj))) {
            return false;
        }
        return true;
    }

    public final Set<String> getActiveSubscriptions() {
        return (Set) this.activeSubscriptions$delegate.getValue();
    }

    public final Map<String, Date> getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final Set<String> getAllPurchasedProductIds() {
        return (Set) this.allPurchasedProductIds$delegate.getValue();
    }

    public final Set<String> getAllPurchasedSkus() {
        return (Set) this.allPurchasedSkus$delegate.getValue();
    }

    public final EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final Date getExpirationDateForEntitlement(String str) {
        C6496s.h(str, "entitlement");
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(str);
        if (entitlementInfo != null) {
            return entitlementInfo.getExpirationDate();
        }
        return null;
    }

    public final Date getExpirationDateForProductId(String str) {
        C6496s.h(str, "productId");
        return this.allExpirationDatesByProduct.get(str);
    }

    @C6521e
    public final Date getExpirationDateForSku(String str) {
        C6496s.h(str, "sku");
        return this.allExpirationDatesByProduct.get(str);
    }

    public final Date getFirstSeen() {
        return this.firstSeen;
    }

    public final Date getLatestExpirationDate() {
        return (Date) this.latestExpirationDate$delegate.getValue();
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final List<Transaction> getNonSubscriptionTransactions() {
        return (List) this.nonSubscriptionTransactions$delegate.getValue();
    }

    public final String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final Date getPurchaseDateForEntitlement(String str) {
        C6496s.h(str, "entitlement");
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(str);
        if (entitlementInfo != null) {
            return entitlementInfo.getLatestPurchaseDate();
        }
        return null;
    }

    public final Date getPurchaseDateForProductId(String str) {
        C6496s.h(str, "productId");
        return this.allPurchaseDatesByProduct.get(str);
    }

    @C6521e
    public final Date getPurchaseDateForSku(String str) {
        C6496s.h(str, "sku");
        return this.allPurchaseDatesByProduct.get(str);
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public final Map<String, SubscriptionInfo> getSubscriptionsByProductIdentifier() {
        return (Map) this.subscriptionsByProductIdentifier$delegate.getValue();
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<CustomerInfo\n latestExpirationDate: ");
        sb2.append(getLatestExpirationDate());
        sb2.append("\nactiveSubscriptions:  ");
        Iterable<String> activeSubscriptions = getActiveSubscriptions();
        ArrayList arrayList = new ArrayList(C6565s.y(activeSubscriptions, 10));
        for (String str : activeSubscriptions) {
            arrayList.add(C6502A.a(str, O.f(C6502A.a("expiresDate", getExpirationDateForProductId(str)))));
        }
        sb2.append(O.w(arrayList));
        sb2.append(",\nactiveEntitlements: ");
        Map<String, EntitlementInfo> active = this.entitlements.getActive();
        ArrayList arrayList2 = new ArrayList(active.size());
        for (Map.Entry<String, EntitlementInfo> obj : active.entrySet()) {
            arrayList2.add(obj.toString());
        }
        sb2.append(arrayList2);
        sb2.append(",\nentitlements: ");
        Map<String, EntitlementInfo> all = this.entitlements.getAll();
        ArrayList arrayList3 = new ArrayList(all.size());
        for (Map.Entry<String, EntitlementInfo> obj2 : all.entrySet()) {
            arrayList3.add(obj2.toString());
        }
        sb2.append(arrayList3);
        sb2.append(",\nnonSubscriptionTransactions: ");
        sb2.append(getNonSubscriptionTransactions());
        sb2.append(",\nrequestDate: ");
        sb2.append(this.requestDate);
        sb2.append("\n>");
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        this.entitlements.writeToParcel(parcel, i10);
        Map<String, Date> map = this.allExpirationDatesByProduct;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeSerializable((Serializable) next.getValue());
        }
        Map<String, Date> map2 = this.allPurchaseDatesByProduct;
        parcel.writeInt(map2.size());
        for (Map.Entry next2 : map2.entrySet()) {
            parcel.writeString((String) next2.getKey());
            parcel.writeSerializable((Serializable) next2.getValue());
        }
        parcel.writeSerializable(this.requestDate);
        parcel.writeInt(this.schemaVersion);
        parcel.writeSerializable(this.firstSeen);
        parcel.writeString(this.originalAppUserId);
        parcel.writeParcelable(this.managementURL, i10);
        parcel.writeSerializable(this.originalPurchaseDate);
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, i10);
    }

    public JSONObject getRawData() {
        return this.jsonObject;
    }
}
