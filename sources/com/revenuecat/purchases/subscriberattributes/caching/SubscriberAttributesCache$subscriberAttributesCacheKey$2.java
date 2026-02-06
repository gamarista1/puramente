package com.revenuecat.purchases.subscriberattributes.caching;

import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SubscriberAttributesCache$subscriberAttributesCacheKey$2 extends C6498u implements C6787a {
    final /* synthetic */ SubscriberAttributesCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubscriberAttributesCache$subscriberAttributesCacheKey$2(SubscriberAttributesCache subscriberAttributesCache) {
        super(0);
        this.this$0 = subscriberAttributesCache;
    }

    public final String invoke() {
        return this.this$0.getDeviceCache$purchases_defaultsRelease().newKey("subscriberAttributes");
    }
}
