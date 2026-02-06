package com.revenuecat.purchases;

import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.Transaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import mf.C6565s;
import org.json.JSONArray;
import org.json.JSONObject;
import yf.C6787a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/revenuecat/purchases/models/Transaction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CustomerInfo$nonSubscriptionTransactions$2 extends C6498u implements C6787a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CustomerInfo$nonSubscriptionTransactions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    public final List<Transaction> invoke() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.this$0.subscriberJSONObject.getJSONObject(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS);
        Iterator<String> keys = jSONObject.keys();
        C6496s.g(keys, "nonSubscriptions.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                C6496s.g(next, "productId");
                C6496s.g(jSONObject2, "transactionJSONObject");
                arrayList.add(new Transaction(next, jSONObject2));
            }
        }
        return C6565s.U0(arrayList, new CustomerInfo$nonSubscriptionTransactions$2$invoke$$inlined$sortedBy$1());
    }
}
