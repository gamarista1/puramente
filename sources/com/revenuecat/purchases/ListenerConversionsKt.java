package com.revenuecat.purchases;

import android.app.Activity;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\u001aA\u0010\t\u001a\u00020\b2\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\r\u001a\u00020\f2\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a7\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aY\u0010#\u001a\u00020\u0003*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007¢\u0006\u0004\b#\u0010$\u001aY\u0010'\u001a\u00020\u0003*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007¢\u0006\u0004\b'\u0010(\u001aI\u0010+\u001a\u00020\u0003*\u00020\u001e2\u0006\u0010*\u001a\u00020)2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0004\b+\u0010,\u001a;\u0010-\u001a\u00020\u0003*\u00020\u001e2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b-\u0010.\u001a;\u0010/\u001a\u00020\u0003*\u00020\u001e2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b/\u0010.\u001aC\u0010/\u001a\u00020\u0003*\u00020\u001e2\u0006\u00101\u001a\u0002002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b/\u00102\u001a;\u00103\u001a\u00020\u0003*\u00020\u001e2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b3\u0010.\u001a;\u00104\u001a\u00020\u0003*\u00020\u001e2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b4\u0010.\u001a;\u00105\u001a\u00020\u0003*\u00020\u001e2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b5\u0010.\u001aQ\u00109\u001a\u00020\u0003*\u00020\u001e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020)062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u00108\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!06\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b9\u0010:\u001aO\u0010;\u001a\u00020\u0003*\u00020\u001e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020)062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u00108\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!06\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b;\u0010:¨\u0006<"}, d2 = {"Lkotlin/Function2;", "Lcom/revenuecat/purchases/CustomerInfo;", "", "Llf/M;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "logInSuccessListener", "(Lyf/p;Lyf/l;)Lcom/revenuecat/purchases/interfaces/LogInCallback;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "productChangeCompletedListener", "(Lyf/p;Lyf/p;)Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "syncPurchasesListener", "(Lyf/l;Lyf/l;)Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "Lcom/revenuecat/purchases/Offerings;", "Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;", "syncAttributesAndOfferingsListener", "(Lyf/l;Lyf/l;)Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;", "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;", "getAmazonLWAConsentStatusListener", "(Lyf/l;Lyf/l;)Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;", "getCustomerCenterConfigDataListener", "(Lyf/l;Lyf/l;)Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;", "Lcom/revenuecat/purchases/Purchases;", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "purchaseProductWith", "(Lcom/revenuecat/purchases/Purchases;Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lyf/p;Lyf/p;)V", "Lcom/revenuecat/purchases/Package;", "packageToPurchase", "purchasePackageWith", "(Lcom/revenuecat/purchases/Purchases;Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lyf/p;Lyf/p;)V", "", "appUserID", "logInWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Lyf/l;Lyf/p;)V", "logOutWith", "(Lcom/revenuecat/purchases/Purchases;Lyf/l;Lyf/l;)V", "getCustomerInfoWith", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;Lyf/l;Lyf/l;)V", "syncPurchasesWith", "syncAttributesAndOfferingsIfNeededWith", "getAmazonLWAConsentStatusWith", "", "skus", "onReceiveSkus", "getSubscriptionSkusWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lyf/l;Lyf/l;)V", "getNonSubscriptionSkusWith", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ListenerConversionsKt {
    public static final GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusListener(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        return new ListenerConversionsKt$getAmazonLWAConsentStatusListener$1(lVar, lVar2);
    }

    public static final void getAmazonLWAConsentStatusWith(Purchases purchases, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onSuccess");
        purchases.getAmazonLWAConsentStatus(getAmazonLWAConsentStatusListener(lVar2, lVar));
    }

    public static /* synthetic */ void getAmazonLWAConsentStatusWith$default(Purchases purchases, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getAmazonLWAConsentStatusWith(purchases, lVar, lVar2);
    }

    public static final GetCustomerCenterConfigCallback getCustomerCenterConfigDataListener(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        return new ListenerConversionsKt$getCustomerCenterConfigDataListener$1(lVar, lVar2);
    }

    public static final void getCustomerInfoWith(Purchases purchases, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onSuccess");
        purchases.getCustomerInfo(ListenerConversionsCommonKt.receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, lVar, lVar2);
    }

    @C6521e
    public static final void getNonSubscriptionSkusWith(Purchases purchases, List<String> list, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(list, b.f37457O);
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onReceiveSkus");
        purchases.getProducts(list, ProductType.INAPP, ListenerConversionsCommonKt.getStoreProductsCallback(lVar2, lVar));
    }

    @C6521e
    public static final void getSubscriptionSkusWith(Purchases purchases, List<String> list, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(list, b.f37457O);
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onReceiveSkus");
        purchases.getProducts(list, ProductType.SUBS, ListenerConversionsCommonKt.getStoreProductsCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getSubscriptionSkusWith$default(Purchases purchases, List list, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getSubscriptionSkusWith(purchases, list, lVar, lVar2);
    }

    public static final LogInCallback logInSuccessListener(p pVar, C6798l lVar) {
        C6496s.h(pVar, "onSuccess");
        C6496s.h(lVar, "onError");
        return new ListenerConversionsKt$logInSuccessListener$1(pVar, lVar);
    }

    public static final void logInWith(Purchases purchases, String str, C6798l lVar, p pVar) {
        C6496s.h(purchases, "<this>");
        C6496s.h(str, "appUserID");
        C6496s.h(lVar, "onError");
        C6496s.h(pVar, "onSuccess");
        purchases.logIn(str, logInSuccessListener(pVar, lVar));
    }

    public static /* synthetic */ void logInWith$default(Purchases purchases, String str, C6798l lVar, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logInWith(purchases, str, lVar, pVar);
    }

    public static final void logOutWith(Purchases purchases, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onSuccess");
        purchases.logOut(ListenerConversionsCommonKt.receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static /* synthetic */ void logOutWith$default(Purchases purchases, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logOutWith(purchases, lVar, lVar2);
    }

    public static final ProductChangeCallback productChangeCompletedListener(p pVar, p pVar2) {
        C6496s.h(pVar, "onSuccess");
        C6496s.h(pVar2, "onError");
        return new ListenerConversionsKt$productChangeCompletedListener$1(pVar, pVar2);
    }

    @C6521e
    public static final void purchasePackageWith(Purchases purchases, Activity activity, Package packageR, p pVar, p pVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(activity, "activity");
        C6496s.h(packageR, "packageToPurchase");
        C6496s.h(pVar, "onError");
        C6496s.h(pVar2, "onSuccess");
        purchases.purchasePackage(activity, packageR, ListenerConversionsCommonKt.purchaseCompletedCallback(pVar2, pVar));
    }

    public static /* synthetic */ void purchasePackageWith$default(Purchases purchases, Activity activity, Package packageR, p pVar, p pVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            pVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchasePackageWith(purchases, activity, packageR, pVar, pVar2);
    }

    @C6521e
    public static final void purchaseProductWith(Purchases purchases, Activity activity, StoreProduct storeProduct, p pVar, p pVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(activity, "activity");
        C6496s.h(storeProduct, "storeProduct");
        C6496s.h(pVar, "onError");
        C6496s.h(pVar2, "onSuccess");
        purchases.purchaseProduct(activity, storeProduct, ListenerConversionsCommonKt.purchaseCompletedCallback(pVar2, pVar));
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, StoreProduct storeProduct, p pVar, p pVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            pVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchaseProductWith(purchases, activity, storeProduct, pVar, pVar2);
    }

    public static final void syncAttributesAndOfferingsIfNeededWith(Purchases purchases, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onSuccess");
        purchases.syncAttributesAndOfferingsIfNeeded(syncAttributesAndOfferingsListener(lVar2, lVar));
    }

    public static /* synthetic */ void syncAttributesAndOfferingsIfNeededWith$default(Purchases purchases, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncAttributesAndOfferingsIfNeededWith(purchases, lVar, lVar2);
    }

    public static final SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsListener(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        return new ListenerConversionsKt$syncAttributesAndOfferingsListener$1(lVar, lVar2);
    }

    public static final SyncPurchasesCallback syncPurchasesListener(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        return new ListenerConversionsKt$syncPurchasesListener$1(lVar, lVar2);
    }

    public static final void syncPurchasesWith(Purchases purchases, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onSuccess");
        purchases.syncPurchases(syncPurchasesListener(lVar2, lVar));
    }

    public static /* synthetic */ void syncPurchasesWith$default(Purchases purchases, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncPurchasesWith(purchases, lVar, lVar2);
    }

    public static final void getCustomerInfoWith(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(cacheFetchPolicy, "fetchPolicy");
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onSuccess");
        purchases.getCustomerInfo(cacheFetchPolicy, ListenerConversionsCommonKt.receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, cacheFetchPolicy, lVar, lVar2);
    }
}
