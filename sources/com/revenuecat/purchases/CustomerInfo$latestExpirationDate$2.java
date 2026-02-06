package com.revenuecat.purchases;

import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import mf.C6565s;
import yf.C6787a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CustomerInfo$latestExpirationDate$2 extends C6498u implements C6787a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    public final Date invoke() {
        List U02 = C6565s.U0(this.this$0.getAllExpirationDatesByProduct().values(), new CustomerInfo$latestExpirationDate$2$invoke$$inlined$sortedBy$1());
        if (U02.isEmpty()) {
            U02 = null;
        }
        if (U02 != null) {
            return (Date) C6565s.z0(U02);
        }
        return null;
    }
}
