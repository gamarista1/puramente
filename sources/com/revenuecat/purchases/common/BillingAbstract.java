package com.revenuecat.purchases.common;

import android.app.Activity;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001:\u0002abB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH$¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJI\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\b0\u00112\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J[\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u001c\u0010 \u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u001f2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0016H&¢\u0006\u0004\b\"\u0010#J/\u0010*\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020$2\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b*\u0010+JO\u0010.\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u000f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u00112\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0011H&¢\u0006\u0004\b.\u0010/JG\u00109\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00108\u001a\u0004\u0018\u00010$H&¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020$H&¢\u0006\u0004\b;\u0010<JK\u0010?\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u001e\u0010>\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130=\u0012\u0004\u0012\u00020\b0\u00112\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0011H&¢\u0006\u0004\b?\u0010\u0019JO\u0010C\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u00112\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0011H\u0016¢\u0006\u0004\bC\u0010DJ3\u0010I\u001a\u00020\b2\u0006\u00101\u001a\u0002002\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00122\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\b0GH&¢\u0006\u0004\bI\u0010JJ;\u0010K\u001a\u00020\b2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u00112\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0016H&¢\u0006\u0004\bK\u0010LJ;\u0010N\u001a\u00020\b2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u00112\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0016H\u0016¢\u0006\u0004\bN\u0010LR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0004¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010QR.\u0010T\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010R8F@FX\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010[\u001a\u0004\u0018\u00010Z8F@\u0006X\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`¨\u0006c"}, d2 = {"Lcom/revenuecat/purchases/common/BillingAbstract;", "", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "purchasesStateProvider", "<init>", "(Lcom/revenuecat/purchases/PurchasesStateProvider;)V", "", "delayMilliseconds", "Llf/M;", "startConnectionOnMainThread", "(J)V", "startConnection", "()V", "endConnection", "close", "", "appUserID", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "onReceivePurchaseHistory", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onReceivePurchaseHistoryError", "queryAllPurchases", "(Ljava/lang/String;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/ProductType;", "productType", "", "productIds", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "onError", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lyf/l;Lyf/l;)V", "", "finishTransactions", "purchase", "shouldConsume", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;ZLcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "productId", "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lyf/l;Lyf/l;)V", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "isConnected", "()Z", "", "onSuccess", "queryPurchases", "productID", "purchaseToken", "storeUserID", "normalizePurchaseData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lyf/a;)V", "getStorefront", "(Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "getAmazonLWAConsentStatus", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "getPurchasesStateProvider", "()Lcom/revenuecat/purchases/PurchasesStateProvider;", "Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "<set-?>", "stateListener", "Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "getStateListener", "()Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "setStateListener", "(Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;)V", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "purchasesUpdatedListener", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getPurchasesUpdatedListener", "()Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "setPurchasesUpdatedListener", "(Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;)V", "PurchasesUpdatedListener", "StateListener", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BillingAbstract {
    private final PurchasesStateProvider purchasesStateProvider;
    private volatile PurchasesUpdatedListener purchasesUpdatedListener;
    private volatile StateListener stateListener;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchases", "Llf/M;", "onPurchasesUpdated", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "onPurchasesFailedToUpdate", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PurchasesUpdatedListener {
        void onPurchasesFailedToUpdate(PurchasesError purchasesError);

        void onPurchasesUpdated(List<StoreTransaction> list);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "", "Llf/M;", "onConnected", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface StateListener {
        void onConnected();
    }

    public BillingAbstract(PurchasesStateProvider purchasesStateProvider2) {
        C6496s.h(purchasesStateProvider2, "purchasesStateProvider");
        this.purchasesStateProvider = purchasesStateProvider2;
    }

    public static /* synthetic */ void makePurchaseAsync$default(BillingAbstract billingAbstract, Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 32) != 0) {
                bool = null;
            }
            billingAbstract.makePurchaseAsync(activity, str, purchasingData, replaceProductInfo, presentedOfferingContext, bool);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makePurchaseAsync");
    }

    public static /* synthetic */ void startConnectionOnMainThread$default(BillingAbstract billingAbstract, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            billingAbstract.startConnectionOnMainThread(j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startConnectionOnMainThread");
    }

    public final void close() {
        this.purchasesUpdatedListener = null;
        endConnection();
    }

    public abstract void consumeAndSave(boolean z10, StoreTransaction storeTransaction, boolean z11, PostReceiptInitiationSource postReceiptInitiationSource);

    /* access modifiers changed from: protected */
    public abstract void endConnection();

    public abstract void findPurchaseInPurchaseHistory(String str, ProductType productType, String str2, C6798l lVar, C6798l lVar2);

    public void getAmazonLWAConsentStatus(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        lVar.invoke(AmazonLWAConsentStatus.UNAVAILABLE);
    }

    /* access modifiers changed from: protected */
    public final PurchasesStateProvider getPurchasesStateProvider() {
        return this.purchasesStateProvider;
    }

    public final synchronized PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return this.purchasesUpdatedListener;
    }

    public final synchronized StateListener getStateListener() {
        return this.stateListener;
    }

    public abstract void getStorefront(C6798l lVar, C6798l lVar2);

    public abstract boolean isConnected();

    public abstract void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool);

    public void normalizePurchaseData(String str, String str2, String str3, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "productID");
        C6496s.h(str2, "purchaseToken");
        C6496s.h(str3, "storeUserID");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        lVar.invoke(str);
    }

    public abstract void queryAllPurchases(String str, C6798l lVar, C6798l lVar2);

    public abstract void queryProductDetailsAsync(ProductType productType, Set<String> set, C6798l lVar, C6798l lVar2);

    public abstract void queryPurchases(String str, C6798l lVar, C6798l lVar2);

    public final void setPurchasesUpdatedListener(PurchasesUpdatedListener purchasesUpdatedListener2) {
        this.purchasesUpdatedListener = purchasesUpdatedListener2;
    }

    public final synchronized void setStateListener(StateListener stateListener2) {
        this.stateListener = stateListener2;
    }

    public abstract void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list, C6787a aVar);

    public abstract void startConnection();

    public abstract void startConnectionOnMainThread(long j10);
}
