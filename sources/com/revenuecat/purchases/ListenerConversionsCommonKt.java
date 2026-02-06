package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001aC\u0010\t\u001a\u00020\b2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001a\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u001a\u0010\u001b\u001aQ\u0010\u001e\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aO\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b#\u0010$\u001aY\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\b\u0010&\u001a\u0004\u0018\u00010%2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b#\u0010'\u001a;\u0010(\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b(\u0010\u001b\"&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b8\u0000X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\",\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lkotlin/Function2;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "Llf/M;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "", "onError", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchaseCompletedCallback", "(Lyf/p;Lyf/p;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "onReceived", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "getStoreProductsCallback", "(Lyf/l;Lyf/l;)Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "Lcom/revenuecat/purchases/Offerings;", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "receiveOfferingsCallback", "(Lyf/l;Lyf/l;)Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "receiveCustomerInfoCallback", "(Lyf/l;Lyf/l;)Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "Lcom/revenuecat/purchases/Purchases;", "getOfferingsWith", "(Lcom/revenuecat/purchases/Purchases;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "purchaseWith", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lyf/p;Lyf/p;)V", "", "productIds", "onGetStoreProducts", "getProductsWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/ProductType;", "type", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lyf/l;Lyf/l;)V", "restorePurchasesWith", "ON_ERROR_STUB", "Lyf/l;", "getON_ERROR_STUB", "()Lyf/l;", "ON_PURCHASE_ERROR_STUB", "Lyf/p;", "getON_PURCHASE_ERROR_STUB", "()Lyf/p;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ListenerConversionsCommonKt {
    private static final C6798l ON_ERROR_STUB = ListenerConversionsCommonKt$ON_ERROR_STUB$1.INSTANCE;
    private static final p ON_PURCHASE_ERROR_STUB = ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1.INSTANCE;

    public static final C6798l getON_ERROR_STUB() {
        return ON_ERROR_STUB;
    }

    public static final p getON_PURCHASE_ERROR_STUB() {
        return ON_PURCHASE_ERROR_STUB;
    }

    public static final void getOfferingsWith(Purchases purchases, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onSuccess");
        purchases.getOfferings(receiveOfferingsCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getOfferingsWith$default(Purchases purchases, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getOfferingsWith(purchases, lVar, lVar2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> list, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(list, "productIds");
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onGetStoreProducts");
        purchases.getProducts(list, getStoreProductsCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, lVar, lVar2);
    }

    public static final GetStoreProductsCallback getStoreProductsCallback(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onReceived");
        C6496s.h(lVar2, "onError");
        return new ListenerConversionsCommonKt$getStoreProductsCallback$1(lVar, lVar2);
    }

    public static final PurchaseCallback purchaseCompletedCallback(p pVar, p pVar2) {
        C6496s.h(pVar, "onSuccess");
        C6496s.h(pVar2, "onError");
        return new ListenerConversionsCommonKt$purchaseCompletedCallback$1(pVar, pVar2);
    }

    public static final void purchaseWith(Purchases purchases, PurchaseParams purchaseParams, p pVar, p pVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(purchaseParams, "purchaseParams");
        C6496s.h(pVar, "onError");
        C6496s.h(pVar2, "onSuccess");
        purchases.purchase(purchaseParams, purchaseCompletedCallback(pVar2, pVar));
    }

    public static /* synthetic */ void purchaseWith$default(Purchases purchases, PurchaseParams purchaseParams, p pVar, p pVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = ON_PURCHASE_ERROR_STUB;
        }
        purchaseWith(purchases, purchaseParams, pVar, pVar2);
    }

    public static final ReceiveCustomerInfoCallback receiveCustomerInfoCallback(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        return new ListenerConversionsCommonKt$receiveCustomerInfoCallback$1(lVar, lVar2);
    }

    public static final ReceiveOfferingsCallback receiveOfferingsCallback(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        return new ListenerConversionsCommonKt$receiveOfferingsCallback$1(lVar, lVar2);
    }

    public static final void restorePurchasesWith(Purchases purchases, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onSuccess");
        purchases.restorePurchases(receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static /* synthetic */ void restorePurchasesWith$default(Purchases purchases, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ON_ERROR_STUB;
        }
        restorePurchasesWith(purchases, lVar, lVar2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> list, ProductType productType, C6798l lVar, C6798l lVar2) {
        C6496s.h(purchases, "<this>");
        C6496s.h(list, "productIds");
        C6496s.h(lVar, "onError");
        C6496s.h(lVar2, "onGetStoreProducts");
        purchases.getProducts(list, productType, getStoreProductsCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, ProductType productType, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, productType, lVar, lVar2);
    }
}
