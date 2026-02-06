package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0001\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001eJ\u001a\u0010!\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010'J\u0010\u00104\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0010\u00109\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010'J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010'J\u0012\u0010=\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b=\u0010>J¼\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bA\u0010'J\u0010\u0010B\u001a\u00020#HÖ\u0001¢\u0006\u0004\bB\u0010%J \u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020#HÖ\u0001¢\u0006\u0004\bG\u0010HR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010M\u001a\u0004\bN\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bP\u0010-R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bQ\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010R\u001a\u0004\bS\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010T\u001a\u0004\b\u000e\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bU\u0010'R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010V\u001a\u0004\bW\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010X\u001a\u0004\bY\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bZ\u0010'R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u0010:R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\b]\u0010'R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\b^\u0010'R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\b`\u0010>R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028FX\u0004¢\u0006\f\u0012\u0004\bb\u0010c\u001a\u0004\ba\u0010'R \u0010f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\be\u0010c\u001a\u0004\bd\u0010)¨\u0006g"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "Landroid/os/Parcelable;", "", "orderId", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "type", "", "purchaseTime", "purchaseToken", "Lcom/revenuecat/purchases/models/PurchaseState;", "purchaseState", "", "isAutoRenewing", "signature", "Lorg/json/JSONObject;", "originalJson", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "storeUserID", "Lcom/revenuecat/purchases/models/PurchaseType;", "purchaseType", "marketplace", "subscriptionOptionId", "Lcom/revenuecat/purchases/ReplacementMode;", "replacementMode", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)V", "presentedOfferingIdentifier", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/revenuecat/purchases/ProductType;", "component4", "()J", "component5", "component6", "()Lcom/revenuecat/purchases/models/PurchaseState;", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "()Lorg/json/JSONObject;", "component10", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "component11", "component12", "()Lcom/revenuecat/purchases/models/PurchaseType;", "component13", "component14", "component15", "()Lcom/revenuecat/purchases/ReplacementMode;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)Lcom/revenuecat/purchases/models/StoreTransaction;", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOrderId", "Ljava/util/List;", "getProductIds", "Lcom/revenuecat/purchases/ProductType;", "getType", "J", "getPurchaseTime", "getPurchaseToken", "Lcom/revenuecat/purchases/models/PurchaseState;", "getPurchaseState", "Ljava/lang/Boolean;", "getSignature", "Lorg/json/JSONObject;", "getOriginalJson", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "getStoreUserID", "Lcom/revenuecat/purchases/models/PurchaseType;", "getPurchaseType", "getMarketplace", "getSubscriptionOptionId", "Lcom/revenuecat/purchases/ReplacementMode;", "getReplacementMode", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "getSkus", "getSkus$annotations", "skus", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StoreTransaction implements Parcelable {
    public static final Parcelable.Creator<StoreTransaction> CREATOR = new Creator();
    private final Boolean isAutoRenewing;
    private final String marketplace;
    private final String orderId;
    private final JSONObject originalJson;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<String> productIds;
    private final PurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final PurchaseType purchaseType;
    private final ReplacementMode replacementMode;
    private final String signature;
    private final String storeUserID;
    private final String subscriptionOptionId;
    private final ProductType type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoreTransaction> {
        public final StoreTransaction createFromParcel(Parcel parcel) {
            Boolean bool;
            Parcel parcel2 = parcel;
            C6496s.h(parcel2, "parcel");
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ProductType valueOf = ProductType.valueOf(parcel.readString());
            long readLong = parcel.readLong();
            String readString2 = parcel.readString();
            PurchaseState valueOf2 = PurchaseState.valueOf(parcel.readString());
            PresentedOfferingContext presentedOfferingContext = null;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString3 = parcel.readString();
            JSONObject create = JSONObjectParceler.INSTANCE.create(parcel2);
            if (parcel.readInt() != 0) {
                presentedOfferingContext = PresentedOfferingContext.CREATOR.createFromParcel(parcel2);
            }
            return new StoreTransaction(readString, (List<String>) createStringArrayList, valueOf, readLong, readString2, valueOf2, bool, readString3, create, presentedOfferingContext, parcel.readString(), PurchaseType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (ReplacementMode) parcel2.readParcelable(StoreTransaction.class.getClassLoader()));
        }

        public final StoreTransaction[] newArray(int i10) {
            return new StoreTransaction[i10];
        }
    }

    public StoreTransaction(String str, List<String> list, ProductType productType, long j10, String str2, PurchaseState purchaseState2, Boolean bool, String str3, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext2, String str4, PurchaseType purchaseType2, String str5, String str6, ReplacementMode replacementMode2) {
        JSONObject jSONObject2 = jSONObject;
        PurchaseType purchaseType3 = purchaseType2;
        C6496s.h(list, "productIds");
        C6496s.h(productType, "type");
        C6496s.h(str2, "purchaseToken");
        C6496s.h(purchaseState2, "purchaseState");
        C6496s.h(jSONObject2, "originalJson");
        C6496s.h(purchaseType3, "purchaseType");
        this.orderId = str;
        this.productIds = list;
        this.type = productType;
        this.purchaseTime = j10;
        this.purchaseToken = str2;
        this.purchaseState = purchaseState2;
        this.isAutoRenewing = bool;
        this.signature = str3;
        this.originalJson = jSONObject2;
        this.presentedOfferingContext = presentedOfferingContext2;
        this.storeUserID = str4;
        this.purchaseType = purchaseType3;
        this.marketplace = str5;
        this.subscriptionOptionId = str6;
        this.replacementMode = replacementMode2;
    }

    public static /* synthetic */ StoreTransaction copy$default(StoreTransaction storeTransaction, String str, List list, ProductType productType, long j10, String str2, PurchaseState purchaseState2, Boolean bool, String str3, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext2, String str4, PurchaseType purchaseType2, String str5, String str6, ReplacementMode replacementMode2, int i10, Object obj) {
        StoreTransaction storeTransaction2 = storeTransaction;
        int i11 = i10;
        return storeTransaction.copy((i11 & 1) != 0 ? storeTransaction2.orderId : str, (i11 & 2) != 0 ? storeTransaction2.productIds : list, (i11 & 4) != 0 ? storeTransaction2.type : productType, (i11 & 8) != 0 ? storeTransaction2.purchaseTime : j10, (i11 & 16) != 0 ? storeTransaction2.purchaseToken : str2, (i11 & 32) != 0 ? storeTransaction2.purchaseState : purchaseState2, (i11 & 64) != 0 ? storeTransaction2.isAutoRenewing : bool, (i11 & 128) != 0 ? storeTransaction2.signature : str3, (i11 & 256) != 0 ? storeTransaction2.originalJson : jSONObject, (i11 & 512) != 0 ? storeTransaction2.presentedOfferingContext : presentedOfferingContext2, (i11 & 1024) != 0 ? storeTransaction2.storeUserID : str4, (i11 & 2048) != 0 ? storeTransaction2.purchaseType : purchaseType2, (i11 & 4096) != 0 ? storeTransaction2.marketplace : str5, (i11 & 8192) != 0 ? storeTransaction2.subscriptionOptionId : str6, (i11 & 16384) != 0 ? storeTransaction2.replacementMode : replacementMode2);
    }

    @C6521e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @C6521e
    public static /* synthetic */ void getSkus$annotations() {
    }

    public final String component1() {
        return this.orderId;
    }

    public final PresentedOfferingContext component10() {
        return this.presentedOfferingContext;
    }

    public final String component11() {
        return this.storeUserID;
    }

    public final PurchaseType component12() {
        return this.purchaseType;
    }

    public final String component13() {
        return this.marketplace;
    }

    public final String component14() {
        return this.subscriptionOptionId;
    }

    public final ReplacementMode component15() {
        return this.replacementMode;
    }

    public final List<String> component2() {
        return this.productIds;
    }

    public final ProductType component3() {
        return this.type;
    }

    public final long component4() {
        return this.purchaseTime;
    }

    public final String component5() {
        return this.purchaseToken;
    }

    public final PurchaseState component6() {
        return this.purchaseState;
    }

    public final Boolean component7() {
        return this.isAutoRenewing;
    }

    public final String component8() {
        return this.signature;
    }

    public final JSONObject component9() {
        return this.originalJson;
    }

    public final StoreTransaction copy(String str, List<String> list, ProductType productType, long j10, String str2, PurchaseState purchaseState2, Boolean bool, String str3, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext2, String str4, PurchaseType purchaseType2, String str5, String str6, ReplacementMode replacementMode2) {
        String str7 = str;
        C6496s.h(list, "productIds");
        C6496s.h(productType, "type");
        C6496s.h(str2, "purchaseToken");
        C6496s.h(purchaseState2, "purchaseState");
        C6496s.h(jSONObject, "originalJson");
        C6496s.h(purchaseType2, "purchaseType");
        return new StoreTransaction(str, list, productType, j10, str2, purchaseState2, bool, str3, jSONObject, presentedOfferingContext2, str4, purchaseType2, str5, str6, replacementMode2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StoreTransaction) || !C6496s.c(new ComparableData(this), new ComparableData((StoreTransaction) obj))) {
            return false;
        }
        return true;
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final JSONObject getOriginalJson() {
        return this.originalJson;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext2 = this.presentedOfferingContext;
        if (presentedOfferingContext2 != null) {
            return presentedOfferingContext2.getOfferingIdentifier();
        }
        return null;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final List<String> getSkus() {
        return this.productIds;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return "StoreTransaction(orderId=" + this.orderId + ", productIds=" + this.productIds + ", type=" + this.type + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ", purchaseState=" + this.purchaseState + ", isAutoRenewing=" + this.isAutoRenewing + ", signature=" + this.signature + ", originalJson=" + this.originalJson + ", presentedOfferingContext=" + this.presentedOfferingContext + ", storeUserID=" + this.storeUserID + ", purchaseType=" + this.purchaseType + ", marketplace=" + this.marketplace + ", subscriptionOptionId=" + this.subscriptionOptionId + ", replacementMode=" + this.replacementMode + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeString(this.orderId);
        parcel.writeStringList(this.productIds);
        parcel.writeString(this.type.name());
        parcel.writeLong(this.purchaseTime);
        parcel.writeString(this.purchaseToken);
        parcel.writeString(this.purchaseState.name());
        Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.signature);
        JSONObjectParceler.INSTANCE.write(this.originalJson, parcel, i10);
        PresentedOfferingContext presentedOfferingContext2 = this.presentedOfferingContext;
        if (presentedOfferingContext2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            presentedOfferingContext2.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.storeUserID);
        parcel.writeString(this.purchaseType.name());
        parcel.writeString(this.marketplace);
        parcel.writeString(this.subscriptionOptionId);
        parcel.writeParcelable(this.replacementMode, i10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @lf.C6521e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StoreTransaction(java.lang.String r20, java.util.List<java.lang.String> r21, com.revenuecat.purchases.ProductType r22, long r23, java.lang.String r25, com.revenuecat.purchases.models.PurchaseState r26, java.lang.Boolean r27, java.lang.String r28, org.json.JSONObject r29, java.lang.String r30, java.lang.String r31, com.revenuecat.purchases.models.PurchaseType r32, java.lang.String r33, java.lang.String r34, com.revenuecat.purchases.ReplacementMode r35) {
        /*
            r19 = this;
            r0 = r30
            java.lang.String r1 = "productIds"
            r4 = r21
            kotlin.jvm.internal.C6496s.h(r4, r1)
            java.lang.String r1 = "type"
            r5 = r22
            kotlin.jvm.internal.C6496s.h(r5, r1)
            java.lang.String r1 = "purchaseToken"
            r8 = r25
            kotlin.jvm.internal.C6496s.h(r8, r1)
            java.lang.String r1 = "purchaseState"
            r9 = r26
            kotlin.jvm.internal.C6496s.h(r9, r1)
            java.lang.String r1 = "originalJson"
            r12 = r29
            kotlin.jvm.internal.C6496s.h(r12, r1)
            java.lang.String r1 = "purchaseType"
            r15 = r32
            kotlin.jvm.internal.C6496s.h(r15, r1)
            if (r0 == 0) goto L_0x0035
            com.revenuecat.purchases.PresentedOfferingContext r1 = new com.revenuecat.purchases.PresentedOfferingContext
            r1.<init>(r0)
            r13 = r1
            goto L_0x0037
        L_0x0035:
            r0 = 0
            r13 = r0
        L_0x0037:
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r14 = r31
            r15 = r32
            r16 = r33
            r17 = r34
            r18 = r35
            r2.<init>((java.lang.String) r3, (java.util.List<java.lang.String>) r4, (com.revenuecat.purchases.ProductType) r5, (long) r6, (java.lang.String) r8, (com.revenuecat.purchases.models.PurchaseState) r9, (java.lang.Boolean) r10, (java.lang.String) r11, (org.json.JSONObject) r12, (com.revenuecat.purchases.PresentedOfferingContext) r13, (java.lang.String) r14, (com.revenuecat.purchases.models.PurchaseType) r15, (java.lang.String) r16, (java.lang.String) r17, (com.revenuecat.purchases.ReplacementMode) r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.models.StoreTransaction.<init>(java.lang.String, java.util.List, com.revenuecat.purchases.ProductType, long, java.lang.String, com.revenuecat.purchases.models.PurchaseState, java.lang.Boolean, java.lang.String, org.json.JSONObject, java.lang.String, java.lang.String, com.revenuecat.purchases.models.PurchaseType, java.lang.String, java.lang.String, com.revenuecat.purchases.ReplacementMode):void");
    }
}
