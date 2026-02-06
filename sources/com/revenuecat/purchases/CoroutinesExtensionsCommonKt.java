package com.revenuecat.purchases;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import qf.C6658d;
import qf.i;
import rf.C6680b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/Offerings;", "awaitOfferings", "(Lcom/revenuecat/purchases/Purchases;Lqf/d;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/PurchaseResult;", "awaitPurchase", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lqf/d;)Ljava/lang/Object;", "", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/models/StoreProduct;", "awaitGetProducts", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lqf/d;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitRestore", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutinesExtensionsCommonKt {
    public static final /* synthetic */ Object awaitGetProducts(Purchases purchases, List list, ProductType productType, C6658d dVar) {
        i iVar = new i(C6680b.c(dVar));
        ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(iVar), new CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(iVar));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    public static /* synthetic */ Object awaitGetProducts$default(Purchases purchases, List list, ProductType productType, C6658d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        return awaitGetProducts(purchases, list, productType, dVar);
    }

    public static final /* synthetic */ Object awaitOfferings(Purchases purchases, C6658d dVar) {
        i iVar = new i(C6680b.c(dVar));
        ListenerConversionsCommonKt.getOfferingsWith(purchases, new CoroutinesExtensionsCommonKt$awaitOfferings$2$2(iVar), new CoroutinesExtensionsCommonKt$awaitOfferings$2$1(iVar));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    public static final /* synthetic */ Object awaitPurchase(Purchases purchases, PurchaseParams purchaseParams, C6658d dVar) {
        i iVar = new i(C6680b.c(dVar));
        purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new CoroutinesExtensionsCommonKt$awaitPurchase$2$1(iVar), new CoroutinesExtensionsCommonKt$awaitPurchase$2$2(iVar)));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    public static final /* synthetic */ Object awaitRestore(Purchases purchases, C6658d dVar) {
        i iVar = new i(C6680b.c(dVar));
        ListenerConversionsCommonKt.restorePurchasesWith(purchases, new CoroutinesExtensionsCommonKt$awaitRestore$2$1(iVar), new CoroutinesExtensionsCommonKt$awaitRestore$2$2(iVar));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }
}
