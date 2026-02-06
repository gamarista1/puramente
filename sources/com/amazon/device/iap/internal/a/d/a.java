package com.amazon.device.iap.internal.a.d;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.a.g.b;
import com.amazon.device.iap.internal.b.d;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.HashSet;

public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private final String f37848c;

    /* renamed from: d  reason: collision with root package name */
    private final FulfillmentResult f37849d;

    public a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        super(requestId);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        this.f37848c = str;
        this.f37849d = fulfillmentResult;
        a((h) new b(this, hashSet, fulfillmentResult.toString()));
    }

    public void b() {
    }

    public void c() {
        String c10;
        FulfillmentResult fulfillmentResult = FulfillmentResult.FULFILLED;
        FulfillmentResult fulfillmentResult2 = this.f37849d;
        if ((fulfillmentResult == fulfillmentResult2 || FulfillmentResult.UNAVAILABLE == fulfillmentResult2) && (c10 = d.a().c(this.f37848c)) != null) {
            new b(this, c10).l();
            d.a().a(this.f37848c);
        }
    }
}
