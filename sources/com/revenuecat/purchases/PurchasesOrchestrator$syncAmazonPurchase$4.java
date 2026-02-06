package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import io.branch.rnbranch.RNBranchModule;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$syncAmazonPurchase$4 extends C6498u implements C6798l {
    final /* synthetic */ String $amazonUserID;
    final /* synthetic */ String $receiptID;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$syncAmazonPurchase$4(String str, String str2) {
        super(1);
        this.$receiptID = str;
        this.$amazonUserID = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        String format = String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, purchasesError}, 3));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(LogIntent.RC_ERROR, format);
    }
}
