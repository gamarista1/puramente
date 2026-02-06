package com.revenuecat.purchases.deeplinks;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.CustomerInfoUpdateHandler;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;", "", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Landroid/os/Handler;", "mainHandler", "<init>", "(Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Landroid/os/Handler;)V", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;", "resultListener", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "result", "Llf/M;", "dispatchResult", "(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lyf/a;)V", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "webPurchaseRedemption", "listener", "handleRedeemWebPurchase", "(Lcom/revenuecat/purchases/WebPurchaseRedemption;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;)V", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Landroid/os/Handler;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebPurchaseRedemptionHelper {
    private final Backend backend;
    /* access modifiers changed from: private */
    public final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final IdentityManager identityManager;
    private final Handler mainHandler;
    /* access modifiers changed from: private */
    public final OfflineEntitlementsManager offlineEntitlementsManager;

    public WebPurchaseRedemptionHelper(Backend backend2, IdentityManager identityManager2, OfflineEntitlementsManager offlineEntitlementsManager2, CustomerInfoUpdateHandler customerInfoUpdateHandler2, Handler handler) {
        C6496s.h(backend2, "backend");
        C6496s.h(identityManager2, "identityManager");
        C6496s.h(offlineEntitlementsManager2, "offlineEntitlementsManager");
        C6496s.h(customerInfoUpdateHandler2, "customerInfoUpdateHandler");
        this.backend = backend2;
        this.identityManager = identityManager2;
        this.offlineEntitlementsManager = offlineEntitlementsManager2;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler2;
        this.mainHandler = handler;
    }

    private final void dispatch(C6787a aVar) {
        if (!C6496s.c(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            Handler handler = this.mainHandler;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new a(aVar));
            return;
        }
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void dispatch$lambda$0(C6787a aVar) {
        C6496s.h(aVar, "$tmp0");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public final void dispatchResult(RedeemWebPurchaseListener redeemWebPurchaseListener, RedeemWebPurchaseListener.Result result) {
        dispatch(new WebPurchaseRedemptionHelper$dispatchResult$1(redeemWebPurchaseListener, result));
    }

    public final void handleRedeemWebPurchase(WebPurchaseRedemption webPurchaseRedemption, RedeemWebPurchaseListener redeemWebPurchaseListener) {
        C6496s.h(webPurchaseRedemption, "webPurchaseRedemption");
        C6496s.h(redeemWebPurchaseListener, "listener");
        LogUtilsKt.debugLog("Starting web purchase redemption.");
        this.backend.postRedeemWebPurchase(this.identityManager.getCurrentAppUserID(), webPurchaseRedemption.getRedemptionToken$purchases_defaultsRelease(), new WebPurchaseRedemptionHelper$handleRedeemWebPurchase$1(this, redeemWebPurchaseListener));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebPurchaseRedemptionHelper(Backend backend2, IdentityManager identityManager2, OfflineEntitlementsManager offlineEntitlementsManager2, CustomerInfoUpdateHandler customerInfoUpdateHandler2, Handler handler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(backend2, identityManager2, offlineEntitlementsManager2, customerInfoUpdateHandler2, (i10 & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
