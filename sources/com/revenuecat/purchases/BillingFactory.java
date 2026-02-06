package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.google.BillingWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/BillingFactory;", "", "()V", "createBilling", "Lcom/revenuecat/purchases/common/BillingAbstract;", "store", "Lcom/revenuecat/purchases/Store;", "application", "Landroid/app/Application;", "backendHelper", "Lcom/revenuecat/purchases/common/BackendHelper;", "cache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "finishTransactions", "", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "stateProvider", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "pendingTransactionsForPrepaidPlansEnabled", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BillingFactory {
    public static final BillingFactory INSTANCE = new BillingFactory();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.revenuecat.purchases.Store[] r0 = com.revenuecat.purchases.Store.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.Store r1 = com.revenuecat.purchases.Store.PLAY_STORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.Store r1 = com.revenuecat.purchases.Store.AMAZON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.BillingFactory.WhenMappings.<clinit>():void");
        }
    }

    private BillingFactory() {
    }

    public final BillingAbstract createBilling(Store store, Application application, BackendHelper backendHelper, DeviceCache deviceCache, boolean z10, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, boolean z11) {
        Store store2 = store;
        Application application2 = application;
        C6496s.h(store, ProductResponseJsonKeys.STORE);
        C6496s.h(application, "application");
        BackendHelper backendHelper2 = backendHelper;
        C6496s.h(backendHelper, "backendHelper");
        C6496s.h(deviceCache, "cache");
        C6496s.h(purchasesStateProvider, "stateProvider");
        int i10 = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i10 == 1) {
            return new BillingWrapper(new BillingWrapper.ClientFactory(application, z11), new Handler(application.getMainLooper()), deviceCache, diagnosticsTracker, purchasesStateProvider, (DateProvider) null, 32, (DefaultConstructorMarker) null);
        }
        if (i10 == 2) {
            try {
                Context applicationContext = application.getApplicationContext();
                C6496s.g(applicationContext, "application.applicationContext");
                return new AmazonBilling(applicationContext, deviceCache, z10, new Handler(application.getMainLooper()), backendHelper, purchasesStateProvider, diagnosticsTracker);
            } catch (NoClassDefFoundError e10) {
                LogUtilsKt.errorLog("Make sure purchases-amazon is added as dependency", e10);
                throw e10;
            }
        } else {
            LogUtilsKt.errorLog$default("Incompatible store (" + store + ") used", (Throwable) null, 2, (Object) null);
            throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
        }
    }
}
