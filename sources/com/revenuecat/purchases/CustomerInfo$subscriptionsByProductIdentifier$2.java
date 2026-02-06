package com.revenuecat.purchases;

import com.revenuecat.purchases.common.CustomerInfoFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import org.json.JSONObject;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/revenuecat/purchases/SubscriptionInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CustomerInfo$subscriptionsByProductIdentifier$2 extends C6498u implements C6787a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CustomerInfo$subscriptionsByProductIdentifier$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    public final Map<String, SubscriptionInfo> invoke() {
        CustomerInfoFactory customerInfoFactory = CustomerInfoFactory.INSTANCE;
        JSONObject access$getSubscriberJSONObject$p = this.this$0.subscriberJSONObject;
        C6496s.g(access$getSubscriberJSONObject$p, "subscriberJSONObject");
        return customerInfoFactory.parseSubscriptionInfos(access$getSubscriberJSONObject$p, this.this$0.getRequestDate());
    }
}
