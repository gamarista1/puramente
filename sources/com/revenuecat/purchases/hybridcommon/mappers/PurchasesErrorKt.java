package com.revenuecat.purchases.hybridcommon.mappers;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.hybridcommon.ErrorContainer;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¨\u0006\u0007"}, d2 = {"map", "Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;", "Lcom/revenuecat/purchases/PurchasesError;", "extra", "", "", "", "hybridcommon_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PurchasesErrorKt {
    public static final ErrorContainer map(PurchasesError purchasesError, Map<String, ? extends Object> map) {
        C6496s.h(purchasesError, "<this>");
        C6496s.h(map, "extra");
        int code = purchasesError.getCode().getCode();
        String message = purchasesError.getMessage();
        Pair a10 = C6502A.a("code", Integer.valueOf(purchasesError.getCode().getCode()));
        Pair a11 = C6502A.a(MetricTracker.Object.MESSAGE, purchasesError.getMessage());
        Pair a12 = C6502A.a("readableErrorCode", purchasesError.getCode().name());
        Pair a13 = C6502A.a("readable_error_code", purchasesError.getCode().name());
        String underlyingErrorMessage = purchasesError.getUnderlyingErrorMessage();
        if (underlyingErrorMessage == null) {
            underlyingErrorMessage = "";
        }
        return new ErrorContainer(code, message, O.p(O.l(a10, a11, a12, a13, C6502A.a("underlyingErrorMessage", underlyingErrorMessage)), map));
    }

    public static /* synthetic */ ErrorContainer map$default(PurchasesError purchasesError, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = O.i();
        }
        return map(purchasesError, map);
    }
}
