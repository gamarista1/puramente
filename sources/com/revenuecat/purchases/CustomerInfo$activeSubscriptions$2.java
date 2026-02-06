package com.revenuecat.purchases;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CustomerInfo$activeSubscriptions$2 extends C6498u implements C6787a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CustomerInfo$activeSubscriptions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    public final Set<String> invoke() {
        CustomerInfo customerInfo = this.this$0;
        return customerInfo.activeIdentifiers(customerInfo.getAllExpirationDatesByProduct());
    }
}
