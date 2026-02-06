package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6502A;
import lf.C6514M;
import mf.O;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "userCancelled", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class CommonKt$getPurchaseErrorFunction$1 extends C6498u implements p {
    final /* synthetic */ OnResult $onResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonKt$getPurchaseErrorFunction$1(OnResult onResult) {
        super(2);
        this.$onResult = onResult;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z10) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        this.$onResult.onError(PurchasesErrorKt.map(purchasesError, O.f(C6502A.a("userCancelled", Boolean.valueOf(z10)))));
    }
}
