package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.C3198e;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/android/billingclient/api/e;", "errorBillingResult", "Llf/M;", "invoke", "(Lcom/android/billingclient/api/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AcknowledgePurchaseUseCase$executeAsync$1$1$1 extends C6498u implements C6798l {
    final /* synthetic */ AcknowledgePurchaseUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AcknowledgePurchaseUseCase$executeAsync$1$1$1(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase) {
        super(1);
        this.this$0 = acknowledgePurchaseUseCase;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C3198e) obj);
        return C6514M.f71813a;
    }

    public final void invoke(C3198e eVar) {
        String str;
        C6496s.h(eVar, "errorBillingResult");
        if (eVar.b() == 8 && this.this$0.useCaseParams.getInitiationSource() == PostReceiptInitiationSource.RESTORE) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            str = PurchaseStrings.ACKNOWLEDGING_PURCHASE_ERROR_RESTORE;
            LogWrapperKt.log(logIntent, str);
        } else {
            str = this.this$0.getErrorMessage() + " - " + BillingResultExtensionsKt.toHumanReadableDescription(eVar);
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, str);
        }
        this.this$0.getOnError().invoke(ErrorsKt.billingResponseToPurchasesError(eVar.b(), str));
    }
}
