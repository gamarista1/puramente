package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.Receipt;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import io.branch.rnbranch.RNBranchModule;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.L;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$getMissingSkusForReceipts$1$2 extends C6498u implements C6798l {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ p $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ L $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$getMissingSkusForReceipts$1$2(Map<String, PurchasesError> map, Receipt receipt, L l10, p pVar, Map<String, String> map2) {
        super(1);
        this.$errorMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = l10;
        this.$onCompletion = pVar;
        this.$successMap = map2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        String format = String.format(AmazonStrings.ERROR_FETCHING_RECEIPT_INFO, Arrays.copyOf(new Object[]{purchasesError}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        Map<String, PurchasesError> map = this.$errorMap;
        String receiptId = this.$receipt.getReceiptId();
        C6496s.g(receiptId, "receipt.receiptId");
        map.put(receiptId, purchasesError);
        L l10 = this.$receiptsLeft;
        int i10 = l10.f71757a - 1;
        l10.f71757a = i10;
        if (i10 == 0) {
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
