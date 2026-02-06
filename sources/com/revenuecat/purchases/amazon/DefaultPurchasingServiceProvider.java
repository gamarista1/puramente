package com.revenuecat.purchases.amazon;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J \u0010%\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/amazon/DefaultPurchasingServiceProvider;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/amazon/device/iap/PurchasingListener;", "listener", "Llf/M;", "registerListener", "(Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V", "Lcom/amazon/device/iap/model/RequestId;", "getUserData", "()Lcom/amazon/device/iap/model/RequestId;", "", "sku", "purchase", "(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;", "", "skus", "getProductData", "(Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;", "", "reset", "getPurchaseUpdates", "(Z)Lcom/amazon/device/iap/model/RequestId;", "receiptId", "Lcom/amazon/device/iap/model/FulfillmentResult;", "fulfillmentResult", "notifyFulfillment", "(Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultPurchasingServiceProvider implements PurchasingServiceProvider {
    public static final Parcelable.Creator<DefaultPurchasingServiceProvider> CREATOR = new Creator();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DefaultPurchasingServiceProvider> {
        public final DefaultPurchasingServiceProvider createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            parcel.readInt();
            return new DefaultPurchasingServiceProvider();
        }

        public final DefaultPurchasingServiceProvider[] newArray(int i10) {
            return new DefaultPurchasingServiceProvider[i10];
        }
    }

    public int describeContents() {
        return 0;
    }

    public RequestId getProductData(Set<String> set) {
        C6496s.h(set, b.f37457O);
        RequestId productData = PurchasingService.getProductData(set);
        C6496s.g(productData, "getProductData(skus)");
        return productData;
    }

    public RequestId getPurchaseUpdates(boolean z10) {
        RequestId purchaseUpdates = PurchasingService.getPurchaseUpdates(z10);
        C6496s.g(purchaseUpdates, "getPurchaseUpdates(reset)");
        return purchaseUpdates;
    }

    public RequestId getUserData() {
        RequestId userData = PurchasingService.getUserData(UserDataRequest.newBuilder().setFetchLWAConsentStatus(true).build());
        C6496s.g(userData, "getUserData(UserDataRequ…sentStatus(true).build())");
        return userData;
    }

    public void notifyFulfillment(String str, FulfillmentResult fulfillmentResult) {
        C6496s.h(str, b.f37447E);
        C6496s.h(fulfillmentResult, "fulfillmentResult");
        PurchasingService.notifyFulfillment(str, fulfillmentResult);
    }

    public RequestId purchase(String str) {
        C6496s.h(str, "sku");
        RequestId purchase = PurchasingService.purchase(str);
        C6496s.g(purchase, "purchase(sku)");
        return purchase;
    }

    public void registerListener(Context context, PurchasingListener purchasingListener) {
        C6496s.h(context, "context");
        C6496s.h(purchasingListener, "listener");
        PurchasingService.registerListener(context, purchasingListener);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeInt(1);
    }
}
