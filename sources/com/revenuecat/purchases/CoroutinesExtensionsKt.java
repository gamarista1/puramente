package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import qf.C6658d;
import qf.i;
import rf.C6680b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u0003*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0003*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\f\u001a\u0017\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\f\u001a\u0017\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitCustomerInfo", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;Lqf/d;)Ljava/lang/Object;", "", "appUserID", "Lcom/revenuecat/purchases/data/LogInResult;", "awaitLogIn", "(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "awaitLogOut", "(Lcom/revenuecat/purchases/Purchases;Lqf/d;)Ljava/lang/Object;", "awaitSyncPurchases", "Lcom/revenuecat/purchases/Offerings;", "awaitSyncAttributesAndOfferingsIfNeeded", "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "getAmazonLWAConsentStatus", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "awaitCustomerCenterConfigData", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutinesExtensionsKt {
    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static final /* synthetic */ Object awaitCustomerCenterConfigData(Purchases purchases, C6658d dVar) {
        i iVar = new i(C6680b.c(dVar));
        purchases.getCustomerCenterConfigData$purchases_defaultsRelease(new CoroutinesExtensionsKt$awaitCustomerCenterConfigData$2$1(iVar));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    public static final /* synthetic */ Object awaitCustomerInfo(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, C6658d dVar) {
        i iVar = new i(C6680b.c(dVar));
        ListenerConversionsKt.getCustomerInfoWith(purchases, cacheFetchPolicy, new CoroutinesExtensionsKt$awaitCustomerInfo$2$2(iVar), new CoroutinesExtensionsKt$awaitCustomerInfo$2$1(iVar));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    public static /* synthetic */ Object awaitCustomerInfo$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, C6658d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cacheFetchPolicy = CacheFetchPolicy.Companion.m26default();
        }
        return awaitCustomerInfo(purchases, cacheFetchPolicy, dVar);
    }

    public static final /* synthetic */ Object awaitLogIn(Purchases purchases, String str, C6658d dVar) {
        i iVar = new i(C6680b.c(dVar));
        ListenerConversionsKt.logInWith(purchases, str, new CoroutinesExtensionsKt$awaitLogIn$2$1(iVar), new CoroutinesExtensionsKt$awaitLogIn$2$2(iVar));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    public static final /* synthetic */ Object awaitLogOut(Purchases purchases, C6658d dVar) {
        i iVar = new i(C6680b.c(dVar));
        ListenerConversionsKt.logOutWith(purchases, new CoroutinesExtensionsKt$awaitLogOut$2$1(iVar), new CoroutinesExtensionsKt$awaitLogOut$2$2(iVar));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    public static final /* synthetic */ Object awaitSyncAttributesAndOfferingsIfNeeded(Purchases purchases, C6658d dVar) {
        i iVar = new i(C6680b.c(dVar));
        ListenerConversionsKt.syncAttributesAndOfferingsIfNeededWith(purchases, new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$2(iVar), new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$1(iVar));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    public static final /* synthetic */ Object awaitSyncPurchases(Purchases purchases, C6658d dVar) {
        i iVar = new i(C6680b.c(dVar));
        ListenerConversionsKt.syncPurchasesWith(purchases, new CoroutinesExtensionsKt$awaitSyncPurchases$2$2(iVar), new CoroutinesExtensionsKt$awaitSyncPurchases$2$1(iVar));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    public static final /* synthetic */ Object getAmazonLWAConsentStatus(Purchases purchases, C6658d dVar) {
        i iVar = new i(C6680b.c(dVar));
        ListenerConversionsKt.getAmazonLWAConsentStatusWith(purchases, new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$2(iVar), new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$1(iVar));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }
}
