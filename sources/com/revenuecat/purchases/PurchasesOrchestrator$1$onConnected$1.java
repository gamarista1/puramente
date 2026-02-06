package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "countryCode", "Llf/M;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$1$onConnected$1 extends C6498u implements C6798l {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$1$onConnected$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(1);
        this.this$0 = purchasesOrchestrator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C6514M.f71813a;
    }

    public final void invoke(String str) {
        C6496s.h(str, "countryCode");
        this.this$0.storefrontCountryCode = str;
        String format = String.format(BillingStrings.BILLING_COUNTRY_CODE, Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(this, *args)");
        LogUtilsKt.debugLog(format);
    }
}
