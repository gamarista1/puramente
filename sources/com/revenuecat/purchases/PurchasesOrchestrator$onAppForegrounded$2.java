package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.J;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$onAppForegrounded$2 extends C6498u implements C6787a {
    final /* synthetic */ J $firstTimeInForeground;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$onAppForegrounded$2(PurchasesOrchestrator purchasesOrchestrator, J j10) {
        super(0);
        this.this$0 = purchasesOrchestrator;
        this.$firstTimeInForeground = j10;
    }

    public final void invoke() {
        DiagnosticsSynchronizer access$getDiagnosticsSynchronizer$p;
        if (this.this$0.shouldRefreshCustomerInfo(this.$firstTimeInForeground.f71755a)) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
            CustomerInfoHelper.retrieveCustomerInfo$default(this.this$0.customerInfoHelper, this.this$0.identityManager.getCurrentAppUserID(), CacheFetchPolicy.FETCH_CURRENT, false, this.this$0.getAllowSharingPlayStoreAccount(), (ReceiveCustomerInfoCallback) null, 16, (Object) null);
        }
        this.this$0.offeringsManager.onAppForeground(this.this$0.identityManager.getCurrentAppUserID());
        PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(this.this$0.postPendingTransactionsHelper, this.this$0.getAllowSharingPlayStoreAccount(), (C6798l) null, (C6798l) null, 6, (Object) null);
        this.this$0.synchronizeSubscriberAttributesIfNeeded();
        OfflineEntitlementsManager.updateProductEntitlementMappingCacheIfStale$default(this.this$0.getOfflineEntitlementsManager(), (C6798l) null, 1, (Object) null);
        this.this$0.flushPaywallEvents();
        if (this.$firstTimeInForeground.f71755a && AndroidVersionUtilsKt.isAndroidNOrNewer() && (access$getDiagnosticsSynchronizer$p = this.this$0.diagnosticsSynchronizer) != null) {
            access$getDiagnosticsSynchronizer$p.syncDiagnosticsFileIfNeeded();
        }
    }
}
