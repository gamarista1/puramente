package com.revenuecat.purchases.hybridcommon.mappers;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "hybridcommon_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StoreTransactionMapperKt {
    public static final Map<String, Object> map(StoreTransaction storeTransaction) {
        C6496s.h(storeTransaction, "<this>");
        return O.l(C6502A.a("transactionIdentifier", storeTransaction.getOrderId()), C6502A.a("productIdentifier", C6565s.o0(storeTransaction.getProductIds())), C6502A.a("purchaseDateMillis", Long.valueOf(storeTransaction.getPurchaseTime())), C6502A.a(b.f37459Q, MappersHelpersKt.toIso8601(new Date(storeTransaction.getPurchaseTime()))));
    }
}
