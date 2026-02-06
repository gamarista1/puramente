package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import io.branch.rnbranch.RNBranchModule;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$2 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ OfflineCustomerInfoCalculator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$2(OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, C6798l lVar) {
        super(1);
        this.this$0 = offlineCustomerInfoCalculator;
        this.$onError = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        String format = String.format(CustomerInfoStrings.COMPUTING_OFFLINE_CUSTOMER_INFO_FAILED, Arrays.copyOf(new Object[]{purchasesError}, 1));
        C6496s.g(format, "format(this, *args)");
        LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
        DiagnosticsTracker access$getDiagnosticsTracker$p = this.this$0.diagnosticsTracker;
        if (access$getDiagnosticsTracker$p != null) {
            access$getDiagnosticsTracker$p.trackErrorEnteringOfflineEntitlementsMode(purchasesError);
        }
        this.$onError.invoke(purchasesError);
    }
}
