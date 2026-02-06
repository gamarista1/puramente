package com.revenuecat.purchases;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R.\u0010)\u001a\u0004\u0018\u00010\u00102\b\u0010(\u001a\u0004\u0018\u00010\u00108F@FX\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0014R\u0018\u0010.\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Landroid/os/Handler;)V", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "listener", "Llf/M;", "afterSetListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "", "appUserID", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "Lkotlin/Function0;", "action", "dispatch", "(Lyf/a;)V", "customerInfo", "cacheAndNotifyListeners", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "notifyListeners", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Landroid/os/Handler;", "value", "updatedCustomerInfoListener", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "lastSentCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerInfoUpdateHandler {
    private final AppConfig appConfig;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTracker;
    private final Handler handler;
    private final IdentityManager identityManager;
    private CustomerInfo lastSentCustomerInfo;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private UpdatedCustomerInfoListener updatedCustomerInfoListener;

    public CustomerInfoUpdateHandler(DeviceCache deviceCache2, IdentityManager identityManager2, OfflineEntitlementsManager offlineEntitlementsManager2, AppConfig appConfig2, DiagnosticsTracker diagnosticsTracker2, Handler handler2) {
        C6496s.h(deviceCache2, "deviceCache");
        C6496s.h(identityManager2, "identityManager");
        C6496s.h(offlineEntitlementsManager2, "offlineEntitlementsManager");
        C6496s.h(appConfig2, "appConfig");
        C6496s.h(handler2, "handler");
        this.deviceCache = deviceCache2;
        this.identityManager = identityManager2;
        this.offlineEntitlementsManager = offlineEntitlementsManager2;
        this.appConfig = appConfig2;
        this.diagnosticsTracker = diagnosticsTracker2;
        this.handler = handler2;
    }

    private final void afterSetListener(UpdatedCustomerInfoListener updatedCustomerInfoListener2) {
        CustomerInfo cachedCustomerInfo;
        if (updatedCustomerInfoListener2 != null) {
            LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.LISTENER_SET);
            if (!this.appConfig.getCustomEntitlementComputation() && (cachedCustomerInfo = getCachedCustomerInfo(this.identityManager.getCurrentAppUserID())) != null) {
                notifyListeners(cachedCustomerInfo);
            }
        }
    }

    private final void dispatch(C6787a aVar) {
        if (!C6496s.c(Thread.currentThread(), this.handler.getLooper().getThread())) {
            this.handler.post(new b(aVar));
        } else {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void dispatch$lambda$5(C6787a aVar) {
        C6496s.h(aVar, "$tmp0");
        aVar.invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String str) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.getOfflineCustomerInfo();
        if (offlineCustomerInfo == null) {
            return this.deviceCache.getCachedCustomerInfo(str);
        }
        return offlineCustomerInfo;
    }

    public final void cacheAndNotifyListeners(CustomerInfo customerInfo) {
        C6496s.h(customerInfo, "customerInfo");
        this.deviceCache.cacheCustomerInfo(this.identityManager.getCurrentAppUserID(), customerInfo);
        notifyListeners(customerInfo);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.updatedCustomerInfoListener;
    }

    public final void notifyListeners(CustomerInfo customerInfo) {
        Pair a10;
        DiagnosticsTracker diagnosticsTracker2;
        C6496s.h(customerInfo, "customerInfo");
        synchronized (this) {
            a10 = C6502A.a(this.updatedCustomerInfoListener, this.lastSentCustomerInfo);
        }
        UpdatedCustomerInfoListener updatedCustomerInfoListener2 = (UpdatedCustomerInfoListener) a10.a();
        CustomerInfo customerInfo2 = (CustomerInfo) a10.b();
        if (!C6496s.c(customerInfo2, customerInfo) && (diagnosticsTracker2 = this.diagnosticsTracker) != null) {
            diagnosticsTracker2.trackCustomerInfoVerificationResultIfNeeded(customerInfo);
        }
        if (updatedCustomerInfoListener2 != null && !C6496s.c(customerInfo2, customerInfo)) {
            if (customerInfo2 != null) {
                LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.CUSTOMERINFO_UPDATED_NOTIFYING_LISTENER);
            } else {
                LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.SENDING_LATEST_CUSTOMERINFO_TO_LISTENER);
            }
            synchronized (this) {
                this.lastSentCustomerInfo = customerInfo;
                C6514M m10 = C6514M.f71813a;
            }
            dispatch(new CustomerInfoUpdateHandler$notifyListeners$2$2(updatedCustomerInfoListener2, customerInfo));
        }
    }

    public final void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener2) {
        synchronized (this) {
            this.updatedCustomerInfoListener = updatedCustomerInfoListener2;
            C6514M m10 = C6514M.f71813a;
        }
        afterSetListener(updatedCustomerInfoListener2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerInfoUpdateHandler(DeviceCache deviceCache2, IdentityManager identityManager2, OfflineEntitlementsManager offlineEntitlementsManager2, AppConfig appConfig2, DiagnosticsTracker diagnosticsTracker2, Handler handler2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceCache2, identityManager2, offlineEntitlementsManager2, appConfig2, diagnosticsTracker2, (i10 & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler2);
    }
}
